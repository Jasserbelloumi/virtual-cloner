package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.zacp;
import o00oOooO.o0OO00OO;
import o00oOooO.oO0Oo;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class ResultTransform<R extends Result, S extends Result> {
    @oo0oO0
    public final PendingResult<S> createFailedResult(@oo0oO0 Status status) {
        return new zacp(status);
    }

    @oo0oO0
    public Status onFailure(@oo0oO0 Status status) {
        return status;
    }

    @o0OO00OO
    @oO0Oo
    public abstract PendingResult<S> onSuccess(@oo0oO0 R r);
}
