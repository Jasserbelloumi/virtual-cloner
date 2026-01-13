package org.videolan.libvlc;

import android.os.Handler;
import android.os.Looper;
import o00oOooO.o0OO00OO;
import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.ILibVLC;
import org.videolan.libvlc.interfaces.IVLCObject;
/* loaded from: classes3.dex */
abstract class VLCObject<T extends AbstractVLCEvent> implements IVLCObject<T> {
    private AbstractVLCEvent.Listener<T> mEventListener;
    private Handler mHandler;
    public final ILibVLC mILibVLC;
    private long mInstance;
    private int mNativeRefCount;

    public VLCObject() {
        this.mEventListener = null;
        this.mHandler = null;
        this.mNativeRefCount = 1;
        this.mInstance = 0L;
        this.mILibVLC = null;
    }

    public VLCObject(ILibVLC iLibVLC) {
        this.mEventListener = null;
        this.mHandler = null;
        this.mNativeRefCount = 1;
        this.mInstance = 0L;
        this.mILibVLC = iLibVLC;
    }

    public VLCObject(IVLCObject iVLCObject) {
        this.mEventListener = null;
        this.mHandler = null;
        this.mNativeRefCount = 1;
        this.mInstance = 0L;
        this.mILibVLC = iVLCObject.getLibVLC();
    }

    private synchronized void dispatchEventFromNative(int i, long j, long j2, float f, @o0OO00OO String str) {
        AbstractVLCEvent.Listener<T> listener;
        Handler handler;
        if (isReleased()) {
            return;
        }
        T onEventNative = onEventNative(i, j, j2, f, str);
        if (onEventNative != null && (listener = this.mEventListener) != null && (handler = this.mHandler) != null) {
            handler.post(new Runnable(listener, onEventNative) { // from class: org.videolan.libvlc.VLCObject.1EventRunnable
                private final T event;
                private final AbstractVLCEvent.Listener<T> listener;

                {
                    this.listener = listener;
                    this.event = onEventNative;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.listener.onEvent(this.event);
                    this.event.release();
                }
            });
        }
    }

    private native void nativeDetachEvents();

    public synchronized void finalize() {
        if (!isReleased()) {
            throw new AssertionError("VLCObject (" + getClass().getName() + ") finalized but not natively released (" + this.mNativeRefCount + " refs)");
        }
    }

    public native long getInstance();

    @Override // org.videolan.libvlc.interfaces.IVLCObject
    public ILibVLC getLibVLC() {
        return this.mILibVLC;
    }

    @Override // org.videolan.libvlc.interfaces.IVLCObject
    public synchronized boolean isReleased() {
        return this.mNativeRefCount == 0;
    }

    public abstract T onEventNative(int i, long j, long j2, float f, String str);

    public abstract void onReleaseNative();

    @Override // org.videolan.libvlc.interfaces.IVLCObject
    public void release() {
        int i;
        synchronized (this) {
            int i2 = this.mNativeRefCount;
            if (i2 == 0) {
                return;
            }
            if (i2 > 0) {
                i = i2 - 1;
                this.mNativeRefCount = i;
            } else {
                i = -1;
            }
            if (i == 0) {
                setEventListener(null);
            }
            if (i == 0) {
                nativeDetachEvents();
                synchronized (this) {
                    onReleaseNative();
                }
            }
        }
    }

    @Override // org.videolan.libvlc.interfaces.IVLCObject
    public final synchronized boolean retain() {
        int i = this.mNativeRefCount;
        if (i > 0) {
            this.mNativeRefCount = i + 1;
            return true;
        }
        return false;
    }

    public synchronized void setEventListener(AbstractVLCEvent.Listener<T> listener) {
        setEventListener(listener, null);
    }

    public synchronized void setEventListener(AbstractVLCEvent.Listener<T> listener, Handler handler) {
        Handler handler2 = this.mHandler;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
        this.mEventListener = listener;
        if (listener == null) {
            this.mHandler = null;
        } else if (this.mHandler == null) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            this.mHandler = handler;
        }
    }
}
