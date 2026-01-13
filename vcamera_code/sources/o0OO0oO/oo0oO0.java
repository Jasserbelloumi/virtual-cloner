package o0OO0oO;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import o0OO0o.oO0Ooooo;
import org.jetbrains.annotations.NotNull;
@o0OOOOO0.o0OOO00({"SMAP\nMapsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1#2:159\n*E\n"})
/* loaded from: classes3.dex */
public class oo0oO0 extends o0OO000o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f13387o00oOOo0 = 1073741824;

    @o0OO0o.o0O
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final <K, V> Map<K, V> o00oOo0O(int i, o0OOOO.o00oo<? super Map<K, V>, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "builderAction");
        o0OO0oOO.o0O00OOO o0o00ooo = new o0OO0oOO.o0O00OOO(i);
        o00ooVar.invoke(o0o00ooo);
        return o00oOooO(o0o00ooo);
    }

    @o0OO0o.o0O
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final <K, V> Map<K, V> o00oOo0o(o0OOOO.o00oo<? super Map<K, V>, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "builderAction");
        o0OO0oOO.o0O00OOO o0o00ooo = new o0OO0oOO.o0O00OOO();
        o00ooVar.invoke(o0o00ooo);
        return o00oOooO(o0o00ooo);
    }

    @o0OO0o.o0O
    @o0OO0o.o0OO00o0(version = "1.3")
    @NotNull
    public static final <K, V> Map<K, V> o00oOoO(int i) {
        return new o0OO0oOO.o0O00OOO(i);
    }

    @o0OO0o.o0O
    @o0OO0o.o0OO00o0(version = "1.3")
    @NotNull
    public static final <K, V> Map<K, V> o00oOoO0() {
        return new o0OO0oOO.o0O00OOO();
    }

    public static final <K, V> V o00oOoOO(@NotNull ConcurrentMap<K, V> concurrentMap, K k, @NotNull o0OOOO.o00oOOo0<? extends V> o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(concurrentMap, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "defaultValue");
        V v = concurrentMap.get(k);
        if (v == null) {
            V invoke = o00oooo02.invoke();
            V putIfAbsent = concurrentMap.putIfAbsent(k, invoke);
            return putIfAbsent == null ? invoke : putIfAbsent;
        }
        return v;
    }

    @o0OO0o.o0O
    public static final int o00oOoOo(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    @NotNull
    public static final <K, V> Map<K, V> o00oOoo0(@NotNull o0OO0o.o0O0o00<? extends K, ? extends V> o0o0o00) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(o0o0o00.getFirst(), o0o0o00.getSecond());
        o0OOOOO0.o0ooO.o00oo0OO(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    @o0OO0o.o0O
    @o0OO0o.o0OO00o0(version = "1.3")
    @NotNull
    public static final <K, V> Map<K, V> o00oOooO(@NotNull Map<K, V> map) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "builder");
        return ((o0OO0oOO.o0O00OOO) map).build();
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @NotNull
    public static final <K, V> SortedMap<K, V> o00oOooo(@NotNull Comparator<? super K> comparator, @NotNull o0OO0o.o0O0o00<? extends K, ? extends V>... o0o0o00Arr) {
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00Arr, "pairs");
        TreeMap treeMap = new TreeMap(comparator);
        oo0ooO.o0oO0O0o(treeMap, o0o0o00Arr);
        return treeMap;
    }

    @o0OOO0OO.o00oo00O
    public static final Properties o00oo0(Map<String, String> map) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        Properties properties = new Properties();
        properties.putAll(map);
        return properties;
    }

    @NotNull
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> o00oo00O(@NotNull o0OO0o.o0O0o00<? extends K, ? extends V>... o0o0o00Arr) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00Arr, "pairs");
        TreeMap treeMap = new TreeMap();
        oo0ooO.o0oO0O0o(treeMap, o0o0o00Arr);
        return treeMap;
    }

    @NotNull
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> o00oo0O(@NotNull Map<? extends K, ? extends V> map) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        return new TreeMap(map);
    }

    @o0OOO0OO.o00oo00O
    public static final <K, V> Map<K, V> o00oo0O0(Map<K, ? extends V> map) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        return o00oo0OO(map);
    }

    @NotNull
    public static final <K, V> Map<K, V> o00oo0OO(@NotNull Map<? extends K, ? extends V> map) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        o0OOOOO0.o0ooO.o00oo0OO(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    @NotNull
    public static final <K, V> SortedMap<K, V> o00oo0Oo(@NotNull Map<? extends K, ? extends V> map, @NotNull Comparator<? super K> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
