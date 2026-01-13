package o0OOo00O;

import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nR(\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0011"}, d2 = {"Lo0OOo00O/oO0O00;", "", "Lo0OOo00O/o0OOo000;", "o00oOOo0", "()Lo0OOo00O/o0OOo000;", "Lo0OO0o/oO0Ooooo;", "o00oOo00", "()V", "eventLoop", "o00oOooO", "(Lo0OOo00O/o0OOo000;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", o00oOOoO.f12961o00oOo00, "Ljava/lang/ThreadLocal;", "ref", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0O00 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final oO0O00 f14094o00oOOo0 = new oO0O00();
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final ThreadLocal<o0OOo000> f14095o00oOOoO = new ThreadLocal<>();

    @Nullable
    public final o0OOo000 o00oOOo0() {
        return f14095o00oOOoO.get();
    }

    @NotNull
    public final o0OOo000 o00oOOoO() {
        ThreadLocal<o0OOo000> threadLocal = f14095o00oOOoO;
        o0OOo000 o0ooo000 = threadLocal.get();
        if (o0ooo000 == null) {
            o0OOo000 o00oOOo02 = o0oo0000.o00oOOo0();
            threadLocal.set(o00oOOo02);
            return o00oOOo02;
        }
        return o0ooo000;
    }

    public final void o00oOo00() {
        f14095o00oOOoO.set(null);
    }

    public final void o00oOooO(@NotNull o0OOo000 o0ooo000) {
        f14095o00oOOoO.set(o0ooo000);
    }
}
