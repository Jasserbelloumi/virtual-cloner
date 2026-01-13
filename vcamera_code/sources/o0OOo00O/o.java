package o0OOo00O;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0080\b*\n\u0010\n\"\u00020\u00042\u00020\u0004¨\u0006\u000b"}, d2 = {"", "message", "", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "o00oOOo0", "other", "Lo0OO0o/oO0Ooooo;", o00oOOoO.f12961o00oOo00, "CancellationException", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o {
    @NotNull
    public static final CancellationException o00oOOo0(@Nullable String str, @Nullable Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final void o00oOOoO(@NotNull Throwable th, @NotNull Throwable th2) {
        o0OO0o.o0O00000.o00oOOo0(th, th2);
    }
}
