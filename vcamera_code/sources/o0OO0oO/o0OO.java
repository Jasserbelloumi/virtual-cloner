package o0OO0oO;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import o0OOOoO0.oO000;
import org.jetbrains.annotations.NotNull;
@o0OOOOO0.o0OOO00({"SMAP\n_Sets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n857#2,2:140\n847#2,2:142\n1#3:144\n*S KotlinDebug\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n*L\n28#1:140,2\n52#1:142,2\n*E\n"})
/* loaded from: classes3.dex */
public class o0OO extends o0OO0oO {
    @o0OOO0OO.o00oo00O
    public static final <T> Set<T> o00ooO(Set<? extends T> set, T t) {
        o0OOOOO0.o0ooO.o00oo0O0(set, "<this>");
        return o00ooO0(set, t);
    }

    @NotNull
    public static final <T> Set<T> o00ooO0(@NotNull Set<? extends T> set, T t) {
        o0OOOOO0.o0ooO.o00oo0O0(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(oo0oO0.o00oOoOo(set.size()));
        boolean z = false;
        for (T t2 : set) {
            boolean z2 = true;
            if (!z && o0OOOOO0.o0ooO.o00oOoO0(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(t2);
            }
        }
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> o00ooO00(@NotNull Set<? extends T> set, @NotNull Iterable<? extends T> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(set, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "elements");
        Collection<?> o0O00OoO2 = o0O00o00.o0O00OoO(iterable);
        if (o0O00OoO2.isEmpty()) {
            return o0O0oo0o.o0o00oo0(set);
        }
        if (!(o0O00OoO2 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(o0O00OoO2);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t : set) {
            if (!o0O00OoO2.contains(t)) {
                linkedHashSet2.add(t);
            }
        }
        return linkedHashSet2;
    }

    @NotNull
    public static final <T> Set<T> o00ooO0O(@NotNull Set<? extends T> set, @NotNull oO000<? extends T> oo000) {
        o0OOOOO0.o0ooO.o00oo0O0(set, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(oo000, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        o0O00o00.o0O0OO0(linkedHashSet, oo000);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> o00ooO0o(@NotNull Set<? extends T> set, @NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(set, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        o0O00o00.o0O0OO0O(linkedHashSet, tArr);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> o00ooOO(@NotNull Set<? extends T> set, T t) {
        o0OOOOO0.o0ooO.o00oo0O0(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(oo0oO0.o00oOoOo(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> o00ooOO0(@NotNull Set<? extends T> set, @NotNull Iterable<? extends T> iterable) {
        int size;
        o0OOOOO0.o0ooO.o00oo0O0(set, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "elements");
        Integer o0O000O2 = o0O00O.o0O000O(iterable);
        if (o0O000O2 != null) {
            size = set.size() + o0O000O2.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(oo0oO0.o00oOoOo(size));
        linkedHashSet.addAll(set);
        o0O00o00.o0O00OOO(linkedHashSet, iterable);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> o00ooOOo(@NotNull Set<? extends T> set, @NotNull oO000<? extends T> oo000) {
        o0OOOOO0.o0ooO.o00oo0O0(set, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(oo000, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(oo0oO0.o00oOoOo(set.size() * 2));
        linkedHashSet.addAll(set);
        o0O00o00.o0O00Oo(linkedHashSet, oo000);
        return linkedHashSet;
    }

    @o0OOO0OO.o00oo00O
    public static final <T> Set<T> o00ooOo(Set<? extends T> set, T t) {
        o0OOOOO0.o0ooO.o00oo0O0(set, "<this>");
        return o00ooOO(set, t);
    }

    @NotNull
    public static final <T> Set<T> o00ooOo0(@NotNull Set<? extends T> set, @NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(set, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(oo0oO0.o00oOoOo(set.size() + tArr.length));
        linkedHashSet.addAll(set);
        o0O00o00.o0oO0Ooo(linkedHashSet, tArr);
        return linkedHashSet;
    }
}
