package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzbgc {
    private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zza;
    @o0OO00OO
    private final NativeCustomTemplateAd.OnCustomClickListener zzb;
    @o0O0OOOo("this")
    @o0OO00OO
    private NativeCustomTemplateAd zzc;

    public zzbgc(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, @o0OO00OO NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomTemplateAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    public final synchronized NativeCustomTemplateAd zzf(zzber zzberVar) {
        NativeCustomTemplateAd nativeCustomTemplateAd = this.zzc;
        if (nativeCustomTemplateAd != null) {
            return nativeCustomTemplateAd;
        }
        zzbes zzbesVar = new zzbes(zzberVar);
        this.zzc = zzbesVar;
        return zzbesVar;
    }

    @o0OO00OO
    public final zzbfb zzd() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbfz(this, null);
    }

    public final zzbfe zze() {
        return new zzbgb(this, null);
    }
}
