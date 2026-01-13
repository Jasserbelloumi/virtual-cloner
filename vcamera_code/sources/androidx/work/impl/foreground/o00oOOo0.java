package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o00oOooO.o0O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o0O0Ooo.o0O0000O;
import o0O0Ooo.o0O00O0;
import o0O0Ooo0.o0O00000;
import o0O0Ooo0.o0O0o;
import o0O0o00o.o00oo0;
import o0O0o00o.o00oo0OO;
import o0O0o0Oo.o0OoO00O;
import o0oOo0O0.oO00O0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oOOo0 implements o00oo0, o0O0000O {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final String f5659o00ooO = "KEY_NOTIFICATION_ID";

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final String f5660o00ooO0O = o0O00000.o00oOo0o("SystemFgDispatcher");

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final String f5661o00ooO0o = "KEY_NOTIFICATION";

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final String f5662o00ooOO = "KEY_WORKSPEC_ID";

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final String f5663o00ooOO0 = "KEY_FOREGROUND_SERVICE_TYPE";

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final String f5664o00ooOOo = "ACTION_START_FOREGROUND";

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final String f5665o00ooOo = "ACTION_CANCEL_WORK";

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final String f5666o00ooOo0 = "ACTION_NOTIFY";

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final String f5667o00ooOoO = "ACTION_STOP_FOREGROUND";

    /* renamed from: o00oo  reason: collision with root package name */
    public final Set<o0OoO00O> f5668o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public o0O00O0 f5669o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public Context f5670o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final oO00O0oO f5671o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public String f5672o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final Object f5673o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final Map<String, o0O0o> f5674o00oo0oO;
    @o0OO00OO

    /* renamed from: o00ooO0  reason: collision with root package name */
    public o00oOOoO f5675o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public final o00oo0OO f5676o00ooO00;

    /* renamed from: o0O0o  reason: collision with root package name */
    public final Map<String, o0OoO00O> f5677o0O0o;

    /* renamed from: androidx.work.impl.foreground.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0065o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ String f5678o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ WorkDatabase f5679o00oo0O0;

        public RunnableC0065o00oOOo0(WorkDatabase workDatabase, String str) {
            this.f5679o00oo0O0 = workDatabase;
            this.f5678o00oo0O = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            o0OoO00O o00oOoOO2 = this.f5679o00oo0O0.o00ooo0O().o00oOoOO(this.f5678o00oo0O);
            if (o00oOoOO2 == null || !o00oOoOO2.o00oOOoO()) {
                return;
            }
            synchronized (o00oOOo0.this.f5673o00oo0o0) {
                o00oOOo0.this.f5677o0O0o.put(this.f5678o00oo0O, o00oOoOO2);
                o00oOOo0.this.f5668o00oo.add(o00oOoOO2);
                o00oOOo0 o00oooo02 = o00oOOo0.this;
                o00oooo02.f5676o00ooO00.o00oOooO(o00oooo02.f5668o00oo);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO {
        void o00oOOo0(int i, @oo0oO0 Notification notification);

        void o00oOo00(int i, int i2, @oo0oO0 Notification notification);

        void o00oOooO(int i);

        void stop();
    }

    public o00oOOo0(@oo0oO0 Context context) {
        this.f5670o00oo0O0 = context;
        this.f5673o00oo0o0 = new Object();
        o0O00O0 o00ooOoO2 = o0O00O0.o00ooOoO(context);
        this.f5669o00oo0O = o00ooOoO2;
        oO00O0oO o00oooOO2 = o00ooOoO2.o00oooOO();
        this.f5671o00oo0Oo = o00oooOO2;
        this.f5672o00oo0o = null;
        this.f5674o00oo0oO = new LinkedHashMap();
        this.f5668o00oo = new HashSet();
        this.f5677o0O0o = new HashMap();
        this.f5676o00ooO00 = new o00oo0OO(this.f5670o00oo0O0, o00oooOO2, this);
        this.f5669o00oo0O.o00ooo00().o00oOo00(this);
    }

    @o0o0000
    public o00oOOo0(@oo0oO0 Context context, @oo0oO0 o0O00O0 o0o00o0, @oo0oO0 o00oo0OO o00oo0oo) {
        this.f5670o00oo0O0 = context;
        this.f5673o00oo0o0 = new Object();
        this.f5669o00oo0O = o0o00o0;
        this.f5671o00oo0Oo = o0o00o0.o00oooOO();
        this.f5672o00oo0o = null;
        this.f5674o00oo0oO = new LinkedHashMap();
        this.f5668o00oo = new HashSet();
        this.f5677o0O0o = new HashMap();
        this.f5676o00ooO00 = o00oo0oo;
        this.f5669o00oo0O.o00ooo00().o00oOo00(this);
    }

    @oo0oO0
    public static Intent o00oOOo0(@oo0oO0 Context context, @oo0oO0 String str) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction(f5665o00ooOo);
        intent.setData(Uri.parse(String.format("workspec://%s", str)));
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @oo0oO0
    public static Intent o00oOo00(@oo0oO0 Context context, @oo0oO0 String str, @oo0oO0 o0O0o o0o0o) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction(f5666o00ooOo0);
        intent.putExtra(f5659o00ooO, o0o0o.f12197o00oOOo0);
        intent.putExtra(f5663o00ooOO0, o0o0o.f12198o00oOOoO);
        intent.putExtra(f5661o00ooO0o, o0o0o.f12199o00oOo00);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @oo0oO0
    public static Intent o00oOoO0(@oo0oO0 Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction(f5667o00ooOoO);
        return intent;
    }

    @oo0oO0
    public static Intent o00oOooO(@oo0oO0 Context context, @oo0oO0 String str, @oo0oO0 o0O0o o0o0o) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction(f5664o00ooOOo);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra(f5659o00ooO, o0o0o.f12197o00oOOo0);
        intent.putExtra(f5663o00ooOO0, o0o0o.f12198o00oOOoO);
        intent.putExtra(f5661o00ooO0o, o0o0o.f12199o00oOo00);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // o0O0o00o.o00oo0
    public void o00oOOoO(@oo0oO0 List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            o0O00000.o00oOo00().o00oOOo0(f5660o00ooO0O, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f5669o00oo0O.o0O0000O(str);
        }
    }

    @Override // o0O0Ooo.o0O0000O
    @o0O
    public void o00oOo0O(@oo0oO0 String str, boolean z) {
        Map.Entry<String, o0O0o> next;
        synchronized (this.f5673o00oo0o0) {
            o0OoO00O remove = this.f5677o0O0o.remove(str);
            if (remove != null ? this.f5668o00oo.remove(remove) : false) {
                this.f5676o00ooO00.o00oOooO(this.f5668o00oo);
            }
        }
        o0O0o remove2 = this.f5674o00oo0oO.remove(str);
        if (str.equals(this.f5672o00oo0o) && this.f5674o00oo0oO.size() > 0) {
            Iterator<Map.Entry<String, o0O0o>> it = this.f5674o00oo0oO.entrySet().iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            this.f5672o00oo0o = next.getKey();
            if (this.f5675o00ooO0 != null) {
                o0O0o value = next.getValue();
                this.f5675o00ooO0.o00oOo00(value.f12197o00oOOo0, value.f12198o00oOOoO, value.f12199o00oOo00);
                this.f5675o00ooO0.o00oOooO(value.f12197o00oOOo0);
            }
        }
        o00oOOoO o00ooooo2 = this.f5675o00ooO0;
        if (remove2 == null || o00ooooo2 == null) {
            return;
        }
        o0O00000.o00oOo00().o00oOOo0(f5660o00ooO0O, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(remove2.f12197o00oOOo0), str, Integer.valueOf(remove2.f12198o00oOOoO)), new Throwable[0]);
        o00ooooo2.o00oOooO(remove2.f12197o00oOOo0);
    }

    @Override // o0O0o00o.o00oo0
    public void o00oOo0o(@oo0oO0 List<String> list) {
    }

    public o0O00O0 o00oOoO() {
        return this.f5669o00oo0O;
    }

    @o0O
    public final void o00oOoOO(@oo0oO0 Intent intent) {
        o0O00000.o00oOo00().o00oOooO(f5660o00ooO0O, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f5669o00oo0O.o00oOoO(UUID.fromString(stringExtra));
    }

    @o0O
    public final void o00oOoOo(@oo0oO0 Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra(f5659o00ooO, 0);
        int intExtra2 = intent.getIntExtra(f5663o00ooOO0, 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra(f5661o00ooO0o);
        o0O00000.o00oOo00().o00oOOo0(f5660o00ooO0O, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f5675o00ooO0 == null) {
            return;
        }
        this.f5674o00oo0oO.put(stringExtra, new o0O0o(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f5672o00oo0o)) {
            this.f5672o00oo0o = stringExtra;
            this.f5675o00ooO0.o00oOo00(intExtra, intExtra2, notification);
            return;
        }
        this.f5675o00ooO0.o00oOOo0(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        for (Map.Entry<String, o0O0o> entry : this.f5674o00oo0oO.entrySet()) {
            i |= entry.getValue().f12198o00oOOoO;
        }
        o0O0o o0o0o = this.f5674o00oo0oO.get(this.f5672o00oo0o);
        if (o0o0o != null) {
            this.f5675o00ooO0.o00oOo00(o0o0o.f12197o00oOOo0, i, o0o0o.f12199o00oOo00);
        }
    }

    @o0O
    public final void o00oOoo0(@oo0oO0 Intent intent) {
        o0O00000.o00oOo00().o00oOooO(f5660o00ooO0O, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.f5671o00oo0Oo.o00oOOoO(new RunnableC0065o00oOOo0(this.f5669o00oo0O.o00ooo0o(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @o0O
    public void o00oOooo(@oo0oO0 Intent intent) {
        o0O00000.o00oOo00().o00oOooO(f5660o00ooO0O, "Stopping foreground service", new Throwable[0]);
        o00oOOoO o00ooooo2 = this.f5675o00ooO0;
        if (o00ooooo2 != null) {
            o00ooooo2.stop();
        }
    }

    public void o00oo0(@oo0oO0 Intent intent) {
        String action = intent.getAction();
        if (f5664o00ooOOo.equals(action)) {
            o00oOoo0(intent);
        } else if (!f5666o00ooOo0.equals(action)) {
            if (f5665o00ooOo.equals(action)) {
                o00oOoOO(intent);
                return;
            } else if (f5667o00ooOoO.equals(action)) {
                o00oOooo(intent);
                return;
            } else {
                return;
            }
        }
        o00oOoOo(intent);
    }

    @o0O
    public void o00oo00O() {
        this.f5675o00ooO0 = null;
        synchronized (this.f5673o00oo0o0) {
            this.f5676o00ooO00.o00oOo0O();
        }
        this.f5669o00oo0O.o00ooo00().o00oOoOo(this);
    }

    @o0O
    public void o00oo0OO(@oo0oO0 o00oOOoO o00ooooo2) {
        if (this.f5675o00ooO0 != null) {
            o0O00000.o00oOo00().o00oOOoO(f5660o00ooO0O, "A callback already exists.", new Throwable[0]);
        } else {
            this.f5675o00ooO0 = o00ooooo2;
        }
    }
}
