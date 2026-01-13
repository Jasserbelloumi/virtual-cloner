package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o0O0Ooo.o0O0000O;
import o0O0Ooo.o0O000O;
import o0O0Ooo.o0O00O0;
import o0O0Ooo0.o0O00000;
import o0O0o0o0.o00oo;
import o0O0o0o0.o0O000Oo;
import o0oOo0O0.oO00O0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oOo0O implements o0O0000O {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final String f5621o00ooO = "KEY_START_ID";

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final String f5622o00ooO0O = o0O00000.o00oOo0o("SystemAlarmDispatcher");

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final String f5623o00ooO0o = "ProcessCommand";

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f5624o00ooOO0 = 0;

    /* renamed from: o00oo  reason: collision with root package name */
    public final List<Intent> f5625o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final oO00O0oO f5626o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Context f5627o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o0O000Oo f5628o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final o0O00O0 f5629o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final o0O000O f5630o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final androidx.work.impl.background.systemalarm.o00oOOo0 f5631o00oo0oO;
    @o0OO00OO

    /* renamed from: o00ooO0  reason: collision with root package name */
    public o00oOo00 f5632o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public Intent f5633o00ooO00;

    /* renamed from: o0O0o  reason: collision with root package name */
    public final Handler f5634o0O0o;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o00oOo0O o00ooo0o2;
            RunnableC0064o00oOo0O runnableC0064o00oOo0O;
            synchronized (o00oOo0O.this.f5625o00oo) {
                o00oOo0O o00ooo0o3 = o00oOo0O.this;
                o00ooo0o3.f5633o00ooO00 = o00ooo0o3.f5625o00oo.get(0);
            }
            Intent intent = o00oOo0O.this.f5633o00ooO00;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = o00oOo0O.this.f5633o00ooO00.getIntExtra(o00oOo0O.f5621o00ooO, 0);
                o0O00000 o00oOo002 = o0O00000.o00oOo00();
                String str = o00oOo0O.f5622o00ooO0O;
                o00oOo002.o00oOOo0(str, String.format("Processing command %s, %s", o00oOo0O.this.f5633o00ooO00, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock o00oOOoO2 = o0O0o0o0.o0O0000O.o00oOOoO(o00oOo0O.this.f5627o00oo0O0, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    o0O00000.o00oOo00().o00oOOo0(str, String.format("Acquiring operation wake lock (%s) %s", action, o00oOOoO2), new Throwable[0]);
                    o00oOOoO2.acquire();
                    o00oOo0O o00ooo0o4 = o00oOo0O.this;
                    o00ooo0o4.f5631o00oo0oO.o00oo0O0(o00ooo0o4.f5633o00ooO00, intExtra, o00ooo0o4);
                    o0O00000.o00oOo00().o00oOOo0(str, String.format("Releasing operation wake lock (%s) %s", action, o00oOOoO2), new Throwable[0]);
                    o00oOOoO2.release();
                    o00ooo0o2 = o00oOo0O.this;
                    runnableC0064o00oOo0O = new RunnableC0064o00oOo0O(o00ooo0o2);
                } catch (Throwable th) {
                    try {
                        o0O00000 o00oOo003 = o0O00000.o00oOo00();
                        String str2 = o00oOo0O.f5622o00ooO0O;
                        o00oOo003.o00oOOoO(str2, "Unexpected error in onHandleIntent", th);
                        o0O00000.o00oOo00().o00oOOo0(str2, String.format("Releasing operation wake lock (%s) %s", action, o00oOOoO2), new Throwable[0]);
                        o00oOOoO2.release();
                        o00ooo0o2 = o00oOo0O.this;
                        runnableC0064o00oOo0O = new RunnableC0064o00oOo0O(o00ooo0o2);
                    } catch (Throwable th2) {
                        o0O00000.o00oOo00().o00oOOo0(o00oOo0O.f5622o00ooO0O, String.format("Releasing operation wake lock (%s) %s", action, o00oOOoO2), new Throwable[0]);
                        o00oOOoO2.release();
                        o00oOo0O o00ooo0o5 = o00oOo0O.this;
                        o00ooo0o5.o00oOoo0(new RunnableC0064o00oOo0O(o00ooo0o5));
                        throw th2;
                    }
                }
                o00ooo0o2.o00oOoo0(runnableC0064o00oOo0O);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final Intent f5636o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o00oOo0O f5637o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final int f5638o00oo0Oo;

        public o00oOOoO(@oo0oO0 o00oOo0O o00ooo0o2, @oo0oO0 Intent intent, int i) {
            this.f5637o00oo0O0 = o00ooo0o2;
            this.f5636o00oo0O = intent;
            this.f5638o00oo0Oo = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5637o00oo0O0.o00oOOo0(this.f5636o00oo0O, this.f5638o00oo0Oo);
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOo00 {
        void o00oOOoO();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.o00oOo0O$o00oOo0O  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0064o00oOo0O implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o00oOo0O f5639o00oo0O0;

        public RunnableC0064o00oOo0O(@oo0oO0 o00oOo0O o00ooo0o2) {
            this.f5639o00oo0O0 = o00ooo0o2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5639o00oo0O0.o00oOo00();
        }
    }

    public o00oOo0O(@oo0oO0 Context context) {
        this(context, null, null);
    }

    @o0o0000
    public o00oOo0O(@oo0oO0 Context context, @o0OO00OO o0O000O o0o000o, @o0OO00OO o0O00O0 o0o00o0) {
        Context applicationContext = context.getApplicationContext();
        this.f5627o00oo0O0 = applicationContext;
        this.f5631o00oo0oO = new androidx.work.impl.background.systemalarm.o00oOOo0(applicationContext);
        this.f5628o00oo0Oo = new o0O000Oo();
        o0o00o0 = o0o00o0 == null ? o0O00O0.o00ooOoO(context) : o0o00o0;
        this.f5629o00oo0o = o0o00o0;
        o0o000o = o0o000o == null ? o0o00o0.o00ooo00() : o0o000o;
        this.f5630o00oo0o0 = o0o000o;
        this.f5626o00oo0O = o0o00o0.o00oooOO();
        o0o000o.o00oOo00(this);
        this.f5625o00oo = new ArrayList();
        this.f5633o00ooO00 = null;
        this.f5634o0O0o = new Handler(Looper.getMainLooper());
    }

    @o0O
    public boolean o00oOOo0(@oo0oO0 Intent intent, int i) {
        o0O00000 o00oOo002 = o0O00000.o00oOo00();
        String str = f5622o00ooO0O;
        o00oOo002.o00oOOo0(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        o00oOOoO();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            o0O00000.o00oOo00().o00oOoO(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if (androidx.work.impl.background.systemalarm.o00oOOo0.f5590o00oo.equals(action) && o00oOoOO(androidx.work.impl.background.systemalarm.o00oOOo0.f5590o00oo)) {
            return false;
        } else {
            intent.putExtra(f5621o00ooO, i);
            synchronized (this.f5625o00oo) {
                boolean z = this.f5625o00oo.isEmpty() ? false : true;
                this.f5625o00oo.add(intent);
                if (!z) {
                    o00oOooo();
                }
            }
            return true;
        }
    }

    public final void o00oOOoO() {
        if (this.f5634o0O0o.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @o0O
    public void o00oOo00() {
        o0O00000 o00oOo002 = o0O00000.o00oOo00();
        String str = f5622o00ooO0O;
        o00oOo002.o00oOOo0(str, "Checking if commands are complete.", new Throwable[0]);
        o00oOOoO();
        synchronized (this.f5625o00oo) {
            if (this.f5633o00ooO00 != null) {
                o0O00000.o00oOo00().o00oOOo0(str, String.format("Removing command %s", this.f5633o00ooO00), new Throwable[0]);
                if (!this.f5625o00oo.remove(0).equals(this.f5633o00ooO00)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                this.f5633o00ooO00 = null;
            }
            o00oo o00oOooO2 = this.f5626o00oo0O.o00oOooO();
            if (!this.f5631o00oo0oO.o00oo0OO() && this.f5625o00oo.isEmpty() && !o00oOooO2.o00oOOoO()) {
                o0O00000.o00oOo00().o00oOOo0(str, "No more commands & intents.", new Throwable[0]);
                o00oOo00 o00ooo002 = this.f5632o00ooO0;
                if (o00ooo002 != null) {
                    o00ooo002.o00oOOoO();
                }
            } else if (!this.f5625o00oo.isEmpty()) {
                o00oOooo();
            }
        }
    }

    @Override // o0O0Ooo.o0O0000O
    public void o00oOo0O(@oo0oO0 String str, boolean z) {
        o00oOoo0(new o00oOOoO(this, androidx.work.impl.background.systemalarm.o00oOOo0.o00oOo00(this.f5627o00oo0O0, str, z), 0));
    }

    public oO00O0oO o00oOo0o() {
        return this.f5626o00oo0O;
    }

    public o0O000Oo o00oOoO() {
        return this.f5628o00oo0Oo;
    }

    public o0O00O0 o00oOoO0() {
        return this.f5629o00oo0o;
    }

    @o0O
    public final boolean o00oOoOO(@oo0oO0 String str) {
        o00oOOoO();
        synchronized (this.f5625o00oo) {
            for (Intent intent : this.f5625o00oo) {
                if (str.equals(intent.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    public void o00oOoOo() {
        o0O00000.o00oOo00().o00oOOo0(f5622o00ooO0O, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f5630o00oo0o0.o00oOoOo(this);
        this.f5628o00oo0Oo.o00oOooO();
        this.f5632o00ooO0 = null;
    }

    public void o00oOoo0(@oo0oO0 Runnable runnable) {
        this.f5634o0O0o.post(runnable);
    }

    public o0O000O o00oOooO() {
        return this.f5630o00oo0o0;
    }

    @o0O
    public final void o00oOooo() {
        o00oOOoO();
        PowerManager.WakeLock o00oOOoO2 = o0O0o0o0.o0O0000O.o00oOOoO(this.f5627o00oo0O0, f5623o00ooO0o);
        try {
            o00oOOoO2.acquire();
            this.f5629o00oo0o.o00oooOO().o00oOOoO(new o00oOOo0());
        } finally {
            o00oOOoO2.release();
        }
    }

    public void o00oo00O(@oo0oO0 o00oOo00 o00ooo002) {
        if (this.f5632o00ooO0 != null) {
            o0O00000.o00oOo00().o00oOOoO(f5622o00ooO0O, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f5632o00ooO0 = o00ooo002;
        }
    }
}
