package androidx.recyclerview.widget;

import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.o0O00O0;
import androidx.recyclerview.widget.o0O0O0o0;
import androidx.recyclerview.widget.o0ooO;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOo000;
import o00oOooO.oO0Oo;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oOoO<T> {

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final boolean f4324o00oo0o = false;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final String f4325o00oo0o0 = "AsyncListUtil";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Class<T> f4326o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final int f4327o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o00oOo00<T> f4328o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final o0ooO<T> f4329o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final o0O0O0o0.o00oOOoO<T> f4330o00oOo0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final o0O0O0o0.o00oOOo0<T> f4332o00oOoO0;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public boolean f4335o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o00oOo0O f4336o00oOooO;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o0O0O0o0.o00oOOoO<T> f4340o00oo0O;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o0O0O0o0.o00oOOo0<T> f4343o00oo0Oo;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final int[] f4331o00oOoO = new int[2];

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final int[] f4333o00oOoOO = new int[2];

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public final int[] f4334o00oOoOo = new int[2];

    /* renamed from: o00oOooo  reason: collision with root package name */
    public int f4337o00oOooo = 0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public int f4339o00oo00O = 0;

    /* renamed from: o00oo0  reason: collision with root package name */
    public int f4338o00oo0 = 0;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public int f4342o00oo0OO = 0;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final SparseIntArray f4341o00oo0O0 = new SparseIntArray();

    /* loaded from: classes.dex */
    public class o00oOOo0 implements o0O0O0o0.o00oOOoO<T> {
        public o00oOOo0() {
        }

        @Override // androidx.recyclerview.widget.o0O0O0o0.o00oOOoO
        public void o00oOOo0(int i, int i2) {
            o0ooO.o00oOOo0<T> o00oOo0O2;
            if (o00oOooO(i) && (o00oOo0O2 = o00oOoO.this.f4329o00oOo0O.o00oOo0O(i2)) != null) {
                o00oOoO.this.f4332o00oOoO0.o00oOooO(o00oOo0O2);
            }
        }

        @Override // androidx.recyclerview.widget.o0O0O0o0.o00oOOoO
        public void o00oOOoO(int i, o0ooO.o00oOOo0<T> o00oooo02) {
            if (!o00oOooO(i)) {
                o00oOoO.this.f4332o00oOoO0.o00oOooO(o00oooo02);
                return;
            }
            o0ooO.o00oOOo0<T> o00oOOo02 = o00oOoO.this.f4329o00oOo0O.o00oOOo0(o00oooo02);
            if (o00oOOo02 != null) {
                o00oOoO.this.f4332o00oOoO0.o00oOooO(o00oOOo02);
            }
            int i2 = o00oooo02.f4781o00oOOoO + o00oooo02.f4782o00oOo00;
            int i3 = 0;
            while (i3 < o00oOoO.this.f4341o00oo0O0.size()) {
                int keyAt = o00oOoO.this.f4341o00oo0O0.keyAt(i3);
                if (o00oooo02.f4781o00oOOoO > keyAt || keyAt >= i2) {
                    i3++;
                } else {
                    o00oOoO.this.f4341o00oo0O0.removeAt(i3);
                    o00oOoO.this.f4336o00oOooO.o00oOooO(keyAt);
                }
            }
        }

        @Override // androidx.recyclerview.widget.o0O0O0o0.o00oOOoO
        public void o00oOo00(int i, int i2) {
            if (o00oOooO(i)) {
                o00oOoO o00oooo2 = o00oOoO.this;
                o00oooo2.f4339o00oo00O = i2;
                o00oooo2.f4336o00oOooO.o00oOo00();
                o00oOoO o00oooo3 = o00oOoO.this;
                o00oooo3.f4338o00oo0 = o00oooo3.f4342o00oo0OO;
                o00oOo0O();
                o00oOoO o00oooo4 = o00oOoO.this;
                o00oooo4.f4335o00oOoo0 = false;
                o00oooo4.o00oOoO0();
            }
        }

        public final void o00oOo0O() {
            for (int i = 0; i < o00oOoO.this.f4329o00oOo0O.o00oOo0o(); i++) {
                o00oOoO o00oooo2 = o00oOoO.this;
                o00oooo2.f4332o00oOoO0.o00oOooO(o00oooo2.f4329o00oOo0O.o00oOo00(i));
            }
            o00oOoO.this.f4329o00oOo0O.o00oOOoO();
        }

        public final boolean o00oOooO(int i) {
            return i == o00oOoO.this.f4342o00oo0OO;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements o0O0O0o0.o00oOOo0<T> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o0ooO.o00oOOo0<T> f4345o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final SparseBooleanArray f4346o00oOOoO = new SparseBooleanArray();

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f4347o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f4348o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f4349o00oOo0o;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f4351o00oOooO;

        public o00oOOoO() {
        }

        @Override // androidx.recyclerview.widget.o0O0O0o0.o00oOOo0
        public void o00oOOo0(int i, int i2, int i3, int i4, int i5) {
            if (i > i2) {
                return;
            }
            int o00oOoO2 = o00oOoO(i);
            int o00oOoO3 = o00oOoO(i2);
            this.f4348o00oOo0O = o00oOoO(i3);
            int o00oOoO4 = o00oOoO(i4);
            this.f4349o00oOo0o = o00oOoO4;
            if (i5 == 1) {
                o00oOooo(this.f4348o00oOo0O, o00oOoO3, i5, true);
                o00oOooo(o00oOoO3 + o00oOoO.this.f4327o00oOOoO, this.f4349o00oOo0o, i5, false);
                return;
            }
            o00oOooo(o00oOoO2, o00oOoO4, i5, false);
            o00oOooo(this.f4348o00oOo0O, o00oOoO2 - o00oOoO.this.f4327o00oOOoO, i5, true);
        }

        @Override // androidx.recyclerview.widget.o0O0O0o0.o00oOOo0
        public void o00oOOoO(int i, int i2) {
            if (o00oOoOO(i)) {
                return;
            }
            o0ooO.o00oOOo0<T> o00oOo0O2 = o00oOo0O();
            o00oOo0O2.f4781o00oOOoO = i;
            int min = Math.min(o00oOoO.this.f4327o00oOOoO, this.f4351o00oOooO - i);
            o00oOo0O2.f4782o00oOo00 = min;
            o00oOoO.this.f4328o00oOo00.o00oOOo0(o00oOo0O2.f4780o00oOOo0, o00oOo0O2.f4781o00oOOoO, min);
            o00oOoO0(i2);
            o00oOo0o(o00oOo0O2);
        }

        @Override // androidx.recyclerview.widget.o0O0O0o0.o00oOOo0
        public void o00oOo00(int i) {
            this.f4347o00oOo00 = i;
            this.f4346o00oOOoO.clear();
            int o00oOooO2 = o00oOoO.this.f4328o00oOo00.o00oOooO();
            this.f4351o00oOooO = o00oOooO2;
            o00oOoO.this.f4330o00oOo0o.o00oOo00(this.f4347o00oOo00, o00oOooO2);
        }

        public final o0ooO.o00oOOo0<T> o00oOo0O() {
            o0ooO.o00oOOo0<T> o00oooo02 = this.f4345o00oOOo0;
            if (o00oooo02 != null) {
                this.f4345o00oOOo0 = o00oooo02.f4783o00oOooO;
                return o00oooo02;
            }
            o00oOoO o00oooo2 = o00oOoO.this;
            return new o0ooO.o00oOOo0<>(o00oooo2.f4326o00oOOo0, o00oooo2.f4327o00oOOoO);
        }

        public final void o00oOo0o(o0ooO.o00oOOo0<T> o00oooo02) {
            this.f4346o00oOOoO.put(o00oooo02.f4781o00oOOoO, true);
            o00oOoO.this.f4330o00oOo0o.o00oOOoO(this.f4347o00oOo00, o00oooo02);
        }

        public final int o00oOoO(int i) {
            return i - (i % o00oOoO.this.f4327o00oOOoO);
        }

        public final void o00oOoO0(int i) {
            int o00oOOoO2 = o00oOoO.this.f4328o00oOo00.o00oOOoO();
            while (this.f4346o00oOOoO.size() >= o00oOOoO2) {
                int keyAt = this.f4346o00oOOoO.keyAt(0);
                SparseBooleanArray sparseBooleanArray = this.f4346o00oOOoO;
                int keyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int i2 = this.f4348o00oOo0O - keyAt;
                int i3 = keyAt2 - this.f4349o00oOo0o;
                if (i2 > 0 && (i2 >= i3 || i == 2)) {
                    o00oOoo0(keyAt);
                } else if (i3 <= 0) {
                    return;
                } else {
                    if (i2 >= i3 && i != 1) {
                        return;
                    }
                    o00oOoo0(keyAt2);
                }
            }
        }

        public final boolean o00oOoOO(int i) {
            return this.f4346o00oOOoO.get(i);
        }

        public final void o00oOoOo(String str, Object... objArr) {
            String.format(str, objArr);
        }

        public final void o00oOoo0(int i) {
            this.f4346o00oOOoO.delete(i);
            o00oOoO.this.f4330o00oOo0o.o00oOOo0(this.f4347o00oOo00, i);
        }

        @Override // androidx.recyclerview.widget.o0O0O0o0.o00oOOo0
        public void o00oOooO(o0ooO.o00oOOo0<T> o00oooo02) {
            o00oOoO.this.f4328o00oOo00.o00oOo00(o00oooo02.f4780o00oOOo0, o00oooo02.f4782o00oOo00);
            o00oooo02.f4783o00oOooO = this.f4345o00oOOo0;
            this.f4345o00oOOo0 = o00oooo02;
        }

        public final void o00oOooo(int i, int i2, int i3, boolean z) {
            int i4 = i;
            while (i4 <= i2) {
                o00oOoO.this.f4332o00oOoO0.o00oOOoO(z ? (i2 + i) - i4 : i4, i3);
                i4 += o00oOoO.this.f4327o00oOOoO;
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOo00<T> {
        @oO0Oo
        public abstract void o00oOOo0(@oo0oO0 T[] tArr, int i, int i2);

        @oO0Oo
        public int o00oOOoO() {
            return 10;
        }

        @oO0Oo
        public void o00oOo00(@oo0oO0 T[] tArr, int i) {
        }

        @oO0Oo
        public abstract int o00oOooO();
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final int f4352o00oOOo0 = 0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final int f4353o00oOOoO = 1;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final int f4354o00oOo00 = 2;

        @o0OOo000
        public void o00oOOo0(@oo0oO0 int[] iArr, @oo0oO0 int[] iArr2, int i) {
            int i2 = iArr[1];
            int i3 = iArr[0];
            int i4 = (i2 - i3) + 1;
            int i5 = i4 / 2;
            iArr2[0] = i3 - (i == 1 ? i4 : i5);
            if (i != 2) {
                i4 = i5;
            }
            iArr2[1] = i2 + i4;
        }

        @o0OOo000
        public abstract void o00oOOoO(@oo0oO0 int[] iArr);

        @o0OOo000
        public abstract void o00oOo00();

        @o0OOo000
        public abstract void o00oOooO(int i);
    }

    public o00oOoO(@oo0oO0 Class<T> cls, int i, @oo0oO0 o00oOo00<T> o00ooo002, @oo0oO0 o00oOo0O o00ooo0o2) {
        o00oOOo0 o00oooo02 = new o00oOOo0();
        this.f4340o00oo0O = o00oooo02;
        o00oOOoO o00ooooo2 = new o00oOOoO();
        this.f4343o00oo0Oo = o00ooooo2;
        this.f4326o00oOOo0 = cls;
        this.f4327o00oOOoO = i;
        this.f4328o00oOo00 = o00ooo002;
        this.f4336o00oOooO = o00ooo0o2;
        this.f4329o00oOo0O = new o0ooO<>(i);
        o0O00O0 o0o00o0 = new o0O00O0();
        this.f4330o00oOo0o = new o0O00O0.o00oOOo0(o00oooo02);
        this.f4332o00oOoO0 = new o0O00O0.o00oOOoO(o00ooooo2);
        o00oOo0o();
    }

    @o0OO00OO
    public T o00oOOo0(int i) {
        if (i < 0 || i >= this.f4339o00oo00O) {
            throw new IndexOutOfBoundsException(i + " is not within 0 and " + this.f4339o00oo00O);
        }
        T o00oOooO2 = this.f4329o00oOo0O.o00oOooO(i);
        if (o00oOooO2 == null && !o00oOo00()) {
            this.f4341o00oo0O0.put(i, 0);
        }
        return o00oOooO2;
    }

    public int o00oOOoO() {
        return this.f4339o00oo00O;
    }

    public final boolean o00oOo00() {
        return this.f4342o00oo0OO != this.f4338o00oo0;
    }

    public void o00oOo0O() {
        if (o00oOo00()) {
            return;
        }
        o00oOoO0();
        this.f4335o00oOoo0 = true;
    }

    public void o00oOo0o() {
        this.f4341o00oo0O0.clear();
        o0O0O0o0.o00oOOo0<T> o00oooo02 = this.f4332o00oOoO0;
        int i = this.f4342o00oo0OO + 1;
        this.f4342o00oo0OO = i;
        o00oooo02.o00oOo00(i);
    }

    public void o00oOoO0() {
        int i;
        this.f4336o00oOooO.o00oOOoO(this.f4331o00oOoO);
        int[] iArr = this.f4331o00oOoO;
        int i2 = iArr[0];
        int i3 = iArr[1];
        if (i2 > i3 || i2 < 0 || i3 >= this.f4339o00oo00O) {
            return;
        }
        if (this.f4335o00oOoo0) {
            int[] iArr2 = this.f4333o00oOoOO;
            if (i2 <= iArr2[1] && (i = iArr2[0]) <= i3) {
                if (i2 < i) {
                    this.f4337o00oOooo = 1;
                } else if (i2 > i) {
                    this.f4337o00oOooo = 2;
                }
                int[] iArr3 = this.f4333o00oOoOO;
                iArr3[0] = i2;
                iArr3[1] = i3;
                this.f4336o00oOooO.o00oOOo0(iArr, this.f4334o00oOoOo, this.f4337o00oOooo);
                int[] iArr4 = this.f4334o00oOoOo;
                iArr4[0] = Math.min(this.f4331o00oOoO[0], Math.max(iArr4[0], 0));
                int[] iArr5 = this.f4334o00oOoOo;
                iArr5[1] = Math.max(this.f4331o00oOoO[1], Math.min(iArr5[1], this.f4339o00oo00O - 1));
                o0O0O0o0.o00oOOo0<T> o00oooo02 = this.f4332o00oOoO0;
                int[] iArr6 = this.f4331o00oOoO;
                int i4 = iArr6[0];
                int i5 = iArr6[1];
                int[] iArr7 = this.f4334o00oOoOo;
                o00oooo02.o00oOOo0(i4, i5, iArr7[0], iArr7[1], this.f4337o00oOooo);
            }
        }
        this.f4337o00oOooo = 0;
        int[] iArr32 = this.f4333o00oOoOO;
        iArr32[0] = i2;
        iArr32[1] = i3;
        this.f4336o00oOooO.o00oOOo0(iArr, this.f4334o00oOoOo, this.f4337o00oOooo);
        int[] iArr42 = this.f4334o00oOoOo;
        iArr42[0] = Math.min(this.f4331o00oOoO[0], Math.max(iArr42[0], 0));
        int[] iArr52 = this.f4334o00oOoOo;
        iArr52[1] = Math.max(this.f4331o00oOoO[1], Math.min(iArr52[1], this.f4339o00oo00O - 1));
        o0O0O0o0.o00oOOo0<T> o00oooo022 = this.f4332o00oOoO0;
        int[] iArr62 = this.f4331o00oOoO;
        int i42 = iArr62[0];
        int i52 = iArr62[1];
        int[] iArr72 = this.f4334o00oOoOo;
        o00oooo022.o00oOOo0(i42, i52, iArr72[0], iArr72[1], this.f4337o00oOooo);
    }

    public void o00oOooO(String str, Object... objArr) {
        String.format(str, objArr);
    }
}
