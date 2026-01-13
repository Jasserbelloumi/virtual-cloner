package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_ClientInfo;
import com.google.auto.value.AutoValue;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@AutoValue
/* loaded from: classes.dex */
public abstract class ClientInfo {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class Builder {
        @oo0oO0
        public abstract ClientInfo build();

        @oo0oO0
        public abstract Builder setAndroidClientInfo(@o0OO00OO AndroidClientInfo androidClientInfo);

        @oo0oO0
        public abstract Builder setClientType(@o0OO00OO ClientType clientType);
    }

    /* loaded from: classes.dex */
    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        private final int value;

        ClientType(int i) {
            this.value = i;
        }
    }

    @oo0oO0
    public static Builder builder() {
        return new AutoValue_ClientInfo.Builder();
    }

    @o0OO00OO
    public abstract AndroidClientInfo getAndroidClientInfo();

    @o0OO00OO
    public abstract ClientType getClientType();
}
