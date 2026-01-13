package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzarg implements AppOpsManager$OnOpActiveChangedListener {
    public final /* synthetic */ zzarh zza;

    public zzarg(zzarh zzarhVar) {
        this.zza = zzarhVar;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        long j;
        zzarh zzarhVar;
        boolean z2;
        long j2;
        long j3;
        if (z) {
            this.zza.zzb = System.currentTimeMillis();
            zzarhVar = this.zza;
            z2 = true;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            zzarh zzarhVar2 = this.zza;
            j = zzarhVar2.zzc;
            if (j > 0) {
                j2 = zzarhVar2.zzc;
                if (currentTimeMillis >= j2) {
                    j3 = zzarhVar2.zzc;
                    zzarhVar2.zzd = currentTimeMillis - j3;
                }
            }
            zzarhVar = this.zza;
            z2 = false;
        }
        zzarhVar.zze = z2;
    }
}
