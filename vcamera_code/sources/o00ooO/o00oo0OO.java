package o00ooO;

import java.util.HashMap;
import o00ooO.o00oOo0O;
import o00ooO.o00oOoO;
/* loaded from: classes.dex */
public class o00oo0OO extends o00oOoO {

    /* renamed from: o0O0oOO  reason: collision with root package name */
    public static final int f7853o0O0oOO = 1;

    /* renamed from: o0O0oOO0  reason: collision with root package name */
    public static final int f7854o0O0oOO0 = 0;

    /* renamed from: o0O0oOOO  reason: collision with root package name */
    public static final int f7855o0O0oOOO = 1;

    /* renamed from: o0O0oOo0  reason: collision with root package name */
    public static final int f7856o0O0oOo0 = 2;

    /* renamed from: o0O0oo00  reason: collision with root package name */
    public static final int f7857o0O0oo00 = 0;

    /* renamed from: oo0oOOo  reason: collision with root package name */
    public static final int f7858oo0oOOo = -1;

    /* renamed from: o0O0oO  reason: collision with root package name */
    public boolean f7860o0O0oO;

    /* renamed from: o0O0o0oo  reason: collision with root package name */
    public float f7859o0O0o0oo = -1.0f;

    /* renamed from: o0O0oo0O  reason: collision with root package name */
    public int f7864o0O0oo0O = -1;

    /* renamed from: oooOO0  reason: collision with root package name */
    public int f7865oooOO0 = -1;

    /* renamed from: o0O0oO0  reason: collision with root package name */
    public o00oOo0O f7861o0O0oO0 = this.f7703o00ooo0;

    /* renamed from: o0O0oO0O  reason: collision with root package name */
    public int f7862o0O0oO0O = 0;

    /* renamed from: o0O0oO0o  reason: collision with root package name */
    public int f7863o0O0oO0o = 0;

    /* loaded from: classes.dex */
    public static /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f7866o00oOOo0;

        static {
            int[] iArr = new int[o00oOo0O.o00oOOoO.values().length];
            f7866o00oOOo0 = iArr;
            try {
                iArr[o00oOo0O.o00oOOoO.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7866o00oOOo0[o00oOo0O.o00oOOoO.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7866o00oOOo0[o00oOo0O.o00oOOoO.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7866o00oOOo0[o00oOo0O.o00oOOoO.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7866o00oOOo0[o00oOo0O.o00oOOoO.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7866o00oOOo0[o00oOo0O.o00oOOoO.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7866o00oOOo0[o00oOo0O.o00oOOoO.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7866o00oOOo0[o00oOo0O.o00oOOoO.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7866o00oOOo0[o00oOo0O.o00oOOoO.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public o00oo0OO() {
        this.f7712o00ooooO.clear();
        this.f7712o00ooooO.add(this.f7861o0O0oO0);
        int length = this.f7710o00oooo.length;
        for (int i = 0; i < length; i++) {
            this.f7710o00oooo[i] = this.f7861o0O0oO0;
        }
    }

    @Override // o00ooO.o00oOoO
    public boolean o00oOoO() {
        return true;
    }

    @Override // o00ooO.o00oOoO
    public void o00oOoO0(o00ooO0.o00oo00O o00oo00o, boolean z) {
        o00oo00O o00oo00o2 = (o00oo00O) o0();
        if (o00oo00o2 == null) {
            return;
        }
        o00oOo0O o00oo0Oo2 = o00oo00o2.o00oo0Oo(o00oOo0O.o00oOOoO.LEFT);
        o00oOo0O o00oo0Oo3 = o00oo00o2.o00oo0Oo(o00oOo0O.o00oOOoO.RIGHT);
        o00oOoO o00oooo2 = this.f7716o0O00000;
        boolean z2 = true;
        boolean z3 = o00oooo2 != null && o00oooo2.f7668o0[0] == o00oOoO.o00oOOoO.WRAP_CONTENT;
        if (this.f7862o0O0oO0O == 0) {
            o00oo0Oo2 = o00oo00o2.o00oo0Oo(o00oOo0O.o00oOOoO.TOP);
            o00oo0Oo3 = o00oo00o2.o00oo0Oo(o00oOo0O.o00oOOoO.BOTTOM);
            o00oOoO o00oooo3 = this.f7716o0O00000;
            if (o00oooo3 == null || o00oooo3.f7668o0[1] != o00oOoO.o00oOOoO.WRAP_CONTENT) {
                z2 = false;
            }
            z3 = z2;
        }
        if (this.f7860o0O0oO && this.f7861o0O0oO0.o00oo0OO()) {
            o00ooO0.o00oo0O o00oo0oO2 = o00oo00o.o00oo0oO(this.f7861o0O0oO0);
            o00oo00o.o00oOo0o(o00oo0oO2, this.f7861o0O0oO0.o00oOo0o());
            if (this.f7864o0O0oo0O != -1) {
                if (z3) {
                    o00oo00o.o00oOoOO(o00oo00o.o00oo0oO(o00oo0Oo3), o00oo0oO2, 0, 5);
                }
            } else if (this.f7865oooOO0 != -1 && z3) {
                o00ooO0.o00oo0O o00oo0oO3 = o00oo00o.o00oo0oO(o00oo0Oo3);
                o00oo00o.o00oOoOO(o00oo0oO2, o00oo00o.o00oo0oO(o00oo0Oo2), 0, 5);
                o00oo00o.o00oOoOO(o00oo0oO3, o00oo0oO2, 0, 5);
            }
            this.f7860o0O0oO = false;
        } else if (this.f7864o0O0oo0O != -1) {
            o00ooO0.o00oo0O o00oo0oO4 = o00oo00o.o00oo0oO(this.f7861o0O0oO0);
            o00oo00o.o00oOo0O(o00oo0oO4, o00oo00o.o00oo0oO(o00oo0Oo2), this.f7864o0O0oo0O, 8);
            if (z3) {
                o00oo00o.o00oOoOO(o00oo00o.o00oo0oO(o00oo0Oo3), o00oo0oO4, 0, 5);
            }
        } else if (this.f7865oooOO0 == -1) {
            if (this.f7859o0O0o0oo != -1.0f) {
                o00oo00o.o00oOooO(o00ooO0.o00oo00O.o00oo(o00oo00o, o00oo00o.o00oo0oO(this.f7861o0O0oO0), o00oo00o.o00oo0oO(o00oo0Oo3), this.f7859o0O0o0oo));
            }
        } else {
            o00ooO0.o00oo0O o00oo0oO5 = o00oo00o.o00oo0oO(this.f7861o0O0oO0);
            o00ooO0.o00oo0O o00oo0oO6 = o00oo00o.o00oo0oO(o00oo0Oo3);
            o00oo00o.o00oOo0O(o00oo0oO5, o00oo0oO6, -this.f7865oooOO0, 8);
            if (z3) {
                o00oo00o.o00oOoOO(o00oo0oO5, o00oo00o.o00oo0oO(o00oo0Oo2), 0, 5);
                o00oo00o.o00oOoOO(o00oo0oO6, o00oo0oO5, 0, 5);
            }
        }
    }

    @Override // o00ooO.o00oOoO
    public void o00oo0(o00oOoO o00oooo2, HashMap<o00oOoO, o00oOoO> hashMap) {
        super.o00oo0(o00oooo2, hashMap);
        o00oo0OO o00oo0oo = (o00oo0OO) o00oooo2;
        this.f7859o0O0o0oo = o00oo0oo.f7859o0O0o0oo;
        this.f7864o0O0oo0O = o00oo0oo.f7864o0O0oo0O;
        this.f7865oooOO0 = o00oo0oo.f7865oooOO0;
        o0OO0o0O(o00oo0oo.f7862o0O0oO0O);
    }

    @Override // o00ooO.o00oOoO
    public o00oOo0O o00oo0Oo(o00oOo0O.o00oOOoO o00ooooo2) {
        switch (o00oOOo0.f7866o00oOOo0[o00ooooo2.ordinal()]) {
            case 1:
            case 2:
                if (this.f7862o0O0oO0O == 1) {
                    return this.f7861o0O0oO0;
                }
                break;
            case 3:
            case 4:
                if (this.f7862o0O0oO0O == 0) {
                    return this.f7861o0O0oO0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(o00ooooo2.name());
    }

    @Override // o00ooO.o00oOoO
    public boolean o0O0O0O() {
        return this.f7860o0O0oO;
    }

    public void o0OO0() {
        float o0O00O0o2 = o0O00O0o() / o0().o0OoO00O();
        if (this.f7862o0O0oO0O == 0) {
            o0O00O0o2 = o0O00O() / o0().o00ooOO();
        }
        o0OO0Ooo(o0O00O0o2);
    }

    @Override // o00ooO.o00oOoO
    public void o0OO000(o00ooO0.o00oo00O o00oo00o, boolean z) {
        if (o0() == null) {
            return;
        }
        int o00oooOO2 = o00oo00o.o00oooOO(this.f7861o0O0oO0);
        if (this.f7862o0O0oO0O == 1) {
            o0O0ooo(o00oooOO2);
            o0O0oooO(0);
            o0O0o00(o0().o00ooOO());
            o0O0ooOO(0);
            return;
        }
        o0O0ooo(0);
        o0O0oooO(o00oooOO2);
        o0O0ooOO(o0().o0OoO00O());
        o0O0o00(0);
    }

    public void o0OO000o() {
        if (this.f7864o0O0oo0O != -1) {
            o0OO0();
        } else if (this.f7859o0O0o0oo != -1.0f) {
            o0OO00o();
        } else if (this.f7865oooOO0 != -1) {
            o0OoOoO();
        }
    }

    public int o0OO00OO() {
        return this.f7864o0O0oo0O;
    }

    public int o0OO00Oo() {
        return this.f7865oooOO0;
    }

    public void o0OO00o() {
        int o0OoO00O2 = o0().o0OoO00O() - o0O00O0o();
        if (this.f7862o0O0oO0O == 0) {
            o0OoO00O2 = o0().o00ooOO() - o0O00O();
        }
        o0OOooO0(o0OoO00O2);
    }

    public float o0OO00o0() {
        return this.f7859o0O0o0oo;
    }

    public int o0OO00oo() {
        if (this.f7859o0O0o0oo != -1.0f) {
            return 0;
        }
        if (this.f7864o0O0oo0O != -1) {
            return 1;
        }
        return this.f7865oooOO0 != -1 ? 2 : -1;
    }

    public boolean o0OO0O0() {
        return this.f7859o0O0o0oo != -1.0f && this.f7864o0O0oo0O == -1 && this.f7865oooOO0 == -1;
    }

    public void o0OO0O0O(int i) {
        this.f7861o0O0oO0.o00ooO0o(i);
        this.f7860o0O0oO = true;
    }

    public void o0OO0OoO(int i) {
        if (i > -1) {
            this.f7859o0O0o0oo = -1.0f;
            this.f7864o0O0oo0O = i;
            this.f7865oooOO0 = -1;
        }
    }

    public void o0OO0Ooo(float f) {
        if (f > -1.0f) {
            this.f7859o0O0o0oo = f;
            this.f7864o0O0oo0O = -1;
            this.f7865oooOO0 = -1;
        }
    }

    public void o0OO0o0(int i) {
        this.f7863o0O0oO0o = i;
    }

    public void o0OO0o00(int i) {
        o0OO0Ooo(i / 100.0f);
    }

    public void o0OO0o0O(int i) {
        if (this.f7862o0O0oO0O == i) {
            return;
        }
        this.f7862o0O0oO0O = i;
        this.f7712o00ooooO.clear();
        this.f7861o0O0oO0 = this.f7862o0O0oO0O == 1 ? this.f7704o00ooo00 : this.f7703o00ooo0;
        this.f7712o00ooooO.add(this.f7861o0O0oO0);
        int length = this.f7710o00oooo.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f7710o00oooo[i2] = this.f7861o0O0oO0;
        }
    }

    public void o0OOooO0(int i) {
        if (i > -1) {
            this.f7859o0O0o0oo = -1.0f;
            this.f7864o0O0oo0O = -1;
            this.f7865oooOO0 = i;
        }
    }

    public void o0OoOoO() {
        int o0O00O0o2 = o0O00O0o();
        if (this.f7862o0O0oO0O == 0) {
            o0O00O0o2 = o0O00O();
        }
        o0OO0OoO(o0O00O0o2);
    }

    @Override // o00ooO.o00oOoO
    public String o0OoOoOO() {
        return "Guideline";
    }

    @Override // o00ooO.o00oOoO
    public boolean o0oO0O0o() {
        return this.f7860o0O0oO;
    }

    public o00oOo0O oo0oO0() {
        return this.f7861o0O0oO0;
    }

    public int oo0ooO() {
        return this.f7862o0O0oO0O;
    }
}
