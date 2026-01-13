package o00ooOoo;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class oO000o00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f8992o00oOOo0 = 0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f8993o00oOOoO = 1;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f8994o00oOo00 = 2;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f8995o00oOooO = 3;

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static int o00oOOo0(AppOpsManager appOpsManager, String str, int i, String str2) {
            return appOpsManager.noteOp(str, i, str2);
        }

        @o0O0O0Oo
        public static int o00oOOoO(AppOpsManager appOpsManager, String str, int i, String str2) {
            return appOpsManager.noteOpNoThrow(str, i, str2);
        }
    }

    @o0OOooO0(23)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static <T> T o00oOOo0(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @o0O0O0Oo
        public static int o00oOOoO(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        @o0O0O0Oo
        public static int o00oOo00(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        @o0O0O0Oo
        public static String o00oOooO(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    @o0OOooO0(29)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o0O0O0Oo
        public static int o00oOOo0(@o0OO00OO AppOpsManager appOpsManager, @oo0oO0 String str, int i, @oo0oO0 String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        @o0O0O0Oo
        @oo0oO0
        public static String o00oOOoO(@oo0oO0 Context context) {
            String opPackageName;
            opPackageName = context.getOpPackageName();
            return opPackageName;
        }

        @o0O0O0Oo
        @o0OO00OO
        public static AppOpsManager o00oOo00(@oo0oO0 Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    public static int o00oOOo0(@oo0oO0 Context context, int i, @oo0oO0 String str, @oo0oO0 String str2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager o00oOo002 = o00oOo00.o00oOo00(context);
            int o00oOOo02 = o00oOo00.o00oOOo0(o00oOo002, str, Binder.getCallingUid(), str2);
            return o00oOOo02 != 0 ? o00oOOo02 : o00oOo00.o00oOOo0(o00oOo002, str, i, o00oOo00.o00oOOoO(context));
        }
        return o00oOo0O(context, str, str2);
    }

    public static int o00oOOoO(@oo0oO0 Context context, @oo0oO0 String str, int i, @oo0oO0 String str2) {
        return o00oOOo0.o00oOOo0((AppOpsManager) context.getSystemService("appops"), str, i, str2);
    }

    public static int o00oOo00(@oo0oO0 Context context, @oo0oO0 String str, int i, @oo0oO0 String str2) {
        return o00oOOo0.o00oOOoO((AppOpsManager) context.getSystemService("appops"), str, i, str2);
    }

    public static int o00oOo0O(@oo0oO0 Context context, @oo0oO0 String str, @oo0oO0 String str2) {
        return o00oOOoO.o00oOo00((AppOpsManager) o00oOOoO.o00oOOo0(context, AppOpsManager.class), str, str2);
    }

    @o0OO00OO
    public static String o00oOo0o(@oo0oO0 String str) {
        return o00oOOoO.o00oOooO(str);
    }

    public static int o00oOooO(@oo0oO0 Context context, @oo0oO0 String str, @oo0oO0 String str2) {
        return o00oOOoO.o00oOOoO((AppOpsManager) o00oOOoO.o00oOOo0(context, AppOpsManager.class), str, str2);
    }
}
