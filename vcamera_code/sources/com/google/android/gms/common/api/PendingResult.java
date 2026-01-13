package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import java.util.concurrent.TimeUnit;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class PendingResult<R extends Result> {

    @KeepForSdk
    /* loaded from: classes.dex */
    public interface StatusListener {
        @KeepForSdk
        void onComplete(@oo0oO0 Status status);
    }

    @KeepForSdk
    public void addStatusListener(@oo0oO0 StatusListener statusListener) {
        throw new UnsupportedOperationException();
    }

    @oo0oO0
    public abstract R await();

    @oo0oO0
    public abstract R await(long j, @oo0oO0 TimeUnit timeUnit);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(@oo0oO0 ResultCallback<? super R> resultCallback);

    public abstract void setResultCallback(@oo0oO0 ResultCallback<? super R> resultCallback, long j, @oo0oO0 TimeUnit timeUnit);

    @oo0oO0
    public <S extends Result> TransformedResult<S> then(@oo0oO0 ResultTransform<? super R, ? extends S> resultTransform) {
        throw new UnsupportedOperationException();
    }
}
