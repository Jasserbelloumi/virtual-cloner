package o0O0Oo0O;

import android.annotation.SuppressLint;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oOo00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f11891o00oOOo0 = "Trace";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static long f11892o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static Method f11893o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static Method f11894o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static Method f11895o00oOo0o;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static Method f11896o00oOooO;

    @SuppressLint({"NewApi"})
    public static void o00oOOo0(@oo0oO0 String str, int i) {
        try {
            if (f11896o00oOooO == null) {
                Trace.beginAsyncSection(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        o00oOOoO(str, i);
    }

    public static void o00oOOoO(@oo0oO0 String str, int i) {
        try {
            if (f11896o00oOooO == null) {
                f11896o00oOooO = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f11896o00oOooO.invoke(null, Long.valueOf(f11892o00oOOoO), str, Integer.valueOf(i));
        } catch (Exception e) {
            o00oOoO0("asyncTraceBegin", e);
        }
    }

    public static void o00oOo00(@oo0oO0 String str) {
        Trace.beginSection(str);
    }

    public static void o00oOo0O(@oo0oO0 String str, int i) {
        try {
            if (f11894o00oOo0O == null) {
                f11894o00oOo0O = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f11894o00oOo0O.invoke(null, Long.valueOf(f11892o00oOOoO), str, Integer.valueOf(i));
        } catch (Exception e) {
            o00oOoO0("asyncTraceEnd", e);
        }
    }

    public static void o00oOo0o() {
        Trace.endSection();
    }

    @SuppressLint({"NewApi"})
    public static boolean o00oOoO() {
        boolean isEnabled;
        try {
            if (f11893o00oOo00 == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return o00oOoOO();
    }

    public static void o00oOoO0(@oo0oO0 String str, @oo0oO0 Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static boolean o00oOoOO() {
        try {
            if (f11893o00oOo00 == null) {
                f11892o00oOOoO = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f11893o00oOo00 = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f11893o00oOo00.invoke(null, Long.valueOf(f11892o00oOOoO))).booleanValue();
        } catch (Exception e) {
            o00oOoO0("isTagEnabled", e);
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    public static void o00oOoOo(@oo0oO0 String str, int i) {
        try {
            if (f11895o00oOo0o == null) {
                Trace.setCounter(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        o00oOoo0(str, i);
    }

    public static void o00oOoo0(@oo0oO0 String str, int i) {
        try {
            if (f11895o00oOo0o == null) {
                f11895o00oOo0o = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f11895o00oOo0o.invoke(null, Long.valueOf(f11892o00oOOoO), str, Integer.valueOf(i));
        } catch (Exception e) {
            o00oOoO0("traceCounter", e);
        }
    }

    @SuppressLint({"NewApi"})
    public static void o00oOooO(@oo0oO0 String str, int i) {
        try {
            if (f11894o00oOo0O == null) {
                Trace.endAsyncSection(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        o00oOo0O(str, i);
    }
}
