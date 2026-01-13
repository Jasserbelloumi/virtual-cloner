package o00ooOO0;

import o00ooO.o00oOOo0;
import o00ooO.o00oOoO;
import o00ooOO0.o0O000Oo;
/* loaded from: classes.dex */
public class o0O00O0o extends o0O00o00 {
    public o0O00O0o(o00oOoO o00oooo2) {
        super(o00oooo2);
    }

    @Override // o00ooOO0.o0O00o00, o00ooOO0.o0O000
    public void o00oOOo0(o0O000 o0o000) {
        o0O000Oo o0o000oo;
        int o0OO00Oo2;
        o00oOOo0 o00oooo02 = (o00oOOo0) this.f8917o00oOOoO;
        int o0OO00oo2 = o00oooo02.o0OO00oo();
        int i = 0;
        int i2 = -1;
        for (o0O000Oo o0o000oo2 : this.f8921o00oOoO.f8896o00oOooo) {
            int i3 = o0o000oo2.f8891o00oOoO0;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (o0OO00oo2 == 0 || o0OO00oo2 == 2) {
            o0o000oo = this.f8921o00oOoO;
            o0OO00Oo2 = o00oooo02.o0OO00Oo() + i2;
        } else {
            o0o000oo = this.f8921o00oOoO;
            o0OO00Oo2 = o00oooo02.o0OO00Oo() + i;
        }
        o0o000oo.o00oOo0O(o0OO00Oo2);
    }

    @Override // o00ooOO0.o0O00o00
    public void o00oOo0O() {
        o00oOoO o00oooo2 = this.f8917o00oOOoO;
        if (o00oooo2 instanceof o00oOOo0) {
            int o0OO00oo2 = ((o00oOOo0) o00oooo2).o0OO00oo();
            if (o0OO00oo2 == 0 || o0OO00oo2 == 1) {
                this.f8917o00oOOoO.o0O0ooo(this.f8921o00oOoO.f8891o00oOoO0);
            } else {
                this.f8917o00oOOoO.o0O0oooO(this.f8921o00oOoO.f8891o00oOoO0);
            }
        }
    }

    @Override // o00ooOO0.o0O00o00
    public void o00oOo0o() {
        this.f8918o00oOo00 = null;
        this.f8921o00oOoO.o00oOo00();
    }

    @Override // o00ooOO0.o0O00o00
    public void o00oOooO() {
        o0O00o00 o0o00o00;
        o00oOoO o00oooo2 = this.f8917o00oOOoO;
        if (o00oooo2 instanceof o00oOOo0) {
            this.f8921o00oOoO.f8886o00oOOoO = true;
            o00oOOo0 o00oooo02 = (o00oOOo0) o00oooo2;
            int o0OO00oo2 = o00oooo02.o0OO00oo();
            boolean o0OO00OO2 = o00oooo02.o0OO00OO();
            int i = 0;
            if (o0OO00oo2 == 0) {
                this.f8921o00oOoO.f8888o00oOo0O = o0O000Oo.o00oOOo0.LEFT;
                while (i < o00oooo02.f7852o0O0oo0O) {
                    o00oOoO o00oooo3 = o00oooo02.f7851o0O0o0oo[i];
                    if (o0OO00OO2 || o00oooo3.o0O00O0() != 8) {
                        o0O000Oo o0o000oo = o00oooo3.f7672o00oOo0O.f8921o00oOoO;
                        o0o000oo.f8894o00oOoo0.add(this.f8921o00oOoO);
                        this.f8921o00oOoO.f8896o00oOooo.add(o0o000oo);
                    }
                    i++;
                }
            } else if (o0OO00oo2 != 1) {
                if (o0OO00oo2 == 2) {
                    this.f8921o00oOoO.f8888o00oOo0O = o0O000Oo.o00oOOo0.TOP;
                    while (i < o00oooo02.f7852o0O0oo0O) {
                        o00oOoO o00oooo4 = o00oooo02.f7851o0O0o0oo[i];
                        if (o0OO00OO2 || o00oooo4.o0O00O0() != 8) {
                            o0O000Oo o0o000oo2 = o00oooo4.f7673o00oOo0o.f8921o00oOoO;
                            o0o000oo2.f8894o00oOoo0.add(this.f8921o00oOoO);
                            this.f8921o00oOoO.f8896o00oOooo.add(o0o000oo2);
                        }
                        i++;
                    }
                } else if (o0OO00oo2 != 3) {
                    return;
                } else {
                    this.f8921o00oOoO.f8888o00oOo0O = o0O000Oo.o00oOOo0.BOTTOM;
                    while (i < o00oooo02.f7852o0O0oo0O) {
                        o00oOoO o00oooo5 = o00oooo02.f7851o0O0o0oo[i];
                        if (o0OO00OO2 || o00oooo5.o0O00O0() != 8) {
                            o0O000Oo o0o000oo3 = o00oooo5.f7673o00oOo0o.f8923o00oOoOO;
                            o0o000oo3.f8894o00oOoo0.add(this.f8921o00oOoO);
                            this.f8921o00oOoO.f8896o00oOooo.add(o0o000oo3);
                        }
                        i++;
                    }
                }
                o00oo0oO(this.f8917o00oOOoO.f7673o00oOo0o.f8921o00oOoO);
                o0o00o00 = this.f8917o00oOOoO.f7673o00oOo0o;
                o00oo0oO(o0o00o00.f8923o00oOoOO);
            } else {
                this.f8921o00oOoO.f8888o00oOo0O = o0O000Oo.o00oOOo0.RIGHT;
                while (i < o00oooo02.f7852o0O0oo0O) {
                    o00oOoO o00oooo6 = o00oooo02.f7851o0O0o0oo[i];
                    if (o0OO00OO2 || o00oooo6.o0O00O0() != 8) {
                        o0O000Oo o0o000oo4 = o00oooo6.f7672o00oOo0O.f8923o00oOoOO;
                        o0o000oo4.f8894o00oOoo0.add(this.f8921o00oOoO);
                        this.f8921o00oOoO.f8896o00oOooo.add(o0o000oo4);
                    }
                    i++;
                }
            }
            o00oo0oO(this.f8917o00oOOoO.f7672o00oOo0O.f8921o00oOoO);
            o0o00o00 = this.f8917o00oOOoO.f7672o00oOo0O;
            o00oo0oO(o0o00o00.f8923o00oOoOO);
        }
    }

    @Override // o00ooOO0.o0O00o00
    public void o00oo0() {
        this.f8921o00oOoO.f8893o00oOoOo = false;
    }

    @Override // o00ooOO0.o0O00o00
    public boolean o00oo0O0() {
        return false;
    }

    public final void o00oo0oO(o0O000Oo o0o000oo) {
        this.f8921o00oOoO.f8894o00oOoo0.add(o0o000oo);
        o0o000oo.f8896o00oOooo.add(this.f8921o00oOoO);
    }
}
