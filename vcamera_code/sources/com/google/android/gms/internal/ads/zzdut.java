package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public abstract class zzdut implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final zzbzs zza = new zzbzs();
    public final Object zzb = new Object();
    public boolean zzc = false;
    public boolean zzd = false;
    public zzbtn zze;
    @o0O0OOOo("lock")
    @o0o0000(otherwise = 3)
    public zzbsn zzf;

    public void onConnectionFailed(@oo0oO0 ConnectionResult connectionResult) {
        zzbza.zze("Disconnected from remote ad request service.");
        this.zza.zze(new zzdvi(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzbza.zze("Cannot connect to remote service, fallback to local instance.");
    }

    public final void zza() {
        synchronized (this.zzb) {
            this.zzd = true;
            if (this.zzf.isConnected() || this.zzf.isConnecting()) {
                this.zzf.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}
