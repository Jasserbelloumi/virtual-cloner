package o0OO0oO;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import o0OO0o.oO0Oo0oo;
import o0OO0o.oO0Ooooo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public class o0OO0oO extends o0OO0oO0 {
    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.6")
    public static final <E> Set<E> o00oOoOO(int i, @o0OO0o.o00oOOoO o0OOOO.o00oo<? super Set<E>, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "builderAction");
        o0OO0oOO.o0O0oo0o o0o0oo0o = new o0OO0oOO.o0O0oo0o(i);
        o00ooVar.invoke(o0o0oo0o);
        return o0OO0oO0.o00oOOo0(o0o0oo0o);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.6")
    public static final <E> Set<E> o00oOoOo(@o0OO0o.o00oOOoO o0OOOO.o00oo<? super Set<E>, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "builderAction");
        o0OO0oOO.o0O0oo0o o0o0oo0o = new o0OO0oOO.o0O0oo0o();
        o00ooVar.invoke(o0o0oo0o);
        return o0OO0oO0.o00oOOo0(o0o0oo0o);
    }

    @NotNull
    public static final <T> Set<T> o00oOoo0() {
        return o0O0OO.INSTANCE;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final <T> HashSet<T> o00oOooo() {
        return new HashSet<>();
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @NotNull
    public static final <T> Set<T> o00oo(@NotNull T... tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "elements");
        return (Set) o0O000O.oO00ooOO(tArr, new LinkedHashSet());
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final <T> LinkedHashSet<T> o00oo0() {
        return new LinkedHashSet<>();
    }

    @NotNull
    public static final <T> HashSet<T> o00oo00O(@NotNull T... tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "elements");
        return (HashSet) o0O000O.oooO000(tArr, new HashSet(oo0oO0.o00oOoOo(tArr.length)));
    }

    @NotNull
    public static final <T> Set<T> o00oo0O(@NotNull T... tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "elements");
        return (Set) o0O000O.oooO000(tArr, new LinkedHashSet(oo0oO0.o00oOoOo(tArr.length)));
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final <T> Set<T> o00oo0O0() {
        return new LinkedHashSet();
    }

    @NotNull
    public static final <T> LinkedHashSet<T> o00oo0OO(@NotNull T... tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "elements");
        return (LinkedHashSet) o0O000O.oooO000(tArr, new LinkedHashSet(oo0oO0.o00oOoOo(tArr.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> Set<T> o00oo0Oo(@NotNull Set<? extends T> set) {
        o0OOOOO0.o0ooO.o00oo0O0(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : o0OO0oO0.o00oOo0o(set.iterator().next()) : o0O0OO.INSTANCE;
    }

    @o0OOO0OO.o00oo00O
    public static final <T> Set<T> o00oo0o() {
        return o0O0OO.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOO0OO.o00oo00O
    public static final <T> Set<T> o00oo0o0(Set<? extends T> set) {
        return set == 0 ? o0O0OO.INSTANCE : set;
    }

    @NotNull
    public static final <T> Set<T> o00oo0oO(@NotNull T... tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "elements");
        return tArr.length > 0 ? o0O000O.oooOO0Oo(tArr) : o0O0OO.INSTANCE;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @NotNull
    public static final <T> Set<T> o0O0o(@Nullable T t) {
        return t != null ? o0OO0oO0.o00oOo0o(t) : o0O0OO.INSTANCE;
    }
}
