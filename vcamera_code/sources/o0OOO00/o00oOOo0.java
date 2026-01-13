package o0OOO00;

import java.util.concurrent.CancellationException;
import o0OO0o.o0OO00o0;
import o0OOO0OO.o00oo00O;
import o0OOOOO0.o0OOO00;
@o0OOO00({"SMAP\nCancellationException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellationException.kt\nkotlin/coroutines/cancellation/CancellationExceptionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
/* loaded from: classes3.dex */
public final class o00oOOo0 {
    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final CancellationException o00oOOo0(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final CancellationException o00oOOoO(Throwable th) {
        CancellationException cancellationException = new CancellationException(th != null ? th.toString() : null);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @o0OO00o0(version = "1.4")
    public static /* synthetic */ void o00oOo00() {
    }
}
