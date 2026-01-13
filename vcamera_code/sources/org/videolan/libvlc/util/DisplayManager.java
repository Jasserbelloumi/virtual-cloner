package org.videolan.libvlc.util;

import android.app.Activity;
import android.app.Presentation;
import android.content.Context;
import android.content.DialogInterface;
import android.media.MediaRouter;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.SurfaceView;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.o0OooO0;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooo0.o0;
import org.videolan.R;
import org.videolan.libvlc.RendererItem;
/* loaded from: classes3.dex */
public class DisplayManager {
    private static final String TAG = "VLC/DisplayManager";
    private Activity mActivity;
    private DisplayType mDisplayType;
    private MediaRouter mMediaRouter;
    private MediaRouter.SimpleCallback mMediaRouterCallback;
    private SecondaryDisplay mPresentation;
    private RendererItem mRendererItem;
    private LiveData<RendererItem> mSelectedRenderer;
    private boolean mTextureView;
    private int mPresentationId = -1;
    private o0OooO0<RendererItem> mRendererObs = new o0OooO0<RendererItem>() { // from class: org.videolan.libvlc.util.DisplayManager.1
        @Override // androidx.lifecycle.o0OooO0
        public void onChanged(RendererItem rendererItem) {
            if (DisplayManager.this.mRendererItem != rendererItem) {
                DisplayManager.this.mRendererItem = rendererItem;
                DisplayManager.this.updateDisplayType();
            }
        }
    };
    private DialogInterface.OnDismissListener mOnDismissListener = new DialogInterface.OnDismissListener() { // from class: org.videolan.libvlc.util.DisplayManager.2
        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (dialogInterface == DisplayManager.this.mPresentation) {
                DisplayManager.this.mPresentation = null;
                DisplayManager.this.mPresentationId = -1;
            }
        }
    };

    /* loaded from: classes3.dex */
    public enum DisplayType {
        PRIMARY,
        PRESENTATION,
        RENDERER
    }

    /* loaded from: classes3.dex */
    public class SecondaryDisplay extends Presentation {
        public static final String TAG = "VLC/SecondaryDisplay";
        private SurfaceView mSubtitlesSurfaceView;
        private FrameLayout mSurfaceFrame;
        private SurfaceView mSurfaceView;

        public SecondaryDisplay(Context context, Display display) {
            super(context, display);
        }

        public SecondaryDisplay(Context context, Display display, int i) {
            super(context, display, i);
        }

        public SurfaceView getSubtitlesSurfaceView() {
            return this.mSubtitlesSurfaceView;
        }

        public FrameLayout getSurfaceFrame() {
            return this.mSurfaceFrame;
        }

        public SurfaceView getSurfaceView() {
            return this.mSurfaceView;
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(R.layout.player_remote);
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.remote_player_surface_frame);
            this.mSurfaceFrame = frameLayout;
            this.mSurfaceView = (SurfaceView) frameLayout.findViewById(R.id.remote_player_surface);
            SurfaceView surfaceView = (SurfaceView) this.mSurfaceFrame.findViewById(R.id.remote_subtitles_surface);
            this.mSubtitlesSurfaceView = surfaceView;
            surfaceView.setZOrderMediaOverlay(true);
            this.mSubtitlesSurfaceView.getHolder().setFormat(-3);
        }
    }

    public DisplayManager(@oo0oO0 Activity activity, @o0OO00OO LiveData<RendererItem> liveData, boolean z, boolean z2, boolean z3) {
        this.mActivity = activity;
        this.mSelectedRenderer = liveData;
        this.mMediaRouter = (MediaRouter) o0.getSystemService(activity.getApplicationContext(), MediaRouter.class);
        this.mTextureView = z;
        this.mPresentation = (z2 || z3 || liveData == null || liveData.o00oOo0o() != null) ? null : createPresentation();
        LiveData<RendererItem> liveData2 = this.mSelectedRenderer;
        if (liveData2 != null) {
            this.mRendererItem = liveData2.o00oOo0o();
            this.mSelectedRenderer.o00oOooo(this.mRendererObs);
        }
        this.mDisplayType = z3 ? DisplayType.PRIMARY : getCurrentType();
    }

    private SecondaryDisplay createPresentation() {
        MediaRouter mediaRouter = this.mMediaRouter;
        if (mediaRouter == null) {
            return null;
        }
        MediaRouter.RouteInfo selectedRoute = mediaRouter.getSelectedRoute(2);
        Display presentationDisplay = selectedRoute != null ? selectedRoute.getPresentationDisplay() : null;
        if (presentationDisplay != null) {
            SecondaryDisplay secondaryDisplay = new SecondaryDisplay(this.mActivity, presentationDisplay);
            secondaryDisplay.setOnDismissListener(this.mOnDismissListener);
            try {
                secondaryDisplay.show();
                this.mPresentationId = presentationDisplay.getDisplayId();
                return secondaryDisplay;
            } catch (WindowManager.InvalidDisplayException unused) {
                this.mPresentationId = -1;
            }
        }
        return null;
    }

    private DisplayType getCurrentType() {
        return this.mPresentationId != -1 ? DisplayType.PRESENTATION : this.mRendererItem != null ? DisplayType.RENDERER : DisplayType.PRIMARY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePresentation() {
        if (this.mMediaRouter == null) {
            return;
        }
        SecondaryDisplay secondaryDisplay = this.mPresentation;
        if (secondaryDisplay != null) {
            secondaryDisplay.dismiss();
            this.mPresentation = null;
        }
        updateDisplayType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDisplayType() {
        if (this.mDisplayType != getCurrentType()) {
            new Handler().postDelayed(new Runnable() { // from class: org.videolan.libvlc.util.DisplayManager.3
                @Override // java.lang.Runnable
                public void run() {
                    DisplayManager.this.mActivity.recreate();
                }
            }, 100L);
        }
    }

    @o0OO00OO
    public DisplayType getDisplayType() {
        return this.mDisplayType;
    }

    @o0OO00OO
    public SecondaryDisplay getPresentation() {
        return this.mPresentation;
    }

    public boolean isOnRenderer() {
        return this.mDisplayType == DisplayType.RENDERER;
    }

    public boolean isPrimary() {
        return this.mDisplayType == DisplayType.PRIMARY;
    }

    public boolean isSecondary() {
        return this.mDisplayType == DisplayType.PRESENTATION;
    }

    public void release() {
        SecondaryDisplay secondaryDisplay = this.mPresentation;
        if (secondaryDisplay != null) {
            secondaryDisplay.dismiss();
            this.mPresentation = null;
        }
        LiveData<RendererItem> liveData = this.mSelectedRenderer;
        if (liveData != null) {
            liveData.o00oo0O0(this.mRendererObs);
        }
    }

    public void removeMediaRouterCallback() {
        MediaRouter mediaRouter = this.mMediaRouter;
        if (mediaRouter != null) {
            mediaRouter.removeCallback(this.mMediaRouterCallback);
        }
        this.mMediaRouterCallback = null;
    }

    public boolean setMediaRouterCallback() {
        if (this.mMediaRouter == null || this.mMediaRouterCallback != null) {
            return false;
        }
        MediaRouter.SimpleCallback simpleCallback = new MediaRouter.SimpleCallback() { // from class: org.videolan.libvlc.util.DisplayManager.4
            @Override // android.media.MediaRouter.Callback
            public void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
                int displayId = routeInfo.getPresentationDisplay() != null ? routeInfo.getPresentationDisplay().getDisplayId() : -1;
                if (displayId == DisplayManager.this.mPresentationId) {
                    return;
                }
                DisplayManager.this.mPresentationId = displayId;
                if (displayId == -1) {
                    DisplayManager.this.removePresentation();
                } else {
                    DisplayManager.this.updateDisplayType();
                }
            }
        };
        this.mMediaRouterCallback = simpleCallback;
        this.mMediaRouter.addCallback(2, simpleCallback);
        return true;
    }
}
