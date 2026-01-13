package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class Response<T extends Result> {
    private Result zza;

    public Response() {
    }

    public Response(@oo0oO0 T t) {
        this.zza = t;
    }

    @oo0oO0
    public T getResult() {
        return (T) this.zza;
    }

    public void setResult(@oo0oO0 T t) {
        this.zza = t;
    }
}
