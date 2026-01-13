package o00ooO0;

import java.io.PrintStream;
import java.util.Arrays;
import o00oOoOo.o00oo;
import o00ooO0.o00oOOoO;
/* loaded from: classes.dex */
public class o0O0o implements o00oOOoO.o00oOOo0 {

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final boolean f8051o00oo0 = false;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static float f8052o00oo0O0 = 0.001f;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final boolean f8053o00oo0OO = true;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public final o00oOOoO f8065o00oOooo;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public final o00oOo00 f8066o00oo00O;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final int f8054o00oOOo0 = -1;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f8055o00oOOoO = 16;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f8056o00oOo00 = 16;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int[] f8064o00oOooO = new int[16];

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int[] f8057o00oOo0O = new int[16];

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int[] f8058o00oOo0o = new int[16];

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public float[] f8060o00oOoO0 = new float[16];

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int[] f8059o00oOoO = new int[16];

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public int[] f8061o00oOoOO = new int[16];

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public int f8062o00oOoOo = 0;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public int f8063o00oOoo0 = -1;

    public o0O0o(o00oOOoO o00ooooo2, o00oOo00 o00ooo002) {
        this.f8065o00oOooo = o00ooooo2;
        this.f8066o00oo00O = o00ooo002;
        clear();
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public void clear() {
        int i = this.f8062o00oOoOo;
        for (int i2 = 0; i2 < i; i2++) {
            o00oo0O o00oOOoO2 = o00oOOoO(i2);
            if (o00oOOoO2 != null) {
                o00oOOoO2.o00oOo0o(this.f8065o00oOooo);
            }
        }
        for (int i3 = 0; i3 < this.f8055o00oOOoO; i3++) {
            this.f8058o00oOo0o[i3] = -1;
            this.f8057o00oOo0O[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f8056o00oOo00; i4++) {
            this.f8064o00oOooO[i4] = -1;
        }
        this.f8062o00oOoOo = 0;
        this.f8063o00oOoo0 = -1;
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public void o00oOOo0(o00oo0O o00oo0o2, float f) {
        float f2 = f8052o00oo0O0;
        if (f > (-f2) && f < f2) {
            o00oOoo0(o00oo0o2, true);
            return;
        }
        if (this.f8062o00oOoOo == 0) {
            o00oo0O0(0, o00oo0o2, f);
            o00oo0OO(o00oo0o2, 0);
            this.f8063o00oOoo0 = 0;
            return;
        }
        int o00oOoOo2 = o00oOoOo(o00oo0o2);
        if (o00oOoOo2 != -1) {
            this.f8060o00oOoO0[o00oOoOo2] = f;
            return;
        }
        if (this.f8062o00oOoOo + 1 >= this.f8055o00oOOoO) {
            o00oo0o0();
        }
        int i = this.f8062o00oOoOo;
        int i2 = this.f8063o00oOoo0;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = this.f8058o00oOo0o[i2];
            int i6 = o00oo0o2.f8019o00oOo00;
            if (i5 == i6) {
                this.f8060o00oOoO0[i2] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i2;
            }
            i2 = this.f8061o00oOoOO[i2];
            if (i2 == -1) {
                break;
            }
        }
        o00oo0o(i3, o00oo0o2, f);
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public o00oo0O o00oOOoO(int i) {
        int i2 = this.f8062o00oOoOo;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f8063o00oOoo0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f8066o00oo00O.f7924o00oOooO[this.f8058o00oOo0o[i3]];
            }
            i3 = this.f8061o00oOoOO[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public void o00oOo00() {
        int i = this.f8062o00oOoOo;
        int i2 = this.f8063o00oOoo0;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f8060o00oOoO0;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f8061o00oOoOO[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public void o00oOo0O(o00oo0O o00oo0o2, float f, boolean z) {
        float f2 = f8052o00oo0O0;
        if (f <= (-f2) || f >= f2) {
            int o00oOoOo2 = o00oOoOo(o00oo0o2);
            if (o00oOoOo2 == -1) {
                o00oOOo0(o00oo0o2, f);
                return;
            }
            float[] fArr = this.f8060o00oOoO0;
            float f3 = fArr[o00oOoOo2] + f;
            fArr[o00oOoOo2] = f3;
            float f4 = f8052o00oo0O0;
            if (f3 <= (-f4) || f3 >= f4) {
                return;
            }
            fArr[o00oOoOo2] = 0.0f;
            o00oOoo0(o00oo0o2, z);
        }
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public int o00oOo0o() {
        return 0;
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public int o00oOoO() {
        return this.f8062o00oOoOo;
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public void o00oOoO0() {
        int i = this.f8062o00oOoOo;
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
        o0O0o o0o0o = (o0O0o) o00ooooo2.f7918o00oOo0O;
        int o00oOoO2 = o0o0o.o00oOoO();
        int i = 0;
        int i2 = 0;
        while (i < o00oOoO2) {
            int i3 = o0o0o.f8058o00oOo0o[i2];
            if (i3 != -1) {
                o00oOo0O(this.f8066o00oo00O.f7924o00oOooO[i3], o0o0o.f8060o00oOoO0[i2] * o00oOooO2, z);
                i++;
            }
            i2++;
        }
        return o00oOooO2;
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public int o00oOoOo(o00oo0O o00oo0o2) {
        if (this.f8062o00oOoOo != 0 && o00oo0o2 != null) {
            int i = o00oo0o2.f8019o00oOo00;
            int i2 = this.f8064o00oOooO[i % this.f8056o00oOo00];
            if (i2 == -1) {
                return -1;
            }
            if (this.f8058o00oOo0o[i2] == i) {
                return i2;
            }
            do {
                i2 = this.f8057o00oOo0O[i2];
                if (i2 == -1) {
                    break;
                }
            } while (this.f8058o00oOo0o[i2] != i);
            if (i2 != -1 && this.f8058o00oOo0o[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public float o00oOoo0(o00oo0O o00oo0o2, boolean z) {
        int o00oOoOo2 = o00oOoOo(o00oo0o2);
        if (o00oOoOo2 == -1) {
            return 0.0f;
        }
        o00oo0oO(o00oo0o2);
        float f = this.f8060o00oOoO0[o00oOoOo2];
        if (this.f8063o00oOoo0 == o00oOoOo2) {
            this.f8063o00oOoo0 = this.f8061o00oOoOO[o00oOoOo2];
        }
        this.f8058o00oOo0o[o00oOoOo2] = -1;
        int[] iArr = this.f8059o00oOoO;
        int i = iArr[o00oOoOo2];
        if (i != -1) {
            int[] iArr2 = this.f8061o00oOoOO;
            iArr2[i] = iArr2[o00oOoOo2];
        }
        int i2 = this.f8061o00oOoOO[o00oOoOo2];
        if (i2 != -1) {
            iArr[i2] = iArr[o00oOoOo2];
        }
        this.f8062o00oOoOo--;
        o00oo0o2.f8030o00oo00O--;
        if (z) {
            o00oo0o2.o00oOo0o(this.f8065o00oOooo);
        }
        return f;
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public float o00oOooO(o00oo0O o00oo0o2) {
        int o00oOoOo2 = o00oOoOo(o00oo0o2);
        if (o00oOoOo2 != -1) {
            return this.f8060o00oOoO0[o00oOoOo2];
        }
        return 0.0f;
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public float o00oOooo(int i) {
        int i2 = this.f8062o00oOoOo;
        int i3 = this.f8063o00oOoo0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f8060o00oOoO0[i3];
            }
            i3 = this.f8061o00oOoOO[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public void o00oo0(float f) {
        int i = this.f8062o00oOoOo;
        int i2 = this.f8063o00oOoo0;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f8060o00oOoO0;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f8061o00oOoOO[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // o00ooO0.o00oOOoO.o00oOOo0
    public boolean o00oo00O(o00oo0O o00oo0o2) {
        return o00oOoOo(o00oo0o2) != -1;
    }

    public final void o00oo0O() {
        for (int i = 0; i < this.f8056o00oOo00; i++) {
            if (this.f8064o00oOooO[i] != -1) {
                String str = hashCode() + " hash [" + i + "] => ";
                int i2 = this.f8064o00oOooO[i];
                boolean z = false;
                while (!z) {
                    StringBuilder o00oOOo02 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(str, " ");
                    o00oOOo02.append(this.f8058o00oOo0o[i2]);
                    str = o00oOOo02.toString();
                    int i3 = this.f8057o00oOo0O[i2];
                    if (i3 != -1) {
                        i2 = i3;
                    } else {
                        z = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    public final void o00oo0O0(int i, o00oo0O o00oo0o2, float f) {
        this.f8058o00oOo0o[i] = o00oo0o2.f8019o00oOo00;
        this.f8060o00oOoO0[i] = f;
        this.f8059o00oOoO[i] = -1;
        this.f8061o00oOoOO[i] = -1;
        o00oo0o2.o00oOOo0(this.f8065o00oOooo);
        o00oo0o2.f8030o00oo00O++;
        this.f8062o00oOoOo++;
    }

    public final void o00oo0OO(o00oo0O o00oo0o2, int i) {
        int[] iArr;
        int i2 = o00oo0o2.f8019o00oOo00 % this.f8056o00oOo00;
        int[] iArr2 = this.f8064o00oOooO;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f8057o00oOo0O;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                }
                i3 = i4;
            }
            iArr[i3] = i;
        }
        this.f8057o00oOo0O[i] = -1;
    }

    public final int o00oo0Oo() {
        for (int i = 0; i < this.f8055o00oOOoO; i++) {
            if (this.f8058o00oOo0o[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    public final void o00oo0o(int i, o00oo0O o00oo0o2, float f) {
        int o00oo0Oo2 = o00oo0Oo();
        o00oo0O0(o00oo0Oo2, o00oo0o2, f);
        if (i != -1) {
            this.f8059o00oOoO[o00oo0Oo2] = i;
            int[] iArr = this.f8061o00oOoOO;
            iArr[o00oo0Oo2] = iArr[i];
            iArr[i] = o00oo0Oo2;
        } else {
            this.f8059o00oOoO[o00oo0Oo2] = -1;
            if (this.f8062o00oOoOo > 0) {
                this.f8061o00oOoOO[o00oo0Oo2] = this.f8063o00oOoo0;
                this.f8063o00oOoo0 = o00oo0Oo2;
            } else {
                this.f8061o00oOoOO[o00oo0Oo2] = -1;
            }
        }
        int i2 = this.f8061o00oOoOO[o00oo0Oo2];
        if (i2 != -1) {
            this.f8059o00oOoO[i2] = o00oo0Oo2;
        }
        o00oo0OO(o00oo0o2, o00oo0Oo2);
    }

    public final void o00oo0o0() {
        int i = this.f8055o00oOOoO * 2;
        this.f8058o00oOo0o = Arrays.copyOf(this.f8058o00oOo0o, i);
        this.f8060o00oOoO0 = Arrays.copyOf(this.f8060o00oOoO0, i);
        this.f8059o00oOoO = Arrays.copyOf(this.f8059o00oOoO, i);
        this.f8061o00oOoOO = Arrays.copyOf(this.f8061o00oOoOO, i);
        this.f8057o00oOo0O = Arrays.copyOf(this.f8057o00oOo0O, i);
        for (int i2 = this.f8055o00oOOoO; i2 < i; i2++) {
            this.f8058o00oOo0o[i2] = -1;
            this.f8057o00oOo0O[i2] = -1;
        }
        this.f8055o00oOOoO = i;
    }

    public final void o00oo0oO(o00oo0O o00oo0o2) {
        int[] iArr;
        int i;
        int i2 = o00oo0o2.f8019o00oOo00;
        int i3 = i2 % this.f8056o00oOo00;
        int[] iArr2 = this.f8064o00oOooO;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            return;
        }
        if (this.f8058o00oOo0o[i4] == i2) {
            int[] iArr3 = this.f8057o00oOo0O;
            iArr2[i3] = iArr3[i4];
            iArr3[i4] = -1;
            return;
        }
        while (true) {
            iArr = this.f8057o00oOo0O;
            i = iArr[i4];
            if (i == -1 || this.f8058o00oOo0o[i] == i2) {
                break;
            }
            i4 = i;
        }
        if (i == -1 || this.f8058o00oOo0o[i] != i2) {
            return;
        }
        iArr[i4] = iArr[i];
        iArr[i] = -1;
    }

    public String toString() {
        StringBuilder o00oOOo02;
        String o00oOOo03;
        String str = hashCode() + " { ";
        int i = this.f8062o00oOoOo;
        for (int i2 = 0; i2 < i; i2++) {
            o00oo0O o00oOOoO2 = o00oOOoO(i2);
            if (o00oOOoO2 != null) {
                String str2 = str + o00oOOoO2 + " = " + o00oOooo(i2) + " ";
                int o00oOoOo2 = o00oOoOo(o00oOOoO2);
                String o00oOOo04 = o00oo.o00oOOo0(str2, "[p: ");
                if (this.f8059o00oOoO[o00oOoOo2] != -1) {
                    o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(o00oOOo04);
                    o00oOOo02.append(this.f8066o00oo00O.f7924o00oOooO[this.f8058o00oOo0o[this.f8059o00oOoO[o00oOoOo2]]]);
                } else {
                    o00oOOo02 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(o00oOOo04, "none");
                }
                String o00oOOo05 = o00oo.o00oOOo0(o00oOOo02.toString(), ", n: ");
                if (this.f8061o00oOoOO[o00oOoOo2] != -1) {
                    StringBuilder o00oOOo06 = android.support.v4.media.o00oOo0O.o00oOOo0(o00oOOo05);
                    o00oOOo06.append(this.f8066o00oo00O.f7924o00oOooO[this.f8058o00oOo0o[this.f8061o00oOoOO[o00oOoOo2]]]);
                    o00oOOo03 = o00oOOo06.toString();
                } else {
                    o00oOOo03 = o00oo.o00oOOo0(o00oOOo05, "none");
                }
                str = o00oo.o00oOOo0(o00oOOo03, "]");
            }
        }
        return o00oo.o00oOOo0(str, " }");
    }
}
