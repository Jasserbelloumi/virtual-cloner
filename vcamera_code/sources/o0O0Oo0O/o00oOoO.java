package o0O0Oo0O;

import android.os.Trace;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(29)
/* loaded from: classes.dex */
public final class o00oOoO {
    public static void o00oOOo0(@oo0oO0 String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    public static void o00oOOoO(@oo0oO0 String str, int i) {
        Trace.endAsyncSection(str, i);
    }

    public static void o00oOo00(@oo0oO0 String str, int i) {
        Trace.setCounter(str, i);
    }
}
