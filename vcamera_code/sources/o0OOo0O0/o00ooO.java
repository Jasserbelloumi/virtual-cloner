package o0OOo0O0;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OO0o.o0OO000;
import o0OOo00O.oO00Oo0;
import o0OOo0O0.o0OooO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&J\u001a\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H&J\u0014\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\nH'¨\u0006\r"}, d2 = {"Lo0OOo0O0/o00ooO;", "E", "Lo0OOo0O0/o0OooO0;", "Lo0OOo0O0/o0O0OO;", "o00oo0Oo", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lo0OO0o/oO0Ooooo;", o00oOOoO.f12961o00oOo00, "", "", "o00oOOo0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@oO00Oo0
/* loaded from: classes3.dex */
public interface o00ooO<E> extends o0OooO0<E> {

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public static /* synthetic */ void o00oOOo0(o00ooO o00ooo, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            o00ooo.o00oOOoO(cancellationException);
        }

        public static /* synthetic */ boolean o00oOOoO(o00ooO o00ooo, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return o00ooo.o00oOOo0(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @o0OO000(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean o00oOo00(@NotNull o00ooO<E> o00ooo, E e) {
            return o0OooO0.o00oOOo0.o00oOo00(o00ooo, e);
        }
    }

    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility only")
    /* synthetic */ boolean o00oOOo0(Throwable th);

    void o00oOOoO(@Nullable CancellationException cancellationException);

    @NotNull
    o0O0OO<E> o00oo0Oo();
}
