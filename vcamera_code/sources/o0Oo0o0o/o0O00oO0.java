package o0Oo0o0o;

import java.util.Arrays;
/* loaded from: classes3.dex */
public final class o0O00oO0 {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f16521o00oOo00 = 65535;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f16522o00oOo0O = 2;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f16523o00oOo0o = 4;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f16524o00oOoO = 6;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f16525o00oOoO0 = 5;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f16526o00oOoOO = 7;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f16527o00oOoOo = 10;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f16528o00oOooO = 1;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f16529o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final int[] f16530o00oOOoO = new int[10];

    public void o00oOOo0() {
        this.f16529o00oOOo0 = 0;
        Arrays.fill(this.f16530o00oOOoO, 0);
    }

    public int o00oOOoO(int i) {
        return this.f16530o00oOOoO[i];
    }

    public boolean o00oOo00(boolean z) {
        return ((this.f16529o00oOOo0 & 4) != 0 ? this.f16530o00oOOoO[2] : z ? 1 : 0) == 1;
    }

    public int o00oOo0O() {
        if ((this.f16529o00oOOo0 & 128) != 0) {
            return this.f16530o00oOOoO[7];
        }
        return 65535;
    }

    public int o00oOo0o(int i) {
        return (this.f16529o00oOOo0 & 16) != 0 ? this.f16530o00oOOoO[4] : i;
    }

    public int o00oOoO(int i) {
        return (this.f16529o00oOOo0 & 64) != 0 ? this.f16530o00oOOoO[6] : i;
    }

    public int o00oOoO0(int i) {
        return (this.f16529o00oOOo0 & 32) != 0 ? this.f16530o00oOOoO[5] : i;
    }

    public boolean o00oOoOO(int i) {
        return ((1 << i) & this.f16529o00oOOo0) != 0;
    }

    public void o00oOoOo(o0O00oO0 o0o00oo0) {
        for (int i = 0; i < 10; i++) {
            if (o0o00oo0.o00oOoOO(i)) {
                o00oOoo0(i, o0o00oo0.f16530o00oOOoO[i]);
            }
        }
    }

    public o0O00oO0 o00oOoo0(int i, int i2) {
        int[] iArr = this.f16530o00oOOoO;
        if (i >= iArr.length) {
            return this;
        }
        this.f16529o00oOOo0 = (1 << i) | this.f16529o00oOOo0;
        iArr[i] = i2;
        return this;
    }

    public int o00oOooO() {
        if ((this.f16529o00oOOo0 & 2) != 0) {
            return this.f16530o00oOOoO[1];
        }
        return -1;
    }

    public int o00oOooo() {
        return Integer.bitCount(this.f16529o00oOOo0);
    }
}
