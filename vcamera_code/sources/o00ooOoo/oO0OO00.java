package o00ooOoo;

import android.app.Service;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class oO0OO00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f9120o00oOOo0 = 1;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f9121o00oOOoO = 1;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f9122o00oOo00 = 2;

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static void o00oOOo0(Service service, int i) {
            service.stopForeground(i);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o00oOOoO {
    }

    public static void o00oOOo0(@oo0oO0 Service service, int i) {
        o00oOOo0.o00oOOo0(service, i);
    }
}
