package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbeb;
import com.google.android.gms.internal.ads.zzbza;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {
    @NotOnlyInitialized
    private final FrameLayout zza;
    @NotOnlyInitialized
    @o0OO00OO
    private final zzbeb zzb;

    public NativeAdView(@oo0oO0 Context context) {
        super(context);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    public NativeAdView(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    public NativeAdView(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    @TargetApi(21)
    public NativeAdView(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    private final FrameLayout zzd(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    @o0OO00OO
    @RequiresNonNull({"overlayFrame"})
    private final zzbeb zze() {
        if (isInEditMode()) {
            return null;
        }
        return zzay.zza().zzh(this.zza.getContext(), this, this.zza);
    }

    private final void zzf(String str, @o0OO00OO View view) {
        zzbeb zzbebVar = this.zzb;
        if (zzbebVar != null) {
            try {
                zzbebVar.zzbs(str, ObjectWrapper.wrap(view));
            } catch (RemoteException e) {
                zzbza.zzh("Unable to call setAssetView on delegate", e);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(@oo0oO0 View view, int i, @oo0oO0 ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(@oo0oO0 View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zza;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void destroy() {
        zzbeb zzbebVar = this.zzb;
        if (zzbebVar != null) {
            try {
                zzbebVar.zzc();
            } catch (RemoteException e) {
                zzbza.zzh("Unable to destroy native ad view", e);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@oo0oO0 MotionEvent motionEvent) {
        if (this.zzb != null) {
            if (((Boolean) zzba.zzc().zzb(zzbar.zzjF)).booleanValue()) {
                try {
                    this.zzb.zzd(ObjectWrapper.wrap(motionEvent));
                } catch (RemoteException e) {
                    zzbza.zzh("Unable to call handleTouchEvent on delegate", e);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @o0OO00OO
    public AdChoicesView getAdChoicesView() {
        View zza = zza("3011");
        if (zza instanceof AdChoicesView) {
            return (AdChoicesView) zza;
        }
        return null;
    }

    @o0OO00OO
    public final View getAdvertiserView() {
        return zza("3005");
    }

    @o0OO00OO
    public final View getBodyView() {
        return zza("3004");
    }

    @o0OO00OO
    public final View getCallToActionView() {
        return zza("3002");
    }

    @o0OO00OO
    public final View getHeadlineView() {
        return zza("3001");
    }

    @o0OO00OO
    public final View getIconView() {
        return zza("3003");
    }

    @o0OO00OO
    public final View getImageView() {
        return zza("3008");
    }

    @o0OO00OO
    public final MediaView getMediaView() {
        View zza = zza("3010");
        if (zza instanceof MediaView) {
            return (MediaView) zza;
        }
        if (zza != null) {
            zzbza.zze("View is not an instance of MediaView");
            return null;
        }
        return null;
    }

    @o0OO00OO
    public final View getPriceView() {
        return zza("3007");
    }

    @o0OO00OO
    public final View getStarRatingView() {
        return zza("3009");
    }

    @o0OO00OO
    public final View getStoreView() {
        return zza("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@oo0oO0 View view, int i) {
        super.onVisibilityChanged(view, i);
        zzbeb zzbebVar = this.zzb;
        if (zzbebVar != null) {
            try {
                zzbebVar.zze(ObjectWrapper.wrap(view), i);
            } catch (RemoteException e) {
                zzbza.zzh("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(@oo0oO0 View view) {
        if (this.zza == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(@o0OO00OO AdChoicesView adChoicesView) {
        zzf("3011", adChoicesView);
    }

    public final void setAdvertiserView(@o0OO00OO View view) {
        zzf("3005", view);
    }

    public final void setBodyView(@o0OO00OO View view) {
        zzf("3004", view);
    }

    public final void setCallToActionView(@o0OO00OO View view) {
        zzf("3002", view);
    }

    public final void setClickConfirmingView(@o0OO00OO View view) {
        zzbeb zzbebVar = this.zzb;
        if (zzbebVar != null) {
            try {
                zzbebVar.zzbt(ObjectWrapper.wrap(view));
            } catch (RemoteException e) {
                zzbza.zzh("Unable to call setClickConfirmingView on delegate", e);
            }
        }
    }

    public final void setHeadlineView(@o0OO00OO View view) {
        zzf("3001", view);
    }

    public final void setIconView(@o0OO00OO View view) {
        zzf("3003", view);
    }

    public final void setImageView(@o0OO00OO View view) {
        zzf("3008", view);
    }

    public final void setMediaView(@o0OO00OO MediaView mediaView) {
        zzf("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.zza(new zzb(this));
        mediaView.zzb(new zzc(this));
    }

    public final void setPriceView(@o0OO00OO View view) {
        zzf("3007", view);
    }

    public final void setStarRatingView(@o0OO00OO View view) {
        zzf("3009", view);
    }

    public final void setStoreView(@o0OO00OO View view) {
        zzf("3006", view);
    }

    @o0OO00OO
    public final View zza(@oo0oO0 String str) {
        zzbeb zzbebVar = this.zzb;
        if (zzbebVar != null) {
            try {
                IObjectWrapper zzb = zzbebVar.zzb(str);
                if (zzb != null) {
                    return (View) ObjectWrapper.unwrap(zzb);
                }
            } catch (RemoteException e) {
                zzbza.zzh("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    public final /* synthetic */ void zzb(MediaContent mediaContent) {
        zzbeb zzbebVar = this.zzb;
        if (zzbebVar == null) {
            return;
        }
        try {
            if (mediaContent instanceof zzep) {
                zzbebVar.zzbu(((zzep) mediaContent).zzb());
            } else if (mediaContent == null) {
                zzbebVar.zzbu(null);
            } else {
                zzbza.zze("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e) {
            zzbza.zzh("Unable to call setMediaContent on delegate", e);
        }
    }

    public final /* synthetic */ void zzc(ImageView.ScaleType scaleType) {
        zzbeb zzbebVar = this.zzb;
        if (zzbebVar == null || scaleType == null) {
            return;
        }
        try {
            zzbebVar.zzbv(ObjectWrapper.wrap(scaleType));
        } catch (RemoteException e) {
            zzbza.zzh("Unable to call setMediaViewImageScaleType on delegate", e);
        }
    }
}
