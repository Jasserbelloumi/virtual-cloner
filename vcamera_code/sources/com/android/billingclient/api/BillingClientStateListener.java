package com.android.billingclient.api;

import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public interface BillingClientStateListener {
    void onBillingServiceDisconnected();

    void onBillingSetupFinished(@oo0oO0 BillingResult billingResult);
}
