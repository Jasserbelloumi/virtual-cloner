package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import o00oOooO.oo0oO0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzavz implements BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ zzbzs zza;
    public final /* synthetic */ zzawa zzb;

    public zzavz(zzawa zzawaVar, zzbzs zzbzsVar) {
        this.zzb = zzawaVar;
        this.zza = zzbzsVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@oo0oO0 ConnectionResult connectionResult) {
        Object obj;
        obj = this.zzb.zzd;
        synchronized (obj) {
            this.zza.zze(new RuntimeException("Connection failed."));
        }
    }
}
