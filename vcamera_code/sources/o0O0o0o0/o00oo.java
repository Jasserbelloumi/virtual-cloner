package o0O0o0o0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oo implements Executor {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Executor f12540o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final ArrayDeque<o00oOOo0> f12541o00oo0O0 = new ArrayDeque<>();

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final Object f12542o00oo0Oo = new Object();

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public volatile Runnable f12543o00oo0o0;

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final Runnable f12544o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o00oo f12545o00oo0O0;

        public o00oOOo0(@oo0oO0 o00oo o00ooVar, @oo0oO0 Runnable runnable) {
            this.f12545o00oo0O0 = o00ooVar;
            this.f12544o00oo0O = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f12544o00oo0O.run();
            } finally {
                this.f12545o00oo0O0.o00oOo00();
            }
        }
    }

    public o00oo(@oo0oO0 Executor executor) {
        this.f12540o00oo0O = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@oo0oO0 Runnable runnable) {
        synchronized (this.f12542o00oo0Oo) {
            this.f12541o00oo0O0.add(new o00oOOo0(this, runnable));
            if (this.f12543o00oo0o0 == null) {
                o00oOo00();
            }
        }
    }

    @oo0oO0
    @o0o0000
    public Executor o00oOOo0() {
        return this.f12540o00oo0O;
    }

    public boolean o00oOOoO() {
        boolean z;
        synchronized (this.f12542o00oo0Oo) {
            z = !this.f12541o00oo0O0.isEmpty();
        }
        return z;
    }

    public void o00oOo00() {
        synchronized (this.f12542o00oo0Oo) {
            o00oOOo0 poll = this.f12541o00oo0O0.poll();
            this.f12543o00oo0o0 = poll;
            if (poll != null) {
                this.f12540o00oo0O.execute(this.f12543o00oo0o0);
            }
        }
    }
}
