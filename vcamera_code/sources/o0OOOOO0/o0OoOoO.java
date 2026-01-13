package o0OOOOO0;

import o0OOOo.o0O0OOO;
/* loaded from: classes3.dex */
public abstract class o0OoOoO extends o0OO0 implements o0OOOo.o0O0OOO {
    public o0OoOoO() {
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public o0OoOoO(Class cls, String str, String str2, int i) {
        super(o0O0000O.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // o0OOOOO0.o0O0000O
    public o0OOOo.o0O00O computeReflected() {
        return o0OOooO0.o0O0o(this);
    }

    @Override // o0OOOo.o0O0OOO
    @o0OO0o.o0OO00o0(version = "1.1")
    public Object getDelegate(Object obj, Object obj2) {
        return ((o0OOOo.o0O0OOO) getReflected()).getDelegate(obj, obj2);
    }

    @Override // o0OOOo.o0O0OO0
    public o0O0OOO.o00oOOo0 getGetter() {
        return ((o0OOOo.o0O0OOO) getReflected()).getGetter();
    }

    @Override // o0OOOO.o0O00000
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }
}
