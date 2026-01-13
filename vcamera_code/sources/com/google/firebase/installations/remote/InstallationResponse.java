package com.google.firebase.installations.remote;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.remote.AutoValue_InstallationResponse;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@AutoValue
/* loaded from: classes2.dex */
public abstract class InstallationResponse {

    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class Builder {
        @oo0oO0
        public abstract InstallationResponse build();

        @oo0oO0
        public abstract Builder setAuthToken(@oo0oO0 TokenResult tokenResult);

        @oo0oO0
        public abstract Builder setFid(@oo0oO0 String str);

        @oo0oO0
        public abstract Builder setRefreshToken(@oo0oO0 String str);

        @oo0oO0
        public abstract Builder setResponseCode(@oo0oO0 ResponseCode responseCode);

        @oo0oO0
        public abstract Builder setUri(@oo0oO0 String str);
    }

    /* loaded from: classes2.dex */
    public enum ResponseCode {
        OK,
        BAD_CONFIG
    }

    @oo0oO0
    public static Builder builder() {
        return new AutoValue_InstallationResponse.Builder();
    }

    @o0OO00OO
    public abstract TokenResult getAuthToken();

    @o0OO00OO
    public abstract String getFid();

    @o0OO00OO
    public abstract String getRefreshToken();

    @o0OO00OO
    public abstract ResponseCode getResponseCode();

    @o0OO00OO
    public abstract String getUri();

    @oo0oO0
    public abstract Builder toBuilder();
}
