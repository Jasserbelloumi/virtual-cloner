package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class TransformedResult<R extends Result> {
    public abstract void andFinally(@oo0oO0 ResultCallbacks<? super R> resultCallbacks);

    @oo0oO0
    public abstract <S extends Result> TransformedResult<S> then(@oo0oO0 ResultTransform<? super R, ? extends S> resultTransform);
}
