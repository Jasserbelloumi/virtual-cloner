package androidx.collection;
/* loaded from: classes.dex */
public final class o00oo00O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int[] f1704o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f1705o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f1706o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f1707o00oOooO;

    public o00oo00O() {
        this(8);
    }

    public o00oo00O(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.f1707o00oOooO = i - 1;
        this.f1704o00oOOo0 = new int[i];
    }

    public void o00oOOo0(int i) {
        int i2 = (this.f1705o00oOOoO - 1) & this.f1707o00oOooO;
        this.f1705o00oOOoO = i2;
        this.f1704o00oOOo0[i2] = i;
        if (i2 == this.f1706o00oOo00) {
            o00oOooO();
        }
    }

    public void o00oOOoO(int i) {
        int[] iArr = this.f1704o00oOOo0;
        int i2 = this.f1706o00oOo00;
        iArr[i2] = i;
        int i3 = this.f1707o00oOooO & (i2 + 1);
        this.f1706o00oOo00 = i3;
        if (i3 == this.f1705o00oOOoO) {
            o00oOooO();
        }
    }

    public void o00oOo00() {
        this.f1706o00oOo00 = this.f1705o00oOOoO;
    }

    public int o00oOo0O(int i) {
        if (i < 0 || i >= o00oo00O()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f1704o00oOOo0[this.f1707o00oOooO & (this.f1705o00oOOoO + i)];
    }

    public int o00oOo0o() {
        int i = this.f1705o00oOOoO;
        if (i != this.f1706o00oOo00) {
            return this.f1704o00oOOo0[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean o00oOoO() {
        return this.f1705o00oOOoO == this.f1706o00oOo00;
    }

    public int o00oOoO0() {
        int i = this.f1705o00oOOoO;
        int i2 = this.f1706o00oOo00;
        if (i != i2) {
            return this.f1704o00oOOo0[(i2 - 1) & this.f1707o00oOooO];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int o00oOoOO() {
        int i = this.f1705o00oOOoO;
        if (i != this.f1706o00oOo00) {
            int i2 = this.f1704o00oOOo0[i];
            this.f1705o00oOOoO = (i + 1) & this.f1707o00oOooO;
            return i2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int o00oOoOo() {
        int i = this.f1705o00oOOoO;
        int i2 = this.f1706o00oOo00;
        if (i != i2) {
            int i3 = this.f1707o00oOooO & (i2 - 1);
            int i4 = this.f1704o00oOOo0[i3];
            this.f1706o00oOo00 = i3;
            return i4;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void o00oOoo0(int i) {
        if (i <= 0) {
            return;
        }
        if (i > o00oo00O()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f1706o00oOo00 = this.f1707o00oOooO & (this.f1706o00oOo00 - i);
    }

    public final void o00oOooO() {
        int[] iArr = this.f1704o00oOOo0;
        int length = iArr.length;
        int i = this.f1705o00oOOoO;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i3];
        System.arraycopy(iArr, i, iArr2, 0, i2);
        System.arraycopy(this.f1704o00oOOo0, 0, iArr2, i2, this.f1705o00oOOoO);
        this.f1704o00oOOo0 = iArr2;
        this.f1705o00oOOoO = 0;
        this.f1706o00oOo00 = length;
        this.f1707o00oOooO = i3 - 1;
    }

    public void o00oOooo(int i) {
        if (i <= 0) {
            return;
        }
        if (i > o00oo00O()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f1705o00oOOoO = this.f1707o00oOooO & (this.f1705o00oOOoO + i);
    }

    public int o00oo00O() {
        return (this.f1706o00oOo00 - this.f1705o00oOOoO) & this.f1707o00oOooO;
    }
}
