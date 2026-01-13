package com.google.android.exoplayer2.util;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.widget.TextView;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import java.util.Locale;
import o0O000.o00oo0OO;
/* loaded from: classes.dex */
public class DebugTextViewHelper {
    private static final int REFRESH_INTERVAL_MS = 1000;
    private final ExoPlayer player;
    private boolean started;
    private final TextView textView;
    private final Updater updater;

    /* loaded from: classes.dex */
    public final class Updater implements Player.Listener, Runnable {
        private Updater() {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayWhenReadyChanged(boolean z, int i) {
            DebugTextViewHelper.this.updateAndPost();
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackStateChanged(int i) {
            DebugTextViewHelper.this.updateAndPost();
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
            DebugTextViewHelper.this.updateAndPost();
        }

        @Override // java.lang.Runnable
        public void run() {
            DebugTextViewHelper.this.updateAndPost();
        }
    }

    public DebugTextViewHelper(ExoPlayer exoPlayer, TextView textView) {
        Assertions.checkArgument(exoPlayer.getApplicationLooper() == Looper.getMainLooper());
        this.player = exoPlayer;
        this.textView = textView;
        this.updater = new Updater();
    }

    private static String getDecoderCountersBufferCountString(DecoderCounters decoderCounters) {
        if (decoderCounters == null) {
            return "";
        }
        decoderCounters.ensureUpdated();
        return " sib:" + decoderCounters.skippedInputBufferCount + " sb:" + decoderCounters.skippedOutputBufferCount + " rb:" + decoderCounters.renderedOutputBufferCount + " db:" + decoderCounters.droppedBufferCount + " mcdb:" + decoderCounters.maxConsecutiveDroppedBufferCount + " dk:" + decoderCounters.droppedToKeyframeCount;
    }

    private static String getPixelAspectRatioString(float f) {
        if (f == -1.0f || f == 1.0f) {
            return "";
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(" par:");
        o00oOOo02.append(String.format(Locale.US, "%.02f", Float.valueOf(f)));
        return o00oOOo02.toString();
    }

    private static String getVideoFrameProcessingOffsetAverageString(long j, int i) {
        return i == 0 ? "N/A" : String.valueOf((long) (j / i));
    }

    public String getAudioString() {
        Format audioFormat = this.player.getAudioFormat();
        DecoderCounters audioDecoderCounters = this.player.getAudioDecoderCounters();
        if (audioFormat == null || audioDecoderCounters == null) {
            return "";
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("\n");
        o00oOOo02.append(audioFormat.sampleMimeType);
        o00oOOo02.append("(id:");
        o00oOOo02.append(audioFormat.id);
        o00oOOo02.append(" hz:");
        o00oOOo02.append(audioFormat.sampleRate);
        o00oOOo02.append(" ch:");
        o00oOOo02.append(audioFormat.channelCount);
        return android.support.v4.media.o00oOOoO.o00oOOo0(o00oOOo02, getDecoderCountersBufferCountString(audioDecoderCounters), ")");
    }

    public String getDebugString() {
        return getPlayerStateString() + getVideoString() + getAudioString();
    }

    public String getPlayerStateString() {
        int playbackState = this.player.getPlaybackState();
        return String.format("playWhenReady:%s playbackState:%s item:%s", Boolean.valueOf(this.player.getPlayWhenReady()), playbackState != 1 ? playbackState != 2 ? playbackState != 3 ? playbackState != 4 ? o00oo0OO.f10107o00oOOoO : "ended" : "ready" : "buffering" : "idle", Integer.valueOf(this.player.getCurrentMediaItemIndex()));
    }

    public String getVideoString() {
        Format videoFormat = this.player.getVideoFormat();
        DecoderCounters videoDecoderCounters = this.player.getVideoDecoderCounters();
        if (videoFormat == null || videoDecoderCounters == null) {
            return "";
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("\n");
        o00oOOo02.append(videoFormat.sampleMimeType);
        o00oOOo02.append("(id:");
        o00oOOo02.append(videoFormat.id);
        o00oOOo02.append(" r:");
        o00oOOo02.append(videoFormat.width);
        o00oOOo02.append("x");
        o00oOOo02.append(videoFormat.height);
        o00oOOo02.append(getPixelAspectRatioString(videoFormat.pixelWidthHeightRatio));
        o00oOOo02.append(getDecoderCountersBufferCountString(videoDecoderCounters));
        o00oOOo02.append(" vfpo: ");
        return android.support.v4.media.o00oOOoO.o00oOOo0(o00oOOo02, getVideoFrameProcessingOffsetAverageString(videoDecoderCounters.totalVideoFrameProcessingOffsetUs, videoDecoderCounters.videoFrameProcessingOffsetCount), ")");
    }

    public final void start() {
        if (this.started) {
            return;
        }
        this.started = true;
        this.player.addListener(this.updater);
        updateAndPost();
    }

    public final void stop() {
        if (this.started) {
            this.started = false;
            this.player.removeListener(this.updater);
            this.textView.removeCallbacks(this.updater);
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void updateAndPost() {
        this.textView.setText(getDebugString());
        this.textView.removeCallbacks(this.updater);
        this.textView.postDelayed(this.updater, 1000L);
    }
}
