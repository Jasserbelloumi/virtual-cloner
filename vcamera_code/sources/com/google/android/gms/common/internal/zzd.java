package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import o00oOooO.o0O000o0;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzd extends zzab {
    @o0OO00OO
    private BaseGmsClient zza;
    private final int zzb;

    public zzd(@oo0oO0 BaseGmsClient baseGmsClient, int i) {
        this.zza = baseGmsClient;
        this.zzb = i;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @o0O000o0
    public final void onPostInitComplete(int i, @oo0oO0 IBinder iBinder, @o0OO00OO Bundle bundle) {
        Preconditions.checkNotNull(this.zza, "onPostInitComplete can be called only once per call to getRemoteService");
        this.zza.onPostInitHandler(i, iBinder, bundle, this.zzb);
        this.zza = null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @o0O000o0
    public final void zzb(int i, @o0OO00OO Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @o0O000o0
    public final void zzc(int i, @oo0oO0 IBinder iBinder, @oo0oO0 zzj zzjVar) {
        BaseGmsClient baseGmsClient = this.zza;
        Preconditions.checkNotNull(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Preconditions.checkNotNull(zzjVar);
        BaseGmsClient.zzj(baseGmsClient, zzjVar);
        onPostInitComplete(i, iBinder, zzjVar.zza);
    }
}
