package androidx.collection;

import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oo0OO<E> implements Cloneable {

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final Object f1712o00oo0o = new Object();

    /* renamed from: o00oo0O  reason: collision with root package name */
    public long[] f1713o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public boolean f1714o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public Object[] f1715o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f1716o00oo0o0;

    public o00oo0OO() {
        this(10);
    }

    public o00oo0OO(int i) {
        this.f1714o00oo0O0 = false;
        if (i == 0) {
            this.f1713o00oo0O = o00oo0.f1702o00oOOoO;
            this.f1715o00oo0Oo = o00oo0.f1703o00oOo00;
            return;
        }
        int o00oOo0o2 = o00oo0.o00oOo0o(i);
        this.f1713o00oo0O = new long[o00oOo0o2];
        this.f1715o00oo0Oo = new Object[o00oOo0o2];
    }

    public void o00oOOoO(long j, E e) {
        int i = this.f1716o00oo0o0;
        if (i != 0 && j <= this.f1713o00oo0O[i - 1]) {
            o00oo0Oo(j, e);
            return;
        }
        if (this.f1714o00oo0O0 && i >= this.f1713o00oo0O.length) {
            o00oOoo0();
        }
        int i2 = this.f1716o00oo0o0;
        if (i2 >= this.f1713o00oo0O.length) {
            int o00oOo0o2 = o00oo0.o00oOo0o(i2 + 1);
            long[] jArr = new long[o00oOo0o2];
            Object[] objArr = new Object[o00oOo0o2];
            long[] jArr2 = this.f1713o00oo0O;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f1715o00oo0Oo;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1713o00oo0O = jArr;
            this.f1715o00oo0Oo = objArr;
        }
        this.f1713o00oo0O[i2] = j;
        this.f1715o00oo0Oo[i2] = e;
        this.f1716o00oo0o0 = i2 + 1;
    }

    public void o00oOo00() {
        int i = this.f1716o00oo0o0;
        Object[] objArr = this.f1715o00oo0Oo;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1716o00oo0o0 = 0;
        this.f1714o00oo0O0 = false;
    }

    public boolean o00oOo0o(long j) {
        return o00oo0(j) >= 0;
    }

    public boolean o00oOoOO(E e) {
        return o00oo0OO(e) >= 0;
    }

    @Deprecated
    public void o00oOoOo(long j) {
        o00oo0oO(j);
    }

    public final void o00oOoo0() {
        int i = this.f1716o00oo0o0;
        long[] jArr = this.f1713o00oo0O;
        Object[] objArr = this.f1715o00oo0Oo;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1712o00oo0o) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1714o00oo0O0 = false;
        this.f1716o00oo0o0 = i2;
    }

    /* renamed from: o00oOooO */
    public o00oo0OO<E> clone() {
        try {
            o00oo0OO<E> o00oo0oo = (o00oo0OO) super.clone();
            o00oo0oo.f1713o00oo0O = (long[]) this.f1713o00oo0O.clone();
            o00oo0oo.f1715o00oo0Oo = (Object[]) this.f1715o00oo0Oo.clone();
            return o00oo0oo;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @o0OO00OO
    public E o00oOooo(long j) {
        return o00oo00O(j, null);
    }

    public void o00oo(int i) {
        Object[] objArr = this.f1715o00oo0Oo;
        Object obj = objArr[i];
        Object obj2 = f1712o00oo0o;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f1714o00oo0O0 = true;
        }
    }

    public int o00oo0(long j) {
        if (this.f1714o00oo0O0) {
            o00oOoo0();
        }
        return o00oo0.o00oOOoO(this.f1713o00oo0O, this.f1716o00oo0o0, j);
    }

    public E o00oo00O(long j, E e) {
        E e2;
        int o00oOOoO2 = o00oo0.o00oOOoO(this.f1713o00oo0O, this.f1716o00oo0o0, j);
        return (o00oOOoO2 < 0 || (e2 = (E) this.f1715o00oo0Oo[o00oOOoO2]) == f1712o00oo0o) ? e : e2;
    }

    public long o00oo0O(int i) {
        if (this.f1714o00oo0O0) {
            o00oOoo0();
        }
        return this.f1713o00oo0O[i];
    }

    public boolean o00oo0O0() {
        return o00ooO0o() == 0;
    }

    public int o00oo0OO(E e) {
        if (this.f1714o00oo0O0) {
            o00oOoo0();
        }
        for (int i = 0; i < this.f1716o00oo0o0; i++) {
            if (this.f1715o00oo0Oo[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public void o00oo0Oo(long j, E e) {
        int o00oOOoO2 = o00oo0.o00oOOoO(this.f1713o00oo0O, this.f1716o00oo0o0, j);
        if (o00oOOoO2 >= 0) {
            this.f1715o00oo0Oo[o00oOOoO2] = e;
            return;
        }
        int i = ~o00oOOoO2;
        int i2 = this.f1716o00oo0o0;
        if (i < i2) {
            Object[] objArr = this.f1715o00oo0Oo;
            if (objArr[i] == f1712o00oo0o) {
                this.f1713o00oo0O[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f1714o00oo0O0 && i2 >= this.f1713o00oo0O.length) {
            o00oOoo0();
            i = ~o00oo0.o00oOOoO(this.f1713o00oo0O, this.f1716o00oo0o0, j);
        }
        int i3 = this.f1716o00oo0o0;
        if (i3 >= this.f1713o00oo0O.length) {
            int o00oOo0o2 = o00oo0.o00oOo0o(i3 + 1);
            long[] jArr = new long[o00oOo0o2];
            Object[] objArr2 = new Object[o00oOo0o2];
            long[] jArr2 = this.f1713o00oo0O;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1715o00oo0Oo;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1713o00oo0O = jArr;
            this.f1715o00oo0Oo = objArr2;
        }
        int i4 = this.f1716o00oo0o0;
        if (i4 - i != 0) {
            long[] jArr3 = this.f1713o00oo0O;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f1715o00oo0Oo;
            System.arraycopy(objArr4, i, objArr4, i5, this.f1716o00oo0o0 - i);
        }
        this.f1713o00oo0O[i] = j;
        this.f1715o00oo0Oo[i] = e;
        this.f1716o00oo0o0++;
    }

    @o0OO00OO
    public E o00oo0o(long j, E e) {
        E o00oOooo2 = o00oOooo(j);
        if (o00oOooo2 == null) {
            o00oo0Oo(j, e);
        }
        return o00oOooo2;
    }

    public void o00oo0o0(@oo0oO0 o00oo0OO<? extends E> o00oo0oo) {
        int o00ooO0o2 = o00oo0oo.o00ooO0o();
        for (int i = 0; i < o00ooO0o2; i++) {
            o00oo0Oo(o00oo0oo.o00oo0O(i), o00oo0oo.o00ooO(i));
        }
    }

    public void o00oo0oO(long j) {
        int o00oOOoO2 = o00oo0.o00oOOoO(this.f1713o00oo0O, this.f1716o00oo0o0, j);
        if (o00oOOoO2 >= 0) {
            Object[] objArr = this.f1715o00oo0Oo;
            Object obj = objArr[o00oOOoO2];
            Object obj2 = f1712o00oo0o;
            if (obj != obj2) {
                objArr[o00oOOoO2] = obj2;
                this.f1714o00oo0O0 = true;
            }
        }
    }

    public E o00ooO(int i) {
        if (this.f1714o00oo0O0) {
            o00oOoo0();
        }
        return (E) this.f1715o00oo0Oo[i];
    }

    public boolean o00ooO0(long j, E e, E e2) {
        int o00oo02 = o00oo0(j);
        if (o00oo02 >= 0) {
            Object obj = this.f1715o00oo0Oo[o00oo02];
            if (obj == e || (e != null && e.equals(obj))) {
                this.f1715o00oo0Oo[o00oo02] = e2;
                return true;
            }
            return false;
        }
        return false;
    }

    @o0OO00OO
    public E o00ooO00(long j, E e) {
        int o00oo02 = o00oo0(j);
        if (o00oo02 >= 0) {
            Object[] objArr = this.f1715o00oo0Oo;
            E e2 = (E) objArr[o00oo02];
            objArr[o00oo02] = e;
            return e2;
        }
        return null;
    }

    public void o00ooO0O(int i, E e) {
        if (this.f1714o00oo0O0) {
            o00oOoo0();
        }
        this.f1715o00oo0Oo[i] = e;
    }

    public int o00ooO0o() {
        if (this.f1714o00oo0O0) {
            o00oOoo0();
        }
        return this.f1716o00oo0o0;
    }

    public boolean o0O0o(long j, Object obj) {
        int o00oo02 = o00oo0(j);
        if (o00oo02 >= 0) {
            E o00ooO2 = o00ooO(o00oo02);
            if (obj == o00ooO2 || (obj != null && obj.equals(o00ooO2))) {
                o00oo(o00oo02);
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString() {
        if (o00ooO0o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1716o00oo0o0 * 28);
        sb.append('{');
        for (int i = 0; i < this.f1716o00oo0o0; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(o00oo0O(i));
            sb.append('=');
            E o00ooO2 = o00ooO(i);
            if (o00ooO2 != this) {
                sb.append(o00ooO2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
