package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.DefaultLivePlaybackSpeedControl;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AuxEffectInfo;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.exoplayer2.video.spherical.CameraMotionListener;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import java.util.List;
/* loaded from: classes.dex */
public interface ExoPlayer extends Player {
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    @Deprecated
    /* loaded from: classes.dex */
    public interface AudioComponent {
        @Deprecated
        void clearAuxEffectInfo();

        @Deprecated
        AudioAttributes getAudioAttributes();

        @Deprecated
        int getAudioSessionId();

        @Deprecated
        boolean getSkipSilenceEnabled();

        @Deprecated
        float getVolume();

        @Deprecated
        void setAudioAttributes(AudioAttributes audioAttributes, boolean z);

        @Deprecated
        void setAudioSessionId(int i);

        @Deprecated
        void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

        @Deprecated
        void setSkipSilenceEnabled(boolean z);

        @Deprecated
        void setVolume(float f);
    }

    /* loaded from: classes.dex */
    public interface AudioOffloadListener {
        default void onExperimentalOffloadSchedulingEnabledChanged(boolean z) {
        }

        default void onExperimentalSleepingForOffloadChanged(boolean z) {
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        public Function<Clock, AnalyticsCollector> analyticsCollectorFunction;
        public AudioAttributes audioAttributes;
        public Supplier<BandwidthMeter> bandwidthMeterSupplier;
        public boolean buildCalled;
        public Clock clock;
        public final Context context;
        public long detachSurfaceTimeoutMs;
        public long foregroundModeTimeoutMs;
        public boolean handleAudioBecomingNoisy;
        public boolean handleAudioFocus;
        public LivePlaybackSpeedControl livePlaybackSpeedControl;
        public Supplier<LoadControl> loadControlSupplier;
        public Looper looper;
        public Supplier<MediaSource.Factory> mediaSourceFactorySupplier;
        public boolean pauseAtEndOfMediaItems;
        @o00oOooO.o0OO00OO
        public PriorityTaskManager priorityTaskManager;
        public long releaseTimeoutMs;
        public Supplier<RenderersFactory> renderersFactorySupplier;
        public long seekBackIncrementMs;
        public long seekForwardIncrementMs;
        public SeekParameters seekParameters;
        public boolean skipSilenceEnabled;
        public Supplier<TrackSelector> trackSelectorSupplier;
        public boolean useLazyPreparation;
        public boolean usePlatformDiagnostics;
        public int videoChangeFrameRateStrategy;
        public int videoScalingMode;
        public int wakeMode;

        public Builder(final Context context) {
            this(context, new Supplier() { // from class: com.google.android.exoplayer2.o0O00OOO
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    RenderersFactory lambda$new$0;
                    lambda$new$0 = ExoPlayer.Builder.lambda$new$0(context);
                    return lambda$new$0;
                }
            }, new Supplier() { // from class: com.google.android.exoplayer2.o00oo0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    MediaSource.Factory lambda$new$1;
                    lambda$new$1 = ExoPlayer.Builder.lambda$new$1(context);
                    return lambda$new$1;
                }
            });
        }

        public Builder(final Context context, final RenderersFactory renderersFactory) {
            this(context, new Supplier() { // from class: com.google.android.exoplayer2.o00ooO0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    RenderersFactory lambda$new$2;
                    lambda$new$2 = ExoPlayer.Builder.lambda$new$2(RenderersFactory.this);
                    return lambda$new$2;
                }
            }, new Supplier() { // from class: com.google.android.exoplayer2.o00ooO
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    MediaSource.Factory lambda$new$3;
                    lambda$new$3 = ExoPlayer.Builder.lambda$new$3(context);
                    return lambda$new$3;
                }
            });
        }

        public Builder(Context context, final RenderersFactory renderersFactory, final MediaSource.Factory factory) {
            this(context, new Supplier() { // from class: com.google.android.exoplayer2.o0O0o
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    RenderersFactory lambda$new$6;
                    lambda$new$6 = ExoPlayer.Builder.lambda$new$6(RenderersFactory.this);
                    return lambda$new$6;
                }
            }, new Supplier() { // from class: com.google.android.exoplayer2.o00oo
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    MediaSource.Factory lambda$new$7;
                    lambda$new$7 = ExoPlayer.Builder.lambda$new$7(MediaSource.Factory.this);
                    return lambda$new$7;
                }
            });
        }

        public Builder(Context context, final RenderersFactory renderersFactory, final MediaSource.Factory factory, final TrackSelector trackSelector, final LoadControl loadControl, final BandwidthMeter bandwidthMeter, final AnalyticsCollector analyticsCollector) {
            this(context, new Supplier() { // from class: com.google.android.exoplayer2.o0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    RenderersFactory lambda$new$8;
                    lambda$new$8 = ExoPlayer.Builder.lambda$new$8(RenderersFactory.this);
                    return lambda$new$8;
                }
            }, new Supplier() { // from class: com.google.android.exoplayer2.o0O00000
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    MediaSource.Factory lambda$new$9;
                    lambda$new$9 = ExoPlayer.Builder.lambda$new$9(MediaSource.Factory.this);
                    return lambda$new$9;
                }
            }, new Supplier() { // from class: com.google.android.exoplayer2.o0O000
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    TrackSelector lambda$new$10;
                    lambda$new$10 = ExoPlayer.Builder.lambda$new$10(TrackSelector.this);
                    return lambda$new$10;
                }
            }, new Supplier() { // from class: com.google.android.exoplayer2.o0O000O
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    LoadControl lambda$new$11;
                    lambda$new$11 = ExoPlayer.Builder.lambda$new$11(LoadControl.this);
                    return lambda$new$11;
                }
            }, new Supplier() { // from class: com.google.android.exoplayer2.o0OoOoOo
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    BandwidthMeter lambda$new$12;
                    lambda$new$12 = ExoPlayer.Builder.lambda$new$12(BandwidthMeter.this);
                    return lambda$new$12;
                }
            }, new Function() { // from class: com.google.android.exoplayer2.o0O000Oo
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    AnalyticsCollector lambda$new$13;
                    lambda$new$13 = ExoPlayer.Builder.lambda$new$13(AnalyticsCollector.this, (Clock) obj);
                    return lambda$new$13;
                }
            });
        }

        public Builder(final Context context, final MediaSource.Factory factory) {
            this(context, new Supplier() { // from class: com.google.android.exoplayer2.o00oo0O0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    RenderersFactory lambda$new$4;
                    lambda$new$4 = ExoPlayer.Builder.lambda$new$4(context);
                    return lambda$new$4;
                }
            }, new Supplier() { // from class: com.google.android.exoplayer2.o00oo0O
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    MediaSource.Factory lambda$new$5;
                    lambda$new$5 = ExoPlayer.Builder.lambda$new$5(MediaSource.Factory.this);
                    return lambda$new$5;
                }
            });
        }

        private Builder(final Context context, Supplier<RenderersFactory> supplier, Supplier<MediaSource.Factory> supplier2) {
            this(context, supplier, supplier2, new Supplier() { // from class: com.google.android.exoplayer2.o0OoO00O
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    TrackSelector lambda$new$14;
                    lambda$new$14 = ExoPlayer.Builder.lambda$new$14(context);
                    return lambda$new$14;
                }
            }, new Supplier() { // from class: com.google.android.exoplayer2.o0O00O0o
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return new DefaultLoadControl();
                }
            }, new Supplier() { // from class: com.google.android.exoplayer2.o0O00O
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    BandwidthMeter singletonInstance;
                    singletonInstance = DefaultBandwidthMeter.getSingletonInstance(context);
                    return singletonInstance;
                }
            }, new Function() { // from class: com.google.android.exoplayer2.o0O00OO
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return new DefaultAnalyticsCollector((Clock) obj);
                }
            });
        }

        private Builder(Context context, Supplier<RenderersFactory> supplier, Supplier<MediaSource.Factory> supplier2, Supplier<TrackSelector> supplier3, Supplier<LoadControl> supplier4, Supplier<BandwidthMeter> supplier5, Function<Clock, AnalyticsCollector> function) {
            this.context = context;
            this.renderersFactorySupplier = supplier;
            this.mediaSourceFactorySupplier = supplier2;
            this.trackSelectorSupplier = supplier3;
            this.loadControlSupplier = supplier4;
            this.bandwidthMeterSupplier = supplier5;
            this.analyticsCollectorFunction = function;
            this.looper = Util.getCurrentOrMainLooper();
            this.audioAttributes = AudioAttributes.DEFAULT;
            this.wakeMode = 0;
            this.videoScalingMode = 1;
            this.videoChangeFrameRateStrategy = 0;
            this.useLazyPreparation = true;
            this.seekParameters = SeekParameters.DEFAULT;
            this.seekBackIncrementMs = 5000L;
            this.seekForwardIncrementMs = 15000L;
            this.livePlaybackSpeedControl = new DefaultLivePlaybackSpeedControl.Builder().build();
            this.clock = Clock.DEFAULT;
            this.releaseTimeoutMs = 500L;
            this.detachSurfaceTimeoutMs = 2000L;
            this.usePlatformDiagnostics = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$0(Context context) {
            return new DefaultRenderersFactory(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$1(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackSelector lambda$new$10(TrackSelector trackSelector) {
            return trackSelector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ LoadControl lambda$new$11(LoadControl loadControl) {
            return loadControl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ BandwidthMeter lambda$new$12(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ AnalyticsCollector lambda$new$13(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackSelector lambda$new$14(Context context) {
            return new DefaultTrackSelector(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$2(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$3(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$4(Context context) {
            return new DefaultRenderersFactory(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$5(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$6(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$7(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$8(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$9(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ AnalyticsCollector lambda$setAnalyticsCollector$21(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ BandwidthMeter lambda$setBandwidthMeter$20(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ LoadControl lambda$setLoadControl$19(LoadControl loadControl) {
            return loadControl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$setMediaSourceFactory$17(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$setRenderersFactory$16(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackSelector lambda$setTrackSelector$18(TrackSelector trackSelector) {
            return trackSelector;
        }

        public ExoPlayer build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new ExoPlayerImpl(this, null);
        }

        public SimpleExoPlayer buildSimpleExoPlayer() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new SimpleExoPlayer(this);
        }

        public Builder experimentalSetForegroundModeTimeoutMs(long j) {
            Assertions.checkState(!this.buildCalled);
            this.foregroundModeTimeoutMs = j;
            return this;
        }

        public Builder setAnalyticsCollector(final AnalyticsCollector analyticsCollector) {
            Assertions.checkState(!this.buildCalled);
            this.analyticsCollectorFunction = new Function() { // from class: com.google.android.exoplayer2.o0O0000O
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    AnalyticsCollector lambda$setAnalyticsCollector$21;
                    lambda$setAnalyticsCollector$21 = ExoPlayer.Builder.lambda$setAnalyticsCollector$21(AnalyticsCollector.this, (Clock) obj);
                    return lambda$setAnalyticsCollector$21;
                }
            };
            return this;
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes, boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.audioAttributes = audioAttributes;
            this.handleAudioFocus = z;
            return this;
        }

        public Builder setBandwidthMeter(final BandwidthMeter bandwidthMeter) {
            Assertions.checkState(!this.buildCalled);
            this.bandwidthMeterSupplier = new Supplier() { // from class: com.google.android.exoplayer2.o0O000o0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    BandwidthMeter lambda$setBandwidthMeter$20;
                    lambda$setBandwidthMeter$20 = ExoPlayer.Builder.lambda$setBandwidthMeter$20(BandwidthMeter.this);
                    return lambda$setBandwidthMeter$20;
                }
            };
            return this;
        }

        @o00oOooO.o0o0000
        public Builder setClock(Clock clock) {
            Assertions.checkState(!this.buildCalled);
            this.clock = clock;
            return this;
        }

        public Builder setDetachSurfaceTimeoutMs(long j) {
            Assertions.checkState(!this.buildCalled);
            this.detachSurfaceTimeoutMs = j;
            return this;
        }

        public Builder setHandleAudioBecomingNoisy(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.handleAudioBecomingNoisy = z;
            return this;
        }

        public Builder setLivePlaybackSpeedControl(LivePlaybackSpeedControl livePlaybackSpeedControl) {
            Assertions.checkState(!this.buildCalled);
            this.livePlaybackSpeedControl = livePlaybackSpeedControl;
            return this;
        }

        public Builder setLoadControl(final LoadControl loadControl) {
            Assertions.checkState(!this.buildCalled);
            this.loadControlSupplier = new Supplier() { // from class: com.google.android.exoplayer2.o0O00O0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    LoadControl lambda$setLoadControl$19;
                    lambda$setLoadControl$19 = ExoPlayer.Builder.lambda$setLoadControl$19(LoadControl.this);
                    return lambda$setLoadControl$19;
                }
            };
            return this;
        }

        public Builder setLooper(Looper looper) {
            Assertions.checkState(!this.buildCalled);
            this.looper = looper;
            return this;
        }

        public Builder setMediaSourceFactory(final MediaSource.Factory factory) {
            Assertions.checkState(!this.buildCalled);
            this.mediaSourceFactorySupplier = new Supplier() { // from class: com.google.android.exoplayer2.o0O00
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    MediaSource.Factory lambda$setMediaSourceFactory$17;
                    lambda$setMediaSourceFactory$17 = ExoPlayer.Builder.lambda$setMediaSourceFactory$17(MediaSource.Factory.this);
                    return lambda$setMediaSourceFactory$17;
                }
            };
            return this;
        }

        public Builder setPauseAtEndOfMediaItems(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.pauseAtEndOfMediaItems = z;
            return this;
        }

        public Builder setPriorityTaskManager(@o00oOooO.o0OO00OO PriorityTaskManager priorityTaskManager) {
            Assertions.checkState(!this.buildCalled);
            this.priorityTaskManager = priorityTaskManager;
            return this;
        }

        public Builder setReleaseTimeoutMs(long j) {
            Assertions.checkState(!this.buildCalled);
            this.releaseTimeoutMs = j;
            return this;
        }

        public Builder setRenderersFactory(final RenderersFactory renderersFactory) {
            Assertions.checkState(!this.buildCalled);
            this.renderersFactorySupplier = new Supplier() { // from class: com.google.android.exoplayer2.o00oo0OO
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    RenderersFactory lambda$setRenderersFactory$16;
                    lambda$setRenderersFactory$16 = ExoPlayer.Builder.lambda$setRenderersFactory$16(RenderersFactory.this);
                    return lambda$setRenderersFactory$16;
                }
            };
            return this;
        }

        public Builder setSeekBackIncrementMs(@o00oOooO.o0O0o00O(from = 1) long j) {
            Assertions.checkArgument(j > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekBackIncrementMs = j;
            return this;
        }

        public Builder setSeekForwardIncrementMs(@o00oOooO.o0O0o00O(from = 1) long j) {
            Assertions.checkArgument(j > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekForwardIncrementMs = j;
            return this;
        }

        public Builder setSeekParameters(SeekParameters seekParameters) {
            Assertions.checkState(!this.buildCalled);
            this.seekParameters = seekParameters;
            return this;
        }

        public Builder setSkipSilenceEnabled(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.skipSilenceEnabled = z;
            return this;
        }

        public Builder setTrackSelector(final TrackSelector trackSelector) {
            Assertions.checkState(!this.buildCalled);
            this.trackSelectorSupplier = new Supplier() { // from class: com.google.android.exoplayer2.o00oo00O
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    TrackSelector lambda$setTrackSelector$18;
                    lambda$setTrackSelector$18 = ExoPlayer.Builder.lambda$setTrackSelector$18(TrackSelector.this);
                    return lambda$setTrackSelector$18;
                }
            };
            return this;
        }

        public Builder setUseLazyPreparation(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.useLazyPreparation = z;
            return this;
        }

        public Builder setUsePlatformDiagnostics(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.usePlatformDiagnostics = z;
            return this;
        }

        public Builder setVideoChangeFrameRateStrategy(int i) {
            Assertions.checkState(!this.buildCalled);
            this.videoChangeFrameRateStrategy = i;
            return this;
        }

        public Builder setVideoScalingMode(int i) {
            Assertions.checkState(!this.buildCalled);
            this.videoScalingMode = i;
            return this;
        }

        public Builder setWakeMode(int i) {
            Assertions.checkState(!this.buildCalled);
            this.wakeMode = i;
            return this;
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface DeviceComponent {
        @Deprecated
        void decreaseDeviceVolume();

        @Deprecated
        DeviceInfo getDeviceInfo();

        @Deprecated
        int getDeviceVolume();

        @Deprecated
        void increaseDeviceVolume();

        @Deprecated
        boolean isDeviceMuted();

        @Deprecated
        void setDeviceMuted(boolean z);

        @Deprecated
        void setDeviceVolume(int i);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface TextComponent {
        @Deprecated
        CueGroup getCurrentCues();
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface VideoComponent {
        @Deprecated
        void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

        @Deprecated
        void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

        @Deprecated
        void clearVideoSurface();

        @Deprecated
        void clearVideoSurface(@o00oOooO.o0OO00OO Surface surface);

        @Deprecated
        void clearVideoSurfaceHolder(@o00oOooO.o0OO00OO SurfaceHolder surfaceHolder);

        @Deprecated
        void clearVideoSurfaceView(@o00oOooO.o0OO00OO SurfaceView surfaceView);

        @Deprecated
        void clearVideoTextureView(@o00oOooO.o0OO00OO TextureView textureView);

        @Deprecated
        int getVideoChangeFrameRateStrategy();

        @Deprecated
        int getVideoScalingMode();

        @Deprecated
        VideoSize getVideoSize();

        @Deprecated
        void setCameraMotionListener(CameraMotionListener cameraMotionListener);

        @Deprecated
        void setVideoChangeFrameRateStrategy(int i);

        @Deprecated
        void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

        @Deprecated
        void setVideoScalingMode(int i);

        @Deprecated
        void setVideoSurface(@o00oOooO.o0OO00OO Surface surface);

        @Deprecated
        void setVideoSurfaceHolder(@o00oOooO.o0OO00OO SurfaceHolder surfaceHolder);

        @Deprecated
        void setVideoSurfaceView(@o00oOooO.o0OO00OO SurfaceView surfaceView);

        @Deprecated
        void setVideoTextureView(@o00oOooO.o0OO00OO TextureView textureView);
    }

    void addAnalyticsListener(AnalyticsListener analyticsListener);

    void addAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    void addMediaSource(int i, MediaSource mediaSource);

    void addMediaSource(MediaSource mediaSource);

    void addMediaSources(int i, List<MediaSource> list);

    void addMediaSources(List<MediaSource> list);

    void clearAuxEffectInfo();

    void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

    void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    PlayerMessage createMessage(PlayerMessage.Target target);

    boolean experimentalIsSleepingForOffload();

    void experimentalSetOffloadSchedulingEnabled(boolean z);

    AnalyticsCollector getAnalyticsCollector();

    @o00oOooO.o0OO00OO
    @Deprecated
    AudioComponent getAudioComponent();

    @o00oOooO.o0OO00OO
    DecoderCounters getAudioDecoderCounters();

    @o00oOooO.o0OO00OO
    Format getAudioFormat();

    int getAudioSessionId();

    Clock getClock();

    @Deprecated
    TrackGroupArray getCurrentTrackGroups();

    @Deprecated
    TrackSelectionArray getCurrentTrackSelections();

    @o00oOooO.o0OO00OO
    @Deprecated
    DeviceComponent getDeviceComponent();

    boolean getPauseAtEndOfMediaItems();

    Looper getPlaybackLooper();

    @Override // com.google.android.exoplayer2.Player
    @o00oOooO.o0OO00OO
    ExoPlaybackException getPlayerError();

    Renderer getRenderer(int i);

    int getRendererCount();

    int getRendererType(int i);

    SeekParameters getSeekParameters();

    boolean getSkipSilenceEnabled();

    @o00oOooO.o0OO00OO
    @Deprecated
    TextComponent getTextComponent();

    @o00oOooO.o0OO00OO
    TrackSelector getTrackSelector();

    int getVideoChangeFrameRateStrategy();

    @o00oOooO.o0OO00OO
    @Deprecated
    VideoComponent getVideoComponent();

    @o00oOooO.o0OO00OO
    DecoderCounters getVideoDecoderCounters();

    @o00oOooO.o0OO00OO
    Format getVideoFormat();

    int getVideoScalingMode();

    @Deprecated
    void prepare(MediaSource mediaSource);

    @Deprecated
    void prepare(MediaSource mediaSource, boolean z, boolean z2);

    void removeAnalyticsListener(AnalyticsListener analyticsListener);

    void removeAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    @Deprecated
    void retry();

    void setAudioAttributes(AudioAttributes audioAttributes, boolean z);

    void setAudioSessionId(int i);

    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    void setCameraMotionListener(CameraMotionListener cameraMotionListener);

    void setForegroundMode(boolean z);

    void setHandleAudioBecomingNoisy(boolean z);

    @Deprecated
    void setHandleWakeLock(boolean z);

    void setMediaSource(MediaSource mediaSource);

    void setMediaSource(MediaSource mediaSource, long j);

    void setMediaSource(MediaSource mediaSource, boolean z);

    void setMediaSources(List<MediaSource> list);

    void setMediaSources(List<MediaSource> list, int i, long j);

    void setMediaSources(List<MediaSource> list, boolean z);

    void setPauseAtEndOfMediaItems(boolean z);

    void setPriorityTaskManager(@o00oOooO.o0OO00OO PriorityTaskManager priorityTaskManager);

    void setSeekParameters(@o00oOooO.o0OO00OO SeekParameters seekParameters);

    void setShuffleOrder(ShuffleOrder shuffleOrder);

    void setSkipSilenceEnabled(boolean z);

    void setVideoChangeFrameRateStrategy(int i);

    void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    void setVideoScalingMode(int i);

    void setWakeMode(int i);
}
