package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.o00oOo0O;
import java.util.HashMap;
import java.util.Map;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oO0Oo;
import o00oOooO.oo0oO0;
import o0O0Ooo.o0O0000O;
import o0O0Ooo0.o0O00000;
import o0O0o0Oo.o0OoO00O;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oOOo0 implements o0O0000O {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final String f5590o00oo = "ACTION_CONSTRAINTS_CHANGED";

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final String f5591o00oo0o = "ACTION_SCHEDULE_WORK";

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final String f5592o00oo0o0 = o0O00000.o00oOo0o("CommandHandler");

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final String f5593o00oo0oO = "ACTION_DELAY_MET";

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final long f5594o00ooO = 600000;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final String f5595o00ooO0 = "ACTION_EXECUTION_COMPLETED";

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final String f5596o00ooO00 = "ACTION_RESCHEDULE";

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final String f5597o00ooO0O = "KEY_WORKSPEC_ID";

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final String f5598o00ooO0o = "KEY_NEEDS_RESCHEDULE";

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final String f5599o0O0o = "ACTION_STOP_WORK";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Context f5601o00oo0O0;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Map<String, o0O0000O> f5600o00oo0O = new HashMap();

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final Object f5602o00oo0Oo = new Object();

    public o00oOOo0(@oo0oO0 Context context) {
        this.f5601o00oo0O0 = context;
    }

    public static Intent o00oOOo0(@oo0oO0 Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(f5590o00oo);
        return intent;
    }

    public static Intent o00oOOoO(@oo0oO0 Context context, @oo0oO0 String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(f5593o00oo0oO);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent o00oOo00(@oo0oO0 Context context, @oo0oO0 String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(f5595o00ooO0);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra(f5598o00ooO0o, z);
        return intent;
    }

    public static Intent o00oOo0o(@oo0oO0 Context context, @oo0oO0 String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(f5591o00oo0o);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent o00oOoO0(@oo0oO0 Context context, @oo0oO0 String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(f5599o0O0o);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent o00oOooO(@oo0oO0 Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(f5596o00ooO00);
        return intent;
    }

    public static boolean o00oo0(@o0OO00OO Bundle bundle, @oo0oO0 String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // o0O0Ooo.o0O0000O
    public void o00oOo0O(@oo0oO0 String str, boolean z) {
        synchronized (this.f5602o00oo0Oo) {
            o0O0000O remove = this.f5600o00oo0O.remove(str);
            if (remove != null) {
                remove.o00oOo0O(str, z);
            }
        }
    }

    public final void o00oOoO(@oo0oO0 Intent intent, int i, @oo0oO0 o00oOo0O o00ooo0o2) {
        o0O00000.o00oOo00().o00oOOo0(f5592o00oo0o0, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new o00oOOoO(this.f5601o00oo0O0, i, o00ooo0o2).o00oOOo0();
    }

    public final void o00oOoOO(@oo0oO0 Intent intent, int i, @oo0oO0 o00oOo0O o00ooo0o2) {
        Bundle extras = intent.getExtras();
        synchronized (this.f5602o00oo0Oo) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            o0O00000 o00oOo002 = o0O00000.o00oOo00();
            String str = f5592o00oo0o0;
            o00oOo002.o00oOOo0(str, String.format("Handing delay met for %s", string), new Throwable[0]);
            if (this.f5600o00oo0O.containsKey(string)) {
                o0O00000.o00oOo00().o00oOOo0(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
            } else {
                o00oOo00 o00ooo002 = new o00oOo00(this.f5601o00oo0O0, i, string, o00ooo0o2);
                this.f5600o00oo0O.put(string, o00ooo002);
                o00ooo002.o00oOooO();
            }
        }
    }

    public final void o00oOoOo(@oo0oO0 Intent intent, int i) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean(f5598o00ooO0o);
        o0O00000.o00oOo00().o00oOOo0(f5592o00oo0o0, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
        o00oOo0O(string, z);
    }

    public final void o00oOoo0(@oo0oO0 Intent intent, int i, @oo0oO0 o00oOo0O o00ooo0o2) {
        o0O00000.o00oOo00().o00oOOo0(f5592o00oo0o0, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
        o00ooo0o2.o00oOoO0().o00oooo();
    }

    public final void o00oOooo(@oo0oO0 Intent intent, int i, @oo0oO0 o00oOo0O o00ooo0o2) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        o0O00000 o00oOo002 = o0O00000.o00oOo00();
        String str = f5592o00oo0o0;
        o00oOo002.o00oOOo0(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase o00ooo0o3 = o00ooo0o2.o00oOoO0().o00ooo0o();
        o00ooo0o3.o00oOo00();
        try {
            o0OoO00O o00oOoOO2 = o00ooo0o3.o00ooo0O().o00oOoOO(string);
            if (o00oOoOO2 == null) {
                o0O00000 o00oOo003 = o0O00000.o00oOo00();
                o00oOo003.o00oOoO(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
            } else if (o00oOoOO2.f12463o00oOOoO.isFinished()) {
                o0O00000 o00oOo004 = o0O00000.o00oOo00();
                o00oOo004.o00oOoO(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
            } else {
                long o00oOOo02 = o00oOoOO2.o00oOOo0();
                if (o00oOoOO2.o00oOOoO()) {
                    o0O00000.o00oOo00().o00oOOo0(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(o00oOOo02)), new Throwable[0]);
                    o0O0o00.o00oOOo0.o00oOo00(this.f5601o00oo0O0, o00ooo0o2.o00oOoO0(), string, o00oOOo02);
                    o00ooo0o2.o00oOoo0(new o00oOo0O.o00oOOoO(o00ooo0o2, o00oOOo0(this.f5601o00oo0O0), i));
                } else {
                    o0O00000.o00oOo00().o00oOOo0(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(o00oOOo02)), new Throwable[0]);
                    o0O0o00.o00oOOo0.o00oOo00(this.f5601o00oo0O0, o00ooo0o2.o00oOoO0(), string, o00oOOo02);
                }
                o00ooo0o3.o00ooO0o();
            }
        } finally {
            o00ooo0o3.o00oOoOO();
        }
    }

    public final void o00oo00O(@oo0oO0 Intent intent, @oo0oO0 o00oOo0O o00ooo0o2) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        o0O00000.o00oOo00().o00oOOo0(f5592o00oo0o0, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        o00ooo0o2.o00oOoO0().o0O0000o(string);
        o0O0o00.o00oOOo0.o00oOOo0(this.f5601o00oo0O0, o00ooo0o2.o00oOoO0(), string);
        o00ooo0o2.o00oOo0O(string, false);
    }

    @oO0Oo
    public void o00oo0O0(@oo0oO0 Intent intent, int i, @oo0oO0 o00oOo0O o00ooo0o2) {
        String action = intent.getAction();
        if (f5590o00oo.equals(action)) {
            o00oOoO(intent, i, o00ooo0o2);
        } else if (f5596o00ooO00.equals(action)) {
            o00oOoo0(intent, i, o00ooo0o2);
        } else if (!o00oo0(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            o0O00000.o00oOo00().o00oOOoO(f5592o00oo0o0, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
        } else if (f5591o00oo0o.equals(action)) {
            o00oOooo(intent, i, o00ooo0o2);
        } else if (f5593o00oo0oO.equals(action)) {
            o00oOoOO(intent, i, o00ooo0o2);
        } else if (f5599o0O0o.equals(action)) {
            o00oo00O(intent, o00ooo0o2);
        } else if (f5595o00ooO0.equals(action)) {
            o00oOoOo(intent, i);
        } else {
            o0O00000.o00oOo00().o00oOoO(f5592o00oo0o0, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }

    public boolean o00oo0OO() {
        boolean z;
        synchronized (this.f5602o00oo0Oo) {
            z = !this.f5600o00oo0O.isEmpty();
        }
        return z;
    }
}
