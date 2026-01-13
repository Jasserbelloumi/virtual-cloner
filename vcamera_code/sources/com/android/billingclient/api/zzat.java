package com.android.billingclient.api;

import com.android.billingclient.api.BillingResult;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzat {
    public static final BillingResult zzA;
    public static final BillingResult zzB;
    public static final BillingResult zzC;
    public static final /* synthetic */ int zzD = 0;
    public static final BillingResult zza = o00oOOo0.o00oOOo0(3, "Google Play In-app Billing API version is less than 3");
    public static final BillingResult zzb = o00oOOo0.o00oOOo0(3, "Google Play In-app Billing API version is less than 9");
    public static final BillingResult zzc = o00oOOo0.o00oOOo0(3, "Billing service unavailable on device.");
    public static final BillingResult zzd = o00oOOo0.o00oOOo0(5, "Client is already in the process of connecting to billing service.");
    public static final BillingResult zze = o00oOOo0.o00oOOo0(5, "The list of SKUs can't be empty.");
    public static final BillingResult zzf = o00oOOo0.o00oOOo0(5, "SKU type can't be empty.");
    public static final BillingResult zzg = o00oOOo0.o00oOOo0(5, "Product type can't be empty.");
    public static final BillingResult zzh = o00oOOo0.o00oOOo0(-2, "Client does not support extra params.");
    public static final BillingResult zzi = o00oOOo0.o00oOOo0(5, "Invalid purchase token.");
    public static final BillingResult zzj = o00oOOo0.o00oOOo0(6, "An internal error occurred.");
    public static final BillingResult zzk = o00oOOo0.o00oOOo0(5, "SKU can't be null.");
    public static final BillingResult zzl;
    public static final BillingResult zzm;
    public static final BillingResult zzn;
    public static final BillingResult zzo;
    public static final BillingResult zzp;
    public static final BillingResult zzq;
    public static final BillingResult zzr;
    public static final BillingResult zzs;
    public static final BillingResult zzt;
    public static final BillingResult zzu;
    public static final BillingResult zzv;
    public static final BillingResult zzw;
    public static final BillingResult zzx;
    public static final BillingResult zzy;
    public static final BillingResult zzz;

    static {
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(0);
        zzl = newBuilder.build();
        zzm = o00oOOo0.o00oOOo0(-1, "Service connection is disconnected.");
        zzn = o00oOOo0.o00oOOo0(2, "Timeout communicating with service.");
        zzo = o00oOOo0.o00oOOo0(-2, "Client does not support subscriptions.");
        zzp = o00oOOo0.o00oOOo0(-2, "Client does not support subscriptions update.");
        zzq = o00oOOo0.o00oOOo0(-2, "Client does not support get purchase history.");
        zzr = o00oOOo0.o00oOOo0(-2, "Client does not support price change confirmation.");
        zzs = o00oOOo0.o00oOOo0(-2, "Play Store version installed does not support cross selling products.");
        zzt = o00oOOo0.o00oOOo0(-2, "Client does not support multi-item purchases.");
        zzu = o00oOOo0.o00oOOo0(-2, "Client does not support offer_id_token.");
        zzv = o00oOOo0.o00oOOo0(-2, "Client does not support ProductDetails.");
        zzw = o00oOOo0.o00oOOo0(-2, "Client does not support in-app messages.");
        zzx = o00oOOo0.o00oOOo0(-2, "Client does not support alternative billing.");
        zzy = o00oOOo0.o00oOOo0(5, "Unknown feature");
        zzz = o00oOOo0.o00oOOo0(-2, "Play Store version installed does not support get billing config.");
        zzA = o00oOOo0.o00oOOo0(-2, "Query product details with serialized docid is not supported.");
        zzB = o00oOOo0.o00oOOo0(4, "Item is unavailable for purchase.");
        zzC = o00oOOo0.o00oOOo0(-2, "Query product details with developer specified account is not supported.");
    }

    public static BillingResult zza(int i, String str) {
        return o00oOOo0.o00oOOo0(i, str);
    }
}
