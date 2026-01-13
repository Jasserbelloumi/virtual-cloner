package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooOoo.oO0O0O0;
import org.json.JSONException;
import org.json.JSONObject;
@Deprecated
/* loaded from: classes.dex */
public class SkuDetails {
    private final String zza;
    private final JSONObject zzb;

    public SkuDetails(@oo0oO0 String str) throws JSONException {
        this.zza = str;
        JSONObject jSONObject = new JSONObject(str);
        this.zzb = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.zza, ((SkuDetails) obj).zza);
        }
        return false;
    }

    @oo0oO0
    public String getDescription() {
        return this.zzb.optString("description");
    }

    @oo0oO0
    public String getFreeTrialPeriod() {
        return this.zzb.optString("freeTrialPeriod");
    }

    @oo0oO0
    public String getIconUrl() {
        return this.zzb.optString("iconUrl");
    }

    @oo0oO0
    public String getIntroductoryPrice() {
        return this.zzb.optString("introductoryPrice");
    }

    public long getIntroductoryPriceAmountMicros() {
        return this.zzb.optLong("introductoryPriceAmountMicros");
    }

    public int getIntroductoryPriceCycles() {
        return this.zzb.optInt("introductoryPriceCycles");
    }

    @oo0oO0
    public String getIntroductoryPricePeriod() {
        return this.zzb.optString("introductoryPricePeriod");
    }

    @oo0oO0
    public String getOriginalJson() {
        return this.zza;
    }

    @oo0oO0
    public String getOriginalPrice() {
        return this.zzb.has("original_price") ? this.zzb.optString("original_price") : getPrice();
    }

    public long getOriginalPriceAmountMicros() {
        return this.zzb.has("original_price_micros") ? this.zzb.optLong("original_price_micros") : getPriceAmountMicros();
    }

    @oo0oO0
    public String getPrice() {
        return this.zzb.optString(FirebaseAnalytics.Param.PRICE);
    }

    public long getPriceAmountMicros() {
        return this.zzb.optLong("price_amount_micros");
    }

    @oo0oO0
    public String getPriceCurrencyCode() {
        return this.zzb.optString("price_currency_code");
    }

    @oo0oO0
    public String getSku() {
        return this.zzb.optString("productId");
    }

    @oo0oO0
    public String getSubscriptionPeriod() {
        return this.zzb.optString("subscriptionPeriod");
    }

    @oo0oO0
    public String getTitle() {
        return this.zzb.optString(oO0O0O0.f9045o00oOo0O);
    }

    @oo0oO0
    public String getType() {
        return this.zzb.optString("type");
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @oo0oO0
    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.zza));
    }

    public int zza() {
        return this.zzb.optInt("offer_type");
    }

    @oo0oO0
    public String zzb() {
        return this.zzb.optString("offer_id");
    }

    @oo0oO0
    public String zzc() {
        String optString = this.zzb.optString("offerIdToken");
        return optString.isEmpty() ? this.zzb.optString("offer_id_token") : optString;
    }

    @oo0oO0
    public final String zzd() {
        return this.zzb.optString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
    }

    @oo0oO0
    public String zze() {
        return this.zzb.optString("serializedDocid");
    }

    public final String zzf() {
        return this.zzb.optString("skuDetailsToken");
    }
}
