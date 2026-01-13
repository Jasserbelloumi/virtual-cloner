package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final Feature zza;

    @KeepForSdk
    public UnsupportedApiCallException(@oo0oO0 Feature feature) {
        this.zza = feature;
    }

    @Override // java.lang.Throwable
    @oo0oO0
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.zza));
    }
}
