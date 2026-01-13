package androidx.collection;

import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00ooO<E> implements Cloneable {

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final Object f1717o00oo0o = new Object();

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int[] f1718o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public boolean f1719o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public Object[] f1720o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f1721o00oo0o0;

    public o00ooO() {
        this(10);
    }

    public o00ooO(int i) {
        this.f1719o00oo0O0 = false;
        if (i == 0) {
            this.f1718o00oo0O = o00oo0.f1701o00oOOo0;
            this.f1720o00oo0Oo = o00oo0.f1703o00oOo00;
            return;
        }
        int o00oOo0O2 = o00oo0.o00oOo0O(i);
        this.f1718o00oo0O = new int[o00oOo0O2];
        this.f1720o00oo0Oo = new Object[o00oOo0O2];
    }

    public void o00oOOoO(int i, E e) {
        int i2 = this.f1721o00oo0o0;
        if (i2 != 0 && i <= this.f1718o00oo0O[i2 - 1]) {
            o00oo0Oo(i, e);
            return;
        }
        if (this.f1719o00oo0O0 && i2 >= this.f1718o00oo0O.length) {
            o00oOoo0();
        }
        int i3 = this.f1721o00oo0o0;
        if (i3 >= this.f1718o00oo0O.length) {
            int o00oOo0O2 = o00oo0.o00oOo0O(i3 + 1);
            int[] iArr = new int[o00oOo0O2];
            Object[] objArr = new Object[o00oOo0O2];
            int[] iArr2 = this.f1718o00oo0O;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f1720o00oo0Oo;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1718o00oo0O = iArr;
            this.f1720o00oo0Oo = objArr;
        }
        this.f1718o00oo0O[i3] = i;
        this.f1720o00oo0Oo[i3] = e;
        this.f1721o00oo0o0 = i3 + 1;
    }

    public void o00oOo00() {
        int i = this.f1721o00oo0o0;
        Object[] objArr = this.f1720o00oo0Oo;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1721o00oo0o0 = 0;
        this.f1719o00oo0O0 = false;
    }

    public boolean o00oOo0o(int i) {
        return o00oo0(i) >= 0;
    }

    public boolean o00oOoOO(E e) {
        return o00oo0OO(e) >= 0;
    }

    @Deprecated
    public void o00oOoOo(int i) {
        o00oo0oO(i);
    }

    public final void o00oOoo0() {
        int i = this.f1721o00oo0o0;
        int[] iArr = this.f1718o00oo0O;
        Object[] objArr = this.f1720o00oo0Oo;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1717o00oo0o) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1719o00oo0O0 = false;
        this.f1721o00oo0o0 = i2;
    }

    /* renamed from: o00oOooO */
    public o00ooO<E> clone() {
        try {
            o00ooO<E> o00ooo = (o00ooO) super.clone();
            o00ooo.f1718o00oo0O = (int[]) this.f1718o00oo0O.clone();
            o00ooo.f1720o00oo0Oo = (Object[]) this.f1720o00oo0Oo.clone();
            return o00ooo;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @o0OO00OO
    public E o00oOooo(int i) {
        return o00oo00O(i, null);
    }

    public void o00oo(int i) {
        Object[] objArr = this.f1720o00oo0Oo;
        Object obj = objArr[i];
        Object obj2 = f1717o00oo0o;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f1719o00oo0O0 = true;
        }
    }

    public int o00oo0(int i) {
        if (this.f1719o00oo0O0) {
            o00oOoo0();
        }
        return o00oo0.o00oOOo0(this.f1718o00oo0O, this.f1721o00oo0o0, i);
    }

    public E o00oo00O(int i, E e) {
        E e2;
        int o00oOOo02 = o00oo0.o00oOOo0(this.f1718o00oo0O, this.f1721o00oo0o0, i);
        return (o00oOOo02 < 0 || (e2 = (E) this.f1720o00oo0Oo[o00oOOo02]) == f1717o00oo0o) ? e : e2;
    }

    public int o00oo0O(int i) {
        if (this.f1719o00oo0O0) {
            o00oOoo0();
        }
        return this.f1718o00oo0O[i];
    }

    public boolean o00oo0O0() {
        return o00ooO() == 0;
    }

    public int o00oo0OO(E e) {
        if (this.f1719o00oo0O0) {
            o00oOoo0();
        }
        for (int i = 0; i < this.f1721o00oo0o0; i++) {
            if (this.f1720o00oo0Oo[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public void o00oo0Oo(int i, E e) {
        int o00oOOo02 = o00oo0.o00oOOo0(this.f1718o00oo0O, this.f1721o00oo0o0, i);
        if (o00oOOo02 >= 0) {
            this.f1720o00oo0Oo[o00oOOo02] = e;
            return;
        }
        int i2 = ~o00oOOo02;
        int i3 = this.f1721o00oo0o0;
        if (i2 < i3) {
            Object[] objArr = this.f1720o00oo0Oo;
            if (objArr[i2] == f1717o00oo0o) {
                this.f1718o00oo0O[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f1719o00oo0O0 && i3 >= this.f1718o00oo0O.length) {
            o00oOoo0();
            i2 = ~o00oo0.o00oOOo0(this.f1718o00oo0O, this.f1721o00oo0o0, i);
        }
        int i4 = this.f1721o00oo0o0;
        if (i4 >= this.f1718o00oo0O.length) {
            int o00oOo0O2 = o00oo0.o00oOo0O(i4 + 1);
            int[] iArr = new int[o00oOo0O2];
            Object[] objArr2 = new Object[o00oOo0O2];
            int[] iArr2 = this.f1718o00oo0O;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1720o00oo0Oo;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1718o00oo0O = iArr;
            this.f1720o00oo0Oo = objArr2;
        }
        int i5 = this.f1721o00oo0o0;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f1718o00oo0O;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f1720o00oo0Oo;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f1721o00oo0o0 - i2);
        }
        this.f1718o00oo0O[i2] = i;
        this.f1720o00oo0Oo[i2] = e;
        this.f1721o00oo0o0++;
    }

    @o0OO00OO
    public E o00oo0o(int i, E e) {
        E o00oOooo2 = o00oOooo(i);
        if (o00oOooo2 == null) {
            o00oo0Oo(i, e);
        }
        return o00oOooo2;
    }

    public void o00oo0o0(@oo0oO0 o00ooO<? extends E> o00ooo) {
        int o00ooO2 = o00ooo.o00ooO();
        for (int i = 0; i < o00ooO2; i++) {
            o00oo0Oo(o00ooo.o00oo0O(i), o00ooo.o00ooOO0(i));
        }
    }

    public void o00oo0oO(int i) {
        int o00oOOo02 = o00oo0.o00oOOo0(this.f1718o00oo0O, this.f1721o00oo0o0, i);
        if (o00oOOo02 >= 0) {
            Object[] objArr = this.f1720o00oo0Oo;
            Object obj = objArr[o00oOOo02];
            Object obj2 = f1717o00oo0o;
            if (obj != obj2) {
                objArr[o00oOOo02] = obj2;
                this.f1719o00oo0O0 = true;
            }
        }
    }

    public int o00ooO() {
        if (this.f1719o00oo0O0) {
            o00oOoo0();
        }
        return this.f1721o00oo0o0;
    }

    @o0OO00OO
    public E o00ooO0(int i, E e) {
        int o00oo02 = o00oo0(i);
        if (o00oo02 >= 0) {
            Object[] objArr = this.f1720o00oo0Oo;
            E e2 = (E) objArr[o00oo02];
            objArr[o00oo02] = e;
            return e2;
        }
        return null;
    }

    public void o00ooO00(int i, int i2) {
        int min = Math.min(this.f1721o00oo0o0, i2 + i);
        while (i < min) {
            o00oo(i);
            i++;
        }
    }

    public boolean o00ooO0O(int i, E e, E e2) {
        int o00oo02 = o00oo0(i);
        if (o00oo02 >= 0) {
            Object obj = this.f1720o00oo0Oo[o00oo02];
            if (obj == e || (e != null && e.equals(obj))) {
                this.f1720o00oo0Oo[o00oo02] = e2;
                return true;
            }
            return false;
        }
        return false;
    }

    public void o00ooO0o(int i, E e) {
        if (this.f1719o00oo0O0) {
            o00oOoo0();
        }
        this.f1720o00oo0Oo[i] = e;
    }

    public E o00ooOO0(int i) {
        if (this.f1719o00oo0O0) {
            o00oOoo0();
        }
        return (E) this.f1720o00oo0Oo[i];
    }

    public boolean o0O0o(int i, Object obj) {
        int o00oo02 = o00oo0(i);
        if (o00oo02 >= 0) {
            E o00ooOO02 = o00ooOO0(o00oo02);
            if (obj == o00ooOO02 || (obj != null && obj.equals(o00ooOO02))) {
                o00oo(o00oo02);
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString() {
        if (o00ooO() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1721o00oo0o0 * 28);
        sb.append('{');
        for (int i = 0; i < this.f1721o00oo0o0; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(o00oo0O(i));
            sb.append('=');
            E o00ooOO02 = o00ooOO0(i);
            if (o00ooOO02 != this) {
                sb.append(o00ooOO02);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
