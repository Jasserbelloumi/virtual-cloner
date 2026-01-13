package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzavu extends zzbzs {
    public final /* synthetic */ zzawa zza;

    public zzavu(zzawa zzawaVar) {
        this.zza = zzawaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzs, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        zzawa.zze(this.zza);
        return super.cancel(z);
    }
}
