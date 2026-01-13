package o0OOo0O0;

import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO0o.o0OO000;
import o0OOo00O.o0O0oo00;
import o0OOo00O.oO00Oo0;
import o0OOo0O0.o0O0OO;
import o0OOo0oo.oO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lo0OOo0O0/o0O0o;", "E", "Lo0OOo00O/o0O0oo00;", "Lo0OOo0O0/o0O0OO;", "Lo0OOo0O0/o0O000O;", "o00oOo0O", "()Lo0OOo0O0/o0O000O;", "channel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@oO00Oo0
/* loaded from: classes3.dex */
public interface o0O0o<E> extends o0O0oo00, o0O0OO<E> {

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        @NotNull
        public static <E> oO<E> o00oOOoO(@NotNull o0O0o<E> o0o0o) {
            return new o0O0OO.o00oOOo0.C0181o00oOOo0(o0o0o);
        }

        @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @o0OO000(expression = "tryReceive().getOrNull()", imports = {}))
        @Nullable
        public static <E> E o00oOo00(@NotNull o0O0o<E> o0o0o) {
            return (E) o0O0OO.o00oOOo0.o00oOoO(o0o0o);
        }

        @o0OOO0OO.o00oo0OO
        @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @o0OO000(expression = "receiveCatching().getOrNull()", imports = {}))
        @Nullable
        public static <E> Object o00oOooO(@NotNull o0O0o<E> o0o0o, @NotNull o00oOo0O<? super E> o00ooo0o2) {
            return o0O0OO.o00oOOo0.o00oOoOO(o0o0o, o00ooo0o2);
        }
    }

    @NotNull
    o0O000O<E> o00oOo0O();
}
