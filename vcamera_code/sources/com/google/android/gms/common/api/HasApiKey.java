package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiKey;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public interface HasApiKey<O extends Api.ApiOptions> {
    @oo0oO0
    @KeepForSdk
    ApiKey<O> getApiKey();
}
