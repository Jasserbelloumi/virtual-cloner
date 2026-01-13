package com.android.billingclient.api;

import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class AcknowledgePurchaseParams {
    private String zza;

    /* loaded from: classes.dex */
    public static final class Builder {
        private String zza;

        private Builder() {
        }

        public /* synthetic */ Builder(zza zzaVar) {
        }

        @oo0oO0
        public AcknowledgePurchaseParams build() {
            String str = this.zza;
            if (str != null) {
                AcknowledgePurchaseParams acknowledgePurchaseParams = new AcknowledgePurchaseParams(null);
                acknowledgePurchaseParams.zza = str;
                return acknowledgePurchaseParams;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        @oo0oO0
        public Builder setPurchaseToken(@oo0oO0 String str) {
            this.zza = str;
            return this;
        }
    }

    private AcknowledgePurchaseParams() {
    }

    public /* synthetic */ AcknowledgePurchaseParams(zzb zzbVar) {
    }

    @oo0oO0
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @oo0oO0
    public String getPurchaseToken() {
        return this.zza;
    }
}
