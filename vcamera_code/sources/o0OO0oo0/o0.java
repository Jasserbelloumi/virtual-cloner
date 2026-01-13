package o0OO0oo0;

import java.util.Comparator;
import o0OO0o.o0OO00o0;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public class o0 extends o00ooO {
    @o0OO00o0(version = "1.4")
    public static final <T> T o0O0O0Oo(T t, @NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        o0ooO.o00oo0O0(tArr, "other");
        o0ooO.o00oo0O0(comparator, "comparator");
        for (T t2 : tArr) {
            if (comparator.compare(t, t2) < 0) {
                t = t2;
            }
        }
        return t;
    }

    @o0OO00o0(version = "1.1")
    public static final <T> T o0O0O0o(T t, T t2, @NotNull Comparator<? super T> comparator) {
        o0ooO.o00oo0O0(comparator, "comparator");
        return comparator.compare(t, t2) <= 0 ? t : t2;
    }

    @o0OO00o0(version = "1.1")
    public static final <T> T o0O0O0o0(T t, T t2, T t3, @NotNull Comparator<? super T> comparator) {
        o0ooO.o00oo0O0(comparator, "comparator");
        return (T) o0O0O0o(t, o0O0O0o(t2, t3, comparator), comparator);
    }

    @o0OO00o0(version = "1.4")
    public static final <T> T o0O0O0oO(T t, @NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        o0ooO.o00oo0O0(tArr, "other");
        o0ooO.o00oo0O0(comparator, "comparator");
        for (T t2 : tArr) {
            if (comparator.compare(t, t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    @o0OO00o0(version = "1.1")
    public static final <T> T o0O0oo0o(T t, T t2, @NotNull Comparator<? super T> comparator) {
        o0ooO.o00oo0O0(comparator, "comparator");
        return comparator.compare(t, t2) >= 0 ? t : t2;
    }

    @o0OO00o0(version = "1.1")
    public static final <T> T o0oO0O0o(T t, T t2, T t3, @NotNull Comparator<? super T> comparator) {
        o0ooO.o00oo0O0(comparator, "comparator");
        return (T) o0O0oo0o(t, o0O0oo0o(t2, t3, comparator), comparator);
    }
}
