package o0OO0oOO;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import o0OO0oO.o00oOo00;
import o0OO0oO.o00oo00O;
import o0OO0oO.o0O00000;
import o0OO0oO.o0O0o;
import o0OOOOO.o00oOoO;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class o0O00O<E> extends o00oo00O<E> implements List<E>, RandomAccess, Serializable, o00oOoO {
    @NotNull
    private E[] array;
    @Nullable
    private final o0O00O<E> backing;
    private boolean isReadOnly;
    private int length;
    private int offset;
    @Nullable
    private final o0O00O<E> root;

    @o0OOO00({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<E> implements ListIterator<E>, o0OOOOO.o00oo00O {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f13388o00oo0O;
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o0O00O<E> f13389o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public int f13390o00oo0Oo;

        public o00oOOo0(@NotNull o0O00O<E> o0o00o, int i) {
            o0ooO.o00oo0O0(o0o00o, "list");
            this.f13389o00oo0O0 = o0o00o;
            this.f13388o00oo0O = i;
            this.f13390o00oo0Oo = -1;
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            o0O00O<E> o0o00o = this.f13389o00oo0O0;
            int i = this.f13388o00oo0O;
            this.f13388o00oo0O = i + 1;
            o0o00o.add(i, e);
            this.f13390o00oo0Oo = -1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f13388o00oo0O < ((o0O00O) this.f13389o00oo0O0).length;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f13388o00oo0O > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            if (this.f13388o00oo0O < ((o0O00O) this.f13389o00oo0O0).length) {
                int i = this.f13388o00oo0O;
                this.f13388o00oo0O = i + 1;
                this.f13390o00oo0Oo = i;
                return (E) ((o0O00O) this.f13389o00oo0O0).array[((o0O00O) this.f13389o00oo0O0).offset + this.f13390o00oo0Oo];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f13388o00oo0O;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i = this.f13388o00oo0O;
            if (i > 0) {
                int i2 = i - 1;
                this.f13388o00oo0O = i2;
                this.f13390o00oo0Oo = i2;
                return (E) ((o0O00O) this.f13389o00oo0O0).array[((o0O00O) this.f13389o00oo0O0).offset + this.f13390o00oo0Oo];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f13388o00oo0O - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i = this.f13390o00oo0Oo;
            if (!(i != -1)) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.f13389o00oo0O0.remove(i);
            this.f13388o00oo0O = this.f13390o00oo0Oo;
            this.f13390o00oo0Oo = -1;
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            int i = this.f13390o00oo0Oo;
            if (!(i != -1)) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.f13389o00oo0O0.set(i, e);
        }
    }

    public o0O00O() {
        this(10);
    }

    public o0O00O(int i) {
        this(o0O00OO.o00oOooO(i), 0, 0, false, null, null);
    }

    private o0O00O(E[] eArr, int i, int i2, boolean z, o0O00O<E> o0o00o, o0O00O<E> o0o00o2) {
        this.array = eArr;
        this.offset = i;
        this.length = i2;
        this.isReadOnly = z;
        this.backing = o0o00o;
        this.root = o0o00o2;
    }

    private final void addAllInternal(int i, Collection<? extends E> collection, int i2) {
        o0O00O<E> o0o00o = this.backing;
        if (o0o00o != null) {
            o0o00o.addAllInternal(i, collection, i2);
            this.array = this.backing.array;
            this.length += i2;
            return;
        }
        insertAtInternal(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.array[i + i3] = it.next();
        }
    }

    private final void addAtInternal(int i, E e) {
        o0O00O<E> o0o00o = this.backing;
        if (o0o00o == null) {
            insertAtInternal(i, 1);
            this.array[i] = e;
            return;
        }
        o0o00o.addAtInternal(i, e);
        this.array = this.backing.array;
        this.length++;
    }

    private final void checkIsMutable() {
        if (isEffectivelyReadOnly()) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean contentEquals(List<?> list) {
        return o0O00OO.o00oOoO(this.array, this.offset, this.length, list);
    }

    private final void ensureCapacity(int i) {
        if (this.backing != null) {
            throw new IllegalStateException();
        }
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.array;
        if (i > eArr.length) {
            this.array = (E[]) o0O00OO.o00oOo0O(this.array, o0O0o.f13354o00oo0o0.o00oOOo0(eArr.length, i));
        }
    }

    private final void ensureExtraCapacity(int i) {
        ensureCapacity(this.length + i);
    }

    private final void insertAtInternal(int i, int i2) {
        ensureExtraCapacity(i2);
        E[] eArr = this.array;
        o0O00000.o0O0o000(eArr, eArr, i + i2, i, this.offset + this.length);
        this.length += i2;
    }

    private final boolean isEffectivelyReadOnly() {
        o0O00O<E> o0o00o;
        return this.isReadOnly || ((o0o00o = this.root) != null && o0o00o.isReadOnly);
    }

    private final E removeAtInternal(int i) {
        o0O00O<E> o0o00o = this.backing;
        if (o0o00o != null) {
            this.length--;
            return o0o00o.removeAtInternal(i);
        }
        E[] eArr = this.array;
        E e = eArr[i];
        o0O00000.o0O0o000(eArr, eArr, i, i + 1, this.offset + this.length);
        o0O00OO.o00oOo0o(this.array, (this.offset + this.length) - 1);
        this.length--;
        return e;
    }

    private final void removeRangeInternal(int i, int i2) {
        o0O00O<E> o0o00o = this.backing;
        if (o0o00o != null) {
            o0o00o.removeRangeInternal(i, i2);
        } else {
            E[] eArr = this.array;
            o0O00000.o0O0o000(eArr, eArr, i, i + i2, this.length);
            E[] eArr2 = this.array;
            int i3 = this.length;
            o0O00OO.o00oOoO0(eArr2, i3 - i2, i3);
        }
        this.length -= i2;
    }

    private final int retainOrRemoveAllInternal(int i, int i2, Collection<? extends E> collection, boolean z) {
        o0O00O<E> o0o00o = this.backing;
        if (o0o00o != null) {
            int retainOrRemoveAllInternal = o0o00o.retainOrRemoveAllInternal(i, i2, collection, z);
            this.length -= retainOrRemoveAllInternal;
            return retainOrRemoveAllInternal;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.array[i5]) == z) {
                E[] eArr = this.array;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.array;
        o0O00000.o0O0o000(eArr2, eArr2, i + i4, i2 + i, this.length);
        E[] eArr3 = this.array;
        int i7 = this.length;
        o0O00OO.o00oOoO0(eArr3, i7 - i6, i7);
        this.length -= i6;
        return i6;
    }

    private final Object writeReplace() {
        if (isEffectivelyReadOnly()) {
            return new o0O0O0O(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // o0OO0oO.o00oo00O, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        checkIsMutable();
        o00oOo00.Companion.o00oOo00(i, this.length);
        addAtInternal(this.offset + i, e);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        checkIsMutable();
        addAtInternal(this.offset + this.length, e);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @NotNull Collection<? extends E> collection) {
        o0ooO.o00oo0O0(collection, "elements");
        checkIsMutable();
        o00oOo00.Companion.o00oOo00(i, this.length);
        int size = collection.size();
        addAllInternal(this.offset + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        o0ooO.o00oo0O0(collection, "elements");
        checkIsMutable();
        int size = collection.size();
        addAllInternal(this.offset + this.length, collection, size);
        return size > 0;
    }

    @NotNull
    public final List<E> build() {
        if (this.backing == null) {
            checkIsMutable();
            this.isReadOnly = true;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        checkIsMutable();
        removeRangeInternal(this.offset, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        return obj == this || ((obj instanceof List) && contentEquals((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        o00oOo00.Companion.o00oOOoO(i, this.length);
        return this.array[this.offset + i];
    }

    @Override // o0OO0oO.o00oo00O
    public int getSize() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return o0O00OO.o00oOoOO(this.array, this.offset, this.length);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i = 0; i < this.length; i++) {
            if (o0ooO.o00oOoO0(this.array[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return new o00oOOo0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (o0ooO.o00oOoO0(this.array[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return new o00oOOo0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i) {
        o00oOo00.Companion.o00oOo00(i, this.length);
        return new o00oOOo0(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        checkIsMutable();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<? extends Object> collection) {
        o0ooO.o00oo0O0(collection, "elements");
        checkIsMutable();
        return retainOrRemoveAllInternal(this.offset, this.length, collection, false) > 0;
    }

    @Override // o0OO0oO.o00oo00O
    public E removeAt(int i) {
        checkIsMutable();
        o00oOo00.Companion.o00oOOoO(i, this.length);
        return removeAtInternal(this.offset + i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<? extends Object> collection) {
        o0ooO.o00oo0O0(collection, "elements");
        checkIsMutable();
        return retainOrRemoveAllInternal(this.offset, this.length, collection, true) > 0;
    }

    @Override // o0OO0oO.o00oo00O, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        checkIsMutable();
        o00oOo00.Companion.o00oOOoO(i, this.length);
        E[] eArr = this.array;
        int i2 = this.offset;
        E e2 = eArr[i2 + i];
        eArr[i2 + i] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public List<E> subList(int i, int i2) {
        o00oOo00.Companion.o00oOooO(i, i2, this.length);
        E[] eArr = this.array;
        int i3 = this.offset + i;
        int i4 = i2 - i;
        boolean z = this.isReadOnly;
        o0O00O<E> o0o00o = this.root;
        return new o0O00O(eArr, i3, i4, z, this, o0o00o == null ? this : o0o00o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        E[] eArr = this.array;
        int i = this.offset;
        return o0O00000.o0O(eArr, i, this.length + i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        o0ooO.o00oo0O0(tArr, FirebaseAnalytics.Param.DESTINATION);
        int length = tArr.length;
        int i = this.length;
        if (length < i) {
            E[] eArr = this.array;
            int i2 = this.offset;
            T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, i2, i + i2, tArr.getClass());
            o0ooO.o00oo0OO(tArr2, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr2;
        }
        E[] eArr2 = this.array;
        int i3 = this.offset;
        o0O00000.o0O0o000(eArr2, tArr, 0, i3, i + i3);
        int length2 = tArr.length;
        int i4 = this.length;
        if (length2 > i4) {
            tArr[i4] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection
    @NotNull
    public String toString() {
        return o0O00OO.o00oOoOo(this.array, this.offset, this.length);
    }
}
