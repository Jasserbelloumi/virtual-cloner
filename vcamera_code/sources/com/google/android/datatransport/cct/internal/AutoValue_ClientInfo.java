package com.google.android.datatransport.cct.internal;

import android.support.v4.media.o00oOo0O;
import com.google.android.datatransport.cct.internal.ClientInfo;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
final class AutoValue_ClientInfo extends ClientInfo {
    private final AndroidClientInfo androidClientInfo;
    private final ClientInfo.ClientType clientType;

    /* loaded from: classes.dex */
    public static final class Builder extends ClientInfo.Builder {
        private AndroidClientInfo androidClientInfo;
        private ClientInfo.ClientType clientType;

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public ClientInfo build() {
            return new AutoValue_ClientInfo(this.clientType, this.androidClientInfo);
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public ClientInfo.Builder setAndroidClientInfo(@o0OO00OO AndroidClientInfo androidClientInfo) {
            this.androidClientInfo = androidClientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public ClientInfo.Builder setClientType(@o0OO00OO ClientInfo.ClientType clientType) {
            this.clientType = clientType;
            return this;
        }
    }

    private AutoValue_ClientInfo(@o0OO00OO ClientInfo.ClientType clientType, @o0OO00OO AndroidClientInfo androidClientInfo) {
        this.clientType = clientType;
        this.androidClientInfo = androidClientInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ClientInfo) {
            ClientInfo clientInfo = (ClientInfo) obj;
            ClientInfo.ClientType clientType = this.clientType;
            if (clientType != null ? clientType.equals(clientInfo.getClientType()) : clientInfo.getClientType() == null) {
                AndroidClientInfo androidClientInfo = this.androidClientInfo;
                AndroidClientInfo androidClientInfo2 = clientInfo.getAndroidClientInfo();
                if (androidClientInfo == null) {
                    if (androidClientInfo2 == null) {
                        return true;
                    }
                } else if (androidClientInfo.equals(androidClientInfo2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @o0OO00OO
    public AndroidClientInfo getAndroidClientInfo() {
        return this.androidClientInfo;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @o0OO00OO
    public ClientInfo.ClientType getClientType() {
        return this.clientType;
    }

    public int hashCode() {
        ClientInfo.ClientType clientType = this.clientType;
        int hashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        AndroidClientInfo androidClientInfo = this.androidClientInfo;
        return hashCode ^ (androidClientInfo != null ? androidClientInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("ClientInfo{clientType=");
        o00oOOo02.append(this.clientType);
        o00oOOo02.append(", androidClientInfo=");
        o00oOOo02.append(this.androidClientInfo);
        o00oOOo02.append("}");
        return o00oOOo02.toString();
    }
}
