package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzezx {
    public static com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        if (th instanceof zzeax) {
            zzeax zzeaxVar = (zzeax) th;
            return zzc(zzeaxVar.zza(), zzeaxVar.zzb());
        } else if (th instanceof zzdtf) {
            return th.getMessage() == null ? zzd(((zzdtf) th).zza(), null, null) : zzd(((zzdtf) th).zza(), th.getMessage(), null);
        } else if (th instanceof com.google.android.gms.ads.internal.util.zzay) {
            com.google.android.gms.ads.internal.util.zzay zzayVar = (com.google.android.gms.ads.internal.util.zzay) th;
            return new com.google.android.gms.ads.internal.client.zze(zzayVar.zza(), zzfoj.zzc(zzayVar.getMessage()), MobileAds.ERROR_DOMAIN, null, null);
        } else {
            return zzd(1, null, null);
        }
    }

    public static com.google.android.gms.ads.internal.client.zze zzb(Throwable th, @o0OO00OO zzeay zzeayVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        com.google.android.gms.ads.internal.client.zze zza = zza(th);
        int i = zza.zza;
        if ((i == 3 || i == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zza.zzd = null;
        }
        if (zzeayVar != null) {
            zza.zze = zzeayVar.zzb();
        }
        return zza;
    }

    public static com.google.android.gms.ads.internal.client.zze zzc(int i, com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (i != 0) {
            if (i == 8) {
                if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhE)).intValue() > 0) {
                    return zzeVar;
                }
                i = 8;
            }
            return zzd(i, null, zzeVar);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.ads.internal.client.zze zzd(int r8, @o00oOooO.o0OO00OO java.lang.String r9, @o00oOooO.o0OO00OO com.google.android.gms.ads.internal.client.zze r10) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzezx.zzd(int, java.lang.String, com.google.android.gms.ads.internal.client.zze):com.google.android.gms.ads.internal.client.zze");
    }
}
