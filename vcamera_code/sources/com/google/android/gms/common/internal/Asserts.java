package com.google.android.gms.common.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import javax.annotation.Nullable;
import o00oOooO.oo0oO0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
@KeepForSdk
/* loaded from: classes.dex */
public final class Asserts {
    private Asserts() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void checkMainThread(@oo0oO0 String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        String.valueOf(Thread.currentThread());
        String.valueOf(Looper.getMainLooper().getThread());
        throw new IllegalStateException(str);
    }

    @KeepForSdk
    public static void checkNotMainThread(@oo0oO0 String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        String.valueOf(Thread.currentThread());
        String.valueOf(Looper.getMainLooper().getThread());
        throw new IllegalStateException(str);
    }

    @EnsuresNonNull({"#1"})
    @KeepForSdk
    public static void checkNotNull(@Nullable Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    @EnsuresNonNull({"#1"})
    @KeepForSdk
    public static void checkNotNull(@Nullable Object obj, @oo0oO0 Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    @KeepForSdk
    public static void checkNull(@oo0oO0 Object obj) {
        if (obj != null) {
            throw new IllegalArgumentException("non-null reference");
        }
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
}
