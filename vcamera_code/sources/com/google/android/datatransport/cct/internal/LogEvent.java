package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_LogEvent;
import com.google.auto.value.AutoValue;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@AutoValue
/* loaded from: classes.dex */
public abstract class LogEvent {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class Builder {
        @oo0oO0
        public abstract LogEvent build();

        @oo0oO0
        public abstract Builder setEventCode(@o0OO00OO Integer num);

        @oo0oO0
        public abstract Builder setEventTimeMs(long j);

        @oo0oO0
        public abstract Builder setEventUptimeMs(long j);

        @oo0oO0
        public abstract Builder setNetworkConnectionInfo(@o0OO00OO NetworkConnectionInfo networkConnectionInfo);

        @oo0oO0
        public abstract Builder setSourceExtension(@o0OO00OO byte[] bArr);

        @oo0oO0
        public abstract Builder setSourceExtensionJsonProto3(@o0OO00OO String str);

        @oo0oO0
        public abstract Builder setTimezoneOffsetSeconds(long j);
    }

    private static Builder builder() {
        return new AutoValue_LogEvent.Builder();
    }

    @oo0oO0
    public static Builder jsonBuilder(@oo0oO0 String str) {
        return builder().setSourceExtensionJsonProto3(str);
    }

    @oo0oO0
    public static Builder protoBuilder(@oo0oO0 byte[] bArr) {
        return builder().setSourceExtension(bArr);
    }

    @o0OO00OO
    public abstract Integer getEventCode();

    public abstract long getEventTimeMs();

    public abstract long getEventUptimeMs();

    @o0OO00OO
    public abstract NetworkConnectionInfo getNetworkConnectionInfo();

    @o0OO00OO
    public abstract byte[] getSourceExtension();

    @o0OO00OO
    public abstract String getSourceExtensionJsonProto3();

    public abstract long getTimezoneOffsetSeconds();
}
