package o00ooOO0;

import o00ooO.o00oOo0O;
import o00ooO.o00oOoO;
/* loaded from: classes.dex */
public abstract class o0O00o00 implements o0O000 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f8916o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o00oOoO f8917o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o0O00OO f8918o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o00oOoO.o00oOOoO f8925o00oOooO;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public o0O000o0 f8919o00oOo0O = new o0O000o0(this);

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f8920o00oOo0o = 0;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public boolean f8922o00oOoO0 = false;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public o0O000Oo f8921o00oOoO = new o0O000Oo(this);

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public o0O000Oo f8923o00oOoOO = new o0O000Oo(this);

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public o00oOOoO f8924o00oOoOo = o00oOOoO.NONE;

    /* loaded from: classes.dex */
    public static /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f8926o00oOOo0;

        static {
            int[] iArr = new int[o00oOo0O.o00oOOoO.values().length];
            f8926o00oOOo0 = iArr;
            try {
                iArr[o00oOo0O.o00oOOoO.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8926o00oOOo0[o00oOo0O.o00oOOoO.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8926o00oOOo0[o00oOo0O.o00oOOoO.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8926o00oOOo0[o00oOo0O.o00oOOoO.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8926o00oOOo0[o00oOo0O.o00oOOoO.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum o00oOOoO {
        NONE,
        START,
        END,
        CENTER
    }

    public o0O00o00(o00oOoO o00oooo2) {
        this.f8917o00oOOoO = o00oooo2;
    }

    @Override // o00ooOO0.o0O000
    public void o00oOOo0(o0O000 o0o000) {
    }

    public final void o00oOOoO(o0O000Oo o0o000oo, o0O000Oo o0o000oo2, int i) {
        o0o000oo.f8896o00oOooo.add(o0o000oo2);
        o0o000oo.f8889o00oOo0o = i;
        o0o000oo2.f8894o00oOoo0.add(o0o000oo);
    }

    public final void o00oOo00(o0O000Oo o0o000oo, o0O000Oo o0o000oo2, int i, o0O000o0 o0o000o0) {
        o0o000oo.f8896o00oOooo.add(o0o000oo2);
        o0o000oo.f8896o00oOooo.add(this.f8919o00oOo0O);
        o0o000oo.f8890o00oOoO = i;
        o0o000oo.f8892o00oOoOO = o0o000o0;
        o0o000oo2.f8894o00oOoo0.add(o0o000oo);
        o0o000o0.f8894o00oOoo0.add(o0o000oo);
    }

    public abstract void o00oOo0O();

    public abstract void o00oOo0o();

    public final o0O000Oo o00oOoO(o00oOo0O o00ooo0o2) {
        o0O00o00 o0o00o00;
        o0O00o00 o0o00o002;
        o00oOo0O o00ooo0o3 = o00ooo0o2.f7634o00oOo0o;
        if (o00ooo0o3 == null) {
            return null;
        }
        o00oOoO o00oooo2 = o00ooo0o3.f7638o00oOooO;
        int i = o00oOOo0.f8926o00oOOo0[o00ooo0o3.f7633o00oOo0O.ordinal()];
        if (i != 1) {
            if (i == 2) {
                o0o00o002 = o00oooo2.f7672o00oOo0O;
            } else if (i == 3) {
                o0o00o00 = o00oooo2.f7673o00oOo0o;
            } else if (i == 4) {
                return o00oooo2.f7673o00oOo0o.f8913o00oOoo0;
            } else {
                if (i != 5) {
                    return null;
                }
                o0o00o002 = o00oooo2.f7673o00oOo0o;
            }
            return o0o00o002.f8923o00oOoOO;
        }
        o0o00o00 = o00oooo2.f7672o00oOo0O;
        return o0o00o00.f8921o00oOoO;
    }

    public final int o00oOoO0(int i, int i2) {
        int max;
        if (i2 == 0) {
            o00oOoO o00oooo2 = this.f8917o00oOOoO;
            int i3 = o00oooo2.f7688o00oo0o;
            max = Math.max(o00oooo2.f7689o00oo0o0, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            o00oOoO o00oooo3 = this.f8917o00oOOoO;
            int i4 = o00oooo3.f7681o00oo;
            max = Math.max(o00oooo3.f7749o0O0o, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    public final o0O000Oo o00oOoOO(o00oOo0O o00ooo0o2, int i) {
        o00oOo0O o00ooo0o3 = o00ooo0o2.f7634o00oOo0o;
        if (o00ooo0o3 == null) {
            return null;
        }
        o00oOoO o00oooo2 = o00ooo0o3.f7638o00oOooO;
        o0O00o00 o0o00o00 = i == 0 ? o00oooo2.f7672o00oOo0O : o00oooo2.f7673o00oOo0o;
        int i2 = o00oOOo0.f8926o00oOOo0[o00ooo0o3.f7633o00oOo0O.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return o0o00o00.f8923o00oOoOO;
        }
        return o0o00o00.f8921o00oOoO;
    }

    public long o00oOoOo() {
        o0O000o0 o0o000o0 = this.f8919o00oOo0O;
        if (o0o000o0.f8893o00oOoOo) {
            return o0o000o0.f8891o00oOoO0;
        }
        return 0L;
    }

    public boolean o00oOoo0() {
        int size = this.f8921o00oOoO.f8896o00oOooo.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f8921o00oOoO.f8896o00oOooo.get(i2).f8895o00oOooO != this) {
                i++;
            }
        }
        int size2 = this.f8923o00oOoOO.f8896o00oOooo.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (this.f8923o00oOoOO.f8896o00oOooo.get(i3).f8895o00oOooO != this) {
                i++;
            }
        }
        return i >= 2;
    }

    public abstract void o00oOooO();

    public boolean o00oOooo() {
        return this.f8919o00oOo0O.f8893o00oOoOo;
    }

    public abstract void o00oo0();

    public boolean o00oo00O() {
        return this.f8922o00oOoO0;
    }

    public void o00oo0O(o0O000 o0o000, o00oOo0O o00ooo0o2, o00oOo0O o00ooo0o3, int i) {
        o0O000Oo o00oOoO2 = o00oOoO(o00ooo0o2);
        o0O000Oo o00oOoO3 = o00oOoO(o00ooo0o3);
        if (o00oOoO2.f8893o00oOoOo && o00oOoO3.f8893o00oOoOo) {
            int o00oOoO02 = o00ooo0o2.o00oOoO0() + o00oOoO2.f8891o00oOoO0;
            int o00oOoO03 = o00oOoO3.f8891o00oOoO0 - o00ooo0o3.o00oOoO0();
            int i2 = o00oOoO03 - o00oOoO02;
            if (!this.f8919o00oOo0O.f8893o00oOoOo && this.f8925o00oOooO == o00oOoO.o00oOOoO.MATCH_CONSTRAINT) {
                o00oo0OO(i, i2);
            }
            o0O000o0 o0o000o0 = this.f8919o00oOo0O;
            if (o0o000o0.f8893o00oOoOo) {
                if (o0o000o0.f8891o00oOoO0 == i2) {
                    this.f8921o00oOoO.o00oOo0O(o00oOoO02);
                    this.f8923o00oOoOO.o00oOo0O(o00oOoO03);
                    return;
                }
                o00oOoO o00oooo2 = this.f8917o00oOOoO;
                float o00ooOOo2 = i == 0 ? o00oooo2.o00ooOOo() : o00oooo2.o0O000o0();
                if (o00oOoO2 == o00oOoO3) {
                    o00oOoO02 = o00oOoO2.f8891o00oOoO0;
                    o00oOoO03 = o00oOoO3.f8891o00oOoO0;
                    o00ooOOo2 = 0.5f;
                }
                this.f8921o00oOoO.o00oOo0O((int) ((((o00oOoO03 - o00oOoO02) - this.f8919o00oOo0O.f8891o00oOoO0) * o00ooOOo2) + o00oOoO02 + 0.5f));
                this.f8923o00oOoOO.o00oOo0O(this.f8921o00oOoO.f8891o00oOoO0 + this.f8919o00oOo0O.f8891o00oOoO0);
            }
        }
    }

    public abstract boolean o00oo0O0();

    public final void o00oo0OO(int i, int i2) {
        o0O000o0 o0o000o0;
        int o00oOoO02;
        int i3 = this.f8916o00oOOo0;
        if (i3 != 0) {
            if (i3 == 1) {
                int o00oOoO03 = o00oOoO0(this.f8919o00oOo0O.f8897o00oo00O, i);
                o0o000o0 = this.f8919o00oOo0O;
                o00oOoO02 = Math.min(o00oOoO03, i2);
                o0o000o0.o00oOo0O(o00oOoO02);
            } else if (i3 != 2) {
                if (i3 != 3) {
                    return;
                }
                o00oOoO o00oooo2 = this.f8917o00oOOoO;
                o0O00o00 o0o00o00 = o00oooo2.f7672o00oOo0O;
                o00oOoO.o00oOOoO o00ooooo2 = o0o00o00.f8925o00oOooO;
                o00oOoO.o00oOOoO o00ooooo3 = o00oOoO.o00oOOoO.MATCH_CONSTRAINT;
                if (o00ooooo2 == o00ooooo3 && o0o00o00.f8916o00oOOo0 == 3) {
                    o0O00OOO o0o00ooo = o00oooo2.f7673o00oOo0o;
                    if (o0o00ooo.f8925o00oOooO == o00ooooo3 && o0o00ooo.f8916o00oOOo0 == 3) {
                        return;
                    }
                }
                if (i == 0) {
                    o0o00o00 = o00oooo2.f7673o00oOo0o;
                }
                if (o0o00o00.f8919o00oOo0O.f8893o00oOoOo) {
                    float o00ooO0o2 = o00oooo2.o00ooO0o();
                    this.f8919o00oOo0O.o00oOo0O(i == 1 ? (int) ((o0o00o00.f8919o00oOo0O.f8891o00oOoO0 / o00ooO0o2) + 0.5f) : (int) ((o00ooO0o2 * o0o00o00.f8919o00oOo0O.f8891o00oOoO0) + 0.5f));
                    return;
                }
                return;
            } else {
                o00oOoO o02 = this.f8917o00oOOoO.o0();
                if (o02 == null) {
                    return;
                }
                o0O000o0 o0o000o02 = (i == 0 ? o02.f7672o00oOo0O : o02.f7673o00oOo0o).f8919o00oOo0O;
                if (!o0o000o02.f8893o00oOoOo) {
                    return;
                }
                o00oOoO o00oooo3 = this.f8917o00oOOoO;
                i2 = (int) ((o0o000o02.f8891o00oOoO0 * (i == 0 ? o00oooo3.f7690o00oo0oO : o00oooo3.f7693o00ooO00)) + 0.5f);
            }
        }
        o0o000o0 = this.f8919o00oOo0O;
        o00oOoO02 = o00oOoO0(i2, i);
        o0o000o0.o00oOo0O(o00oOoO02);
    }

    public void o00oo0Oo(o0O000 o0o000) {
    }

    public long o00oo0o(int i) {
        int i2;
        o0O000o0 o0o000o0 = this.f8919o00oOo0O;
        if (o0o000o0.f8893o00oOoOo) {
            long j = o0o000o0.f8891o00oOoO0;
            if (o00oOoo0()) {
                i2 = this.f8921o00oOoO.f8889o00oOo0o - this.f8923o00oOoOO.f8889o00oOo0o;
            } else if (i != 0) {
                return j - this.f8923o00oOoOO.f8889o00oOo0o;
            } else {
                i2 = this.f8921o00oOoO.f8889o00oOo0o;
            }
            return j + i2;
        }
        return 0L;
    }

    public void o00oo0o0(o0O000 o0o000) {
    }
}
