package com.google.firebase.installations;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.AutoValue_InstallationTokenResult;
import o00oOooO.oo0oO0;
@AutoValue
/* loaded from: classes2.dex */
public abstract class InstallationTokenResult {

    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class Builder {
        @oo0oO0
        public abstract InstallationTokenResult build();

        @oo0oO0
        public abstract Builder setToken(@oo0oO0 String str);

        @oo0oO0
        public abstract Builder setTokenCreationTimestamp(long j);

        @oo0oO0
        public abstract Builder setTokenExpirationTimestamp(long j);
    }

    @oo0oO0
    public static Builder builder() {
        return new AutoValue_InstallationTokenResult.Builder();
    }

    @oo0oO0
    public abstract String getToken();

    @oo0oO0
    public abstract long getTokenCreationTimestamp();

    @oo0oO0
    public abstract long getTokenExpirationTimestamp();

    @oo0oO0
    public abstract Builder toBuilder();
}
