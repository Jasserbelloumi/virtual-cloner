package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.ads.zzbbq;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.gms.internal.ads.zzgxm;
import o00oo0O.o00oOo0O;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzn implements zzbbq {
    public final /* synthetic */ zzbbs zza;
    public final /* synthetic */ Context zzb;
    public final /* synthetic */ Uri zzc;

    public zzn(zzs zzsVar, zzbbs zzbbsVar, Context context, Uri uri) {
        this.zza = zzbbsVar;
        this.zzb = context;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zza() {
        o00oOo0O o00oOooO2 = new o00oOo0O.o00oOOo0(this.zza.zza()).o00oOooO();
        o00oOooO2.f7356o00oOOo0.setPackage(zzgxm.zza(this.zzb));
        o00oOooO2.o00oOo00(this.zzb, this.zzc);
        this.zza.zzf((Activity) this.zzb);
    }
}
