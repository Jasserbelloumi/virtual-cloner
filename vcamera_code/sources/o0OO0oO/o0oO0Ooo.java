package o0OO0oO;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public class o0oO0Ooo extends o0O00OOO {
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.2")
    public static final <T> void o0O00(List<T> list) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "<this>");
        Collections.shuffle(list);
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.2")
    public static final <T> void o0O000oo(List<T> list, T t) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "<this>");
        Collections.fill(list, t);
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.sortWith(Comparator(comparison))", imports = {}))
    public static final <T> void o0O00O(List<T> list, o0OOOO.o0O00000<? super T, ? super T, Integer> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "comparison");
        throw new o0OO0o.o0O0O0o0(null, 1, null);
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.2")
    public static final <T> void o0O00O0(List<T> list, Random random) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(random, "random");
        Collections.shuffle(list, random);
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Use sortWith(comparator) instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.sortWith(comparator)", imports = {}))
    public static final <T> void o0O00O0o(List<T> list, Comparator<? super T> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        throw new o0OO0o.o0O0O0o0(null, 1, null);
    }

    public static final <T> void o0O00OO(@NotNull List<T> list, @NotNull Comparator<? super T> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static final <T extends Comparable<? super T>> void o0OoO00O(@NotNull List<T> list) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
