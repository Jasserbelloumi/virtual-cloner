package o00oo00O;

import java.util.HashMap;
import java.util.Map;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00oo00O.o00oOOoO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00oOOo0<K, V> extends o00oOOoO<K, V> {

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final HashMap<K, o00oOOoO.o00oOo00<K, V>> f7262o00oo0o = new HashMap<>();

    public boolean contains(K k) {
        return this.f7262o00oo0o.containsKey(k);
    }

    @Override // o00oo00O.o00oOOoO
    @o0OO00OO
    public o00oOOoO.o00oOo00<K, V> o00oOOoO(K k) {
        return this.f7262o00oo0o.get(k);
    }

    @Override // o00oo00O.o00oOOoO
    public V o00oOo0o(@oo0oO0 K k, @oo0oO0 V v) {
        o00oOOoO.o00oOo00<K, V> o00oOOoO2 = o00oOOoO(k);
        if (o00oOOoO2 != null) {
            return o00oOOoO2.f7267o00oo0O;
        }
        this.f7262o00oo0o.put(k, o00oOo0O(k, v));
        return null;
    }

    @o0OO00OO
    public Map.Entry<K, V> o00oOoO(K k) {
        if (contains(k)) {
            return this.f7262o00oo0o.get(k).f7270o00oo0o0;
        }
        return null;
    }

    @Override // o00oo00O.o00oOOoO
    public V o00oOoO0(@oo0oO0 K k) {
        V v = (V) super.o00oOoO0(k);
        this.f7262o00oo0o.remove(k);
        return v;
    }
}
