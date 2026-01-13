package o0OOOOO0;
/* loaded from: classes3.dex */
public class o0O0o00O extends o0O0o00 {
    @o0OO0o.o0OO00o0(version = "1.4")
    public o0O0o00O(Class cls, String str, String str2, int i) {
        super(o0O0000O.NO_RECEIVER, cls, str, str2, i);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public o0O0o00O(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    public o0O0o00O(o0OOOo.o0O00oO0 o0o00oo0, String str, String str2) {
        super(o0O0000O.NO_RECEIVER, ((o0OoOoOo) o0o00oo0).o00oo0O0(), str, str2, !(o0o00oo0 instanceof o0OOOo.o0O00OO) ? 1 : 0);
    }

    @Override // o0OOOo.o0O0OO
    public Object get() {
        return getGetter().call(new Object[0]);
    }

    @Override // o0OOOo.o0O0oo0o
    public void set(Object obj) {
        getSetter().call(obj);
    }
}
