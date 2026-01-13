package androidx.lifecycle;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
import o00oOooO.oO0Oo;
import o00oOooo.oO00000;
import org.jetbrains.annotations.NotNull;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class o00oo0O0<T> {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Executor f3302o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final LiveData<T> f3303o00oOOoO;
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final LiveData<T> f3304o00oOo00;
    @NotNull

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final AtomicBoolean f3305o00oOo0O;
    @o0OOOO0o.o00oOoO
    @NotNull

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final Runnable f3306o00oOo0o;
    @o0OOOO0o.o00oOoO
    @NotNull

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final Runnable f3307o00oOoO0;
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final AtomicBoolean f3308o00oOooO;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends LiveData<T> {

        /* renamed from: o00oo00O  reason: collision with root package name */
        public final /* synthetic */ o00oo0O0<T> f3309o00oo00O;

        public o00oOOo0(o00oo0O0<T> o00oo0o02) {
            this.f3309o00oo00O = o00oo0o02;
        }

        @Override // androidx.lifecycle.LiveData
        public void o00oo00O() {
            this.f3309o00oo00O.o00oOo0O().execute(this.f3309o00oo00O.f3306o00oOo0o);
        }
    }

    @o0OOOO0o.o00oo0O0
    public o00oo0O0() {
        this(null, 1, null);
    }

    @o0OOOO0o.o00oo0O0
    public o00oo0O0(@NotNull Executor executor) {
        o0OOOOO0.o0ooO.o00oo0O0(executor, "executor");
        this.f3302o00oOOo0 = executor;
        o00oOOo0 o00oooo02 = new o00oOOo0(this);
        this.f3303o00oOOoO = o00oooo02;
        this.f3304o00oOo00 = o00oooo02;
        this.f3308o00oOooO = new AtomicBoolean(true);
        this.f3305o00oOo0O = new AtomicBoolean(false);
        this.f3306o00oOo0o = new Runnable() { // from class: androidx.lifecycle.o00oo0
            @Override // java.lang.Runnable
            public final void run() {
                o00oo0O0.o00oOooo(o00oo0O0.this);
            }
        };
        this.f3307o00oOoO0 = new Runnable() { // from class: androidx.lifecycle.o00oo0OO
            @Override // java.lang.Runnable
            public final void run() {
                o00oo0O0.o00oOoo0(o00oo0O0.this);
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ o00oo0O0(java.util.concurrent.Executor r1, int r2, o0OOOOO0.o0O00 r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto Ld
            java.util.concurrent.Executor r1 = o00oOooo.oO00000.o00oOoO0()
            java.lang.String r2 = "getIOThreadExecutor()"
            o0OOOOO0.o0ooO.o00oo0OO(r1, r2)
        Ld:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.o00oo0O0.<init>(java.util.concurrent.Executor, int, o0OOOOO0.o0O00):void");
    }

    @o0o0000
    public static /* synthetic */ void o00oOoO0() {
    }

    @o0o0000
    public static /* synthetic */ void o00oOoOO() {
    }

    public static final void o00oOoo0(o00oo0O0 o00oo0o02) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0o02, "this$0");
        boolean o00oOoO2 = o00oo0o02.o00oOoO().o00oOoO();
        if (o00oo0o02.f3308o00oOooO.compareAndSet(false, true) && o00oOoO2) {
            o00oo0o02.f3302o00oOOo0.execute(o00oo0o02.f3306o00oOo0o);
        }
    }

    public static final void o00oOooo(o00oo0O0 o00oo0o02) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0o02, "this$0");
        do {
            boolean z = false;
            if (o00oo0o02.f3305o00oOo0O.compareAndSet(false, true)) {
                T t = null;
                boolean z2 = false;
                while (o00oo0o02.f3308o00oOooO.compareAndSet(true, false)) {
                    try {
                        t = (T) o00oo0o02.o00oOo00();
                        z2 = true;
                    } catch (Throwable th) {
                        o00oo0o02.f3305o00oOo0O.set(false);
                        throw th;
                    }
                }
                if (z2) {
                    o00oo0o02.o00oOoO().o00oo0OO(t);
                }
                o00oo0o02.f3305o00oOo0O.set(false);
                z = z2;
            }
            if (!z) {
                return;
            }
        } while (o00oo0o02.f3308o00oOooO.get());
    }

    @oO0Oo
    public abstract T o00oOo00();

    @NotNull
    public final Executor o00oOo0O() {
        return this.f3302o00oOOo0;
    }

    @NotNull
    public final AtomicBoolean o00oOo0o() {
        return this.f3308o00oOooO;
    }

    @NotNull
    public LiveData<T> o00oOoO() {
        return this.f3304o00oOo00;
    }

    public void o00oOoOo() {
        oO00000.o00oOoO().o00oOOoO(this.f3307o00oOoO0);
    }

    @NotNull
    public final AtomicBoolean o00oOooO() {
        return this.f3305o00oOo0O;
    }
}
