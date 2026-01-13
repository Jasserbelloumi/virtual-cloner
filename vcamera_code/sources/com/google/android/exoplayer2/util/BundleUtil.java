package com.google.android.exoplayer2.util;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public final class BundleUtil {
    private static final String TAG = "BundleUtil";
    @o0OO00OO
    private static Method getIBinderMethod;
    @o0OO00OO
    private static Method putIBinderMethod;

    private BundleUtil() {
    }

    @o0OO00OO
    public static IBinder getBinder(Bundle bundle, @o0OO00OO String str) {
        return Util.SDK_INT >= 18 ? bundle.getBinder(str) : getBinderByReflection(bundle, str);
    }

    @o0OO00OO
    private static IBinder getBinderByReflection(Bundle bundle, @o0OO00OO String str) {
        String str2;
        Method method = getIBinderMethod;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                getIBinderMethod = method2;
                method2.setAccessible(true);
                method = getIBinderMethod;
            } catch (NoSuchMethodException e) {
                e = e;
                str2 = "Failed to retrieve getIBinder method";
                Log.i(TAG, str2, e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            e = e2;
            str2 = "Failed to invoke getIBinder via reflection";
            Log.i(TAG, str2, e);
            return null;
        }
    }

    public static void putBinder(Bundle bundle, @o0OO00OO String str, @o0OO00OO IBinder iBinder) {
        if (Util.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            putBinderByReflection(bundle, str, iBinder);
        }
    }

    private static void putBinderByReflection(Bundle bundle, @o0OO00OO String str, @o0OO00OO IBinder iBinder) {
        Method method = putIBinderMethod;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                putIBinderMethod = method2;
                method2.setAccessible(true);
                method = putIBinderMethod;
            } catch (NoSuchMethodException e) {
                Log.i(TAG, "Failed to retrieve putIBinder method", e);
                return;
            }
        }
        try {
            method.invoke(bundle, str, iBinder);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            Log.i(TAG, "Failed to invoke putIBinder via reflection", e2);
        }
    }
}
