package o0OO0oO;

import java.util.Map;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
@o0OOOOO0.o0OOO00({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n330#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n*L\n24#1:105,6\n*E\n"})
/* loaded from: classes3.dex */
public class o0OO000o {
    @o0OO0o.o0O
    @o0OOOO0o.o00oo0OO(name = "getOrImplicitDefaultNullable")
    public static final <K, V> V o00oOOo0(@NotNull Map<K, ? extends V> map, K k) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        if (map instanceof o0O0oo00) {
            return (V) ((o0O0oo00) map).o00oOo0o(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        throw new NoSuchElementException("Key " + k + " is missing in the map.");
    }

    @NotNull
    public static final <K, V> Map<K, V> o00oOOoO(@NotNull Map<K, ? extends V> map, @NotNull o0OOOO.o00oo<? super K, ? extends V> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "defaultValue");
        return map instanceof o0O0oo00 ? o00oOOoO(((o0O0oo00) map).getMap(), o00ooVar) : new o0O(map, o00ooVar);
    }

    @o0OOOO0o.o00oo0OO(name = "withDefaultMutable")
    @NotNull
    public static final <K, V> Map<K, V> o00oOo00(@NotNull Map<K, V> map, @NotNull o0OOOO.o00oo<? super K, ? extends V> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "defaultValue");
        return map instanceof o0OO00o ? o00oOo00(((o0OO00o) map).getMap(), o00ooVar) : new o0OO0(map, o00ooVar);
    }
}
