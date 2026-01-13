package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcrr implements zzfuf {
    public final /* synthetic */ zzcrt zza;

    public zzcrr(zzcrt zzcrtVar) {
        this.zza = zzcrtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzczt zzcztVar;
        zzcztVar = this.zza.zzf;
        zzcztVar.zzk(false);
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzczt zzcztVar;
        zzbtn zzbtnVar = (zzbtn) obj;
        zzcztVar = this.zza.zzf;
        zzcztVar.zzk(true);
    }
}
