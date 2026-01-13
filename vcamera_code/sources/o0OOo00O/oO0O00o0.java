package o0OOo00O;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¨\u0006\u0007"}, d2 = {"", "name", "Lo0OOo00O/oO00000;", "o00oOooO", "", "nThreads", o00oOOoO.f12961o00oOo00, "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0O00o0 {
    @o0OOooO0
    @NotNull
    public static final oO00000 o00oOOoO(final int i, @NotNull final String str) {
        if (i >= 1) {
            final AtomicInteger atomicInteger = new AtomicInteger();
            return new oO00000o(Executors.newScheduledThreadPool(i, new ThreadFactory() { // from class: o0OOo00O.oO0O00O
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return oO0O00o0.o00oOo00(i, str, atomicInteger, runnable);
                }
            }));
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Expected at least one thread, but ", i, " specified").toString());
    }

    public static final Thread o00oOo00(int i, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }

    @o0OOooO0
    @NotNull
    public static final oO00000 o00oOooO(@NotNull String str) {
        return o00oOOoO(1, str);
    }
}
