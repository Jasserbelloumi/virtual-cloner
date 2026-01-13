package com.android.billingclient.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public final class InAppMessageResult {
    private final int zza;
    @o0OO00OO
    private final String zzb;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface InAppMessageResponseCode {
        public static final int NO_ACTION_NEEDED = 0;
        public static final int SUBSCRIPTION_STATUS_UPDATED = 1;
    }

    public InAppMessageResult(int i, @o0OO00OO String str) {
        this.zza = i;
        this.zzb = str;
    }

    @o0OO00OO
    public String getPurchaseToken() {
        return this.zzb;
    }

    public int getResponseCode() {
        return this.zza;
    }
}
