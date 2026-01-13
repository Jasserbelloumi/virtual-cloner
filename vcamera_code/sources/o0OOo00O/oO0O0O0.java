package o0OOo00O;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016¨\u0006\u0012"}, d2 = {"Lo0OOo00O/oO0O0O0;", "Lo0OOo00O/o0O0o000;", "", "parallelism", "o0O0oOoo", "Lo0OO/o00oo0;", "context", "", "o0O0oOoO", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lo0OO0o/oO0Ooooo;", "oo0oOOo", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0O0O0 extends o0O0o000 {
    @NotNull

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final oO0O0O0 f14103o00oo0Oo = new oO0O0O0();

    @Override // o0OOo00O.o0O0o000
    public boolean o0O0oOoO(@NotNull o0OO.o00oo0 o00oo0Var) {
        return false;
    }

    @Override // o0OOo00O.o0O0o000
    @oO0000Oo
    @NotNull
    public o0O0o000 o0O0oOoo(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // o0OOo00O.o0O0o000
    public void oo0oOOo(@NotNull o0OO.o00oo0 o00oo0Var, @NotNull Runnable runnable) {
        oOo0oooO ooo0oooo = (oOo0oooO) o00oo0Var.get(oOo0oooO.f14124o00oo0Oo);
        if (ooo0oooo == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        ooo0oooo.f14125o00oo0O = true;
    }

    @Override // o0OOo00O.o0O0o000
    @NotNull
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
