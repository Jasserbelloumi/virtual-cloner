package o00ooO0;

import java.util.Arrays;
import java.util.Comparator;
import o00ooO0.o00oOOoO;
/* loaded from: classes.dex */
public class o00oo0O0 extends o00ooO0.o00oOOoO {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f8035o00oo0O = -1;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final boolean f8036o00oo0O0 = false;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final float f8037o00oo0OO = 1.0E-4f;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public int f8038o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public o00oo0O[] f8039o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public o00oo0O[] f8040o00oOoo0;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public int f8041o00oOooo;

    /* renamed from: o00oo0  reason: collision with root package name */
    public o00oOo00 f8042o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public o00oOOoO f8043o00oo00O;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Comparator<o00oo0O> {
        public o00oOOo0() {
        }

        @Override // java.util.Comparator
        /* renamed from: o00oOOo0 */
        public int compare(o00oo0O o00oo0o2, o00oo0O o00oo0o3) {
            return o00oo0o2.f8019o00oOo00 - o00oo0o3.f8019o00oOo00;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Comparable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public o00oo0O0 f8045o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public o00oo0O f8046o00oo0O0;

        public o00oOOoO(o00oo0O0 o00oo0o02) {
            this.f8045o00oo0O = o00oo0o02;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f8046o00oo0O0.f8019o00oOo00 - ((o00oo0O) obj).f8019o00oOo00;
        }

        public void o00oOOoO(o00oo0O o00oo0o2) {
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f8046o00oo0O0.f8024o00oOoOO;
                float f = fArr[i] + o00oo0o2.f8024o00oOoOO[i];
                fArr[i] = f;
                if (Math.abs(f) < 1.0E-4f) {
                    this.f8046o00oo0O0.f8024o00oOoOO[i] = 0.0f;
                }
            }
        }

        public void o00oOo0O(o00oo0O o00oo0o2) {
            this.f8046o00oo0O0 = o00oo0o2;
        }

        public final boolean o00oOo0o() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f8046o00oo0O0.f8024o00oOoOO[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean o00oOoO() {
            for (int i = 0; i < 9; i++) {
                if (this.f8046o00oo0O0.f8024o00oOoOO[i] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public final boolean o00oOoOo(o00oo0O o00oo0o2) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = o00oo0o2.f8024o00oOoOO[i];
                float f2 = this.f8046o00oo0O0.f8024o00oOoOO[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        public void o00oOoo0() {
            Arrays.fill(this.f8046o00oo0O0.f8024o00oOoOO, 0.0f);
        }

        public boolean o00oOooO(o00oo0O o00oo0o2, float f) {
            boolean z = true;
            if (!this.f8046o00oo0O0.f8017o00oOOo0) {
                for (int i = 0; i < 9; i++) {
                    float f2 = o00oo0o2.f8024o00oOoOO[i];
                    if (f2 != 0.0f) {
                        float f3 = f2 * f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        this.f8046o00oo0O0.f8024o00oOoOO[i] = f3;
                    } else {
                        this.f8046o00oo0O0.f8024o00oOoOO[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.f8046o00oo0O0.f8024o00oOoOO;
                float f4 = (o00oo0o2.f8024o00oOoOO[i2] * f) + fArr[i2];
                fArr[i2] = f4;
                if (Math.abs(f4) < 1.0E-4f) {
                    this.f8046o00oo0O0.f8024o00oOoOO[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                o00oo0O0.this.o00ooo00(this.f8046o00oo0O0);
            }
            return false;
        }

        public String toString() {
            String str = "[ ";
            if (this.f8046o00oo0O0 != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(str);
                    o00oOOo02.append(this.f8046o00oo0O0.f8024o00oOoOO[i]);
                    o00oOOo02.append(" ");
                    str = o00oOOo02.toString();
                }
            }
            StringBuilder o00oOOo03 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(str, "] ");
            o00oOOo03.append(this.f8046o00oo0O0);
            return o00oOOo03.toString();
        }
    }

    public o00oo0O0(o00oOo00 o00ooo002) {
        super(o00ooo002);
        this.f8038o00oOoOO = 128;
        this.f8039o00oOoOo = new o00oo0O[128];
        this.f8040o00oOoo0 = new o00oo0O[128];
        this.f8041o00oOooo = 0;
        this.f8043o00oo00O = new o00oOOoO(this);
        this.f8042o00oo0 = o00ooo002;
    }

    @Override // o00ooO0.o00oOOoO, o00ooO0.o00oo00O.o00oOOo0
    public void clear() {
        this.f8041o00oOooo = 0;
        this.f7916o00oOOoO = 0.0f;
    }

    @Override // o00ooO0.o00oOOoO, o00ooO0.o00oo00O.o00oOOo0
    public boolean isEmpty() {
        return this.f8041o00oOooo == 0;
    }

    @Override // o00ooO0.o00oOOoO, o00ooO0.o00oo00O.o00oOOo0
    public o00oo0O o00oOOoO(o00oo00O o00oo00o, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f8041o00oOooo; i2++) {
            o00oo0O o00oo0o2 = this.f8039o00oOoOo[i2];
            if (!zArr[o00oo0o2.f8019o00oOo00]) {
                this.f8043o00oo00O.o00oOo0O(o00oo0o2);
                o00oOOoO o00ooooo2 = this.f8043o00oo00O;
                if (i == -1) {
                    if (!o00ooooo2.o00oOo0o()) {
                    }
                    i = i2;
                } else {
                    if (!o00ooooo2.o00oOoOo(this.f8039o00oOoOo[i])) {
                    }
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f8039o00oOoOo[i];
    }

    @Override // o00ooO0.o00oOOoO, o00ooO0.o00oo00O.o00oOOo0
    public void o00oOo00(o00oo00O o00oo00o, o00ooO0.o00oOOoO o00ooooo2, boolean z) {
        o00oo0O o00oo0o2 = o00ooooo2.f7915o00oOOo0;
        if (o00oo0o2 == null) {
            return;
        }
        o00oOOoO.o00oOOo0 o00oooo02 = o00ooooo2.f7918o00oOo0O;
        int o00oOoO2 = o00oooo02.o00oOoO();
        for (int i = 0; i < o00oOoO2; i++) {
            o00oo0O o00oOOoO2 = o00oooo02.o00oOOoO(i);
            float o00oOooo2 = o00oooo02.o00oOooo(i);
            this.f8043o00oo00O.o00oOo0O(o00oOOoO2);
            if (this.f8043o00oo00O.o00oOooO(o00oo0o2, o00oOooo2)) {
                o00ooOoo(o00oOOoO2);
            }
            this.f7916o00oOOoO = (o00ooooo2.f7916o00oOOoO * o00oOooo2) + this.f7916o00oOOoO;
        }
        o00ooo00(o00oo0o2);
    }

    @Override // o00ooO0.o00oOOoO, o00ooO0.o00oo00O.o00oOOo0
    public void o00oOooO(o00oo0O o00oo0o2) {
        this.f8043o00oo00O.o00oOo0O(o00oo0o2);
        this.f8043o00oo00O.o00oOoo0();
        o00oo0o2.f8024o00oOoOO[o00oo0o2.f8020o00oOo0O] = 1.0f;
        o00ooOoo(o00oo0o2);
    }

    public final void o00ooOoo(o00oo0O o00oo0o2) {
        int i;
        int i2 = this.f8041o00oOooo + 1;
        o00oo0O[] o00oo0oArr = this.f8039o00oOoOo;
        if (i2 > o00oo0oArr.length) {
            o00oo0O[] o00oo0oArr2 = (o00oo0O[]) Arrays.copyOf(o00oo0oArr, o00oo0oArr.length * 2);
            this.f8039o00oOoOo = o00oo0oArr2;
            this.f8040o00oOoo0 = (o00oo0O[]) Arrays.copyOf(o00oo0oArr2, o00oo0oArr2.length * 2);
        }
        o00oo0O[] o00oo0oArr3 = this.f8039o00oOoOo;
        int i3 = this.f8041o00oOooo;
        o00oo0oArr3[i3] = o00oo0o2;
        int i4 = i3 + 1;
        this.f8041o00oOooo = i4;
        if (i4 > 1 && o00oo0oArr3[i4 - 1].f8019o00oOo00 > o00oo0o2.f8019o00oOo00) {
            int i5 = 0;
            while (true) {
                i = this.f8041o00oOooo;
                if (i5 >= i) {
                    break;
                }
                this.f8040o00oOoo0[i5] = this.f8039o00oOoOo[i5];
                i5++;
            }
            Arrays.sort(this.f8040o00oOoo0, 0, i, new o00oOOo0());
            for (int i6 = 0; i6 < this.f8041o00oOooo; i6++) {
                this.f8039o00oOoOo[i6] = this.f8040o00oOoo0[i6];
            }
        }
        o00oo0o2.f8017o00oOOo0 = true;
        o00oo0o2.o00oOOo0(this);
    }

    public final void o00ooo00(o00oo0O o00oo0o2) {
        int i = 0;
        while (i < this.f8041o00oOooo) {
            if (this.f8039o00oOoOo[i] == o00oo0o2) {
                while (true) {
                    int i2 = this.f8041o00oOooo;
                    if (i >= i2 - 1) {
                        this.f8041o00oOooo = i2 - 1;
                        o00oo0o2.f8017o00oOOo0 = false;
                        return;
                    }
                    o00oo0O[] o00oo0oArr = this.f8039o00oOoOo;
                    int i3 = i + 1;
                    o00oo0oArr[i] = o00oo0oArr[i3];
                    i = i3;
                }
            } else {
                i++;
            }
        }
    }

    @Override // o00ooO0.o00oOOoO
    public String toString() {
        StringBuilder o00oOOo02 = androidx.appcompat.widget.o00oOo0O.o00oOOo0("", " goal -> (");
        o00oOOo02.append(this.f7916o00oOOoO);
        o00oOOo02.append(") : ");
        String sb = o00oOOo02.toString();
        for (int i = 0; i < this.f8041o00oOooo; i++) {
            this.f8043o00oo00O.o00oOo0O(this.f8039o00oOoOo[i]);
            sb = sb + this.f8043o00oo00O + " ";
        }
        return sb;
    }
}
