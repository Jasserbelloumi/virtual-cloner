package o0OO0oO;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import o0OO0o.oO0Oo0oo;
import o0OOOoO0.oO000;
import o0OOOoO0.ooOOOOoo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public class o0O00o00 extends o0oO0Ooo {
    public static final <T> boolean o0O00OOO(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static final <T> boolean o0O00Oo(@NotNull Collection<? super T> collection, @NotNull oO000<? extends T> oo000) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(oo000, "elements");
        Iterator<? extends T> it = oo000.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z = true;
            }
        }
        return z;
    }

    @NotNull
    public static final <T> Collection<T> o0O00OoO(@NotNull Iterable<? extends T> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : o0O0oo0o.o0o00o(iterable);
    }

    public static final <T> boolean o0O00Ooo(Iterable<? extends T> iterable, o0OOOO.o00oo<? super T, Boolean> o00ooVar, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (o00ooVar.invoke((T) it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    @o0OOO0OO.o00oo00O
    public static final <T> void o0O00o(Collection<? super T> collection, oO000<? extends T> oo000) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(oo000, "elements");
        o0O0OO0(collection, oo000);
    }

    public static final <T> boolean o0O00o00(List<T> list, o0OOOO.o00oo<? super T, Boolean> o00ooVar, boolean z) {
        if (!(list instanceof RandomAccess)) {
            o0OOOOO0.o0ooO.o00oo0(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return o0O00Ooo(o0OOOOO0.o0OOO0OO.o00oOo00(list), o00ooVar, z);
        }
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(0, o0O00O0o.o00ooOo(list)).iterator();
        int i = 0;
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            T t = list.get(nextInt);
            if (o00ooVar.invoke(t).booleanValue() != z) {
                if (i != nextInt) {
                    list.set(i, t);
                }
                i++;
            }
        }
        if (i >= list.size()) {
            return false;
        }
        int o00ooOo2 = o0O00O0o.o00ooOo(list);
        if (i > o00ooOo2) {
            return true;
        }
        while (true) {
            list.remove(o00ooOo2);
            if (o00ooOo2 == i) {
                return true;
            }
            o00ooOo2--;
        }
    }

    @o0OOO0OO.o00oo00O
    public static final <T> void o0O00o0O(Collection<? super T> collection, Iterable<? extends T> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "elements");
        o0O0O0oo(collection, iterable);
    }

    @o0OOO0OO.o00oo00O
    public static final <T> void o0O00o0o(Collection<? super T> collection, T t) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        collection.remove(t);
    }

    @o0OOO0OO.o00oo00O
    public static final <T> void o0O00oO0(Collection<? super T> collection, T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "elements");
        o0O0OO0O(collection, tArr);
    }

    @o0OOO0OO.o00oo00O
    public static final <T> void o0O0O0O(Collection<? super T> collection, Iterable<? extends T> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "elements");
        o0O00OOO(collection, iterable);
    }

    @o0OOO0OO.o00oo00O
    public static final <T> void o0O0O0Oo(Collection<? super T> collection, T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "elements");
        o0oO0Ooo(collection, tArr);
    }

    @o0OOO0OO.o00oo00O
    public static final <T> boolean o0O0O0o(Collection<? extends T> collection, T t) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        return o0OOOOO0.o0OOO0OO.o00oOOo0(collection).remove(t);
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Use removeAt(index) instead.", replaceWith = @o0OO0o.o0OO000(expression = "removeAt(index)", imports = {}))
    public static final <T> T o0O0O0o0(List<T> list, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "<this>");
        return list.remove(i);
    }

    public static final <T> boolean o0O0O0oO(@NotNull Iterable<? extends T> iterable, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        return o0O00Ooo(iterable, o00ooVar, true);
    }

    public static final <T> boolean o0O0O0oo(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "elements");
        return collection.removeAll(o0O00OoO(iterable));
    }

    public static final <T> boolean o0O0OO(@NotNull List<T> list, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        return o0O00o00(list, o00ooVar, true);
    }

    public static final <T> boolean o0O0OO0(@NotNull Collection<? super T> collection, @NotNull oO000<? extends T> oo000) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(oo000, "elements");
        List o0OOo0O02 = ooOOOOoo.o0OOo0O0(oo000);
        return (o0OOo0O02.isEmpty() ^ true) && collection.removeAll(o0OOo0O02);
    }

    public static final <T> boolean o0O0OO0O(@NotNull Collection<? super T> collection, @NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "elements");
        return ((tArr.length == 0) ^ true) && collection.removeAll(o0O00000.o00oo0o(tArr));
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <T> T o0O0OOO(@NotNull List<T> list) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> T o0O0OOO0(@NotNull List<T> list) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> T o0O0OOOo(@NotNull List<T> list) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(o0O00O0o.o00ooOo(list));
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <T> T o0O0OOo(@NotNull List<T> list) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(o0O00O0o.o00ooOo(list));
    }

    public static final <T> boolean o0O0OOoO(@NotNull Iterable<? extends T> iterable, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        return o0O00Ooo(iterable, o00ooVar, false);
    }

    public static final <T> boolean o0O0OOoo(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "elements");
        return collection.retainAll(o0O00OoO(iterable));
    }

    public static final boolean o0O0Oo(Collection<?> collection) {
        boolean z = !collection.isEmpty();
        collection.clear();
        return z;
    }

    public static final <T> boolean o0O0Oo0(@NotNull Collection<? super T> collection, @NotNull oO000<? extends T> oo000) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(oo000, "elements");
        List o0OOo0O02 = ooOOOOoo.o0OOo0O0(oo000);
        return o0OOo0O02.isEmpty() ^ true ? collection.retainAll(o0OOo0O02) : o0O0Oo(collection);
    }

    public static final <T> boolean o0O0Oo0O(@NotNull Collection<? super T> collection, @NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "elements");
        return (tArr.length == 0) ^ true ? collection.retainAll(o0O00000.o00oo0o(tArr)) : o0O0Oo(collection);
    }

    public static final <T> boolean o0O0Oo0o(@NotNull List<T> list, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        return o0O00o00(list, o00ooVar, false);
    }

    @o0OOO0OO.o00oo00O
    public static final <T> void o0O0oo0o(Collection<? super T> collection, oO000<? extends T> oo000) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(oo000, "elements");
        o0O00Oo(collection, oo000);
    }

    @o0OOO0OO.o00oo00O
    public static final <T> boolean o0OooO0(Collection<? extends T> collection, Collection<? extends T> collection2) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(collection2, "elements");
        return o0OOOOO0.o0OOO0OO.o00oOOo0(collection).retainAll(collection2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOO0OO.o00oo00O
    public static final <T> void o0oO0O0o(Collection<? super T> collection, T t) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        collection.add(t);
    }

    public static final <T> boolean o0oO0Ooo(@NotNull Collection<? super T> collection, @NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "elements");
        return collection.addAll(o0O00000.o00oo0o(tArr));
    }

    @o0OOO0OO.o00oo00O
    public static final <T> boolean o0ooO(Collection<? extends T> collection, Collection<? extends T> collection2) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(collection2, "elements");
        return o0OOOOO0.o0OOO0OO.o00oOOo0(collection).removeAll(collection2);
    }
}
