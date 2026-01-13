package o00ooO;

import java.util.ArrayList;
import o00ooO.o00oOoO;
/* loaded from: classes.dex */
public class o00oOo00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o00oOoO f7606o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o00oOoO f7607o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o00oOoO f7608o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public o00oOoO f7609o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public o00oOoO f7610o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public ArrayList<o00oOoO> f7611o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public o00oOoO f7612o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public int f7613o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public int f7614o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public float f7615o00oOoo0 = 0.0f;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o00oOoO f7616o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public int f7617o00oOooo;

    /* renamed from: o00oo0  reason: collision with root package name */
    public int f7618o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public int f7619o00oo00O;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public boolean f7620o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f7621o00oo0O0;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public boolean f7622o00oo0OO;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f7623o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public boolean f7624o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public boolean f7625o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public boolean f7626o00oo0oO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public boolean f7627o0O0o;

    public o00oOo00(o00oOoO o00oooo2, int i, boolean z) {
        this.f7606o00oOOo0 = o00oooo2;
        this.f7621o00oo0O0 = i;
        this.f7620o00oo0O = z;
    }

    public static boolean o00oOoo0(o00oOoO o00oooo2, int i) {
        int i2;
        return o00oooo2.o0O00O0() != 8 && o00oooo2.f7668o0[i] == o00oOoO.o00oOOoO.MATCH_CONSTRAINT && ((i2 = o00oooo2.f7687o00oo0Oo[i]) == 0 || i2 == 3);
    }

    public void o00oOOo0() {
        if (!this.f7627o0O0o) {
            o00oOOoO();
        }
        this.f7627o0O0o = true;
    }

    public final void o00oOOoO() {
        int i = this.f7621o00oo0O0 * 2;
        o00oOoO o00oooo2 = this.f7606o00oOOo0;
        boolean z = true;
        this.f7622o00oo0OO = true;
        o00oOoO o00oooo3 = o00oooo2;
        boolean z2 = false;
        while (!z2) {
            this.f7613o00oOoOO++;
            o00oOoO[] o00ooooArr = o00oooo2.f7745o0O0OO0O;
            int i2 = this.f7621o00oo0O0;
            o00oOoO o00oooo4 = null;
            o00ooooArr[i2] = null;
            o00oooo2.f7744o0O0OO0[i2] = null;
            if (o00oooo2.o0O00O0() != 8) {
                this.f7617o00oOooo++;
                o00oOoO.o00oOOoO o00ooO0O2 = o00oooo2.o00ooO0O(this.f7621o00oo0O0);
                o00oOoO.o00oOOoO o00ooooo2 = o00oOoO.o00oOOoO.MATCH_CONSTRAINT;
                if (o00ooO0O2 != o00ooooo2) {
                    this.f7619o00oo00O = o00oooo2.o00ooo0o(this.f7621o00oo0O0) + this.f7619o00oo00O;
                }
                int o00oOoO02 = o00oooo2.f7710o00oooo[i].o00oOoO0() + this.f7619o00oo00O;
                this.f7619o00oo00O = o00oOoO02;
                int i3 = i + 1;
                this.f7619o00oo00O = o00oooo2.f7710o00oooo[i3].o00oOoO0() + o00oOoO02;
                int o00oOoO03 = o00oooo2.f7710o00oooo[i].o00oOoO0() + this.f7618o00oo0;
                this.f7618o00oo0 = o00oOoO03;
                this.f7618o00oo0 = o00oooo2.f7710o00oooo[i3].o00oOoO0() + o00oOoO03;
                if (this.f7607o00oOOoO == null) {
                    this.f7607o00oOOoO = o00oooo2;
                }
                this.f7616o00oOooO = o00oooo2;
                o00oOoO.o00oOOoO[] o00oooooArr = o00oooo2.f7668o0;
                int i4 = this.f7621o00oo0O0;
                if (o00oooooArr[i4] == o00ooooo2) {
                    int i5 = o00oooo2.f7687o00oo0Oo[i4];
                    if (i5 == 0 || i5 == 3 || i5 == 2) {
                        this.f7614o00oOoOo++;
                        float f = o00oooo2.f7756o0ooO[i4];
                        if (f > 0.0f) {
                            this.f7615o00oOoo0 += f;
                        }
                        if (o00oOoo0(o00oooo2, i4)) {
                            if (f < 0.0f) {
                                this.f7623o00oo0Oo = true;
                            } else {
                                this.f7625o00oo0o0 = true;
                            }
                            if (this.f7611o00oOoO == null) {
                                this.f7611o00oOoO = new ArrayList<>();
                            }
                            this.f7611o00oOoO.add(o00oooo2);
                        }
                        if (this.f7610o00oOo0o == null) {
                            this.f7610o00oOo0o = o00oooo2;
                        }
                        o00oOoO o00oooo5 = this.f7612o00oOoO0;
                        if (o00oooo5 != null) {
                            o00oooo5.f7744o0O0OO0[this.f7621o00oo0O0] = o00oooo2;
                        }
                        this.f7612o00oOoO0 = o00oooo2;
                    }
                    if (this.f7621o00oo0O0 != 0 ? !(o00oooo2.f7684o00oo0O == 0 && o00oooo2.f7749o0O0o == 0 && o00oooo2.f7681o00oo == 0) : !(o00oooo2.f7685o00oo0O0 == 0 && o00oooo2.f7689o00oo0o0 == 0 && o00oooo2.f7688o00oo0o == 0)) {
                        this.f7622o00oo0OO = false;
                    }
                    if (o00oooo2.f7715o0O000 != 0.0f) {
                        this.f7622o00oo0OO = false;
                        this.f7626o00oo0oO = true;
                    }
                }
            }
            if (o00oooo3 != o00oooo2) {
                o00oooo3.f7745o0O0OO0O[this.f7621o00oo0O0] = o00oooo2;
            }
            o00oOo0O o00ooo0o2 = o00oooo2.f7710o00oooo[i + 1].f7634o00oOo0o;
            if (o00ooo0o2 != null) {
                o00oOoO o00oooo6 = o00ooo0o2.f7638o00oOooO;
                o00oOo0O o00ooo0o3 = o00oooo6.f7710o00oooo[i].f7634o00oOo0o;
                if (o00ooo0o3 != null && o00ooo0o3.f7638o00oOooO == o00oooo2) {
                    o00oooo4 = o00oooo6;
                }
            }
            if (o00oooo4 == null) {
                o00oooo4 = o00oooo2;
                z2 = true;
            }
            o00oooo3 = o00oooo2;
            o00oooo2 = o00oooo4;
        }
        o00oOoO o00oooo7 = this.f7607o00oOOoO;
        if (o00oooo7 != null) {
            this.f7619o00oo00O -= o00oooo7.f7710o00oooo[i].o00oOoO0();
        }
        o00oOoO o00oooo8 = this.f7616o00oOooO;
        if (o00oooo8 != null) {
            this.f7619o00oo00O -= o00oooo8.f7710o00oooo[i + 1].o00oOoO0();
        }
        this.f7608o00oOo00 = o00oooo2;
        if (this.f7621o00oo0O0 == 0 && this.f7620o00oo0O) {
            this.f7609o00oOo0O = o00oooo2;
        } else {
            this.f7609o00oOo0O = this.f7606o00oOOo0;
        }
        if (!this.f7625o00oo0o0 || !this.f7623o00oo0Oo) {
            z = false;
        }
        this.f7624o00oo0o = z;
    }

    public o00oOoO o00oOo00() {
        return this.f7606o00oOOo0;
    }

    public o00oOoO o00oOo0O() {
        return this.f7607o00oOOoO;
    }

    public o00oOoO o00oOo0o() {
        return this.f7609o00oOo0O;
    }

    public o00oOoO o00oOoO() {
        return this.f7612o00oOoO0;
    }

    public o00oOoO o00oOoO0() {
        return this.f7608o00oOo00;
    }

    public o00oOoO o00oOoOO() {
        return this.f7616o00oOooO;
    }

    public float o00oOoOo() {
        return this.f7615o00oOoo0;
    }

    public o00oOoO o00oOooO() {
        return this.f7610o00oOo0o;
    }
}
