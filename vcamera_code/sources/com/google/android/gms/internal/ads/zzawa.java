package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;
import javax.annotation.concurrent.GuardedBy;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzawa {
    @GuardedBy("lock")
    @o0OO00OO
    private zzavp zza;
    @GuardedBy("lock")
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    public zzawa(Context context) {
        this.zzc = context;
    }

    public static /* bridge */ /* synthetic */ void zze(zzawa zzawaVar) {
        synchronized (zzawaVar.zzd) {
            zzavp zzavpVar = zzawaVar.zza;
            if (zzavpVar == null) {
                return;
            }
            zzavpVar.disconnect();
            zzawaVar.zza = null;
            Binder.flushPendingCommands();
        }
    }

    public final Future zzc(zzavq zzavqVar) {
        zzavu zzavuVar = new zzavu(this);
        zzavy zzavyVar = new zzavy(this, zzavqVar, zzavuVar);
        zzavz zzavzVar = new zzavz(this, zzavuVar);
        synchronized (this.zzd) {
            zzavp zzavpVar = new zzavp(this.zzc, com.google.android.gms.ads.internal.zzt.zzt().zzb(), zzavyVar, zzavzVar);
            this.zza = zzavpVar;
            zzavpVar.checkAvailabilityAndConnect();
        }
        return zzavuVar;
    }
}
