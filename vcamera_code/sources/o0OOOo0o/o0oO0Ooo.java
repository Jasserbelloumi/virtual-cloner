package o0OOOo0o;

import java.lang.Comparable;
import o0OO0o.o0OO00o0;
import org.jetbrains.annotations.NotNull;
@o0OO00o0(version = "1.1")
/* loaded from: classes3.dex */
public interface o0oO0Ooo<T extends Comparable<? super T>> extends o0O00o00<T> {

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public static <T extends Comparable<? super T>> boolean o00oOOo0(@NotNull o0oO0Ooo<T> o0oo0ooo, @NotNull T t) {
            o0OOOOO0.o0ooO.o00oo0O0(t, "value");
            return o0oo0ooo.o00oOOoO(o0oo0ooo.o00oOOo0(), t) && o0oo0ooo.o00oOOoO(t, o0oo0ooo.o00oOo00());
        }

        public static <T extends Comparable<? super T>> boolean o00oOOoO(@NotNull o0oO0Ooo<T> o0oo0ooo) {
            return !o0oo0ooo.o00oOOoO(o0oo0ooo.o00oOOo0(), o0oo0ooo.o00oOo00());
        }
    }

    @Override // o0OOOo0o.o0O00o00, o0OOOo0o.o0O0OOO
    boolean contains(@NotNull T t);

    @Override // o0OOOo0o.o0O00o00, o0OOOo0o.o0O0OOO
    boolean isEmpty();

    boolean o00oOOoO(@NotNull T t, @NotNull T t2);
}
