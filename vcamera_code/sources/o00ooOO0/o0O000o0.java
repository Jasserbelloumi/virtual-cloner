package o00ooOO0;

import o00ooOO0.o0O000Oo;
/* loaded from: classes.dex */
public class o0O000o0 extends o0O000Oo {

    /* renamed from: o00oo00O  reason: collision with root package name */
    public int f8897o00oo00O;

    public o0O000o0(o0O00o00 o0o00o00) {
        super(o0o00o00);
        this.f8888o00oOo0O = o0o00o00 instanceof o0O00O ? o0O000Oo.o00oOOo0.HORIZONTAL_DIMENSION : o0O000Oo.o00oOOo0.VERTICAL_DIMENSION;
    }

    @Override // o00ooOO0.o0O000Oo
    public void o00oOo0O(int i) {
        if (this.f8893o00oOoOo) {
            return;
        }
        this.f8893o00oOoOo = true;
        this.f8891o00oOoO0 = i;
        for (o0O000 o0o000 : this.f8894o00oOoo0) {
            o0o000.o00oOOo0(o0o000);
        }
    }
}
