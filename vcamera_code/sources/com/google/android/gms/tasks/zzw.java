package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzw<TResult> extends Task<TResult> {
    private final Object zza = new Object();
    private final zzr zzb = new zzr();
    @GuardedBy("mLock")
    private boolean zzc;
    private volatile boolean zzd;
    @GuardedBy("mLock")
    @o0OO00OO
    private Object zze;
    @GuardedBy("mLock")
    private Exception zzf;

    @GuardedBy("mLock")
    private final void zzf() {
        Preconditions.checkState(this.zzc, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    private final void zzg() {
        if (this.zzd) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    @GuardedBy("mLock")
    private final void zzh() {
        if (this.zzc) {
            throw DuplicateTaskCompletionException.of(this);
        }
    }

    private final void zzi() {
        synchronized (this.zza) {
            if (this.zzc) {
                this.zzb.zzb(this);
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    @oo0oO0
    public final Task<TResult> addOnCanceledListener(@oo0oO0 Activity activity, @oo0oO0 OnCanceledListener onCanceledListener) {
        zzh zzhVar = new zzh(TaskExecutors.MAIN_THREAD, onCanceledListener);
        this.zzb.zza(zzhVar);
        zzv.zza(activity).zzb(zzhVar);
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @oo0oO0
    public final Task<TResult> addOnCanceledListener(@oo0oO0 OnCanceledListener onCanceledListener) {
        addOnCanceledListener(TaskExecutors.MAIN_THREAD, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @oo0oO0
    public final Task<TResult> addOnCanceledListener(@oo0oO0 Executor executor, @oo0oO0 OnCanceledListener onCanceledListener) {
        this.zzb.zza(new zzh(executor, onCanceledListener));
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @oo0oO0
    public final Task<TResult> addOnCompleteListener(@oo0oO0 Activity activity, @oo0oO0 OnCompleteListener<TResult> onCompleteListener) {
        zzj zzjVar = new zzj(TaskExecutors.MAIN_THREAD, onCompleteListener);
        this.zzb.zza(zzjVar);
        zzv.zza(activity).zzb(zzjVar);
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @oo0oO0
    public final Task<TResult> addOnCompleteListener(@oo0oO0 OnCompleteListener<TResult> onCompleteListener) {
        this.zzb.zza(new zzj(TaskExecutors.MAIN_THREAD, onCompleteListener));
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @oo0oO0
    public final Task<TResult> addOnCompleteListener(@oo0oO0 Executor executor, @oo0oO0 OnCompleteListener<TResult> onCompleteListener) {
        this.zzb.zza(new zzj(executor, onCompleteListener));
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @oo0oO0
    public final Task<TResult> addOnFailureListener(@oo0oO0 Activity activity, @oo0oO0 OnFailureListener onFailureListener) {
        zzl zzlVar = new zzl(TaskExecutors.MAIN_THREAD, onFailureListener);
        this.zzb.zza(zzlVar);
        zzv.zza(activity).zzb(zzlVar);
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @oo0oO0
    public final Task<TResult> addOnFailureListener(@oo0oO0 OnFailureListener onFailureListener) {
        addOnFailureListener(TaskExecutors.MAIN_THREAD, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @oo0oO0
    public final Task<TResult> addOnFailureListener(@oo0oO0 Executor executor, @oo0oO0 OnFailureListener onFailureListener) {
        this.zzb.zza(new zzl(executor, onFailureListener));
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @oo0oO0
    public final Task<TResult> addOnSuccessListener(@oo0oO0 Activity activity, @oo0oO0 OnSuccessListener<? super TResult> onSuccessListener) {
        zzn zznVar = new zzn(TaskExecutors.MAIN_THREAD, onSuccessListener);
        this.zzb.zza(zznVar);
        zzv.zza(activity).zzb(zznVar);
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @oo0oO0
    public final Task<TResult> addOnSuccessListener(@oo0oO0 OnSuccessListener<? super TResult> onSuccessListener) {
        addOnSuccessListener(TaskExecutors.MAIN_THREAD, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @oo0oO0
    public final Task<TResult> addOnSuccessListener(@oo0oO0 Executor executor, @oo0oO0 OnSuccessListener<? super TResult> onSuccessListener) {
        this.zzb.zza(new zzn(executor, onSuccessListener));
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @oo0oO0
    public final <TContinuationResult> Task<TContinuationResult> continueWith(@oo0oO0 Continuation<TResult, TContinuationResult> continuation) {
        return continueWith(TaskExecutors.MAIN_THREAD, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    @oo0oO0
    public final <TContinuationResult> Task<TContinuationResult> continueWith(@oo0oO0 Executor executor, @oo0oO0 Continuation<TResult, TContinuationResult> continuation) {
        zzw zzwVar = new zzw();
        this.zzb.zza(new zzd(executor, continuation, zzwVar));
        zzi();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    @oo0oO0
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(@oo0oO0 Continuation<TResult, Task<TContinuationResult>> continuation) {
        return continueWithTask(TaskExecutors.MAIN_THREAD, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    @oo0oO0
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(@oo0oO0 Executor executor, @oo0oO0 Continuation<TResult, Task<TContinuationResult>> continuation) {
        zzw zzwVar = new zzw();
        this.zzb.zza(new zzf(executor, continuation, zzwVar));
        zzi();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    @o0OO00OO
    public final Exception getException() {
        Exception exc;
        synchronized (this.zza) {
            exc = this.zzf;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final TResult getResult() {
        TResult tresult;
        synchronized (this.zza) {
            zzf();
            zzg();
            Exception exc = this.zzf;
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            tresult = (TResult) this.zze;
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <X extends Throwable> TResult getResult(@oo0oO0 Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.zza) {
            zzf();
            zzg();
            if (cls.isInstance(this.zzf)) {
                throw cls.cast(this.zzf);
            }
            Exception exc = this.zzf;
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            tresult = (TResult) this.zze;
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        return this.zzd;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        boolean z;
        synchronized (this.zza) {
            z = this.zzc;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z;
        synchronized (this.zza) {
            z = false;
            if (this.zzc && !this.zzd && this.zzf == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    @oo0oO0
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(@oo0oO0 SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        Executor executor = TaskExecutors.MAIN_THREAD;
        zzw zzwVar = new zzw();
        this.zzb.zza(new zzp(executor, successContinuation, zzwVar));
        zzi();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    @oo0oO0
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        zzw zzwVar = new zzw();
        this.zzb.zza(new zzp(executor, successContinuation, zzwVar));
        zzi();
        return zzwVar;
    }

    public final void zza(@oo0oO0 Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.zza) {
            zzh();
            this.zzc = true;
            this.zzf = exc;
        }
        this.zzb.zzb(this);
    }

    public final void zzb(@o0OO00OO Object obj) {
        synchronized (this.zza) {
            zzh();
            this.zzc = true;
            this.zze = obj;
        }
        this.zzb.zzb(this);
    }

    public final boolean zzc() {
        synchronized (this.zza) {
            if (this.zzc) {
                return false;
            }
            this.zzc = true;
            this.zzd = true;
            this.zzb.zzb(this);
            return true;
        }
    }

    public final boolean zzd(@oo0oO0 Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.zza) {
            if (this.zzc) {
                return false;
            }
            this.zzc = true;
            this.zzf = exc;
            this.zzb.zzb(this);
            return true;
        }
    }

    public final boolean zze(@o0OO00OO Object obj) {
        synchronized (this.zza) {
            if (this.zzc) {
                return false;
            }
            this.zzc = true;
            this.zze = obj;
            this.zzb.zzb(this);
            return true;
        }
    }
}
