package o0OO0oO;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.Nullable;
@o0OO0o.o0OO00o0(version = "1.1")
/* loaded from: classes3.dex */
public abstract class o00oo0<K, V> extends AbstractMap<K, V> implements Map<K, V>, o0OOOOO.o00oo0 {
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return o00oOOo0();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>) o00oOOoO();
    }

    public abstract Set o00oOOo0();

    public /* bridge */ Set<Object> o00oOOoO() {
        return super.keySet();
    }

    public /* bridge */ int o00oOo00() {
        return super.size();
    }

    public /* bridge */ Collection<Object> o00oOooO() {
        return super.values();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public abstract V put(K k, V v);

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return o00oOo00();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) o00oOooO();
    }
}
