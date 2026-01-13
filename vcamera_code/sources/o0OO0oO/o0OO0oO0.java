package o0OO0oO;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import o0OO0o.oO0Ooooo;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public class o0OO0oO0 {
    @o0OO0o.o0O
    @o0OO0o.o0OO00o0(version = "1.3")
    @NotNull
    public static final <E> Set<E> o00oOOo0(@NotNull Set<E> set) {
        o0OOOOO0.o0ooO.o00oo0O0(set, "builder");
        return ((o0OO0oOO.o0O0oo0o) set).build();
    }

    @o0OO0o.o0O
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final <E> Set<E> o00oOOoO(int i, o0OOOO.o00oo<? super Set<E>, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "builderAction");
        o0OO0oOO.o0O0oo0o o0o0oo0o = new o0OO0oOO.o0O0oo0o(i);
        o00ooVar.invoke(o0o0oo0o);
        return o00oOOo0(o0o0oo0o);
    }

    @o0OO0o.o0O
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final <E> Set<E> o00oOo00(o0OOOO.o00oo<? super Set<E>, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "builderAction");
        o0OO0oOO.o0O0oo0o o0o0oo0o = new o0OO0oOO.o0O0oo0o();
        o00ooVar.invoke(o0o0oo0o);
        return o00oOOo0(o0o0oo0o);
    }

    @o0OO0o.o0O
    @o0OO0o.o0OO00o0(version = "1.3")
    @NotNull
    public static final <E> Set<E> o00oOo0O(int i) {
        return new o0OO0oOO.o0O0oo0o(i);
    }

    @NotNull
    public static final <T> Set<T> o00oOo0o(T t) {
        Set<T> singleton = Collections.singleton(t);
        o0OOOOO0.o0ooO.o00oo0OO(singleton, "singleton(element)");
        return singleton;
    }

    @NotNull
    public static final <T> TreeSet<T> o00oOoO(@NotNull T... tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "elements");
        return (TreeSet) o0O000O.oooO000(tArr, new TreeSet());
    }

    @NotNull
    public static final <T> TreeSet<T> o00oOoO0(@NotNull Comparator<? super T> comparator, @NotNull T... tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "elements");
        return (TreeSet) o0O000O.oooO000(tArr, new TreeSet(comparator));
    }

    @o0OO0o.o0O
    @o0OO0o.o0OO00o0(version = "1.3")
    @NotNull
    public static final <E> Set<E> o00oOooO() {
        return new o0OO0oOO.o0O0oo0o();
    }
}
