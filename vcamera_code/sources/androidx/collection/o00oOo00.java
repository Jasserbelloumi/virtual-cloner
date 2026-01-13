package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oOo00<E> implements Collection<E>, Set<E> {

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final boolean f1668o00oo0o = false;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final String f1669o00oo0oO = "ArraySet";
    @o0OO00OO

    /* renamed from: o00ooO  reason: collision with root package name */
    public static Object[] f1670o00ooO = null;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final int f1671o00ooO0 = 10;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f1672o00ooO00 = 4;
    @o0OO00OO

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static Object[] f1673o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static int f1674o00ooO0o;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static int f1675o00ooOO0;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public Object[] f1677o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int[] f1678o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f1679o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public o00oo<E, E> f1680o00oo0o0;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int[] f1676o0O0o = new int[0];

    /* renamed from: o00oo  reason: collision with root package name */
    public static final Object[] f1667o00oo = new Object[0];

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o00oo<E, E> {
        public o00oOOo0() {
        }

        @Override // androidx.collection.o00oo
        public void o00oOOo0() {
            o00oOo00.this.clear();
        }

        @Override // androidx.collection.o00oo
        public Object o00oOOoO(int i, int i2) {
            return o00oOo00.this.f1677o00oo0O[i];
        }

        @Override // androidx.collection.o00oo
        public Map<E, E> o00oOo00() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // androidx.collection.o00oo
        public int o00oOo0O(Object obj) {
            return o00oOo00.this.indexOf(obj);
        }

        @Override // androidx.collection.o00oo
        public int o00oOo0o(Object obj) {
            return o00oOo00.this.indexOf(obj);
        }

        @Override // androidx.collection.o00oo
        public void o00oOoO(int i) {
            o00oOo00.this.o00oOoOO(i);
        }

        @Override // androidx.collection.o00oo
        public void o00oOoO0(E e, E e2) {
            o00oOo00.this.add(e);
        }

        @Override // androidx.collection.o00oo
        public E o00oOoOO(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // androidx.collection.o00oo
        public int o00oOooO() {
            return o00oOo00.this.f1679o00oo0Oo;
        }
    }

    public o00oOo00() {
        this(0);
    }

    public o00oOo00(int i) {
        if (i == 0) {
            this.f1678o00oo0O0 = f1676o0O0o;
            this.f1677o00oo0O = f1667o00oo;
        } else {
            o00oOOoO(i);
        }
        this.f1679o00oo0Oo = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o00oOo00(@o0OO00OO o00oOo00<E> o00ooo002) {
        this();
        if (o00ooo002 != 0) {
            o00oOOo0(o00ooo002);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o00oOo00(@o0OO00OO Collection<E> collection) {
        this();
        if (collection != 0) {
            addAll(collection);
        }
    }

    public static void o00oOooO(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (o00oOo00.class) {
                if (f1675o00ooOO0 < 10) {
                    objArr[0] = f1670o00ooO;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1670o00ooO = objArr;
                    f1675o00ooOO0++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (o00oOo00.class) {
                if (f1674o00ooO0o < 10) {
                    objArr[0] = f1673o00ooO0O;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1673o00ooO0O = objArr;
                    f1674o00ooO0o++;
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(@o0OO00OO E e) {
        int i;
        int o00oOo0o2;
        if (e == null) {
            o00oOo0o2 = o00oOoO0();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            o00oOo0o2 = o00oOo0o(e, hashCode);
        }
        if (o00oOo0o2 >= 0) {
            return false;
        }
        int i2 = ~o00oOo0o2;
        int i3 = this.f1679o00oo0Oo;
        int[] iArr = this.f1678o00oo0O0;
        if (i3 >= iArr.length) {
            int i4 = 4;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i4 = 8;
            }
            Object[] objArr = this.f1677o00oo0O;
            o00oOOoO(i4);
            int[] iArr2 = this.f1678o00oo0O0;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1677o00oo0O, 0, objArr.length);
            }
            o00oOooO(iArr, objArr, this.f1679o00oo0Oo);
        }
        int i5 = this.f1679o00oo0Oo;
        if (i2 < i5) {
            int[] iArr3 = this.f1678o00oo0O0;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f1677o00oo0O;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f1679o00oo0Oo - i2);
        }
        this.f1678o00oo0O0[i2] = i;
        this.f1677o00oo0O[i2] = e;
        this.f1679o00oo0Oo++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@oo0oO0 Collection<? extends E> collection) {
        o00oOo00(collection.size() + this.f1679o00oo0Oo);
        boolean z = false;
        for (E e : collection) {
            z |= add(e);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f1679o00oo0Oo;
        if (i != 0) {
            o00oOooO(this.f1678o00oo0O0, this.f1677o00oo0O, i);
            this.f1678o00oo0O0 = f1676o0O0o;
            this.f1677o00oo0O = f1667o00oo;
            this.f1679o00oo0Oo = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(@o0OO00OO Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@oo0oO0 Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f1679o00oo0Oo != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f1679o00oo0Oo; i++) {
                try {
                    if (!set.contains(this.f1677o00oo0O[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f1678o00oo0O0;
        int i = this.f1679o00oo0Oo;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(@o0OO00OO Object obj) {
        return obj == null ? o00oOoO0() : o00oOo0o(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f1679o00oo0Oo <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return o00oOo0O().o00oo00O().iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void o00oOOo0(@oo0oO0 o00oOo00<? extends E> o00ooo002) {
        int i = o00ooo002.f1679o00oo0Oo;
        o00oOo00(this.f1679o00oo0Oo + i);
        if (this.f1679o00oo0Oo != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                add(o00ooo002.f1677o00oo0O[i2]);
            }
        } else if (i > 0) {
            System.arraycopy(o00ooo002.f1678o00oo0O0, 0, this.f1678o00oo0O0, 0, i);
            System.arraycopy(o00ooo002.f1677o00oo0O, 0, this.f1677o00oo0O, 0, i);
            this.f1679o00oo0Oo = i;
        }
    }

    public final void o00oOOoO(int i) {
        if (i == 8) {
            synchronized (o00oOo00.class) {
                Object[] objArr = f1670o00ooO;
                if (objArr != null) {
                    this.f1677o00oo0O = objArr;
                    f1670o00ooO = (Object[]) objArr[0];
                    this.f1678o00oo0O0 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1675o00ooOO0--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (o00oOo00.class) {
                Object[] objArr2 = f1673o00ooO0O;
                if (objArr2 != null) {
                    this.f1677o00oo0O = objArr2;
                    f1673o00ooO0O = (Object[]) objArr2[0];
                    this.f1678o00oo0O0 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1674o00ooO0o--;
                    return;
                }
            }
        }
        this.f1678o00oo0O0 = new int[i];
        this.f1677o00oo0O = new Object[i];
    }

    public void o00oOo00(int i) {
        int[] iArr = this.f1678o00oo0O0;
        if (iArr.length < i) {
            Object[] objArr = this.f1677o00oo0O;
            o00oOOoO(i);
            int i2 = this.f1679o00oo0Oo;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f1678o00oo0O0, 0, i2);
                System.arraycopy(objArr, 0, this.f1677o00oo0O, 0, this.f1679o00oo0Oo);
            }
            o00oOooO(iArr, objArr, this.f1679o00oo0Oo);
        }
    }

    public final o00oo<E, E> o00oOo0O() {
        if (this.f1680o00oo0o0 == null) {
            this.f1680o00oo0o0 = new o00oOOo0();
        }
        return this.f1680o00oo0o0;
    }

    public final int o00oOo0o(Object obj, int i) {
        int i2 = this.f1679o00oo0Oo;
        if (i2 == 0) {
            return -1;
        }
        int o00oOOo02 = o00oo0.o00oOOo0(this.f1678o00oo0O0, i2, i);
        if (o00oOOo02 >= 0 && !obj.equals(this.f1677o00oo0O[o00oOOo02])) {
            int i3 = o00oOOo02 + 1;
            while (i3 < i2 && this.f1678o00oo0O0[i3] == i) {
                if (obj.equals(this.f1677o00oo0O[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = o00oOOo02 - 1; i4 >= 0 && this.f1678o00oo0O0[i4] == i; i4--) {
                if (obj.equals(this.f1677o00oo0O[i4])) {
                    return i4;
                }
            }
            return ~i3;
        }
        return o00oOOo02;
    }

    public boolean o00oOoO(@oo0oO0 o00oOo00<? extends E> o00ooo002) {
        int i = o00ooo002.f1679o00oo0Oo;
        int i2 = this.f1679o00oo0Oo;
        for (int i3 = 0; i3 < i; i3++) {
            remove(o00ooo002.f1677o00oo0O[i3]);
        }
        return i2 != this.f1679o00oo0Oo;
    }

    public final int o00oOoO0() {
        int i = this.f1679o00oo0Oo;
        if (i == 0) {
            return -1;
        }
        int o00oOOo02 = o00oo0.o00oOOo0(this.f1678o00oo0O0, i, 0);
        if (o00oOOo02 >= 0 && this.f1677o00oo0O[o00oOOo02] != null) {
            int i2 = o00oOOo02 + 1;
            while (i2 < i && this.f1678o00oo0O0[i2] == 0) {
                if (this.f1677o00oo0O[i2] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = o00oOOo02 - 1; i3 >= 0 && this.f1678o00oo0O0[i3] == 0; i3--) {
                if (this.f1677o00oo0O[i3] == null) {
                    return i3;
                }
            }
            return ~i2;
        }
        return o00oOOo02;
    }

    public E o00oOoOO(int i) {
        Object[] objArr = this.f1677o00oo0O;
        E e = (E) objArr[i];
        int i2 = this.f1679o00oo0Oo;
        if (i2 <= 1) {
            o00oOooO(this.f1678o00oo0O0, objArr, i2);
            this.f1678o00oo0O0 = f1676o0O0o;
            this.f1677o00oo0O = f1667o00oo;
            this.f1679o00oo0Oo = 0;
        } else {
            int[] iArr = this.f1678o00oo0O0;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i3 = i2 - 1;
                this.f1679o00oo0Oo = i3;
                if (i < i3) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, iArr, i, i3 - i);
                    Object[] objArr2 = this.f1677o00oo0O;
                    System.arraycopy(objArr2, i4, objArr2, i, this.f1679o00oo0Oo - i);
                }
                this.f1677o00oo0O[this.f1679o00oo0Oo] = null;
            } else {
                o00oOOoO(i2 > 8 ? i2 + (i2 >> 1) : 8);
                this.f1679o00oo0Oo--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f1678o00oo0O0, 0, i);
                    System.arraycopy(objArr, 0, this.f1677o00oo0O, 0, i);
                }
                int i5 = this.f1679o00oo0Oo;
                if (i < i5) {
                    int i6 = i + 1;
                    System.arraycopy(iArr, i6, this.f1678o00oo0O0, i, i5 - i);
                    System.arraycopy(objArr, i6, this.f1677o00oo0O, i, this.f1679o00oo0Oo - i);
                }
            }
        }
        return e;
    }

    @o0OO00OO
    public E o00oOoOo(int i) {
        return (E) this.f1677o00oo0O[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(@o0OO00OO Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            o00oOoOO(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@oo0oO0 Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@oo0oO0 Collection<?> collection) {
        boolean z = false;
        for (int i = this.f1679o00oo0Oo - 1; i >= 0; i--) {
            if (!collection.contains(this.f1677o00oo0O[i])) {
                o00oOoOO(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f1679o00oo0Oo;
    }

    @Override // java.util.Collection, java.util.Set
    @oo0oO0
    public Object[] toArray() {
        int i = this.f1679o00oo0Oo;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f1677o00oo0O, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    @oo0oO0
    public <T> T[] toArray(@oo0oO0 T[] tArr) {
        if (tArr.length < this.f1679o00oo0Oo) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1679o00oo0Oo));
        }
        System.arraycopy(this.f1677o00oo0O, 0, tArr, 0, this.f1679o00oo0Oo);
        int length = tArr.length;
        int i = this.f1679o00oo0Oo;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1679o00oo0Oo * 14);
        sb.append('{');
        for (int i = 0; i < this.f1679o00oo0Oo; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f1677o00oo0O[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
