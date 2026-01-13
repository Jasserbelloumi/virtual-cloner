package androidx.lifecycle;

import java.util.ArrayDeque;
import java.util.Queue;
import o0OOo00O.oO00OO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class o00ooO {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public boolean f3312o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public boolean f3313o00oOo00;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f3311o00oOOo0 = true;
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final Queue<Runnable> f3314o00oOooO = new ArrayDeque();

    public static final void o00oOooO(o00ooO o00ooo, Runnable runnable) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooo, "this$0");
        o0OOOOO0.o0ooO.o00oo0O0(runnable, "$runnable");
        o00ooo.o00oOo0o(runnable);
    }

    @o00oOooO.o0O
    public final boolean o00oOOoO() {
        return this.f3312o00oOOoO || !this.f3311o00oOOo0;
    }

    @o00oOooO.o0O000O
    public final void o00oOo00(@NotNull o0OO.o00oo0 o00oo0Var, @NotNull final Runnable runnable) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "context");
        o0OOOOO0.o0ooO.o00oo0O0(runnable, "runnable");
        oO00OO o0O0oo2 = o0OOo00O.o0OOO00.o00oOo0O().o0O0oo();
        if (o0O0oo2.o0O0oOoO(o00oo0Var) || o00oOOoO()) {
            o0O0oo2.oo0oOOo(o00oo0Var, new Runnable() { // from class: androidx.lifecycle.o00ooO0
                @Override // java.lang.Runnable
                public final void run() {
                    o00ooO.o00oOooO(o00ooO.this, runnable);
                }
            });
        } else {
            o00oOo0o(runnable);
        }
    }

    @o00oOooO.o0O
    public final void o00oOo0O() {
        if (this.f3313o00oOo00) {
            return;
        }
        try {
            this.f3313o00oOo00 = true;
            while ((!this.f3314o00oOooO.isEmpty()) && o00oOOoO()) {
                Runnable poll = this.f3314o00oOooO.poll();
                if (poll != null) {
                    poll.run();
                }
            }
        } finally {
            this.f3313o00oOo00 = false;
        }
    }

    @o00oOooO.o0O
    public final void o00oOo0o(Runnable runnable) {
        if (!this.f3314o00oOooO.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables".toString());
        }
        o00oOo0O();
    }

    @o00oOooO.o0O
    public final void o00oOoO() {
        this.f3311o00oOOo0 = true;
    }

    @o00oOooO.o0O
    public final void o00oOoO0() {
        this.f3312o00oOOoO = true;
        o00oOo0O();
    }

    @o00oOooO.o0O
    public final void o00oOoOO() {
        if (this.f3311o00oOOo0) {
            if (!(!this.f3312o00oOOoO)) {
                throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
            }
            this.f3311o00oOOo0 = false;
            o00oOo0O();
        }
    }
}
