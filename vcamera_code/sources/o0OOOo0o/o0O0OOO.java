package o0OOOo0o;

import java.lang.Comparable;
import o0OO0o.o0O000;
import o0OO0o.o0OO00o0;
import org.jetbrains.annotations.NotNull;
@o0O000
@o0OO00o0(version = "1.7")
/* loaded from: classes3.dex */
public interface o0O0OOO<T extends Comparable<? super T>> {

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public static <T extends Comparable<? super T>> boolean o00oOOo0(@NotNull o0O0OOO<T> o0o0ooo, @NotNull T t) {
            o0OOOOO0.o0ooO.o00oo0O0(t, "value");
            return t.compareTo(o0o0ooo.o00oOOo0()) >= 0 && t.compareTo(o0o0ooo.o00oOooO()) < 0;
        }

        public static <T extends Comparable<? super T>> boolean o00oOOoO(@NotNull o0O0OOO<T> o0o0ooo) {
            return o0o0ooo.o00oOOo0().compareTo(o0o0ooo.o00oOooO()) >= 0;
        }
    }

    boolean contains(@NotNull T t);

    boolean isEmpty();

    @NotNull
    T o00oOOo0();

    @NotNull
    T o00oOooO();
}
