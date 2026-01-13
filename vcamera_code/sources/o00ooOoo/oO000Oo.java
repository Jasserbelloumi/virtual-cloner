package o00ooOoo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import o00oOooO.oo0oO0;
import o00ooo0.o0O000;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class oO000Oo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f8990o00oOOo0 = "android.support.AppLaunchChecker";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f8991o00oOOoO = "startedFromLauncher";

    public static boolean o00oOOo0(@oo0oO0 Context context) {
        return context.getSharedPreferences(f8990o00oOOo0, 0).getBoolean(f8991o00oOOoO, false);
    }

    public static void o00oOOoO(@oo0oO0 Activity activity) {
        Intent intent;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(f8990o00oOOo0, 0);
        if (sharedPreferences.getBoolean(f8991o00oOOoO, false) || (intent = activity.getIntent()) == null || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return;
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory(o0O000.f9574o00oOo0O)) {
            sharedPreferences.edit().putBoolean(f8991o00oOOoO, true).apply();
        }
    }
}
