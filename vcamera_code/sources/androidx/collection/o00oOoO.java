package androidx.collection;
/* loaded from: classes.dex */
public final class o00oOoO<E> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public E[] f1682o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f1683o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f1684o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f1685o00oOooO;

    public o00oOoO() {
        this(8);
    }

    public o00oOoO(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.f1685o00oOooO = i - 1;
        this.f1682o00oOOo0 = (E[]) new Object[i];
    }

    public void o00oOOo0(E e) {
        int i = (this.f1683o00oOOoO - 1) & this.f1685o00oOooO;
        this.f1683o00oOOoO = i;
        this.f1682o00oOOo0[i] = e;
        if (i == this.f1684o00oOo00) {
            o00oOooO();
        }
    }

    public void o00oOOoO(E e) {
        E[] eArr = this.f1682o00oOOo0;
        int i = this.f1684o00oOo00;
        eArr[i] = e;
        int i2 = this.f1685o00oOooO & (i + 1);
        this.f1684o00oOo00 = i2;
        if (i2 == this.f1683o00oOOoO) {
            o00oOooO();
        }
    }

    public void o00oOo00() {
        o00oOooo(o00oo00O());
    }

    public E o00oOo0O(int i) {
        if (i < 0 || i >= o00oo00O()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f1682o00oOOo0[this.f1685o00oOooO & (this.f1683o00oOOoO + i)];
    }

    public E o00oOo0o() {
        int i = this.f1683o00oOOoO;
        if (i != this.f1684o00oOo00) {
            return this.f1682o00oOOo0[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean o00oOoO() {
        return this.f1683o00oOOoO == this.f1684o00oOo00;
    }

    public E o00oOoO0() {
        int i = this.f1683o00oOOoO;
        int i2 = this.f1684o00oOo00;
        if (i != i2) {
            return this.f1682o00oOOo0[(i2 - 1) & this.f1685o00oOooO];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E o00oOoOO() {
        int i = this.f1683o00oOOoO;
        if (i != this.f1684o00oOo00) {
            E[] eArr = this.f1682o00oOOo0;
            E e = eArr[i];
            eArr[i] = null;
            this.f1683o00oOOoO = (i + 1) & this.f1685o00oOooO;
            return e;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E o00oOoOo() {
        int i = this.f1683o00oOOoO;
        int i2 = this.f1684o00oOo00;
        if (i != i2) {
            int i3 = this.f1685o00oOooO & (i2 - 1);
            E[] eArr = this.f1682o00oOOo0;
            E e = eArr[i3];
            eArr[i3] = null;
            this.f1684o00oOo00 = i3;
            return e;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void o00oOoo0(int i) {
        int i2;
        if (i <= 0) {
            return;
        }
        if (i > o00oo00O()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.f1684o00oOo00;
        int i4 = i < i3 ? i3 - i : 0;
        int i5 = i4;
        while (true) {
            i2 = this.f1684o00oOo00;
            if (i5 >= i2) {
                break;
            }
            this.f1682o00oOOo0[i5] = null;
            i5++;
        }
        int i6 = i2 - i4;
        int i7 = i - i6;
        this.f1684o00oOo00 = i2 - i6;
        if (i7 > 0) {
            int length = this.f1682o00oOOo0.length;
            this.f1684o00oOo00 = length;
            int i8 = length - i7;
            for (int i9 = i8; i9 < this.f1684o00oOo00; i9++) {
                this.f1682o00oOOo0[i9] = null;
            }
            this.f1684o00oOo00 = i8;
        }
    }

    public final void o00oOooO() {
        E[] eArr = this.f1682o00oOOo0;
        int length = eArr.length;
        int i = this.f1683o00oOOoO;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i3];
        System.arraycopy(eArr, i, eArr2, 0, i2);
        System.arraycopy(this.f1682o00oOOo0, 0, eArr2, i2, this.f1683o00oOOoO);
        this.f1682o00oOOo0 = eArr2;
        this.f1683o00oOOoO = 0;
        this.f1684o00oOo00 = length;
        this.f1685o00oOooO = i3 - 1;
    }

    public void o00oOooo(int i) {
        if (i <= 0) {
            return;
        }
        if (i > o00oo00O()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.f1682o00oOOo0.length;
        int i2 = this.f1683o00oOOoO;
        if (i < length - i2) {
            length = i2 + i;
        }
        while (i2 < length) {
            this.f1682o00oOOo0[i2] = null;
            i2++;
        }
        int i3 = this.f1683o00oOOoO;
        int i4 = length - i3;
        int i5 = i - i4;
        this.f1683o00oOOoO = this.f1685o00oOooO & (i3 + i4);
        if (i5 > 0) {
            for (int i6 = 0; i6 < i5; i6++) {
                this.f1682o00oOOo0[i6] = null;
            }
            this.f1683o00oOOoO = i5;
        }
    }

    public int o00oo00O() {
        return (this.f1684o00oOo00 - this.f1683o00oOOoO) & this.f1685o00oOooO;
    }
}
