package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzff;
import com.google.android.gms.internal.play_billing.zzfm;
import com.google.android.gms.internal.play_billing.zzfu;
import com.google.android.gms.internal.play_billing.zzfv;
import com.google.android.gms.internal.play_billing.zzfz;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaw implements zzar {
    private final zzfm zza;
    private final zzay zzb;

    public zzaw(Context context, zzfm zzfmVar) {
        this.zzb = new zzay(context);
        this.zza = zzfmVar;
    }

    @Override // com.android.billingclient.api.zzar
    public final void zza(zzfb zzfbVar) {
        try {
            zzfu zzv = zzfv.zzv();
            zzfm zzfmVar = this.zza;
            if (zzfmVar != null) {
                zzv.zzk(zzfmVar);
            }
            zzv.zzi(zzfbVar);
            this.zzb.zza((zzfv) zzv.zzc());
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingLogger", "Unable to log.");
        }
    }

    @Override // com.android.billingclient.api.zzar
    public final void zzb(zzff zzffVar) {
        try {
            zzfu zzv = zzfv.zzv();
            zzfm zzfmVar = this.zza;
            if (zzfmVar != null) {
                zzv.zzk(zzfmVar);
            }
            zzv.zzj(zzffVar);
            this.zzb.zza((zzfv) zzv.zzc());
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingLogger", "Unable to log.");
        }
    }

    @Override // com.android.billingclient.api.zzar
    public final void zzc(zzfz zzfzVar) {
        try {
            zzfu zzv = zzfv.zzv();
            zzfm zzfmVar = this.zza;
            if (zzfmVar != null) {
                zzv.zzk(zzfmVar);
            }
            zzv.zzl(zzfzVar);
            this.zzb.zza((zzfv) zzv.zzc());
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingLogger", "Unable to log.");
        }
    }
}
