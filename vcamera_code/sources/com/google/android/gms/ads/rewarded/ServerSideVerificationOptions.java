package com.google.android.gms.ads.rewarded;

import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class ServerSideVerificationOptions {
    private final String zza;
    private final String zzb;

    /* loaded from: classes.dex */
    public static final class Builder {
        private String zza = "";
        private String zzb = "";

        @oo0oO0
        public ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this, null);
        }

        @oo0oO0
        public Builder setCustomData(@oo0oO0 String str) {
            this.zzb = str;
            return this;
        }

        @oo0oO0
        public Builder setUserId(@oo0oO0 String str) {
            this.zza = str;
            return this;
        }
    }

    public /* synthetic */ ServerSideVerificationOptions(Builder builder, zzd zzdVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
    }

    @oo0oO0
    public String getCustomData() {
        return this.zzb;
    }

    @oo0oO0
    public String getUserId() {
        return this.zza;
    }
}
