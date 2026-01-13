package o0OOo0o0;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\".\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00028À\u0002@À\u0002X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljava/util/concurrent/atomic/AtomicInteger;", "Lkotlinx/coroutines/internal/LocalAtomicInt;", "", "value", "o00oOOo0", "(Ljava/util/concurrent/atomic/AtomicInteger;)I", o00oOOoO.f12961o00oOo00, "(Ljava/util/concurrent/atomic/AtomicInteger;I)V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o0OOO00 {
    public static final int o00oOOo0(@NotNull AtomicInteger atomicInteger) {
        return atomicInteger.get();
    }

    public static final void o00oOOoO(@NotNull AtomicInteger atomicInteger, int i) {
        atomicInteger.set(i);
    }
}
