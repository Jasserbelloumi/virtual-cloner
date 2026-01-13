package com.google.android.gms.internal.ads;

import androidx.fragment.app.o0O00;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzftf extends zzftz implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    @CheckForNull
    public zzfut zza;
    @CheckForNull
    public Object zzb;

    public zzftf(zzfut zzfutVar, Object obj) {
        zzfutVar.getClass();
        this.zza = zzfutVar;
        obj.getClass();
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfut zzfutVar = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (zzfutVar == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (zzfutVar.isCancelled()) {
            zzt(zzfutVar);
            return;
        }
        try {
            try {
                Object zzf = zzf(obj, zzfuj.zzo(zzfutVar));
                this.zzb = null;
                zzg(zzf);
            } catch (Throwable th) {
                try {
                    zzfvb.zza(th);
                    zze(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e) {
            zze(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            zze(e2);
        } catch (ExecutionException e3) {
            zze(e3.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    @CheckForNull
    public final String zza() {
        zzfut zzfutVar = this.zza;
        Object obj = this.zzb;
        String zza = super.zza();
        String o00oOOo02 = zzfutVar != null ? android.support.v4.media.o00oOoO.o00oOOo0("inputFuture=[", zzfutVar.toString(), "], ") : "";
        if (obj != null) {
            return o0O00.o00oOOo0(o00oOOo02, "function=[", obj.toString(), "]");
        }
        if (zza != null) {
            return o00oOOo02.concat(zza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    public final void zzb() {
        zzs(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    public abstract Object zzf(Object obj, Object obj2) throws Exception;

    public abstract void zzg(Object obj);
}
