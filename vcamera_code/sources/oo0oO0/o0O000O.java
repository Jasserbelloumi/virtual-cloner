package oo0oO0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(api = 30)
/* loaded from: classes2.dex */
public class o0O000O extends o0O0000O {
    public static boolean o00ooO() {
        boolean isExternalStorageManager;
        isExternalStorageManager = Environment.isExternalStorageManager();
        return isExternalStorageManager;
    }

    public static Intent o00ooO0o(@oo0oO0 Context context) {
        Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
        intent.setData(o0O00O.o00oOoo0(context));
        if (!o0O00O.o00oOOo0(context, intent)) {
            intent = new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION");
        }
        return !o0O00O.o00oOOo0(context, intent) ? o0O00O.o00oOoOo(context) : intent;
    }

    @Override // oo0oO0.o0O0000O, oo0oO0.o0, oo0oO0.o00ooO, oo0oO0.o00ooO0, oo0oO0.o00oo, oo0oO0.o00oo0O
    public boolean o00oOOo0(@oo0oO0 Context context, @oo0oO0 String str) {
        boolean isExternalStorageManager;
        if (o0O00O.o00oOo0o(str, o00oo0.f17316o00oOo00)) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            return isExternalStorageManager;
        }
        return super.o00oOOo0(context, str);
    }

    @Override // oo0oO0.o0O0000O, oo0oO0.o0, oo0oO0.o00ooO, oo0oO0.o00ooO0, oo0oO0.o00oo, oo0oO0.o00oo0O
    public boolean o00oOOoO(@oo0oO0 Activity activity, @oo0oO0 String str) {
        if (o0O00O.o00oOo0o(str, o00oo0.f17316o00oOo00)) {
            return false;
        }
        return super.o00oOOoO(activity, str);
    }

    @Override // oo0oO0.o00ooO, oo0oO0.o00ooO0, oo0oO0.o00oo, oo0oO0.o00oo0O
    public Intent o00oOo00(@oo0oO0 Context context, @oo0oO0 String str) {
        return o0O00O.o00oOo0o(str, o00oo0.f17316o00oOo00) ? o00ooO0o(context) : super.o00oOo00(context, str);
    }
}
