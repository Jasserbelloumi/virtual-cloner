package o00ooOoo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class oO00O0o0 {

    @o0OOooO0(18)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static IBinder o00oOOo0(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        @o0O0O0Oo
        public static void o00oOOoO(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* loaded from: classes.dex */
    public static class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final String f8996o00oOOo0 = "BundleCompatBaseImpl";

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static Method f8997o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static boolean f8998o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static boolean f8999o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static Method f9000o00oOooO;

        public static IBinder o00oOOo0(Bundle bundle, String str) {
            if (!f8998o00oOo00) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    f8997o00oOOoO = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f8998o00oOo00 = true;
            }
            Method method2 = f8997o00oOOoO;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    f8997o00oOOoO = null;
                }
            }
            return null;
        }

        public static void o00oOOoO(Bundle bundle, String str, IBinder iBinder) {
            if (!f8999o00oOo0O) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    f9000o00oOooO = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f8999o00oOo0O = true;
            }
            Method method2 = f9000o00oOooO;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    f9000o00oOooO = null;
                }
            }
        }
    }

    @o0OO00OO
    public static IBinder o00oOOo0(@oo0oO0 Bundle bundle, @o0OO00OO String str) {
        return o00oOOo0.o00oOOo0(bundle, str);
    }

    public static void o00oOOoO(@oo0oO0 Bundle bundle, @o0OO00OO String str, @o0OO00OO IBinder iBinder) {
        o00oOOo0.o00oOOoO(bundle, str, iBinder);
    }
}
