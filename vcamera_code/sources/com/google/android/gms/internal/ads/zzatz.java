package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import o00oOooO.o0OO00OO;
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzatz {
    private final Object zza = new Object();
    @GuardedBy("activityTrackerLock")
    private zzatx zzb = null;
    @GuardedBy("activityTrackerLock")
    private boolean zzc = false;

    @o0OO00OO
    public final Activity zza() {
        synchronized (this.zza) {
            zzatx zzatxVar = this.zzb;
            if (zzatxVar != null) {
                return zzatxVar.zza();
            }
            return null;
        }
    }

    @o0OO00OO
    public final Context zzb() {
        synchronized (this.zza) {
            zzatx zzatxVar = this.zzb;
            if (zzatxVar != null) {
                return zzatxVar.zzb();
            }
            return null;
        }
    }

    public final void zzc(zzaty zzatyVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new zzatx();
            }
            this.zzb.zzf(zzatyVar);
        }
    }

    public final void zzd(Context context) {
        synchronized (this.zza) {
            if (!this.zzc) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    zzbza.zzj("Can not cast Context to Application");
                    return;
                }
                if (this.zzb == null) {
                    this.zzb = new zzatx();
                }
                this.zzb.zzg(application, context);
                this.zzc = true;
            }
        }
    }

    public final void zze(zzaty zzatyVar) {
        synchronized (this.zza) {
            zzatx zzatxVar = this.zzb;
            if (zzatxVar == null) {
                return;
            }
            zzatxVar.zzh(zzatyVar);
        }
    }
}
