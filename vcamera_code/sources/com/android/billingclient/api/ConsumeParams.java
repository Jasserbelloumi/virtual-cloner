package com.android.billingclient.api;

import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class ConsumeParams {
    private String zza;

    /* loaded from: classes.dex */
    public static final class Builder {
        private String zza;

        private Builder() {
        }

        public /* synthetic */ Builder(zzau zzauVar) {
        }

        @oo0oO0
        public ConsumeParams build() {
            String str = this.zza;
            if (str != null) {
                ConsumeParams consumeParams = new ConsumeParams(null);
                consumeParams.zza = str;
                return consumeParams;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        @oo0oO0
        public Builder setPurchaseToken(@oo0oO0 String str) {
            this.zza = str;
            return this;
        }
    }

    private ConsumeParams() {
    }

    public /* synthetic */ ConsumeParams(zzav zzavVar) {
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
