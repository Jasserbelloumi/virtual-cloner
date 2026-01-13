package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public class SkuDetailsParams {
    private String zza;
    private List zzb;

    /* loaded from: classes.dex */
    public static class Builder {
        private String zza;
        private List zzb;

        private Builder() {
        }

        public /* synthetic */ Builder(zzbu zzbuVar) {
        }

        @oo0oO0
        public SkuDetailsParams build() {
            String str = this.zza;
            if (str != null) {
                if (this.zzb != null) {
                    SkuDetailsParams skuDetailsParams = new SkuDetailsParams();
                    skuDetailsParams.zza = str;
                    skuDetailsParams.zzb = this.zzb;
                    return skuDetailsParams;
                }
                throw new IllegalArgumentException("SKU list must be set");
            }
            throw new IllegalArgumentException("SKU type must be set");
        }

        @oo0oO0
        public Builder setSkusList(@oo0oO0 List<String> list) {
            this.zzb = new ArrayList(list);
            return this;
        }

        @oo0oO0
        public Builder setType(@oo0oO0 String str) {
            this.zza = str;
            return this;
        }
    }

    @oo0oO0
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @oo0oO0
    public String getSkuType() {
        return this.zza;
    }

    @oo0oO0
    public List<String> getSkusList() {
        return this.zzb;
    }
}
