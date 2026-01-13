package o0O0o00;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00ooOoo.oOo000Oo;
import o0O0Ooo.o0O00O0;
import o0O0Ooo0.o0O00000;
import o0O0o0Oo.o0O0000O;
import o0O0o0o0.o00oOoO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oOOo0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f12309o00oOOo0 = o0O00000.o00oOo0o("Alarms");

    public static void o00oOOo0(@oo0oO0 Context context, @oo0oO0 o0O00O0 o0o00o0, @oo0oO0 String str) {
        o0O0000O o00ooOoo2 = o0o00o0.o00ooo0o().o00ooOoo();
        o0O0o0Oo.o0O00000 o00oOOoO2 = o00ooOoo2.o00oOOoO(str);
        if (o00oOOoO2 != null) {
            o00oOOoO(context, str, o00oOOoO2.f12390o00oOOoO);
            o0O00000.o00oOo00().o00oOOo0(f12309o00oOOo0, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            o00ooOoo2.o00oOooO(str);
        }
    }

    public static void o00oOOoO(@oo0oO0 Context context, @oo0oO0 String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(oOo000Oo.f9218o0O00oO0);
        PendingIntent service = PendingIntent.getService(context, i, androidx.work.impl.background.systemalarm.o00oOOo0.o00oOOoO(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        o0O00000.o00oOo00().o00oOOo0(f12309o00oOOo0, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void o00oOo00(@oo0oO0 Context context, @oo0oO0 o0O00O0 o0o00o0, @oo0oO0 String str, long j) {
        int o00oOOoO2;
        WorkDatabase o00ooo0o2 = o0o00o0.o00ooo0o();
        o0O0000O o00ooOoo2 = o00ooo0o2.o00ooOoo();
        o0O0o0Oo.o0O00000 o00oOOoO3 = o00ooOoo2.o00oOOoO(str);
        if (o00oOOoO3 != null) {
            o00oOOoO(context, str, o00oOOoO3.f12390o00oOOoO);
            o00oOOoO2 = o00oOOoO3.f12390o00oOOoO;
        } else {
            o00oOOoO2 = new o00oOoO(o00ooo0o2).o00oOOoO();
            o00ooOoo2.o00oOOo0(new o0O0o0Oo.o0O00000(str, o00oOOoO2));
        }
        o00oOooO(context, str, o00oOOoO2, j);
    }

    public static void o00oOooO(@oo0oO0 Context context, @oo0oO0 String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(oOo000Oo.f9218o0O00oO0);
        PendingIntent service = PendingIntent.getService(context, i, androidx.work.impl.background.systemalarm.o00oOOo0.o00oOOoO(context, str), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
