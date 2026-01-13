package o0O000;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public final class o0O00OOO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f10128o00oOOo0 = "TraceCompat";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static long f10129o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static Method f10130o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static Method f10131o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static Method f10132o00oOo0o;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static Method f10133o00oOooO;

    @o0OOooO0(18)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static void o00oOOo0(String str) {
            Trace.beginSection(str);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOOoO() {
            Trace.endSection();
        }
    }

    @o0OOooO0(29)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o00oOooO.o0O0O0Oo
        public static void o00oOOo0(String str, int i) {
            Trace.beginAsyncSection(str, i);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOOoO(String str, int i) {
            Trace.endAsyncSection(str, i);
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOo00() {
            boolean isEnabled;
            isEnabled = Trace.isEnabled();
            return isEnabled;
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOooO(String str, long j) {
            Trace.setCounter(str, j);
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f10129o00oOOoO = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f10130o00oOo00 = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f10133o00oOooO = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f10131o00oOo0O = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f10132o00oOo0o = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }

    public static void o00oOOo0(@oo0oO0 String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            o00oOOoO.o00oOOo0(str, i);
            return;
        }
        try {
            f10133o00oOooO.invoke(null, Long.valueOf(f10129o00oOOoO), str, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }

    public static void o00oOOoO(@oo0oO0 String str) {
        o00oOOo0.o00oOOo0(str);
    }

    public static void o00oOo00(@oo0oO0 String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            o00oOOoO.o00oOOoO(str, i);
            return;
        }
        try {
            f10131o00oOo0O.invoke(null, Long.valueOf(f10129o00oOOoO), str, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }

    public static boolean o00oOo0O() {
        if (Build.VERSION.SDK_INT >= 29) {
            return o00oOOoO.o00oOo00();
        }
        try {
            return ((Boolean) f10130o00oOo00.invoke(null, Long.valueOf(f10129o00oOOoO))).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void o00oOo0o(@oo0oO0 String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            o00oOOoO.o00oOooO(str, i);
            return;
        }
        try {
            f10132o00oOo0o.invoke(null, Long.valueOf(f10129o00oOOoO), str, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }

    public static void o00oOooO() {
        o00oOOo0.o00oOOoO();
    }
}
