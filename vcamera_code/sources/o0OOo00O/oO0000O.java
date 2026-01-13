package o0OOo00O;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0005*\u0010\b\u0007\u0010\n\"\u00020\u00012\u00020\u0001B\u0002\b\t¨\u0006\u000b"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "Lo0OOo00O/oO00000;", "o00oOooO", "(Ljava/util/concurrent/ExecutorService;)Lo0OOo00O/oO00000;", "Ljava/util/concurrent/Executor;", "Lo0OOo00O/o0O0o000;", "o00oOo00", "(Ljava/util/concurrent/Executor;)Lo0OOo00O/o0O0o000;", o00oOOoO.f12961o00oOo00, "Lo0OOo00O/oO0000Oo;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0000O {
    @oO0000Oo
    public static /* synthetic */ void o00oOOo0() {
    }

    @NotNull
    public static final Executor o00oOOoO(@NotNull o0O0o000 o0o0o000) {
        Executor o0O0oo2;
        oO00000 oo00000 = o0o0o000 instanceof oO00000 ? (oO00000) o0o0o000 : null;
        return (oo00000 == null || (o0O0oo2 = oo00000.o0O0oo()) == null) ? new o0OO(o0o0o000) : o0O0oo2;
    }

    @o0OOOO0o.o00oo0OO(name = "from")
    @NotNull
    public static final o0O0o000 o00oOo00(@NotNull Executor executor) {
        o0O0o000 o0o0o000;
        o0OO o0oo = executor instanceof o0OO ? (o0OO) executor : null;
        return (o0oo == null || (o0o0o000 = o0oo.f14020o00oo0O0) == null) ? new oO00000o(executor) : o0o0o000;
    }

    @o0OOOO0o.o00oo0OO(name = "from")
    @NotNull
    public static final oO00000 o00oOooO(@NotNull ExecutorService executorService) {
        return new oO00000o(executorService);
    }
}
