package o0OOo0oO;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import o0OO.o00oo0;
import o0OO.o00oo0O0;
import o0OOo00O.o0O0o000;
import o0OOo00O.o0OOO0;
import o0OOo00O.oO00000;
import o0OOo00O.oO0000Oo;
import o0OOo00O.oO0o0o;
import o0OOo0o0.oO000OOo;
import o0OOo0o0.oO0Oo0oo;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u001c\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00060\u0003j\u0002`\rH\u0016J\u001c\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00060\u0003j\u0002`\rH\u0017J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lo0OOo0oO/oO0O0O00;", "Lo0OOo00O/oO00000;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "Lo0OO0o/oO0Ooooo;", "execute", "", "parallelism", "Lo0OOo00O/o0O0o000;", "o0O0oOoo", "Lo0OO/o00oo0;", "context", "Lkotlinx/coroutines/Runnable;", "block", "oo0oOOo", "o0O0oOo", "close", "", "toString", "o00oo0o", "Lo0OOo00O/o0O0o000;", "default", "o0O0oo", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0O0O00 extends oO00000 implements Executor {
    @NotNull

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final o0O0o000 f14682o00oo0o;
    @NotNull

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final oO0O0O00 f14683o00oo0o0 = new oO0O0O00();

    static {
        oO0OOO0 oo0ooo0 = oO0OOO0.f14701o00oo0Oo;
        int o00oOOo02 = oO0Oo0oo.o00oOOo0();
        f14682o00oo0o = oo0ooo0.o0O0oOoo(oO000OOo.o00oOooO(o0OOO0.f14040o00oOOo0, 64 < o00oOOo02 ? o00oOOo02 : 64, 0, 0, 12, null));
    }

    @Override // o0OOo00O.oO00000, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        oo0oOOo(o00oo0O0.INSTANCE, runnable);
    }

    @Override // o0OOo00O.o0O0o000
    @oO0o0o
    public void o0O0oOo(@NotNull o00oo0 o00oo0Var, @NotNull Runnable runnable) {
        f14682o00oo0o.o0O0oOo(o00oo0Var, runnable);
    }

    @Override // o0OOo00O.o0O0o000
    @oO0000Oo
    @NotNull
    public o0O0o000 o0O0oOoo(int i) {
        return oO0OOO0.f14701o00oo0Oo.o0O0oOoo(i);
    }

    @Override // o0OOo00O.oO00000
    @NotNull
    public Executor o0O0oo() {
        return this;
    }

    @Override // o0OOo00O.o0O0o000
    public void oo0oOOo(@NotNull o00oo0 o00oo0Var, @NotNull Runnable runnable) {
        f14682o00oo0o.oo0oOOo(o00oo0Var, runnable);
    }

    @Override // o0OOo00O.o0O0o000
    @NotNull
    public String toString() {
        return "Dispatchers.IO";
    }
}
