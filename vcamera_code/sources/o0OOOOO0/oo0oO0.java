package o0OOOOO0;

import o0OOOo.o0O0OO;
/* loaded from: classes3.dex */
public abstract class oo0oO0 extends o0OO0 implements o0OOOo.o0O0OO {
    public oo0oO0() {
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public oo0oO0(Object obj) {
        super(obj);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public oo0oO0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // o0OOOOO0.o0O0000O
    public o0OOOo.o0O00O computeReflected() {
        return o0OOooO0.o00oo0o(this);
    }

    @Override // o0OOOo.o0O0OO
    @o0OO0o.o0OO00o0(version = "1.1")
    public Object getDelegate() {
        return ((o0OOOo.o0O0OO) getReflected()).getDelegate();
    }

    @Override // o0OOOo.o0O0OO0
    public o0O0OO.o00oOOo0 getGetter() {
        return ((o0OOOo.o0O0OO) getReflected()).getGetter();
    }

    @Override // o0OOOO.o00oOOo0
    public Object invoke() {
        return get();
    }
}
