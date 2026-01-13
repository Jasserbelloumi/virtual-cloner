package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
/* loaded from: classes2.dex */
public final class zzfir {
    public static boolean zza(int i) {
        int i2 = i - 1;
        return i2 == 2 || i2 == 4 || i2 == 5 || i2 == 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int zzb(android.content.Context r14, com.google.android.gms.internal.ads.zzfhp r15) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfir.zzb(android.content.Context, com.google.android.gms.internal.ads.zzfhp):int");
    }

    private static final String zzc(Context context, zzfhp zzfhpVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String zza = zzfoi.OS_ARCH.zza();
        if (TextUtils.isEmpty(zza) || !hashSet.contains(zza)) {
            try {
                String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                if (strArr != null && strArr.length > 0) {
                    return strArr[0];
                }
            } catch (IllegalAccessException | NoSuchFieldException e) {
                zzfhpVar.zzc(2024, 0L, e);
            }
            String str = Build.CPU_ABI;
            return str != null ? str : Build.CPU_ABI2;
        }
        return zza;
    }

    private static final void zzd(byte[] bArr, String str, Context context, zzfhp zzfhpVar) {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("os.arch:");
        o00oOOo02.append(zzfoi.OS_ARCH.zza());
        o00oOOo02.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                o00oOOo02.append("supported_abis:");
                o00oOOo02.append(Arrays.toString(strArr));
                o00oOOo02.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        o00oOOo02.append("CPU_ABI:");
        o00oOOo02.append(Build.CPU_ABI);
        o00oOOo02.append(";CPU_ABI2:");
        o00oOOo02.append(Build.CPU_ABI2);
        o00oOOo02.append(";");
        if (bArr != null) {
            o00oOOo02.append("ELF:");
            o00oOOo02.append(Arrays.toString(bArr));
            o00oOOo02.append(";");
        }
        if (str != null) {
            o00oOOo02.append("dbg:");
            o00oOOo02.append(str);
            o00oOOo02.append(";");
        }
        zzfhpVar.zzb(4007, o00oOOo02.toString());
    }
}
