package o00oo00O;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00oOOoO<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public o00oOo00<K, V> f7263o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o00oOo00<K, V> f7264o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final WeakHashMap<o00oo00O<K, V>, Boolean> f7265o00oo0Oo = new WeakHashMap<>();

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f7266o00oo0o0 = 0;

    /* loaded from: classes.dex */
    public static class o00oOOo0<K, V> extends o00oOoO<K, V> {
        public o00oOOo0(o00oOo00<K, V> o00ooo002, o00oOo00<K, V> o00ooo003) {
            super(o00ooo002, o00ooo003);
        }

        @Override // o00oo00O.o00oOOoO.o00oOoO
        public o00oOo00<K, V> o00oOOoO(o00oOo00<K, V> o00ooo002) {
            return o00ooo002.f7270o00oo0o0;
        }

        @Override // o00oo00O.o00oOOoO.o00oOoO
        public o00oOo00<K, V> o00oOo00(o00oOo00<K, V> o00ooo002) {
            return o00ooo002.f7269o00oo0Oo;
        }
    }

    /* renamed from: o00oo00O.o00oOOoO$o00oOOoO  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0104o00oOOoO<K, V> extends o00oOoO<K, V> {
        public C0104o00oOOoO(o00oOo00<K, V> o00ooo002, o00oOo00<K, V> o00ooo003) {
            super(o00ooo002, o00ooo003);
        }

        @Override // o00oo00O.o00oOOoO.o00oOoO
        public o00oOo00<K, V> o00oOOoO(o00oOo00<K, V> o00ooo002) {
            return o00ooo002.f7269o00oo0Oo;
        }

        @Override // o00oo00O.o00oOOoO.o00oOoO
        public o00oOo00<K, V> o00oOo00(o00oOo00<K, V> o00ooo002) {
            return o00ooo002.f7270o00oo0o0;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00<K, V> implements Map.Entry<K, V> {
        @oo0oO0

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final V f7267o00oo0O;
        @oo0oO0

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final K f7268o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public o00oOo00<K, V> f7269o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public o00oOo00<K, V> f7270o00oo0o0;

        public o00oOo00(@oo0oO0 K k, @oo0oO0 V v) {
            this.f7268o00oo0O0 = k;
            this.f7267o00oo0O = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof o00oOo00) {
                o00oOo00 o00ooo002 = (o00oOo00) obj;
                return this.f7268o00oo0O0.equals(o00ooo002.f7268o00oo0O0) && this.f7267o00oo0O.equals(o00ooo002.f7267o00oo0O);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        @oo0oO0
        public K getKey() {
            return this.f7268o00oo0O0;
        }

        @Override // java.util.Map.Entry
        @oo0oO0
        public V getValue() {
            return this.f7267o00oo0O;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f7268o00oo0O0.hashCode() ^ this.f7267o00oo0O.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f7268o00oo0O0 + "=" + this.f7267o00oo0O;
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public class o00oOo0O extends o00oo00O<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public boolean f7271o00oo0O = true;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public o00oOo00<K, V> f7272o00oo0O0;

        public o00oOo0O() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f7271o00oo0O) {
                return o00oOOoO.this.f7264o00oo0O0 != null;
            }
            o00oOo00<K, V> o00ooo002 = this.f7272o00oo0O0;
            return (o00ooo002 == null || o00ooo002.f7269o00oo0Oo == null) ? false : true;
        }

        @Override // o00oo00O.o00oOOoO.o00oo00O
        public void o00oOOo0(@oo0oO0 o00oOo00<K, V> o00ooo002) {
            o00oOo00<K, V> o00ooo003 = this.f7272o00oo0O0;
            if (o00ooo002 == o00ooo003) {
                o00oOo00<K, V> o00ooo004 = o00ooo003.f7270o00oo0o0;
                this.f7272o00oo0O0 = o00ooo004;
                this.f7271o00oo0O = o00ooo004 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: o00oOOoO */
        public Map.Entry<K, V> next() {
            o00oOo00<K, V> o00ooo002;
            if (this.f7271o00oo0O) {
                this.f7271o00oo0O = false;
                o00ooo002 = o00oOOoO.this.f7264o00oo0O0;
            } else {
                o00oOo00<K, V> o00ooo003 = this.f7272o00oo0O0;
                o00ooo002 = o00ooo003 != null ? o00ooo003.f7269o00oo0Oo : null;
            }
            this.f7272o00oo0O0 = o00ooo002;
            return this.f7272o00oo0O0;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOoO<K, V> extends o00oo00O<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public o00oOo00<K, V> f7274o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public o00oOo00<K, V> f7275o00oo0O0;

        public o00oOoO(o00oOo00<K, V> o00ooo002, o00oOo00<K, V> o00ooo003) {
            this.f7275o00oo0O0 = o00ooo003;
            this.f7274o00oo0O = o00ooo002;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7274o00oo0O != null;
        }

        @Override // o00oo00O.o00oOOoO.o00oo00O
        public void o00oOOo0(@oo0oO0 o00oOo00<K, V> o00ooo002) {
            if (this.f7275o00oo0O0 == o00ooo002 && o00ooo002 == this.f7274o00oo0O) {
                this.f7274o00oo0O = null;
                this.f7275o00oo0O0 = null;
            }
            o00oOo00<K, V> o00ooo003 = this.f7275o00oo0O0;
            if (o00ooo003 == o00ooo002) {
                this.f7275o00oo0O0 = o00oOOoO(o00ooo003);
            }
            if (this.f7274o00oo0O == o00ooo002) {
                this.f7274o00oo0O = o00oOo0O();
            }
        }

        public abstract o00oOo00<K, V> o00oOOoO(o00oOo00<K, V> o00ooo002);

        public abstract o00oOo00<K, V> o00oOo00(o00oOo00<K, V> o00ooo002);

        public final o00oOo00<K, V> o00oOo0O() {
            o00oOo00<K, V> o00ooo002 = this.f7274o00oo0O;
            o00oOo00<K, V> o00ooo003 = this.f7275o00oo0O0;
            if (o00ooo002 == o00ooo003 || o00ooo003 == null) {
                return null;
            }
            return o00oOo00(o00ooo002);
        }

        @Override // java.util.Iterator
        /* renamed from: o00oOooO */
        public Map.Entry<K, V> next() {
            o00oOo00<K, V> o00ooo002 = this.f7274o00oo0O;
            this.f7274o00oo0O = o00oOo0O();
            return o00ooo002;
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static abstract class o00oo00O<K, V> {
        public abstract void o00oOOo0(@oo0oO0 o00oOo00<K, V> o00ooo002);
    }

    @oo0oO0
    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0104o00oOOoO c0104o00oOOoO = new C0104o00oOOoO(this.f7263o00oo0O, this.f7264o00oo0O0);
        this.f7265o00oo0Oo.put(c0104o00oOOoO, Boolean.FALSE);
        return c0104o00oOOoO;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00oOOoO) {
            o00oOOoO o00ooooo2 = (o00oOOoO) obj;
            if (size() != o00ooooo2.size()) {
                return false;
            }
            Iterator<Map.Entry<K, V>> it = iterator();
            Iterator<Map.Entry<K, V>> it2 = o00ooooo2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Map.Entry<K, V> next = it.next();
                Map.Entry<K, V> next2 = it2.next();
                if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                    return false;
                }
            }
            return (it.hasNext() || it2.hasNext()) ? false : true;
        }
        return false;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    @oo0oO0
    public Iterator<Map.Entry<K, V>> iterator() {
        o00oOOo0 o00oooo02 = new o00oOOo0(this.f7264o00oo0O0, this.f7263o00oo0O);
        this.f7265o00oo0Oo.put(o00oooo02, Boolean.FALSE);
        return o00oooo02;
    }

    @o0OO00OO
    public Map.Entry<K, V> o00oOOo0() {
        return this.f7264o00oo0O0;
    }

    @o0OO00OO
    public o00oOo00<K, V> o00oOOoO(K k) {
        o00oOo00<K, V> o00ooo002 = this.f7264o00oo0O0;
        while (o00ooo002 != null && !o00ooo002.f7268o00oo0O0.equals(k)) {
            o00ooo002 = o00ooo002.f7269o00oo0Oo;
        }
        return o00ooo002;
    }

    @oo0oO0
    public o00oOOoO<K, V>.o00oOo0O o00oOo00() {
        o00oOOoO<K, V>.o00oOo0O o00ooo0o2 = new o00oOo0O();
        this.f7265o00oo0Oo.put(o00ooo0o2, Boolean.FALSE);
        return o00ooo0o2;
    }

    public o00oOo00<K, V> o00oOo0O(@oo0oO0 K k, @oo0oO0 V v) {
        o00oOo00<K, V> o00ooo002 = new o00oOo00<>(k, v);
        this.f7266o00oo0o0++;
        o00oOo00<K, V> o00ooo003 = this.f7263o00oo0O;
        if (o00ooo003 == null) {
            this.f7264o00oo0O0 = o00ooo002;
        } else {
            o00ooo003.f7269o00oo0Oo = o00ooo002;
            o00ooo002.f7270o00oo0o0 = o00ooo003;
        }
        this.f7263o00oo0O = o00ooo002;
        return o00ooo002;
    }

    public V o00oOo0o(@oo0oO0 K k, @oo0oO0 V v) {
        o00oOo00<K, V> o00oOOoO2 = o00oOOoO(k);
        if (o00oOOoO2 != null) {
            return o00oOOoO2.f7267o00oo0O;
        }
        o00oOo0O(k, v);
        return null;
    }

    public V o00oOoO0(@oo0oO0 K k) {
        o00oOo00<K, V> o00oOOoO2 = o00oOOoO(k);
        if (o00oOOoO2 == null) {
            return null;
        }
        this.f7266o00oo0o0--;
        if (!this.f7265o00oo0Oo.isEmpty()) {
            for (o00oo00O<K, V> o00oo00o : this.f7265o00oo0Oo.keySet()) {
                o00oo00o.o00oOOo0(o00oOOoO2);
            }
        }
        o00oOo00<K, V> o00ooo002 = o00oOOoO2.f7270o00oo0o0;
        o00oOo00<K, V> o00ooo003 = o00oOOoO2.f7269o00oo0Oo;
        if (o00ooo002 != null) {
            o00ooo002.f7269o00oo0Oo = o00ooo003;
        } else {
            this.f7264o00oo0O0 = o00ooo003;
        }
        o00oOo00<K, V> o00ooo004 = o00oOOoO2.f7269o00oo0Oo;
        if (o00ooo004 != null) {
            o00ooo004.f7270o00oo0o0 = o00ooo002;
        } else {
            this.f7263o00oo0O = o00ooo002;
        }
        o00oOOoO2.f7269o00oo0Oo = null;
        o00oOOoO2.f7270o00oo0o0 = null;
        return o00oOOoO2.f7267o00oo0O;
    }

    @o0OO00OO
    public Map.Entry<K, V> o00oOooO() {
        return this.f7263o00oo0O;
    }

    public int size() {
        return this.f7266o00oo0o0;
    }

    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            o00oOOo02.append(it.next().toString());
            if (it.hasNext()) {
                o00oOOo02.append(", ");
            }
        }
        o00oOOo02.append("]");
        return o00oOOo02.toString();
    }
}
