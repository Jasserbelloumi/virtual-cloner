package org.videolan.libvlc.interfaces;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import o00oOooO.o0O;
/* loaded from: classes3.dex */
public interface IVLCVout {

    /* loaded from: classes3.dex */
    public interface Callback {
        @o0O
        void onSurfacesCreated(IVLCVout iVLCVout);

        @o0O
        void onSurfacesDestroyed(IVLCVout iVLCVout);
    }

    /* loaded from: classes3.dex */
    public interface OnNewVideoLayoutListener {
        @o0O
        void onNewVideoLayout(IVLCVout iVLCVout, int i, int i2, int i3, int i4, int i5, int i6);
    }

    @o0O
    void addCallback(Callback callback);

    @o0O
    boolean areViewsAttached();

    @o0O
    void attachViews();

    @o0O
    void attachViews(OnNewVideoLayoutListener onNewVideoLayoutListener);

    @o0O
    void detachViews();

    @o0O
    void removeCallback(Callback callback);

    @o0O
    void sendMouseEvent(int i, int i2, int i3, int i4);

    @o0O
    @TargetApi(14)
    void setSubtitlesSurface(SurfaceTexture surfaceTexture);

    @o0O
    void setSubtitlesSurface(Surface surface, SurfaceHolder surfaceHolder);

    @o0O
    void setSubtitlesView(SurfaceView surfaceView);

    @o0O
    @TargetApi(14)
    void setSubtitlesView(TextureView textureView);

    @o0O
    @TargetApi(14)
    void setVideoSurface(SurfaceTexture surfaceTexture);

    @o0O
    void setVideoSurface(Surface surface, SurfaceHolder surfaceHolder);

    @o0O
    void setVideoView(SurfaceView surfaceView);

    @o0O
    @TargetApi(14)
    void setVideoView(TextureView textureView);

    @o0O
    void setWindowSize(int i, int i2);
}
