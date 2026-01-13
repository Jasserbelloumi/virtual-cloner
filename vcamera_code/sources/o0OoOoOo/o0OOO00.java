package o0OoOoOo;

import android.os.Build;
import android.telephony.SubscriptionManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OOooO0;
@o0OOooO0(22)
/* loaded from: classes.dex */
public class o0OOO00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static Method f16890o00oOOo0;

    @o0OOooO0(29)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static int o00oOOo0(int i) {
            int slotIndex;
            slotIndex = SubscriptionManager.getSlotIndex(i);
            return slotIndex;
        }
    }

    public static int o00oOOo0(int i) {
        if (i == -1) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return o00oOOo0.o00oOOo0(i);
        }
        try {
            if (f16890o00oOOo0 == null) {
                Method declaredMethod = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", Integer.TYPE);
                f16890o00oOOo0 = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Integer num = (Integer) f16890o00oOOo0.invoke(null, Integer.valueOf(i));
            if (num != null) {
                return num.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return -1;
    }
}
