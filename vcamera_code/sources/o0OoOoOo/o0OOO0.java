package o0OoOoOo;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO0;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import oo0oO0.o00oo0;
/* loaded from: classes.dex */
public class o0OOO0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static Method f16888o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static Method f16889o00oOOoO;

    @o0OOooO0(23)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        @o0OO00OO
        @SuppressLint({"MissingPermission"})
        @o0OO0oO0(o00oo0.f17352o00oooO)
        public static String o00oOOo0(TelephonyManager telephonyManager, int i) {
            return telephonyManager.getDeviceId(i);
        }
    }

    @o0OOooO0(26)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        @o0OO00OO
        @SuppressLint({"MissingPermission"})
        @o0OO0oO0(o00oo0.f17352o00oooO)
        public static String o00oOOo0(TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }

    @o0OOooO0(30)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o0O0O0Oo
        public static int o00oOOo0(TelephonyManager telephonyManager) {
            int subscriptionId;
            subscriptionId = telephonyManager.getSubscriptionId();
            return subscriptionId;
        }
    }

    @o0OO00OO
    @o0OO0oO0(o00oo0.f17352o00oooO)
    @SuppressLint({"MissingPermission"})
    public static String o00oOOo0(@oo0oO0 TelephonyManager telephonyManager) {
        return o00oOOoO.o00oOOo0(telephonyManager);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int o00oOOoO(@oo0oO0 TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 30) {
            return o00oOo00.o00oOOo0(telephonyManager);
        }
        try {
            if (f16889o00oOOoO == null) {
                Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getSubId", new Class[0]);
                f16889o00oOOoO = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Integer num = (Integer) f16889o00oOOoO.invoke(telephonyManager, new Object[0]);
            if (num == null || num.intValue() == -1) {
                return Integer.MAX_VALUE;
            }
            return num.intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return Integer.MAX_VALUE;
        }
    }
}
