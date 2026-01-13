package o00ooOO0;

import android.support.v4.media.o00oOo0O;
import o00ooO.o00oOoO;
import o00ooOO0.o0O000Oo;
import o00ooOO0.o0O00o00;
/* loaded from: classes.dex */
public class o0O00OOO extends o0O00o00 {

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public o0O000Oo f8913o00oOoo0;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public o0O000o0 f8914o00oOooo;

    /* loaded from: classes.dex */
    public static /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f8915o00oOOo0;

        static {
            int[] iArr = new int[o0O00o00.o00oOOoO.values().length];
            f8915o00oOOo0 = iArr;
            try {
                iArr[o0O00o00.o00oOOoO.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8915o00oOOo0[o0O00o00.o00oOOoO.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8915o00oOOo0[o0O00o00.o00oOOoO.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public o0O00OOO(o00oOoO o00oooo2) {
        super(o00oooo2);
        o0O000Oo o0o000oo = new o0O000Oo(this);
        this.f8913o00oOoo0 = o0o000oo;
        this.f8914o00oOooo = null;
        this.f8921o00oOoO.f8888o00oOo0O = o0O000Oo.o00oOOo0.TOP;
        this.f8923o00oOoOO.f8888o00oOo0O = o0O000Oo.o00oOOo0.BOTTOM;
        o0o000oo.f8888o00oOo0O = o0O000Oo.o00oOOo0.BASELINE;
        this.f8920o00oOo0o = 1;
    }

    @Override // o00ooOO0.o0O00o00, o00ooOO0.o0O000
    public void o00oOOo0(o0O000 o0o000) {
        float f;
        float f2;
        int i;
        o00oOoO o00oooo2;
        int i2 = o00oOOo0.f8915o00oOOo0[this.f8924o00oOoOo.ordinal()];
        if (i2 == 1) {
            o00oo0o0(o0o000);
        } else if (i2 == 2) {
            o00oo0Oo(o0o000);
        } else if (i2 == 3) {
            o00oOoO o00oooo3 = this.f8917o00oOOoO;
            o00oo0O(o0o000, o00oooo3.f7703o00ooo0, o00oooo3.f7706o00ooo0o, 1);
            return;
        }
        o0O000o0 o0o000o0 = this.f8919o00oOo0O;
        if (o0o000o0.f8887o00oOo00 && !o0o000o0.f8893o00oOoOo && this.f8925o00oOooO == o00oOoO.o00oOOoO.MATCH_CONSTRAINT) {
            o00oOoO o00oooo4 = this.f8917o00oOOoO;
            int i3 = o00oooo4.f7684o00oo0O;
            if (i3 == 2) {
                o00oOoO o02 = o00oooo4.o0();
                if (o02 != null) {
                    o0O000o0 o0o000o02 = o02.f7673o00oOo0o.f8919o00oOo0O;
                    if (o0o000o02.f8893o00oOoOo) {
                        f = this.f8917o00oOOoO.f7693o00ooO00;
                        f2 = o0o000o02.f8891o00oOoO0;
                        i = (int) ((f2 * f) + 0.5f);
                    }
                }
            } else if (i3 == 3 && o00oooo4.f7672o00oOo0O.f8919o00oOo0O.f8893o00oOoOo) {
                int o00ooO2 = o00oooo4.o00ooO();
                if (o00ooO2 != -1) {
                    if (o00ooO2 == 0) {
                        o00oOoO o00oooo5 = this.f8917o00oOOoO;
                        f = o00oooo5.f7672o00oOo0O.f8919o00oOo0O.f8891o00oOoO0;
                        f2 = o00oooo5.o00ooO0o();
                        i = (int) ((f2 * f) + 0.5f);
                    } else if (o00ooO2 != 1) {
                        i = 0;
                    }
                }
                i = (int) ((o00oooo2.f7672o00oOo0O.f8919o00oOo0O.f8891o00oOoO0 / this.f8917o00oOOoO.o00ooO0o()) + 0.5f);
            }
            this.f8919o00oOo0O.o00oOo0O(i);
        }
        o0O000Oo o0o000oo = this.f8921o00oOoO;
        if (o0o000oo.f8887o00oOo00) {
            o0O000Oo o0o000oo2 = this.f8923o00oOoOO;
            if (o0o000oo2.f8887o00oOo00) {
                if (o0o000oo.f8893o00oOoOo && o0o000oo2.f8893o00oOoOo && this.f8919o00oOo0O.f8893o00oOoOo) {
                    return;
                }
                if (!this.f8919o00oOo0O.f8893o00oOoOo && this.f8925o00oOooO == o00oOoO.o00oOOoO.MATCH_CONSTRAINT) {
                    o00oOoO o00oooo6 = this.f8917o00oOOoO;
                    if (o00oooo6.f7685o00oo0O0 == 0 && !o00oooo6.o0O00o0o()) {
                        int i4 = this.f8921o00oOoO.f8896o00oOooo.get(0).f8891o00oOoO0;
                        o0O000Oo o0o000oo3 = this.f8921o00oOoO;
                        int i5 = i4 + o0o000oo3.f8889o00oOo0o;
                        int i6 = this.f8923o00oOoOO.f8896o00oOooo.get(0).f8891o00oOoO0 + this.f8923o00oOoOO.f8889o00oOo0o;
                        o0o000oo3.o00oOo0O(i5);
                        this.f8923o00oOoOO.o00oOo0O(i6);
                        this.f8919o00oOo0O.o00oOo0O(i6 - i5);
                        return;
                    }
                }
                if (!this.f8919o00oOo0O.f8893o00oOoOo && this.f8925o00oOooO == o00oOoO.o00oOOoO.MATCH_CONSTRAINT && this.f8916o00oOOo0 == 1 && this.f8921o00oOoO.f8896o00oOooo.size() > 0 && this.f8923o00oOoOO.f8896o00oOooo.size() > 0) {
                    int i7 = (this.f8923o00oOoOO.f8896o00oOooo.get(0).f8891o00oOoO0 + this.f8923o00oOoOO.f8889o00oOo0o) - (this.f8921o00oOoO.f8896o00oOooo.get(0).f8891o00oOoO0 + this.f8921o00oOoO.f8889o00oOo0o);
                    o0O000o0 o0o000o03 = this.f8919o00oOo0O;
                    int i8 = o0o000o03.f8897o00oo00O;
                    if (i7 < i8) {
                        o0o000o03.o00oOo0O(i7);
                    } else {
                        o0o000o03.o00oOo0O(i8);
                    }
                }
                if (this.f8919o00oOo0O.f8893o00oOoOo && this.f8921o00oOoO.f8896o00oOooo.size() > 0 && this.f8923o00oOoOO.f8896o00oOooo.size() > 0) {
                    o0O000Oo o0o000oo4 = this.f8921o00oOoO.f8896o00oOooo.get(0);
                    o0O000Oo o0o000oo5 = this.f8923o00oOoOO.f8896o00oOooo.get(0);
                    int i9 = o0o000oo4.f8891o00oOoO0 + this.f8921o00oOoO.f8889o00oOo0o;
                    int i10 = o0o000oo5.f8891o00oOoO0 + this.f8923o00oOoOO.f8889o00oOo0o;
                    float o0O000o02 = this.f8917o00oOOoO.o0O000o0();
                    if (o0o000oo4 == o0o000oo5) {
                        i9 = o0o000oo4.f8891o00oOoO0;
                        i10 = o0o000oo5.f8891o00oOoO0;
                        o0O000o02 = 0.5f;
                    }
                    this.f8921o00oOoO.o00oOo0O((int) ((((i10 - i9) - this.f8919o00oOo0O.f8891o00oOoO0) * o0O000o02) + i9 + 0.5f));
                    this.f8923o00oOoOO.o00oOo0O(this.f8921o00oOoO.f8891o00oOoO0 + this.f8919o00oOo0O.f8891o00oOoO0);
                }
            }
        }
    }

    @Override // o00ooOO0.o0O00o00
    public void o00oOo0O() {
        o0O000Oo o0o000oo = this.f8921o00oOoO;
        if (o0o000oo.f8893o00oOoOo) {
            this.f8917o00oOOoO.o0O0oooO(o0o000oo.f8891o00oOoO0);
        }
    }

    @Override // o00ooOO0.o0O00o00
    public void o00oOo0o() {
        this.f8918o00oOo00 = null;
        this.f8921o00oOoO.o00oOo00();
        this.f8923o00oOoOO.o00oOo00();
        this.f8913o00oOoo0.o00oOo00();
        this.f8919o00oOo0O.o00oOo00();
        this.f8922o00oOoO0 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x02d9, code lost:
        if (r10.f8917o00oOOoO.o0O00OO() != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02db, code lost:
        r0 = r10.f8913o00oOoo0;
        r1 = r10.f8921o00oOoO;
        r2 = r10.f8914o00oOooo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x032e, code lost:
        if (r0.f8925o00oOooO == r1) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x035e, code lost:
        if (r10.f8917o00oOOoO.o0O00OO() != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03d3, code lost:
        if (r0.f8925o00oOooO == r1) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03d5, code lost:
        r0.f8919o00oOo0O.f8894o00oOoo0.add(r10.f8919o00oOo0O);
        r10.f8919o00oOo0O.f8896o00oOooo.add(r10.f8917o00oOOoO.f7672o00oOo0O.f8919o00oOo0O);
        r10.f8919o00oOo0O.f8885o00oOOo0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    @Override // o00ooOO0.o0O00o00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oOooO() {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooOO0.o0O00OOO.o00oOooO():void");
    }

    @Override // o00ooOO0.o0O00o00
    public void o00oo0() {
        this.f8922o00oOoO0 = false;
        this.f8921o00oOoO.o00oOo00();
        this.f8921o00oOoO.f8893o00oOoOo = false;
        this.f8923o00oOoOO.o00oOo00();
        this.f8923o00oOoOO.f8893o00oOoOo = false;
        this.f8913o00oOoo0.o00oOo00();
        this.f8913o00oOoo0.f8893o00oOoOo = false;
        this.f8919o00oOo0O.f8893o00oOoOo = false;
    }

    @Override // o00ooOO0.o0O00o00
    public boolean o00oo0O0() {
        return this.f8925o00oOooO != o00oOoO.o00oOOoO.MATCH_CONSTRAINT || this.f8917o00oOOoO.f7684o00oo0O == 0;
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("VerticalRun ");
        o00oOOo02.append(this.f8917o00oOOoO.o00ooO0());
        return o00oOOo02.toString();
    }
}
