package o0OOOOO0;
/* loaded from: classes3.dex */
public class o0O0oo00 extends oooOO0 {
    @o0OO0o.o0OO00o0(version = "1.4")
    public o0O0oo00(Class cls, String str, String str2, int i) {
        super(cls, str, str2, i);
    }

    public o0O0oo00(o0OOOo.o0O00oO0 o0o00oo0, String str, String str2) {
        super(((o0OoOoOo) o0o00oo0).o00oo0O0(), str, str2, !(o0o00oo0 instanceof o0OOOo.o0O00OO) ? 1 : 0);
    }

    @Override // o0OOOo.o0O0OOO
    public Object get(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }

    @Override // o0OOOo.o0O0O0o0
    public void set(Object obj, Object obj2, Object obj3) {
        getSetter().call(obj, obj2, obj3);
    }
}
