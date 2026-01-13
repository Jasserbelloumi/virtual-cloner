package o0OO0oO;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOOOO0.o0OOO00({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MutableMapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n330#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MutableMapWithDefaultImpl\n*L\n101#1:105,6\n*E\n"})
/* loaded from: classes3.dex */
public final class o0OO0<K, V> implements o0OO00o<K, V> {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o0OOOO.o00oo<K, V> f13368o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Map<K, V> f13369o00oo0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public o0OO0(@NotNull Map<K, V> map, @NotNull o0OOOO.o00oo<? super K, ? extends V> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "map");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "default");
        this.f13369o00oo0O0 = map;
        this.f13368o00oo0O = o00ooVar;
    }

    @Override // java.util.Map
    public void clear() {
        this.f13369o00oo0O0.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f13369o00oo0O0.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f13369o00oo0O0.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return o00oOOo0();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        return this.f13369o00oo0O0.equals(obj);
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        return this.f13369o00oo0O0.get(obj);
    }

    @Override // o0OO0oO.o0OO00o, o0OO0oO.o0O0oo00
    @NotNull
    public Map<K, V> getMap() {
        return this.f13369o00oo0O0;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f13369o00oo0O0.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f13369o00oo0O0.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return o00oOOoO();
    }

    @NotNull
    public Set<Map.Entry<K, V>> o00oOOo0() {
        return this.f13369o00oo0O0.entrySet();
    }

    @NotNull
    public Set<K> o00oOOoO() {
        return this.f13369o00oo0O0.keySet();
    }

    public int o00oOo00() {
        return this.f13369o00oo0O0.size();
    }

    @Override // o0OO0oO.o0O0oo00
    public V o00oOo0o(K k) {
        Map<K, V> map = this.f13369o00oo0O0;
        V v = map.get(k);
        return (v != null || map.containsKey(k)) ? v : this.f13368o00oo0O.invoke(k);
    }

    @NotNull
    public Collection<V> o00oOooO() {
        return this.f13369o00oo0O0.values();
    }

    @Override // java.util.Map
    @Nullable
    public V put(K k, V v) {
        return this.f13369o00oo0O0.put(k, v);
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> map) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "from");
        this.f13369o00oo0O0.putAll(map);
    }

    @Override // java.util.Map
    @Nullable
    public V remove(Object obj) {
        return this.f13369o00oo0O0.remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return o00oOo00();
    }

    @NotNull
    public String toString() {
        return this.f13369o00oo0O0.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return o00oOooO();
    }
}
