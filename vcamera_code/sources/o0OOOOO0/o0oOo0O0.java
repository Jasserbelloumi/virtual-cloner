package o0OOOOO0;
/* loaded from: classes3.dex */
public class o0oOo0O0 extends o0O0o0 {
    @o0OO0o.o0OO00o0(version = "1.4")
    public o0oOo0O0(Class cls, String str, String str2, int i) {
        super(o0O0000O.NO_RECEIVER, cls, str, str2, i);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public o0oOo0O0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    public o0oOo0O0(o0OOOo.o0O00oO0 o0o00oo0, String str, String str2) {
        super(o0O0000O.NO_RECEIVER, ((o0OoOoOo) o0o00oo0).o00oo0O0(), str, str2, !(o0o00oo0 instanceof o0OOOo.o0O00OO) ? 1 : 0);
    }

    @Override // o0OOOo.o0O0OOO0
    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    @Override // o0OOOo.o0O0O0Oo
    public void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }
}
