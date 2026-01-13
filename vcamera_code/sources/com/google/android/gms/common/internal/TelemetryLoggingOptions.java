package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public class TelemetryLoggingOptions implements Api.ApiOptions.Optional {
    @oo0oO0
    public static final TelemetryLoggingOptions zaa = builder().build();
    @o0OO00OO
    private final String zab;

    @KeepForSdk
    /* loaded from: classes.dex */
    public static class Builder {
        @o0OO00OO
        private String zaa;

        private Builder() {
        }

        public /* synthetic */ Builder(zaac zaacVar) {
        }

        @oo0oO0
        @KeepForSdk
        public TelemetryLoggingOptions build() {
            return new TelemetryLoggingOptions(this.zaa, null);
        }

        @CanIgnoreReturnValue
        @oo0oO0
        @KeepForSdk
        public Builder setApi(@o0OO00OO String str) {
            this.zaa = str;
            return this;
        }
    }

    public /* synthetic */ TelemetryLoggingOptions(String str, zaad zaadVar) {
        this.zab = str;
    }

    @oo0oO0
    @KeepForSdk
    public static Builder builder() {
        return new Builder(null);
    }

    public final boolean equals(@o0OO00OO Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TelemetryLoggingOptions) {
            return Objects.equal(this.zab, ((TelemetryLoggingOptions) obj).zab);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zab);
    }

    @oo0oO0
    public final Bundle zaa() {
        Bundle bundle = new Bundle();
        String str = this.zab;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }
}
