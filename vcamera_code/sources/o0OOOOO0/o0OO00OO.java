package o0OOOOO0;

import o0OOOo.o0O0OOO0;
/* loaded from: classes3.dex */
public abstract class o0OO00OO extends o0OO0 implements o0OOOo.o0O0OOO0 {
    public o0OO00OO() {
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public o0OO00OO(Object obj) {
        super(obj);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public o0OO00OO(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // o0OOOOO0.o0O0000O
    public o0OOOo.o0O00O computeReflected() {
        return o0OOooO0.o00oo0oO(this);
    }

    @Override // o0OOOo.o0O0OOO0
    @o0OO0o.o0OO00o0(version = "1.1")
    public Object getDelegate(Object obj) {
        return ((o0OOOo.o0O0OOO0) getReflected()).getDelegate(obj);
    }

    @Override // o0OOOo.o0O0OO0
    public o0O0OOO0.o00oOOo0 getGetter() {
        return ((o0OOOo.o0O0OOO0) getReflected()).getGetter();
    }

    @Override // o0OOOO.o00oo
    public Object invoke(Object obj) {
        return get(obj);
    }
}
