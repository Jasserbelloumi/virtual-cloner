package o00oOooo;

import java.util.concurrent.Executor;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class oO00000 extends oO0000O {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static volatile oO00000 f7144o00oOo00;
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public oO0000O f7147o00oOOo0;
    @oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final oO0000O f7148o00oOOoO;
    @oo0oO0

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final Executor f7146o00oOooO = new Executor() { // from class: o00oOooo.ooo0Oo0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            oO00000.o00oOoOo(runnable);
        }
    };
    @oo0oO0

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final Executor f7145o00oOo0O = new Executor() { // from class: o00oOooo.o
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            oO00000.o00oOoo0(runnable);
        }
    };

    public oO00000() {
        oO00000o oo00000o = new oO00000o();
        this.f7148o00oOOoO = oo00000o;
        this.f7147o00oOOo0 = oo00000o;
    }

    @oo0oO0
    public static oO00000 o00oOoO() {
        if (f7144o00oOo00 != null) {
            return f7144o00oOo00;
        }
        synchronized (oO00000.class) {
            if (f7144o00oOo00 == null) {
                f7144o00oOo00 = new oO00000();
            }
        }
        return f7144o00oOo00;
    }

    @oo0oO0
    public static Executor o00oOoO0() {
        return f7145o00oOo0O;
    }

    @oo0oO0
    public static Executor o00oOoOO() {
        return f7146o00oOooO;
    }

    public static /* synthetic */ void o00oOoOo(Runnable runnable) {
        o00oOoO().o00oOooO(runnable);
    }

    public static /* synthetic */ void o00oOoo0(Runnable runnable) {
        o00oOoO().o00oOOo0(runnable);
    }

    @Override // o00oOooo.oO0000O
    public void o00oOOo0(@oo0oO0 Runnable runnable) {
        this.f7147o00oOOo0.o00oOOo0(runnable);
    }

    @Override // o00oOooo.oO0000O
    public boolean o00oOo00() {
        return this.f7147o00oOOo0.o00oOo00();
    }

    @Override // o00oOooo.oO0000O
    public void o00oOooO(@oo0oO0 Runnable runnable) {
        this.f7147o00oOOo0.o00oOooO(runnable);
    }

    public void o00oOooo(@o0OO00OO oO0000O oo0000o) {
        if (oo0000o == null) {
            oo0000o = this.f7148o00oOOoO;
        }
        this.f7147o00oOOo0 = oo0000o;
    }
}
