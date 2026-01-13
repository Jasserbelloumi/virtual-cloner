package oo0oO0;

import android.app.Activity;
import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(api = 31)
/* loaded from: classes2.dex */
public class o0O000Oo extends o0O000O {
    public static boolean o00ooOO(@oo0oO0 Context context) {
        boolean canScheduleExactAlarms;
        canScheduleExactAlarms = ((AlarmManager) context.getSystemService(AlarmManager.class)).canScheduleExactAlarms();
        return canScheduleExactAlarms;
    }

    public static Intent o00ooOO0(@oo0oO0 Context context) {
        Intent intent = new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
        intent.setData(o0O00O.o00oOoo0(context));
        return !o0O00O.o00oOOo0(context, intent) ? o0O00O.o00oOoOo(context) : intent;
    }

    @Override // oo0oO0.o0O000O, oo0oO0.o0O0000O, oo0oO0.o0, oo0oO0.o00ooO, oo0oO0.o00ooO0, oo0oO0.o00oo, oo0oO0.o00oo0O
    public boolean o00oOOo0(@oo0oO0 Context context, @oo0oO0 String str) {
        return o0O00O.o00oOo0o(str, o00oo0.f17315o00oOOoO) ? o00ooOO(context) : (o0O00O.o00oOo0o(str, o00oo0.f17333o00oo0o) || o0O00O.o00oOo0o(str, o00oo0.f17335o00oo0oO) || o0O00O.o00oOo0o(str, o00oo0.f17364o0O0o)) ? o0O00O.o00oOooO(context, str) : super.o00oOOo0(context, str);
    }

    @Override // oo0oO0.o0O000O, oo0oO0.o0O0000O, oo0oO0.o0, oo0oO0.o00ooO, oo0oO0.o00ooO0, oo0oO0.o00oo, oo0oO0.o00oo0O
    public boolean o00oOOoO(@oo0oO0 Activity activity, @oo0oO0 String str) {
        if (o0O00O.o00oOo0o(str, o00oo0.f17315o00oOOoO)) {
            return false;
        }
        return (o0O00O.o00oOo0o(str, o00oo0.f17333o00oo0o) || o0O00O.o00oOo0o(str, o00oo0.f17335o00oo0oO) || o0O00O.o00oOo0o(str, o00oo0.f17364o0O0o)) ? (o0O00O.o00oOooO(activity, str) || o0O00O.o00oo0oO(activity, str)) ? false : true : (activity.getApplicationInfo().targetSdkVersion < 31 || !o0O00O.o00oOo0o(str, o00oo0.f17326o00oo)) ? super.o00oOOoO(activity, str) : (o0O00O.o00oOooO(activity, o00oo0.f17344o00ooOo) || o0O00O.o00oOooO(activity, o00oo0.f17346o00ooOoO)) ? (o0O00O.o00oOooO(activity, str) || o0O00O.o00oo0oO(activity, str)) ? false : true : (o0O00O.o00oo0oO(activity, o00oo0.f17344o00ooOo) || o0O00O.o00oo0oO(activity, o00oo0.f17346o00ooOoO)) ? false : true;
    }

    @Override // oo0oO0.o0O000O, oo0oO0.o00ooO, oo0oO0.o00ooO0, oo0oO0.o00oo, oo0oO0.o00oo0O
    public Intent o00oOo00(@oo0oO0 Context context, @oo0oO0 String str) {
        return o0O00O.o00oOo0o(str, o00oo0.f17315o00oOOoO) ? o00ooOO0(context) : super.o00oOo00(context, str);
    }
}
