package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public final class zzfje {
    @VisibleForTesting
    public final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfje(@oo0oO0 Context context, int i) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfjf.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfjf.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        return android.support.v4.media.o00oOOo0.o00oOOo0("FBAMTD", this.zzd - 1);
    }

    private final String zzf() {
        return android.support.v4.media.o00oOOo0.o00oOOo0("LATMTD", this.zzd - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(@o00oOooO.oo0oO0 com.google.android.gms.internal.ads.zzasr r8, @o00oOooO.o0OO00OO com.google.android.gms.internal.ads.zzfjk r9) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfje.zza(com.google.android.gms.internal.ads.zzasr, com.google.android.gms.internal.ads.zzfjk):boolean");
    }

    @VisibleForTesting
    @o0OO00OO
    public final zzasu zzb(int i) {
        SharedPreferences sharedPreferences;
        String zze;
        if (i == 1) {
            sharedPreferences = this.zzc;
            zze = zzf();
        } else {
            sharedPreferences = this.zzc;
            zze = zze();
        }
        String string = sharedPreferences.getString(zze, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            zzasu zzh = zzasu.zzh(zzgpe.zzv(Hex.stringToBytes(string)));
            String zzk = zzh.zzk();
            File zzb = zzfjf.zzb(zzk, "pcam.jar", zzd());
            if (!zzb.exists()) {
                zzb = zzfjf.zzb(zzk, "pcam", zzd());
            }
            File zzb2 = zzfjf.zzb(zzk, "pcbc", zzd());
            if (zzb.exists()) {
                if (zzb2.exists()) {
                    return zzh;
                }
            }
        } catch (zzgqy unused) {
        }
        return null;
    }

    @o0OO00OO
    public final zzfjd zzc(int i) {
        zzasu zzb = zzb(1);
        if (zzb == null) {
            return null;
        }
        String zzk = zzb.zzk();
        File zzb2 = zzfjf.zzb(zzk, "pcam.jar", zzd());
        if (!zzb2.exists()) {
            zzb2 = zzfjf.zzb(zzk, "pcam", zzd());
        }
        return new zzfjd(zzb, zzb2, zzfjf.zzb(zzk, "pcbc", zzd()), zzfjf.zzb(zzk, "pcopt", zzd()));
    }
}
