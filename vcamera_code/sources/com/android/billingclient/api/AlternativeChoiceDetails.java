package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@zzd
/* loaded from: classes.dex */
public final class AlternativeChoiceDetails {
    private final String zza;
    private final JSONObject zzb;
    private final List zzc;

    @zzd
    /* loaded from: classes.dex */
    public static class Product {
        private final String zza;
        private final String zzb;
        @o0OO00OO
        private final String zzc;

        public /* synthetic */ Product(JSONObject jSONObject, zzc zzcVar) {
            this.zza = jSONObject.optString("productId");
            this.zzb = jSONObject.optString("productType");
            String optString = jSONObject.optString("offerToken");
            this.zzc = true == optString.isEmpty() ? null : optString;
        }

        public final boolean equals(@o0OO00OO Object obj) {
            String str;
            String offerToken;
            if (this == obj) {
                return true;
            }
            if (obj instanceof Product) {
                Product product = (Product) obj;
                return this.zza.equals(product.getId()) && this.zzb.equals(product.getType()) && ((str = this.zzc) == (offerToken = product.getOfferToken()) || (str != null && str.equals(offerToken)));
            }
            return false;
        }

        @oo0oO0
        @zzd
        public String getId() {
            return this.zza;
        }

        @o0OO00OO
        @zzd
        public String getOfferToken() {
            return this.zzc;
        }

        @oo0oO0
        @zzd
        public String getType() {
            return this.zzb;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc});
        }

        @oo0oO0
        public final String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", this.zza, this.zzb, this.zzc);
        }
    }

    public AlternativeChoiceDetails(String str) throws JSONException {
        this.zza = str;
        JSONObject jSONObject = new JSONObject(str);
        this.zzb = jSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("products");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new Product(optJSONObject, null));
                }
            }
        }
        this.zzc = arrayList;
    }

    @oo0oO0
    @zzd
    public String getExternalTransactionToken() {
        return this.zzb.optString("externalTransactionToken");
    }

    @o0OO00OO
    @zzd
    public String getOriginalExternalTransactionId() {
        String optString = this.zzb.optString("originalExternalTransactionId");
        if (optString.isEmpty()) {
            return null;
        }
        return optString;
    }

    @oo0oO0
    @zzd
    public List<Product> getProducts() {
        return this.zzc;
    }
}
