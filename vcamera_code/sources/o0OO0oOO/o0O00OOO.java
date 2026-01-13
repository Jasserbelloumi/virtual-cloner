package o0OO0oOO;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o00oooOo.oOO0O000;
import o0OO0oO.o0O00000;
import o0OO0oO.o0O0o0;
import o0OOOOO.o00oo0;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import o0OOOo0o.o0O0O0Oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class o0O00OOO<K, V> implements Map<K, V>, Serializable, o00oo0 {
    @NotNull
    private static final o00oOOo0 Companion = new o00oOOo0(null);
    private static final int INITIAL_CAPACITY = 8;
    private static final int INITIAL_MAX_PROBE_DISTANCE = 2;
    private static final int MAGIC = -1640531527;
    private static final int TOMBSTONE = -1;
    @Nullable
    private o0oO0Ooo<K, V> entriesView;
    @NotNull
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    @NotNull
    private K[] keysArray;
    @Nullable
    private o0O00o00<K> keysView;
    private int length;
    private int maxProbeDistance;
    @NotNull
    private int[] presenceArray;
    private int size;
    @Nullable
    private V[] valuesArray;
    @Nullable
    private o0O00oO0<V> valuesView;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        public final int o00oOo00(int i) {
            if (i < 1) {
                i = 1;
            }
            return Integer.highestOneBit(i * 3);
        }

        public final int o00oOooO(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOOoO<K, V> extends o00oOo0O<K, V> implements Iterator<Map.Entry<K, V>>, o0OOOOO.o00oOo0O {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(@NotNull o0O00OOO<K, V> o0o00ooo) {
            super(o0o00ooo);
            o0ooO.o00oo0O0(o0o00ooo, "map");
        }

        @Override // java.util.Iterator
        @NotNull
        /* renamed from: o00oOoO */
        public o00oOo00<K, V> next() {
            if (this.f13393o00oo0O < ((o0O00OOO) this.f13394o00oo0O0).length) {
                int i = this.f13393o00oo0O;
                this.f13393o00oo0O = i + 1;
                this.f13395o00oo0Oo = i;
                o00oOo00<K, V> o00ooo002 = new o00oOo00<>(this.f13394o00oo0O0, i);
                o00oOooO();
                return o00ooo002;
            }
            throw new NoSuchElementException();
        }

        public final void o00oOoOO(@NotNull StringBuilder sb) {
            o0ooO.o00oo0O0(sb, "sb");
            if (this.f13393o00oo0O >= ((o0O00OOO) this.f13394o00oo0O0).length) {
                throw new NoSuchElementException();
            }
            int i = this.f13393o00oo0O;
            this.f13393o00oo0O = i + 1;
            this.f13395o00oo0Oo = i;
            Object obj = ((o0O00OOO) this.f13394o00oo0O0).keysArray[this.f13395o00oo0Oo];
            if (o0ooO.o00oOoO0(obj, this.f13394o00oo0O0)) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = ((o0O00OOO) this.f13394o00oo0O0).valuesArray;
            o0ooO.o00oo00O(objArr);
            Object obj2 = objArr[this.f13395o00oo0Oo];
            if (o0ooO.o00oOoO0(obj2, this.f13394o00oo0O0)) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            o00oOooO();
        }

        public final int o00oOoOo() {
            if (this.f13393o00oo0O < ((o0O00OOO) this.f13394o00oo0O0).length) {
                int i = this.f13393o00oo0O;
                this.f13393o00oo0O = i + 1;
                this.f13395o00oo0Oo = i;
                Object obj = ((o0O00OOO) this.f13394o00oo0O0).keysArray[this.f13395o00oo0Oo];
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object[] objArr = ((o0O00OOO) this.f13394o00oo0O0).valuesArray;
                o0ooO.o00oo00O(objArr);
                Object obj2 = objArr[this.f13395o00oo0Oo];
                int hashCode2 = hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
                o00oOooO();
                return hashCode2;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOo00<K, V> implements Map.Entry<K, V>, o00oo0.o00oOOo0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final int f13391o00oo0O;
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o0O00OOO<K, V> f13392o00oo0O0;

        public o00oOo00(@NotNull o0O00OOO<K, V> o0o00ooo, int i) {
            o0ooO.o00oo0O0(o0o00ooo, "map");
            this.f13392o00oo0O0 = o0o00ooo;
            this.f13391o00oo0O = i;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@Nullable Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (o0ooO.o00oOoO0(entry.getKey(), getKey()) && o0ooO.o00oOoO0(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((o0O00OOO) this.f13392o00oo0O0).keysArray[this.f13391o00oo0O];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((o0O00OOO) this.f13392o00oo0O0).valuesArray;
            o0ooO.o00oo00O(objArr);
            return (V) objArr[this.f13391o00oo0O];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            this.f13392o00oo0O0.checkIsMutable$kotlin_stdlib();
            Object[] allocateValuesArray = this.f13392o00oo0O0.allocateValuesArray();
            int i = this.f13391o00oo0O;
            V v2 = (V) allocateValuesArray[i];
            allocateValuesArray[i] = v;
            return v2;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    @o0OOO00({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,694:1\n1#2:695\n*E\n"})
    /* loaded from: classes3.dex */
    public static class o00oOo0O<K, V> {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f13393o00oo0O;
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o0O00OOO<K, V> f13394o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public int f13395o00oo0Oo;

        public o00oOo0O(@NotNull o0O00OOO<K, V> o0o00ooo) {
            o0ooO.o00oo0O0(o0o00ooo, "map");
            this.f13394o00oo0O0 = o0o00ooo;
            this.f13395o00oo0Oo = -1;
            o00oOooO();
        }

        public final boolean hasNext() {
            return this.f13393o00oo0O < ((o0O00OOO) this.f13394o00oo0O0).length;
        }

        public final int o00oOOo0() {
            return this.f13393o00oo0O;
        }

        public final int o00oOOoO() {
            return this.f13395o00oo0Oo;
        }

        @NotNull
        public final o0O00OOO<K, V> o00oOo00() {
            return this.f13394o00oo0O0;
        }

        public final void o00oOo0O(int i) {
            this.f13393o00oo0O = i;
        }

        public final void o00oOoO0(int i) {
            this.f13395o00oo0Oo = i;
        }

        public final void o00oOooO() {
            while (this.f13393o00oo0O < ((o0O00OOO) this.f13394o00oo0O0).length) {
                int[] iArr = ((o0O00OOO) this.f13394o00oo0O0).presenceArray;
                int i = this.f13393o00oo0O;
                if (iArr[i] >= 0) {
                    return;
                }
                this.f13393o00oo0O = i + 1;
            }
        }

        public final void remove() {
            if (!(this.f13395o00oo0Oo != -1)) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            this.f13394o00oo0O0.checkIsMutable$kotlin_stdlib();
            this.f13394o00oo0O0.removeKeyAt(this.f13395o00oo0Oo);
            this.f13395o00oo0Oo = -1;
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOoO<K, V> extends o00oOo0O<K, V> implements Iterator<K>, o0OOOOO.o00oOo0O {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOoO(@NotNull o0O00OOO<K, V> o0o00ooo) {
            super(o0o00ooo);
            o0ooO.o00oo0O0(o0o00ooo, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            if (this.f13393o00oo0O < ((o0O00OOO) this.f13394o00oo0O0).length) {
                int i = this.f13393o00oo0O;
                this.f13393o00oo0O = i + 1;
                this.f13395o00oo0Oo = i;
                K k = (K) ((o0O00OOO) this.f13394o00oo0O0).keysArray[this.f13395o00oo0Oo];
                o00oOooO();
                return k;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oo00O<K, V> extends o00oOo0O<K, V> implements Iterator<V>, o0OOOOO.o00oOo0O {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oo00O(@NotNull o0O00OOO<K, V> o0o00ooo) {
            super(o0o00ooo);
            o0ooO.o00oo0O0(o0o00ooo, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            if (this.f13393o00oo0O < ((o0O00OOO) this.f13394o00oo0O0).length) {
                int i = this.f13393o00oo0O;
                this.f13393o00oo0O = i + 1;
                this.f13395o00oo0Oo = i;
                Object[] objArr = ((o0O00OOO) this.f13394o00oo0O0).valuesArray;
                o0ooO.o00oo00O(objArr);
                V v = (V) objArr[this.f13395o00oo0Oo];
                o00oOooO();
                return v;
            }
            throw new NoSuchElementException();
        }
    }

    public o0O00OOO() {
        this(8);
    }

    public o0O00OOO(int i) {
        this(o0O00OO.o00oOooO(i), null, new int[i], new int[Companion.o00oOo00(i)], 2, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] allocateValuesArray() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) o0O00OO.o00oOooO(getCapacity$kotlin_stdlib());
        this.valuesArray = vArr2;
        return vArr2;
    }

    private final void compact() {
        int i;
        V[] vArr = this.valuesArray;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.length;
            if (i2 >= i) {
                break;
            }
            if (this.presenceArray[i2] >= 0) {
                K[] kArr = this.keysArray;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                i3++;
            }
            i2++;
        }
        o0O00OO.o00oOoO0(this.keysArray, i3, i);
        if (vArr != null) {
            o0O00OO.o00oOoO0(vArr, i3, this.length);
        }
        this.length = i3;
    }

    private final boolean contentEquals(Map<?, ?> map) {
        return size() == map.size() && containsAllEntries$kotlin_stdlib(map.entrySet());
    }

    private final void ensureCapacity(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        if (i > getCapacity$kotlin_stdlib()) {
            int capacity$kotlin_stdlib = (getCapacity$kotlin_stdlib() * 3) / 2;
            if (i <= capacity$kotlin_stdlib) {
                i = capacity$kotlin_stdlib;
            }
            this.keysArray = (K[]) o0O00OO.o00oOo0O(this.keysArray, i);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) o0O00OO.o00oOo0O(vArr, i) : null;
            int[] copyOf = Arrays.copyOf(this.presenceArray, i);
            o0ooO.o00oo0OO(copyOf, "copyOf(this, newSize)");
            this.presenceArray = copyOf;
            int o00oOo002 = Companion.o00oOo00(i);
            if (o00oOo002 > getHashSize()) {
                rehash(o00oOo002);
            }
        }
    }

    private final void ensureExtraCapacity(int i) {
        if (shouldCompact(i)) {
            rehash(getHashSize());
        } else {
            ensureCapacity(this.length + i);
        }
    }

    private final int findKey(K k) {
        int hash = hash(k);
        int i = this.maxProbeDistance;
        while (true) {
            int i2 = this.hashArray[hash];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (o0ooO.o00oOoO0(this.keysArray[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            hash = hash == 0 ? getHashSize() - 1 : hash - 1;
        }
    }

    private final int findValue(V v) {
        int i = this.length;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.presenceArray[i] >= 0) {
                V[] vArr = this.valuesArray;
                o0ooO.o00oo00O(vArr);
                if (o0ooO.o00oOoO0(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    private final int getHashSize() {
        return this.hashArray.length;
    }

    private final int hash(K k) {
        return ((k != null ? k.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
    }

    private final boolean putAllEntries(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        ensureExtraCapacity(collection.size());
        for (Map.Entry<? extends K, ? extends V> entry : collection) {
            if (putEntry(entry)) {
                z = true;
            }
        }
        return z;
    }

    private final boolean putEntry(Map.Entry<? extends K, ? extends V> entry) {
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
        V[] allocateValuesArray = allocateValuesArray();
        if (addKey$kotlin_stdlib >= 0) {
            allocateValuesArray[addKey$kotlin_stdlib] = entry.getValue();
            return true;
        }
        int i = (-addKey$kotlin_stdlib) - 1;
        if (o0ooO.o00oOoO0(entry.getValue(), allocateValuesArray[i])) {
            return false;
        }
        allocateValuesArray[i] = entry.getValue();
        return true;
    }

    private final boolean putRehash(int i) {
        int hash = hash(this.keysArray[i]);
        int i2 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[hash] == 0) {
                iArr[hash] = i + 1;
                this.presenceArray[i] = hash;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            hash = hash == 0 ? getHashSize() - 1 : hash - 1;
        }
    }

    private final void rehash(int i) {
        if (this.length > size()) {
            compact();
        }
        int i2 = 0;
        if (i != getHashSize()) {
            this.hashArray = new int[i];
            this.hashShift = Companion.o00oOooO(i);
        } else {
            o0O00000.o0OOoooO(this.hashArray, 0, 0, getHashSize());
        }
        while (i2 < this.length) {
            int i3 = i2 + 1;
            if (!putRehash(i2)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i2 = i3;
        }
    }

    private final void removeHashAt(int i) {
        int i2 = this.maxProbeDistance * 2;
        int hashSize = getHashSize() / 2;
        if (i2 > hashSize) {
            i2 = hashSize;
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = i;
        do {
            i = i == 0 ? getHashSize() - 1 : i - 1;
            i4++;
            if (i4 > this.maxProbeDistance) {
                this.hashArray[i5] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i6 = iArr[i];
            if (i6 == 0) {
                iArr[i5] = 0;
                return;
            }
            if (i6 < 0) {
                iArr[i5] = -1;
            } else {
                int i7 = i6 - 1;
                if (((hash(this.keysArray[i7]) - i) & (getHashSize() - 1)) >= i4) {
                    this.hashArray[i5] = i6;
                    this.presenceArray[i7] = i5;
                }
                i3--;
            }
            i5 = i;
            i4 = 0;
            i3--;
        } while (i3 >= 0);
        this.hashArray[i5] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeKeyAt(int i) {
        o0O00OO.o00oOo0o(this.keysArray, i);
        removeHashAt(this.presenceArray[i]);
        this.presenceArray[i] = -1;
        this.size = size() - 1;
    }

    private final boolean shouldCompact(int i) {
        int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
        int i2 = this.length;
        int i3 = capacity$kotlin_stdlib - i2;
        int size = i2 - size();
        return i3 < i && i3 + size >= i && size >= getCapacity$kotlin_stdlib() / 4;
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new o0oO0O0o(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int addKey$kotlin_stdlib(K k) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int hash = hash(k);
            int i = this.maxProbeDistance * 2;
            int hashSize = getHashSize() / 2;
            if (i > hashSize) {
                i = hashSize;
            }
            int i2 = 0;
            while (true) {
                int i3 = this.hashArray[hash];
                if (i3 <= 0) {
                    if (this.length < getCapacity$kotlin_stdlib()) {
                        int i4 = this.length;
                        int i5 = i4 + 1;
                        this.length = i5;
                        this.keysArray[i4] = k;
                        this.presenceArray[i4] = hash;
                        this.hashArray[hash] = i5;
                        this.size = size() + 1;
                        if (i2 > this.maxProbeDistance) {
                            this.maxProbeDistance = i2;
                        }
                        return i4;
                    }
                    ensureExtraCapacity(1);
                } else if (o0ooO.o00oOoO0(this.keysArray[i3 - 1], k)) {
                    return -i3;
                } else {
                    i2++;
                    if (i2 > i) {
                        rehash(getHashSize() * 2);
                        break;
                    }
                    hash = hash == 0 ? getHashSize() - 1 : hash - 1;
                }
            }
        }
    }

    @NotNull
    public final Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        return this;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public void clear() {
        checkIsMutable$kotlin_stdlib();
        o0O0o0 it = new o0O0O0Oo(0, this.length - 1).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            int[] iArr = this.presenceArray;
            int i = iArr[nextInt];
            if (i >= 0) {
                this.hashArray[i] = 0;
                iArr[nextInt] = -1;
            }
        }
        o0O00OO.o00oOoO0(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            o0O00OO.o00oOoO0(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
    }

    public final boolean containsAllEntries$kotlin_stdlib(@NotNull Collection<?> collection) {
        o0ooO.o00oo0O0(collection, oOO0O000.f9796o00oOOoO);
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        o0ooO.o00oo0O0(entry, "entry");
        int findKey = findKey(entry.getKey());
        if (findKey < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        o0ooO.o00oo00O(vArr);
        return o0ooO.o00oOoO0(vArr[findKey], entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return findKey(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return findValue(obj) >= 0;
    }

    @NotNull
    public final o00oOOoO<K, V> entriesIterator$kotlin_stdlib() {
        return new o00oOOoO<>(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        return obj == this || ((obj instanceof Map) && contentEquals((Map) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        int findKey = findKey(obj);
        if (findKey < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        o0ooO.o00oo00O(vArr);
        return vArr[findKey];
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.keysArray.length;
    }

    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        o0oO0Ooo<K, V> o0oo0ooo = this.entriesView;
        if (o0oo0ooo == null) {
            o0oO0Ooo<K, V> o0oo0ooo2 = new o0oO0Ooo<>(this);
            this.entriesView = o0oo0ooo2;
            return o0oo0ooo2;
        }
        return o0oo0ooo;
    }

    @NotNull
    public Set<K> getKeys() {
        o0O00o00<K> o0o00o00 = this.keysView;
        if (o0o00o00 == null) {
            o0O00o00<K> o0o00o002 = new o0O00o00<>(this);
            this.keysView = o0o00o002;
            return o0o00o002;
        }
        return o0o00o00;
    }

    public int getSize() {
        return this.size;
    }

    @NotNull
    public Collection<V> getValues() {
        o0O00oO0<V> o0o00oo0 = this.valuesView;
        if (o0o00oo0 == null) {
            o0O00oO0<V> o0o00oo02 = new o0O00oO0<>(this);
            this.valuesView = o0o00oo02;
            return o0o00oo02;
        }
        return o0o00oo0;
    }

    @Override // java.util.Map
    public int hashCode() {
        o00oOOoO<K, V> entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            i += entriesIterator$kotlin_stdlib.o00oOoOo();
        }
        return i;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isReadOnly$kotlin_stdlib() {
        return this.isReadOnly;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @NotNull
    public final o00oOoO<K, V> keysIterator$kotlin_stdlib() {
        return new o00oOoO<>(this);
    }

    @Override // java.util.Map
    @Nullable
    public V put(K k, V v) {
        checkIsMutable$kotlin_stdlib();
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(k);
        V[] allocateValuesArray = allocateValuesArray();
        if (addKey$kotlin_stdlib >= 0) {
            allocateValuesArray[addKey$kotlin_stdlib] = v;
            return null;
        }
        int i = (-addKey$kotlin_stdlib) - 1;
        V v2 = allocateValuesArray[i];
        allocateValuesArray[i] = v;
        return v2;
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> map) {
        o0ooO.o00oo0O0(map, "from");
        checkIsMutable$kotlin_stdlib();
        putAllEntries(map.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V remove(Object obj) {
        int removeKey$kotlin_stdlib = removeKey$kotlin_stdlib(obj);
        if (removeKey$kotlin_stdlib < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        o0ooO.o00oo00O(vArr);
        V v = vArr[removeKey$kotlin_stdlib];
        o0O00OO.o00oOo0o(vArr, removeKey$kotlin_stdlib);
        return v;
    }

    public final boolean removeEntry$kotlin_stdlib(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        o0ooO.o00oo0O0(entry, "entry");
        checkIsMutable$kotlin_stdlib();
        int findKey = findKey(entry.getKey());
        if (findKey < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        o0ooO.o00oo00O(vArr);
        if (o0ooO.o00oOoO0(vArr[findKey], entry.getValue())) {
            removeKeyAt(findKey);
            return true;
        }
        return false;
    }

    public final int removeKey$kotlin_stdlib(K k) {
        checkIsMutable$kotlin_stdlib();
        int findKey = findKey(k);
        if (findKey < 0) {
            return -1;
        }
        removeKeyAt(findKey);
        return findKey;
    }

    public final boolean removeValue$kotlin_stdlib(V v) {
        checkIsMutable$kotlin_stdlib();
        int findValue = findValue(v);
        if (findValue < 0) {
            return false;
        }
        removeKeyAt(findValue);
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        o00oOOoO<K, V> entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            entriesIterator$kotlin_stdlib.o00oOoOO(sb);
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        o0ooO.o00oo0OO(sb2, "sb.toString()");
        return sb2;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    @NotNull
    public final o00oo00O<K, V> valuesIterator$kotlin_stdlib() {
        return new o00oo00O<>(this);
    }

    private o0O00OOO(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i;
        this.length = i2;
        this.hashShift = Companion.o00oOooO(getHashSize());
    }
}
