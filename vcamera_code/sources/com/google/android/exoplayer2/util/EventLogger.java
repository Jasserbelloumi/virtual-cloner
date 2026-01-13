package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import o00oOoOo.o00oo;
import o00oOooO.o0OO00OO;
import o0Oo0OoO.o0OOO00;
/* loaded from: classes.dex */
public class EventLogger implements AnalyticsListener {
    private static final String DEFAULT_TAG = "EventLogger";
    private static final int MAX_TIMELINE_ITEM_LINES = 3;
    private static final NumberFormat TIME_FORMAT;
    private final Timeline.Period period;
    private final long startTimeMs;
    private final String tag;
    private final Timeline.Window window;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        TIME_FORMAT = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public EventLogger() {
        this(DEFAULT_TAG);
    }

    @Deprecated
    public EventLogger(@o0OO00OO MappingTrackSelector mappingTrackSelector) {
        this(DEFAULT_TAG);
    }

    @Deprecated
    public EventLogger(@o0OO00OO MappingTrackSelector mappingTrackSelector, String str) {
        this(str);
    }

    public EventLogger(String str) {
        this.tag = str;
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.startTimeMs = android.os.SystemClock.elapsedRealtime();
    }

    private static String getDiscontinuityReasonString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "?" : "INTERNAL" : o0OOO00.f16242o00ooooO : "SKIP" : "SEEK_ADJUSTMENT" : "SEEK" : "AUTO_TRANSITION";
    }

    private String getEventString(AnalyticsListener.EventTime eventTime, String str, @o0OO00OO String str2, @o0OO00OO Throwable th) {
        StringBuilder o00oOOo02 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(str, " [");
        o00oOOo02.append(getEventTimeString(eventTime));
        String sb = o00oOOo02.toString();
        if (th instanceof PlaybackException) {
            StringBuilder o00oOOo03 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(sb, ", errorCode=");
            o00oOOo03.append(((PlaybackException) th).getErrorCodeName());
            sb = o00oOOo03.toString();
        }
        if (str2 != null) {
            sb = android.support.v4.media.o00oOoO.o00oOOo0(sb, ", ", str2);
        }
        String throwableString = Log.getThrowableString(th);
        if (!TextUtils.isEmpty(throwableString)) {
            StringBuilder o00oOOo04 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(sb, "\n  ");
            o00oOOo04.append(throwableString.replace("\n", "\n  "));
            o00oOOo04.append('\n');
            sb = o00oOOo04.toString();
        }
        return o00oo.o00oOOo0(sb, "]");
    }

    private String getEventTimeString(AnalyticsListener.EventTime eventTime) {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("window=");
        o00oOOo02.append(eventTime.windowIndex);
        String sb = o00oOOo02.toString();
        if (eventTime.mediaPeriodId != null) {
            StringBuilder o00oOOo03 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(sb, ", period=");
            o00oOOo03.append(eventTime.timeline.getIndexOfPeriod(eventTime.mediaPeriodId.periodUid));
            sb = o00oOOo03.toString();
            if (eventTime.mediaPeriodId.isAd()) {
                StringBuilder o00oOOo04 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(sb, ", adGroup=");
                o00oOOo04.append(eventTime.mediaPeriodId.adGroupIndex);
                StringBuilder o00oOOo05 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(o00oOOo04.toString(), ", ad=");
                o00oOOo05.append(eventTime.mediaPeriodId.adIndexInAdGroup);
                sb = o00oOOo05.toString();
            }
        }
        StringBuilder o00oOOo06 = android.support.v4.media.o00oOo0O.o00oOOo0("eventTime=");
        o00oOOo06.append(getTimeString(eventTime.realtimeMs - this.startTimeMs));
        o00oOOo06.append(", mediaPos=");
        o00oOOo06.append(getTimeString(eventTime.eventPlaybackPositionMs));
        o00oOOo06.append(", ");
        o00oOOo06.append(sb);
        return o00oOOo06.toString();
    }

    private static String getMediaItemTransitionReasonString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT";
    }

    private static String getPlayWhenReadyChangeReasonString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST";
    }

    private static String getPlaybackSuppressionReasonString(int i) {
        return i != 0 ? i != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE";
    }

    private static String getRepeatModeString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "?" : "ALL" : "ONE" : "OFF";
    }

    private static String getStateString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE";
    }

    private static String getTimeString(long j) {
        return j == C.TIME_UNSET ? "?" : TIME_FORMAT.format(((float) j) / 1000.0f);
    }

    private static String getTimelineChangeReasonString(int i) {
        return i != 0 ? i != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED";
    }

    private static String getTrackStatusString(boolean z) {
        return z ? "[X]" : "[ ]";
    }

    private void logd(AnalyticsListener.EventTime eventTime, String str) {
        logd(getEventString(eventTime, str, null, null));
    }

    private void logd(AnalyticsListener.EventTime eventTime, String str, String str2) {
        logd(getEventString(eventTime, str, str2, null));
    }

    private void loge(AnalyticsListener.EventTime eventTime, String str, String str2, @o0OO00OO Throwable th) {
        loge(getEventString(eventTime, str, str2, th));
    }

    private void loge(AnalyticsListener.EventTime eventTime, String str, @o0OO00OO Throwable th) {
        loge(getEventString(eventTime, str, null, th));
    }

    private void printInternalError(AnalyticsListener.EventTime eventTime, String str, Exception exc) {
        loge(eventTime, "internalError", str, exc);
    }

    private void printMetadata(Metadata metadata, String str) {
        for (int i = 0; i < metadata.length(); i++) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(str);
            o00oOOo02.append(metadata.get(i));
            logd(o00oOOo02.toString());
        }
    }

    public void logd(String str) {
        Log.d(this.tag, str);
    }

    public void loge(String str) {
        Log.e(this.tag, str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
        logd(eventTime, "audioAttributes", audioAttributes.contentType + "," + audioAttributes.flags + "," + audioAttributes.usage + "," + audioAttributes.allowedCapturePolicy);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
        logd(eventTime, "audioDecoderInitialized", str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        logd(eventTime, "audioDecoderReleased", str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "audioDisabled");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "audioEnabled");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, @o0OO00OO DecoderReuseEvaluation decoderReuseEvaluation) {
        logd(eventTime, "audioInputFormat", Format.toLogString(format));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioSessionIdChanged(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "audioSessionId", Integer.toString(i));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        loge(eventTime, "audioTrackUnderrun", i + ", " + j + ", " + j2, null);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        logd(eventTime, "downstreamFormat", Format.toLogString(mediaLoadData.trackFormat));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysLoaded");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRemoved");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRestored");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "drmSessionAcquired", android.support.v4.media.o00oOOo0.o00oOOo0("state=", i));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
        printInternalError(eventTime, "drmSessionManagerError", exc);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmSessionReleased");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i, long j) {
        logd(eventTime, "droppedFrames", Integer.toString(i));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onIsLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "loading", Boolean.toString(z));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "isPlaying", Boolean.toString(z));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadCanceled(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadCompleted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        printInternalError(eventTime, "loadError", iOException);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onMediaItemTransition(AnalyticsListener.EventTime eventTime, @o0OO00OO MediaItem mediaItem, int i) {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("mediaItem [");
        o00oOOo02.append(getEventTimeString(eventTime));
        o00oOOo02.append(", reason=");
        o00oOOo02.append(getMediaItemTransitionReasonString(i));
        o00oOOo02.append("]");
        logd(o00oOOo02.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("metadata [");
        o00oOOo02.append(getEventTimeString(eventTime));
        logd(o00oOOo02.toString());
        printMetadata(metadata, "  ");
        logd("]");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlayWhenReadyChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
        logd(eventTime, "playWhenReady", z + ", " + getPlayWhenReadyChangeReasonString(i));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        logd(eventTime, "playbackParameters", playbackParameters.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlaybackStateChanged(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "state", getStateString(i));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "playbackSuppressionReason", getPlaybackSuppressionReasonString(i));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        loge(eventTime, "playerFailed", playbackException);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("reason=");
        o00oOOo02.append(getDiscontinuityReasonString(i));
        o00oOOo02.append(", PositionInfo:old [");
        o00oOOo02.append("mediaItem=");
        o00oOOo02.append(positionInfo.mediaItemIndex);
        o00oOOo02.append(", period=");
        o00oOOo02.append(positionInfo.periodIndex);
        o00oOOo02.append(", pos=");
        o00oOOo02.append(positionInfo.positionMs);
        if (positionInfo.adGroupIndex != -1) {
            o00oOOo02.append(", contentPos=");
            o00oOOo02.append(positionInfo.contentPositionMs);
            o00oOOo02.append(", adGroup=");
            o00oOOo02.append(positionInfo.adGroupIndex);
            o00oOOo02.append(", ad=");
            o00oOOo02.append(positionInfo.adIndexInAdGroup);
        }
        o00oOOo02.append("], PositionInfo:new [");
        o00oOOo02.append("mediaItem=");
        o00oOOo02.append(positionInfo2.mediaItemIndex);
        o00oOOo02.append(", period=");
        o00oOOo02.append(positionInfo2.periodIndex);
        o00oOOo02.append(", pos=");
        o00oOOo02.append(positionInfo2.positionMs);
        if (positionInfo2.adGroupIndex != -1) {
            o00oOOo02.append(", contentPos=");
            o00oOOo02.append(positionInfo2.contentPositionMs);
            o00oOOo02.append(", adGroup=");
            o00oOOo02.append(positionInfo2.adGroupIndex);
            o00oOOo02.append(", ad=");
            o00oOOo02.append(positionInfo2.adIndexInAdGroup);
        }
        o00oOOo02.append("]");
        logd(eventTime, "positionDiscontinuity", o00oOOo02.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Object obj, long j) {
        logd(eventTime, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "repeatMode", getRepeatModeString(i));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "shuffleModeEnabled", Boolean.toString(z));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onSkipSilenceEnabledChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "skipSilenceEnabled", Boolean.toString(z));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2) {
        logd(eventTime, "surfaceSize", i + ", " + i2);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i) {
        int periodCount = eventTime.timeline.getPeriodCount();
        int windowCount = eventTime.timeline.getWindowCount();
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("timeline [");
        o00oOOo02.append(getEventTimeString(eventTime));
        o00oOOo02.append(", periodCount=");
        o00oOOo02.append(periodCount);
        o00oOOo02.append(", windowCount=");
        o00oOOo02.append(windowCount);
        o00oOOo02.append(", reason=");
        o00oOOo02.append(getTimelineChangeReasonString(i));
        logd(o00oOOo02.toString());
        for (int i2 = 0; i2 < Math.min(periodCount, 3); i2++) {
            eventTime.timeline.getPeriod(i2, this.period);
            logd("  period [" + getTimeString(this.period.getDurationMs()) + "]");
        }
        if (periodCount > 3) {
            logd("  ...");
        }
        for (int i3 = 0; i3 < Math.min(windowCount, 3); i3++) {
            eventTime.timeline.getWindow(i3, this.window);
            logd("  window [" + getTimeString(this.window.getDurationMs()) + ", seekable=" + this.window.isSeekable + ", dynamic=" + this.window.isDynamic + "]");
        }
        if (windowCount > 3) {
            logd("  ...");
        }
        logd("]");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onTracksChanged(AnalyticsListener.EventTime eventTime, Tracks tracks) {
        Metadata metadata;
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("tracks [");
        o00oOOo02.append(getEventTimeString(eventTime));
        logd(o00oOOo02.toString());
        ImmutableList<Tracks.Group> groups = tracks.getGroups();
        for (int i = 0; i < groups.size(); i++) {
            Tracks.Group group = groups.get(i);
            logd("  group [");
            for (int i2 = 0; i2 < group.length; i2++) {
                logd("    " + getTrackStatusString(group.isTrackSelected(i2)) + " Track:" + i2 + ", " + Format.toLogString(group.getTrackFormat(i2)) + ", supported=" + Util.getFormatSupportString(group.getTrackSupport(i2)));
            }
            logd("  ]");
        }
        boolean z = false;
        for (int i3 = 0; !z && i3 < groups.size(); i3++) {
            Tracks.Group group2 = groups.get(i3);
            for (int i4 = 0; !z && i4 < group2.length; i4++) {
                if (group2.isTrackSelected(i4) && (metadata = group2.getTrackFormat(i4).metadata) != null && metadata.length() > 0) {
                    logd("  Metadata [");
                    printMetadata(metadata, "    ");
                    logd("  ]");
                    z = true;
                }
            }
        }
        logd("]");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        logd(eventTime, "upstreamDiscarded", Format.toLogString(mediaLoadData.trackFormat));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
        logd(eventTime, "videoDecoderInitialized", str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        logd(eventTime, "videoDecoderReleased", str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "videoDisabled");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "videoEnabled");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, @o0OO00OO DecoderReuseEvaluation decoderReuseEvaluation) {
        logd(eventTime, "videoInputFormat", Format.toLogString(format));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        logd(eventTime, "videoSize", videoSize.width + ", " + videoSize.height);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f) {
        logd(eventTime, "volume", Float.toString(f));
    }
}
