package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzbqp {
    private final NativeCustomFormatAd.OnCustomFormatAdLoadedListener zza;
    @o0OO00OO
    private final NativeCustomFormatAd.OnCustomClickListener zzb;
    @o0O0OOOo("this")
    @o0OO00OO
    private NativeCustomFormatAd zzc;

    public zzbqp(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, @o0OO00OO NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomFormatAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    public final synchronized NativeCustomFormatAd zzf(zzber zzberVar) {
        NativeCustomFormatAd nativeCustomFormatAd = this.zzc;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        zzbqq zzbqqVar = new zzbqq(zzberVar);
        this.zzc = zzbqqVar;
        return zzbqqVar;
    }

    @o0OO00OO
    public final zzbfb zza() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbqm(this, null);
    }

    public final zzbfe zzb() {
        return new zzbqo(this, null);
    }
}
