package o0OO0oO;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o0OO0o.oO0Oo0oo;
import o0OO0o.oO0Ooooo;
import o0OOOoO0.oO000;
import org.jetbrains.annotations.NotNull;
@o0OOOOO0.o0OOO00({"SMAP\nMaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,793:1\n392#1:803\n403#1:808\n500#1,6:813\n525#1,6:819\n1#2:794\n1238#3,4:795\n1238#3,4:799\n1238#3,4:804\n1238#3,4:809\n*S KotlinDebug\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n442#1:803\n457#1:808\n515#1:813,6\n540#1:819,6\n392#1:795,4\n403#1:799,4\n442#1:804,4\n457#1:809,4\n*E\n"})
/* loaded from: classes3.dex */
public class oo0ooO extends oo0oO0 {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, R, M extends Map<? super R, ? super V>> M o0(@NotNull Map<? extends K, ? extends V> map, @NotNull M m, @NotNull o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (Object obj : map.entrySet()) {
            m.put(o00ooVar.invoke(obj), ((Map.Entry) obj).getValue());
        }
        return m;
    }

    @o0OOO0OO.o00oo00O
    public static final <K, V> boolean o00oo(Map<? extends K, ? extends V> map, K k) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        return map.containsKey(k);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.6")
    public static final <K, V> Map<K, V> o00oo0o(@o0OO0o.o00oOOoO o0OOOO.o00oo<? super Map<K, V>, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "builderAction");
        o0OO0oOO.o0O00OOO o0o00ooo = new o0OO0oOO.o0O00OOO();
        o00ooVar.invoke(o0o00ooo);
        return oo0oO0.o00oOooO(o0o00ooo);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.6")
    public static final <K, V> Map<K, V> o00oo0o0(int i, @o0OO0o.o00oOOoO o0OOOO.o00oo<? super Map<K, V>, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "builderAction");
        o0OO0oOO.o0O00OOO o0o00ooo = new o0OO0oOO.o0O00OOO(i);
        o00ooVar.invoke(o0o00ooo);
        return oo0oO0.o00oOooO(o0o00ooo);
    }

    @o0OOO0OO.o00oo00O
    public static final <K, V> K o00oo0oO(Map.Entry<? extends K, ? extends V> entry) {
        o0OOOOO0.o0ooO.o00oo0O0(entry, "<this>");
        return entry.getKey();
    }

    @NotNull
    public static final <K, V> Map<K, V> o00ooO(@NotNull Map<? extends K, ? extends V> map, @NotNull o0OOOO.o00oo<? super K, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (o00ooVar.invoke((K) entry.getKey()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @o0OOO0OO.o00oo00O
    public static final <K, V> boolean o00ooO0(Map<K, ? extends V> map, V v) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        return map.containsValue(v);
    }

    @o0OOO0OO.o00oo00O
    public static final <K> boolean o00ooO00(Map<? extends K, ?> map, K k) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        return map.containsKey(k);
    }

    @NotNull
    public static final <K, V> Map<K, V> o00ooO0O() {
        o0O0OO0 o0o0oo0 = o0O0OO0.INSTANCE;
        o0OOOOO0.o0ooO.o00oo0(o0o0oo0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return o0o0oo0;
    }

    @NotNull
    public static final <K, V> Map<K, V> o00ooO0o(@NotNull Map<? extends K, ? extends V> map, @NotNull o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (o00ooVar.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o00ooOO(@NotNull Map<? extends K, ? extends V> map, @NotNull M m, @NotNull o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!o00ooVar.invoke(entry).booleanValue()) {
                m.put(entry.getKey(), entry.getValue());
            }
        }
        return m;
    }

    @NotNull
    public static final <K, V> Map<K, V> o00ooOO0(@NotNull Map<? extends K, ? extends V> map, @NotNull o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!o00ooVar.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o00ooOOo(@NotNull Map<? extends K, ? extends V> map, @NotNull M m, @NotNull o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (o00ooVar.invoke(entry).booleanValue()) {
                m.put(entry.getKey(), entry.getValue());
            }
        }
        return m;
    }

    @o0OOO0OO.o00oo00O
    public static final <K, V> V o00ooOo(Map<? extends K, ? extends V> map, K k) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        return map.get(k);
    }

    @NotNull
    public static final <K, V> Map<K, V> o00ooOo0(@NotNull Map<? extends K, ? extends V> map, @NotNull o0OOOO.o00oo<? super V, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (o00ooVar.invoke((V) entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @o0OOO0OO.o00oo00O
    public static final <K, V> V o00ooOoO(Map<K, ? extends V> map, K k, o0OOOO.o00oOOo0<? extends V> o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "defaultValue");
        V v = map.get(k);
        return v == null ? o00oooo02.invoke() : v;
    }

    public static final <K, V> V o00ooOoo(@NotNull Map<K, ? extends V> map, K k, @NotNull o0OOOO.o00oOOo0<? extends V> o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "defaultValue");
        V v = map.get(k);
        return (v != null || map.containsKey(k)) ? v : o00oooo02.invoke();
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public static final <K, V> V o00ooo0(@NotNull Map<K, ? extends V> map, K k) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        return (V) o0OO000o.o00oOOo0(map, k);
    }

    public static final <K, V> V o00ooo00(@NotNull Map<K, V> map, K k, @NotNull o0OOOO.o00oOOo0<? extends V> o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "defaultValue");
        V v = map.get(k);
        if (v == null) {
            V invoke = o00oooo02.invoke();
            map.put(k, invoke);
            return invoke;
        }
        return v;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final <K, V> HashMap<K, V> o00ooo0O() {
        return new HashMap<>();
    }

    @NotNull
    public static final <K, V> HashMap<K, V> o00ooo0o(@NotNull o0OO0o.o0O0o00<? extends K, ? extends V>... o0o0o00Arr) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00Arr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(oo0oO0.o00oOoOo(o0o0o00Arr.length));
        o0oO0O0o(hashMap, o0o0o00Arr);
        return hashMap;
    }

    /* JADX WARN: Incorrect types in method signature: <M::Ljava/util/Map<**>;:TR;R:Ljava/lang/Object;>(TM;Lo0OOOO/o00oOOo0<+TR;>;)TR; */
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final Object o00oooO(Map map, o0OOOO.o00oOOo0 o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "defaultValue");
        return map.isEmpty() ? o00oooo02.invoke() : map;
    }

    @o0OOO0OO.o00oo00O
    public static final <K, V> boolean o00oooOO(Map<? extends K, ? extends V> map) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        return !map.isEmpty();
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final <K, V> boolean o00oooOo(Map<? extends K, ? extends V> map) {
        return map == null || map.isEmpty();
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final <K, V> LinkedHashMap<K, V> o00oooo() {
        return new LinkedHashMap<>();
    }

    @o0OOO0OO.o00oo00O
    public static final <K, V> Iterator<Map.Entry<K, V>> o00oooo0(Map<? extends K, ? extends V> map) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        return (Iterator<Map.Entry<? extends K, ? extends V>>) map.entrySet().iterator();
    }

    @NotNull
    public static final <K, V> LinkedHashMap<K, V> o00ooooO(@NotNull o0OO0o.o0O0o00<? extends K, ? extends V>... o0o0o00Arr) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00Arr, "pairs");
        return (LinkedHashMap) o0O0OO(o0o0o00Arr, new LinkedHashMap(oo0oO0.o00oOoOo(o0o0o00Arr.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, R> Map<R, V> o00ooooo(@NotNull Map<? extends K, ? extends V> map, @NotNull o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(oo0oO0.o00oOoOo(map.size()));
        for (Object obj : map.entrySet()) {
            linkedHashMap.put(o00ooVar.invoke(obj), ((Map.Entry) obj).getValue());
        }
        return linkedHashMap;
    }

    @o0OOOO0o.o00oo0OO(name = "mutableIterator")
    @o0OOO0OO.o00oo00O
    public static final <K, V> Iterator<Map.Entry<K, V>> o0O00(Map<K, V> map) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        return map.entrySet().iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, R, M extends Map<? super K, ? super R>> M o0O000(@NotNull Map<? extends K, ? extends V> map, @NotNull M m, @NotNull o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (Object obj : map.entrySet()) {
            m.put(((Map.Entry) obj).getKey(), o00ooVar.invoke(obj));
        }
        return m;
    }

    @o0OOO0OO.o00oo00O
    public static final <K, V> Map<K, V> o0O00000() {
        return o00ooO0O();
    }

    @NotNull
    public static final <K, V> Map<K, V> o0O0000O(@NotNull o0OO0o.o0O0o00<? extends K, ? extends V>... o0o0o00Arr) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00Arr, "pairs");
        return o0o0o00Arr.length > 0 ? o0O0OO(o0o0o00Arr, new LinkedHashMap(oo0oO0.o00oOoOo(o0o0o00Arr.length))) : o00ooO0O();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, R> Map<K, R> o0O0000o(@NotNull Map<? extends K, ? extends V> map, @NotNull o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(oo0oO0.o00oOoOo(map.size()));
        for (Object obj : map.entrySet()) {
            linkedHashMap.put(((Map.Entry) obj).getKey(), o00ooVar.invoke(obj));
        }
        return linkedHashMap;
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> o0O000O(@NotNull Map<? extends K, ? extends V> map, @NotNull Iterable<? extends K> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, androidx.lifecycle.o0O.f3318o00oOoO);
        Map o0O0OOO02 = o0O0OOO0(map);
        o0O00o00.o0O0O0oo(o0O0OOO02.keySet(), iterable);
        return o0O00O0o(o0O0OOO02);
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> o0O000Oo(@NotNull Map<? extends K, ? extends V> map, @NotNull oO000<? extends K> oo000) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(oo000, androidx.lifecycle.o0O.f3318o00oOoO);
        Map o0O0OOO02 = o0O0OOO0(map);
        o0O00o00.o0O0OO0(o0O0OOO02.keySet(), oo000);
        return o0O00O0o(o0O0OOO02);
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final <K, V> void o0O000o(Map<K, V> map, K k) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        map.remove(k);
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final <K, V> void o0O000o0(Map<K, V> map, Iterable<? extends K> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, androidx.lifecycle.o0O.f3318o00oOoO);
        o0O00o00.o0O0O0oo(map.keySet(), iterable);
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final <K, V> void o0O000oo(Map<K, V> map, K[] kArr) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(kArr, androidx.lifecycle.o0O.f3318o00oOoO);
        o0O00o00.o0O0OO0O(map.keySet(), kArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOO0OO.o00oo00O
    public static final <K, V> Map<K, V> o0O00O(Map<K, ? extends V> map) {
        return map == 0 ? o00ooO0O() : map;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final <K, V> Map<K, V> o0O00O0() {
        return new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> Map<K, V> o0O00O0o(@NotNull Map<K, ? extends V> map) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : oo0oO0.o00oo0OO(map) : o00ooO0O();
    }

    @NotNull
    public static final <K, V> Map<K, V> o0O00OO(@NotNull Map<? extends K, ? extends V> map, @NotNull Iterable<? extends o0OO0o.o0O0o00<? extends K, ? extends V>> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "pairs");
        if (map.isEmpty()) {
            return o0O0O0o0(iterable);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        o0O00oO0(linkedHashMap, iterable);
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> o0O00OOO(@NotNull Map<? extends K, ? extends V> map, @NotNull Map<? extends K, ? extends V> map2) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> o0O00Oo(@NotNull Map<? extends K, ? extends V> map, @NotNull o0OO0o.o0O0o00<? extends K, ? extends V> o0o0o00) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00, "pair");
        if (map.isEmpty()) {
            return oo0oO0.o00oOoo0(o0o0o00);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(o0o0o00.getFirst(), o0o0o00.getSecond());
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> o0O00OoO(@NotNull Map<? extends K, ? extends V> map, @NotNull o0OO0o.o0O0o00<? extends K, ? extends V>[] o0o0o00Arr) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00Arr, "pairs");
        if (map.isEmpty()) {
            return o0O0OO0O(o0o0o00Arr);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        o0oO0O0o(linkedHashMap, o0o0o00Arr);
        return linkedHashMap;
    }

    @o0OOO0OO.o00oo00O
    public static final <K, V> void o0O00Ooo(Map<? super K, ? super V> map, Iterable<? extends o0OO0o.o0O0o00<? extends K, ? extends V>> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "pairs");
        o0O00oO0(map, iterable);
    }

    @o0OOO0OO.o00oo00O
    public static final <K, V> void o0O00o(Map<? super K, ? super V> map, o0OO0o.o0O0o00<? extends K, ? extends V>[] o0o0o00Arr) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00Arr, "pairs");
        o0oO0O0o(map, o0o0o00Arr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOO0OO.o00oo00O
    public static final <K, V> void o0O00o00(Map<? super K, ? super V> map, Map<K, ? extends V> map2) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(map2, "map");
        map.putAll(map2);
    }

    @o0OOO0OO.o00oo00O
    public static final <K, V> void o0O00o0O(Map<? super K, ? super V> map, o0OO0o.o0O0o00<? extends K, ? extends V> o0o0o00) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00, "pair");
        map.put((K) o0o0o00.getFirst(), (V) o0o0o00.getSecond());
    }

    @o0OOO0OO.o00oo00O
    public static final <K, V> void o0O00o0o(Map<? super K, ? super V> map, oO000<? extends o0OO0o.o0O0o00<? extends K, ? extends V>> oo000) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(oo000, "pairs");
        o0O0O0O(map, oo000);
    }

    public static final <K, V> void o0O00oO0(@NotNull Map<? super K, ? super V> map, @NotNull Iterable<? extends o0OO0o.o0O0o00<? extends K, ? extends V>> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "pairs");
        for (o0OO0o.o0O0o00<? extends K, ? extends V> o0o0o00 : iterable) {
            map.put((K) o0o0o00.component1(), (V) o0o0o00.component2());
        }
    }

    public static final <K, V> void o0O0O0O(@NotNull Map<? super K, ? super V> map, @NotNull oO000<? extends o0OO0o.o0O0o00<? extends K, ? extends V>> oo000) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(oo000, "pairs");
        for (o0OO0o.o0O0o00<? extends K, ? extends V> o0o0o00 : oo000) {
            map.put((K) o0o0o00.component1(), (V) o0o0o00.component2());
        }
    }

    @o0OOO0OO.o00oo00O
    public static final <K, V> void o0O0O0Oo(Map<K, V> map, K k, V v) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        map.put(k, v);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o0O0O0o(@NotNull Iterable<? extends o0OO0o.o0O0o00<? extends K, ? extends V>> iterable, @NotNull M m) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0O00oO0(m, iterable);
        return m;
    }

    @NotNull
    public static final <K, V> Map<K, V> o0O0O0o0(@NotNull Iterable<? extends o0OO0o.o0O0o00<? extends K, ? extends V>> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return o0O0O0o(iterable, new LinkedHashMap(oo0oO0.o00oOoOo(collection.size())));
                }
                return oo0oO0.o00oOoo0(iterable instanceof List ? (o0OO0o.o0O0o00<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
            }
            return o00ooO0O();
        }
        return o0O00O0o(o0O0O0o(iterable, new LinkedHashMap()));
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> o0O0O0oO(@NotNull Map<? extends K, ? extends V> map) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? o0O0OOO0(map) : oo0oO0.o00oo0OO(map) : o00ooO0O();
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o0O0O0oo(@NotNull Map<? extends K, ? extends V> map, @NotNull M m) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        m.putAll(map);
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o0O0OO(@NotNull o0OO0o.o0O0o00<? extends K, ? extends V>[] o0o0o00Arr, @NotNull M m) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00Arr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0oO0O0o(m, o0o0o00Arr);
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o0O0OO0(@NotNull oO000<? extends o0OO0o.o0O0o00<? extends K, ? extends V>> oo000, @NotNull M m) {
        o0OOOOO0.o0ooO.o00oo0O0(oo000, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0O0O0O(m, oo000);
        return m;
    }

    @NotNull
    public static final <K, V> Map<K, V> o0O0OO0O(@NotNull o0OO0o.o0O0o00<? extends K, ? extends V>[] o0o0o00Arr) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00Arr, "<this>");
        int length = o0o0o00Arr.length;
        return length != 0 ? length != 1 ? o0O0OO(o0o0o00Arr, new LinkedHashMap(oo0oO0.o00oOoOo(o0o0o00Arr.length))) : oo0oO0.o00oOoo0(o0o0o00Arr[0]) : o00ooO0O();
    }

    @o0OOO0OO.o00oo00O
    public static final <K, V> o0OO0o.o0O0o00<K, V> o0O0OOO(Map.Entry<? extends K, ? extends V> entry) {
        o0OOOOO0.o0ooO.o00oo0O0(entry, "<this>");
        return new o0OO0o.o0O0o00<>(entry.getKey(), entry.getValue());
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> o0O0OOO0(@NotNull Map<? extends K, ? extends V> map) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        return new LinkedHashMap(map);
    }

    @o0OOO0OO.o00oo00O
    public static final <K, V> V o0O0o(Map.Entry<? extends K, ? extends V> entry) {
        o0OOOOO0.o0ooO.o00oo0O0(entry, "<this>");
        return entry.getValue();
    }

    @o0OOO0OO.o00oo00O
    public static final <K, V> V o0O0oo0o(Map<? extends K, V> map, K k) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        return (V) o0OOOOO0.o0OOO0OO.o00oOoo0(map).remove(k);
    }

    @NotNull
    public static final <K, V> Map<K, V> o0OoO00O(@NotNull o0OO0o.o0O0o00<? extends K, ? extends V>... o0o0o00Arr) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00Arr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(oo0oO0.o00oOoOo(o0o0o00Arr.length));
        o0oO0O0o(linkedHashMap, o0o0o00Arr);
        return linkedHashMap;
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> o0OoOoOO(@NotNull Map<? extends K, ? extends V> map, @NotNull K[] kArr) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(kArr, androidx.lifecycle.o0O.f3318o00oOoO);
        Map o0O0OOO02 = o0O0OOO0(map);
        o0O00o00.o0O0OO0O(o0O0OOO02.keySet(), kArr);
        return o0O00O0o(o0O0OOO02);
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> o0OoOoOo(@NotNull Map<? extends K, ? extends V> map, K k) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        Map o0O0OOO02 = o0O0OOO0(map);
        o0O0OOO02.remove(k);
        return o0O00O0o(o0O0OOO02);
    }

    public static final <K, V> void o0oO0O0o(@NotNull Map<? super K, ? super V> map, @NotNull o0OO0o.o0O0o00<? extends K, ? extends V>[] o0o0o00Arr) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00Arr, "pairs");
        for (o0OO0o.o0O0o00<? extends K, ? extends V> o0o0o00 : o0o0o00Arr) {
            map.put((K) o0o0o00.component1(), (V) o0o0o00.component2());
        }
    }

    @NotNull
    public static final <K, V> Map<K, V> o0oO0Ooo(@NotNull Map<? extends K, ? extends V> map, @NotNull oO000<? extends o0OO0o.o0O0o00<? extends K, ? extends V>> oo000) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(oo000, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        o0O0O0O(linkedHashMap, oo000);
        return o0O00O0o(linkedHashMap);
    }

    @NotNull
    public static final <K, V> Map<K, V> o0ooO(@NotNull oO000<? extends o0OO0o.o0O0o00<? extends K, ? extends V>> oo000) {
        o0OOOOO0.o0ooO.o00oo0O0(oo000, "<this>");
        return o0O00O0o(o0O0OO0(oo000, new LinkedHashMap()));
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final <K, V> void o0ooOoOO(Map<K, V> map, oO000<? extends K> oo000) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(oo000, androidx.lifecycle.o0O.f3318o00oOoO);
        o0O00o00.o0O0OO0(map.keySet(), oo000);
    }
}
