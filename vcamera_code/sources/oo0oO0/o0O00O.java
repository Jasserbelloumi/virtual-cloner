package oo0oO0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes2.dex */
public final class o0O00O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final Handler f17390o00oOOo0 = new Handler(Looper.getMainLooper());

    public static boolean o00oOOo0(@oo0oO0 Context context, @oo0oO0 Intent intent) {
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    @oo0oO0
    public static <T> ArrayList<T> o00oOOoO(@o0OO00OO T... tArr) {
        ArrayList<T> arrayList = new ArrayList<>(tArr != null ? tArr.length : 0);
        if (tArr != null && tArr.length != 0) {
            for (T t : tArr) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @SafeVarargs
    @oo0oO0
    public static <T> ArrayList<T> o00oOo00(@o0OO00OO T[]... tArr) {
        ArrayList<T> arrayList = new ArrayList<>();
        if (tArr != null && tArr.length != 0) {
            for (T[] tArr2 : tArr) {
                arrayList.addAll(o00oOOoO(tArr2));
            }
        }
        return arrayList;
    }

    public static boolean o00oOo0O(@oo0oO0 Collection<String> collection, @oo0oO0 String str) {
        if (collection.isEmpty()) {
            return false;
        }
        for (String str2 : collection) {
            if (o00oOo0o(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean o00oOo0o(@oo0oO0 String str, @oo0oO0 String str2) {
        int length = str.length();
        if (length != str2.length()) {
            return false;
        }
        for (int i = length - 1; i >= 0; i--) {
            if (str.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    @SuppressLint({"PrivateApi"})
    public static int o00oOoO(@oo0oO0 Context context, @oo0oO0 String str) {
        AssetManager assets = context.getAssets();
        try {
            if (o00oOo00.o00oOOoO(context) >= 28 && Build.VERSION.SDK_INT < 30) {
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                declaredMethod.setAccessible(true);
                Method method = (Method) declaredMethod.invoke(AssetManager.class, "findCookieForPath", new Class[]{String.class});
                if (method != null) {
                    method.setAccessible(true);
                    Integer num = (Integer) method.invoke(context.getAssets(), str);
                    if (num != null) {
                        return num.intValue();
                    }
                }
            }
            Integer num2 = (Integer) assets.getClass().getDeclaredMethod("addAssetPath", String.class).invoke(assets, str);
            if (num2 != null) {
                return num2.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0007  */
    @o00oOooO.o0OO00OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.app.Activity o00oOoO0(@o00oOooO.oo0oO0 android.content.Context r2) {
        /*
        L0:
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
            return r2
        L7:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            r1 = 0
            if (r0 == 0) goto L14
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            if (r2 != 0) goto L0
        L14:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: oo0oO0.o0O00O.o00oOoO0(android.content.Context):android.app.Activity");
    }

    @o0OO00OO
    public static o00oOOo0 o00oOoOO(Context context) {
        o00oOOo0 o00oOOoO2;
        int o00oOoO2 = o00oOoO(context, context.getApplicationInfo().sourceDir);
        o00oOOo0 o00oooo02 = null;
        if (o00oOoO2 == 0) {
            return null;
        }
        try {
            o00oOOoO2 = o00oOOoO.o00oOOoO(context, o00oOoO2);
        } catch (IOException e) {
            e = e;
        } catch (XmlPullParserException e2) {
            e = e2;
        }
        try {
            if (TextUtils.equals(context.getPackageName(), o00oOOoO2.f17259o00oOOo0)) {
                return o00oOOoO2;
            }
            return null;
        } catch (IOException e3) {
            e = e3;
            o00oooo02 = o00oOOoO2;
            e.printStackTrace();
            return o00oooo02;
        } catch (XmlPullParserException e4) {
            e = e4;
            o00oooo02 = o00oOOoO2;
            e.printStackTrace();
            return o00oooo02;
        }
    }

    public static Intent o00oOoOo(@oo0oO0 Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(o00oOoo0(context));
        if (o00oOOo0(context, intent)) {
            return intent;
        }
        Intent intent2 = new Intent("android.settings.APPLICATION_SETTINGS");
        return !o00oOOo0(context, intent2) ? new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS") : intent2;
    }

    public static Uri o00oOoo0(@oo0oO0 Context context) {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("package:");
        o00oOOo02.append(context.getPackageName());
        return Uri.parse(o00oOOo02.toString());
    }

    @o0OOooO0(api = 23)
    public static boolean o00oOooO(@oo0oO0 Context context, @oo0oO0 String str) {
        return context.checkSelfPermission(str) == 0;
    }

    public static Intent o00oOooo(@oo0oO0 Context context, @o0OO00OO List<String> list) {
        if (list == null || list.isEmpty() || !o00oo0OO.o00oOOo0(list)) {
            return o00oOoOo(context);
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size == 3 && o00oOo00.o00oOooO() && o00oOo0O(list, o00oo0.f17316o00oOo00) && o00oOo0O(list, o00oo0.f17342o00ooOO0) && o00oOo0O(list, o00oo0.f17341o00ooOO)) {
                    return o00oo0OO.o00oOo0o(context, o00oo0.f17316o00oOo00);
                }
            } else if (!o00oOo00.o00oOo0o() && o00oOo0O(list, o00oo0.f17328o00oo00O) && o00oOo0O(list, o00oo0.f17327o00oo0)) {
                return o00oo0OO.o00oOo0o(context, o00oo0.f17328o00oo00O);
            }
            return o00oOoOo(context);
        }
        return o00oo0OO.o00oOo0o(context, list.get(0));
    }

    public static boolean o00oo0(@oo0oO0 Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean o00oo00O(@oo0oO0 Activity activity) {
        int rotation = (o00oOo00.o00oOooO() ? activity.getDisplay() : activity.getWindowManager().getDefaultDisplay()).getRotation();
        return rotation == 2 || rotation == 3;
    }

    @SuppressLint({"SwitchIntDef"})
    public static void o00oo0O(@oo0oO0 Activity activity) {
        try {
            int i = activity.getResources().getConfiguration().orientation;
            if (i == 1) {
                activity.setRequestedOrientation(o00oo00O(activity) ? 9 : 1);
            } else if (i == 2) {
                activity.setRequestedOrientation(o00oo00O(activity) ? 8 : 0);
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    public static boolean o00oo0O0(@oo0oO0 String str) {
        return o00oOo0o(str, o00oo0.f17316o00oOo00) || o00oOo0o(str, o00oo0.f17324o00oOooO) || o00oOo0o(str, o00oo0.f17318o00oOo0o) || o00oOo0o(str, o00oo0.f17320o00oOoO0) || o00oOo0o(str, o00oo0.f17328o00oo00O) || o00oOo0o(str, o00oo0.f17322o00oOoOo) || o00oOo0o(str, o00oo0.f17315o00oOOoO) || o00oOo0o(str, o00oo0.f17323o00oOoo0) || o00oOo0o(str, o00oo0.f17321o00oOoOO) || o00oOo0o(str, o00oo0.f17319o00oOoO) || o00oOo0o(str, o00oo0.f17325o00oOooo) || o00oOo0o(str, o00oo0.f17317o00oOo0O);
    }

    public static boolean o00oo0OO(@oo0oO0 Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null || !bundle.containsKey("ScopedStorage")) {
                return false;
            }
            return Boolean.parseBoolean(String.valueOf(bundle.get("ScopedStorage")));
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void o00oo0Oo(Activity activity, String[] strArr, int[] iArr) {
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            boolean o00oOoo02 = o00oo0OO.o00oOoo0(str);
            if (!o00oOo00.o00oOo0o() && (o00oOo0o(str, o00oo0.f17327o00oo0) || o00oOo0o(str, o00oo0.f17331o00oo0OO) || o00oOo0o(str, o00oo0.f17330o00oo0O0) || o00oOo0o(str, o00oo0.f17329o00oo0O) || o00oOo0o(str, o00oo0.f17332o00oo0Oo) || o00oOo0o(str, o00oo0.f17334o00oo0o0))) {
                o00oOoo02 = true;
            }
            if (!o00oOo00.o00oOo0O() && (o00oOo0o(str, o00oo0.f17333o00oo0o) || o00oOo0o(str, o00oo0.f17335o00oo0oO) || o00oOo0o(str, o00oo0.f17364o0O0o))) {
                o00oOoo02 = true;
            }
            if (!o00oOo00.o00oOo00() && (o00oOo0o(str, o00oo0.f17326o00oo) || o00oOo0o(str, o00oo0.f17338o00ooO00) || o00oOo0o(str, o00oo0.f17337o00ooO0))) {
                o00oOoo02 = true;
            }
            if (o00oOo0o(str, o00oo0.f17314o00oOOo0) ? true : o00oOoo02) {
                iArr[i] = o00oo0OO.o00oOoO0(activity, str) ? 0 : -1;
            }
        }
    }

    public static void o00oo0o(@oo0oO0 Runnable runnable, long j) {
        f17390o00oOOo0.postDelayed(runnable, j);
    }

    public static void o00oo0o0(@oo0oO0 List<String> list, @oo0oO0 Runnable runnable) {
        long j = o00oOo00.o00oOooO() ? 200L : 300L;
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        f17390o00oOOo0.postDelayed(runnable, lowerCase.contains("huawei") ? 300L : (lowerCase.contains("xiaomi") && o00oOo00.o00oOooO() && o00oOo0O(list, o00oo0.f17319o00oOoO)) ? 1000L : j);
    }

    @o0OOooO0(api = 23)
    public static boolean o00oo0oO(@oo0oO0 Activity activity, @oo0oO0 String str) {
        if (Build.VERSION.SDK_INT == 31) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
