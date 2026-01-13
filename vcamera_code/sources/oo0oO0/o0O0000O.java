package oo0oO0;

import android.app.Activity;
import android.content.Context;
import android.os.Environment;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(api = 29)
/* loaded from: classes2.dex */
public class o0O0000O extends o0 {
    public static boolean o00ooO0O() {
        boolean isExternalStorageLegacy;
        isExternalStorageLegacy = Environment.isExternalStorageLegacy();
        return isExternalStorageLegacy;
    }

    @Override // oo0oO0.o0, oo0oO0.o00ooO, oo0oO0.o00ooO0, oo0oO0.o00oo, oo0oO0.o00oo0O
    public boolean o00oOOo0(@oo0oO0 Context context, @oo0oO0 String str) {
        boolean isExternalStorageLegacy;
        if (o0O00O.o00oOo0o(str, o00oo0.f17337o00ooO0)) {
            return o00ooO0(context) && o0O00O.o00oOooO(context, o00oo0.f17337o00ooO0);
        } else if (o0O00O.o00oOo0o(str, o00oo0.f17326o00oo) || o0O00O.o00oOo0o(str, o00oo0.f17338o00ooO00)) {
            return o0O00O.o00oOooO(context, str);
        } else {
            if (!o00oOo00.o00oOooO() && o0O00O.o00oOo0o(str, o00oo0.f17316o00oOo00)) {
                isExternalStorageLegacy = Environment.isExternalStorageLegacy();
                if (!isExternalStorageLegacy) {
                    return false;
                }
            }
            return super.o00oOOo0(context, str);
        }
    }

    @Override // oo0oO0.o0, oo0oO0.o00ooO, oo0oO0.o00ooO0, oo0oO0.o00oo, oo0oO0.o00oo0O
    public boolean o00oOOoO(@oo0oO0 Activity activity, @oo0oO0 String str) {
        boolean isExternalStorageLegacy;
        if (o0O00O.o00oOo0o(str, o00oo0.f17326o00oo)) {
            return !o0O00O.o00oOooO(activity, o00oo0.f17344o00ooOo) ? !o0O00O.o00oo0oO(activity, o00oo0.f17344o00ooOo) : (o0O00O.o00oOooO(activity, str) || o0O00O.o00oo0oO(activity, str)) ? false : true;
        } else if (o0O00O.o00oOo0o(str, o00oo0.f17337o00ooO0)) {
            return (!o00ooO0(activity) || o0O00O.o00oOooO(activity, str) || o0O00O.o00oo0oO(activity, str)) ? false : true;
        } else if (o0O00O.o00oOo0o(str, o00oo0.f17338o00ooO00)) {
            return (o0O00O.o00oOooO(activity, str) || o0O00O.o00oo0oO(activity, str)) ? false : true;
        } else {
            if (!o00oOo00.o00oOooO() && o0O00O.o00oOo0o(str, o00oo0.f17316o00oOo00)) {
                isExternalStorageLegacy = Environment.isExternalStorageLegacy();
                if (!isExternalStorageLegacy) {
                    return true;
                }
            }
            return super.o00oOOoO(activity, str);
        }
    }

    public final boolean o00ooO0(@oo0oO0 Context context) {
        return (!o00oOo00.o00oOo0o() || o00oOo00.o00oOOoO(context) < 33) ? (!o00oOo00.o00oOooO() || o00oOo00.o00oOOoO(context) < 30) ? o0O00O.o00oOooO(context, o00oo0.f17342o00ooOO0) : o0O00O.o00oOooO(context, o00oo0.f17342o00ooOO0) || o00oOOo0(context, o00oo0.f17316o00oOo00) : o0O00O.o00oOooO(context, o00oo0.f17329o00oo0O) || o00oOOo0(context, o00oo0.f17316o00oOo00);
    }
}
