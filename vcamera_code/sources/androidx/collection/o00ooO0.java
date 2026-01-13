package androidx.collection;

import java.util.ConcurrentModificationException;
import java.util.Map;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00ooO0<K, V> {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f1722o00oo = 10;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final String f1723o00oo0o = "ArrayMap";

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final boolean f1724o00oo0o0 = false;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final boolean f1725o00oo0oO = true;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static int f1726o00ooO0 = 0;
    @o0OO00OO

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static Object[] f1727o00ooO00 = null;
    @o0OO00OO

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static Object[] f1728o00ooO0O = null;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static int f1729o00ooO0o = 0;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f1730o0O0o = 4;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public Object[] f1731o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int[] f1732o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f1733o00oo0Oo;

    public o00ooO0() {
        this.f1732o00oo0O0 = o00oo0.f1701o00oOOo0;
        this.f1731o00oo0O = o00oo0.f1703o00oOo00;
        this.f1733o00oo0Oo = 0;
    }

    public o00ooO0(int i) {
        if (i == 0) {
            this.f1732o00oo0O0 = o00oo0.f1701o00oOOo0;
            this.f1731o00oo0O = o00oo0.f1703o00oOo00;
        } else {
            o00oOOo0(i);
        }
        this.f1733o00oo0Oo = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o00ooO0(o00ooO0<K, V> o00ooo02) {
        this();
        if (o00ooo02 != 0) {
            o00oOoo0(o00ooo02);
        }
    }

    private void o00oOOo0(int i) {
        if (i == 8) {
            synchronized (o00ooO0.class) {
                Object[] objArr = f1728o00ooO0O;
                if (objArr != null) {
                    this.f1731o00oo0O = objArr;
                    f1728o00ooO0O = (Object[]) objArr[0];
                    this.f1732o00oo0O0 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1729o00ooO0o--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (o00ooO0.class) {
                Object[] objArr2 = f1727o00ooO00;
                if (objArr2 != null) {
                    this.f1731o00oo0O = objArr2;
                    f1727o00ooO00 = (Object[]) objArr2[0];
                    this.f1732o00oo0O0 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1726o00ooO0--;
                    return;
                }
            }
        }
        this.f1732o00oo0O0 = new int[i];
        this.f1731o00oo0O = new Object[i << 1];
    }

    public static int o00oOOoO(int[] iArr, int i, int i2) {
        try {
            return o00oo0.o00oOOo0(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static void o00oOooO(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (o00ooO0.class) {
                if (f1729o00ooO0o < 10) {
                    objArr[0] = f1728o00ooO0O;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1728o00ooO0O = objArr;
                    f1729o00ooO0o++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (o00ooO0.class) {
                if (f1726o00ooO0 < 10) {
                    objArr[0] = f1727o00ooO00;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1727o00ooO00 = objArr;
                    f1726o00ooO0++;
                }
            }
        }
    }

    public void clear() {
        int i = this.f1733o00oo0Oo;
        if (i > 0) {
            int[] iArr = this.f1732o00oo0O0;
            Object[] objArr = this.f1731o00oo0O;
            this.f1732o00oo0O0 = o00oo0.f1701o00oOOo0;
            this.f1731o00oo0O = o00oo0.f1703o00oOo00;
            this.f1733o00oo0Oo = 0;
            o00oOooO(iArr, objArr, i);
        }
        if (this.f1733o00oo0Oo > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(@o0OO00OO Object obj) {
        return o00oOoO0(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return o00oOoOO(obj) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00ooO0) {
            o00ooO0 o00ooo02 = (o00ooO0) obj;
            if (size() != o00ooo02.size()) {
                return false;
            }
            for (int i = 0; i < this.f1733o00oo0Oo; i++) {
                try {
                    K o00oOoOo2 = o00oOoOo(i);
                    V o00oo02 = o00oo0(i);
                    Object obj2 = o00ooo02.get(o00oOoOo2);
                    if (o00oo02 == null) {
                        if (obj2 != null || !o00ooo02.containsKey(o00oOoOo2)) {
                            return false;
                        }
                    } else if (!o00oo02.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1733o00oo0Oo; i2++) {
                try {
                    K o00oOoOo3 = o00oOoOo(i2);
                    V o00oo03 = o00oo0(i2);
                    Object obj3 = map.get(o00oOoOo3);
                    if (o00oo03 == null) {
                        if (obj3 != null || !map.containsKey(o00oOoOo3)) {
                            return false;
                        }
                    } else if (!o00oo03.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    @o0OO00OO
    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int o00oOoO02 = o00oOoO0(obj);
        return o00oOoO02 >= 0 ? (V) this.f1731o00oo0O[(o00oOoO02 << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.f1732o00oo0O0;
        Object[] objArr = this.f1731o00oo0O;
        int i = this.f1733o00oo0Oo;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.f1733o00oo0Oo <= 0;
    }

    public void o00oOo00(int i) {
        int i2 = this.f1733o00oo0Oo;
        int[] iArr = this.f1732o00oo0O0;
        if (iArr.length < i) {
            Object[] objArr = this.f1731o00oo0O;
            o00oOOo0(i);
            if (this.f1733o00oo0Oo > 0) {
                System.arraycopy(iArr, 0, this.f1732o00oo0O0, 0, i2);
                System.arraycopy(objArr, 0, this.f1731o00oo0O, 0, i2 << 1);
            }
            o00oOooO(iArr, objArr, i2);
        }
        if (this.f1733o00oo0Oo != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public int o00oOo0O(Object obj, int i) {
        int i2 = this.f1733o00oo0Oo;
        if (i2 == 0) {
            return -1;
        }
        int o00oOOoO2 = o00oOOoO(this.f1732o00oo0O0, i2, i);
        if (o00oOOoO2 >= 0 && !obj.equals(this.f1731o00oo0O[o00oOOoO2 << 1])) {
            int i3 = o00oOOoO2 + 1;
            while (i3 < i2 && this.f1732o00oo0O0[i3] == i) {
                if (obj.equals(this.f1731o00oo0O[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = o00oOOoO2 - 1; i4 >= 0 && this.f1732o00oo0O0[i4] == i; i4--) {
                if (obj.equals(this.f1731o00oo0O[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        }
        return o00oOOoO2;
    }

    public int o00oOoO() {
        int i = this.f1733o00oo0Oo;
        if (i == 0) {
            return -1;
        }
        int o00oOOoO2 = o00oOOoO(this.f1732o00oo0O0, i, 0);
        if (o00oOOoO2 >= 0 && this.f1731o00oo0O[o00oOOoO2 << 1] != null) {
            int i2 = o00oOOoO2 + 1;
            while (i2 < i && this.f1732o00oo0O0[i2] == 0) {
                if (this.f1731o00oo0O[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = o00oOOoO2 - 1; i3 >= 0 && this.f1732o00oo0O0[i3] == 0; i3--) {
                if (this.f1731o00oo0O[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        }
        return o00oOOoO2;
    }

    public int o00oOoO0(@o0OO00OO Object obj) {
        return obj == null ? o00oOoO() : o00oOo0O(obj, obj.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o00oOoOO(Object obj) {
        int i = this.f1733o00oo0Oo * 2;
        Object[] objArr = this.f1731o00oo0O;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public K o00oOoOo(int i) {
        return (K) this.f1731o00oo0O[i << 1];
    }

    public void o00oOoo0(@oo0oO0 o00ooO0<? extends K, ? extends V> o00ooo02) {
        int i = o00ooo02.f1733o00oo0Oo;
        o00oOo00(this.f1733o00oo0Oo + i);
        if (this.f1733o00oo0Oo != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(o00ooo02.o00oOoOo(i2), o00ooo02.o00oo0(i2));
            }
        } else if (i > 0) {
            System.arraycopy(o00ooo02.f1732o00oo0O0, 0, this.f1732o00oo0O0, 0, i);
            System.arraycopy(o00ooo02.f1731o00oo0O, 0, this.f1731o00oo0O, 0, i << 1);
            this.f1733o00oo0Oo = i;
        }
    }

    public V o00oOooo(int i) {
        Object[] objArr = this.f1731o00oo0O;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f1733o00oo0Oo;
        int i4 = 0;
        if (i3 <= 1) {
            o00oOooO(this.f1732o00oo0O0, objArr, i3);
            this.f1732o00oo0O0 = o00oo0.f1701o00oOOo0;
            this.f1731o00oo0O = o00oo0.f1703o00oOo00;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f1732o00oo0O0;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f1731o00oo0O;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f1731o00oo0O;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                o00oOOo0(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f1733o00oo0Oo) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f1732o00oo0O0, 0, i);
                    System.arraycopy(objArr, 0, this.f1731o00oo0O, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.f1732o00oo0O0, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.f1731o00oo0O, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 == this.f1733o00oo0Oo) {
            this.f1733o00oo0Oo = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public V o00oo0(int i) {
        return (V) this.f1731o00oo0O[(i << 1) + 1];
    }

    public V o00oo00O(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f1731o00oo0O;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    @o0OO00OO
    public V put(K k, V v) {
        int i;
        int o00oOo0O2;
        int i2 = this.f1733o00oo0Oo;
        if (k == null) {
            o00oOo0O2 = o00oOoO();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            o00oOo0O2 = o00oOo0O(k, hashCode);
        }
        if (o00oOo0O2 >= 0) {
            int i3 = (o00oOo0O2 << 1) + 1;
            Object[] objArr = this.f1731o00oo0O;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~o00oOo0O2;
        int[] iArr = this.f1732o00oo0O0;
        if (i2 >= iArr.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.f1731o00oo0O;
            o00oOOo0(i5);
            if (i2 != this.f1733o00oo0Oo) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f1732o00oo0O0;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f1731o00oo0O, 0, objArr2.length);
            }
            o00oOooO(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f1732o00oo0O0;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f1731o00oo0O;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f1733o00oo0Oo - i4) << 1);
        }
        int i7 = this.f1733o00oo0Oo;
        if (i2 == i7) {
            int[] iArr4 = this.f1732o00oo0O0;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f1731o00oo0O;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f1733o00oo0Oo = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @o0OO00OO
    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    @o0OO00OO
    public V remove(Object obj) {
        int o00oOoO02 = o00oOoO0(obj);
        if (o00oOoO02 >= 0) {
            return o00oOooo(o00oOoO02);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int o00oOoO02 = o00oOoO0(obj);
        if (o00oOoO02 >= 0) {
            V o00oo02 = o00oo0(o00oOoO02);
            if (obj2 == o00oo02 || (obj2 != null && obj2.equals(o00oo02))) {
                o00oOooo(o00oOoO02);
                return true;
            }
            return false;
        }
        return false;
    }

    @o0OO00OO
    public V replace(K k, V v) {
        int o00oOoO02 = o00oOoO0(k);
        if (o00oOoO02 >= 0) {
            return o00oo00O(o00oOoO02, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int o00oOoO02 = o00oOoO0(k);
        if (o00oOoO02 >= 0) {
            V o00oo02 = o00oo0(o00oOoO02);
            if (o00oo02 == v || (v != null && v.equals(o00oo02))) {
                o00oo00O(o00oOoO02, v2);
                return true;
            }
            return false;
        }
        return false;
    }

    public int size() {
        return this.f1733o00oo0Oo;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1733o00oo0Oo * 28);
        sb.append('{');
        for (int i = 0; i < this.f1733o00oo0Oo; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K o00oOoOo2 = o00oOoOo(i);
            if (o00oOoOo2 != this) {
                sb.append(o00oOoOo2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V o00oo02 = o00oo0(i);
            if (o00oo02 != this) {
                sb.append(o00oo02);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
