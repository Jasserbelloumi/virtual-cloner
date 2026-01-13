package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class OptionalPendingResult<R extends Result> extends PendingResult<R> {
    @oo0oO0
    public abstract R get();

    public abstract boolean isDone();
}
