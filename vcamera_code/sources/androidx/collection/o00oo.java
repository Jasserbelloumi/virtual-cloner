package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public abstract class o00oo<K, V> {
    @o0OO00OO

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o00oo<K, V>.o00oOOoO f1686o00oOOo0;
    @o0OO00OO

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o00oo<K, V>.o00oOo00 f1687o00oOOoO;
    @o0OO00OO

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o00oo<K, V>.o00oOoO f1688o00oOo00;

    /* loaded from: classes.dex */
    public final class o00oOOo0<T> implements Iterator<T> {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f1689o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final int f1690o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public int f1691o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public boolean f1693o00oo0o0 = false;

        public o00oOOo0(int i) {
            this.f1690o00oo0O0 = i;
            this.f1689o00oo0O = o00oo.this.o00oOooO();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1691o00oo0Oo < this.f1689o00oo0O;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) o00oo.this.o00oOOoO(this.f1691o00oo0Oo, this.f1690o00oo0O0);
                this.f1691o00oo0Oo++;
                this.f1693o00oo0o0 = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f1693o00oo0o0) {
                throw new IllegalStateException();
            }
            int i = this.f1691o00oo0Oo - 1;
            this.f1691o00oo0Oo = i;
            this.f1689o00oo0O--;
            this.f1693o00oo0o0 = false;
            o00oo.this.o00oOoO(i);
        }
    }

    /* loaded from: classes.dex */
    public final class o00oOOoO implements Set<Map.Entry<K, V>> {
        public o00oOOoO() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int o00oOooO2 = o00oo.this.o00oOooO();
            for (Map.Entry<K, V> entry : collection) {
                o00oo.this.o00oOoO0(entry.getKey(), entry.getValue());
            }
            return o00oOooO2 != o00oo.this.o00oOooO();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            o00oo.this.o00oOOo0();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int o00oOo0O2 = o00oo.this.o00oOo0O(entry.getKey());
                if (o00oOo0O2 < 0) {
                    return false;
                }
                return o00oo0.o00oOo00(o00oo.this.o00oOOoO(o00oOo0O2, 1), entry.getValue());
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return o00oo.o00oOoo0(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int o00oOooO2 = o00oo.this.o00oOooO() - 1; o00oOooO2 >= 0; o00oOooO2--) {
                Object o00oOOoO2 = o00oo.this.o00oOOoO(o00oOooO2, 0);
                Object o00oOOoO3 = o00oo.this.o00oOOoO(o00oOooO2, 1);
                i += (o00oOOoO2 == null ? 0 : o00oOOoO2.hashCode()) ^ (o00oOOoO3 == null ? 0 : o00oOOoO3.hashCode());
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return o00oo.this.o00oOooO() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new o00oOo0O();
        }

        public boolean o00oOOo0(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return o00oo.this.o00oOooO();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public final class o00oOo00 implements Set<K> {
        public o00oOo00() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            o00oo.this.o00oOOo0();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return o00oo.this.o00oOo0O(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return o00oo.o00oOoOo(o00oo.this.o00oOo00(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return o00oo.o00oOoo0(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int o00oOooO2 = o00oo.this.o00oOooO() - 1; o00oOooO2 >= 0; o00oOooO2--) {
                Object o00oOOoO2 = o00oo.this.o00oOOoO(o00oOooO2, 0);
                i += o00oOOoO2 == null ? 0 : o00oOOoO2.hashCode();
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return o00oo.this.o00oOooO() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new o00oOOo0(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int o00oOo0O2 = o00oo.this.o00oOo0O(obj);
            if (o00oOo0O2 >= 0) {
                o00oo.this.o00oOoO(o00oOo0O2);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return o00oo.o00oo0OO(o00oo.this.o00oOo00(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return o00oo.o00oo0O0(o00oo.this.o00oOo00(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return o00oo.this.o00oOooO();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return o00oo.this.o00oo0O(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) o00oo.this.o00oo0Oo(tArr, 0);
        }
    }

    /* loaded from: classes.dex */
    public final class o00oOo0O implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f1697o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public boolean f1698o00oo0Oo = false;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f1696o00oo0O = -1;

        public o00oOo0O() {
            this.f1697o00oo0O0 = o00oo.this.o00oOooO() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.f1698o00oo0Oo) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return o00oo0.o00oOo00(entry.getKey(), o00oo.this.o00oOOoO(this.f1696o00oo0O, 0)) && o00oo0.o00oOo00(entry.getValue(), o00oo.this.o00oOOoO(this.f1696o00oo0O, 1));
                }
                return false;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f1698o00oo0Oo) {
                return (K) o00oo.this.o00oOOoO(this.f1696o00oo0O, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f1698o00oo0Oo) {
                return (V) o00oo.this.o00oOOoO(this.f1696o00oo0O, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1696o00oo0O < this.f1697o00oo0O0;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (this.f1698o00oo0Oo) {
                Object o00oOOoO2 = o00oo.this.o00oOOoO(this.f1696o00oo0O, 0);
                Object o00oOOoO3 = o00oo.this.o00oOOoO(this.f1696o00oo0O, 1);
                return (o00oOOoO2 == null ? 0 : o00oOOoO2.hashCode()) ^ (o00oOOoO3 != null ? o00oOOoO3.hashCode() : 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        /* renamed from: o00oOOo0 */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f1696o00oo0O++;
                this.f1698o00oo0Oo = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f1698o00oo0Oo) {
                throw new IllegalStateException();
            }
            o00oo.this.o00oOoO(this.f1696o00oo0O);
            this.f1696o00oo0O--;
            this.f1697o00oo0O0--;
            this.f1698o00oo0Oo = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f1698o00oo0Oo) {
                return (V) o00oo.this.o00oOoOO(this.f1696o00oo0O, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* loaded from: classes.dex */
    public final class o00oOoO implements Collection<V> {
        public o00oOoO() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            o00oo.this.o00oOOo0();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return o00oo.this.o00oOo0o(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return o00oo.this.o00oOooO() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new o00oOOo0(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int o00oOo0o2 = o00oo.this.o00oOo0o(obj);
            if (o00oOo0o2 >= 0) {
                o00oo.this.o00oOoO(o00oOo0o2);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int o00oOooO2 = o00oo.this.o00oOooO();
            int i = 0;
            boolean z = false;
            while (i < o00oOooO2) {
                if (collection.contains(o00oo.this.o00oOOoO(i, 1))) {
                    o00oo.this.o00oOoO(i);
                    i--;
                    o00oOooO2--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int o00oOooO2 = o00oo.this.o00oOooO();
            int i = 0;
            boolean z = false;
            while (i < o00oOooO2) {
                if (!collection.contains(o00oo.this.o00oOOoO(i, 1))) {
                    o00oo.this.o00oOoO(i);
                    i--;
                    o00oOooO2--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return o00oo.this.o00oOooO();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return o00oo.this.o00oo0O(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) o00oo.this.o00oo0Oo(tArr, 1);
        }
    }

    public static <K, V> boolean o00oOoOo(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean o00oOoo0(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o00oo0O0(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public static <K, V> boolean o00oo0OO(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public abstract void o00oOOo0();

    public abstract Object o00oOOoO(int i, int i2);

    public abstract Map<K, V> o00oOo00();

    public abstract int o00oOo0O(Object obj);

    public abstract int o00oOo0o(Object obj);

    public abstract void o00oOoO(int i);

    public abstract void o00oOoO0(K k, V v);

    public abstract V o00oOoOO(int i, V v);

    public abstract int o00oOooO();

    public Set<Map.Entry<K, V>> o00oOooo() {
        if (this.f1686o00oOOo0 == null) {
            this.f1686o00oOOo0 = new o00oOOoO();
        }
        return this.f1686o00oOOo0;
    }

    public Collection<V> o00oo0() {
        if (this.f1688o00oOo00 == null) {
            this.f1688o00oOo00 = new o00oOoO();
        }
        return this.f1688o00oOo00;
    }

    public Set<K> o00oo00O() {
        if (this.f1687o00oOOoO == null) {
            this.f1687o00oOOoO = new o00oOo00();
        }
        return this.f1687o00oOOoO;
    }

    public Object[] o00oo0O(int i) {
        int o00oOooO2 = o00oOooO();
        Object[] objArr = new Object[o00oOooO2];
        for (int i2 = 0; i2 < o00oOooO2; i2++) {
            objArr[i2] = o00oOOoO(i2, i);
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T[] o00oo0Oo(T[] tArr, int i) {
        int o00oOooO2 = o00oOooO();
        if (tArr.length < o00oOooO2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), o00oOooO2));
        }
        for (int i2 = 0; i2 < o00oOooO2; i2++) {
            tArr[i2] = o00oOOoO(i2, i);
        }
        if (tArr.length > o00oOooO2) {
            tArr[o00oOooO2] = null;
        }
        return tArr;
    }
}
