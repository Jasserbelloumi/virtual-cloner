package o0OO0;

import android.support.v4.media.o00oOoO;
import android.util.Log;
/* loaded from: classes2.dex */
public class o00oOOoO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f12936o00oOOo0 = "KingPlayer";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f12937o00oOOoO = "|";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static boolean f12938o00oOo00 = false;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f12939o00oOo0O = 1;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f12940o00oOo0o = 2;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f12941o00oOoO = 4;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f12942o00oOoO0 = 3;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f12943o00oOoOO = 5;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f12944o00oOoOo = 6;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f12945o00oOoo0 = 7;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static int f12946o00oOooO = 1;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final String f12947o00oOooo = "%s.%s(%s:%d)";

    public o00oOOoO() {
        throw new AssertionError();
    }

    public static void o00oOOo0(String str) {
    }

    public static void o00oOOoO(String str, Throwable th) {
    }

    public static void o00oOo00(Throwable th) {
        if (!f12938o00oOo00 || f12946o00oOooO > 3) {
            return;
        }
        Log.getStackTraceString(th);
    }

    public static void o00oOo0O(String str, Throwable th) {
    }

    public static void o00oOo0o(Throwable th) {
        if (!f12938o00oOo00 || f12946o00oOooO > 6) {
            return;
        }
        Log.getStackTraceString(th);
    }

    public static String o00oOoO() {
        return "VLC_Wrap";
    }

    public static String o00oOoO0(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        return o00oOoO.o00oOOo0(f12936o00oOOo0, f12937o00oOOoO, String.format(f12947o00oOooo, className.substring(className.lastIndexOf(".") + 1), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber())));
    }

    public static int o00oOoOO() {
        return f12946o00oOooO;
    }

    public static StackTraceElement o00oOoOo(int i) {
        return Thread.currentThread().getStackTrace()[i];
    }

    public static String o00oOoo0(Throwable th) {
        return Log.getStackTraceString(th);
    }

    public static void o00oOooO(String str) {
    }

    public static void o00oOooo(String str) {
    }

    public static void o00oo(String str) {
    }

    public static void o00oo0(Throwable th) {
        if (!f12938o00oOo00 || f12946o00oOooO > 4) {
            return;
        }
        Log.getStackTraceString(th);
    }

    public static void o00oo00O(String str, Throwable th) {
    }

    public static void o00oo0O(String str) {
        if (!f12938o00oOo00 || f12946o00oOooO > 1) {
            return;
        }
        System.out.print(str);
    }

    public static void o00oo0O0(Object obj) {
        if (!f12938o00oOo00 || f12946o00oOooO > 1) {
            return;
        }
        System.out.print(obj);
    }

    public static boolean o00oo0OO() {
        return f12938o00oOo00;
    }

    public static void o00oo0Oo(String str) {
        if (!f12938o00oOo00 || f12946o00oOooO > 1) {
            return;
        }
        System.out.printf(str, new Object[0]);
    }

    public static void o00oo0o(String str) {
        if (!f12938o00oOo00 || f12946o00oOooO > 1) {
            return;
        }
        System.out.println(str);
    }

    public static void o00oo0o0(Object obj) {
        if (!f12938o00oOo00 || f12946o00oOooO > 1) {
            return;
        }
        System.out.println(obj);
    }

    public static void o00oo0oO(int i) {
        f12946o00oOooO = i;
    }

    public static void o00ooO(Throwable th) {
        if (!f12938o00oOo00 || f12946o00oOooO > 5) {
            return;
        }
        Log.getStackTraceString(th);
    }

    public static void o00ooO0(Throwable th) {
        if (!f12938o00oOo00 || f12946o00oOooO > 2) {
            return;
        }
        Log.getStackTraceString(th);
    }

    public static void o00ooO00(String str, Throwable th) {
    }

    public static void o00ooO0O(String str) {
    }

    public static void o00ooO0o(String str, Throwable th) {
    }

    public static void o00ooOO(String str, Throwable th) {
        if (!f12938o00oOo00 || f12946o00oOooO > 7) {
            return;
        }
        Log.wtf("VLC_Wrap", String.valueOf(str), th);
    }

    public static void o00ooOO0(String str) {
        if (!f12938o00oOo00 || f12946o00oOooO > 7) {
            return;
        }
        Log.wtf("VLC_Wrap", String.valueOf(str));
    }

    public static void o00ooOOo(Throwable th) {
        if (!f12938o00oOo00 || f12946o00oOooO > 7) {
            return;
        }
        Log.wtf("VLC_Wrap", Log.getStackTraceString(th));
    }

    public static void o0O0o(boolean z) {
        f12938o00oOo00 = z;
    }
}
