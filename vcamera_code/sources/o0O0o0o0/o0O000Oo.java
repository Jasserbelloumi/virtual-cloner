package o0O0o0o0;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o0O000Oo {

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f12598o00oOo0o = o0O0Ooo0.o0O00000.o00oOo0o("WorkTimer");

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final ThreadFactory f12599o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final ScheduledExecutorService f12600o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Map<String, o00oOo00> f12601o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final Object f12602o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final Map<String, o00oOOoO> f12603o00oOooO;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements ThreadFactory {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f12604o00oOOo0 = 0;

        public o00oOOo0() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@oo0oO0 Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("WorkManager-WorkTimer-thread-");
            o00oOOo02.append(this.f12604o00oOOo0);
            newThread.setName(o00oOOo02.toString());
            this.f12604o00oOOo0++;
            return newThread;
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public interface o00oOOoO {
        void o00oOOo0(@oo0oO0 String str);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class o00oOo00 implements Runnable {

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public static final String f12606o00oo0Oo = "WrkTimerRunnable";

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final String f12607o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o0O000Oo f12608o00oo0O0;

        public o00oOo00(@oo0oO0 o0O000Oo o0o000oo, @oo0oO0 String str) {
            this.f12608o00oo0O0 = o0o000oo;
            this.f12607o00oo0O = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f12608o00oo0O0.f12602o00oOo0O) {
                if (this.f12608o00oo0O0.f12601o00oOo00.remove(this.f12607o00oo0O) != null) {
                    o00oOOoO remove = this.f12608o00oo0O0.f12603o00oOooO.remove(this.f12607o00oo0O);
                    if (remove != null) {
                        remove.o00oOOo0(this.f12607o00oo0O);
                    }
                } else {
                    o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12606o00oo0Oo, String.format("Timer with %s is already marked as complete.", this.f12607o00oo0O), new Throwable[0]);
                }
            }
        }
    }

    public o0O000Oo() {
        o00oOOo0 o00oooo02 = new o00oOOo0();
        this.f12599o00oOOo0 = o00oooo02;
        this.f12601o00oOo00 = new HashMap();
        this.f12603o00oOooO = new HashMap();
        this.f12602o00oOo0O = new Object();
        this.f12600o00oOOoO = Executors.newSingleThreadScheduledExecutor(o00oooo02);
    }

    @oo0oO0
    @o0o0000
    public ScheduledExecutorService o00oOOo0() {
        return this.f12600o00oOOoO;
    }

    @oo0oO0
    @o0o0000
    public synchronized Map<String, o00oOOoO> o00oOOoO() {
        return this.f12603o00oOooO;
    }

    @oo0oO0
    @o0o0000
    public synchronized Map<String, o00oOo00> o00oOo00() {
        return this.f12601o00oOo00;
    }

    public void o00oOo0O(@oo0oO0 String str, long j, @oo0oO0 o00oOOoO o00ooooo2) {
        synchronized (this.f12602o00oOo0O) {
            o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12598o00oOo0o, String.format("Starting timer for %s", str), new Throwable[0]);
            o00oOo0o(str);
            o00oOo00 o00ooo002 = new o00oOo00(this, str);
            this.f12601o00oOo00.put(str, o00ooo002);
            this.f12603o00oOooO.put(str, o00ooooo2);
            this.f12600o00oOOoO.schedule(o00ooo002, j, TimeUnit.MILLISECONDS);
        }
    }

    public void o00oOo0o(@oo0oO0 String str) {
        synchronized (this.f12602o00oOo0O) {
            if (this.f12601o00oOo00.remove(str) != null) {
                o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12598o00oOo0o, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f12603o00oOooO.remove(str);
            }
        }
    }

    public void o00oOooO() {
        if (this.f12600o00oOOoO.isShutdown()) {
            return;
        }
        this.f12600o00oOOoO.shutdownNow();
    }
}
