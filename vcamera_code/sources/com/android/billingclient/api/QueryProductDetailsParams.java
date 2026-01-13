package com.android.billingclient.api;

import java.util.HashSet;
import java.util.List;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class QueryProductDetailsParams {
    private final com.google.android.gms.internal.play_billing.zzu zza;

    /* loaded from: classes.dex */
    public static class Builder {
        private com.google.android.gms.internal.play_billing.zzu zza;

        private Builder() {
        }

        public /* synthetic */ Builder(zzbm zzbmVar) {
        }

        @oo0oO0
        public QueryProductDetailsParams build() {
            return new QueryProductDetailsParams(this, null);
        }

        @oo0oO0
        public Builder setProductList(@oo0oO0 List<Product> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            for (Product product : list) {
                if (!"play_pass_subs".equals(product.zzb())) {
                    hashSet.add(product.zzb());
                }
            }
            if (hashSet.size() <= 1) {
                this.zza = com.google.android.gms.internal.play_billing.zzu.zzj(list);
                return this;
            }
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
    }

    /* loaded from: classes.dex */
    public static class Product {
        private final String zza;
        private final String zzb;

        /* loaded from: classes.dex */
        public static class Builder {
            private String zza;
            private String zzb;

            private Builder() {
            }

            public /* synthetic */ Builder(zzbn zzbnVar) {
            }

            @oo0oO0
            public Product build() {
                if ("first_party".equals(this.zzb)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.zza != null) {
                    if (this.zzb != null) {
                        return new Product(this, null);
                    }
                    throw new IllegalArgumentException("Product type must be provided.");
                }
                throw new IllegalArgumentException("Product id must be provided.");
            }

            @oo0oO0
            public Builder setProductId(@oo0oO0 String str) {
                this.zza = str;
                return this;
            }

            @oo0oO0
            public Builder setProductType(@oo0oO0 String str) {
                this.zzb = str;
                return this;
            }
        }

        public /* synthetic */ Product(Builder builder, zzbo zzboVar) {
            this.zza = builder.zza;
            this.zzb = builder.zzb;
        }

        @oo0oO0
        public static Builder newBuilder() {
            return new Builder(null);
        }

        @oo0oO0
        public final String zza() {
            return this.zza;
        }

        @oo0oO0
        public final String zzb() {
            return this.zzb;
        }
    }

    public /* synthetic */ QueryProductDetailsParams(Builder builder, zzbp zzbpVar) {
        this.zza = builder.zza;
    }

    @oo0oO0
    public static Builder newBuilder() {
        return new Builder(null);
    }

    public final com.google.android.gms.internal.play_billing.zzu zza() {
        return this.zza;
    }

    @oo0oO0
    public final String zzb() {
        return ((Product) this.zza.get(0)).zzb();
    }
}
