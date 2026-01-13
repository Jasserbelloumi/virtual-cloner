package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcrs implements zzfuf {
    public final /* synthetic */ zzcrt zza;

    public zzcrs(zzcrt zzcrtVar) {
        this.zza = zzcrtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzczt zzcztVar;
        zzcztVar = this.zza.zzf;
        zzcztVar.zzh(false);
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzczt zzcztVar;
        Void r2 = (Void) obj;
        zzcztVar = this.zza.zzf;
        zzcztVar.zzh(true);
    }
}
