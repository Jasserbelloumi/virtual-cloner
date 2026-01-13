package o0OOOOO0;

import o0OOOo.o0O0O0o0;
import o0OOOo.o0O0OOO;
/* loaded from: classes3.dex */
public abstract class oooOO0 extends o0O implements o0OOOo.o0O0O0o0 {
    public oooOO0() {
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public oooOO0(Class cls, String str, String str2, int i) {
        super(o0O0000O.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // o0OOOOO0.o0O0000O
    public o0OOOo.o0O00O computeReflected() {
        return o0OOooO0.o00oOooo(this);
    }

    @Override // o0OOOo.o0O0OOO
    @o0OO0o.o0OO00o0(version = "1.1")
    public Object getDelegate(Object obj, Object obj2) {
        return ((o0OOOo.o0O0O0o0) getReflected()).getDelegate(obj, obj2);
    }

    @Override // o0OOOo.o0O0OO0
    public o0O0OOO.o00oOOo0 getGetter() {
        return ((o0OOOo.o0O0O0o0) getReflected()).getGetter();
    }

    @Override // o0OOOo.o0oO0O0o, o0OOOo.o0O0O0Oo
    public o0O0O0o0.o00oOOo0 getSetter() {
        return ((o0OOOo.o0O0O0o0) getReflected()).getSetter();
    }

    @Override // o0OOOO.o0O00000
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }
}
