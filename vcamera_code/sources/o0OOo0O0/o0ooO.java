package o0OOo0O0;

import kotlin.Metadata;
import o0OO0o.o0OO000;
import o0OOo00O.o0O0oo00;
import o0OOo0O0.o0OooO0;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lo0OOo0O0/o0ooO;", "E", "Lo0OOo00O/o0O0oo00;", "Lo0OOo0O0/o0OooO0;", "o00oOo0O", "()Lo0OOo0O0/o0OooO0;", "channel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface o0ooO<E> extends o0O0oo00, o0OooO0<E> {

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @o0OO000(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean o00oOOo0(@NotNull o0ooO<? super E> o0ooo, E e) {
            return o0OooO0.o00oOOo0.o00oOo00(o0ooo, e);
        }
    }

    @NotNull
    o0OooO0<E> o00oOo0O();
}
