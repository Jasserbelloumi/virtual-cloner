package o0O000;

import android.annotation.SuppressLint;
import android.os.Process;
import android.os.UserHandle;
import java.lang.reflect.Method;
import o00oOooO.o0OOooO0;
/* loaded from: classes.dex */
public final class o0O00OO {

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final Object f10122o00oOOo0 = new Object();

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static Method f10123o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static boolean f10124o00oOo00;

        @SuppressLint({"PrivateApi"})
        public static boolean o00oOOo0(int i) {
            try {
                synchronized (f10122o00oOOo0) {
                    if (!f10124o00oOo00) {
                        f10124o00oOo00 = true;
                        f10123o00oOOoO = Class.forName("android.os.UserId").getDeclaredMethod("isApp", Integer.TYPE);
                    }
                }
                Method method = f10123o00oOOoO;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    @o0OOooO0(17)
    /* loaded from: classes.dex */
    public static class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final Object f10125o00oOOo0 = new Object();

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static Method f10126o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static boolean f10127o00oOo00;

        @SuppressLint({"DiscouragedPrivateApi"})
        public static boolean o00oOOo0(int i) {
            try {
                synchronized (f10125o00oOOo0) {
                    if (!f10127o00oOo00) {
                        f10127o00oOo00 = true;
                        f10126o00oOOoO = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                    }
                }
                Method method = f10126o00oOOoO;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        public static boolean o00oOOo0(int i) {
            return Process.isApplicationUid(i);
        }
    }

    public static boolean o00oOOo0(int i) {
        return Process.isApplicationUid(i);
    }
}
