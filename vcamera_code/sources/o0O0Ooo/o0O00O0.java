package o0O0Ooo;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.work.R;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.o00oOOo0;
import com.google.android.exoplayer2.C;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o00oo0O;
import o0O0Ooo0.o00oo0O0;
import o0O0Ooo0.o0O00000;
import o0O0Ooo0.o0O00O;
import o0O0Ooo0.o0O00OO;
import o0O0o00O.o00oOo00;
import o0O0o0Oo.o0OoO00O;
import o0O0o0o.o00ooO;
import o0O0o0o0.o0;
import o0O0o0o0.o00oOOoO;
import o0O0o0o0.o00oo00O;
import o0O0o0o0.o00oo0OO;
import o0O0o0o0.o00ooO;
import o0O0o0o0.o00ooO0;
import o0O0o0o0.o0O0o;
import o0O0o0oO.o0O0O0o0;
import o0oOo0O0.oO00O0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o0O00O0 extends o0O0Ooo0.o0O00O0o {

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f12087o00oOooo = 22;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final String f12088o00oo0 = "androidx.work.multiprocess.RemoteWorkManagerClient";

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f12089o00oo00O = 23;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public Context f12093o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public androidx.work.o00oOOo0 f12094o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public WorkDatabase f12095o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public List<o0OoOoOo> f12096o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public o0O000O f12097o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public boolean f12098o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public o00oo0OO f12099o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public BroadcastReceiver.PendingResult f12100o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public volatile o0O0O0o0 f12101o00oOoOo;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public oO00O0oO f12102o00oOooO;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final String f12086o00oOoo0 = o0O0Ooo0.o0O00000.o00oOo0o("WorkManagerImpl");

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static o0O00O0 f12092o00oo0OO = null;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static o0O00O0 f12091o00oo0O0 = null;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final Object f12090o00oo0O = new Object();

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o00oo0OO f12103o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o00ooO f12104o00oo0O0;

        public o00oOOo0(o00ooO o00ooo, o00oo0OO o00oo0oo) {
            this.f12104o00oo0O0 = o00ooo;
            this.f12103o00oo0O = o00oo0oo;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f12104o00oo0O0.o00oo0O0(Long.valueOf(this.f12103o00oo0O.o00oOOo0()));
            } catch (Throwable th) {
                this.f12104o00oo0O0.o00oo0O(th);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements o00oo0.o00oOOo0<List<o0OoO00O.o00oOo00>, o0O0Ooo0.o0OoO00O> {
        public o00oOOoO() {
        }

        @Override // o00oo0.o00oOOo0
        /* renamed from: o00oOOo0 */
        public o0O0Ooo0.o0OoO00O apply(List<o0OoO00O.o00oOo00> list) {
            if (list == null || list.size() <= 0) {
                return null;
            }
            return list.get(0).o00oOOo0();
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public o0O00O0(@oo0oO0 Context context, @oo0oO0 androidx.work.o00oOOo0 o00oooo02, @oo0oO0 oO00O0oO oo00o0oo) {
        this(context, o00oooo02, oo00o0oo, context.getResources().getBoolean(R.bool.workmanager_test_configuration));
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public o0O00O0(@oo0oO0 Context context, @oo0oO0 androidx.work.o00oOOo0 o00oooo02, @oo0oO0 oO00O0oO oo00o0oo, @oo0oO0 WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        o0O0Ooo0.o0O00000.o00oOo0O(new o0O00000.o00oOOo0(o00oooo02.f5741o00oOoO));
        List<o0OoOoOo> o00ooOO02 = o00ooOO0(applicationContext, o00oooo02, oo00o0oo);
        o00oooOo(context, o00oooo02, oo00o0oo, workDatabase, o00ooOO02, new o0O000O(context, o00oooo02, oo00o0oo, workDatabase, o00ooOO02));
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public o0O00O0(@oo0oO0 Context context, @oo0oO0 androidx.work.o00oOOo0 o00oooo02, @oo0oO0 oO00O0oO oo00o0oo, @oo0oO0 WorkDatabase workDatabase, @oo0oO0 List<o0OoOoOo> list, @oo0oO0 o0O000O o0o000o) {
        o00oooOo(context, o00oooo02, oo00o0oo, workDatabase, list, o0o000o);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public o0O00O0(@oo0oO0 Context context, @oo0oO0 androidx.work.o00oOOo0 o00oooo02, @oo0oO0 oO00O0oO oo00o0oo, boolean z) {
        this(context, o00oooo02, oo00o0oo, WorkDatabase.o00ooO(context.getApplicationContext(), oo00o0oo.o00oOooO(), z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (o0O0Ooo.o0O00O0.f12091o00oo0O0 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        o0O0Ooo.o0O00O0.f12091o00oo0O0 = new o0O0Ooo.o0O00O0(r4, r5, new o0oOo0O0.oO00O(r5.f5737o00oOOoO));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        o0O0Ooo.o0O00O0.f12092o00oo0OO = o0O0Ooo.o0O00O0.f12091o00oo0O0;
     */
    @o00oOooO.o0OO0oO({o00oOooO.o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void o00ooO0o(@o00oOooO.oo0oO0 android.content.Context r4, @o00oOooO.oo0oO0 androidx.work.o00oOOo0 r5) {
        /*
            java.lang.Object r0 = o0O0Ooo.o0O00O0.f12090o00oo0O
            monitor-enter(r0)
            o0O0Ooo.o0O00O0 r1 = o0O0Ooo.o0O00O0.f12092o00oo0OO     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L14
            o0O0Ooo.o0O00O0 r2 = o0O0Ooo.o0O00O0.f12091o00oo0O0     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L32
            throw r4     // Catch: java.lang.Throwable -> L32
        L14:
            if (r1 != 0) goto L30
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L32
            o0O0Ooo.o0O00O0 r1 = o0O0Ooo.o0O00O0.f12091o00oo0O0     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L2c
            o0O0Ooo.o0O00O0 r1 = new o0O0Ooo.o0O00O0     // Catch: java.lang.Throwable -> L32
            o0oOo0O0.oO00O r2 = new o0oOo0O0.oO00O     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.Executor r3 = r5.f5737o00oOOoO     // Catch: java.lang.Throwable -> L32
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L32
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L32
            o0O0Ooo.o0O00O0.f12091o00oo0O0 = r1     // Catch: java.lang.Throwable -> L32
        L2c:
            o0O0Ooo.o0O00O0 r4 = o0O0Ooo.o0O00O0.f12091o00oo0O0     // Catch: java.lang.Throwable -> L32
            o0O0Ooo.o0O00O0.f12092o00oo0OO = r4     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o0O0Ooo.o0O00O0.o00ooO0o(android.content.Context, androidx.work.o00oOOo0):void");
    }

    @o0OO00OO
    @Deprecated
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static o0O00O0 o00ooOo() {
        synchronized (f12090o00oo0O) {
            o0O00O0 o0o00o0 = f12092o00oo0OO;
            if (o0o00o0 != null) {
                return o0o00o0;
            }
            return f12091o00oo0O0;
        }
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static o0O00O0 o00ooOoO(@oo0oO0 Context context) {
        o0O00O0 o00ooOo2;
        synchronized (f12090o00oo0O) {
            o00ooOo2 = o00ooOo();
            if (o00ooOo2 == null) {
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof o00oOOo0.o00oOo00)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                o00ooO0o(applicationContext, ((o00oOOo0.o00oOo00) applicationContext).o00oOOo0());
                o00ooOo2 = o00ooOoO(applicationContext);
            }
        }
        return o00ooOo2;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static void o00ooooO(@o0OO00OO o0O00O0 o0o00o0) {
        synchronized (f12090o00oo0O) {
            f12092o00oo0OO = o0o00o0;
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public void o0(@oo0oO0 String str) {
        o0O00000(str, null);
    }

    @Override // o0O0Ooo0.o0O00O0o
    @oo0oO0
    public o0O0Ooo0.o0O00O0 o00oOOo0(@oo0oO0 String str, @oo0oO0 o00oo0O o00oo0o2, @oo0oO0 List<o0O0Ooo0.o0O000> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new o0O000o0(this, str, o00oo0o2, list);
    }

    @Override // o0O0Ooo0.o0O00O0o
    @oo0oO0
    public o0O0Ooo0.o0O00O0 o00oOo00(@oo0oO0 List<o0O0Ooo0.o0O000> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
        }
        return new o0O000o0(this, list);
    }

    @Override // o0O0Ooo0.o0O00O0o
    @oo0oO0
    public o0O0Ooo0.o0O000O o00oOo0O() {
        o00oOOoO.o00oOo0O o00ooo0o2 = new o00oOOoO.o00oOo0O(this);
        this.f12102o00oOooO.o00oOOoO(o00ooo0o2);
        return o00ooo0o2.f12523o00oo0O0;
    }

    @Override // o0O0Ooo0.o0O00O0o
    @oo0oO0
    public o0O0Ooo0.o0O000O o00oOo0o(@oo0oO0 String str) {
        o00oOOoO.C0155o00oOOoO c0155o00oOOoO = new o00oOOoO.C0155o00oOOoO(this, str);
        this.f12102o00oOooO.o00oOOoO(c0155o00oOOoO);
        return c0155o00oOOoO.f12523o00oo0O0;
    }

    @Override // o0O0Ooo0.o0O00O0o
    @oo0oO0
    public o0O0Ooo0.o0O000O o00oOoO(@oo0oO0 UUID uuid) {
        o00oOOoO.o00oOOo0 o00oooo02 = new o00oOOoO.o00oOOo0(this, uuid);
        this.f12102o00oOooO.o00oOOoO(o00oooo02);
        return o00oooo02.f12523o00oo0O0;
    }

    @Override // o0O0Ooo0.o0O00O0o
    @oo0oO0
    public o0O0Ooo0.o0O000O o00oOoO0(@oo0oO0 String str) {
        o00oOOoO.o00oOo00 o00ooo002 = new o00oOOoO.o00oOo00(this, str, true);
        this.f12102o00oOooO.o00oOOoO(o00ooo002);
        return o00ooo002.f12523o00oo0O0;
    }

    @Override // o0O0Ooo0.o0O00O0o
    @oo0oO0
    public PendingIntent o00oOoOO(@oo0oO0 UUID uuid) {
        return PendingIntent.getService(this.f12093o00oOOo0, 0, androidx.work.impl.foreground.o00oOOo0.o00oOOo0(this.f12093o00oOOo0, uuid.toString()), o0O000.o00oOOo0.o00oOoOO() ? 167772160 : C.BUFFER_FLAG_FIRST_SAMPLE);
    }

    @Override // o0O0Ooo0.o0O00O0o
    @oo0oO0
    public o0O0Ooo0.o0O000O o00oOoOo(@oo0oO0 List<? extends o0O00OO> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new o0O000o0(this, list).o00oOo00();
    }

    @Override // o0O0Ooo0.o0O00O0o
    @oo0oO0
    public o0O0Ooo0.o0O000O o00oOooo(@oo0oO0 String str, @oo0oO0 o00oo0O0 o00oo0o02, @oo0oO0 o0O0Ooo0.o0O000Oo o0o000oo) {
        return o00ooOO(str, o00oo0o02, o0o000oo).o00oOo00();
    }

    @Override // o0O0Ooo0.o0O00O0o
    @oo0oO0
    public LiveData<List<o0O0Ooo0.o0OoO00O>> o00oo(@oo0oO0 String str) {
        return o00oo00O.o00oOOo0(this.f12095o00oOo00.o00ooo0O().o00ooO0(str), o0O0o0Oo.o0OoO00O.f12461o00oo0oO, this.f12102o00oOooO);
    }

    @Override // o0O0Ooo0.o0O00O0o
    @oo0oO0
    public o0O0Ooo0.o0O000O o00oo00O(@oo0oO0 String str, @oo0oO0 o00oo0O o00oo0o2, @oo0oO0 List<o0O0Ooo0.o0O000> list) {
        return new o0O000o0(this, str, o00oo0o2, list).o00oOo00();
    }

    @Override // o0O0Ooo0.o0O00O0o
    @oo0oO0
    public ListenableFuture<Long> o00oo0O() {
        o00ooO o00oo0oO2 = o00ooO.o00oo0oO();
        this.f12102o00oOooO.o00oOOoO(new o00oOOo0(o00oo0oO2, this.f12099o00oOoO0));
        return o00oo0oO2;
    }

    @Override // o0O0Ooo0.o0O00O0o
    @oo0oO0
    public LiveData<Long> o00oo0Oo() {
        return this.f12099o00oOoO0.o00oOOoO();
    }

    @Override // o0O0Ooo0.o0O00O0o
    @oo0oO0
    public LiveData<o0O0Ooo0.o0OoO00O> o00oo0o(@oo0oO0 UUID uuid) {
        return o00oo00O.o00oOOo0(this.f12095o00oOo00.o00ooo0O().o00ooOO(Collections.singletonList(uuid.toString())), new o00oOOoO(), this.f12102o00oOooO);
    }

    @Override // o0O0Ooo0.o0O00O0o
    @oo0oO0
    public ListenableFuture<o0O0Ooo0.o0OoO00O> o00oo0o0(@oo0oO0 UUID uuid) {
        o00ooO.o00oOOoO o00ooooo2 = new o00ooO.o00oOOoO(this, uuid);
        this.f12102o00oOooO.o00oOooO().execute(o00ooooo2);
        return o00ooooo2.f12562o00oo0O0;
    }

    @Override // o0O0Ooo0.o0O00O0o
    @oo0oO0
    public ListenableFuture<List<o0O0Ooo0.o0OoO00O>> o00oo0oO(@oo0oO0 o0O00O o0o00o) {
        o00ooO.o00oOoO o00oooo2 = new o00ooO.o00oOoO(this, o0o00o);
        this.f12102o00oOooO.o00oOooO().execute(o00oooo2);
        return o00oooo2.f12562o00oo0O0;
    }

    @Override // o0O0Ooo0.o0O00O0o
    @oo0oO0
    public o0O0Ooo0.o0O000O o00ooO() {
        o0O0o0o0.o00oo0O o00oo0o2 = new o0O0o0o0.o00oo0O(this);
        this.f12102o00oOooO.o00oOOoO(o00oo0o2);
        return o00oo0o2.f12554o00oo0O;
    }

    @Override // o0O0Ooo0.o0O00O0o
    @oo0oO0
    public LiveData<List<o0O0Ooo0.o0OoO00O>> o00ooO0(@oo0oO0 String str) {
        return o00oo00O.o00oOOo0(this.f12095o00oOo00.o00ooo0O().o00oo(str), o0O0o0Oo.o0OoO00O.f12461o00oo0oO, this.f12102o00oOooO);
    }

    @Override // o0O0Ooo0.o0O00O0o
    @oo0oO0
    public ListenableFuture<List<o0O0Ooo0.o0OoO00O>> o00ooO00(@oo0oO0 String str) {
        o00ooO.o00oOo0O o00ooo0o2 = new o00ooO.o00oOo0O(this, str);
        this.f12102o00oOooO.o00oOooO().execute(o00ooo0o2);
        return o00ooo0o2.f12562o00oo0O0;
    }

    @Override // o0O0Ooo0.o0O00O0o
    @oo0oO0
    public LiveData<List<o0O0Ooo0.o0OoO00O>> o00ooO0O(@oo0oO0 o0O00O o0o00o) {
        return o00oo00O.o00oOOo0(this.f12095o00oOo00.o00ooOoO().o00oOOo0(o0O0o.o00oOOoO(o0o00o)), o0O0o0Oo.o0OoO00O.f12461o00oo0oO, this.f12102o00oOooO);
    }

    @oo0oO0
    public o0O000o0 o00ooOO(@oo0oO0 String str, @oo0oO0 o00oo0O0 o00oo0o02, @oo0oO0 o0O0Ooo0.o0O000Oo o0o000oo) {
        return new o0O000o0(this, str, o00oo0o02 == o00oo0O0.KEEP ? o00oo0O.KEEP : o00oo0O.REPLACE, Collections.singletonList(o0o000oo));
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public List<o0OoOoOo> o00ooOO0(@oo0oO0 Context context, @oo0oO0 androidx.work.o00oOOo0 o00oooo02, @oo0oO0 oO00O0oO oo00o0oo) {
        return Arrays.asList(o0O000Oo.o00oOOo0(context, this), new o0O0o000.o00oOOoO(context, o00oooo02, oo00o0oo, this));
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public Context o00ooOOo() {
        return this.f12093o00oOOo0;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public androidx.work.o00oOOo0 o00ooOo0() {
        return this.f12094o00oOOoO;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public o00oo0OO o00ooOoo() {
        return this.f12099o00oOoO0;
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public o0O0O0o0 o00ooo0() {
        if (this.f12101o00oOoOo == null) {
            synchronized (f12090o00oo0O) {
                if (this.f12101o00oOoOo == null) {
                    o0O000();
                    if (this.f12101o00oOoOo == null && !TextUtils.isEmpty(this.f12094o00oOOoO.f5742o00oOoO0)) {
                        throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                    }
                }
            }
        }
        return this.f12101o00oOoOo;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public o0O000O o00ooo00() {
        return this.f12097o00oOo0o;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public List<o0OoOoOo> o00ooo0O() {
        return this.f12096o00oOo0O;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public WorkDatabase o00ooo0o() {
        return this.f12095o00oOo00;
    }

    public LiveData<List<o0O0Ooo0.o0OoO00O>> o00oooO(@oo0oO0 List<String> list) {
        return o00oo00O.o00oOOo0(this.f12095o00oOo00.o00ooo0O().o00ooOO(list), o0O0o0Oo.o0OoO00O.f12461o00oo0oO, this.f12102o00oOooO);
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public oO00O0oO o00oooOO() {
        return this.f12102o00oOooO;
    }

    public final void o00oooOo(@oo0oO0 Context context, @oo0oO0 androidx.work.o00oOOo0 o00oooo02, @oo0oO0 oO00O0oO oo00o0oo, @oo0oO0 WorkDatabase workDatabase, @oo0oO0 List<o0OoOoOo> list, @oo0oO0 o0O000O o0o000o) {
        Context applicationContext = context.getApplicationContext();
        this.f12093o00oOOo0 = applicationContext;
        this.f12094o00oOOoO = o00oooo02;
        this.f12102o00oOooO = oo00o0oo;
        this.f12095o00oOo00 = workDatabase;
        this.f12096o00oOo0O = list;
        this.f12097o00oOo0o = o0o000o;
        this.f12099o00oOoO0 = new o00oo0OO(workDatabase);
        this.f12098o00oOoO = false;
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f12102o00oOooO.o00oOOoO(new ForceStopRunnable(applicationContext, this));
    }

    public void o00oooo() {
        o00oOo00.o00oOOoO(o00ooOOo());
        o00ooo0o().o00ooo0O().o00oo0OO();
        o0O000Oo.o00oOOoO(o00ooOo0(), o00ooo0o(), o00ooo0O());
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public void o00oooo0() {
        synchronized (f12090o00oo0O) {
            this.f12098o00oOoO = true;
            BroadcastReceiver.PendingResult pendingResult = this.f12100o00oOoOO;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f12100o00oOoOO = null;
            }
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public void o00ooooo(@oo0oO0 BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f12090o00oo0O) {
            this.f12100o00oOoOO = pendingResult;
            if (this.f12098o00oOoO) {
                pendingResult.finish();
                this.f12100o00oOoOO = null;
            }
        }
    }

    public final void o0O000() {
        try {
            this.f12101o00oOoOo = (o0O0O0o0) Class.forName(f12088o00oo0).getConstructor(Context.class, o0O00O0.class).newInstance(this.f12093o00oOOo0, this);
        } catch (Throwable th) {
            o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12086o00oOoo0, "Unable to initialize multi-process support", th);
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public void o0O00000(@oo0oO0 String str, @o0OO00OO WorkerParameters.o00oOOo0 o00oooo02) {
        this.f12102o00oOooO.o00oOOoO(new o00ooO0(this, str, o00oooo02));
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public void o0O0000O(@oo0oO0 String str) {
        this.f12102o00oOooO.o00oOOoO(new o0(this, str, true));
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public void o0O0000o(@oo0oO0 String str) {
        this.f12102o00oOooO.o00oOOoO(new o0(this, str, false));
    }

    @Override // o0O0Ooo0.o0O00O0o
    @oo0oO0
    public ListenableFuture<List<o0O0Ooo0.o0OoO00O>> o0O0o(@oo0oO0 String str) {
        o00ooO.o00oOo00 o00ooo002 = new o00ooO.o00oOo00(this, str);
        this.f12102o00oOooO.o00oOooO().execute(o00ooo002);
        return o00ooo002.f12562o00oo0O0;
    }
}
