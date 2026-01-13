package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
/* JADX INFO: Access modifiers changed from: package-private */
@o0OOooO0(23)
/* loaded from: classes.dex */
public final class AsynchronousMediaCodecCallback extends MediaCodec.Callback {
    private final HandlerThread callbackThread;
    @o0O0OOOo("lock")
    @o0OO00OO
    private MediaFormat currentFormat;
    private Handler handler;
    @o0O0OOOo("lock")
    @o0OO00OO
    private IllegalStateException internalException;
    @o0O0OOOo("lock")
    @o0OO00OO
    private MediaCodec.CodecException mediaCodecException;
    @o0O0OOOo("lock")
    private long pendingFlushCount;
    @o0O0OOOo("lock")
    @o0OO00OO
    private MediaFormat pendingOutputFormat;
    @o0O0OOOo("lock")
    private boolean shutDown;
    private final Object lock = new Object();
    @o0O0OOOo("lock")
    private final IntArrayQueue availableInputBuffers = new IntArrayQueue();
    @o0O0OOOo("lock")
    private final IntArrayQueue availableOutputBuffers = new IntArrayQueue();
    @o0O0OOOo("lock")
    private final ArrayDeque<MediaCodec.BufferInfo> bufferInfos = new ArrayDeque<>();
    @o0O0OOOo("lock")
    private final ArrayDeque<MediaFormat> formats = new ArrayDeque<>();

    public AsynchronousMediaCodecCallback(HandlerThread handlerThread) {
        this.callbackThread = handlerThread;
    }

    @o0O0OOOo("lock")
    private void addOutputFormat(MediaFormat mediaFormat) {
        this.availableOutputBuffers.add(-2);
        this.formats.add(mediaFormat);
    }

    @o0O0OOOo("lock")
    private void flushInternal() {
        if (!this.formats.isEmpty()) {
            this.pendingOutputFormat = this.formats.getLast();
        }
        this.availableInputBuffers.clear();
        this.availableOutputBuffers.clear();
        this.bufferInfos.clear();
        this.formats.clear();
        this.mediaCodecException = null;
    }

    @o0O0OOOo("lock")
    private boolean isFlushingOrShutdown() {
        return this.pendingFlushCount > 0 || this.shutDown;
    }

    @o0O0OOOo("lock")
    private void maybeThrowException() {
        maybeThrowInternalException();
        maybeThrowMediaCodecException();
    }

    @o0O0OOOo("lock")
    private void maybeThrowInternalException() {
        IllegalStateException illegalStateException = this.internalException;
        if (illegalStateException == null) {
            return;
        }
        this.internalException = null;
        throw illegalStateException;
    }

    @o0O0OOOo("lock")
    private void maybeThrowMediaCodecException() {
        MediaCodec.CodecException codecException = this.mediaCodecException;
        if (codecException == null) {
            return;
        }
        this.mediaCodecException = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFlushCompleted() {
        synchronized (this.lock) {
            if (this.shutDown) {
                return;
            }
            long j = this.pendingFlushCount - 1;
            this.pendingFlushCount = j;
            if (j > 0) {
                return;
            }
            if (j < 0) {
                setInternalException(new IllegalStateException());
            } else {
                flushInternal();
            }
        }
    }

    private void setInternalException(IllegalStateException illegalStateException) {
        synchronized (this.lock) {
            this.internalException = illegalStateException;
        }
    }

    public int dequeueInputBufferIndex() {
        synchronized (this.lock) {
            int i = -1;
            if (isFlushingOrShutdown()) {
                return -1;
            }
            maybeThrowException();
            if (!this.availableInputBuffers.isEmpty()) {
                i = this.availableInputBuffers.remove();
            }
            return i;
        }
    }

    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.lock) {
            if (isFlushingOrShutdown()) {
                return -1;
            }
            maybeThrowException();
            if (this.availableOutputBuffers.isEmpty()) {
                return -1;
            }
            int remove = this.availableOutputBuffers.remove();
            if (remove >= 0) {
                Assertions.checkStateNotNull(this.currentFormat);
                MediaCodec.BufferInfo remove2 = this.bufferInfos.remove();
                bufferInfo.set(remove2.offset, remove2.size, remove2.presentationTimeUs, remove2.flags);
            } else if (remove == -2) {
                this.currentFormat = this.formats.remove();
            }
            return remove;
        }
    }

    public void flush() {
        synchronized (this.lock) {
            this.pendingFlushCount++;
            ((Handler) Util.castNonNull(this.handler)).post(new Runnable() { // from class: com.google.android.exoplayer2.mediacodec.o00oOo0O
                @Override // java.lang.Runnable
                public final void run() {
                    AsynchronousMediaCodecCallback.this.onFlushCompleted();
                }
            });
        }
    }

    public MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        synchronized (this.lock) {
            mediaFormat = this.currentFormat;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void initialize(MediaCodec mediaCodec) {
        Assertions.checkState(this.handler == null);
        this.callbackThread.start();
        Handler handler = new Handler(this.callbackThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.handler = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.lock) {
            this.mediaCodecException = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.lock) {
            this.availableInputBuffers.add(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.lock) {
            MediaFormat mediaFormat = this.pendingOutputFormat;
            if (mediaFormat != null) {
                addOutputFormat(mediaFormat);
                this.pendingOutputFormat = null;
            }
            this.availableOutputBuffers.add(i);
            this.bufferInfos.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.lock) {
            addOutputFormat(mediaFormat);
            this.pendingOutputFormat = null;
        }
    }

    public void shutdown() {
        synchronized (this.lock) {
            this.shutDown = true;
            this.callbackThread.quit();
            flushInternal();
        }
    }
}
