package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class PurchaseHistoryRecord {
    private final String zza;
    private final String zzb;
    private final JSONObject zzc;

    public PurchaseHistoryRecord(@oo0oO0 String str, @oo0oO0 String str2) throws JSONException {
        this.zza = str;
        this.zzb = str2;
        this.zzc = new JSONObject(str);
    }

    private final ArrayList zza() {
        ArrayList arrayList = new ArrayList();
        if (this.zzc.has("productIds")) {
            JSONArray optJSONArray = this.zzc.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
            }
        } else if (this.zzc.has("productId")) {
            arrayList.add(this.zzc.optString("productId"));
        }
        return arrayList;
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PurchaseHistoryRecord) {
            PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
            return TextUtils.equals(this.zza, purchaseHistoryRecord.getOriginalJson()) && TextUtils.equals(this.zzb, purchaseHistoryRecord.getSignature());
        }
        return false;
    }

    @oo0oO0
    public String getDeveloperPayload() {
        return this.zzc.optString("developerPayload");
    }

    @oo0oO0
    public String getOriginalJson() {
        return this.zza;
    }

    @oo0oO0
    public List<String> getProducts() {
        return zza();
    }

    public long getPurchaseTime() {
        return this.zzc.optLong("purchaseTime");
    }

    @oo0oO0
    public String getPurchaseToken() {
        JSONObject jSONObject = this.zzc;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public int getQuantity() {
        return this.zzc.optInt(FirebaseAnalytics.Param.QUANTITY, 1);
    }

    @oo0oO0
    public String getSignature() {
        return this.zzb;
    }

    @oo0oO0
    @Deprecated
    public ArrayList<String> getSkus() {
        return zza();
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @oo0oO0
    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.zza));
    }
}
