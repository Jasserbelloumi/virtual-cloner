package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
import o00oOooO.oo0oO0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfm extends FutureTask implements Comparable {
    public final boolean zza;
    public final /* synthetic */ zzfo zzb;
    private final long zzc;
    private final String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfm(zzfo zzfoVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.zzb = zzfoVar;
        Preconditions.checkNotNull(str);
        atomicLong = zzfo.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = str;
        this.zza = z;
        if (andIncrement == Long.MAX_VALUE) {
            o00oOOo0.o00oOOo0(zzfoVar.zzt, "Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@oo0oO0 Object obj) {
        zzfm zzfmVar = (zzfm) obj;
        boolean z = this.zza;
        if (z != zzfmVar.zza) {
            return !z ? 1 : -1;
        }
        int i = (this.zzc > zzfmVar.zzc ? 1 : (this.zzc == zzfmVar.zzc ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        this.zzb.zzt.zzay().zzh().zzb("Two tasks share the same index. index", Long.valueOf(this.zzc));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzb.zzt.zzay().zzd().zzb(this.zzd, th);
        if ((th instanceof zzfk) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfm(zzfo zzfoVar, Callable callable, boolean z, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.zzb = zzfoVar;
        Preconditions.checkNotNull("Task exception on worker thread");
        atomicLong = zzfo.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = "Task exception on worker thread";
        this.zza = z;
        if (andIncrement == Long.MAX_VALUE) {
            o00oOOo0.o00oOOo0(zzfoVar.zzt, "Tasks index overflow");
        }
    }
}
