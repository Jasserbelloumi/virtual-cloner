package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public final class ApiKey<O extends Api.ApiOptions> {
    private final int zaa;
    private final Api zab;
    @o0OO00OO
    private final Api.ApiOptions zac;
    @o0OO00OO
    private final String zad;

    private ApiKey(Api api, @o0OO00OO Api.ApiOptions apiOptions, @o0OO00OO String str) {
        this.zab = api;
        this.zac = apiOptions;
        this.zad = str;
        this.zaa = Objects.hashCode(api, apiOptions, str);
    }

    @oo0oO0
    @KeepForSdk
    public static <O extends Api.ApiOptions> ApiKey<O> getSharedApiKey(@oo0oO0 Api<O> api, @o0OO00OO O o, @o0OO00OO String str) {
        return new ApiKey<>(api, o, str);
    }

    public final boolean equals(@o0OO00OO Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof ApiKey) {
            ApiKey apiKey = (ApiKey) obj;
            return Objects.equal(this.zab, apiKey.zab) && Objects.equal(this.zac, apiKey.zac) && Objects.equal(this.zad, apiKey.zad);
        }
        return false;
    }

    public final int hashCode() {
        return this.zaa;
    }

    @oo0oO0
    public final String zaa() {
        return this.zab.zad();
    }
}
