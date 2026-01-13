package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;
import o00oOooO.o0OO00OO;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzh {
    private final Context zza;
    private final zzg zzb;

    public zzh(Context context, PurchasesUpdatedListener purchasesUpdatedListener, AlternativeBillingListener alternativeBillingListener, zzar zzarVar) {
        this.zza = context;
        this.zzb = new zzg(this, purchasesUpdatedListener, alternativeBillingListener, zzarVar, null);
    }

    public zzh(Context context, zzaz zzazVar, zzar zzarVar) {
        this.zza = context;
        this.zzb = new zzg(this, null, zzarVar, null);
    }

    @o0OO00OO
    public final zzaz zzb() {
        zzg.zza(this.zzb);
        return null;
    }

    @o0OO00OO
    public final PurchasesUpdatedListener zzc() {
        return zzg.zzb(this.zzb);
    }

    public final void zzd() {
        this.zzb.zzd(this.zza);
    }

    public final void zze() {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.zzb.zzc(this.zza, intentFilter);
    }
}
