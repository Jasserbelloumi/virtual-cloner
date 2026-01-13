package o0OOo00O;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO000o.o00oOOoO;
import o0OOO00o.o00oOOo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0000\u001aO\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\tH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u001a\u001e\u0010\u0016\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0015\u001a\n\u0010\u0017\u001a\u00020\u0011*\u00020\u0000\u001a\u0013\u0010\u0018\u001a\u00020\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u001b\u0010\u001f\u001a\u00020\u001a*\u00020\u00008F¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lo0OOo00O/o0O0oo00;", "Lo0OO/o00oo0;", "context", "o00oo00O", o00oOOoO.f12961o00oOo00, "R", "Lkotlin/Function2;", "Lo0OO/o00oOo0O;", "", "Lo0OO0o/o0O000Oo;", "block", "o00oOoO0", "(Lo0OOOO/o0O00000;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o00oOOo0", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lo0OO0o/oO0Ooooo;", "o00oOooO", "", "message", "", "o00oOo00", "o00oOoOo", "o00oOoO", "(Lo0OO/o00oOo0O;)Ljava/lang/Object;", "", "o00oOoo0", "(Lo0OOo00O/o0O0oo00;)Z", "isActive$annotations", "(Lo0OOo00O/o0O0oo00;)V", "isActive", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o0O {
    @NotNull
    public static final o0O0oo00 o00oOOo0(@NotNull o0OO.o00oo0 o00oo0Var) {
        if (o00oo0Var.get(ooOOOOoo.f14136o00oOoO) == null) {
            o00oo0Var = o00oo0Var.plus(oO00O0o0.o00oOo00(null, 1, null));
        }
        return new o0OOo0o0.o0OO00OO(o00oo0Var);
    }

    @NotNull
    public static final o0O0oo00 o00oOOoO() {
        return new o0OOo0o0.o0OO00OO(oO0.o00oOo00(null, 1, null).plus(o0OOO00.o00oOo0O()));
    }

    public static final void o00oOo00(@NotNull o0O0oo00 o0o0oo00, @NotNull String str, @Nullable Throwable th) {
        o00oOooO(o0o0oo00, o.o00oOOo0(str, th));
    }

    public static /* synthetic */ void o00oOo0O(o0O0oo00 o0o0oo00, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        o00oOo00(o0o0oo00, str, th);
    }

    public static /* synthetic */ void o00oOo0o(o0O0oo00 o0o0oo00, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        o00oOooO(o0o0oo00, cancellationException);
    }

    @Nullable
    public static final Object o00oOoO(@NotNull o00oOo0O<? super o0OO.o00oo0> o00ooo0o2) {
        return o00ooo0o2.getContext();
    }

    @Nullable
    public static final <R> Object o00oOoO0(@NotNull o0OOOO.o0O00000<? super o0O0oo00, ? super o00oOo0O<? super R>, ? extends Object> o0o00000, @NotNull o00oOo0O<? super R> o00ooo0o2) {
        o0OOo0o0.oO000 oo000 = new o0OOo0o0.oO000(o00ooo0o2.getContext(), o00ooo0o2);
        Object o00oOo0o2 = o0OOo0o.o0O000O.o00oOo0o(oo000, oo000, o0o00000);
        if (o00oOo0o2 == o00oOOo0.COROUTINE_SUSPENDED) {
            o0OOO0.o00oo0OO.o00oOo00(o00ooo0o2);
        }
        return o00oOo0o2;
    }

    public static final Object o00oOoOO(o00oOo0O<? super o0OO.o00oo0> o00ooo0o2) {
        throw null;
    }

    public static final void o00oOoOo(@NotNull o0O0oo00 o0o0oo00) {
        oO00O0o0.o00ooO00(o0o0oo00.o0O000O());
    }

    public static final boolean o00oOoo0(@NotNull o0O0oo00 o0o0oo00) {
        ooOOOOoo oooooooo = (ooOOOOoo) o0o0oo00.o0O000O().get(ooOOOOoo.f14136o00oOoO);
        if (oooooooo != null) {
            return oooooooo.isActive();
        }
        return true;
    }

    public static final void o00oOooO(@NotNull o0O0oo00 o0o0oo00, @Nullable CancellationException cancellationException) {
        ooOOOOoo oooooooo = (ooOOOOoo) o0o0oo00.o0O000O().get(ooOOOOoo.f14136o00oOoO);
        if (oooooooo != null) {
            oooooooo.o00oOOoO(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + o0o0oo00).toString());
    }

    public static /* synthetic */ void o00oOooo(o0O0oo00 o0o0oo00) {
    }

    @NotNull
    public static final o0O0oo00 o00oo00O(@NotNull o0O0oo00 o0o0oo00, @NotNull o0OO.o00oo0 o00oo0Var) {
        return new o0OOo0o0.o0OO00OO(o0o0oo00.o0O000O().plus(o00oo0Var));
    }
}
