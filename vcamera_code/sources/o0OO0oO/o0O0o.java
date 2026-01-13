package o0OO0oO;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o0OO0o.oO0Oo0oo;
import o0OO0o.oO0Ooooo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
@o0OOOOO0.o0OOO00({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,583:1\n467#1,51:586\n467#1,51:637\n37#2,2:584\n26#3:688\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n462#1:586,51\n464#1:637,51\n47#1:584,2\n562#1:688\n*E\n"})
@o0OO0o.o0OO00o0(version = "1.4")
/* loaded from: classes3.dex */
public final class o0O0o<E> extends o00oo00O<E> {

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f13355o00oo0oO = 2147483639;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f13356o0O0o = 10;
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public Object[] f13357o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f13358o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f13359o00oo0Oo;
    @NotNull

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final o00oOOo0 f13354o00oo0o0 = new o00oOOo0(null);
    @NotNull

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final Object[] f13353o00oo0o = new Object[0];

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0OOOOO0.o0O00 o0o00) {
        }

        public final int o00oOOo0(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            if (i3 - o0O0o.f13355o00oo0oO > 0) {
                if (i2 > 2147483639) {
                    return Integer.MAX_VALUE;
                }
                return o0O0o.f13355o00oo0oO;
            }
            return i3;
        }
    }

    public o0O0o() {
        this.f13357o00oo0O = f13353o00oo0o;
    }

    public o0O0o(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f13353o00oo0o;
        } else if (i <= 0) {
            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("Illegal Capacity: ", i));
        } else {
            objArr = new Object[i];
        }
        this.f13357o00oo0O = objArr;
    }

    public o0O0o(@NotNull Collection<? extends E> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "elements");
        Object[] array = collection.toArray(new Object[0]);
        this.f13357o00oo0O = array;
        this.f13359o00oo0Oo = array.length;
        if (array.length == 0) {
            this.f13357o00oo0O = f13353o00oo0o;
        }
    }

    @Override // o0OO0oO.o00oo00O, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        o00oOo00.Companion.o00oOo00(i, size());
        if (i == size()) {
            addLast(e);
        } else if (i == 0) {
            addFirst(e);
        } else {
            ensureCapacity(size() + 1);
            int o00oo00O2 = o00oo00O(this.f13358o00oo0O0 + i);
            if (i < ((size() + 1) >> 1)) {
                int o00oOo002 = o00oOo00(o00oo00O2);
                int o00oOo003 = o00oOo00(this.f13358o00oo0O0);
                int i2 = this.f13358o00oo0O0;
                if (o00oOo002 >= i2) {
                    Object[] objArr = this.f13357o00oo0O;
                    objArr[o00oOo003] = objArr[i2];
                    o0O00000.o0O0o000(objArr, objArr, i2, i2 + 1, o00oOo002 + 1);
                } else {
                    Object[] objArr2 = this.f13357o00oo0O;
                    o0O00000.o0O0o000(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                    Object[] objArr3 = this.f13357o00oo0O;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    o0O00000.o0O0o000(objArr3, objArr3, 0, 1, o00oOo002 + 1);
                }
                this.f13357o00oo0O[o00oOo002] = e;
                this.f13358o00oo0O0 = o00oOo003;
            } else {
                int o00oo00O3 = o00oo00O(size() + this.f13358o00oo0O0);
                Object[] objArr4 = this.f13357o00oo0O;
                if (o00oo00O2 < o00oo00O3) {
                    o0O00000.o0O0o000(objArr4, objArr4, o00oo00O2 + 1, o00oo00O2, o00oo00O3);
                } else {
                    o0O00000.o0O0o000(objArr4, objArr4, 1, 0, o00oo00O3);
                    Object[] objArr5 = this.f13357o00oo0O;
                    objArr5[0] = objArr5[objArr5.length - 1];
                    o0O00000.o0O0o000(objArr5, objArr5, o00oo00O2 + 1, o00oo00O2, objArr5.length - 1);
                }
                this.f13357o00oo0O[o00oo00O2] = e;
            }
            this.f13359o00oo0Oo = size() + 1;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @NotNull Collection<? extends E> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "elements");
        o00oOo00.Companion.o00oOo00(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        ensureCapacity(collection.size() + size());
        int o00oo00O2 = o00oo00O(size() + this.f13358o00oo0O0);
        int o00oo00O3 = o00oo00O(this.f13358o00oo0O0 + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.f13358o00oo0O0;
            int i3 = i2 - size;
            if (o00oo00O3 < i2) {
                Object[] objArr = this.f13357o00oo0O;
                o0O00000.o0O0o000(objArr, objArr, i3, i2, objArr.length);
                Object[] objArr2 = this.f13357o00oo0O;
                if (size >= o00oo00O3) {
                    o0O00000.o0O0o000(objArr2, objArr2, objArr2.length - size, 0, o00oo00O3);
                } else {
                    o0O00000.o0O0o000(objArr2, objArr2, objArr2.length - size, 0, size);
                    Object[] objArr3 = this.f13357o00oo0O;
                    o0O00000.o0O0o000(objArr3, objArr3, 0, size, o00oo00O3);
                }
            } else if (i3 >= 0) {
                Object[] objArr4 = this.f13357o00oo0O;
                o0O00000.o0O0o000(objArr4, objArr4, i3, i2, o00oo00O3);
            } else {
                Object[] objArr5 = this.f13357o00oo0O;
                i3 += objArr5.length;
                int i4 = o00oo00O3 - i2;
                int length = objArr5.length - i3;
                if (length >= i4) {
                    o0O00000.o0O0o000(objArr5, objArr5, i3, i2, o00oo00O3);
                } else {
                    o0O00000.o0O0o000(objArr5, objArr5, i3, i2, i2 + length);
                    Object[] objArr6 = this.f13357o00oo0O;
                    o0O00000.o0O0o000(objArr6, objArr6, 0, this.f13358o00oo0O0 + length, o00oo00O3);
                }
            }
            this.f13358o00oo0O0 = i3;
            o00oOOo0(o00oOooo(o00oo00O3 - size), collection);
        } else {
            int i5 = o00oo00O3 + size;
            if (o00oo00O3 < o00oo00O2) {
                int i6 = size + o00oo00O2;
                Object[] objArr7 = this.f13357o00oo0O;
                if (i6 > objArr7.length) {
                    if (i5 >= objArr7.length) {
                        i5 -= objArr7.length;
                    } else {
                        int length2 = o00oo00O2 - (i6 - objArr7.length);
                        o0O00000.o0O0o000(objArr7, objArr7, 0, length2, o00oo00O2);
                        Object[] objArr8 = this.f13357o00oo0O;
                        o0O00000.o0O0o000(objArr8, objArr8, i5, o00oo00O3, length2);
                    }
                }
                o0O00000.o0O0o000(objArr7, objArr7, i5, o00oo00O3, o00oo00O2);
            } else {
                Object[] objArr9 = this.f13357o00oo0O;
                o0O00000.o0O0o000(objArr9, objArr9, size, 0, o00oo00O2);
                Object[] objArr10 = this.f13357o00oo0O;
                if (i5 >= objArr10.length) {
                    o0O00000.o0O0o000(objArr10, objArr10, i5 - objArr10.length, o00oo00O3, objArr10.length);
                } else {
                    o0O00000.o0O0o000(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.f13357o00oo0O;
                    o0O00000.o0O0o000(objArr11, objArr11, i5, o00oo00O3, objArr11.length - size);
                }
            }
            o00oOOo0(o00oo00O3, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        ensureCapacity(collection.size() + size());
        o00oOOo0(o00oo00O(size() + this.f13358o00oo0O0), collection);
        return true;
    }

    public final void addFirst(E e) {
        ensureCapacity(size() + 1);
        int o00oOo002 = o00oOo00(this.f13358o00oo0O0);
        this.f13358o00oo0O0 = o00oOo002;
        this.f13357o00oo0O[o00oOo002] = e;
        this.f13359o00oo0Oo = size() + 1;
    }

    public final void addLast(E e) {
        ensureCapacity(size() + 1);
        this.f13357o00oo0O[o00oo00O(size() + this.f13358o00oo0O0)] = e;
        this.f13359o00oo0Oo = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int o00oo00O2 = o00oo00O(size() + this.f13358o00oo0O0);
        int i = this.f13358o00oo0O0;
        if (i < o00oo00O2) {
            o0O00000.o0OO0oo0(this.f13357o00oo0O, null, i, o00oo00O2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f13357o00oo0O;
            o0O00000.o0OO0oo0(objArr, null, this.f13358o00oo0O0, objArr.length);
            o0O00000.o0OO0oo0(this.f13357o00oo0O, null, 0, o00oo00O2);
        }
        this.f13358o00oo0O0 = 0;
        this.f13359o00oo0Oo = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void ensureCapacity(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f13357o00oo0O;
        if (i <= objArr.length) {
            return;
        }
        if (objArr != f13353o00oo0o) {
            o00oOOoO(f13354o00oo0o0.o00oOOo0(objArr.length, i));
            return;
        }
        if (i < 10) {
            i = 10;
        }
        this.f13357o00oo0O = new Object[i];
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f13357o00oo0O[this.f13358o00oo0O0];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        o00oOo00.Companion.o00oOOoO(i, size());
        return (E) this.f13357o00oo0O[o00oo00O(this.f13358o00oo0O0 + i)];
    }

    @Override // o0OO0oO.o00oo00O
    public int getSize() {
        return this.f13359o00oo0Oo;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int o00oo00O2 = o00oo00O(size() + this.f13358o00oo0O0);
        int i = this.f13358o00oo0O0;
        if (i < o00oo00O2) {
            while (i < o00oo00O2) {
                if (!o0OOOOO0.o0ooO.o00oOoO0(obj, this.f13357o00oo0O[i])) {
                    i++;
                }
            }
            return -1;
        } else if (i < o00oo00O2) {
            return -1;
        } else {
            int length = this.f13357o00oo0O.length;
            while (true) {
                if (i >= length) {
                    for (int i2 = 0; i2 < o00oo00O2; i2++) {
                        if (o0OOOOO0.o0ooO.o00oOoO0(obj, this.f13357o00oo0O[i2])) {
                            i = i2 + this.f13357o00oo0O.length;
                        }
                    }
                    return -1;
                } else if (o0OOOOO0.o0ooO.o00oOoO0(obj, this.f13357o00oo0O[i])) {
                    break;
                } else {
                    i++;
                }
            }
        }
        return i - this.f13358o00oo0O0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f13357o00oo0O[o00oo00O(o0O00O0o.o00ooOo(this) + this.f13358o00oo0O0)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int oOO00O00;
        int o00oo00O2 = o00oo00O(size() + this.f13358o00oo0O0);
        int i = this.f13358o00oo0O0;
        if (i < o00oo00O2) {
            oOO00O00 = o00oo00O2 - 1;
            if (i <= oOO00O00) {
                while (!o0OOOOO0.o0ooO.o00oOoO0(obj, this.f13357o00oo0O[oOO00O00])) {
                    if (oOO00O00 != i) {
                        oOO00O00--;
                    }
                }
                return oOO00O00 - this.f13358o00oo0O0;
            }
            return -1;
        }
        if (i > o00oo00O2) {
            int i2 = o00oo00O2 - 1;
            while (true) {
                if (-1 >= i2) {
                    oOO00O00 = o0O000O.oOO00O00(this.f13357o00oo0O);
                    int i3 = this.f13358o00oo0O0;
                    if (i3 <= oOO00O00) {
                        while (!o0OOOOO0.o0ooO.o00oOoO0(obj, this.f13357o00oo0O[oOO00O00])) {
                            if (oOO00O00 != i3) {
                                oOO00O00--;
                            }
                        }
                    }
                } else if (o0OOOOO0.o0ooO.o00oOoO0(obj, this.f13357o00oo0O[i2])) {
                    oOO00O00 = i2 + this.f13357o00oo0O.length;
                    break;
                } else {
                    i2--;
                }
            }
        }
        return -1;
    }

    public final void o00oOOo0(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f13357o00oo0O.length;
        while (i < length && it.hasNext()) {
            this.f13357o00oo0O[i] = it.next();
            i++;
        }
        int i2 = this.f13358o00oo0O0;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f13357o00oo0O[i3] = it.next();
        }
        this.f13359o00oo0Oo = collection.size() + size();
    }

    public final void o00oOOoO(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.f13357o00oo0O;
        o0O00000.o0O0o000(objArr2, objArr, 0, this.f13358o00oo0O0, objArr2.length);
        Object[] objArr3 = this.f13357o00oo0O;
        int length = objArr3.length;
        int i2 = this.f13358o00oo0O0;
        o0O00000.o0O0o000(objArr3, objArr, length - i2, 0, i2);
        this.f13358o00oo0O0 = 0;
        this.f13357o00oo0O = objArr;
    }

    public final int o00oOo00(int i) {
        return i == 0 ? o0O000O.oOO00O00(this.f13357o00oo0O) : i - 1;
    }

    @Nullable
    public final E o00oOo0O() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f13357o00oo0O[this.f13358o00oo0O0];
    }

    @o0OOO0OO.o00oo00O
    public final E o00oOoO(int i) {
        return (E) this.f13357o00oo0O[i];
    }

    public final int o00oOoO0(int i) {
        if (i == o0O000O.oOO00O00(this.f13357o00oo0O)) {
            return 0;
        }
        return i + 1;
    }

    @o0OOO0OO.o00oo00O
    public final int o00oOoOO(int i) {
        return o00oo00O(this.f13358o00oo0O0 + i);
    }

    public final void o00oOoOo(@NotNull o0OOOO.o0O00000<? super Integer, ? super Object[], oO0Ooooo> o0o00000) {
        int i;
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "structure");
        o0o00000.invoke(Integer.valueOf((isEmpty() || (i = this.f13358o00oo0O0) < o00oo00O(size() + this.f13358o00oo0O0)) ? this.f13358o00oo0O0 : i - this.f13357o00oo0O.length), toArray());
    }

    @Nullable
    public final E o00oOoo0() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f13357o00oo0O[o00oo00O(o0O00O0o.o00ooOo(this) + this.f13358o00oo0O0)];
    }

    public final boolean o00oOooO(o0OOOO.o00oo<? super E, Boolean> o00ooVar) {
        int o00oo00O2;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if ((this.f13357o00oo0O.length == 0 ? 1 : null) == null) {
                int o00oo00O3 = o00oo00O(size() + this.f13358o00oo0O0);
                int i = this.f13358o00oo0O0;
                if (i < o00oo00O3) {
                    o00oo00O2 = i;
                    while (i < o00oo00O3) {
                        Object obj = this.f13357o00oo0O[i];
                        if (o00ooVar.invoke(obj).booleanValue()) {
                            this.f13357o00oo0O[o00oo00O2] = obj;
                            o00oo00O2++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    o0O00000.o0OO0oo0(this.f13357o00oo0O, null, o00oo00O2, o00oo00O3);
                } else {
                    int length = this.f13357o00oo0O.length;
                    boolean z2 = false;
                    int i2 = i;
                    while (i < length) {
                        Object[] objArr = this.f13357o00oo0O;
                        Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (o00ooVar.invoke(obj2).booleanValue()) {
                            this.f13357o00oo0O[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    o00oo00O2 = o00oo00O(i2);
                    for (int i3 = 0; i3 < o00oo00O3; i3++) {
                        Object[] objArr2 = this.f13357o00oo0O;
                        Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (o00ooVar.invoke(obj3).booleanValue()) {
                            this.f13357o00oo0O[o00oo00O2] = obj3;
                            o00oo00O2 = o00oOoO0(o00oo00O2);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.f13359o00oo0Oo = o00oOooo(o00oo00O2 - this.f13358o00oo0O0);
                }
            }
        }
        return z;
    }

    public final int o00oOooo(int i) {
        return i < 0 ? i + this.f13357o00oo0O.length : i;
    }

    @Nullable
    public final E o00oo0() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final int o00oo00O(int i) {
        Object[] objArr = this.f13357o00oo0O;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @NotNull
    public final <T> T[] o00oo0O(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "array");
        return (T[]) toArray(tArr);
    }

    @NotNull
    public final Object[] o00oo0O0() {
        return toArray();
    }

    @Nullable
    public final E o00oo0OO() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<? extends Object> collection) {
        int o00oo00O2;
        o0OOOOO0.o0ooO.o00oo0O0(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if ((this.f13357o00oo0O.length == 0 ? 1 : null) == null) {
                int o00oo00O3 = o00oo00O(size() + this.f13358o00oo0O0);
                int i = this.f13358o00oo0O0;
                if (i < o00oo00O3) {
                    o00oo00O2 = i;
                    while (i < o00oo00O3) {
                        Object obj = this.f13357o00oo0O[i];
                        if (!collection.contains(obj)) {
                            this.f13357o00oo0O[o00oo00O2] = obj;
                            o00oo00O2++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    o0O00000.o0OO0oo0(this.f13357o00oo0O, null, o00oo00O2, o00oo00O3);
                } else {
                    int length = this.f13357o00oo0O.length;
                    boolean z2 = false;
                    int i2 = i;
                    while (i < length) {
                        Object[] objArr = this.f13357o00oo0O;
                        Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (!collection.contains(obj2)) {
                            this.f13357o00oo0O[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    o00oo00O2 = o00oo00O(i2);
                    for (int i3 = 0; i3 < o00oo00O3; i3++) {
                        Object[] objArr2 = this.f13357o00oo0O;
                        Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (!collection.contains(obj3)) {
                            this.f13357o00oo0O[o00oo00O2] = obj3;
                            o00oo00O2 = o00oOoO0(o00oo00O2);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.f13359o00oo0Oo = o00oOooo(o00oo00O2 - this.f13358o00oo0O0);
                }
            }
        }
        return z;
    }

    @Override // o0OO0oO.o00oo00O
    public E removeAt(int i) {
        o00oOo00.Companion.o00oOOoO(i, size());
        if (i == o0O00O0o.o00ooOo(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        int o00oo00O2 = o00oo00O(this.f13358o00oo0O0 + i);
        E e = (E) this.f13357o00oo0O[o00oo00O2];
        if (i < (size() >> 1)) {
            int i2 = this.f13358o00oo0O0;
            if (o00oo00O2 >= i2) {
                Object[] objArr = this.f13357o00oo0O;
                o0O00000.o0O0o000(objArr, objArr, i2 + 1, i2, o00oo00O2);
            } else {
                Object[] objArr2 = this.f13357o00oo0O;
                o0O00000.o0O0o000(objArr2, objArr2, 1, 0, o00oo00O2);
                Object[] objArr3 = this.f13357o00oo0O;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.f13358o00oo0O0;
                o0O00000.o0O0o000(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.f13357o00oo0O;
            int i4 = this.f13358o00oo0O0;
            objArr4[i4] = null;
            this.f13358o00oo0O0 = o00oOoO0(i4);
        } else {
            int o00oo00O3 = o00oo00O(o0O00O0o.o00ooOo(this) + this.f13358o00oo0O0);
            Object[] objArr5 = this.f13357o00oo0O;
            if (o00oo00O2 <= o00oo00O3) {
                o0O00000.o0O0o000(objArr5, objArr5, o00oo00O2, o00oo00O2 + 1, o00oo00O3 + 1);
            } else {
                o0O00000.o0O0o000(objArr5, objArr5, o00oo00O2, o00oo00O2 + 1, objArr5.length);
                Object[] objArr6 = this.f13357o00oo0O;
                objArr6[objArr6.length - 1] = objArr6[0];
                o0O00000.o0O0o000(objArr6, objArr6, 0, 1, o00oo00O3 + 1);
            }
            this.f13357o00oo0O[o00oo00O3] = null;
        }
        this.f13359o00oo0Oo = size() - 1;
        return e;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f13357o00oo0O;
        int i = this.f13358o00oo0O0;
        E e = (E) objArr[i];
        objArr[i] = null;
        this.f13358o00oo0O0 = o00oOoO0(i);
        this.f13359o00oo0Oo = size() - 1;
        return e;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int o00oo00O2 = o00oo00O(o0O00O0o.o00ooOo(this) + this.f13358o00oo0O0);
        Object[] objArr = this.f13357o00oo0O;
        E e = (E) objArr[o00oo00O2];
        objArr[o00oo00O2] = null;
        this.f13359o00oo0Oo = size() - 1;
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<? extends Object> collection) {
        int o00oo00O2;
        o0OOOOO0.o0ooO.o00oo0O0(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if ((this.f13357o00oo0O.length == 0 ? 1 : null) == null) {
                int o00oo00O3 = o00oo00O(size() + this.f13358o00oo0O0);
                int i = this.f13358o00oo0O0;
                if (i < o00oo00O3) {
                    o00oo00O2 = i;
                    while (i < o00oo00O3) {
                        Object obj = this.f13357o00oo0O[i];
                        if (collection.contains(obj)) {
                            this.f13357o00oo0O[o00oo00O2] = obj;
                            o00oo00O2++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    o0O00000.o0OO0oo0(this.f13357o00oo0O, null, o00oo00O2, o00oo00O3);
                } else {
                    int length = this.f13357o00oo0O.length;
                    boolean z2 = false;
                    int i2 = i;
                    while (i < length) {
                        Object[] objArr = this.f13357o00oo0O;
                        Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (collection.contains(obj2)) {
                            this.f13357o00oo0O[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    o00oo00O2 = o00oo00O(i2);
                    for (int i3 = 0; i3 < o00oo00O3; i3++) {
                        Object[] objArr2 = this.f13357o00oo0O;
                        Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (collection.contains(obj3)) {
                            this.f13357o00oo0O[o00oo00O2] = obj3;
                            o00oo00O2 = o00oOoO0(o00oo00O2);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.f13359o00oo0Oo = o00oOooo(o00oo00O2 - this.f13358o00oo0O0);
                }
            }
        }
        return z;
    }

    @Override // o0OO0oO.o00oo00O, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        o00oOo00.Companion.o00oOOoO(i, size());
        int o00oo00O2 = o00oo00O(this.f13358o00oo0O0 + i);
        Object[] objArr = this.f13357o00oo0O;
        E e2 = (E) objArr[o00oo00O2];
        objArr[o00oo00O2] = e;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) o00ooO0.o00oOOo0(tArr, size());
        }
        int o00oo00O2 = o00oo00O(size() + this.f13358o00oo0O0);
        int i = this.f13358o00oo0O0;
        if (i < o00oo00O2) {
            o0O00000.o0O0o0o(this.f13357o00oo0O, tArr, 0, i, o00oo00O2, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f13357o00oo0O;
            o0O00000.o0O0o000(objArr, tArr, 0, this.f13358o00oo0O0, objArr.length);
            Object[] objArr2 = this.f13357o00oo0O;
            o0O00000.o0O0o000(objArr2, tArr, objArr2.length - this.f13358o00oo0O0, 0, o00oo00O2);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }
}
