package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooOO0.o0O000O;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
@KeepForSdk
/* loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @KeepForSdk
    public static void checkArgument(boolean z, @oo0oO0 Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    public static void checkArgument(boolean z, @oo0oO0 String str, @oo0oO0 Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @KeepForSdk
    public static void checkHandlerThread(@oo0oO0 Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            throw new IllegalStateException(o0O000O.o00oOOo0("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", myLooper != null ? myLooper.getThread().getName() : "null current looper", "."));
        }
    }

    @KeepForSdk
    public static void checkHandlerThread(@oo0oO0 Handler handler, @oo0oO0 String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    public static void checkMainThread() {
        checkMainThread("Must be called on the main application thread");
    }

    @KeepForSdk
    public static void checkMainThread(@oo0oO0 String str) {
        if (!com.google.android.gms.common.util.zzb.zza()) {
            throw new IllegalStateException(str);
        }
    }

    @oo0oO0
    @EnsuresNonNull({"#1"})
    @KeepForSdk
    public static String checkNotEmpty(@o0OO00OO String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    @oo0oO0
    @EnsuresNonNull({"#1"})
    @KeepForSdk
    public static String checkNotEmpty(@o0OO00OO String str, @oo0oO0 Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    @KeepForSdk
    public static void checkNotMainThread() {
        checkNotMainThread("Must not be called on the main application thread");
    }

    @KeepForSdk
    public static void checkNotMainThread(@oo0oO0 String str) {
        if (com.google.android.gms.common.util.zzb.zza()) {
            throw new IllegalStateException(str);
        }
    }

    @oo0oO0
    @EnsuresNonNull({"#1"})
    @KeepForSdk
    public static <T> T checkNotNull(@o0OO00OO T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    @oo0oO0
    @EnsuresNonNull({"#1"})
    @KeepForSdk
    public static <T> T checkNotNull(@oo0oO0 T t, @oo0oO0 Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @KeepForSdk
    public static int checkNotZero(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    @KeepForSdk
    public static int checkNotZero(int i, @oo0oO0 Object obj) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    public static long checkNotZero(long j) {
        if (j != 0) {
            return j;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    @KeepForSdk
    public static long checkNotZero(long j, @oo0oO0 Object obj) {
        if (j != 0) {
            return j;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @KeepForSdk
    public static void checkState(boolean z, @oo0oO0 Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    public static void checkState(boolean z, @oo0oO0 String str, @oo0oO0 Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
