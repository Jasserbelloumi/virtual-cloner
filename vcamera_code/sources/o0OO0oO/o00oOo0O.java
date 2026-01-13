package o0OO0oO;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOOOO0.o0OOO00({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1747#2,3:154\n1726#2,3:157\n288#2,2:160\n*S KotlinDebug\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n*L\n28#1:154,3\n60#1:157,3\n141#1:160,2\n*E\n"})
@o0OO0o.o0OO00o0(version = "1.1")
/* loaded from: classes3.dex */
public abstract class o00oOo0O<K, V> implements Map<K, V>, o0OOOOO.o00oOOo0 {
    @NotNull

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final o00oOOo0 f13310o00oo0Oo = new o00oOOo0(null);
    @Nullable

    /* renamed from: o00oo0O  reason: collision with root package name */
    public volatile Collection<? extends V> f13311o00oo0O;
    @Nullable

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public volatile Set<? extends K> f13312o00oo0O0;

    @o0OOOOO0.o0OOO00({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0OOOOO0.o0O00 o0o00) {
        }

        public final boolean o00oOOo0(@NotNull Map.Entry<?, ?> entry, @Nullable Object obj) {
            o0OOOOO0.o0ooO.o00oo0O0(entry, "e");
            if (obj instanceof Map.Entry) {
                Map.Entry entry2 = (Map.Entry) obj;
                return o0OOOOO0.o0ooO.o00oOoO0(entry.getKey(), entry2.getKey()) && o0OOOOO0.o0ooO.o00oOoO0(entry.getValue(), entry2.getValue());
            }
            return false;
        }

        public final int o00oOOoO(@NotNull Map.Entry<?, ?> entry) {
            o0OOOOO0.o0ooO.o00oo0O0(entry, "e");
            Object key = entry.getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = entry.getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @NotNull
        public final String o00oOo00(@NotNull Map.Entry<?, ?> entry) {
            o0OOOOO0.o0ooO.o00oo0O0(entry, "e");
            StringBuilder sb = new StringBuilder();
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            return sb.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o00oo0O0<K> {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o00oOo0O<K, V> f13313o00oo0O;

        /* loaded from: classes3.dex */
        public static final class o00oOOo0 implements Iterator<K>, o0OOOOO.o00oOOo0 {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f13314o00oo0O0;

            /* JADX WARN: Multi-variable type inference failed */
            public o00oOOo0(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f13314o00oo0O0 = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f13314o00oo0O0.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return this.f13314o00oo0O0.next().getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOoO(o00oOo0O<K, ? extends V> o00ooo0o2) {
            this.f13313o00oo0O = o00ooo0o2;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public boolean contains(Object obj) {
            return this.f13313o00oo0O.containsKey(obj);
        }

        @Override // o0OO0oO.o00oOOo0
        public int getSize() {
            return this.f13313o00oo0O.size();
        }

        @Override // o0OO0oO.o00oo0O0, o0OO0oO.o00oOOo0, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<K> iterator() {
            return new o00oOOo0(this.f13313o00oo0O.entrySet().iterator());
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0OOOOO0.o0O0OO implements o0OOOO.o00oo<Map.Entry<? extends K, ? extends V>, CharSequence> {
        public final /* synthetic */ o00oOo0O<K, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOo00(o00oOo0O<K, ? extends V> o00ooo0o2) {
            super(1);
            this.this$0 = o00ooo0o2;
        }

        @NotNull
        public final CharSequence invoke(@NotNull Map.Entry<? extends K, ? extends V> entry) {
            o0OOOOO0.o0ooO.o00oo0O0(entry, "it");
            return this.this$0.o00oOoOo(entry);
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ CharSequence invoke(Object obj) {
            return invoke((Map.Entry) ((Map.Entry) obj));
        }
    }

    /* renamed from: o0OO0oO.o00oOo0O$o00oOo0O  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0167o00oOo0O extends o0OO0oO.o00oOOo0<V> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o00oOo0O<K, V> f13315o00oo0O0;

        /* renamed from: o0OO0oO.o00oOo0O$o00oOo0O$o00oOOo0 */
        /* loaded from: classes3.dex */
        public static final class o00oOOo0 implements Iterator<V>, o0OOOOO.o00oOOo0 {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f13316o00oo0O0;

            /* JADX WARN: Multi-variable type inference failed */
            public o00oOOo0(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f13316o00oo0O0 = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f13316o00oo0O0.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return this.f13316o00oo0O0.next().getValue();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C0167o00oOo0O(o00oOo0O<K, ? extends V> o00ooo0o2) {
            this.f13315o00oo0O0 = o00ooo0o2;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public boolean contains(Object obj) {
            return this.f13315o00oo0O0.containsValue(obj);
        }

        @Override // o0OO0oO.o00oOOo0
        public int getSize() {
            return this.f13315o00oo0O0.size();
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<V> iterator() {
            return new o00oOOo0(this.f13315o00oo0O0.entrySet().iterator());
        }
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return o00oOoO(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> entrySet = entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (o0OOOOO0.o0ooO.o00oOoO0(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return o00oOo00();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            Set<Map.Entry<K, V>> entrySet = map.entrySet();
            if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
                return true;
            }
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                if (!o00oOOoO((Map.Entry) it.next())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        Map.Entry<K, V> o00oOoO2 = o00oOoO(obj);
        if (o00oOoO2 != null) {
            return o00oOoO2.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return o00oOooO();
    }

    public final boolean o00oOOoO(@Nullable Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        o0OOOOO0.o0ooO.o00oo0(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        V v = get(key);
        if (o0OOOOO0.o0ooO.o00oOoO0(value, v)) {
            if (v == null) {
                o0OOOOO0.o0ooO.o00oo0(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
                return containsKey(key);
            }
            return true;
        }
        return false;
    }

    public abstract Set o00oOo00();

    public int o00oOo0O() {
        return entrySet().size();
    }

    public final Map.Entry<K, V> o00oOoO(K k) {
        Object obj;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (o0OOOOO0.o0ooO.o00oOoO0(((Map.Entry) obj).getKey(), k)) {
                break;
            }
        }
        return (Map.Entry) obj;
    }

    @NotNull
    public Collection<V> o00oOoO0() {
        if (this.f13311o00oo0O == null) {
            this.f13311o00oo0O = new C0167o00oOo0O(this);
        }
        Collection collection = (Collection<? extends V>) this.f13311o00oo0O;
        o0OOOOO0.o0ooO.o00oo00O(collection);
        return collection;
    }

    public final String o00oOoOO(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    public final String o00oOoOo(Map.Entry<? extends K, ? extends V> entry) {
        return o00oOoOO(entry.getKey()) + '=' + o00oOoOO(entry.getValue());
    }

    @NotNull
    public Set<K> o00oOooO() {
        if (this.f13312o00oo0O0 == null) {
            this.f13312o00oo0O0 = new o00oOOoO(this);
        }
        Set set = (Set<? extends K>) this.f13312o00oo0O0;
        o0OOOOO0.o0ooO.o00oo00O(set);
        return set;
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
        return o00oOo0O();
    }

    @NotNull
    public String toString() {
        return o0O0oo0o.o0OOo0o0(entrySet(), ", ", "{", "}", 0, null, new o00oOo00(this), 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return o00oOoO0();
    }
}
