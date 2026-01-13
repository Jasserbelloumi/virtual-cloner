package o0OOo00O;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\t\u0010\u0001\u001a\u00020\u0000H\u0081\b\u001a\t\u0010\u0002\u001a\u00020\u0000H\u0081\b\u001a\u0019\u0010\u0006\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0081\b\u001a\t\u0010\b\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\t\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\n\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\u000b\u001a\u00020\u0007H\u0081\b\u001a\u0019\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0000H\u0081\b\u001a\u0011\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0081\b\"$\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0001\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"", "o00oOOo0", "o00oOo00", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "o00oOoo0", "Lo0OO0o/oO0Ooooo;", "o00oOoO0", "o00oOoO", "o00oOo0O", "o00oOoOo", "", "blocker", "nanos", "o00oOooO", "Ljava/lang/Thread;", "thread", "o00oOoOO", "Lo0OOo00O/o00oo00O;", "Lo0OOo00O/o00oo00O;", o00oOOoO.f12961o00oOo00, "()Lo0OOo00O/o00oo00O;", "o00oOo0o", "(Lo0OOo00O/o00oo00O;)V", "timeSource", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o00oo0 {
    @Nullable

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static o00oo00O f13979o00oOOo0;

    @o0OOO0OO.o00oo00O
    public static final long o00oOOo0() {
        o00oo00O o00oo00o = f13979o00oOOo0;
        return o00oo00o != null ? o00oo00o.o00oOOo0() : System.currentTimeMillis();
    }

    @Nullable
    public static final o00oo00O o00oOOoO() {
        return f13979o00oOOo0;
    }

    @o0OOO0OO.o00oo00O
    public static final long o00oOo00() {
        o00oo00O o00oo00o = f13979o00oOOo0;
        return o00oo00o != null ? o00oo00o.o00oOOoO() : System.nanoTime();
    }

    @o0OOO0OO.o00oo00O
    public static final void o00oOo0O() {
        o00oo00O o00oo00o = f13979o00oOOo0;
        if (o00oo00o != null) {
            o00oo00o.o00oOooO();
        }
    }

    public static final void o00oOo0o(@Nullable o00oo00O o00oo00o) {
        f13979o00oOOo0 = o00oo00o;
    }

    @o0OOO0OO.o00oo00O
    public static final void o00oOoO() {
        o00oo00O o00oo00o = f13979o00oOOo0;
        if (o00oo00o != null) {
            o00oo00o.o00oOo0o();
        }
    }

    @o0OOO0OO.o00oo00O
    public static final void o00oOoO0() {
        o00oo00O o00oo00o = f13979o00oOOo0;
        if (o00oo00o != null) {
            o00oo00o.o00oOo0O();
        }
    }

    @o0OOO0OO.o00oo00O
    public static final void o00oOoOO(Thread thread) {
        o0OO0o.oO0Ooooo oo0ooooo;
        o00oo00O o00oo00o = f13979o00oOOo0;
        if (o00oo00o != null) {
            o00oo00o.o00oOoO0(thread);
            oo0ooooo = o0OO0o.oO0Ooooo.f13240o00oOOo0;
        } else {
            oo0ooooo = null;
        }
        if (oo0ooooo == null) {
            LockSupport.unpark(thread);
        }
    }

    @o0OOO0OO.o00oo00O
    public static final void o00oOoOo() {
        o00oo00O o00oo00o = f13979o00oOOo0;
        if (o00oo00o != null) {
            o00oo00o.o00oOoO();
        }
    }

    @o0OOO0OO.o00oo00O
    public static final Runnable o00oOoo0(Runnable runnable) {
        Runnable o00oOoOO2;
        o00oo00O o00oo00o = f13979o00oOOo0;
        return (o00oo00o == null || (o00oOoOO2 = o00oo00o.o00oOoOO(runnable)) == null) ? runnable : o00oOoOO2;
    }

    @o0OOO0OO.o00oo00O
    public static final void o00oOooO(Object obj, long j) {
        o0OO0o.oO0Ooooo oo0ooooo;
        o00oo00O o00oo00o = f13979o00oOOo0;
        if (o00oo00o != null) {
            o00oo00o.o00oOo00(obj, j);
            oo0ooooo = o0OO0o.oO0Ooooo.f13240o00oOOo0;
        } else {
            oo0ooooo = null;
        }
        if (oo0ooooo == null) {
            LockSupport.parkNanos(obj, j);
        }
    }
}
