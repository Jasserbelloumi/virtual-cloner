package o0OO0oO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import o0OO0o.oO0Oo0oo;
import o0OO0o.oO0Ooooo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOOOO0.o0OOO00({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,471:1\n394#1:473\n1#2:472\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n*L\n388#1:473\n*E\n"})
/* loaded from: classes3.dex */
public class o0O00O0o extends o0OoO00O {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Incorrect field signature: TK; */
    @o0OOOOO0.o0OOO00({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n*L\n1#1,471:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<T> extends o0OOOOO0.o0O0OO implements o0OOOO.o00oo<T, Integer> {
        public final /* synthetic */ Comparable $key;
        public final /* synthetic */ o0OOOO.o00oo<T, K> $selector;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lo0OOOO/o00oo<-TT;+TK;>;TK;)V */
        public o00oOOo0(o0OOOO.o00oo o00ooVar, Comparable comparable) {
            super(1);
            this.$selector = o00ooVar;
            this.$key = comparable;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o0OOOO.o00oo
        @NotNull
        public final Integer invoke(T t) {
            return Integer.valueOf(o0OO0oo0.o00ooO0.o00oOooo((Comparable) this.$selector.invoke(t), this.$key));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ Integer invoke(Object obj) {
            return invoke((o00oOOo0<T>) obj);
        }
    }

    @o0OO0o.o0OO00o0(version = "1.3")
    @NotNull
    public static final <T> List<T> o0(@NotNull Iterable<? extends T> iterable, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        List<T> o0o00oO = o0O0oo0o.o0o00oO(iterable);
        o0O0oo0o.o0oOOO0o(o0o00oO, o00oo0Var);
        return o0o00oO;
    }

    public static /* synthetic */ int o00oo(List list, int i, int i2, o0OOOO.o00oo o00ooVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = list.size();
        }
        return o00oo0o(list, i, i2, o00ooVar);
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final <T> ArrayList<T> o00oo0O() {
        return new ArrayList<>();
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final <T> List<T> o00oo0O0(int i, o0OOOO.o00oo<? super Integer, ? extends T> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "init");
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(o00ooVar.invoke(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final <T> List<T> o00oo0OO(int i, o0OOOO.o00oo<? super Integer, ? extends T> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "init");
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(o00ooVar.invoke(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    @NotNull
    public static final <T> ArrayList<T> o00oo0Oo(@NotNull T... tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new o00oo0O(tArr, true));
    }

    public static final <T> int o00oo0o(@NotNull List<? extends T> list, int i, int i2, @NotNull o0OOOO.o00oo<? super T, Integer> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "comparison");
        o00ooooo(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int intValue = o00ooVar.invoke((T) list.get(i4)).intValue();
            if (intValue < 0) {
                i = i4 + 1;
            } else if (intValue <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    @NotNull
    public static final <T> Collection<T> o00oo0o0(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return new o00oo0O(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int o00oo0oO(@NotNull List<? extends T> list, @Nullable T t, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "<this>");
        o00ooooo(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int o00oOooo2 = o0OO0oo0.o00ooO0.o00oOooo(list.get(i4), t);
            if (o00oOooo2 < 0) {
                i = i4 + 1;
            } else if (o00oOooo2 <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.6")
    public static final <E> List<E> o00ooO(int i, @o0OO0o.o00oOOoO o0OOOO.o00oo<? super List<E>, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "builderAction");
        o0OO0oOO.o0O00O o0o00o = new o0OO0oOO.o0O00O(i);
        o00ooVar.invoke(o0o00o);
        return o0OoO00O.o00oOOo0(o0o00o);
    }

    public static /* synthetic */ int o00ooO0(List list, Object obj, Comparator comparator, int i, int i2, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = list.size();
        }
        return o0O0o(list, obj, comparator, i, i2);
    }

    public static /* synthetic */ int o00ooO00(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return o00oo0oO(list, comparable, i, i2);
    }

    public static final <T, K extends Comparable<? super K>> int o00ooO0O(@NotNull List<? extends T> list, @Nullable K k, int i, int i2, @NotNull o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        return o00oo0o(list, i, i2, new o00oOOo0(o00ooVar, k));
    }

    public static /* synthetic */ int o00ooO0o(List list, Comparable comparable, int i, int i2, o0OOOO.o00oo o00ooVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return o00oo0o(list, i, i2, new o00oOOo0(o00ooVar, comparable));
    }

    @o0OOO0OO.o00oo00O
    public static final <T> boolean o00ooOO(Collection<? extends T> collection, Collection<? extends T> collection2) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(collection2, "elements");
        return collection.containsAll(collection2);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.6")
    public static final <E> List<E> o00ooOO0(@o0OO0o.o00oOOoO o0OOOO.o00oo<? super List<E>, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "builderAction");
        o0OO0oOO.o0O00O o0o00o = new o0OO0oOO.o0O00O();
        o00ooVar.invoke(o0o00o);
        return o0OoO00O.o00oOOo0(o0o00o);
    }

    @NotNull
    public static final <T> List<T> o00ooOOo() {
        return o0ooO.INSTANCE;
    }

    public static final <T> int o00ooOo(@NotNull List<? extends T> list) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "<this>");
        return list.size() - 1;
    }

    @NotNull
    public static final o0OOOo0o.o0O0O0Oo o00ooOo0(@NotNull Collection<?> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        return new o0OOOo0o.o0O0O0Oo(0, collection.size() - 1);
    }

    /* JADX WARN: Incorrect types in method signature: <C::Ljava/util/Collection<*>;:TR;R:Ljava/lang/Object;>(TC;Lo0OOOO/o00oOOo0<+TR;>;)TR; */
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final Object o00ooOoO(Collection collection, o0OOOO.o00oOOo0 o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "defaultValue");
        return collection.isEmpty() ? o00oooo02.invoke() : collection;
    }

    @o0OOO0OO.o00oo00O
    public static final <T> boolean o00ooOoo(Collection<? extends T> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        return !collection.isEmpty();
    }

    @o0OOO0OO.o00oo00O
    public static final <T> List<T> o00ooo0() {
        return o0ooO.INSTANCE;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final <T> boolean o00ooo00(Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    @NotNull
    public static final <T> List<T> o00ooo0O(@NotNull T... tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "elements");
        return tArr.length > 0 ? o0O00000.o00oo0o(tArr) : o0ooO.INSTANCE;
    }

    @NotNull
    public static final <T> List<T> o00ooo0o(@Nullable T t) {
        return t != null ? o0OoO00O.o00oOoo0(t) : o0ooO.INSTANCE;
    }

    @NotNull
    public static final <T> List<T> o00oooO(@NotNull T... tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "elements");
        return o0O000O.oOo000Oo(tArr);
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final <T> List<T> o00oooOO() {
        return new ArrayList();
    }

    @NotNull
    public static final <T> List<T> o00oooOo(@NotNull T... tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new o00oo0O(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOO0OO.o00oo00O
    public static final <T> Collection<T> o00oooo(Collection<? extends T> collection) {
        return collection == 0 ? o0ooO.INSTANCE : collection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> List<T> o00oooo0(@NotNull List<? extends T> list) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : o0OoO00O.o00oOoo0(list.get(0)) : o0ooO.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOO0OO.o00oo00O
    public static final <T> List<T> o00ooooO(List<? extends T> list) {
        return list == 0 ? o0ooO.INSTANCE : list;
    }

    public static final void o00ooooo(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException(o00ooO0.o00oOoO.o00oOOo0("fromIndex (", i2, ") is less than zero."));
        } else {
            if (i3 <= i) {
                return;
            }
            throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
        }
    }

    @o0OO0o.o0O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final void o0O00000() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @o0OO0o.o0O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final void o0O0000O() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final <T> int o0O0o(@NotNull List<? extends T> list, T t, @NotNull Comparator<? super T> comparator, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o00ooooo(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int compare = comparator.compare((T) list.get(i4), t);
            if (compare < 0) {
                i = i4 + 1;
            } else if (compare <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }
}
