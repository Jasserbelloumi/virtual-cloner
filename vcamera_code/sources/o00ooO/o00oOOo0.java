package o00ooO;

import java.util.HashMap;
import o00ooO.o00oOo0O;
import o00ooO.o00oOoO;
/* loaded from: classes.dex */
public class o00oOOo0 extends o00oo0O {

    /* renamed from: o0O0oO  reason: collision with root package name */
    public static final int f7594o0O0oO = 0;

    /* renamed from: o0O0oOO  reason: collision with root package name */
    public static final int f7595o0O0oOO = 2;

    /* renamed from: o0O0oOO0  reason: collision with root package name */
    public static final int f7596o0O0oOO0 = 1;

    /* renamed from: o0O0oOOO  reason: collision with root package name */
    public static final boolean f7597o0O0oOOO = true;

    /* renamed from: o0O0oOo0  reason: collision with root package name */
    public static final boolean f7598o0O0oOo0 = false;

    /* renamed from: o0O0oo00  reason: collision with root package name */
    public static final int f7599o0O0oo00 = 3;

    /* renamed from: oooOO0  reason: collision with root package name */
    public int f7603oooOO0 = 0;

    /* renamed from: o0O0oO0  reason: collision with root package name */
    public boolean f7600o0O0oO0 = true;

    /* renamed from: o0O0oO0O  reason: collision with root package name */
    public int f7601o0O0oO0O = 0;

    /* renamed from: o0O0oO0o  reason: collision with root package name */
    public boolean f7602o0O0oO0o = false;

    public o00oOOo0() {
    }

    public o00oOOo0(String str) {
        o0O0OOoo(str);
    }

    @Override // o00ooO.o00oOoO
    public boolean o00oOoO() {
        return true;
    }

    @Override // o00ooO.o00oOoO
    public void o00oOoO0(o00ooO0.o00oo00O o00oo00o, boolean z) {
        o00oOo0O[] o00ooo0oArr;
        boolean z2;
        o00ooO0.o00oo0O o00oo0o2;
        o00oOo0O o00ooo0o2;
        int i;
        int i2;
        int i3;
        o00ooO0.o00oo0O o00oo0o3;
        int i4;
        o00oOo0O[] o00ooo0oArr2 = this.f7710o00oooo;
        o00ooo0oArr2[0] = this.f7704o00ooo00;
        o00ooo0oArr2[2] = this.f7703o00ooo0;
        o00ooo0oArr2[1] = this.f7705o00ooo0O;
        o00ooo0oArr2[3] = this.f7706o00ooo0o;
        int i5 = 0;
        while (true) {
            o00ooo0oArr = this.f7710o00oooo;
            if (i5 >= o00ooo0oArr.length) {
                break;
            }
            o00oOo0O o00ooo0o3 = o00ooo0oArr[i5];
            o00ooo0o3.f7637o00oOoOO = o00oo00o.o00oo0oO(o00ooo0o3);
            i5++;
        }
        int i6 = this.f7603oooOO0;
        if (i6 < 0 || i6 >= 4) {
            return;
        }
        o00oOo0O o00ooo0o4 = o00ooo0oArr[i6];
        if (!this.f7602o0O0oO0o) {
            oo0ooO();
        }
        if (this.f7602o0O0oO0o) {
            this.f7602o0O0oO0o = false;
            int i7 = this.f7603oooOO0;
            if (i7 == 0 || i7 == 1) {
                o00oo00o.o00oOo0o(this.f7704o00ooo00.f7637o00oOoOO, this.f7753o0OoOoOo);
                o00oo0o3 = this.f7705o00ooo0O.f7637o00oOoOO;
                i4 = this.f7753o0OoOoOo;
            } else if (i7 != 2 && i7 != 3) {
                return;
            } else {
                o00oo00o.o00oOo0o(this.f7703o00ooo0.f7637o00oOoOO, this.f7720o0O000Oo);
                o00oo0o3 = this.f7706o00ooo0o.f7637o00oOoOO;
                i4 = this.f7720o0O000Oo;
            }
            o00oo00o.o00oOo0o(o00oo0o3, i4);
            return;
        }
        for (int i8 = 0; i8 < this.f7852o0O0oo0O; i8++) {
            o00oOoO o00oooo2 = this.f7851o0O0o0oo[i8];
            if ((this.f7600o0O0oO0 || o00oooo2.o00oOoO()) && ((((i2 = this.f7603oooOO0) == 0 || i2 == 1) && o00oooo2.o00ooOoO() == o00oOoO.o00oOOoO.MATCH_CONSTRAINT && o00oooo2.f7704o00ooo00.f7634o00oOo0o != null && o00oooo2.f7705o00ooo0O.f7634o00oOo0o != null) || (((i3 = this.f7603oooOO0) == 2 || i3 == 3) && o00oooo2.o0O000oo() == o00oOoO.o00oOOoO.MATCH_CONSTRAINT && o00oooo2.f7703o00ooo0.f7634o00oOo0o != null && o00oooo2.f7706o00ooo0o.f7634o00oOo0o != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.f7704o00ooo00.o00oo00O() || this.f7705o00ooo0O.o00oo00O();
        boolean z4 = this.f7703o00ooo0.o00oo00O() || this.f7706o00ooo0o.o00oo00O();
        int i9 = !z2 && (((i = this.f7603oooOO0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4)))) ? 5 : 4;
        for (int i10 = 0; i10 < this.f7852o0O0oo0O; i10++) {
            o00oOoO o00oooo3 = this.f7851o0O0o0oo[i10];
            if (this.f7600o0O0oO0 || o00oooo3.o00oOoO()) {
                o00ooO0.o00oo0O o00oo0oO2 = o00oo00o.o00oo0oO(o00oooo3.f7710o00oooo[this.f7603oooOO0]);
                o00oOo0O[] o00ooo0oArr3 = o00oooo3.f7710o00oooo;
                int i11 = this.f7603oooOO0;
                o00oOo0O o00ooo0o5 = o00ooo0oArr3[i11];
                o00ooo0o5.f7637o00oOoOO = o00oo0oO2;
                o00oOo0O o00ooo0o6 = o00ooo0o5.f7634o00oOo0o;
                int i12 = (o00ooo0o6 == null || o00ooo0o6.f7638o00oOooO != this) ? 0 : o00ooo0o5.f7636o00oOoO0 + 0;
                if (i11 == 0 || i11 == 2) {
                    o00oo00o.o00oOoOo(o00ooo0o4.f7637o00oOoOO, o00oo0oO2, this.f7601o0O0oO0O - i12, z2);
                } else {
                    o00oo00o.o00oOoO(o00ooo0o4.f7637o00oOoOO, o00oo0oO2, this.f7601o0O0oO0O + i12, z2);
                }
                o00oo00o.o00oOo0O(o00ooo0o4.f7637o00oOoOO, o00oo0oO2, this.f7601o0O0oO0O + i12, i9);
            }
        }
        int i13 = this.f7603oooOO0;
        if (i13 == 0) {
            o00oo00o.o00oOo0O(this.f7705o00ooo0O.f7637o00oOoOO, this.f7704o00ooo00.f7637o00oOoOO, 0, 8);
            o00oo00o.o00oOo0O(this.f7704o00ooo00.f7637o00oOoOO, this.f7716o0O00000.f7705o00ooo0O.f7637o00oOoOO, 0, 4);
            o00oo0o2 = this.f7704o00ooo00.f7637o00oOoOO;
            o00ooo0o2 = this.f7716o0O00000.f7704o00ooo00;
        } else if (i13 == 1) {
            o00oo00o.o00oOo0O(this.f7704o00ooo00.f7637o00oOoOO, this.f7705o00ooo0O.f7637o00oOoOO, 0, 8);
            o00oo00o.o00oOo0O(this.f7704o00ooo00.f7637o00oOoOO, this.f7716o0O00000.f7704o00ooo00.f7637o00oOoOO, 0, 4);
            o00oo0o2 = this.f7704o00ooo00.f7637o00oOoOO;
            o00ooo0o2 = this.f7716o0O00000.f7705o00ooo0O;
        } else if (i13 == 2) {
            o00oo00o.o00oOo0O(this.f7706o00ooo0o.f7637o00oOoOO, this.f7703o00ooo0.f7637o00oOoOO, 0, 8);
            o00oo00o.o00oOo0O(this.f7703o00ooo0.f7637o00oOoOO, this.f7716o0O00000.f7706o00ooo0o.f7637o00oOoOO, 0, 4);
            o00oo0o2 = this.f7703o00ooo0.f7637o00oOoOO;
            o00ooo0o2 = this.f7716o0O00000.f7703o00ooo0;
        } else if (i13 != 3) {
            return;
        } else {
            o00oo00o.o00oOo0O(this.f7703o00ooo0.f7637o00oOoOO, this.f7706o00ooo0o.f7637o00oOoOO, 0, 8);
            o00oo00o.o00oOo0O(this.f7703o00ooo0.f7637o00oOoOO, this.f7716o0O00000.f7703o00ooo0.f7637o00oOoOO, 0, 4);
            o00oo0o2 = this.f7703o00ooo0.f7637o00oOoOO;
            o00ooo0o2 = this.f7716o0O00000.f7706o00ooo0o;
        }
        o00oo00o.o00oOo0O(o00oo0o2, o00ooo0o2.f7637o00oOoOO, 0, 0);
    }

    @Override // o00ooO.o00oo0O, o00ooO.o00oOoO
    public void o00oo0(o00oOoO o00oooo2, HashMap<o00oOoO, o00oOoO> hashMap) {
        super.o00oo0(o00oooo2, hashMap);
        o00oOOo0 o00oooo02 = (o00oOOo0) o00oooo2;
        this.f7603oooOO0 = o00oooo02.f7603oooOO0;
        this.f7600o0O0oO0 = o00oooo02.f7600o0O0oO0;
        this.f7601o0O0oO0O = o00oooo02.f7601o0O0oO0O;
    }

    @Override // o00ooO.o00oOoO
    public boolean o0O0O0O() {
        return this.f7602o0O0oO0o;
    }

    public void o0OO0(int i) {
        this.f7603oooOO0 = i;
    }

    public boolean o0OO00OO() {
        return this.f7600o0O0oO0;
    }

    public int o0OO00Oo() {
        return this.f7601o0O0oO0O;
    }

    public void o0OO00o(boolean z) {
        this.f7600o0O0oO0 = z;
    }

    public int o0OO00o0() {
        int i = this.f7603oooOO0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    public int o0OO00oo() {
        return this.f7603oooOO0;
    }

    public void o0OO0O0(int i) {
        this.f7601o0O0oO0O = i;
    }

    public void o0OoOoO() {
        for (int i = 0; i < this.f7852o0O0oo0O; i++) {
            o00oOoO o00oooo2 = this.f7851o0O0o0oo[i];
            int i2 = this.f7603oooOO0;
            if (i2 == 0 || i2 == 1) {
                o00oooo2.o0O0o0o(0, true);
            } else if (i2 == 2 || i2 == 3) {
                o00oooo2.o0O0o0o(1, true);
            }
        }
    }

    @Override // o00ooO.o00oOoO
    public boolean o0oO0O0o() {
        return this.f7602o0O0oO0o;
    }

    public boolean oo0ooO() {
        int i;
        o00oOo0O.o00oOOoO o00ooooo2;
        o00oOo0O.o00oOOoO o00ooooo3;
        o00oOo0O.o00oOOoO o00ooooo4;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.f7852o0O0oo0O;
            if (i4 >= i) {
                break;
            }
            o00oOoO o00oooo2 = this.f7851o0O0o0oo[i4];
            if ((this.f7600o0O0oO0 || o00oooo2.o00oOoO()) && ((((i2 = this.f7603oooOO0) == 0 || i2 == 1) && !o00oooo2.o0O0O0O()) || (((i3 = this.f7603oooOO0) == 2 || i3 == 3) && !o00oooo2.o0oO0O0o()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.f7852o0O0oo0O; i6++) {
            o00oOoO o00oooo3 = this.f7851o0O0o0oo[i6];
            if (this.f7600o0O0oO0 || o00oooo3.o00oOoO()) {
                if (!z2) {
                    int i7 = this.f7603oooOO0;
                    if (i7 == 0) {
                        o00ooooo4 = o00oOo0O.o00oOOoO.LEFT;
                    } else if (i7 == 1) {
                        o00ooooo4 = o00oOo0O.o00oOOoO.RIGHT;
                    } else if (i7 == 2) {
                        o00ooooo4 = o00oOo0O.o00oOOoO.TOP;
                    } else {
                        if (i7 == 3) {
                            o00ooooo4 = o00oOo0O.o00oOOoO.BOTTOM;
                        }
                        z2 = true;
                    }
                    i5 = o00oooo3.o00oo0Oo(o00ooooo4).o00oOo0o();
                    z2 = true;
                }
                int i8 = this.f7603oooOO0;
                if (i8 == 0) {
                    o00ooooo3 = o00oOo0O.o00oOOoO.LEFT;
                } else {
                    if (i8 == 1) {
                        o00ooooo2 = o00oOo0O.o00oOOoO.RIGHT;
                    } else if (i8 == 2) {
                        o00ooooo3 = o00oOo0O.o00oOOoO.TOP;
                    } else if (i8 == 3) {
                        o00ooooo2 = o00oOo0O.o00oOOoO.BOTTOM;
                    }
                    i5 = Math.max(i5, o00oooo3.o00oo0Oo(o00ooooo2).o00oOo0o());
                }
                i5 = Math.min(i5, o00oooo3.o00oo0Oo(o00ooooo3).o00oOo0o());
            }
        }
        int i9 = i5 + this.f7601o0O0oO0O;
        int i10 = this.f7603oooOO0;
        if (i10 == 0 || i10 == 1) {
            o0O0OoO0(i9, i9);
        } else {
            o0O0OoOo(i9, i9);
        }
        this.f7602o0O0oO0o = true;
        return true;
    }

    @Override // o00ooO.o00oOoO
    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("[Barrier] ");
        o00oOOo02.append(o00ooO0());
        o00oOOo02.append(" {");
        String sb = o00oOOo02.toString();
        for (int i = 0; i < this.f7852o0O0oo0O; i++) {
            o00oOoO o00oooo2 = this.f7851o0O0o0oo[i];
            if (i > 0) {
                sb = o00oOoOo.o00oo.o00oOOo0(sb, ", ");
            }
            StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0(sb);
            o00oOOo03.append(o00oooo2.o00ooO0());
            sb = o00oOOo03.toString();
        }
        return o00oOoOo.o00oo.o00oOOo0(sb, "}");
    }
}
