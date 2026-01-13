package oo0oO0;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.os.PowerManager;
import android.provider.Settings;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(api = 23)
/* loaded from: classes2.dex */
public class o00ooO0 extends o00oo {
    public static Intent o00oOooo(@oo0oO0 Context context) {
        Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intent.setData(o0O00O.o00oOoo0(context));
        if (!o0O00O.o00oOOo0(context, intent)) {
            intent = new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
        }
        return !o0O00O.o00oOOo0(context, intent) ? o0O00O.o00oOoOo(context) : intent;
    }

    public static Intent o00oo0(@oo0oO0 Context context) {
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.setData(o0O00O.o00oOoo0(context));
        return !o0O00O.o00oOOo0(context, intent) ? o0O00O.o00oOoOo(context) : intent;
    }

    public static Intent o00oo00O(@oo0oO0 Context context) {
        Intent intent;
        if (o00oOo00.o00oOo00()) {
            intent = new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_DETAIL_SETTINGS");
            intent.setData(o0O00O.o00oOoo0(context));
        } else {
            intent = null;
        }
        if (intent == null || !o0O00O.o00oOOo0(context, intent)) {
            intent = new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
        }
        return !o0O00O.o00oOOo0(context, intent) ? o0O00O.o00oOoOo(context) : intent;
    }

    public static boolean o00oo0O(@oo0oO0 Context context) {
        return ((NotificationManager) context.getSystemService(NotificationManager.class)).isNotificationPolicyAccessGranted();
    }

    public static boolean o00oo0O0(@oo0oO0 Context context) {
        return ((PowerManager) context.getSystemService(PowerManager.class)).isIgnoringBatteryOptimizations(context.getPackageName());
    }

    public static Intent o00oo0OO(@oo0oO0 Context context) {
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(o0O00O.o00oOoo0(context));
        return !o0O00O.o00oOOo0(context, intent) ? o0O00O.o00oOoOo(context) : intent;
    }

    public static boolean o00oo0Oo(@oo0oO0 Context context) {
        return Settings.System.canWrite(context);
    }

    public static boolean o00oo0o0(@oo0oO0 Context context) {
        return Settings.canDrawOverlays(context);
    }

    @Override // oo0oO0.o00oo, oo0oO0.o00oo0O
    public boolean o00oOOo0(@oo0oO0 Context context, @oo0oO0 String str) {
        if (o0O00O.o00oo0O0(str)) {
            return o0O00O.o00oOo0o(str, o00oo0.f17318o00oOo0o) ? Settings.canDrawOverlays(context) : o0O00O.o00oOo0o(str, o00oo0.f17320o00oOoO0) ? Settings.System.canWrite(context) : o0O00O.o00oOo0o(str, o00oo0.f17321o00oOoOO) ? o00oo0O(context) : o0O00O.o00oOo0o(str, o00oo0.f17319o00oOoO) ? o00oo0O0(context) : (o00oOo00.o00oOooO() || !o0O00O.o00oOo0o(str, o00oo0.f17316o00oOo00)) ? super.o00oOOo0(context, str) : o0O00O.o00oOooO(context, o00oo0.f17342o00ooOO0) && o0O00O.o00oOooO(context, o00oo0.f17341o00ooOO);
        }
        if (!o00oOo00.o00oOo0o()) {
            if (o0O00O.o00oOo0o(str, o00oo0.f17327o00oo0)) {
                return super.o00oOOo0(context, str);
            }
            if (o0O00O.o00oOo0o(str, o00oo0.f17331o00oo0OO)) {
                return o0O00O.o00oOooO(context, o00oo0.f17344o00ooOo);
            }
            if (o0O00O.o00oOo0o(str, o00oo0.f17330o00oo0O0)) {
                return o0O00O.o00oOooO(context, o00oo0.f17313o0);
            }
            if (o0O00O.o00oOo0o(str, o00oo0.f17329o00oo0O) || o0O00O.o00oOo0o(str, o00oo0.f17332o00oo0Oo) || o0O00O.o00oOo0o(str, o00oo0.f17334o00oo0o0)) {
                return o0O00O.o00oOooO(context, o00oo0.f17342o00ooOO0) && o0O00O.o00oOooO(context, o00oo0.f17341o00ooOO);
            }
        }
        if (!o00oOo00.o00oOo0O()) {
            if (o0O00O.o00oOo0o(str, o00oo0.f17333o00oo0o)) {
                return o0O00O.o00oOooO(context, o00oo0.f17344o00ooOo);
            }
            if (o0O00O.o00oOo0o(str, o00oo0.f17335o00oo0oO) || o0O00O.o00oOo0o(str, o00oo0.f17364o0O0o)) {
                return true;
            }
        }
        if (!o00oOo00.o00oOo00()) {
            if (o0O00O.o00oOo0o(str, o00oo0.f17326o00oo)) {
                return o0O00O.o00oOooO(context, o00oo0.f17344o00ooOo);
            }
            if (o0O00O.o00oOo0o(str, o00oo0.f17338o00ooO00)) {
                return true;
            }
            if (o0O00O.o00oOo0o(str, o00oo0.f17337o00ooO0)) {
                return o0O00O.o00oOooO(context, o00oo0.f17342o00ooOO0);
            }
        }
        if (!o0O00O.o00oOo0o(str, o00oo0.f17314o00oOOo0) || o00oo0o(context)) {
            return o0O00O.o00oOooO(context, str);
        }
        return true;
    }

    @Override // oo0oO0.o00oo, oo0oO0.o00oo0O
    public boolean o00oOOoO(@oo0oO0 Activity activity, @oo0oO0 String str) {
        if (o0O00O.o00oo0O0(str)) {
            return false;
        }
        if (!o00oOo00.o00oOo0o()) {
            if (o0O00O.o00oOo0o(str, o00oo0.f17327o00oo0)) {
                return false;
            }
            if (o0O00O.o00oOo0o(str, o00oo0.f17331o00oo0OO)) {
                return (o0O00O.o00oOooO(activity, o00oo0.f17344o00ooOo) || o0O00O.o00oo0oO(activity, o00oo0.f17344o00ooOo)) ? false : true;
            } else if (o0O00O.o00oOo0o(str, o00oo0.f17330o00oo0O0)) {
                return (o0O00O.o00oOooO(activity, o00oo0.f17313o0) || o0O00O.o00oo0oO(activity, o00oo0.f17313o0)) ? false : true;
            } else if (o0O00O.o00oOo0o(str, o00oo0.f17329o00oo0O) || o0O00O.o00oOo0o(str, o00oo0.f17332o00oo0Oo) || o0O00O.o00oOo0o(str, o00oo0.f17334o00oo0o0)) {
                return (o0O00O.o00oOooO(activity, o00oo0.f17342o00ooOO0) || o0O00O.o00oo0oO(activity, o00oo0.f17342o00ooOO0) || o0O00O.o00oOooO(activity, o00oo0.f17341o00ooOO) || o0O00O.o00oo0oO(activity, o00oo0.f17341o00ooOO)) ? false : true;
            }
        }
        if (!o00oOo00.o00oOo0O()) {
            if (o0O00O.o00oOo0o(str, o00oo0.f17333o00oo0o)) {
                return (o0O00O.o00oOooO(activity, o00oo0.f17344o00ooOo) || o0O00O.o00oo0oO(activity, o00oo0.f17344o00ooOo)) ? false : true;
            } else if (o0O00O.o00oOo0o(str, o00oo0.f17335o00oo0oO) || o0O00O.o00oOo0o(str, o00oo0.f17364o0O0o)) {
                return false;
            }
        }
        if (!o00oOo00.o00oOo00()) {
            if (o0O00O.o00oOo0o(str, o00oo0.f17326o00oo)) {
                return (o0O00O.o00oOooO(activity, o00oo0.f17344o00ooOo) || o0O00O.o00oo0oO(activity, o00oo0.f17344o00ooOo)) ? false : true;
            } else if (o0O00O.o00oOo0o(str, o00oo0.f17338o00ooO00)) {
                return false;
            } else {
                if (o0O00O.o00oOo0o(str, o00oo0.f17337o00ooO0)) {
                    return (o0O00O.o00oOooO(activity, o00oo0.f17342o00ooOO0) || o0O00O.o00oo0oO(activity, o00oo0.f17342o00ooOO0)) ? false : true;
                }
            }
        }
        return o0O00O.o00oOo0o(str, o00oo0.f17314o00oOOo0) ? (!o00oo0o(activity) || o0O00O.o00oOooO(activity, str) || o0O00O.o00oo0oO(activity, str)) ? false : true : (o0O00O.o00oOooO(activity, str) || o0O00O.o00oo0oO(activity, str)) ? false : true;
    }

    @Override // oo0oO0.o00oo, oo0oO0.o00oo0O
    public Intent o00oOo00(@oo0oO0 Context context, @oo0oO0 String str) {
        return o0O00O.o00oOo0o(str, o00oo0.f17318o00oOo0o) ? o00oo0OO(context) : o0O00O.o00oOo0o(str, o00oo0.f17320o00oOoO0) ? o00oo0(context) : o0O00O.o00oOo0o(str, o00oo0.f17321o00oOoOO) ? o00oo00O(context) : o0O00O.o00oOo0o(str, o00oo0.f17319o00oOoO) ? o00oOooo(context) : super.o00oOo00(context, str);
    }

    public final boolean o00oo0o(Context context) {
        try {
            PermissionInfo permissionInfo = context.getPackageManager().getPermissionInfo(o00oo0.f17314o00oOOo0, 0);
            if (permissionInfo != null) {
                return permissionInfo.getProtection() == 1;
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "oem_installed_apps_runtime_permission_enable") == 1;
        } catch (Settings.SettingNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
