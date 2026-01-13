package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oOOo0<K, V> extends o00ooO0<K, V> implements Map<K, V> {
    @o0OO00OO

    /* renamed from: o00ooO  reason: collision with root package name */
    public o00oo<K, V> f1665o00ooO;

    /* renamed from: androidx.collection.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0010o00oOOo0 extends o00oo<K, V> {
        public C0010o00oOOo0() {
        }

        @Override // androidx.collection.o00oo
        public void o00oOOo0() {
            o00oOOo0.this.clear();
        }

        @Override // androidx.collection.o00oo
        public Object o00oOOoO(int i, int i2) {
            return o00oOOo0.this.f1731o00oo0O[(i << 1) + i2];
        }

        @Override // androidx.collection.o00oo
        public Map<K, V> o00oOo00() {
            return o00oOOo0.this;
        }

        @Override // androidx.collection.o00oo
        public int o00oOo0O(Object obj) {
            return o00oOOo0.this.o00oOoO0(obj);
        }

        @Override // androidx.collection.o00oo
        public int o00oOo0o(Object obj) {
            return o00oOOo0.this.o00oOoOO(obj);
        }

        @Override // androidx.collection.o00oo
        public void o00oOoO(int i) {
            o00oOOo0.this.o00oOooo(i);
        }

        @Override // androidx.collection.o00oo
        public void o00oOoO0(K k, V v) {
            o00oOOo0.this.put(k, v);
        }

        @Override // androidx.collection.o00oo
        public V o00oOoOO(int i, V v) {
            return o00oOOo0.this.o00oo00O(i, v);
        }

        @Override // androidx.collection.o00oo
        public int o00oOooO() {
            return o00oOOo0.this.f1733o00oo0Oo;
        }
    }

    public o00oOOo0() {
    }

    public o00oOOo0(int i) {
        super(i);
    }

    public o00oOOo0(o00ooO0 o00ooo02) {
        super(o00ooo02);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return o00oo0O0().o00oOooo();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return o00oo0O0().o00oo00O();
    }

    public boolean o00oo0O(@oo0oO0 Collection<?> collection) {
        return o00oo.o00oo0OO(this, collection);
    }

    public final o00oo<K, V> o00oo0O0() {
        if (this.f1665o00ooO == null) {
            this.f1665o00ooO = new C0010o00oOOo0();
        }
        return this.f1665o00ooO;
    }

    public boolean o00oo0OO(@oo0oO0 Collection<?> collection) {
        return o00oo.o00oOoOo(this, collection);
    }

    public boolean o00oo0Oo(@oo0oO0 Collection<?> collection) {
        return o00oo.o00oo0O0(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        o00oOo00(map.size() + this.f1733o00oo0Oo);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return o00oo0O0().o00oo0();
    }
}
