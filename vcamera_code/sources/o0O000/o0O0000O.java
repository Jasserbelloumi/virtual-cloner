package o0O000;

import android.annotation.SuppressLint;
import android.os.Message;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o0O0000O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static boolean f10119o00oOOo0 = true;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static boolean f10120o00oOOoO = true;

    @o0OOooO0(22)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static boolean o00oOOo0(Message message) {
            return message.isAsynchronous();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOOoO(Message message, boolean z) {
            message.setAsynchronous(z);
        }
    }

    @SuppressLint({"NewApi"})
    public static boolean o00oOOo0(@oo0oO0 Message message) {
        return o00oOOo0.o00oOOo0(message);
    }

    @SuppressLint({"NewApi"})
    public static void o00oOOoO(@oo0oO0 Message message, boolean z) {
        o00oOOo0.o00oOOoO(message, z);
    }
}
