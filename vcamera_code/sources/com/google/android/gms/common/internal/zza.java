package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import o00oOooO.o0O000o0;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
abstract class zza extends zzc {
    public final int zza;
    @o0OO00OO
    public final Bundle zzb;
    public final /* synthetic */ BaseGmsClient zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @o0O000o0
    public zza(BaseGmsClient baseGmsClient, @o0OO00OO int i, Bundle bundle) {
        super(baseGmsClient, Boolean.TRUE);
        this.zzc = baseGmsClient;
        this.zza = i;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.common.internal.zzc
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ConnectionResult connectionResult;
        if (this.zza != 0) {
            this.zzc.zzp(1, null);
            Bundle bundle = this.zzb;
            connectionResult = new ConnectionResult(this.zza, bundle != null ? (PendingIntent) bundle.getParcelable(BaseGmsClient.KEY_PENDING_INTENT) : null);
        } else if (zzd()) {
            return;
        } else {
            this.zzc.zzp(1, null);
            connectionResult = new ConnectionResult(8, null);
        }
        zzb(connectionResult);
    }

    public abstract void zzb(ConnectionResult connectionResult);

    @Override // com.google.android.gms.common.internal.zzc
    public final void zzc() {
    }

    public abstract boolean zzd();
}
