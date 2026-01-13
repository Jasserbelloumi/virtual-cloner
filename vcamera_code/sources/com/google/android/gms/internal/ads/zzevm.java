package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzevm implements zzfnj {
    public final /* synthetic */ zzevp zza;

    public zzevm(zzevp zzevpVar) {
        this.zza = zzevpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnj
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzevo zzevoVar;
        zzbtn zzbtnVar = (zzbtn) obj;
        this.zza.zzd = new zzevo(zzbtnVar, new zzfav(zzbtnVar.zzj), null);
        zzevoVar = this.zza.zzd;
        return zzevoVar;
    }
}
