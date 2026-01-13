package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzbza;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class MediaView extends FrameLayout {
    @o0OO00OO
    private MediaContent zza;
    private boolean zzb;
    private ImageView.ScaleType zzc;
    private boolean zzd;
    private zzb zze;
    private zzc zzf;

    public MediaView(@oo0oO0 Context context) {
        super(context);
    }

    public MediaView(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public MediaView(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @o0OO00OO
    public MediaContent getMediaContent() {
        return this.zza;
    }

    public void setImageScaleType(@oo0oO0 ImageView.ScaleType scaleType) {
        this.zzd = true;
        this.zzc = scaleType;
        zzc zzcVar = this.zzf;
        if (zzcVar != null) {
            zzcVar.zza.zzc(scaleType);
        }
    }

    public void setMediaContent(@o0OO00OO MediaContent mediaContent) {
        this.zzb = true;
        this.zza = mediaContent;
        zzb zzbVar = this.zze;
        if (zzbVar != null) {
            zzbVar.zza.zzb(mediaContent);
        }
        if (mediaContent == null) {
            return;
        }
        try {
            zzber zza = mediaContent.zza();
            if (zza == null || zza.zzr(ObjectWrapper.wrap(this))) {
                return;
            }
            removeAllViews();
        } catch (RemoteException e) {
            removeAllViews();
            zzbza.zzh("", e);
        }
    }

    public final synchronized void zza(zzb zzbVar) {
        this.zze = zzbVar;
        if (this.zzb) {
            zzbVar.zza.zzb(this.zza);
        }
    }

    public final synchronized void zzb(zzc zzcVar) {
        this.zzf = zzcVar;
        if (this.zzd) {
            zzcVar.zza.zzc(this.zzc);
        }
    }
}
