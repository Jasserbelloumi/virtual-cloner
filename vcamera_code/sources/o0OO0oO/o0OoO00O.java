package o0OO0oO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import o0OO0o.oO0Ooooo;
import org.jetbrains.annotations.NotNull;
@o0OOOOO0.o0OOO00({"SMAP\nCollectionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionsJVM.kt\nkotlin/collections/CollectionsKt__CollectionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
/* loaded from: classes3.dex */
public class o0OoO00O {
    @o0OO0o.o0O
    @o0OO0o.o0OO00o0(version = "1.3")
    @NotNull
    public static final <E> List<E> o00oOOo0(@NotNull List<E> list) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "builder");
        return ((o0OO0oOO.o0O00O) list).build();
    }

    @o0OO0o.o0O
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final <E> List<E> o00oOOoO(int i, o0OOOO.o00oo<? super List<E>, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "builderAction");
        o0OO0oOO.o0O00O o0o00o = new o0OO0oOO.o0O00O(i);
        o00ooVar.invoke(o0o00o);
        return o00oOOo0(o0o00o);
    }

    @o0OO0o.o0O
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final <E> List<E> o00oOo00(o0OOOO.o00oo<? super List<E>, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "builderAction");
        o0OO0oOO.o0O00O o0o00o = new o0OO0oOO.o0O00O();
        o00ooVar.invoke(o0o00o);
        return o00oOOo0(o0o00o);
    }

    @o0OO0o.o0O
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final int o00oOo0O(int i) {
        if (i < 0) {
            if (!o0OOO0OO.o00ooO0.o00oOOo0(1, 3, 0)) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            o0O00O0o.o0O0000O();
        }
        return i;
    }

    @o0OOO0OO.o00oo00O
    public static final Object[] o00oOo0o(Collection<?> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "collection");
        return o0OOOOO0.o0O000o0.o00oOOo0(collection);
    }

    @NotNull
    public static final <T> Object[] o00oOoO(@NotNull T[] tArr, boolean z) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        if (z && o0OOOOO0.o0ooO.o00oOoO0(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    @o0OOO0OO.o00oo00O
    public static final <T> T[] o00oOoO0(Collection<?> collection, T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "collection");
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "array");
        return (T[]) o0OOOOO0.o0O000o0.o00oOOoO(collection, tArr);
    }

    @o0OO0o.o0O
    @o0OO0o.o0OO00o0(version = "1.3")
    @NotNull
    public static final <E> List<E> o00oOoOO() {
        return new o0OO0oOO.o0O00O();
    }

    @o0OO0o.o0O
    @o0OO0o.o0OO00o0(version = "1.3")
    @NotNull
    public static final <E> List<E> o00oOoOo(int i) {
        return new o0OO0oOO.o0O00O(i);
    }

    @NotNull
    public static final <T> List<T> o00oOoo0(T t) {
        List<T> singletonList = Collections.singletonList(t);
        o0OOOOO0.o0ooO.o00oo0OO(singletonList, "singletonList(element)");
        return singletonList;
    }

    @o0OO0o.o0O
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final int o00oOooO(int i) {
        if (i < 0) {
            if (!o0OOO0OO.o00ooO0.o00oOOo0(1, 3, 0)) {
                throw new ArithmeticException("Count overflow has happened.");
            }
            o0O00O0o.o0O00000();
        }
        return i;
    }

    @o0OO0o.o0OO00o0(version = "1.2")
    @NotNull
    public static final <T> List<T> o00oOooo(@NotNull Iterable<? extends T> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        List<T> o0o00oO = o0O0oo0o.o0o00oO(iterable);
        Collections.shuffle(o0o00oO);
        return o0o00oO;
    }

    @o0OOO0OO.o00oo00O
    public static final <T> List<T> o00oo0(Enumeration<T> enumeration) {
        o0OOOOO0.o0ooO.o00oo0O0(enumeration, "<this>");
        ArrayList list = Collections.list(enumeration);
        o0OOOOO0.o0ooO.o00oo0OO(list, "list(this)");
        return list;
    }

    @o0OO0o.o0OO00o0(version = "1.2")
    @NotNull
    public static final <T> List<T> o00oo00O(@NotNull Iterable<? extends T> iterable, @NotNull Random random) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(random, "random");
        List<T> o0o00oO = o0O0oo0o.o0o00oO(iterable);
        Collections.shuffle(o0o00oO, random);
        return o0o00oO;
    }
}
