package o00ooOO0;

import java.util.List;
import o00ooO.o00oOo0O;
import o00ooO.o00oOoO;
import o00ooO.o00oo0O0;
import o00ooOO0.o0O000Oo;
import o00ooOO0.o0O00o00;
/* loaded from: classes.dex */
public class o0O00O extends o0O00o00 {

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static int[] f8898o00oOoo0 = new int[2];

    /* loaded from: classes.dex */
    public static /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f8899o00oOOo0;

        static {
            int[] iArr = new int[o0O00o00.o00oOOoO.values().length];
            f8899o00oOOo0 = iArr;
            try {
                iArr[o0O00o00.o00oOOoO.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8899o00oOOo0[o0O00o00.o00oOOoO.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8899o00oOOo0[o0O00o00.o00oOOoO.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public o0O00O(o00oOoO o00oooo2) {
        super(o00oooo2);
        this.f8921o00oOoO.f8888o00oOo0O = o0O000Oo.o00oOOo0.LEFT;
        this.f8923o00oOoOO.f8888o00oOo0O = o0O000Oo.o00oOOo0.RIGHT;
        this.f8920o00oOo0o = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0292, code lost:
        if (r14 != 1) goto L130;
     */
    @Override // o00ooOO0.o0O00o00, o00ooOO0.o0O000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oOOo0(o00ooOO0.o0O000 r17) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooOO0.o0O00O.o00oOOo0(o00ooOO0.o0O000):void");
    }

    @Override // o00ooOO0.o0O00o00
    public void o00oOo0O() {
        o0O000Oo o0o000oo = this.f8921o00oOoO;
        if (o0o000oo.f8893o00oOoOo) {
            this.f8917o00oOOoO.o0O0ooo(o0o000oo.f8891o00oOoO0);
        }
    }

    @Override // o00ooOO0.o0O00o00
    public void o00oOo0o() {
        this.f8918o00oOo00 = null;
        this.f8921o00oOoO.o00oOo00();
        this.f8923o00oOoOO.o00oOo00();
        this.f8919o00oOo0O.o00oOo00();
        this.f8922o00oOoO0 = false;
    }

    @Override // o00ooOO0.o0O00o00
    public void o00oOooO() {
        o00oOoO o02;
        o0O000Oo o0o000oo;
        o0O000Oo o0o000oo2;
        int o0O00O0o2;
        o0O000Oo o0o000oo3;
        o00oOo0O o00ooo0o2;
        List<o0O000> list;
        o0O000 o0o000;
        o0O000Oo o0o000oo4;
        o0O000Oo o0o000oo5;
        o0O000Oo o0o000oo6;
        int o0O00O0o3;
        o0O000Oo o0o000oo7;
        o0O000Oo o0o000oo8;
        int i;
        o00oOoO o03;
        o00oOoO o00oooo2 = this.f8917o00oOOoO;
        if (o00oooo2.f7669o00oOOo0) {
            this.f8919o00oOo0O.o00oOo0O(o00oooo2.o0OoO00O());
        }
        if (this.f8919o00oOo0O.f8893o00oOoOo) {
            o00oOoO.o00oOOoO o00ooooo2 = this.f8925o00oOooO;
            o00oOoO.o00oOOoO o00ooooo3 = o00oOoO.o00oOOoO.MATCH_PARENT;
            if (o00ooooo2 == o00ooooo3 && (((o02 = this.f8917o00oOOoO.o0()) != null && o02.o00ooOoO() == o00oOoO.o00oOOoO.FIXED) || o02.o00ooOoO() == o00ooooo3)) {
                o00oOOoO(this.f8921o00oOoO, o02.f7672o00oOo0O.f8921o00oOoO, this.f8917o00oOOoO.f7704o00ooo00.o00oOoO0());
                o00oOOoO(this.f8923o00oOoOO, o02.f7672o00oOo0O.f8923o00oOoOO, -this.f8917o00oOOoO.f7705o00ooo0O.o00oOoO0());
                return;
            }
        } else {
            o00oOoO.o00oOOoO o00ooOoO2 = this.f8917o00oOOoO.o00ooOoO();
            this.f8925o00oOooO = o00ooOoO2;
            if (o00ooOoO2 != o00oOoO.o00oOOoO.MATCH_CONSTRAINT) {
                o00oOoO.o00oOOoO o00ooooo4 = o00oOoO.o00oOOoO.MATCH_PARENT;
                if (o00ooOoO2 == o00ooooo4 && (((o03 = this.f8917o00oOOoO.o0()) != null && o03.o00ooOoO() == o00oOoO.o00oOOoO.FIXED) || o03.o00ooOoO() == o00ooooo4)) {
                    int o0OoO00O2 = (o03.o0OoO00O() - this.f8917o00oOOoO.f7704o00ooo00.o00oOoO0()) - this.f8917o00oOOoO.f7705o00ooo0O.o00oOoO0();
                    o00oOOoO(this.f8921o00oOoO, o03.f7672o00oOo0O.f8921o00oOoO, this.f8917o00oOOoO.f7704o00ooo00.o00oOoO0());
                    o00oOOoO(this.f8923o00oOoOO, o03.f7672o00oOo0O.f8923o00oOoOO, -this.f8917o00oOOoO.f7705o00ooo0O.o00oOoO0());
                    this.f8919o00oOo0O.o00oOo0O(o0OoO00O2);
                    return;
                } else if (this.f8925o00oOooO == o00oOoO.o00oOOoO.FIXED) {
                    this.f8919o00oOo0O.o00oOo0O(this.f8917o00oOOoO.o0OoO00O());
                }
            }
        }
        o0O000o0 o0o000o0 = this.f8919o00oOo0O;
        if (o0o000o0.f8893o00oOoOo) {
            o00oOoO o00oooo3 = this.f8917o00oOOoO;
            if (o00oooo3.f7669o00oOOo0) {
                o00oOo0O[] o00ooo0oArr = o00oooo3.f7710o00oooo;
                o00oOo0O o00ooo0o3 = o00ooo0oArr[0];
                o00oOo0O o00ooo0o4 = o00ooo0o3.f7634o00oOo0o;
                if (o00ooo0o4 != null && o00ooo0oArr[1].f7634o00oOo0o != null) {
                    if (o00oooo3.o0O00o00()) {
                        this.f8921o00oOoO.f8889o00oOo0o = this.f8917o00oOOoO.f7710o00oooo[0].o00oOoO0();
                        o0o000oo3 = this.f8923o00oOoOO;
                        o00ooo0o2 = this.f8917o00oOOoO.f7710o00oooo[1];
                        o0o000oo3.f8889o00oOo0o = -o00ooo0o2.o00oOoO0();
                        return;
                    }
                    o0O000Oo o00oOoO2 = o00oOoO(this.f8917o00oOOoO.f7710o00oooo[0]);
                    if (o00oOoO2 != null) {
                        o00oOOoO(this.f8921o00oOoO, o00oOoO2, this.f8917o00oOOoO.f7710o00oooo[0].o00oOoO0());
                    }
                    o0O000Oo o00oOoO3 = o00oOoO(this.f8917o00oOOoO.f7710o00oooo[1]);
                    if (o00oOoO3 != null) {
                        o00oOOoO(this.f8923o00oOoOO, o00oOoO3, -this.f8917o00oOOoO.f7710o00oooo[1].o00oOoO0());
                    }
                    this.f8921o00oOoO.f8886o00oOOoO = true;
                    this.f8923o00oOoOO.f8886o00oOOoO = true;
                    return;
                }
                if (o00ooo0o4 != null) {
                    o0o000oo5 = o00oOoO(o00ooo0o3);
                    if (o0o000oo5 == null) {
                        return;
                    }
                    o0o000oo6 = this.f8921o00oOoO;
                    o0O00O0o3 = this.f8917o00oOOoO.f7710o00oooo[0].o00oOoO0();
                } else {
                    o00oOo0O o00ooo0o5 = o00ooo0oArr[1];
                    if (o00ooo0o5.f7634o00oOo0o != null) {
                        o0O000Oo o00oOoO4 = o00oOoO(o00ooo0o5);
                        if (o00oOoO4 != null) {
                            o00oOOoO(this.f8923o00oOoOO, o00oOoO4, -this.f8917o00oOOoO.f7710o00oooo[1].o00oOoO0());
                            o0o000oo7 = this.f8921o00oOoO;
                            o0o000oo8 = this.f8923o00oOoOO;
                            i = -this.f8919o00oOo0O.f8891o00oOoO0;
                            o00oOOoO(o0o000oo7, o0o000oo8, i);
                            return;
                        }
                        return;
                    } else if ((o00oooo3 instanceof o00oo0O0) || o00oooo3.o0() == null || this.f8917o00oOOoO.o00oo0Oo(o00oOo0O.o00oOOoO.CENTER).f7634o00oOo0o != null) {
                        return;
                    } else {
                        o0o000oo5 = this.f8917o00oOOoO.o0().f7672o00oOo0O.f8921o00oOoO;
                        o0o000oo6 = this.f8921o00oOoO;
                        o0O00O0o3 = this.f8917o00oOOoO.o0O00O0o();
                    }
                }
                o00oOOoO(o0o000oo6, o0o000oo5, o0O00O0o3);
                o0o000oo7 = this.f8923o00oOoOO;
                o0o000oo8 = this.f8921o00oOoO;
                i = this.f8919o00oOo0O.f8891o00oOoO0;
                o00oOOoO(o0o000oo7, o0o000oo8, i);
                return;
            }
        }
        if (this.f8925o00oOooO == o00oOoO.o00oOOoO.MATCH_CONSTRAINT) {
            o00oOoO o00oooo4 = this.f8917o00oOOoO;
            int i2 = o00oooo4.f7685o00oo0O0;
            if (i2 == 2) {
                o00oOoO o04 = o00oooo4.o0();
                if (o04 != null) {
                    o0O000o0 o0o000o02 = o04.f7673o00oOo0o.f8919o00oOo0O;
                    this.f8919o00oOo0O.f8896o00oOooo.add(o0o000o02);
                    o0o000o02.f8894o00oOoo0.add(this.f8919o00oOo0O);
                    o0O000o0 o0o000o03 = this.f8919o00oOo0O;
                    o0o000o03.f8886o00oOOoO = true;
                    o0o000o03.f8894o00oOoo0.add(this.f8921o00oOoO);
                    list = this.f8919o00oOo0O.f8894o00oOoo0;
                    o0o000 = this.f8923o00oOoOO;
                    list.add(o0o000);
                }
            } else if (i2 == 3) {
                if (o00oooo4.f7684o00oo0O == 3) {
                    this.f8921o00oOoO.f8885o00oOOo0 = this;
                    this.f8923o00oOoOO.f8885o00oOOo0 = this;
                    o0O00OOO o0o00ooo = o00oooo4.f7673o00oOo0o;
                    o0o00ooo.f8921o00oOoO.f8885o00oOOo0 = this;
                    o0o00ooo.f8923o00oOoOO.f8885o00oOOo0 = this;
                    o0o000o0.f8885o00oOOo0 = this;
                    if (o00oooo4.o0O00o0o()) {
                        this.f8919o00oOo0O.f8896o00oOooo.add(this.f8917o00oOOoO.f7673o00oOo0o.f8919o00oOo0O);
                        this.f8917o00oOOoO.f7673o00oOo0o.f8919o00oOo0O.f8894o00oOoo0.add(this.f8919o00oOo0O);
                        o0O00OOO o0o00ooo2 = this.f8917o00oOOoO.f7673o00oOo0o;
                        o0o00ooo2.f8919o00oOo0O.f8885o00oOOo0 = this;
                        this.f8919o00oOo0O.f8896o00oOooo.add(o0o00ooo2.f8921o00oOoO);
                        this.f8919o00oOo0O.f8896o00oOooo.add(this.f8917o00oOOoO.f7673o00oOo0o.f8923o00oOoOO);
                        this.f8917o00oOOoO.f7673o00oOo0o.f8921o00oOoO.f8894o00oOoo0.add(this.f8919o00oOo0O);
                        list = this.f8917o00oOOoO.f7673o00oOo0o.f8923o00oOoOO.f8894o00oOoo0;
                        o0o000 = this.f8919o00oOo0O;
                        list.add(o0o000);
                    } else if (this.f8917o00oOOoO.o0O00o00()) {
                        this.f8917o00oOOoO.f7673o00oOo0o.f8919o00oOo0O.f8896o00oOooo.add(this.f8919o00oOo0O);
                        list = this.f8919o00oOo0O.f8894o00oOoo0;
                        o0o000 = this.f8917o00oOOoO.f7673o00oOo0o.f8919o00oOo0O;
                        list.add(o0o000);
                    } else {
                        o0o000oo4 = this.f8917o00oOOoO.f7673o00oOo0o.f8919o00oOo0O;
                    }
                } else {
                    o0O000o0 o0o000o04 = o00oooo4.f7673o00oOo0o.f8919o00oOo0O;
                    o0o000o0.f8896o00oOooo.add(o0o000o04);
                    o0o000o04.f8894o00oOoo0.add(this.f8919o00oOo0O);
                    this.f8917o00oOOoO.f7673o00oOo0o.f8921o00oOoO.f8894o00oOoo0.add(this.f8919o00oOo0O);
                    this.f8917o00oOOoO.f7673o00oOo0o.f8923o00oOoOO.f8894o00oOoo0.add(this.f8919o00oOo0O);
                    o0O000o0 o0o000o05 = this.f8919o00oOo0O;
                    o0o000o05.f8886o00oOOoO = true;
                    o0o000o05.f8894o00oOoo0.add(this.f8921o00oOoO);
                    this.f8919o00oOo0O.f8894o00oOoo0.add(this.f8923o00oOoOO);
                    this.f8921o00oOoO.f8896o00oOooo.add(this.f8919o00oOo0O);
                    o0o000oo4 = this.f8923o00oOoOO;
                }
                list = o0o000oo4.f8896o00oOooo;
                o0o000 = this.f8919o00oOo0O;
                list.add(o0o000);
            }
            o0o000oo3.f8889o00oOo0o = -o00ooo0o2.o00oOoO0();
            return;
        }
        o00oOoO o00oooo5 = this.f8917o00oOOoO;
        o00oOo0O[] o00ooo0oArr2 = o00oooo5.f7710o00oooo;
        o00oOo0O o00ooo0o6 = o00ooo0oArr2[0];
        o00oOo0O o00ooo0o7 = o00ooo0o6.f7634o00oOo0o;
        if (o00ooo0o7 != null && o00ooo0oArr2[1].f7634o00oOo0o != null) {
            if (o00oooo5.o0O00o00()) {
                this.f8921o00oOoO.f8889o00oOo0o = this.f8917o00oOOoO.f7710o00oooo[0].o00oOoO0();
                o0o000oo3 = this.f8923o00oOoOO;
                o00ooo0o2 = this.f8917o00oOOoO.f7710o00oooo[1];
                o0o000oo3.f8889o00oOo0o = -o00ooo0o2.o00oOoO0();
                return;
            }
            o0O000Oo o00oOoO5 = o00oOoO(this.f8917o00oOOoO.f7710o00oooo[0]);
            o0O000Oo o00oOoO6 = o00oOoO(this.f8917o00oOOoO.f7710o00oooo[1]);
            o00oOoO5.o00oOOoO(this);
            o00oOoO6.o00oOOoO(this);
            this.f8924o00oOoOo = o0O00o00.o00oOOoO.CENTER;
            return;
        }
        if (o00ooo0o7 != null) {
            o0o000oo = o00oOoO(o00ooo0o6);
            if (o0o000oo == null) {
                return;
            }
            o0o000oo2 = this.f8921o00oOoO;
            o0O00O0o2 = this.f8917o00oOOoO.f7710o00oooo[0].o00oOoO0();
        } else {
            o00oOo0O o00ooo0o8 = o00ooo0oArr2[1];
            if (o00ooo0o8.f7634o00oOo0o != null) {
                o0O000Oo o00oOoO7 = o00oOoO(o00ooo0o8);
                if (o00oOoO7 != null) {
                    o00oOOoO(this.f8923o00oOoOO, o00oOoO7, -this.f8917o00oOOoO.f7710o00oooo[1].o00oOoO0());
                    o00oOo00(this.f8921o00oOoO, this.f8923o00oOoOO, -1, this.f8919o00oOo0O);
                    return;
                }
                return;
            } else if ((o00oooo5 instanceof o00oo0O0) || o00oooo5.o0() == null) {
                return;
            } else {
                o0o000oo = this.f8917o00oOOoO.o0().f7672o00oOo0O.f8921o00oOoO;
                o0o000oo2 = this.f8921o00oOoO;
                o0O00O0o2 = this.f8917o00oOOoO.o0O00O0o();
            }
        }
        o00oOOoO(o0o000oo2, o0o000oo, o0O00O0o2);
        o00oOo00(this.f8923o00oOoOO, this.f8921o00oOoO, 1, this.f8919o00oOo0O);
    }

    @Override // o00ooOO0.o0O00o00
    public void o00oo0() {
        this.f8922o00oOoO0 = false;
        this.f8921o00oOoO.o00oOo00();
        this.f8921o00oOoO.f8893o00oOoOo = false;
        this.f8923o00oOoOO.o00oOo00();
        this.f8923o00oOoOO.f8893o00oOoOo = false;
        this.f8919o00oOo0O.f8893o00oOoOo = false;
    }

    @Override // o00ooOO0.o0O00o00
    public boolean o00oo0O0() {
        return this.f8925o00oOooO != o00oOoO.o00oOOoO.MATCH_CONSTRAINT || this.f8917o00oOOoO.f7685o00oo0O0 == 0;
    }

    public final void o00oo0oO(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else if (i5 != 1) {
                return;
            } else {
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("HorizontalRun ");
        o00oOOo02.append(this.f8917o00oOOoO.o00ooO0());
        return o00oOOo02.toString();
    }
}
