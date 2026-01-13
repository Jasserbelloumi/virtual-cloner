package com.android.billingclient.api;

import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class QueryPurchasesParams {
    private final String zza;

    /* loaded from: classes.dex */
    public static class Builder {
        private String zza;

        private Builder() {
        }

        public /* synthetic */ Builder(zzbs zzbsVar) {
        }

        @oo0oO0
        public QueryPurchasesParams build() {
            if (this.zza != null) {
                return new QueryPurchasesParams(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        @oo0oO0
        public Builder setProductType(@oo0oO0 String str) {
            this.zza = str;
            return this;
        }
    }

    public /* synthetic */ QueryPurchasesParams(Builder builder, zzbt zzbtVar) {
        this.zza = builder.zza;
    }

    @oo0oO0
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @oo0oO0
    public final String zza() {
        return this.zza;
    }
}
