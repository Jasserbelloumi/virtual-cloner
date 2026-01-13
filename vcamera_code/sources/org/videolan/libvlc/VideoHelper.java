package org.videolan.libvlc;

import android.annotation.TargetApi;
import android.os.Handler;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import org.videolan.R;
import org.videolan.libvlc.MediaPlayer;
import org.videolan.libvlc.interfaces.IMedia;
import org.videolan.libvlc.interfaces.IVLCVout;
import org.videolan.libvlc.util.DisplayManager;
import org.videolan.libvlc.util.VLCVideoLayout;
/* loaded from: classes3.dex */
class VideoHelper implements IVLCVout.OnNewVideoLayoutListener {
    private static final String TAG = "LibVLC/VideoHelper";
    private DisplayManager mDisplayManager;
    private MediaPlayer mMediaPlayer;
    private FrameLayout mVideoSurfaceFrame;
    private MediaPlayer.ScaleType mCurrentScaleType = MediaPlayer.ScaleType.SURFACE_BEST_FIT;
    private int mVideoHeight = 0;
    private int mVideoWidth = 0;
    private int mVideoVisibleHeight = 0;
    private int mVideoVisibleWidth = 0;
    private int mVideoSarNum = 0;
    private int mVideoSarDen = 0;
    private SurfaceView mVideoSurface = null;
    private SurfaceView mSubtitlesSurface = null;
    private TextureView mVideoTexture = null;
    private final Handler mHandler = new Handler();
    private View.OnLayoutChangeListener mOnLayoutChangeListener = null;

    /* renamed from: org.videolan.libvlc.VideoHelper$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType;

        static {
            int[] iArr = new int[MediaPlayer.ScaleType.values().length];
            $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType = iArr;
            try {
                iArr[MediaPlayer.ScaleType.SURFACE_BEST_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[MediaPlayer.ScaleType.SURFACE_FIT_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[MediaPlayer.ScaleType.SURFACE_FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[MediaPlayer.ScaleType.SURFACE_16_9.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[MediaPlayer.ScaleType.SURFACE_16_10.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[MediaPlayer.ScaleType.SURFACE_221_1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[MediaPlayer.ScaleType.SURFACE_235_1.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[MediaPlayer.ScaleType.SURFACE_239_1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[MediaPlayer.ScaleType.SURFACE_5_4.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[MediaPlayer.ScaleType.SURFACE_4_3.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[MediaPlayer.ScaleType.SURFACE_ORIGINAL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public VideoHelper(MediaPlayer mediaPlayer, VLCVideoLayout vLCVideoLayout, DisplayManager displayManager, boolean z, boolean z2) {
        init(mediaPlayer, vLCVideoLayout, displayManager, z, !z2);
    }

    private void changeMediaPlayerLayout(int i, int i2) {
        StringBuilder sb;
        MediaPlayer mediaPlayer;
        String str;
        if (this.mMediaPlayer.isReleased()) {
            return;
        }
        switch (AnonymousClass2.$SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[this.mCurrentScaleType.ordinal()]) {
            case 1:
                this.mMediaPlayer.setAspectRatio(null);
                break;
            case 2:
            case 3:
                boolean z = true;
                IMedia.VideoTrack videoTrack = (IMedia.VideoTrack) this.mMediaPlayer.getSelectedTrack(1);
                if (videoTrack == null) {
                    return;
                }
                int i3 = videoTrack.orientation;
                if (i3 != 5 && i3 != 6) {
                    z = false;
                }
                if (this.mCurrentScaleType != MediaPlayer.ScaleType.SURFACE_FIT_SCREEN) {
                    this.mMediaPlayer.setScale(0.0f);
                    MediaPlayer mediaPlayer2 = this.mMediaPlayer;
                    if (z) {
                        sb = new StringBuilder();
                        sb.append("");
                        sb.append(i2);
                        sb.append(":");
                        sb.append(i);
                    } else {
                        sb = new StringBuilder();
                        sb.append("");
                        sb.append(i);
                        sb.append(":");
                        sb.append(i2);
                    }
                    mediaPlayer2.setAspectRatio(sb.toString());
                    return;
                }
                int i4 = videoTrack.width;
                int i5 = videoTrack.height;
                if (z) {
                    i5 = i4;
                    i4 = i5;
                }
                int i6 = videoTrack.sarNum;
                int i7 = videoTrack.sarDen;
                if (i6 != i7) {
                    i4 = (i4 * i6) / i7;
                }
                float f = i4;
                float f2 = i5;
                float f3 = i;
                float f4 = i2;
                this.mMediaPlayer.setScale(f3 / f4 >= f / f2 ? f3 / f : f4 / f2);
                this.mMediaPlayer.setAspectRatio(null);
                return;
            case 4:
                mediaPlayer = this.mMediaPlayer;
                str = "16:9";
                mediaPlayer.setAspectRatio(str);
                break;
            case 5:
                mediaPlayer = this.mMediaPlayer;
                str = "16:10";
                mediaPlayer.setAspectRatio(str);
                break;
            case 6:
                mediaPlayer = this.mMediaPlayer;
                str = "2.21:1";
                mediaPlayer.setAspectRatio(str);
                break;
            case 7:
                mediaPlayer = this.mMediaPlayer;
                str = "2.35:1";
                mediaPlayer.setAspectRatio(str);
                break;
            case 8:
                mediaPlayer = this.mMediaPlayer;
                str = "2.39:1";
                mediaPlayer.setAspectRatio(str);
                break;
            case 9:
                mediaPlayer = this.mMediaPlayer;
                str = "5:4";
                mediaPlayer.setAspectRatio(str);
                break;
            case 10:
                mediaPlayer = this.mMediaPlayer;
                str = "4:3";
                mediaPlayer.setAspectRatio(str);
                break;
            case 11:
                this.mMediaPlayer.setAspectRatio(null);
                this.mMediaPlayer.setScale(1.0f);
                return;
            default:
                return;
        }
        this.mMediaPlayer.setScale(0.0f);
    }

    private void init(MediaPlayer mediaPlayer, VLCVideoLayout vLCVideoLayout, DisplayManager displayManager, boolean z, boolean z2) {
        this.mMediaPlayer = mediaPlayer;
        this.mDisplayManager = displayManager;
        if (!(displayManager == null || displayManager.isPrimary())) {
            if (this.mDisplayManager.getPresentation() != null) {
                this.mVideoSurfaceFrame = this.mDisplayManager.getPresentation().getSurfaceFrame();
                this.mVideoSurface = this.mDisplayManager.getPresentation().getSurfaceView();
                this.mSubtitlesSurface = this.mDisplayManager.getPresentation().getSubtitlesSurfaceView();
                return;
            }
            return;
        }
        FrameLayout frameLayout = (FrameLayout) vLCVideoLayout.findViewById(R.id.player_surface_frame);
        this.mVideoSurfaceFrame = frameLayout;
        if (!z2) {
            ViewStub viewStub = (ViewStub) frameLayout.findViewById(R.id.texture_stub);
            this.mVideoTexture = (TextureView) (viewStub != null ? viewStub.inflate() : this.mVideoSurfaceFrame.findViewById(R.id.texture_video));
            return;
        }
        ViewStub viewStub2 = (ViewStub) frameLayout.findViewById(R.id.surface_stub);
        this.mVideoSurface = (SurfaceView) (viewStub2 != null ? viewStub2.inflate() : this.mVideoSurfaceFrame.findViewById(R.id.surface_video));
        if (z) {
            ViewStub viewStub3 = (ViewStub) vLCVideoLayout.findViewById(R.id.subtitles_surface_stub);
            SurfaceView surfaceView = (SurfaceView) (viewStub3 != null ? viewStub3.inflate() : vLCVideoLayout.findViewById(R.id.surface_subtitles));
            this.mSubtitlesSurface = surfaceView;
            surfaceView.setZOrderMediaOverlay(true);
            this.mSubtitlesSurface.getHolder().setFormat(-3);
        }
    }

    public void attachViews() {
        if (this.mVideoSurface == null && this.mVideoTexture == null) {
            return;
        }
        IVLCVout vLCVout = this.mMediaPlayer.getVLCVout();
        SurfaceView surfaceView = this.mVideoSurface;
        if (surfaceView != null) {
            vLCVout.setVideoView(surfaceView);
            SurfaceView surfaceView2 = this.mSubtitlesSurface;
            if (surfaceView2 != null) {
                vLCVout.setSubtitlesView(surfaceView2);
            }
        } else {
            TextureView textureView = this.mVideoTexture;
            if (textureView == null) {
                return;
            }
            vLCVout.setVideoView(textureView);
        }
        vLCVout.attachViews(this);
        if (this.mOnLayoutChangeListener == null) {
            this.mOnLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: org.videolan.libvlc.VideoHelper.1
                private final Runnable runnable = new Runnable() { // from class: org.videolan.libvlc.VideoHelper.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoHelper.this.mVideoSurfaceFrame == null || VideoHelper.this.mOnLayoutChangeListener == null) {
                            return;
                        }
                        VideoHelper.this.updateVideoSurfaces(true);
                    }
                };

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                        return;
                    }
                    VideoHelper.this.mHandler.removeCallbacks(this.runnable);
                    VideoHelper.this.mHandler.post(this.runnable);
                }
            };
        }
        this.mVideoSurfaceFrame.addOnLayoutChangeListener(this.mOnLayoutChangeListener);
        this.mMediaPlayer.setVideoTrackEnabled(true);
    }

    public void detachViews() {
        FrameLayout frameLayout;
        View.OnLayoutChangeListener onLayoutChangeListener = this.mOnLayoutChangeListener;
        if (onLayoutChangeListener != null && (frameLayout = this.mVideoSurfaceFrame) != null) {
            frameLayout.removeOnLayoutChangeListener(onLayoutChangeListener);
            this.mOnLayoutChangeListener = null;
        }
        this.mMediaPlayer.setVideoTrackEnabled(false);
        this.mMediaPlayer.getVLCVout().detachViews();
    }

    public MediaPlayer.ScaleType getVideoScale() {
        return this.mCurrentScaleType;
    }

    @Override // org.videolan.libvlc.interfaces.IVLCVout.OnNewVideoLayoutListener
    @TargetApi(17)
    public void onNewVideoLayout(IVLCVout iVLCVout, int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z = false;
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) {
            this.mVideoVisibleHeight = 0;
            this.mVideoVisibleWidth = 0;
            this.mVideoHeight = 0;
            this.mVideoWidth = 0;
            this.mVideoSarDen = 0;
            this.mVideoSarNum = 0;
        } else {
            if (i != 0 && i2 != 0) {
                this.mVideoWidth = i;
                this.mVideoHeight = i2;
                z = true;
            }
            if (i3 != 0 && i4 != 0) {
                this.mVideoVisibleWidth = i3;
                this.mVideoVisibleHeight = i4;
            }
            if (i5 != 0 && i6 != 0) {
                this.mVideoSarNum = i5;
                this.mVideoSarDen = i6;
            }
        }
        updateVideoSurfaces(z);
    }

    public void release() {
        if (this.mMediaPlayer.getVLCVout().areViewsAttached()) {
            detachViews();
        }
        this.mMediaPlayer = null;
        this.mVideoSurfaceFrame = null;
        this.mHandler.removeCallbacks(null);
        this.mVideoSurface = null;
        this.mSubtitlesSurface = null;
        this.mVideoTexture = null;
    }

    public void setVideoScale(MediaPlayer.ScaleType scaleType) {
        this.mCurrentScaleType = scaleType;
        updateVideoSurfaces(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x013b, code lost:
        if (r12 < r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0145, code lost:
        if (r12 >= r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014a, code lost:
        if (r12 < r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x014c, code lost:
        r10 = r4 / r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x014f, code lost:
        r4 = r10 * r1;
     */
    @android.annotation.TargetApi(24)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateVideoSurfaces(boolean r19) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.VideoHelper.updateVideoSurfaces(boolean):void");
    }
}
