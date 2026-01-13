package o0OOOOO0;

import o0OOOo.o0O0OO;
import o0OOOo.o0O0oo0o;
/* loaded from: classes3.dex */
public abstract class o0O0o00 extends o0O implements o0OOOo.o0O0oo0o {
    public o0O0o00() {
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public o0O0o00(Object obj) {
        super(obj);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public o0O0o00(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // o0OOOOO0.o0O0000O
    public o0OOOo.o0O00O computeReflected() {
        return o0OOooO0.o00oOoOo(this);
    }

    @Override // o0OOOo.o0O0OO
    @o0OO0o.o0OO00o0(version = "1.1")
    public Object getDelegate() {
        return ((o0OOOo.o0O0oo0o) getReflected()).getDelegate();
    }

    @Override // o0OOOo.o0O0OO0
    public o0O0OO.o00oOOo0 getGetter() {
        return ((o0OOOo.o0O0oo0o) getReflected()).getGetter();
    }

    @Override // o0OOOo.o0oO0O0o, o0OOOo.o0O0O0Oo
    public o0O0oo0o.o00oOOo0 getSetter() {
        return ((o0OOOo.o0O0oo0o) getReflected()).getSetter();
    }

    @Override // o0OOOO.o00oOOo0
    public Object invoke() {
        return get();
    }
}
