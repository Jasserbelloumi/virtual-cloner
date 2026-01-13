package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import o00oOooO.o0OO00OO;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;
/* loaded from: classes2.dex */
public final class zzdl {
    @Pure
    public static int zza(int i, int i2, int i3) {
        if (i < 0 || i >= i3) {
            throw new IndexOutOfBoundsException();
        }
        return i;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static Object zzb(@o0OO00OO Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static String zzc(@o0OO00OO String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    @Pure
    public static void zzd(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    public static void zze(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    @Pure
    public static void zzf(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }
}
