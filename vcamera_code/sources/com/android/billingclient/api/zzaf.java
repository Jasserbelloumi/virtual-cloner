package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzfz;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaf implements ServiceConnection {
    public final /* synthetic */ BillingClientImpl zza;
    private final Object zzb = new Object();
    private boolean zzc = false;
    private BillingClientStateListener zzd;

    public /* synthetic */ zzaf(BillingClientImpl billingClientImpl, BillingClientStateListener billingClientStateListener, zzae zzaeVar) {
        this.zza = billingClientImpl;
        this.zzd = billingClientStateListener;
    }

    private final void zzd(BillingResult billingResult) {
        synchronized (this.zzb) {
            BillingClientStateListener billingClientStateListener = this.zzd;
            if (billingClientStateListener != null) {
                billingClientStateListener.onBillingSetupFinished(billingResult);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Billing service connected.");
        BillingClientImpl.zzD(this.zza, com.google.android.gms.internal.play_billing.zzd.zzn(iBinder));
        BillingClientImpl billingClientImpl = this.zza;
        if (BillingClientImpl.zzo(billingClientImpl, new Callable() { // from class: com.android.billingclient.api.zzac
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzaf.this.zza();
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzad
            @Override // java.lang.Runnable
            public final void run() {
                zzaf.this.zzb();
            }
        }, BillingClientImpl.zze(billingClientImpl)) == null) {
            BillingResult zzh = BillingClientImpl.zzh(this.zza);
            BillingClientImpl.zzg(this.zza).zza(zzaq.zza(25, 6, zzh));
            zzd(zzh);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing service disconnected.");
        BillingClientImpl.zzg(this.zza).zzc(zzfz.zzw());
        BillingClientImpl.zzD(this.zza, null);
        BillingClientImpl.zzp(this.zza, 0);
        synchronized (this.zzb) {
            BillingClientStateListener billingClientStateListener = this.zzd;
            if (billingClientStateListener != null) {
                billingClientStateListener.onBillingServiceDisconnected();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object zza() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.zzaf.zza():java.lang.Object");
    }

    public final /* synthetic */ void zzb() {
        BillingClientImpl.zzp(this.zza, 0);
        BillingClientImpl.zzD(this.zza, null);
        zzar zzg = BillingClientImpl.zzg(this.zza);
        BillingResult billingResult = zzat.zzn;
        zzg.zza(zzaq.zza(24, 6, billingResult));
        zzd(billingResult);
    }

    public final void zzc() {
        synchronized (this.zzb) {
            this.zzd = null;
            this.zzc = true;
        }
    }
}
