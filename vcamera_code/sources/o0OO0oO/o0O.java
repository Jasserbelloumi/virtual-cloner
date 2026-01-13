package o0OO0oO;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOOOO0.o0OOO00({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n330#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n*L\n80#1:105,6\n*E\n"})
/* loaded from: classes3.dex */
public final class o0O<K, V> implements o0O0oo00<K, V> {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o0OOOO.o00oo<K, V> f13320o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Map<K, V> f13321o00oo0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public o0O(@NotNull Map<K, ? extends V> map, @NotNull o0OOOO.o00oo<? super K, ? extends V> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "map");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "default");
        this.f13321o00oo0O0 = map;
        this.f13320o00oo0O = o00ooVar;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f13321o00oo0O0.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f13321o00oo0O0.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return o00oOOo0();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        return this.f13321o00oo0O0.equals(obj);
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        return this.f13321o00oo0O0.get(obj);
    }

    @Override // o0OO0oO.o0O0oo00
    @NotNull
    public Map<K, V> getMap() {
        return this.f13321o00oo0O0;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f13321o00oo0O0.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f13321o00oo0O0.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return o00oOOoO();
    }

    @NotNull
    public Set<Map.Entry<K, V>> o00oOOo0() {
        return this.f13321o00oo0O0.entrySet();
    }

    @NotNull
    public Set<K> o00oOOoO() {
        return this.f13321o00oo0O0.keySet();
    }

    public int o00oOo00() {
        return this.f13321o00oo0O0.size();
    }

    @Override // o0OO0oO.o0O0oo00
    public V o00oOo0o(K k) {
        Map<K, V> map = this.f13321o00oo0O0;
        V v = map.get(k);
        return (v != null || map.containsKey(k)) ? v : this.f13320o00oo0O.invoke(k);
    }

    @NotNull
    public Collection<V> o00oOooO() {
        return this.f13321o00oo0O0.values();
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return o00oOo00();
    }

    @NotNull
    public String toString() {
        return this.f13321o00oo0O0.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return o00oOooO();
    }
}
