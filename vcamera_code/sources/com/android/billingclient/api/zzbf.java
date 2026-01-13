package com.android.billingclient.api;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzbf {
    public zzbf(JSONObject jSONObject) throws JSONException {
        jSONObject.getInt("commitmentPaymentsCount");
        jSONObject.optInt("subsequentCommitmentPaymentsCount");
    }
}
