package com.google.android.datatransport.cct.internal;

import android.support.v4.media.o00oOo0O;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
final class AutoValue_NetworkConnectionInfo extends NetworkConnectionInfo {
    private final NetworkConnectionInfo.MobileSubtype mobileSubtype;
    private final NetworkConnectionInfo.NetworkType networkType;

    /* loaded from: classes.dex */
    public static final class Builder extends NetworkConnectionInfo.Builder {
        private NetworkConnectionInfo.MobileSubtype mobileSubtype;
        private NetworkConnectionInfo.NetworkType networkType;

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public NetworkConnectionInfo build() {
            return new AutoValue_NetworkConnectionInfo(this.networkType, this.mobileSubtype);
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public NetworkConnectionInfo.Builder setMobileSubtype(@o0OO00OO NetworkConnectionInfo.MobileSubtype mobileSubtype) {
            this.mobileSubtype = mobileSubtype;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public NetworkConnectionInfo.Builder setNetworkType(@o0OO00OO NetworkConnectionInfo.NetworkType networkType) {
            this.networkType = networkType;
            return this;
        }
    }

    private AutoValue_NetworkConnectionInfo(@o0OO00OO NetworkConnectionInfo.NetworkType networkType, @o0OO00OO NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.networkType = networkType;
        this.mobileSubtype = mobileSubtype;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NetworkConnectionInfo) {
            NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
            NetworkConnectionInfo.NetworkType networkType = this.networkType;
            if (networkType != null ? networkType.equals(networkConnectionInfo.getNetworkType()) : networkConnectionInfo.getNetworkType() == null) {
                NetworkConnectionInfo.MobileSubtype mobileSubtype = this.mobileSubtype;
                NetworkConnectionInfo.MobileSubtype mobileSubtype2 = networkConnectionInfo.getMobileSubtype();
                if (mobileSubtype == null) {
                    if (mobileSubtype2 == null) {
                        return true;
                    }
                } else if (mobileSubtype.equals(mobileSubtype2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    @o0OO00OO
    public NetworkConnectionInfo.MobileSubtype getMobileSubtype() {
        return this.mobileSubtype;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    @o0OO00OO
    public NetworkConnectionInfo.NetworkType getNetworkType() {
        return this.networkType;
    }

    public int hashCode() {
        NetworkConnectionInfo.NetworkType networkType = this.networkType;
        int hashCode = ((networkType == null ? 0 : networkType.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.mobileSubtype;
        return hashCode ^ (mobileSubtype != null ? mobileSubtype.hashCode() : 0);
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("NetworkConnectionInfo{networkType=");
        o00oOOo02.append(this.networkType);
        o00oOOo02.append(", mobileSubtype=");
        o00oOOo02.append(this.mobileSubtype);
        o00oOOo02.append("}");
        return o00oOOo02.toString();
    }
}
