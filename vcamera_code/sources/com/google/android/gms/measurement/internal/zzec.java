package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.support.v4.media.o00oOo0O;
import android.support.v4.media.o00oOoO;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import o0Oo0Oo0.o0O0o00O;
/* loaded from: classes2.dex */
public final class zzec {
    public static final AtomicReference zza = new AtomicReference();
    public static final AtomicReference zzb = new AtomicReference();
    public static final AtomicReference zzc = new AtomicReference();
    private final zzeb zzd;

    public zzec(zzeb zzebVar) {
        this.zzd = zzebVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            String str3 = strArr[i];
            if (str == str3 || str.equals(str3)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String zza(Object[] objArr) {
        if (objArr == null) {
            return o0O0o00O.f15881o00oo0;
        }
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("[");
        for (Object obj : objArr) {
            String zzb2 = obj instanceof Bundle ? zzb((Bundle) obj) : String.valueOf(obj);
            if (zzb2 != null) {
                if (o00oOOo02.length() != 1) {
                    o00oOOo02.append(", ");
                }
                o00oOOo02.append(zzb2);
            }
        }
        o00oOOo02.append("]");
        return o00oOOo02.toString();
    }

    public final String zzb(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (this.zzd.zza()) {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Bundle[{");
            for (String str : bundle.keySet()) {
                if (o00oOOo02.length() != 8) {
                    o00oOOo02.append(", ");
                }
                o00oOOo02.append(zze(str));
                o00oOOo02.append("=");
                Object obj = bundle.get(str);
                o00oOOo02.append(obj instanceof Bundle ? zza(new Object[]{obj}) : obj instanceof Object[] ? zza((Object[]) obj) : obj instanceof ArrayList ? zza(((ArrayList) obj).toArray()) : String.valueOf(obj));
            }
            o00oOOo02.append("}]");
            return o00oOOo02.toString();
        }
        return bundle.toString();
    }

    public final String zzc(zzaw zzawVar) {
        if (this.zzd.zza()) {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("origin=");
            o00oOOo02.append(zzawVar.zzc);
            o00oOOo02.append(",name=");
            o00oOOo02.append(zzd(zzawVar.zza));
            o00oOOo02.append(",params=");
            zzau zzauVar = zzawVar.zzb;
            o00oOOo02.append(zzauVar == null ? null : !this.zzd.zza() ? zzauVar.toString() : zzb(zzauVar.zzc()));
            return o00oOOo02.toString();
        }
        return zzawVar.toString();
    }

    public final String zzd(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzgo.zzc, zzgo.zza, zza);
    }

    public final String zze(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzgp.zzb, zzgp.zza, zzb);
    }

    public final String zzf(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : str.startsWith("_exp_") ? o00oOoO.o00oOOo0("experiment_id(", str, ")") : zzg(str, zzgq.zzb, zzgq.zza, zzc);
    }
}
