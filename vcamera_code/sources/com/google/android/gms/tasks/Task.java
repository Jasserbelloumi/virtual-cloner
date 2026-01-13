package com.google.android.gms.tasks;

import android.app.Activity;
import java.util.concurrent.Executor;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public abstract class Task<TResult> {
    @oo0oO0
    public Task<TResult> addOnCanceledListener(@oo0oO0 Activity activity, @oo0oO0 OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @oo0oO0
    public Task<TResult> addOnCanceledListener(@oo0oO0 OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @oo0oO0
    public Task<TResult> addOnCanceledListener(@oo0oO0 Executor executor, @oo0oO0 OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @oo0oO0
    public Task<TResult> addOnCompleteListener(@oo0oO0 Activity activity, @oo0oO0 OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @oo0oO0
    public Task<TResult> addOnCompleteListener(@oo0oO0 OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @oo0oO0
    public Task<TResult> addOnCompleteListener(@oo0oO0 Executor executor, @oo0oO0 OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @oo0oO0
    public abstract Task<TResult> addOnFailureListener(@oo0oO0 Activity activity, @oo0oO0 OnFailureListener onFailureListener);

    @oo0oO0
    public abstract Task<TResult> addOnFailureListener(@oo0oO0 OnFailureListener onFailureListener);

    @oo0oO0
    public abstract Task<TResult> addOnFailureListener(@oo0oO0 Executor executor, @oo0oO0 OnFailureListener onFailureListener);

    @oo0oO0
    public abstract Task<TResult> addOnSuccessListener(@oo0oO0 Activity activity, @oo0oO0 OnSuccessListener<? super TResult> onSuccessListener);

    @oo0oO0
    public abstract Task<TResult> addOnSuccessListener(@oo0oO0 OnSuccessListener<? super TResult> onSuccessListener);

    @oo0oO0
    public abstract Task<TResult> addOnSuccessListener(@oo0oO0 Executor executor, @oo0oO0 OnSuccessListener<? super TResult> onSuccessListener);

    @oo0oO0
    public <TContinuationResult> Task<TContinuationResult> continueWith(@oo0oO0 Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @oo0oO0
    public <TContinuationResult> Task<TContinuationResult> continueWith(@oo0oO0 Executor executor, @oo0oO0 Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @oo0oO0
    public <TContinuationResult> Task<TContinuationResult> continueWithTask(@oo0oO0 Continuation<TResult, Task<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @oo0oO0
    public <TContinuationResult> Task<TContinuationResult> continueWithTask(@oo0oO0 Executor executor, @oo0oO0 Continuation<TResult, Task<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @o0OO00OO
    public abstract Exception getException();

    public abstract TResult getResult();

    public abstract <X extends Throwable> TResult getResult(@oo0oO0 Class<X> cls) throws Throwable;

    public abstract boolean isCanceled();

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();

    @oo0oO0
    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(@oo0oO0 SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @oo0oO0
    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(@oo0oO0 Executor executor, @oo0oO0 SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
