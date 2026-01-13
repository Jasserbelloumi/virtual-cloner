package oo0oO0;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(api = 26)
/* loaded from: classes2.dex */
public class o00ooO extends o00ooO0 {
    public static boolean o00oo(@oo0oO0 Context context) {
        return context.getPackageManager().canRequestPackageInstalls();
    }

    public static Intent o00oo0oO(@oo0oO0 Context context) {
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
        intent.setData(o0O00O.o00oOoo0(context));
        return !o0O00O.o00oOOo0(context, intent) ? o0O00O.o00oOoOo(context) : intent;
    }

    public static boolean o00ooO00(@oo0oO0 Context context) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        return (o00oOo00.o00oOo00() ? appOpsManager.unsafeCheckOpNoThrow("android:picture_in_picture", context.getApplicationInfo().uid, context.getPackageName()) : appOpsManager.checkOpNoThrow("android:picture_in_picture", context.getApplicationInfo().uid, context.getPackageName())) == 0;
    }

    public static Intent o0O0o(@oo0oO0 Context context) {
        Intent intent = new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS");
        intent.setData(o0O00O.o00oOoo0(context));
        return !o0O00O.o00oOOo0(context, intent) ? o0O00O.o00oOoOo(context) : intent;
    }

    @Override // oo0oO0.o00ooO0, oo0oO0.o00oo, oo0oO0.o00oo0O
    public boolean o00oOOo0(@oo0oO0 Context context, @oo0oO0 String str) {
        return o0O00O.o00oOo0o(str, o00oo0.f17324o00oOooO) ? o00oo(context) : o0O00O.o00oOo0o(str, o00oo0.f17317o00oOo0O) ? o00ooO00(context) : (o0O00O.o00oOo0o(str, o00oo0.f17340o00ooO0o) || o0O00O.o00oOo0o(str, o00oo0.f17336o00ooO)) ? o0O00O.o00oOooO(context, str) : super.o00oOOo0(context, str);
    }

    @Override // oo0oO0.o00ooO0, oo0oO0.o00oo, oo0oO0.o00oo0O
    public boolean o00oOOoO(@oo0oO0 Activity activity, @oo0oO0 String str) {
        if (o0O00O.o00oOo0o(str, o00oo0.f17324o00oOooO) || o0O00O.o00oOo0o(str, o00oo0.f17317o00oOo0O)) {
            return false;
        }
        return (o0O00O.o00oOo0o(str, o00oo0.f17340o00ooO0o) || o0O00O.o00oOo0o(str, o00oo0.f17336o00ooO)) ? (o0O00O.o00oOooO(activity, str) || o0O00O.o00oo0oO(activity, str)) ? false : true : super.o00oOOoO(activity, str);
    }

    @Override // oo0oO0.o00ooO0, oo0oO0.o00oo, oo0oO0.o00oo0O
    public Intent o00oOo00(@oo0oO0 Context context, @oo0oO0 String str) {
        return o0O00O.o00oOo0o(str, o00oo0.f17324o00oOooO) ? o00oo0oO(context) : o0O00O.o00oOo0o(str, o00oo0.f17317o00oOo0O) ? o0O0o(context) : super.o00oOo00(context, str);
    }
}
