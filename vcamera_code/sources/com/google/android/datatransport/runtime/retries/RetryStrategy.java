package com.google.android.datatransport.runtime.retries;

import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public interface RetryStrategy<TInput, TResult> {
    @o0OO00OO
    TInput shouldRetry(TInput tinput, TResult tresult);
}
