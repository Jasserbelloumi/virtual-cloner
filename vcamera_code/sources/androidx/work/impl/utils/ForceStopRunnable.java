package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import com.google.android.exoplayer2.C;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o00ooOoo.oOo000Oo;
import o0O000.o00oOOo0;
import o0O0Ooo.o0O000Oo;
import o0O0Ooo.o0O00O0;
import o0O0Ooo0.o00ooO0;
import o0O0Ooo0.o0O00000;
import o0O0Ooo0.o0OoO00O;
import o0O0o00O.o00oOo00;
import o0O0o0Oo.o0O00;
import o0O0o0Oo.o0O00O0o;
import o0O0o0Oo.o0OoO00O;
import o0O0o0o0.o00oo0O0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final long f5714o00oo = 300;
    @o0o0000

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final String f5715o00oo0o = "ACTION_FORCE_STOP_RESCHEDULE";
    @o0o0000

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f5717o00oo0oO = 3;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f5719o0O0o = -1;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o0O00O0 f5720o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Context f5721o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f5722o00oo0Oo = 0;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final String f5716o00oo0o0 = o0O00000.o00oOo0o("ForceStopRunnable");

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final long f5718o00ooO00 = TimeUnit.DAYS.toMillis(3650);

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final String f5723o00oOOo0 = o0O00000.o00oOo0o("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(@oo0oO0 Context context, @o0OO00OO Intent intent) {
            if (intent == null || !ForceStopRunnable.f5715o00oo0o.equals(intent.getAction())) {
                return;
            }
            o0O00000.o00oOo00().o00oOoO0(f5723o00oOOo0, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.o00oOoO0(context);
        }
    }

    public ForceStopRunnable(@oo0oO0 Context context, @oo0oO0 o0O00O0 o0o00o0) {
        this.f5721o00oo0O0 = context.getApplicationContext();
        this.f5720o00oo0O = o0o00o0;
    }

    @o0o0000
    public static Intent o00oOo00(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction(f5715o00oo0o);
        return intent;
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void o00oOoO0(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(oOo000Oo.f9218o0O00oO0);
        PendingIntent o00oOooO2 = o00oOooO(context, o00oOOo0.o00oOoOO() ? 167772160 : C.BUFFER_FLAG_FIRST_SAMPLE);
        long currentTimeMillis = System.currentTimeMillis() + f5718o00ooO00;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, o00oOooO2);
        }
    }

    public static PendingIntent o00oOooO(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, o00oOo00(context), i);
    }

    @o0o0000
    public boolean o00oOOo0() {
        boolean o00oOoOO2 = o00oOo00.o00oOoOO(this.f5721o00oo0O0, this.f5720o00oo0O);
        WorkDatabase o00ooo0o2 = this.f5720o00oo0O.o00ooo0o();
        o0O00O0o o00ooo0O2 = o00ooo0o2.o00ooo0O();
        o0O00 o00ooo02 = o00ooo0o2.o00ooo0();
        o00ooo0o2.o00oOo00();
        try {
            List<o0OoO00O> o00ooO002 = o00ooo0O2.o00ooO00();
            boolean z = (o00ooO002 == null || o00ooO002.isEmpty()) ? false : true;
            if (z) {
                for (o0OoO00O o0ooo00o : o00ooO002) {
                    o00ooo0O2.o00oo0Oo(o0OoO00O.o00oOOo0.ENQUEUED, o0ooo00o.f12462o00oOOo0);
                    o00ooo0O2.o00oo0O0(o0ooo00o.f12462o00oOOo0, -1L);
                }
            }
            o00ooo02.o00oOooO();
            o00ooo0o2.o00ooO0o();
            return z || o00oOoOO2;
        } finally {
            o00ooo0o2.o00oOoOO();
        }
    }

    @o0o0000
    public void o00oOOoO() {
        boolean o00oOOo02 = o00oOOo0();
        if (o00oOoO()) {
            o0O00000.o00oOo00().o00oOOo0(f5716o00oo0o0, "Rescheduling Workers.", new Throwable[0]);
            this.f5720o00oo0O.o00oooo();
            this.f5720o00oo0O.o00ooOoo().o00oOo0o(false);
        } else if (o00oOo0O()) {
            o0O00000.o00oOo00().o00oOOo0(f5716o00oo0o0, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f5720o00oo0O.o00oooo();
        } else if (o00oOOo02) {
            o0O00000.o00oOo00().o00oOOo0(f5716o00oo0o0, "Found unfinished work, scheduling it.", new Throwable[0]);
            o0O000Oo.o00oOOoO(this.f5720o00oo0O.o00ooOo0(), this.f5720o00oo0O.o00ooo0o(), this.f5720o00oo0O.o00ooo0O());
        }
    }

    @o0o0000
    @SuppressLint({"ClassVerificationFailure"})
    public boolean o00oOo0O() {
        try {
            PendingIntent o00oOooO2 = o00oOooO(this.f5721o00oo0O0, o00oOOo0.o00oOoOO() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (o00oOooO2 != null) {
                    o00oOooO2.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f5721o00oo0O0.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i = 0; i < historicalProcessExitReasons.size(); i++) {
                        if (historicalProcessExitReasons.get(i).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (o00oOooO2 == null) {
                o00oOoO0(this.f5721o00oo0O0);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e) {
            o0O00000.o00oOo00().o00oOoO(f5716o00oo0o0, "Ignoring exception", e);
            return true;
        }
    }

    @o0o0000
    public boolean o00oOo0o() {
        androidx.work.o00oOOo0 o00ooOo02 = this.f5720o00oo0O.o00ooOo0();
        if (TextUtils.isEmpty(o00ooOo02.f5742o00oOoO0)) {
            o0O00000.o00oOo00().o00oOOo0(f5716o00oo0o0, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean o00oOOoO2 = o00oo0O0.o00oOOoO(this.f5721o00oo0O0, o00ooOo02);
        o0O00000.o00oOo00().o00oOOo0(f5716o00oo0o0, String.format("Is default app process = %s", Boolean.valueOf(o00oOOoO2)), new Throwable[0]);
        return o00oOOoO2;
    }

    @o0o0000
    public boolean o00oOoO() {
        return this.f5720o00oo0O.o00ooOoo().o00oOo00();
    }

    @o0o0000
    public void o00oOoOO(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        try {
            if (o00oOo0o()) {
                while (true) {
                    o0O0Ooo.o0O00.o00oOo0O(this.f5721o00oo0O0);
                    o0O00000.o00oOo00().o00oOOo0(f5716o00oo0o0, "Performing cleanup operations.", new Throwable[0]);
                    try {
                        o00oOOoO();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                        i = this.f5722o00oo0Oo + 1;
                        this.f5722o00oo0Oo = i;
                        if (i >= 3) {
                            o0O00000 o00oOo002 = o0O00000.o00oOo00();
                            String str = f5716o00oo0o0;
                            o00oOo002.o00oOOoO(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            o00ooO0 o00ooo02 = this.f5720o00oo0O.o00ooOo0().f5740o00oOo0o;
                            if (o00ooo02 == null) {
                                throw illegalStateException;
                            }
                            o0O00000.o00oOo00().o00oOOo0(str, "Routing exception to the specified exception handler", illegalStateException);
                            o00ooo02.o00oOOo0(illegalStateException);
                        } else {
                            o0O00000.o00oOo00().o00oOOo0(f5716o00oo0o0, String.format("Retrying after %s", Long.valueOf(i * 300)), e);
                            o00oOoOO(this.f5722o00oo0Oo * 300);
                        }
                    }
                    o0O00000.o00oOo00().o00oOOo0(f5716o00oo0o0, String.format("Retrying after %s", Long.valueOf(i * 300)), e);
                    o00oOoOO(this.f5722o00oo0Oo * 300);
                }
            }
        } finally {
            this.f5720o00oo0O.o00oooo0();
        }
    }
}
