package o0O0OO;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0O0O0Oo implements Executor {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final ArrayDeque<Runnable> f11387o00oo0O = new ArrayDeque<>();

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Executor f11388o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public Runnable f11389o00oo0Oo;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Runnable f11391o00oo0O0;

        public o00oOOo0(Runnable runnable) {
            this.f11391o00oo0O0 = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f11391o00oo0O0.run();
            } finally {
                o0O0O0Oo.this.o00oOOo0();
            }
        }
    }

    public o0O0O0Oo(@oo0oO0 Executor executor) {
        this.f11388o00oo0O0 = executor;
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f11387o00oo0O.offer(new o00oOOo0(runnable));
        if (this.f11389o00oo0Oo == null) {
            o00oOOo0();
        }
    }

    public synchronized void o00oOOo0() {
        Runnable poll = this.f11387o00oo0O.poll();
        this.f11389o00oo0Oo = poll;
        if (poll != null) {
            this.f11388o00oo0O0.execute(poll);
        }
    }
}
