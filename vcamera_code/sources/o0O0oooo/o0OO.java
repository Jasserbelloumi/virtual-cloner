package o0O0oooo;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import o0O.o00oOo00;
/* loaded from: classes2.dex */
public class o0OO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f12828o00oOOo0 = "o0OO";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final o00oOo00 f12829o00oOOoO = new o00oOo00();

    /* loaded from: classes2.dex */
    public class o00oOOo0 implements InvocationHandler {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o00oOOoO f12830o00oOOo0;

        public o00oOOo0(o00oOOoO o00ooooo2) {
            this.f12830o00oOOo0 = o00ooooo2;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            int intValue = ((Integer) objArr[0]).intValue();
            if (intValue == 0) {
                this.f12830o00oOOo0.o00oOooO(objArr[1], (Context) objArr[2]);
                return null;
            } else if (intValue == 1) {
                this.f12830o00oOOo0.o00oOOoO((Application) objArr[1]);
                return null;
            } else if (intValue == 2) {
                this.f12830o00oOOo0.o00oOOo0((Application) objArr[1]);
                return null;
            } else if (intValue != 3) {
                return null;
            } else {
                this.f12830o00oOOo0.o00oOo00((Application) objArr[1]);
                return null;
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface o00oOOoO {
        void o00oOOo0(Application application);

        void o00oOOoO(Application application);

        void o00oOo00(Application application);

        void o00oOooO(Object obj, Context context);
    }

    public static void o00oOOo0(Application application, Context context) {
        o0OO0oO0.o00oOOo0().o00oOOoO(1, application, context);
    }

    public static int o00oOOoO(String str, int i) {
        return ((Integer) o0OO0oO0.o00oOOo0().o00oOOoO(14, Integer.valueOf(i), str, 0)).intValue();
    }

    public static int o00oOo00(String str, int i) {
        return ((Integer) o0OO0oO0.o00oOOo0().o00oOOoO(13, Integer.valueOf(i), str, 0)).intValue();
    }

    public static int o00oOo0O(String str) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        int[] o00oOoO02 = o00oOoO0(str);
        int i = 0;
        if (o00oOoO02 != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= Integer.MAX_VALUE) {
                    break;
                }
                int length = o00oOoO02.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z = false;
                        break;
                    } else if (o00oOoO02[i3] == i2) {
                        z = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (!z) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        long currentTimeMillis2 = (System.currentTimeMillis() - currentTimeMillis) / 1000;
        return i;
    }

    public static int[] o00oOo0o() {
        return (int[]) o0OO0oO0.o00oOOo0().o00oOOoO(o0OO0oO.f12879o00oooOO, new Object[0]);
    }

    public static List<String> o00oOoO(int i, int i2) {
        return (List) o0OO0oO0.o00oOOo0().o00oOOoO(25, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static int[] o00oOoO0(String str) {
        return (int[]) o0OO0oO0.o00oOOo0().o00oOOoO(o0OO0oO.f12880o00oooOo, str);
    }

    public static Intent o00oOoOO(String str, int i) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.INFO");
        intent.setPackage(str);
        List<ResolveInfo> o00oo0oO2 = o00oo0oO(intent, null, 0, i);
        if (o00oo0oO2 == null || o00oo0oO2.size() <= 0) {
            intent.removeCategory("android.intent.category.INFO");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(str);
            o00oo0oO2 = o00oo0oO(intent, null, 0, i);
        }
        if (o00oo0oO2 == null || o00oo0oO2.size() <= 0) {
            return null;
        }
        Intent intent2 = new Intent(intent);
        intent2.setFlags(268435456);
        intent2.setClassName(o00oo0oO2.get(0).activityInfo.packageName, o00oo0oO2.get(0).activityInfo.name);
        return intent2;
    }

    public static PackageInfo o00oOoOo(String str, int i, int i2) {
        return (PackageInfo) o0OO0oO0.o00oOOo0().o00oOOoO(21, Integer.valueOf(i), str, Integer.valueOf(i2));
    }

    public static Bundle o00oOoo0(String str, int i, int i2) {
        return (Bundle) o0OO0oO0.o00oOOo0().o00oOOoO(26, str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static ActivityInfo o00oOooO(ComponentName componentName, int i, int i2) {
        return (ActivityInfo) o0OO0oO0.o00oOOo0().o00oOOoO(24, componentName, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static Map<String, Object> o00oOooo() {
        return (Map) o0OO0oO0.o00oOOo0().o00oOOoO(o0OO0oO.f12839o0, new Object[0]);
    }

    public static Object o00oo(Object obj) {
        return Integer.valueOf(((Integer) o0OO0oO0.o00oOOo0().o00oOOoO(42, obj)).intValue());
    }

    public static o00oOo00 o00oo0() {
        return f12829o00oOOoO;
    }

    public static <T> T o00oo00O(String str, T t) {
        try {
            T t2 = (T) o00oOooo().get(str);
            return t2 == null ? t : t2;
        } catch (Throwable unused) {
            return t;
        }
    }

    public static int o00oo0O(String str, int i, boolean z) {
        int i2 = o0OO0oO.f12840o00oOOo0;
        if (z) {
            i2 |= o0OO0oO.f12841o00oOOoO;
        }
        return ((Integer) o0OO0oO0.o00oOOo0().o00oOOoO(10, Integer.valueOf(i), str, Integer.valueOf(i2))).intValue();
    }

    public static boolean o00oo0O0(int i, String str) {
        return ((Boolean) o0OO0oO0.o00oOOo0().o00oOOoO(16, Integer.valueOf(i), str)).booleanValue();
    }

    public static Map<String, List<Integer>> o00oo0OO(int i) {
        return (Map) o0OO0oO0.o00oOOo0().o00oOOoO(28, Integer.valueOf(i), 0);
    }

    public static int o00oo0Oo(String str, int i, boolean z) {
        o0OO0oO0 o00oOOo02 = o0OO0oO0.o00oOOo0();
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = str;
        objArr[2] = Integer.valueOf(z ? o0OO0oO.f12841o00oOOoO : 0);
        return ((Integer) o00oOOo02.o00oOOoO(10, objArr)).intValue();
    }

    public static void o00oo0o() {
        o0OO0oO0.o00oOOo0().o00oOOoO(2, new Object[0]);
    }

    public static void o00oo0o0(int i, String str, String str2) {
        o0OO0oO0.o00oOOo0().o00oOOoO(15, Integer.valueOf(i), str, str2);
    }

    public static List<ResolveInfo> o00oo0oO(Intent intent, String str, int i, int i2) {
        return (List) o0OO0oO0.o00oOOo0().o00oOOoO(23, intent, str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Deprecated
    public static boolean o00ooO(String str, int i) {
        return ((Boolean) o0OO0oO0.o00oOOo0().o00oOOoO(32, str, Integer.valueOf(i), 0)).booleanValue();
    }

    public static void o00ooO0(int i, o0O.o00oOOoO o00ooooo2) {
        f12829o00oOOoO.o00oOOoO(i, o00ooooo2);
    }

    public static Object o00ooO00(Object obj) {
        return Integer.valueOf(((Integer) o0OO0oO0.o00oOOo0().o00oOOoO(44, obj)).intValue());
    }

    public static ResolveInfo o00ooO0O(Intent intent, String str, int i, int i2) {
        return (ResolveInfo) o0OO0oO0.o00oOOo0().o00oOOoO(22, intent, str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static int o00ooO0o(Intent intent, int i) {
        return ((Integer) o0OO0oO0.o00oOOo0().o00oOOoO(33, intent, null, Integer.valueOf(i))).intValue();
    }

    public static void o00ooOO(Object obj) {
        o0OO0oO0.o00oOOo0().o00oOOoO(43, obj);
    }

    public static int o00ooOO0(String str, int i) {
        return ((Integer) o0OO0oO0.o00oOOo0().o00oOOoO(11, Integer.valueOf(i), str, 0)).intValue();
    }

    public static void o00ooOOo(Object obj) {
        o0OO0oO0.o00oOOo0().o00oOOoO(45, obj);
    }

    public static void o00ooOo0(int i) {
        f12829o00oOOoO.o00oOo00(i);
    }

    public static void o0O0o(o00oOOoO o00ooooo2) {
        o0OO0oO0.o00oOOo0().o00oOOoO(o0OO0oO.f12887o0O00000, new o00oOOo0(o00ooooo2));
    }
}
