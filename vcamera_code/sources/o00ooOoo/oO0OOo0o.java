package o00ooOoo;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class oO0OOo0o {

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static void o00oOOo0(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setExact(i, j, pendingIntent);
        }
    }

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static AlarmManager.AlarmClockInfo o00oOOo0(long j, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j, pendingIntent);
        }

        @o0O0O0Oo
        public static void o00oOOoO(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }
    }

    @o0OOooO0(23)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o0O0O0Oo
        public static void o00oOOo0(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
        }

        @o0O0O0Oo
        public static void o00oOOoO(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
        }
    }

    @SuppressLint({"MissingPermission"})
    public static void o00oOOo0(@oo0oO0 AlarmManager alarmManager, long j, @oo0oO0 PendingIntent pendingIntent, @oo0oO0 PendingIntent pendingIntent2) {
        o00oOOoO.o00oOOoO(alarmManager, o00oOOoO.o00oOOo0(j, pendingIntent), pendingIntent2);
    }

    public static void o00oOOoO(@oo0oO0 AlarmManager alarmManager, int i, long j, @oo0oO0 PendingIntent pendingIntent) {
        o00oOo00.o00oOOo0(alarmManager, i, j, pendingIntent);
    }

    public static void o00oOo00(@oo0oO0 AlarmManager alarmManager, int i, long j, @oo0oO0 PendingIntent pendingIntent) {
        o00oOOo0.o00oOOo0(alarmManager, i, j, pendingIntent);
    }

    public static void o00oOooO(@oo0oO0 AlarmManager alarmManager, int i, long j, @oo0oO0 PendingIntent pendingIntent) {
        o00oOo00.o00oOOoO(alarmManager, i, j, pendingIntent);
    }
}
