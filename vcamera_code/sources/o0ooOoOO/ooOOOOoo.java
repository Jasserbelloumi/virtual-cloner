package o0ooOoOO;

import android.support.v4.media.o00oOo0O;
import android.text.TextUtils;
import java.util.Locale;
import o00oOoOo.o00oo;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class ooOOOOoo {
    public static void o00oOOo0(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void o00oOOoO(boolean z, @oo0oO0 Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void o00oOo00(boolean z, @oo0oO0 String str, @oo0oO0 Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static double o00oOo0O(double d, double d2, double d3, @oo0oO0 String str) {
        if (d >= d2) {
            if (d <= d3) {
                return d;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d2), Double.valueOf(d3)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d2), Double.valueOf(d3)));
    }

    public static float o00oOo0o(float f, float f2, float f3, @oo0oO0 String str) {
        if (f >= f2) {
            if (f <= f3) {
                return f;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f2), Float.valueOf(f3)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f2), Float.valueOf(f3)));
    }

    public static long o00oOoO(long j, long j2, long j3, @oo0oO0 String str) {
        if (j >= j2) {
            if (j <= j3) {
                return j;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j2), Long.valueOf(j3)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j2), Long.valueOf(j3)));
    }

    public static int o00oOoO0(int i, int i2, int i3, @oo0oO0 String str) {
        if (i >= i2) {
            if (i <= i3) {
                return i;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    @o0O0o00O(from = 0)
    public static int o00oOoOO(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    @o0O0o00O(from = 0)
    public static int o00oOoOo(int i, @o0OO00OO String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    public static int o00oOoo0(int i, int i2) {
        if ((i & i2) == i) {
            return i;
        }
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Requested flags 0x");
        o00oOOo02.append(Integer.toHexString(i));
        o00oOOo02.append(", but only 0x");
        o00oOOo02.append(Integer.toHexString(i2));
        o00oOOo02.append(" are allowed");
        throw new IllegalArgumentException(o00oOOo02.toString());
    }

    public static float o00oOooO(float f, @oo0oO0 String str) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException(o00oo.o00oOOo0(str, " must not be NaN"));
        }
        if (Float.isInfinite(f)) {
            throw new IllegalArgumentException(o00oo.o00oOOo0(str, " must not be infinite"));
        }
        return f;
    }

    @oo0oO0
    public static <T> T o00oOooo(@o0OO00OO T t) {
        t.getClass();
        return t;
    }

    public static void o00oo0(boolean z) {
        o00oo0OO(z, null);
    }

    @oo0oO0
    public static <T> T o00oo00O(@o0OO00OO T t, @oo0oO0 Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @oo0oO0
    public static <T extends CharSequence> T o00oo0O(@o0OO00OO T t, @oo0oO0 Object obj) {
        if (TextUtils.isEmpty(t)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t;
    }

    @oo0oO0
    public static <T extends CharSequence> T o00oo0O0(@o0OO00OO T t) {
        if (TextUtils.isEmpty(t)) {
            throw new IllegalArgumentException();
        }
        return t;
    }

    public static void o00oo0OO(boolean z, @o0OO00OO String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    @oo0oO0
    public static <T extends CharSequence> T o00oo0Oo(@o0OO00OO T t, @oo0oO0 String str, @oo0oO0 Object... objArr) {
        if (TextUtils.isEmpty(t)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t;
    }
}
