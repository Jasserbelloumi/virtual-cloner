package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import o00oOooO.oo0oO0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzavl implements BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ zzavm zza;

    public zzavl(zzavm zzavmVar) {
        this.zza = zzavmVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@oo0oO0 ConnectionResult connectionResult) {
        Object obj;
        zzavp zzavpVar;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            zzavm zzavmVar = this.zza;
            zzavpVar = zzavmVar.zzd;
            if (zzavpVar != null) {
                zzavmVar.zzd = null;
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}
