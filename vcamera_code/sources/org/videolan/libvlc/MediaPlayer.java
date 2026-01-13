package org.videolan.libvlc;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetFileDescriptor;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.io.File;
import java.io.IOException;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import org.videolan.libvlc.AWindow;
import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.ILibVLC;
import org.videolan.libvlc.interfaces.IMedia;
import org.videolan.libvlc.interfaces.IVLCVout;
import org.videolan.libvlc.util.AndroidUtil;
import org.videolan.libvlc.util.DisplayManager;
import org.videolan.libvlc.util.VLCUtil;
import org.videolan.libvlc.util.VLCVideoLayout;
/* loaded from: classes3.dex */
public class MediaPlayer extends VLCObject<Event> {
    public static final int SURFACE_SCALES_COUNT = ScaleType.values().length;
    private AssetFileDescriptor mAfd;
    private final AudioDeviceCallback mAudioDeviceCallback;
    private boolean mAudioDigitalOutputEnabled;
    private String mAudioOutput;
    private String mAudioOutputDevice;
    private String mAudioPlugOutputDevice;
    private final BroadcastReceiver mAudioPlugReceiver;
    private boolean mAudioPlugRegistered;
    private boolean mCanDoPassthrough;
    public Handler mHandlerMainThread;
    private boolean mListenAudioPlug;
    private IMedia mMedia;
    private boolean mPlayRequested;
    private boolean mPlaying;
    private RendererItem mRenderer;
    private Boolean mUseOrientationFromBounds;
    private VideoHelper mVideoHelper;
    private int mVoutCount;
    private final AWindow mWindow;

    /* loaded from: classes3.dex */
    public static class Chapter {
        public final long duration;
        public final String name;
        public final long timeOffset;

        private Chapter(long j, long j2, String str) {
            this.timeOffset = j;
            this.duration = j2;
            this.name = str;
        }
    }

    /* loaded from: classes3.dex */
    public static class Equalizer {
        private long mInstance;

        private Equalizer() {
            nativeNew();
        }

        private Equalizer(int i) {
            nativeNewFromPreset(i);
        }

        public static Equalizer create() {
            return new Equalizer();
        }

        public static Equalizer createFromPreset(int i) {
            return new Equalizer(i);
        }

        public static int getBandCount() {
            return nativeGetBandCount();
        }

        public static float getBandFrequency(int i) {
            return nativeGetBandFrequency(i);
        }

        public static int getPresetCount() {
            return nativeGetPresetCount();
        }

        public static String getPresetName(int i) {
            return nativeGetPresetName(i);
        }

        private native float nativeGetAmp(int i);

        private static native int nativeGetBandCount();

        private static native float nativeGetBandFrequency(int i);

        private native float nativeGetPreAmp();

        private static native int nativeGetPresetCount();

        private static native String nativeGetPresetName(int i);

        private native void nativeNew();

        private native void nativeNewFromPreset(int i);

        private native void nativeRelease();

        private native boolean nativeSetAmp(int i, float f);

        private native boolean nativeSetPreAmp(float f);

        public void finalize() throws Throwable {
            try {
                nativeRelease();
            } finally {
                super.finalize();
            }
        }

        public float getAmp(int i) {
            return nativeGetAmp(i);
        }

        public float getPreAmp() {
            return nativeGetPreAmp();
        }

        public boolean setAmp(int i, float f) {
            return nativeSetAmp(i, f);
        }

        public boolean setPreAmp(float f) {
            return nativeSetPreAmp(f);
        }
    }

    /* loaded from: classes3.dex */
    public static class Event extends AbstractVLCEvent {
        public static final int Buffering = 259;
        public static final int ESAdded = 276;
        public static final int ESDeleted = 277;
        public static final int ESSelected = 278;
        public static final int EncounteredError = 266;
        public static final int EndReached = 265;
        public static final int LengthChanged = 273;
        public static final int MediaChanged = 256;
        public static final int Opening = 258;
        public static final int PausableChanged = 270;
        public static final int Paused = 261;
        public static final int Playing = 260;
        public static final int PositionChanged = 268;
        public static final int RecordChanged = 286;
        public static final int SeekableChanged = 269;
        public static final int Stopped = 262;
        public static final int TimeChanged = 267;
        public static final int Vout = 274;

        public Event(int i) {
            super(i);
        }

        public Event(int i, float f) {
            super(i, f);
        }

        public Event(int i, long j) {
            super(i, j);
        }

        public Event(int i, long j, long j2) {
            super(i, j, j2);
        }

        public Event(int i, long j, @o0OO00OO String str) {
            super(i, j, str);
        }

        public float getBuffering() {
            return this.argf1;
        }

        public int getEsChangedID() {
            return (int) this.arg2;
        }

        public int getEsChangedType() {
            return (int) this.arg1;
        }

        public long getLengthChanged() {
            return this.arg1;
        }

        public boolean getPausable() {
            return this.arg1 != 0;
        }

        public float getPositionChanged() {
            return this.argf1;
        }

        @o0OO00OO
        public String getRecordPath() {
            return this.args1;
        }

        public boolean getRecording() {
            return this.arg1 != 0;
        }

        public boolean getSeekable() {
            return this.arg1 != 0;
        }

        public long getTimeChanged() {
            return this.arg1;
        }

        public int getVoutCount() {
            return (int) this.arg1;
        }
    }

    /* loaded from: classes3.dex */
    public interface EventListener extends AbstractVLCEvent.Listener<Event> {
    }

    /* loaded from: classes3.dex */
    public static class Navigate {
        public static final int Activate = 0;
        public static final int Down = 2;
        public static final int Left = 3;
        public static final int Right = 4;
        public static final int Up = 1;
    }

    /* loaded from: classes3.dex */
    public static class Position {
        public static final int Bottom = 6;
        public static final int BottomLeft = 7;
        public static final int BottomRight = 8;
        public static final int Center = 0;
        public static final int Disable = -1;
        public static final int Left = 1;
        public static final int Right = 2;
        public static final int Top = 3;
        public static final int TopLeft = 4;
        public static final int TopRight = 5;
    }

    /* loaded from: classes3.dex */
    public enum ScaleType {
        SURFACE_BEST_FIT(null),
        SURFACE_FIT_SCREEN(null),
        SURFACE_FILL(null),
        SURFACE_16_9(Float.valueOf(1.7777778f)),
        SURFACE_4_3(Float.valueOf(1.3333334f)),
        SURFACE_16_10(Float.valueOf(1.6f)),
        SURFACE_221_1(Float.valueOf(2.21f)),
        SURFACE_235_1(Float.valueOf(2.35f)),
        SURFACE_239_1(Float.valueOf(2.39f)),
        SURFACE_5_4(Float.valueOf(1.25f)),
        SURFACE_ORIGINAL(null);
        
        private final Float ratio;

        ScaleType(Float f) {
            this.ratio = f;
        }

        public static ScaleType[] getMainScaleTypes() {
            return new ScaleType[]{SURFACE_BEST_FIT, SURFACE_FIT_SCREEN, SURFACE_FILL, SURFACE_16_9, SURFACE_4_3, SURFACE_ORIGINAL};
        }

        public Float getRatio() {
            return this.ratio;
        }
    }

    /* loaded from: classes3.dex */
    public static class Title {
        public final long duration;
        private final int flags;
        public final String name;

        /* loaded from: classes3.dex */
        public static class Flags {
            public static final int INTERACTIVE = 2;
            public static final int MENU = 1;

            private Flags() {
            }
        }

        public Title(long j, String str, int i) {
            this.duration = j;
            this.name = str;
            this.flags = i;
        }

        public boolean isInteractive() {
            return (this.flags & 2) != 0;
        }

        public boolean isMenu() {
            return (this.flags & 1) != 0;
        }
    }

    public MediaPlayer(ILibVLC iLibVLC) {
        super(iLibVLC);
        this.mUseOrientationFromBounds = Boolean.FALSE;
        this.mMedia = null;
        this.mRenderer = null;
        this.mAfd = null;
        this.mPlaying = false;
        this.mPlayRequested = false;
        this.mListenAudioPlug = true;
        this.mVoutCount = 0;
        this.mAudioOutput = null;
        this.mAudioOutputDevice = null;
        this.mAudioPlugRegistered = false;
        this.mAudioDigitalOutputEnabled = false;
        this.mAudioPlugOutputDevice = "stereo";
        this.mVideoHelper = null;
        AWindow aWindow = new AWindow(new AWindow.SurfaceCallback() { // from class: org.videolan.libvlc.MediaPlayer.1
            @Override // org.videolan.libvlc.AWindow.SurfaceCallback
            public void onSurfacesCreated(AWindow aWindow2) {
                boolean z;
                boolean z2;
                synchronized (MediaPlayer.this) {
                    z = false;
                    if (MediaPlayer.this.mPlaying || !MediaPlayer.this.mPlayRequested) {
                        z2 = MediaPlayer.this.mVoutCount == 0;
                    } else {
                        z2 = false;
                        z = true;
                    }
                }
                if (z) {
                    MediaPlayer.this.play();
                } else if (z2) {
                    MediaPlayer.this.setVideoTrackEnabled(true);
                }
            }

            @Override // org.videolan.libvlc.AWindow.SurfaceCallback
            public void onSurfacesDestroyed(AWindow aWindow2) {
                boolean z;
                synchronized (MediaPlayer.this) {
                    z = MediaPlayer.this.mVoutCount > 0;
                }
                if (z) {
                    MediaPlayer.this.setVideoTrackEnabled(false);
                }
            }
        });
        this.mWindow = aWindow;
        this.mAudioPlugReceiver = (!AndroidUtil.isLolliPopOrLater || AndroidUtil.isMarshMallowOrLater) ? null : createAudioPlugReceiver();
        this.mAudioDeviceCallback = AndroidUtil.isMarshMallowOrLater ? createAudioDeviceCallback() : null;
        this.mHandlerMainThread = new Handler(Looper.getMainLooper());
        nativeNewFromLibVlc(iLibVLC, aWindow);
    }

    public MediaPlayer(@oo0oO0 IMedia iMedia) {
        super(iMedia);
        this.mUseOrientationFromBounds = Boolean.FALSE;
        this.mMedia = null;
        this.mRenderer = null;
        this.mAfd = null;
        this.mPlaying = false;
        this.mPlayRequested = false;
        this.mListenAudioPlug = true;
        this.mVoutCount = 0;
        this.mAudioOutput = null;
        this.mAudioOutputDevice = null;
        this.mAudioPlugRegistered = false;
        this.mAudioDigitalOutputEnabled = false;
        this.mAudioPlugOutputDevice = "stereo";
        this.mVideoHelper = null;
        AWindow aWindow = new AWindow(new AWindow.SurfaceCallback() { // from class: org.videolan.libvlc.MediaPlayer.1
            @Override // org.videolan.libvlc.AWindow.SurfaceCallback
            public void onSurfacesCreated(AWindow aWindow2) {
                boolean z;
                boolean z2;
                synchronized (MediaPlayer.this) {
                    z = false;
                    if (MediaPlayer.this.mPlaying || !MediaPlayer.this.mPlayRequested) {
                        z2 = MediaPlayer.this.mVoutCount == 0;
                    } else {
                        z2 = false;
                        z = true;
                    }
                }
                if (z) {
                    MediaPlayer.this.play();
                } else if (z2) {
                    MediaPlayer.this.setVideoTrackEnabled(true);
                }
            }

            @Override // org.videolan.libvlc.AWindow.SurfaceCallback
            public void onSurfacesDestroyed(AWindow aWindow2) {
                boolean z;
                synchronized (MediaPlayer.this) {
                    z = MediaPlayer.this.mVoutCount > 0;
                }
                if (z) {
                    MediaPlayer.this.setVideoTrackEnabled(false);
                }
            }
        });
        this.mWindow = aWindow;
        this.mAudioPlugReceiver = (!AndroidUtil.isLolliPopOrLater || AndroidUtil.isMarshMallowOrLater) ? null : createAudioPlugReceiver();
        this.mAudioDeviceCallback = AndroidUtil.isMarshMallowOrLater ? createAudioDeviceCallback() : null;
        this.mHandlerMainThread = new Handler(Looper.getMainLooper());
        if (iMedia == null || iMedia.isReleased()) {
            throw new IllegalArgumentException("Media is null or released");
        }
        this.mMedia = iMedia;
        iMedia.retain();
        nativeNewFromMedia(this.mMedia, aWindow);
    }

    @TargetApi(23)
    private AudioDeviceCallback createAudioDeviceCallback() {
        return new AudioDeviceCallback() { // from class: org.videolan.libvlc.MediaPlayer.3
            private SparseArray<Long> mEncodedDevices = new SparseArray<>();

            private void onAudioDevicesChanged() {
                long j = 0;
                for (int i = 0; i < this.mEncodedDevices.size(); i++) {
                    j |= this.mEncodedDevices.valueAt(i).longValue();
                }
                MediaPlayer.this.updateAudioOutputDevice(j, j == 0 ? "stereo" : "pcm");
            }

            @Override // android.media.AudioDeviceCallback
            @o0OOooO0(23)
            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    if (audioDeviceInfo.isSink()) {
                        long encodingFlags = MediaPlayer.this.getEncodingFlags(audioDeviceInfo.getEncodings());
                        if (encodingFlags != 0) {
                            this.mEncodedDevices.put(audioDeviceInfo.getId(), Long.valueOf(encodingFlags));
                        }
                    }
                }
                onAudioDevicesChanged();
            }

            @Override // android.media.AudioDeviceCallback
            @o0OOooO0(23)
            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    if (audioDeviceInfo.isSink()) {
                        this.mEncodedDevices.remove(audioDeviceInfo.getId());
                    }
                }
                onAudioDevicesChanged();
            }
        };
    }

    @TargetApi(21)
    private BroadcastReceiver createAudioPlugReceiver() {
        return new BroadcastReceiver() { // from class: org.videolan.libvlc.MediaPlayer.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if (action != null && action.equalsIgnoreCase("android.media.action.HDMI_AUDIO_PLUG")) {
                    MediaPlayer.this.updateAudioOutputDevice(!(intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) ? 0L : MediaPlayer.this.getEncodingFlags(intent.getIntArrayExtra("android.media.extra.ENCODINGS")), "stereo");
                }
            }
        };
    }

    private static Chapter createChapterFromNative(long j, long j2, String str) {
        return new Chapter(j, j2, str);
    }

    private static Title createTitleFromNative(long j, String str, int i) {
        return new Title(j, str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getEncodingFlags(int[] iArr) {
        long j = 0;
        if (iArr == null) {
            return 0L;
        }
        for (int i : iArr) {
            if (isEncoded(i)) {
                j |= 1 << i;
            }
        }
        return j;
    }

    private boolean isAudioDigitalOutputCapable() {
        String str = this.mAudioOutput;
        return str == null || str.contains("audiotrack");
    }

    private boolean isEncoded(int i) {
        return i == 5 || i == 6 || i == 7 || i == 8 || i == 14;
    }

    private native boolean nativeAddSlave(int i, String str, boolean z);

    private native String nativeGetAspectRatio();

    private native long nativeGetAudioDelay();

    private native Chapter[] nativeGetChapters(int i);

    private native float nativeGetScale();

    private native IMedia.Track nativeGetSelectedTrack(int i);

    private native long nativeGetSpuDelay();

    private native Title[] nativeGetTitles();

    private native IMedia.Track nativeGetTrackFromID(String str);

    private native IMedia.Track[] nativeGetTracks(int i, boolean z);

    private native void nativeNewFromLibVlc(ILibVLC iLibVLC, AWindow aWindow);

    private native void nativeNewFromMedia(IMedia iMedia, AWindow aWindow);

    private native void nativePlay();

    private native boolean nativeRecord(String str);

    private native void nativeRelease();

    private native boolean nativeSelectTrack(String str);

    private native void nativeSelectTracks(int i, String str);

    private native void nativeSetAspectRatio(String str);

    private native boolean nativeSetAudioDelay(long j);

    private native boolean nativeSetAudioOutput(String str);

    private native boolean nativeSetAudioOutputDevice(String str);

    private native boolean nativeSetEqualizer(Equalizer equalizer);

    private native void nativeSetMedia(IMedia iMedia);

    private native int nativeSetRenderer(RendererItem rendererItem);

    private native void nativeSetScale(float f);

    private native boolean nativeSetSpuDelay(long j);

    private native void nativeSetVideoTitleDisplay(int i, int i2);

    private native void nativeStop();

    private native void nativeUnselectTrackType(int i);

    private native boolean nativeUpdateViewpoint(float f, float f2, float f3, float f4, boolean z);

    private void registerAudioPlug(boolean z) {
        if (z == this.mAudioPlugRegistered) {
            return;
        }
        if (this.mAudioDeviceCallback != null) {
            registerAudioPlugV23(z);
        } else if (this.mAudioPlugReceiver != null) {
            registerAudioPlugV21(z);
        }
        this.mAudioPlugRegistered = z;
    }

    @TargetApi(21)
    private void registerAudioPlugV21(boolean z) {
        if (!z) {
            this.mILibVLC.getAppContext().unregisterReceiver(this.mAudioPlugReceiver);
            return;
        }
        Intent registerReceiver = this.mILibVLC.getAppContext().registerReceiver(this.mAudioPlugReceiver, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        if (registerReceiver != null) {
            this.mAudioPlugReceiver.onReceive(this.mILibVLC.getAppContext(), registerReceiver);
        }
    }

    @TargetApi(23)
    private void registerAudioPlugV23(boolean z) {
        AudioManager audioManager = (AudioManager) this.mILibVLC.getAppContext().getSystemService(AudioManager.class);
        if (!z) {
            audioManager.unregisterAudioDeviceCallback(this.mAudioDeviceCallback);
            return;
        }
        this.mAudioDeviceCallback.onAudioDevicesAdded(audioManager.getDevices(2));
        audioManager.registerAudioDeviceCallback(this.mAudioDeviceCallback, null);
    }

    private synchronized boolean setAudioOutputDeviceInternal(String str, boolean z) {
        boolean nativeSetAudioOutputDevice;
        this.mAudioOutputDevice = str;
        if (z) {
            boolean z2 = str == null && isAudioDigitalOutputCapable();
            this.mListenAudioPlug = z2;
            if (!z2) {
                registerAudioPlug(false);
            }
        }
        nativeSetAudioOutputDevice = nativeSetAudioOutputDevice(str);
        if (!nativeSetAudioOutputDevice) {
            this.mAudioOutputDevice = null;
            this.mListenAudioPlug = false;
        }
        if (this.mListenAudioPlug) {
            registerAudioPlug(true);
        }
        return nativeSetAudioOutputDevice;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void updateAudioOutputDevice(long j, String str) {
        boolean z = j != 0;
        this.mCanDoPassthrough = z;
        if (this.mAudioDigitalOutputEnabled && z) {
            str = "encoded:" + j;
        }
        if (!str.equals(this.mAudioPlugOutputDevice)) {
            this.mAudioPlugOutputDevice = str;
            setAudioOutputDeviceInternal(str, false);
        }
    }

    public boolean addSlave(int i, Uri uri, boolean z) {
        return nativeAddSlave(i, VLCUtil.encodeVLCUri(uri), z);
    }

    public boolean addSlave(int i, String str, boolean z) {
        return addSlave(i, Uri.fromFile(new File(str)), z);
    }

    public void attachViews(@oo0oO0 VLCVideoLayout vLCVideoLayout, @o0OO00OO DisplayManager displayManager, boolean z, boolean z2) {
        VideoHelper videoHelper = new VideoHelper(this, vLCVideoLayout, displayManager, z, z2);
        this.mVideoHelper = videoHelper;
        videoHelper.attachViews();
    }

    public boolean canDoPassthrough() {
        return this.mCanDoPassthrough;
    }

    public void detachViews() {
        VideoHelper videoHelper = this.mVideoHelper;
        if (videoHelper != null) {
            videoHelper.release();
            this.mVideoHelper = null;
        }
    }

    public synchronized boolean forceAudioDigitalEncodings(int[] iArr) {
        if (isAudioDigitalOutputCapable()) {
            if (iArr.length == 0) {
                setAudioOutputDeviceInternal(null, true);
            } else {
                String str = "encoded:" + getEncodingFlags(iArr);
                if (!str.equals(this.mAudioPlugOutputDevice)) {
                    this.mAudioPlugOutputDevice = str;
                    setAudioOutputDeviceInternal(str, true);
                }
            }
            return true;
        }
        return false;
    }

    public String getAspectRatio() {
        return nativeGetAspectRatio();
    }

    public long getAudioDelay() {
        return nativeGetAudioDelay();
    }

    public native int getChapter();

    public Chapter[] getChapters(int i) {
        return nativeGetChapters(i);
    }

    @Override // org.videolan.libvlc.VLCObject
    public /* bridge */ /* synthetic */ long getInstance() {
        return super.getInstance();
    }

    public native long getLength();

    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public /* bridge */ /* synthetic */ ILibVLC getLibVLC() {
        return super.getLibVLC();
    }

    @o0OO00OO
    public synchronized IMedia getMedia() {
        IMedia iMedia = this.mMedia;
        if (iMedia != null) {
            iMedia.retain();
        }
        return this.mMedia;
    }

    public native int getPlayerState();

    public native float getPosition();

    public native float getRate();

    public float getScale() {
        return nativeGetScale();
    }

    public IMedia.Track getSelectedTrack(int i) {
        return nativeGetSelectedTrack(i);
    }

    public IMedia.Track[] getSelectedTracks(int i) {
        return nativeGetTracks(i, true);
    }

    public long getSpuDelay() {
        return nativeGetSpuDelay();
    }

    public native long getTime();

    public native int getTitle();

    public Title[] getTitles() {
        return nativeGetTitles();
    }

    public IMedia.Track getTrackFromID(String str) {
        return nativeGetTrackFromID(str);
    }

    public IMedia.Track[] getTracks(int i) {
        return nativeGetTracks(i, false);
    }

    @oo0oO0
    public IVLCVout getVLCVout() {
        return this.mWindow;
    }

    @oo0oO0
    public ScaleType getVideoScale() {
        VideoHelper videoHelper = this.mVideoHelper;
        return videoHelper != null ? videoHelper.getVideoScale() : ScaleType.SURFACE_BEST_FIT;
    }

    public native int getVolume();

    public synchronized boolean hasMedia() {
        return this.mMedia != null;
    }

    public native boolean isPlaying();

    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public /* bridge */ /* synthetic */ boolean isReleased() {
        return super.isReleased();
    }

    public native boolean isSeekable();

    public native void nativeSetPosition(float f, boolean z);

    public native long nativeSetTime(long j, boolean z);

    public native void navigate(int i);

    public native int nextChapter();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.videolan.libvlc.VLCObject
    public synchronized Event onEventNative(int i, long j, long j2, float f, @o0OO00OO String str) {
        if (i != 256) {
            if (i == 286) {
                return new Event(i, j, str);
            } else if (i == 273) {
                return new Event(i, j);
            } else if (i == 274) {
                this.mVoutCount = (int) j;
                notify();
                this.mHandlerMainThread.post(new Runnable() { // from class: org.videolan.libvlc.MediaPlayer.4
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaPlayer.this.updateVideoSurfaces();
                    }
                });
                return new Event(i, j);
            } else {
                switch (i) {
                    case Event.Opening /* 258 */:
                    case Event.Buffering /* 259 */:
                        break;
                    case Event.Playing /* 260 */:
                    case Event.Paused /* 261 */:
                        return new Event(i);
                    default:
                        switch (i) {
                            case Event.EndReached /* 265 */:
                            case Event.EncounteredError /* 266 */:
                                break;
                            case Event.TimeChanged /* 267 */:
                                return new Event(i, j);
                            case Event.PositionChanged /* 268 */:
                                return new Event(i, f);
                            case Event.SeekableChanged /* 269 */:
                            case 270:
                                return new Event(i, j);
                            default:
                                switch (i) {
                                    case Event.ESAdded /* 276 */:
                                    case Event.ESDeleted /* 277 */:
                                    case Event.ESSelected /* 278 */:
                                        return new Event(i, j, j2);
                                    default:
                                        return null;
                                }
                        }
                    case 262:
                        this.mVoutCount = 0;
                        notify();
                        break;
                }
                return new Event(i, f);
            }
        }
        this.mVoutCount = 0;
        notify();
        return new Event(i, f);
    }

    @Override // org.videolan.libvlc.VLCObject
    public void onReleaseNative() {
        detachViews();
        this.mWindow.detachViews();
        registerAudioPlug(false);
        IMedia iMedia = this.mMedia;
        if (iMedia != null) {
            iMedia.release();
        }
        RendererItem rendererItem = this.mRenderer;
        if (rendererItem != null) {
            rendererItem.release();
        }
        this.mVoutCount = 0;
        nativeRelease();
    }

    public native void pause();

    public void play() {
        synchronized (this) {
            if (!this.mPlaying) {
                if (this.mListenAudioPlug) {
                    registerAudioPlug(true);
                }
                this.mPlayRequested = true;
                if (this.mWindow.areSurfacesWaiting()) {
                    return;
                }
            }
            this.mPlaying = true;
            nativePlay();
        }
    }

    public void play(@oo0oO0 AssetFileDescriptor assetFileDescriptor) {
        play(new Media(this.mILibVLC, assetFileDescriptor));
    }

    public void play(@oo0oO0 Uri uri) {
        play(new Media(this.mILibVLC, uri));
    }

    public void play(@oo0oO0 String str) {
        play(new Media(this.mILibVLC, str));
    }

    public void play(@oo0oO0 IMedia iMedia) {
        setMedia(iMedia);
        iMedia.release();
        play();
    }

    public void playAsset(@oo0oO0 Context context, @oo0oO0 String str) throws IOException {
        AssetFileDescriptor openFd = context.getAssets().openFd(str);
        this.mAfd = openFd;
        play(openFd);
    }

    public native int previousChapter();

    public boolean record(String str) {
        return nativeRecord(str);
    }

    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    public boolean selectTrack(String str) {
        return nativeSelectTrack(str);
    }

    public void selectTracks(int i, String str) {
        nativeSelectTracks(i, str);
    }

    public void setAspectRatio(String str) {
        nativeSetAspectRatio(str);
    }

    public boolean setAudioDelay(long j) {
        return nativeSetAudioDelay(j);
    }

    public synchronized boolean setAudioDigitalOutputEnabled(boolean z) {
        if (z == this.mAudioDigitalOutputEnabled) {
            return true;
        }
        if (this.mListenAudioPlug && isAudioDigitalOutputCapable()) {
            registerAudioPlug(false);
            this.mAudioDigitalOutputEnabled = z;
            registerAudioPlug(true);
            return true;
        }
        return false;
    }

    public synchronized boolean setAudioOutput(String str) {
        boolean nativeSetAudioOutput;
        this.mAudioOutput = str;
        boolean isAudioDigitalOutputCapable = isAudioDigitalOutputCapable();
        this.mListenAudioPlug = isAudioDigitalOutputCapable;
        if (!isAudioDigitalOutputCapable) {
            registerAudioPlug(false);
        }
        nativeSetAudioOutput = nativeSetAudioOutput(str);
        if (!nativeSetAudioOutput) {
            this.mAudioOutput = null;
            this.mListenAudioPlug = false;
        }
        if (this.mListenAudioPlug) {
            registerAudioPlug(true);
        }
        return nativeSetAudioOutput;
    }

    public boolean setAudioOutputDevice(String str) {
        return setAudioOutputDeviceInternal(str, true);
    }

    public native void setChapter(int i);

    public boolean setEqualizer(Equalizer equalizer) {
        return nativeSetEqualizer(equalizer);
    }

    public synchronized void setEventListener(EventListener eventListener) {
        super.setEventListener((AbstractVLCEvent.Listener) eventListener);
    }

    public void setMedia(@o0OO00OO IMedia iMedia) {
        if (iMedia != null) {
            if (iMedia.isReleased()) {
                throw new IllegalArgumentException("Media is released");
            }
            iMedia.setDefaultMediaPlayerOptions();
        }
        nativeSetMedia(iMedia);
        synchronized (this) {
            IMedia iMedia2 = this.mMedia;
            if (iMedia2 != null) {
                iMedia2.release();
            }
            if (iMedia != null) {
                iMedia.retain();
            }
            this.mMedia = iMedia;
        }
    }

    public void setPosition(float f) {
        nativeSetPosition(f, false);
    }

    public void setPosition(float f, boolean z) {
        nativeSetPosition(f, z);
    }

    public native void setRate(float f);

    public int setRenderer(@o0OO00OO RendererItem rendererItem) {
        RendererItem rendererItem2 = this.mRenderer;
        if (rendererItem2 != null) {
            rendererItem2.release();
        }
        if (rendererItem != null) {
            rendererItem.retain();
        }
        this.mRenderer = rendererItem;
        return nativeSetRenderer(rendererItem);
    }

    public void setScale(float f) {
        nativeSetScale(f);
    }

    public boolean setSpuDelay(long j) {
        return nativeSetSpuDelay(j);
    }

    public long setTime(long j) {
        return nativeSetTime(j, false);
    }

    public long setTime(long j, boolean z) {
        return nativeSetTime(j, z);
    }

    public native void setTitle(int i);

    public void setUseOrientationFromBounds(Boolean bool) {
        this.mUseOrientationFromBounds = bool;
    }

    public void setVideoScale(@oo0oO0 ScaleType scaleType) {
        VideoHelper videoHelper = this.mVideoHelper;
        if (videoHelper != null) {
            videoHelper.setVideoScale(scaleType);
        }
    }

    public void setVideoTitleDisplay(int i, int i2) {
        nativeSetVideoTitleDisplay(i, i2);
    }

    public void setVideoTrackEnabled(boolean z) {
        IMedia.Track[] tracks;
        if (!z) {
            unselectTrackType(1);
        } else if (isReleased() || !hasMedia() || getSelectedTrack(1) != null || (tracks = getTracks(1)) == null) {
        } else {
            selectTrack(tracks[0].id);
        }
    }

    public native int setVolume(int i);

    public void stop() {
        synchronized (this) {
            this.mPlayRequested = false;
            this.mPlaying = false;
        }
        nativeStop();
        AssetFileDescriptor assetFileDescriptor = this.mAfd;
        if (assetFileDescriptor != null) {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    public void unselectTrackType(int i) {
        nativeUnselectTrackType(i);
    }

    public void updateVideoSurfaces() {
        VideoHelper videoHelper = this.mVideoHelper;
        if (videoHelper != null) {
            videoHelper.updateVideoSurfaces(true);
        }
    }

    public boolean updateViewpoint(float f, float f2, float f3, float f4, boolean z) {
        return nativeUpdateViewpoint(f, f2, f3, f4, z);
    }

    public Boolean useOrientationFromBounds() {
        return this.mUseOrientationFromBounds;
    }
}
