package o0OO0oO;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import o0OO0o.oO0Ooooo;
import o0OOOoO0.oO000;
import org.jetbrains.annotations.NotNull;
@o0OOOOO0.o0OOO00({"SMAP\n_Maps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,594:1\n96#1,5:595\n111#1,5:600\n152#1,3:605\n143#1:608\n215#1:609\n216#1:611\n144#1:612\n215#1:613\n216#1:615\n1#2:610\n1#2:614\n1940#3,14:616\n1963#3,14:630\n2310#3,14:644\n2333#3,14:658\n1864#3,3:672\n*S KotlinDebug\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n76#1:595,5\n89#1:600,5\n125#1:605,3\n135#1:608\n135#1:609\n135#1:611\n135#1:612\n143#1:613\n143#1:615\n135#1:610\n230#1:616,14\n241#1:630,14\n390#1:644,14\n401#1:658,14\n574#1:672,3\n*E\n"})
/* loaded from: classes3.dex */
public class o0OO00o0 extends o0OO00OO {
    @NotNull
    public static final <K, V> oO000<Map.Entry<K, V>> o0O0Oo(@NotNull Map<? extends K, ? extends V> map) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        return o0O0oo0o.o0O0oOO0(map.entrySet());
    }

    public static final <K, V> boolean o0O0Oo0(@NotNull Map<? extends K, ? extends V> map) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        return !map.isEmpty();
    }

    public static final <K, V> boolean o0O0Oo0O(@NotNull Map<? extends K, ? extends V> map, @NotNull o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        if (map.isEmpty()) {
            return false;
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (o00ooVar.invoke(entry).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @o0OOO0OO.o00oo00O
    public static final <K, V> Iterable<Map.Entry<K, V>> o0O0Oo0o(Map<? extends K, ? extends V> map) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        return map.entrySet();
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final <K, V, R> R o0O0OoO(Map<? extends K, ? extends V> map, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            R invoke = o00ooVar.invoke(entry);
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }

    public static final <K, V> int o0O0OoO0(@NotNull Map<? extends K, ? extends V> map, @NotNull o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int i = 0;
        if (map.isEmpty()) {
            return 0;
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (o00ooVar.invoke(entry).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @NotNull
    public static final <K, V, R> List<R> o0O0OoOo(@NotNull Map<? extends K, ? extends V> map, @NotNull o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            o0O00o00.o0O00OOO(arrayList, o00ooVar.invoke(entry));
        }
        return arrayList;
    }

    @NotNull
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapSequenceTo")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <K, V, R, C extends Collection<? super R>> C o0O0Ooo(@NotNull Map<? extends K, ? extends V> map, @NotNull C c, @NotNull o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends oO000<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            o0O00o00.o0O00Oo(c, o00ooVar.invoke(entry));
        }
        return c;
    }

    @NotNull
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapSequence")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <K, V, R> List<R> o0O0Ooo0(@NotNull Map<? extends K, ? extends V> map, @NotNull o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends oO000<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            o0O00o00.o0O00Oo(arrayList, o00ooVar.invoke(entry));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V, R, C extends Collection<? super R>> C o0O0OooO(@NotNull Map<? extends K, ? extends V> map, @NotNull C c, @NotNull o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            o0O00o00.o0O00OOO(c, o00ooVar.invoke(entry));
        }
        return c;
    }

    @o0OOO0OO.o00oo00O
    public static final <K, V> int o0O0Oooo(Map<? extends K, ? extends V> map) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        return map.size();
    }

    @NotNull
    public static final <K, V, R, C extends Collection<? super R>> C o0O0o0(@NotNull Map<? extends K, ? extends V> map, @NotNull C c, @NotNull o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            c.add(o00ooVar.invoke(entry));
        }
        return c;
    }

    @NotNull
    public static final <K, V, R> List<R> o0O0o00(@NotNull Map<? extends K, ? extends V> map, @NotNull o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            arrayList.add(o00ooVar.invoke(entry));
        }
        return arrayList;
    }

    @o0OOO0OO.o00oOoO
    public static final <K, V> void o0O0o000(@NotNull Map<? extends K, ? extends V> map, @NotNull o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            o00ooVar.invoke(entry);
        }
    }

    @NotNull
    public static final <K, V, R> List<R> o0O0o00O(@NotNull Map<? extends K, ? extends V> map, @NotNull o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            R invoke = o00ooVar.invoke(entry);
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V, R, C extends Collection<? super R>> C o0O0o00o(@NotNull Map<? extends K, ? extends V> map, @NotNull C c, @NotNull o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            R invoke = o00ooVar.invoke(entry);
            if (invoke != null) {
                c.add(invoke);
            }
        }
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> o0O0o0O(Map<? extends K, ? extends V> map, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        Object obj;
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj2 = (Object) it.next();
            if (it.hasNext()) {
                R invoke = o00ooVar.invoke(obj2);
                Object obj3 = obj2;
                do {
                    Object obj4 = (Object) it.next();
                    R invoke2 = o00ooVar.invoke(obj4);
                    obj2 = obj3;
                    if (invoke.compareTo(invoke2) < 0) {
                        invoke = invoke2;
                        obj2 = (Object) obj4;
                    }
                    obj3 = obj2;
                } while (it.hasNext());
                obj = obj2;
            } else {
                obj = obj2;
            }
        } else {
            obj = null;
        }
        return (Map.Entry) obj;
    }

    @o0OOOO0o.o00oo0OO(name = "maxByOrThrow")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> o0O0o0OO(Map<? extends K, ? extends V> map, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (Object) it.next();
            if (it.hasNext()) {
                R invoke = o00ooVar.invoke(obj);
                do {
                    Object obj2 = (Object) it.next();
                    R invoke2 = o00ooVar.invoke(obj2);
                    if (invoke.compareTo(invoke2) < 0) {
                        obj = (Object) obj2;
                        invoke = invoke2;
                    }
                } while (it.hasNext());
                return (Map.Entry) obj;
            }
            return (Map.Entry) obj;
        }
        throw new NoSuchElementException();
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <K, V> double o0O0o0Oo(Map<? extends K, ? extends V> map, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            double doubleValue = o00ooVar.invoke((Object) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, o00ooVar.invoke((Object) it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <K, V, R extends Comparable<? super R>> R o0O0o0o(Map<? extends K, ? extends V> map, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            R invoke = o00ooVar.invoke((Object) it.next());
            while (it.hasNext()) {
                R invoke2 = o00ooVar.invoke((Object) it.next());
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <K, V> float o0O0o0o0(Map<? extends K, ? extends V> map, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            float floatValue = o00ooVar.invoke((Object) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, o00ooVar.invoke((Object) it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <K, V> Double o0O0o0oO(Map<? extends K, ? extends V> map, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            double doubleValue = o00ooVar.invoke((Object) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, o00ooVar.invoke((Object) it.next()).doubleValue());
            }
            return Double.valueOf(doubleValue);
        }
        return null;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <K, V> Float o0O0o0oo(Map<? extends K, ? extends V> map, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            float floatValue = o00ooVar.invoke((Object) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, o00ooVar.invoke((Object) it.next()).floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    @o0OOOO0o.o00oo0OO(name = "minByOrThrow")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> o0O0oO(Map<? extends K, ? extends V> map, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (Object) it.next();
            if (it.hasNext()) {
                R invoke = o00ooVar.invoke(obj);
                do {
                    Object obj2 = (Object) it.next();
                    R invoke2 = o00ooVar.invoke(obj2);
                    if (invoke.compareTo(invoke2) > 0) {
                        obj = (Object) obj2;
                        invoke = invoke2;
                    }
                } while (it.hasNext());
                return (Map.Entry) obj;
            }
            return (Map.Entry) obj;
        }
        throw new NoSuchElementException();
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <K, V> Map.Entry<K, V> o0O0oO0(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return (Map.Entry) o0O0oo0o.o0ooOOOO(map.entrySet(), comparator);
    }

    @o0OOOO0o.o00oo0OO(name = "maxWithOrThrow")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <K, V> Map.Entry<K, V> o0O0oO0O(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return (Map.Entry) o0O0oo0o.o0oOo000(map.entrySet(), comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> o0O0oO0o(Map<? extends K, ? extends V> map, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        Object obj;
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj2 = (Object) it.next();
            if (it.hasNext()) {
                R invoke = o00ooVar.invoke(obj2);
                Object obj3 = obj2;
                do {
                    Object obj4 = (Object) it.next();
                    R invoke2 = o00ooVar.invoke(obj4);
                    obj2 = obj3;
                    if (invoke.compareTo(invoke2) > 0) {
                        invoke = invoke2;
                        obj2 = (Object) obj4;
                    }
                    obj3 = obj2;
                } while (it.hasNext());
                obj = obj2;
            } else {
                obj = obj2;
            }
        } else {
            obj = null;
        }
        return (Map.Entry) obj;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <K, V> float o0O0oOO(Map<? extends K, ? extends V> map, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            float floatValue = o00ooVar.invoke((Object) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, o00ooVar.invoke((Object) it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <K, V> double o0O0oOO0(Map<? extends K, ? extends V> map, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            double doubleValue = o00ooVar.invoke((Object) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, o00ooVar.invoke((Object) it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <K, V, R extends Comparable<? super R>> R o0O0oOOO(Map<? extends K, ? extends V> map, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            R invoke = o00ooVar.invoke((Object) it.next());
            while (it.hasNext()) {
                R invoke2 = o00ooVar.invoke((Object) it.next());
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <K, V, R> R o0O0oOo(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (R) o00ooVar.invoke((Object) it.next());
            while (it.hasNext()) {
                R invoke = o00ooVar.invoke((Object) it.next());
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <K, V> Double o0O0oOo0(Map<? extends K, ? extends V> map, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            double doubleValue = o00ooVar.invoke((Object) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, o00ooVar.invoke((Object) it.next()).doubleValue());
            }
            return Double.valueOf(doubleValue);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <K, V, R> R o0O0oOoO(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (R) o00ooVar.invoke((Object) it.next());
            while (it.hasNext()) {
                R invoke = o00ooVar.invoke((Object) it.next());
                if (comparator.compare(obj, invoke) > 0) {
                    obj = (Object) invoke;
                }
            }
            return obj;
        }
        return null;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <K, V> Map.Entry<K, V> o0O0oOoo(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return (Map.Entry) o0O0oo0o.o0Oo0ooo(map.entrySet(), comparator);
    }

    public static final <K, V> boolean o0O0oo(@NotNull Map<? extends K, ? extends V> map) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        return map.isEmpty();
    }

    @o0OOOO0o.o00oo0OO(name = "minWithOrThrow")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <K, V> Map.Entry<K, V> o0O0oo0(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return (Map.Entry) o0O0oo0o.o0Oo(map.entrySet(), comparator);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <K, V, R extends Comparable<? super R>> R o0O0oo00(Map<? extends K, ? extends V> map, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            R invoke = o00ooVar.invoke((Object) it.next());
            while (it.hasNext()) {
                R invoke2 = o00ooVar.invoke((Object) it.next());
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <K, V, R> R o0O0oo0O(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (R) o00ooVar.invoke((Object) it.next());
            while (it.hasNext()) {
                R invoke = o00ooVar.invoke((Object) it.next());
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    public static final <K, V> boolean o0O0ooO0(@NotNull Map<? extends K, ? extends V> map, @NotNull o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (o00ooVar.invoke(entry).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    @NotNull
    public static final <K, V, M extends Map<? extends K, ? extends V>> M o0O0ooOO(@NotNull M m, @NotNull o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(m, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        for (Map.Entry<K, V> entry : m.entrySet()) {
            o00ooVar.invoke(entry);
        }
        return m;
    }

    @NotNull
    public static final <K, V> List<o0OO0o.o0O0o00<K, V>> o0O0ooo(@NotNull Map<? extends K, ? extends V> map) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        if (map.size() == 0) {
            return o0ooO.INSTANCE;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<? extends K, ? extends V> next = it.next();
            if (it.hasNext()) {
                ArrayList arrayList = new ArrayList(map.size());
                arrayList.add(new o0OO0o.o0O0o00(next.getKey(), next.getValue()));
                do {
                    Map.Entry<? extends K, ? extends V> next2 = it.next();
                    arrayList.add(new o0OO0o.o0O0o00(next2.getKey(), next2.getValue()));
                } while (it.hasNext());
                return arrayList;
            }
            return o0OoO00O.o00oOoo0(new o0OO0o.o0O0o00(next.getKey(), next.getValue()));
        }
        return o0ooO.INSTANCE;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @NotNull
    public static final <K, V, M extends Map<? extends K, ? extends V>> M o0O0ooo0(@NotNull M m, @NotNull o0OOOO.o0O00000<? super Integer, ? super Map.Entry<? extends K, ? extends V>, oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(m, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "action");
        int i = 0;
        for (Object obj : m.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                o0O00O0o.o0O0000O();
            }
            o0o00000.invoke(Integer.valueOf(i), obj);
            i = i2;
        }
        return m;
    }

    public static final <K, V> boolean o0OooO0(@NotNull Map<? extends K, ? extends V> map, @NotNull o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!o00ooVar.invoke(entry).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <K, V, R extends Comparable<? super R>> R o0oOo0O0(Map<? extends K, ? extends V> map, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            R invoke = o00ooVar.invoke((Object) it.next());
            while (it.hasNext()) {
                R invoke2 = o00ooVar.invoke((Object) it.next());
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        return null;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final <K, V, R> R oo0OOoo(Map<? extends K, ? extends V> map, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        R r;
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                r = null;
                break;
            }
            r = o00ooVar.invoke(it.next());
            if (r != null) {
                break;
            }
        }
        if (r != null) {
            return r;
        }
        throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <K, V> Float oo0oOOo(Map<? extends K, ? extends V> map, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            float floatValue = o00ooVar.invoke((Object) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, o00ooVar.invoke((Object) it.next()).floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <K, V, R> R oooOO0(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (R) o00ooVar.invoke((Object) it.next());
            while (it.hasNext()) {
                R invoke = o00ooVar.invoke((Object) it.next());
                if (comparator.compare(obj, invoke) < 0) {
                    obj = (Object) invoke;
                }
            }
            return obj;
        }
        return null;
    }
}
