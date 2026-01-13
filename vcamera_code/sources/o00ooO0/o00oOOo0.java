package o00ooO0;

import java.io.PrintStream;
import java.util.Arrays;
import o00oOoOo.o00oo;
import o00ooO0.o00oOOoO;
/* loaded from: classes.dex */
public class o00oOOo0 implements o00oOOoO.o00oOOo0 {

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final boolean f7898o00oOooo = false;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final boolean f7899o00oo0 = false;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f7900o00oo00O = -1;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static float f7901o00oo0OO = 0.001f;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oOOoO f7903o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o00oOo00 f7904o00oOo00;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f7902o00oOOo0 = 0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f7912o00oOooO = 8;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public o00oo0O f7905o00oOo0O = null;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int[] f7906o00oOo0o = new int[8];

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public int[] f7908o00oOoO0 = new int[8];

    /* renamed from: o00oOoO  reason: collision with root package name */
    public float[] f7907o00oOoO = new float[8];

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public int f7909o00oOoOO = -1;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public int f7910o00oOoOo = -1;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public boolean f7911o00oOoo0 = false;

    public o00oOOo0(o00oOOoO o00ooooo2, o00oOo00 o00ooo002) {
        this.f7903o00oOOoO = o00ooooo2;
        this.f7904o00oOo00 = o00ooo002;
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public final void clear() {
        int i = this.f7909o00oOoOO;
        for (int i2 = 0; i != -1 && i2 < this.f7902o00oOOo0; i2++) {
            o00oo0O o00oo0o2 = this.f7904o00oOo00.f7924o00oOooO[this.f7906o00oOo0o[i]];
            if (o00oo0o2 != null) {
                o00oo0o2.o00oOo0o(this.f7903o00oOOoO);
            }
            i = this.f7908o00oOoO0[i];
        }
        this.f7909o00oOoOO = -1;
        this.f7910o00oOoOo = -1;
        this.f7911o00oOoo0 = false;
        this.f7902o00oOOo0 = 0;
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public final void o00oOOo0(o00oo0O o00oo0o2, float f) {
        if (f == 0.0f) {
            o00oOoo0(o00oo0o2, true);
            return;
        }
        int i = this.f7909o00oOoOO;
        if (i == -1) {
            this.f7909o00oOoOO = 0;
            this.f7907o00oOoO[0] = f;
            this.f7906o00oOo0o[0] = o00oo0o2.f8019o00oOo00;
            this.f7908o00oOoO0[0] = -1;
            o00oo0o2.f8030o00oo00O++;
            o00oo0o2.o00oOOo0(this.f7903o00oOOoO);
            this.f7902o00oOOo0++;
            if (this.f7911o00oOoo0) {
                return;
            }
            int i2 = this.f7910o00oOoOo + 1;
            this.f7910o00oOoOo = i2;
            int[] iArr = this.f7906o00oOo0o;
            if (i2 >= iArr.length) {
                this.f7911o00oOoo0 = true;
                this.f7910o00oOoOo = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f7902o00oOOo0; i4++) {
            int i5 = this.f7906o00oOo0o[i];
            int i6 = o00oo0o2.f8019o00oOo00;
            if (i5 == i6) {
                this.f7907o00oOoO[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f7908o00oOoO0[i];
        }
        int i7 = this.f7910o00oOoOo;
        int i8 = i7 + 1;
        if (this.f7911o00oOoo0) {
            int[] iArr2 = this.f7906o00oOo0o;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f7906o00oOo0o;
        if (i7 >= iArr3.length && this.f7902o00oOOo0 < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f7906o00oOo0o;
                if (i9 >= iArr4.length) {
                    break;
                } else if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr5 = this.f7906o00oOo0o;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.f7912o00oOooO * 2;
            this.f7912o00oOooO = i10;
            this.f7911o00oOoo0 = false;
            this.f7910o00oOoOo = i7 - 1;
            this.f7907o00oOoO = Arrays.copyOf(this.f7907o00oOoO, i10);
            this.f7906o00oOo0o = Arrays.copyOf(this.f7906o00oOo0o, this.f7912o00oOooO);
            this.f7908o00oOoO0 = Arrays.copyOf(this.f7908o00oOoO0, this.f7912o00oOooO);
        }
        this.f7906o00oOo0o[i7] = o00oo0o2.f8019o00oOo00;
        this.f7907o00oOoO[i7] = f;
        int[] iArr6 = this.f7908o00oOoO0;
        if (i3 != -1) {
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            iArr6[i7] = this.f7909o00oOoOO;
            this.f7909o00oOoOO = i7;
        }
        o00oo0o2.f8030o00oo00O++;
        o00oo0o2.o00oOOo0(this.f7903o00oOOoO);
        int i11 = this.f7902o00oOOo0 + 1;
        this.f7902o00oOOo0 = i11;
        if (!this.f7911o00oOoo0) {
            this.f7910o00oOoOo++;
        }
        int[] iArr7 = this.f7906o00oOo0o;
        if (i11 >= iArr7.length) {
            this.f7911o00oOoo0 = true;
        }
        if (this.f7910o00oOoOo >= iArr7.length) {
            this.f7911o00oOoo0 = true;
            this.f7910o00oOoOo = iArr7.length - 1;
        }
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public o00oo0O o00oOOoO(int i) {
        int i2 = this.f7909o00oOoOO;
        for (int i3 = 0; i2 != -1 && i3 < this.f7902o00oOOo0; i3++) {
            if (i3 == i) {
                return this.f7904o00oOo00.f7924o00oOooO[this.f7906o00oOo0o[i2]];
            }
            i2 = this.f7908o00oOoO0[i2];
        }
        return null;
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public void o00oOo00() {
        int i = this.f7909o00oOoOO;
        for (int i2 = 0; i != -1 && i2 < this.f7902o00oOOo0; i2++) {
            float[] fArr = this.f7907o00oOoO;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f7908o00oOoO0[i];
        }
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public void o00oOo0O(o00oo0O o00oo0o2, float f, boolean z) {
        float f2 = f7901o00oo0OO;
        if (f <= (-f2) || f >= f2) {
            int i = this.f7909o00oOoOO;
            if (i == -1) {
                this.f7909o00oOoOO = 0;
                this.f7907o00oOoO[0] = f;
                this.f7906o00oOo0o[0] = o00oo0o2.f8019o00oOo00;
                this.f7908o00oOoO0[0] = -1;
                o00oo0o2.f8030o00oo00O++;
                o00oo0o2.o00oOOo0(this.f7903o00oOOoO);
                this.f7902o00oOOo0++;
                if (this.f7911o00oOoo0) {
                    return;
                }
                int i2 = this.f7910o00oOoOo + 1;
                this.f7910o00oOoOo = i2;
                int[] iArr = this.f7906o00oOo0o;
                if (i2 >= iArr.length) {
                    this.f7911o00oOoo0 = true;
                    this.f7910o00oOoOo = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f7902o00oOOo0; i4++) {
                int i5 = this.f7906o00oOo0o[i];
                int i6 = o00oo0o2.f8019o00oOo00;
                if (i5 == i6) {
                    float[] fArr = this.f7907o00oOoO;
                    float f3 = fArr[i] + f;
                    float f4 = f7901o00oo0OO;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f7909o00oOoOO) {
                            this.f7909o00oOoOO = this.f7908o00oOoO0[i];
                        } else {
                            int[] iArr2 = this.f7908o00oOoO0;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            o00oo0o2.o00oOo0o(this.f7903o00oOOoO);
                        }
                        if (this.f7911o00oOoo0) {
                            this.f7910o00oOoOo = i;
                        }
                        o00oo0o2.f8030o00oo00O--;
                        this.f7902o00oOOo0--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f7908o00oOoO0[i];
            }
            int i7 = this.f7910o00oOoOo;
            int i8 = i7 + 1;
            if (this.f7911o00oOoo0) {
                int[] iArr3 = this.f7906o00oOo0o;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f7906o00oOo0o;
            if (i7 >= iArr4.length && this.f7902o00oOOo0 < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f7906o00oOo0o;
                    if (i9 >= iArr5.length) {
                        break;
                    } else if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr6 = this.f7906o00oOo0o;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.f7912o00oOooO * 2;
                this.f7912o00oOooO = i10;
                this.f7911o00oOoo0 = false;
                this.f7910o00oOoOo = i7 - 1;
                this.f7907o00oOoO = Arrays.copyOf(this.f7907o00oOoO, i10);
                this.f7906o00oOo0o = Arrays.copyOf(this.f7906o00oOo0o, this.f7912o00oOooO);
                this.f7908o00oOoO0 = Arrays.copyOf(this.f7908o00oOoO0, this.f7912o00oOooO);
            }
            this.f7906o00oOo0o[i7] = o00oo0o2.f8019o00oOo00;
            this.f7907o00oOoO[i7] = f;
            int[] iArr7 = this.f7908o00oOoO0;
            if (i3 != -1) {
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                iArr7[i7] = this.f7909o00oOoOO;
                this.f7909o00oOoOO = i7;
            }
            o00oo0o2.f8030o00oo00O++;
            o00oo0o2.o00oOOo0(this.f7903o00oOOoO);
            this.f7902o00oOOo0++;
            if (!this.f7911o00oOoo0) {
                this.f7910o00oOoOo++;
            }
            int i11 = this.f7910o00oOoOo;
            int[] iArr8 = this.f7906o00oOo0o;
            if (i11 >= iArr8.length) {
                this.f7911o00oOoo0 = true;
                this.f7910o00oOoOo = iArr8.length - 1;
            }
        }
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public int o00oOo0o() {
        return (this.f7906o00oOo0o.length * 4 * 3) + 0 + 36;
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public int o00oOoO() {
        return this.f7902o00oOOo0;
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public void o00oOoO0() {
        int i = this.f7902o00oOOo0;
        System.out.print("{ ");
        for (int i2 = 0; i2 < i; i2++) {
            o00oo0O o00oOOoO2 = o00oOOoO(i2);
            if (o00oOOoO2 != null) {
                PrintStream printStream = System.out;
                printStream.print(o00oOOoO2 + " = " + o00oOooo(i2) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public float o00oOoOO(o00oOOoO o00ooooo2, boolean z) {
        float o00oOooO2 = o00oOooO(o00ooooo2.f7915o00oOOo0);
        o00oOoo0(o00ooooo2.f7915o00oOOo0, z);
        o00oOOoO.o00oOOo0 o00oooo02 = o00ooooo2.f7918o00oOo0O;
        int o00oOoO2 = o00oooo02.o00oOoO();
        for (int i = 0; i < o00oOoO2; i++) {
            o00oo0O o00oOOoO2 = o00oooo02.o00oOOoO(i);
            o00oOo0O(o00oOOoO2, o00oooo02.o00oOooO(o00oOOoO2) * o00oOooO2, z);
        }
        return o00oOooO2;
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public int o00oOoOo(o00oo0O o00oo0o2) {
        int i = this.f7909o00oOoOO;
        if (i == -1) {
            return -1;
        }
        for (int i2 = 0; i != -1 && i2 < this.f7902o00oOOo0; i2++) {
            if (this.f7906o00oOo0o[i] == o00oo0o2.f8019o00oOo00) {
                return i;
            }
            i = this.f7908o00oOoO0[i];
        }
        return -1;
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public final float o00oOoo0(o00oo0O o00oo0o2, boolean z) {
        if (this.f7905o00oOo0O == o00oo0o2) {
            this.f7905o00oOo0O = null;
        }
        int i = this.f7909o00oOoOO;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f7902o00oOOo0) {
            if (this.f7906o00oOo0o[i] == o00oo0o2.f8019o00oOo00) {
                if (i == this.f7909o00oOoOO) {
                    this.f7909o00oOoOO = this.f7908o00oOoO0[i];
                } else {
                    int[] iArr = this.f7908o00oOoO0;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    o00oo0o2.o00oOo0o(this.f7903o00oOOoO);
                }
                o00oo0o2.f8030o00oo00O--;
                this.f7902o00oOOo0--;
                this.f7906o00oOo0o[i] = -1;
                if (this.f7911o00oOoo0) {
                    this.f7910o00oOoOo = i;
                }
                return this.f7907o00oOoO[i];
            }
            i2++;
            i3 = i;
            i = this.f7908o00oOoO0[i];
        }
        return 0.0f;
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public final float o00oOooO(o00oo0O o00oo0o2) {
        int i = this.f7909o00oOoOO;
        for (int i2 = 0; i != -1 && i2 < this.f7902o00oOOo0; i2++) {
            if (this.f7906o00oOo0o[i] == o00oo0o2.f8019o00oOo00) {
                return this.f7907o00oOoO[i];
            }
            i = this.f7908o00oOoO0[i];
        }
        return 0.0f;
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public float o00oOooo(int i) {
        int i2 = this.f7909o00oOoOO;
        for (int i3 = 0; i2 != -1 && i3 < this.f7902o00oOOo0; i3++) {
            if (i3 == i) {
                return this.f7907o00oOoO[i2];
            }
            i2 = this.f7908o00oOoO0[i2];
        }
        return 0.0f;
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public void o00oo0(float f) {
        int i = this.f7909o00oOoOO;
        for (int i2 = 0; i != -1 && i2 < this.f7902o00oOOo0; i2++) {
            float[] fArr = this.f7907o00oOoO;
            fArr[i] = fArr[i] / f;
            i = this.f7908o00oOoO0[i];
        }
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public boolean o00oo00O(o00oo0O o00oo0o2) {
        int i = this.f7909o00oOoOO;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f7902o00oOOo0; i2++) {
            if (this.f7906o00oOo0o[i] == o00oo0o2.f8019o00oOo00) {
                return true;
            }
            i = this.f7908o00oOoO0[i];
        }
        return false;
    }

    public final int o00oo0O(int i) {
        return this.f7908o00oOoO0[i];
    }

    public final int o00oo0O0(int i) {
        return this.f7906o00oOo0o[i];
    }

    public int o00oo0OO() {
        return this.f7909o00oOoOO;
    }

    public o00oo0O o00oo0Oo() {
        o00oo0O o00oo0o2 = this.f7905o00oOo0O;
        if (o00oo0o2 == null) {
            int i = this.f7909o00oOoOO;
            o00oo0O o00oo0o3 = null;
            for (int i2 = 0; i != -1 && i2 < this.f7902o00oOOo0; i2++) {
                if (this.f7907o00oOoO[i] < 0.0f) {
                    o00oo0O o00oo0o4 = this.f7904o00oOo00.f7924o00oOooO[this.f7906o00oOo0o[i]];
                    if (o00oo0o3 == null || o00oo0o3.f8020o00oOo0O < o00oo0o4.f8020o00oOo0O) {
                        o00oo0o3 = o00oo0o4;
                    }
                }
                i = this.f7908o00oOoO0[i];
            }
            return o00oo0o3;
        }
        return o00oo0o2;
    }

    public boolean o00oo0o() {
        int i = this.f7909o00oOoOO;
        for (int i2 = 0; i != -1 && i2 < this.f7902o00oOOo0; i2++) {
            if (this.f7907o00oOoO[i] > 0.0f) {
                return true;
            }
            i = this.f7908o00oOoO0[i];
        }
        return false;
    }

    public final float o00oo0o0(int i) {
        return this.f7907o00oOoO[i];
    }

    public String toString() {
        int i = this.f7909o00oOoOO;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f7902o00oOOo0; i2++) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(o00oo.o00oOOo0(str, " -> "));
            o00oOOo02.append(this.f7907o00oOoO[i]);
            o00oOOo02.append(" : ");
            StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0(o00oOOo02.toString());
            o00oOOo03.append(this.f7904o00oOo00.f7924o00oOooO[this.f7906o00oOo0o[i]]);
            str = o00oOOo03.toString();
            i = this.f7908o00oOoO0[i];
        }
        return str;
    }
}
