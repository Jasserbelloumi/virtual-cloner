package com.android.billingclient.api;

import androidx.fragment.app.o0O00;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class BillingResult {
    private int zza;
    private String zzb;

    /* loaded from: classes.dex */
    public static class Builder {
        private int zza;
        private String zzb = "";

        private Builder() {
        }

        public /* synthetic */ Builder(zzas zzasVar) {
        }

        @oo0oO0
        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.zza = this.zza;
            billingResult.zzb = this.zzb;
            return billingResult;
        }

        @oo0oO0
        public Builder setDebugMessage(@oo0oO0 String str) {
            this.zzb = str;
            return this;
        }

        @oo0oO0
        public Builder setResponseCode(int i) {
            this.zza = i;
            return this;
        }
    }

    @oo0oO0
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @oo0oO0
    public String getDebugMessage() {
        return this.zzb;
    }

    public int getResponseCode() {
        return this.zza;
    }

    @oo0oO0
    public String toString() {
        return o0O00.o00oOOo0("Response Code: ", com.google.android.gms.internal.play_billing.zzb.zzg(this.zza), ", Debug Message: ", this.zzb);
    }
}
