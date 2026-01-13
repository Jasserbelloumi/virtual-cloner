package o0OO0oO;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
@o0OOOOO0.o0OOO00({"SMAP\nGrouping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n1#1,291:1\n80#1,6:292\n53#1:298\n80#1,6:299\n80#1,6:305\n53#1:311\n80#1,6:312\n80#1,6:318\n53#1:324\n80#1,6:325\n80#1,6:331\n189#1:337\n80#1,6:338\n*S KotlinDebug\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n53#1:292,6\n112#1:298\n112#1:299,6\n143#1:305,6\n164#1:311\n164#1:312,6\n189#1:318,6\n211#1:324\n211#1:325,6\n239#1:331,6\n257#1:337\n257#1:338,6\n*E\n"})
/* loaded from: classes3.dex */
public class oo0OOoo extends o0OooO0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @o0OO0o.o0OO00o0(version = "1.1")
    @NotNull
    public static final <T, K, R> Map<K, R> o00oOo00(@NotNull o0O0OOO<T, ? extends K> o0o0ooo, @NotNull o0OOOO.o0O000<? super K, ? super R, ? super T, ? super Boolean, ? extends R> o0o000) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o000, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> o00oOOoO2 = o0o0ooo.o00oOOoO();
        while (o00oOOoO2.hasNext()) {
            ?? next = o00oOOoO2.next();
            Object obj = (K) o0o0ooo.o00oOOo0(next);
            Object obj2 = (Object) linkedHashMap.get(obj);
            linkedHashMap.put(obj, o0o000.invoke(obj, obj2, next, Boolean.valueOf(obj2 == 0 && !linkedHashMap.containsKey(obj))));
        }
        return linkedHashMap;
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    @NotNull
    public static final <T, K, M extends Map<? super K, Integer>> M o00oOo0O(@NotNull o0O0OOO<T, ? extends K> o0o0ooo, @NotNull M m) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        Iterator<T> o00oOOoO2 = o0o0ooo.o00oOOoO();
        while (o00oOOoO2.hasNext()) {
            K o00oOOo02 = o0o0ooo.o00oOOo0(o00oOOoO2.next());
            Object obj = m.get(o00oOOo02);
            if (obj == null && !m.containsKey(o00oOOo02)) {
                obj = 0;
            }
            m.put(o00oOOo02, Integer.valueOf(((Number) obj).intValue() + 1));
        }
        return m;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @o0OO0o.o0OO00o0(version = "1.1")
    @NotNull
    public static final <T, K, R> Map<K, R> o00oOo0o(@NotNull o0O0OOO<T, ? extends K> o0o0ooo, R r, @NotNull o0OOOO.o0O00000<? super R, ? super T, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> o00oOOoO2 = o0o0ooo.o00oOOoO();
        while (o00oOOoO2.hasNext()) {
            ?? next = o00oOOoO2.next();
            K o00oOOo02 = o0o0ooo.o00oOOo0(next);
            Object obj = (Object) linkedHashMap.get(o00oOOo02);
            if (obj == null && !linkedHashMap.containsKey(o00oOOo02)) {
                obj = (Object) r;
            }
            linkedHashMap.put(o00oOOo02, o0o00000.invoke(obj, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @o0OO0o.o0OO00o0(version = "1.1")
    @NotNull
    public static final <T, K, R, M extends Map<? super K, R>> M o00oOoO(@NotNull o0O0OOO<T, ? extends K> o0o0ooo, @NotNull M m, R r, @NotNull o0OOOO.o0O00000<? super R, ? super T, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        Iterator<T> o00oOOoO2 = o0o0ooo.o00oOOoO();
        while (o00oOOoO2.hasNext()) {
            ?? next = o00oOOoO2.next();
            K o00oOOo02 = o0o0ooo.o00oOOo0(next);
            Object obj = (Object) m.get(o00oOOo02);
            if (obj == null && !m.containsKey(o00oOOo02)) {
                obj = (Object) r;
            }
            m.put(o00oOOo02, o0o00000.invoke(obj, next));
        }
        return m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @o0OO0o.o0OO00o0(version = "1.1")
    @NotNull
    public static final <T, K, R> Map<K, R> o00oOoO0(@NotNull o0O0OOO<T, ? extends K> o0o0ooo, @NotNull o0OOOO.o0O00000<? super K, ? super T, ? extends R> o0o00000, @NotNull o0OOOO.o0O0000O<? super K, ? super R, ? super T, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "initialValueSelector");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> o00oOOoO2 = o0o0ooo.o00oOOoO();
        while (o00oOOoO2.hasNext()) {
            ?? next = o00oOOoO2.next();
            Object obj = (K) o0o0ooo.o00oOOo0(next);
            R r = (Object) linkedHashMap.get(obj);
            if (r == null && !linkedHashMap.containsKey(obj)) {
                r = o0o00000.invoke(obj, next);
            }
            linkedHashMap.put(obj, o0o0000o.invoke(obj, r, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @o0OO0o.o0OO00o0(version = "1.1")
    @NotNull
    public static final <T, K, R, M extends Map<? super K, R>> M o00oOoOO(@NotNull o0O0OOO<T, ? extends K> o0o0ooo, @NotNull M m, @NotNull o0OOOO.o0O00000<? super K, ? super T, ? extends R> o0o00000, @NotNull o0OOOO.o0O0000O<? super K, ? super R, ? super T, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "initialValueSelector");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        Iterator<T> o00oOOoO2 = o0o0ooo.o00oOOoO();
        while (o00oOOoO2.hasNext()) {
            ?? next = o00oOOoO2.next();
            Object o00oOOo02 = o0o0ooo.o00oOOo0(next);
            R r = (Object) m.get(o00oOOo02);
            if (r == null && !m.containsKey(o00oOOo02)) {
                r = o0o00000.invoke(o00oOOo02, next);
            }
            m.put(o00oOOo02, o0o0000o.invoke(o00oOOo02, r, next));
        }
        return m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0OO00o0(version = "1.1")
    @NotNull
    public static final <S, T extends S, K> Map<K, S> o00oOoOo(@NotNull o0O0OOO<T, ? extends K> o0o0ooo, @NotNull o0OOOO.o0O0000O<? super K, ? super S, ? super T, ? extends S> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator o00oOOoO2 = o0o0ooo.o00oOOoO();
        while (o00oOOoO2.hasNext()) {
            S s = (Object) o00oOOoO2.next();
            Object obj = (Object) o0o0ooo.o00oOOo0(s);
            Object obj2 = (Object) linkedHashMap.get(obj);
            if (!(obj2 == 0 && !linkedHashMap.containsKey(obj))) {
                s = o0o0000o.invoke(obj, obj2, s);
            }
            linkedHashMap.put(obj, s);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0OO00o0(version = "1.1")
    @NotNull
    public static final <S, T extends S, K, M extends Map<? super K, S>> M o00oOoo0(@NotNull o0O0OOO<T, ? extends K> o0o0ooo, @NotNull M m, @NotNull o0OOOO.o0O0000O<? super K, ? super S, ? super T, ? extends S> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        Iterator o00oOOoO2 = o0o0ooo.o00oOOoO();
        while (o00oOOoO2.hasNext()) {
            S s = (Object) o00oOOoO2.next();
            Object obj = (Object) o0o0ooo.o00oOOo0(s);
            Object obj2 = (Object) m.get(obj);
            if (!(obj2 == 0 && !m.containsKey(obj))) {
                s = o0o0000o.invoke(obj, obj2, s);
            }
            m.put(obj, s);
        }
        return m;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @o0OO0o.o0OO00o0(version = "1.1")
    @NotNull
    public static final <T, K, R, M extends Map<? super K, R>> M o00oOooO(@NotNull o0O0OOO<T, ? extends K> o0o0ooo, @NotNull M m, @NotNull o0OOOO.o0O000<? super K, ? super R, ? super T, ? super Boolean, ? extends R> o0o000) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o000, "operation");
        Iterator<T> o00oOOoO2 = o0o0ooo.o00oOOoO();
        while (o00oOOoO2.hasNext()) {
            ?? next = o00oOOoO2.next();
            Object o00oOOo02 = o0o0ooo.o00oOOo0(next);
            Object obj = (Object) m.get(o00oOOo02);
            m.put(o00oOOo02, o0o000.invoke(o00oOOo02, obj, next, Boolean.valueOf(obj == 0 && !m.containsKey(o00oOOo02))));
        }
        return m;
    }
}
