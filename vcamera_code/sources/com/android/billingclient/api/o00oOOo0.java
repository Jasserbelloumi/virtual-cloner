package com.android.billingclient.api;

import com.android.billingclient.api.BillingResult;
/* loaded from: classes.dex */
public final /* synthetic */ class o00oOOo0 {
    public static BillingResult o00oOOo0(int i, String str) {
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(i);
        newBuilder.setDebugMessage(str);
        return newBuilder.build();
    }
}
