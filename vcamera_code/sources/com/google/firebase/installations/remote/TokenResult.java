package com.google.firebase.installations.remote;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.remote.AutoValue_TokenResult;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@AutoValue
/* loaded from: classes2.dex */
public abstract class TokenResult {

    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class Builder {
        @oo0oO0
        public abstract TokenResult build();

        @oo0oO0
        public abstract Builder setResponseCode(@oo0oO0 ResponseCode responseCode);

        @oo0oO0
        public abstract Builder setToken(@oo0oO0 String str);

        @oo0oO0
        public abstract Builder setTokenExpirationTimestamp(long j);
    }

    /* loaded from: classes2.dex */
    public enum ResponseCode {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @oo0oO0
    public static Builder builder() {
        return new AutoValue_TokenResult.Builder().setTokenExpirationTimestamp(0L);
    }

    @o0OO00OO
    public abstract ResponseCode getResponseCode();

    @o0OO00OO
    public abstract String getToken();

    @oo0oO0
    public abstract long getTokenExpirationTimestamp();

    @oo0oO0
    public abstract Builder toBuilder();
}
