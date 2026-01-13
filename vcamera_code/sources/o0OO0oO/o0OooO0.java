package o0OO0oO;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o0OOOOO0.o0OO0O0;
import org.jetbrains.annotations.NotNull;
@o0OOOOO0.o0OOO00({"SMAP\nGroupingJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n+ 2 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n143#2:53\n80#2,4:54\n85#2:59\n1#3:58\n1855#4,2:60\n*S KotlinDebug\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n*L\n22#1:53\n22#1:54,4\n22#1:59\n48#1:60,2\n*E\n"})
/* loaded from: classes3.dex */
public class o0OooO0 {
    @o0OO0o.o0OO00o0(version = "1.1")
    @NotNull
    public static final <T, K> Map<K, Integer> o00oOOo0(@NotNull o0O0OOO<T, ? extends K> o0o0ooo) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> o00oOOoO2 = o0o0ooo.o00oOOoO();
        while (o00oOOoO2.hasNext()) {
            K o00oOOo02 = o0o0ooo.o00oOOo0(o00oOOoO2.next());
            Object obj = linkedHashMap.get(o00oOOo02);
            if (obj == null && !linkedHashMap.containsKey(o00oOOo02)) {
                obj = new o0OO0O0.o00oo00O();
            }
            o0OO0O0.o00oo00O o00oo00o = (o0OO0O0.o00oo00O) obj;
            o00oo00o.element++;
            linkedHashMap.put(o00oOOo02, o00oo00o);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            o0OOOOO0.o0ooO.o00oo0(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            o0OOOOO0.o0OOO0OO.o00oo00O(entry).setValue(Integer.valueOf(((o0OO0O0.o00oo00O) entry.getValue()).element));
        }
        return o0OOOOO0.o0OOO0OO.o00oOoo0(linkedHashMap);
    }

    @o0OO0o.o0O
    @o0OOO0OO.o00oo00O
    public static final <K, V, R> Map<K, R> o00oOOoO(Map<K, V> map, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "f");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            o0OOOOO0.o0ooO.o00oo0(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            o0OOOOO0.o0OOO0OO.o00oo00O(entry).setValue(o00ooVar.invoke(entry));
        }
        return o0OOOOO0.o0OOO0OO.o00oOoo0(map);
    }
}
