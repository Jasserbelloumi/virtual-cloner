package com.android.billingclient.api;

import android.text.TextUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class BillingFlowParams {
    @oo0oO0
    public static final String EXTRA_PARAM_KEY_ACCOUNT_ID = "accountId";
    private boolean zza;
    private String zzb;
    private String zzc;
    private SubscriptionUpdateParams zzd;
    private com.google.android.gms.internal.play_billing.zzu zze;
    private ArrayList zzf;
    private boolean zzg;

    /* loaded from: classes.dex */
    public static class Builder {
        private String zza;
        private String zzb;
        private List zzc;
        private ArrayList zzd;
        private boolean zze;
        private SubscriptionUpdateParams.Builder zzf;

        private Builder() {
            SubscriptionUpdateParams.Builder newBuilder = SubscriptionUpdateParams.newBuilder();
            SubscriptionUpdateParams.Builder.zza(newBuilder);
            this.zzf = newBuilder;
        }

        public /* synthetic */ Builder(zzak zzakVar) {
            SubscriptionUpdateParams.Builder newBuilder = SubscriptionUpdateParams.newBuilder();
            SubscriptionUpdateParams.Builder.zza(newBuilder);
            this.zzf = newBuilder;
        }

        @oo0oO0
        public BillingFlowParams build() {
            ArrayList arrayList = this.zzd;
            boolean z = true;
            boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.zzc;
            boolean z3 = (list == null || list.isEmpty()) ? false : true;
            if (z2 || z3) {
                if (z2 && z3) {
                    throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
                }
                if (!z2) {
                    ProductDetailsParams productDetailsParams = (ProductDetailsParams) this.zzc.get(0);
                    for (int i = 0; i < this.zzc.size(); i++) {
                        ProductDetailsParams productDetailsParams2 = (ProductDetailsParams) this.zzc.get(i);
                        if (productDetailsParams2 == null) {
                            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                        }
                        if (i != 0 && !productDetailsParams2.zza().getProductType().equals(productDetailsParams.zza().getProductType()) && !productDetailsParams2.zza().getProductType().equals("play_pass_subs")) {
                            throw new IllegalArgumentException("All products should have same ProductType.");
                        }
                    }
                    String zza = productDetailsParams.zza().zza();
                    for (ProductDetailsParams productDetailsParams3 : this.zzc) {
                        if (!productDetailsParams.zza().getProductType().equals("play_pass_subs") && !productDetailsParams3.zza().getProductType().equals("play_pass_subs") && !zza.equals(productDetailsParams3.zza().zza())) {
                            throw new IllegalArgumentException("All products must have the same package name.");
                        }
                    }
                } else if (this.zzd.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                } else {
                    if (this.zzd.size() > 1) {
                        SkuDetails skuDetails = (SkuDetails) this.zzd.get(0);
                        String type = skuDetails.getType();
                        ArrayList arrayList2 = this.zzd;
                        int size = arrayList2.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i2);
                            if (!type.equals("play_pass_subs") && !skuDetails2.getType().equals("play_pass_subs") && !type.equals(skuDetails2.getType())) {
                                throw new IllegalArgumentException("SKUs should have the same type.");
                            }
                        }
                        String zzd = skuDetails.zzd();
                        ArrayList arrayList3 = this.zzd;
                        int size2 = arrayList3.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i3);
                            if (!type.equals("play_pass_subs") && !skuDetails3.getType().equals("play_pass_subs") && !zzd.equals(skuDetails3.zzd())) {
                                throw new IllegalArgumentException("All SKUs must have the same package name.");
                            }
                        }
                    }
                }
                BillingFlowParams billingFlowParams = new BillingFlowParams(null);
                if ((!z2 || ((SkuDetails) this.zzd.get(0)).zzd().isEmpty()) && (!z3 || ((ProductDetailsParams) this.zzc.get(0)).zza().zza().isEmpty())) {
                    z = false;
                }
                billingFlowParams.zza = z;
                billingFlowParams.zzb = this.zza;
                billingFlowParams.zzc = this.zzb;
                billingFlowParams.zzd = this.zzf.build();
                ArrayList arrayList4 = this.zzd;
                billingFlowParams.zzf = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
                billingFlowParams.zzg = this.zze;
                List list2 = this.zzc;
                billingFlowParams.zze = list2 != null ? com.google.android.gms.internal.play_billing.zzu.zzj(list2) : com.google.android.gms.internal.play_billing.zzu.zzk();
                return billingFlowParams;
            }
            throw new IllegalArgumentException("Details of the products must be provided.");
        }

        @oo0oO0
        public Builder setIsOfferPersonalized(boolean z) {
            this.zze = z;
            return this;
        }

        @oo0oO0
        public Builder setObfuscatedAccountId(@oo0oO0 String str) {
            this.zza = str;
            return this;
        }

        @oo0oO0
        public Builder setObfuscatedProfileId(@oo0oO0 String str) {
            this.zzb = str;
            return this;
        }

        @oo0oO0
        public Builder setProductDetailsParamsList(@oo0oO0 List<ProductDetailsParams> list) {
            this.zzc = new ArrayList(list);
            return this;
        }

        @oo0oO0
        @Deprecated
        public Builder setSkuDetails(@oo0oO0 SkuDetails skuDetails) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            this.zzd = arrayList;
            return this;
        }

        @oo0oO0
        public Builder setSubscriptionUpdateParams(@oo0oO0 SubscriptionUpdateParams subscriptionUpdateParams) {
            this.zzf = SubscriptionUpdateParams.zzc(subscriptionUpdateParams);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class ProductDetailsParams {
        private final ProductDetails zza;
        private final String zzb;

        /* loaded from: classes.dex */
        public static class Builder {
            private ProductDetails zza;
            private String zzb;

            private Builder() {
            }

            public /* synthetic */ Builder(zzal zzalVar) {
            }

            @oo0oO0
            public ProductDetailsParams build() {
                com.google.android.gms.internal.play_billing.zzm.zzc(this.zza, "ProductDetails is required for constructing ProductDetailsParams.");
                com.google.android.gms.internal.play_billing.zzm.zzc(this.zzb, "offerToken is required for constructing ProductDetailsParams.");
                return new ProductDetailsParams(this, null);
            }

            @oo0oO0
            public Builder setOfferToken(@oo0oO0 String str) {
                this.zzb = str;
                return this;
            }

            @oo0oO0
            public Builder setProductDetails(@oo0oO0 ProductDetails productDetails) {
                this.zza = productDetails;
                if (productDetails.getOneTimePurchaseOfferDetails() != null) {
                    productDetails.getOneTimePurchaseOfferDetails().getClass();
                    this.zzb = productDetails.getOneTimePurchaseOfferDetails().zza();
                }
                return this;
            }
        }

        public /* synthetic */ ProductDetailsParams(Builder builder, zzam zzamVar) {
            this.zza = builder.zza;
            this.zzb = builder.zzb;
        }

        @oo0oO0
        public static Builder newBuilder() {
            return new Builder(null);
        }

        @oo0oO0
        public final ProductDetails zza() {
            return this.zza;
        }

        @oo0oO0
        public final String zzb() {
            return this.zzb;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface ProrationMode {
        public static final int DEFERRED = 4;
        public static final int IMMEDIATE_AND_CHARGE_FULL_PRICE = 5;
        public static final int IMMEDIATE_AND_CHARGE_PRORATED_PRICE = 2;
        public static final int IMMEDIATE_WITHOUT_PRORATION = 3;
        public static final int IMMEDIATE_WITH_TIME_PRORATION = 1;
        public static final int UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY = 0;
    }

    /* loaded from: classes.dex */
    public static class SubscriptionUpdateParams {
        private String zza;
        private String zzb;
        private int zzc = 0;
        private int zzd = 0;

        /* loaded from: classes.dex */
        public static class Builder {
            private String zza;
            private String zzb;
            private boolean zzc;
            private int zzd = 0;
            private int zze = 0;

            private Builder() {
            }

            public /* synthetic */ Builder(zzan zzanVar) {
            }

            public static /* synthetic */ Builder zza(Builder builder) {
                builder.zzc = true;
                return builder;
            }

            @oo0oO0
            public SubscriptionUpdateParams build() {
                boolean z = (TextUtils.isEmpty(this.zza) && TextUtils.isEmpty(null)) ? false : true;
                boolean isEmpty = true ^ TextUtils.isEmpty(this.zzb);
                if (z && isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (this.zzc || z || isEmpty) {
                    SubscriptionUpdateParams subscriptionUpdateParams = new SubscriptionUpdateParams(null);
                    subscriptionUpdateParams.zza = this.zza;
                    subscriptionUpdateParams.zzc = this.zzd;
                    subscriptionUpdateParams.zzd = this.zze;
                    subscriptionUpdateParams.zzb = this.zzb;
                    return subscriptionUpdateParams;
                }
                throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
            }

            @oo0oO0
            public Builder setOldPurchaseToken(@oo0oO0 String str) {
                this.zza = str;
                return this;
            }

            @oo0oO0
            @Deprecated
            public Builder setOldSkuPurchaseToken(@oo0oO0 String str) {
                this.zza = str;
                return this;
            }

            @oo0oO0
            @zzd
            public Builder setOriginalExternalTransactionId(@oo0oO0 String str) {
                this.zzb = str;
                return this;
            }

            @oo0oO0
            @Deprecated
            public Builder setReplaceProrationMode(int i) {
                this.zzd = i;
                return this;
            }

            @oo0oO0
            @Deprecated
            public Builder setReplaceSkusProrationMode(int i) {
                this.zzd = i;
                return this;
            }

            @oo0oO0
            public Builder setSubscriptionReplacementMode(int i) {
                this.zze = i;
                return this;
            }
        }

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface ReplacementMode {
            public static final int CHARGE_FULL_PRICE = 5;
            public static final int CHARGE_PRORATED_PRICE = 2;
            public static final int DEFERRED = 6;
            public static final int UNKNOWN_REPLACEMENT_MODE = 0;
            public static final int WITHOUT_PRORATION = 3;
            public static final int WITH_TIME_PRORATION = 1;
        }

        private SubscriptionUpdateParams() {
        }

        public /* synthetic */ SubscriptionUpdateParams(zzao zzaoVar) {
        }

        @oo0oO0
        public static Builder newBuilder() {
            return new Builder(null);
        }

        public static /* bridge */ /* synthetic */ Builder zzc(SubscriptionUpdateParams subscriptionUpdateParams) {
            Builder newBuilder = newBuilder();
            newBuilder.setOldSkuPurchaseToken(subscriptionUpdateParams.zza);
            newBuilder.setReplaceSkusProrationMode(subscriptionUpdateParams.zzc);
            newBuilder.setSubscriptionReplacementMode(subscriptionUpdateParams.zzd);
            newBuilder.setOriginalExternalTransactionId(subscriptionUpdateParams.zzb);
            return newBuilder;
        }

        @Deprecated
        public final int zza() {
            return this.zzc;
        }

        public final int zzb() {
            return this.zzd;
        }

        public final String zzd() {
            return this.zza;
        }

        public final String zze() {
            return this.zzb;
        }
    }

    private BillingFlowParams() {
    }

    public /* synthetic */ BillingFlowParams(zzap zzapVar) {
    }

    @oo0oO0
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @Deprecated
    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        return this.zzd.zzb();
    }

    @o0OO00OO
    public final String zzc() {
        return this.zzb;
    }

    @o0OO00OO
    public final String zzd() {
        return this.zzc;
    }

    @o0OO00OO
    public final String zze() {
        return this.zzd.zzd();
    }

    @o0OO00OO
    public final String zzf() {
        return this.zzd.zze();
    }

    @oo0oO0
    public final ArrayList zzg() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.zzf);
        return arrayList;
    }

    @oo0oO0
    public final List zzh() {
        return this.zze;
    }

    public final boolean zzp() {
        return this.zzg;
    }

    public final boolean zzq() {
        return (this.zzb == null && this.zzc == null && this.zzd.zze() == null && this.zzd.zza() == 0 && this.zzd.zzb() == 0 && !this.zza && !this.zzg) ? false : true;
    }
}
