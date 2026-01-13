package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_LogRequest;
import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@AutoValue
/* loaded from: classes.dex */
public abstract class LogRequest {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class Builder {
        @oo0oO0
        public abstract LogRequest build();

        @oo0oO0
        public abstract Builder setClientInfo(@o0OO00OO ClientInfo clientInfo);

        @oo0oO0
        public abstract Builder setLogEvents(@o0OO00OO List<LogEvent> list);

        @oo0oO0
        public abstract Builder setLogSource(@o0OO00OO Integer num);

        @oo0oO0
        public abstract Builder setLogSourceName(@o0OO00OO String str);

        @oo0oO0
        public abstract Builder setQosTier(@o0OO00OO QosTier qosTier);

        @oo0oO0
        public abstract Builder setRequestTimeMs(long j);

        @oo0oO0
        public abstract Builder setRequestUptimeMs(long j);

        @oo0oO0
        public Builder setSource(int i) {
            return setLogSource(Integer.valueOf(i));
        }

        @oo0oO0
        public Builder setSource(@oo0oO0 String str) {
            return setLogSourceName(str);
        }
    }

    @oo0oO0
    public static Builder builder() {
        return new AutoValue_LogRequest.Builder();
    }

    @o0OO00OO
    public abstract ClientInfo getClientInfo();

    @o0OO00OO
    @Encodable.Field(name = "logEvent")
    public abstract List<LogEvent> getLogEvents();

    @o0OO00OO
    public abstract Integer getLogSource();

    @o0OO00OO
    public abstract String getLogSourceName();

    @o0OO00OO
    public abstract QosTier getQosTier();

    public abstract long getRequestTimeMs();

    public abstract long getRequestUptimeMs();
}
