package o0OOOo0o;

import java.lang.Comparable;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public interface o0O00o00<T extends Comparable<? super T>> {

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public static <T extends Comparable<? super T>> boolean o00oOOo0(@NotNull o0O00o00<T> o0o00o00, @NotNull T t) {
            o0OOOOO0.o0ooO.o00oo0O0(t, "value");
            return t.compareTo(o0o00o00.o00oOOo0()) >= 0 && t.compareTo(o0o00o00.o00oOo00()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean o00oOOoO(@NotNull o0O00o00<T> o0o00o00) {
            return o0o00o00.o00oOOo0().compareTo(o0o00o00.o00oOo00()) > 0;
        }
    }

    boolean contains(@NotNull T t);

    boolean isEmpty();

    @NotNull
    T o00oOOo0();

    @NotNull
    T o00oOo00();
}
