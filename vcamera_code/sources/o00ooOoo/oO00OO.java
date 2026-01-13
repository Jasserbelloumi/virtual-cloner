package o00ooOoo;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.o00oOo0O;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class oO00OO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f9001o00oOOo0 = "NavUtils";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f9002o00oOOoO = "android.support.PARENT_ACTIVITY";

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static Intent o00oOOo0(Activity activity) {
            return activity.getParentActivityIntent();
        }

        @o0O0O0Oo
        public static boolean o00oOOoO(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        @o0O0O0Oo
        public static boolean o00oOo00(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    @o0OO00OO
    public static Intent o00oOOo0(@oo0oO0 Activity activity) {
        Intent o00oOOo02 = o00oOOo0.o00oOOo0(activity);
        if (o00oOOo02 != null) {
            return o00oOOo02;
        }
        String o00oOooO2 = o00oOooO(activity);
        if (o00oOooO2 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, o00oOooO2);
        try {
            return o00oOo0O(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @o0OO00OO
    public static Intent o00oOOoO(@oo0oO0 Context context, @oo0oO0 ComponentName componentName) throws PackageManager.NameNotFoundException {
        String o00oOo0O2 = o00oOo0O(context, componentName);
        if (o00oOo0O2 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), o00oOo0O2);
        return o00oOo0O(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    @o0OO00OO
    public static Intent o00oOo00(@oo0oO0 Context context, @oo0oO0 Class<?> cls) throws PackageManager.NameNotFoundException {
        String o00oOo0O2 = o00oOo0O(context, new ComponentName(context, cls));
        if (o00oOo0O2 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(context, o00oOo0O2);
        return o00oOo0O(context, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
    }

    @o0OO00OO
    public static String o00oOo0O(@oo0oO0 Context context, @oo0oO0 ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString(f9002o00oOOoO)) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    public static void o00oOo0o(@oo0oO0 Activity activity) {
        Intent o00oOOo02 = o00oOOo0(activity);
        if (o00oOOo02 != null) {
            o00oOOo0.o00oOOoO(activity, o00oOOo02);
            return;
        }
        StringBuilder o00oOOo03 = o00oOo0O.o00oOOo0("Activity ");
        o00oOOo03.append(activity.getClass().getSimpleName());
        o00oOOo03.append(" does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
        throw new IllegalArgumentException(o00oOOo03.toString());
    }

    public static boolean o00oOoO(@oo0oO0 Activity activity, @oo0oO0 Intent intent) {
        return o00oOOo0.o00oOo00(activity, intent);
    }

    public static void o00oOoO0(@oo0oO0 Activity activity, @oo0oO0 Intent intent) {
        o00oOOo0.o00oOOoO(activity, intent);
    }

    @o0OO00OO
    public static String o00oOooO(@oo0oO0 Activity activity) {
        try {
            return o00oOo0O(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
