package com.android.billingclient.api;

import android.os.Bundle;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbl {
    public static zzbk zza(Bundle bundle, String str, String str2) {
        BillingResult billingResult = zzat.zzj;
        if (bundle == null) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", String.format("%s got null owned items list", str2));
            return new zzbk(billingResult, 54);
        }
        int zzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        BillingResult o00oOOo02 = o00oOOo0.o00oOOo0(zzb, com.google.android.gms.internal.play_billing.zzb.zzf(bundle, "BillingClient"));
        if (zzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(zzb)));
            return new zzbk(o00oOOo02, 23);
        } else if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return new zzbk(billingResult, 55);
        } else {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            if (stringArrayList == null) {
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
                return new zzbk(billingResult, 56);
            } else if (stringArrayList2 == null) {
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
                return new zzbk(billingResult, 57);
            } else if (stringArrayList3 == null) {
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
                return new zzbk(billingResult, 58);
            } else {
                return new zzbk(zzat.zzl, 1);
            }
        }
    }
}
