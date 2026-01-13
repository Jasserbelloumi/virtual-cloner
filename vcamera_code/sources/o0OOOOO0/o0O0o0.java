package o0OOOOO0;

import o0OOOo.o0O0O0Oo;
import o0OOOo.o0O0OOO0;
/* loaded from: classes3.dex */
public abstract class o0O0o0 extends o0O implements o0OOOo.o0O0O0Oo {
    public o0O0o0() {
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public o0O0o0(Object obj) {
        super(obj);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public o0O0o0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // o0OOOOO0.o0O0000O
    public o0OOOo.o0O00O computeReflected() {
        return o0OOooO0.o00oOoo0(this);
    }

    @Override // o0OOOo.o0O0OOO0
    @o0OO0o.o0OO00o0(version = "1.1")
    public Object getDelegate(Object obj) {
        return ((o0OOOo.o0O0O0Oo) getReflected()).getDelegate(obj);
    }

    @Override // o0OOOo.o0O0OO0
    public o0O0OOO0.o00oOOo0 getGetter() {
        return ((o0OOOo.o0O0O0Oo) getReflected()).getGetter();
    }

    @Override // o0OOOo.o0oO0O0o, o0OOOo.o0O0O0Oo
    public o0O0O0Oo.o00oOOo0 getSetter() {
        return ((o0OOOo.o0O0O0Oo) getReflected()).getSetter();
    }

    @Override // o0OOOO.o00oo
    public Object invoke(Object obj) {
        return get(obj);
    }
}
