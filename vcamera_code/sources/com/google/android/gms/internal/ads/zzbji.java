package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
import o00oOooO.o0OO00OO;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbji implements BaseGmsClient.BaseConnectionCallbacks {
    public final /* synthetic */ zzbzs zza;
    public final /* synthetic */ zzbjk zzb;

    public zzbji(zzbjk zzbjkVar, zzbzs zzbzsVar) {
        this.zzb = zzbjkVar;
        this.zza = zzbzsVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@o0OO00OO Bundle bundle) {
        zzbix zzbixVar;
        try {
            zzbzs zzbzsVar = this.zza;
            zzbixVar = this.zzb.zza;
            zzbzsVar.zzd(zzbixVar.zzp());
        } catch (DeadObjectException e) {
            this.zza.zze(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zza.zze(new RuntimeException(android.support.v4.media.o00oOOo0.o00oOOo0("onConnectionSuspended: ", i)));
    }
}
