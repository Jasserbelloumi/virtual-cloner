package com.android.billingclient.api;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzz implements Callable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ PurchaseHistoryResponseListener zzb;
    public final /* synthetic */ BillingClientImpl zzc;

    public zzz(BillingClientImpl billingClientImpl, String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        this.zzc = billingClientImpl;
        this.zza = str;
        this.zzb = purchaseHistoryResponseListener;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzai zzf = BillingClientImpl.zzf(this.zzc, this.zza);
        this.zzb.onPurchaseHistoryResponse(zzf.zza(), zzf.zzb());
        return null;
    }
}
