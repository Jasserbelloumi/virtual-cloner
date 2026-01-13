package com.android.billingclient.api;

import android.support.v4.media.o00oOOoO;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooOoo.oO0O0O0;
import o0ooOoOO.oO0OoOO0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ProductDetails {
    private final String zza;
    private final JSONObject zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private final String zzi;
    private final String zzj;
    @o0OO00OO
    private final String zzk;
    @o0OO00OO
    private final List zzl;
    @o0OO00OO
    private final List zzm;

    /* loaded from: classes.dex */
    public static final class OneTimePurchaseOfferDetails {
        private final String zza;
        private final long zzb;
        private final String zzc;
        private final String zzd;
        private final String zze;
        private final com.google.android.gms.internal.play_billing.zzu zzf;
        @o0OO00OO
        private final zzbg zzg;
        @o0OO00OO
        private final zzbi zzh;
        @o0OO00OO
        private final zzbh zzi;

        public OneTimePurchaseOfferDetails(JSONObject jSONObject) throws JSONException {
            this.zza = jSONObject.optString("formattedPrice");
            this.zzb = jSONObject.optLong("priceAmountMicros");
            this.zzc = jSONObject.optString("priceCurrencyCode");
            this.zzd = jSONObject.optString("offerIdToken");
            this.zze = jSONObject.optString("offerId");
            jSONObject.optInt("offerType");
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            this.zzf = com.google.android.gms.internal.play_billing.zzu.zzj(arrayList);
            jSONObject.optLong("fullPriceMicros");
            JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.zzg = optJSONObject == null ? null : new zzbg(optJSONObject);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.zzh = optJSONObject2 == null ? null : new zzbi(optJSONObject2);
            JSONObject optJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.zzi = optJSONObject3 != null ? new zzbh(optJSONObject3) : null;
        }

        @oo0oO0
        public String getFormattedPrice() {
            return this.zza;
        }

        public long getPriceAmountMicros() {
            return this.zzb;
        }

        @oo0oO0
        public String getPriceCurrencyCode() {
            return this.zzc;
        }

        @oo0oO0
        public final String zza() {
            return this.zzd;
        }
    }

    /* loaded from: classes.dex */
    public static final class PricingPhase {
        private final String zza;
        private final long zzb;
        private final String zzc;
        private final String zzd;
        private final int zze;
        private final int zzf;

        public PricingPhase(JSONObject jSONObject) {
            this.zzd = jSONObject.optString("billingPeriod");
            this.zzc = jSONObject.optString("priceCurrencyCode");
            this.zza = jSONObject.optString("formattedPrice");
            this.zzb = jSONObject.optLong("priceAmountMicros");
            this.zzf = jSONObject.optInt("recurrenceMode");
            this.zze = jSONObject.optInt("billingCycleCount");
        }

        public int getBillingCycleCount() {
            return this.zze;
        }

        @oo0oO0
        public String getBillingPeriod() {
            return this.zzd;
        }

        @oo0oO0
        public String getFormattedPrice() {
            return this.zza;
        }

        public long getPriceAmountMicros() {
            return this.zzb;
        }

        @oo0oO0
        public String getPriceCurrencyCode() {
            return this.zzc;
        }

        public int getRecurrenceMode() {
            return this.zzf;
        }
    }

    /* loaded from: classes.dex */
    public static class PricingPhases {
        private final List zza;

        public PricingPhases(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        arrayList.add(new PricingPhase(optJSONObject));
                    }
                }
            }
            this.zza = arrayList;
        }

        @oo0oO0
        public List<PricingPhase> getPricingPhaseList() {
            return this.zza;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface RecurrenceMode {
        public static final int FINITE_RECURRING = 2;
        public static final int INFINITE_RECURRING = 1;
        public static final int NON_RECURRING = 3;
    }

    /* loaded from: classes.dex */
    public static final class SubscriptionOfferDetails {
        private final String zza;
        @o0OO00OO
        private final String zzb;
        private final String zzc;
        private final PricingPhases zzd;
        private final List zze;
        @o0OO00OO
        private final zzbf zzf;

        public SubscriptionOfferDetails(JSONObject jSONObject) throws JSONException {
            this.zza = jSONObject.optString("basePlanId");
            String optString = jSONObject.optString("offerId");
            this.zzb = true == optString.isEmpty() ? null : optString;
            this.zzc = jSONObject.getString("offerIdToken");
            this.zzd = new PricingPhases(jSONObject.getJSONArray("pricingPhases"));
            JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.zzf = optJSONObject != null ? new zzbf(optJSONObject) : null;
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            this.zze = arrayList;
        }

        @oo0oO0
        public String getBasePlanId() {
            return this.zza;
        }

        @o0OO00OO
        public String getOfferId() {
            return this.zzb;
        }

        @oo0oO0
        public List<String> getOfferTags() {
            return this.zze;
        }

        @oo0oO0
        public String getOfferToken() {
            return this.zzc;
        }

        @oo0oO0
        public PricingPhases getPricingPhases() {
            return this.zzd;
        }
    }

    public ProductDetails(String str) throws JSONException {
        this.zza = str;
        JSONObject jSONObject = new JSONObject(str);
        this.zzb = jSONObject;
        String optString = jSONObject.optString("productId");
        this.zzc = optString;
        String optString2 = jSONObject.optString("type");
        this.zzd = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(optString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.zze = jSONObject.optString(oO0O0O0.f9045o00oOo0O);
        this.zzf = jSONObject.optString("name");
        this.zzg = jSONObject.optString("description");
        this.zzi = jSONObject.optString("packageDisplayName");
        this.zzj = jSONObject.optString("iconUrl");
        this.zzh = jSONObject.optString("skuDetailsToken");
        this.zzk = jSONObject.optString("serializedDocid");
        JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new SubscriptionOfferDetails(optJSONArray.getJSONObject(i)));
            }
            this.zzl = arrayList;
        } else {
            this.zzl = (optString2.equals("subs") || optString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject optJSONObject = this.zzb.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray optJSONArray2 = this.zzb.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                arrayList2.add(new OneTimePurchaseOfferDetails(optJSONArray2.getJSONObject(i2)));
            }
            this.zzm = arrayList2;
        } else if (optJSONObject == null) {
            this.zzm = null;
        } else {
            arrayList2.add(new OneTimePurchaseOfferDetails(optJSONObject));
            this.zzm = arrayList2;
        }
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductDetails) {
            return TextUtils.equals(this.zza, ((ProductDetails) obj).zza);
        }
        return false;
    }

    @oo0oO0
    public String getDescription() {
        return this.zzg;
    }

    @oo0oO0
    public String getName() {
        return this.zzf;
    }

    @o0OO00OO
    public OneTimePurchaseOfferDetails getOneTimePurchaseOfferDetails() {
        List list = this.zzm;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (OneTimePurchaseOfferDetails) this.zzm.get(0);
    }

    @oo0oO0
    public String getProductId() {
        return this.zzc;
    }

    @oo0oO0
    public String getProductType() {
        return this.zzd;
    }

    @o0OO00OO
    public List<SubscriptionOfferDetails> getSubscriptionOfferDetails() {
        return this.zzl;
    }

    @oo0oO0
    public String getTitle() {
        return this.zze;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @oo0oO0
    public String toString() {
        String str = this.zza;
        String obj = this.zzb.toString();
        String str2 = this.zzc;
        String str3 = this.zzd;
        String str4 = this.zze;
        String str5 = this.zzh;
        String valueOf = String.valueOf(this.zzl);
        StringBuilder o00oOOo02 = oO0OoOO0.o00oOOo0("ProductDetails{jsonString='", str, "', parsedJson=", obj, ", productId='");
        o00oOOo02.append(str2);
        o00oOOo02.append("', productType='");
        o00oOOo02.append(str3);
        o00oOOo02.append("', title='");
        o00oOOo02.append(str4);
        o00oOOo02.append("', productDetailsToken='");
        o00oOOo02.append(str5);
        o00oOOo02.append("', subscriptionOfferDetails=");
        return o00oOOoO.o00oOOo0(o00oOOo02, valueOf, "}");
    }

    @oo0oO0
    public final String zza() {
        return this.zzb.optString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
    }

    public final String zzb() {
        return this.zzh;
    }

    @o0OO00OO
    public String zzc() {
        return this.zzk;
    }
}
