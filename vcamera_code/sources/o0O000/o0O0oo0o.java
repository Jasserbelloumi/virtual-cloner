package o0O000;

import android.os.UserHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(17)
/* loaded from: classes.dex */
public class o0O0oo0o {
    @o0OO00OO

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static Method f10134o00oOOo0;
    @o0OO00OO

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static Constructor<UserHandle> f10135o00oOOoO;

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        private o00oOOo0() {
        }

        @oo0oO0
        public static UserHandle o00oOOo0(int i) {
            return UserHandle.getUserHandleForUid(i);
        }
    }

    public static Method o00oOOo0() throws NoSuchMethodException {
        if (f10134o00oOOo0 == null) {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("getUserId", Integer.TYPE);
            f10134o00oOOo0 = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f10134o00oOOo0;
    }

    public static Constructor<UserHandle> o00oOOoO() throws NoSuchMethodException {
        if (f10135o00oOOoO == null) {
            Constructor<UserHandle> declaredConstructor = UserHandle.class.getDeclaredConstructor(Integer.TYPE);
            f10135o00oOOoO = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return f10135o00oOOoO;
    }

    @oo0oO0
    public static UserHandle o00oOo00(int i) {
        return o00oOOo0.o00oOOo0(i);
    }
}
