package o0OO0o;
/* loaded from: classes.dex */
public class o0OO0 extends o0OO00o {
    @o0OOO0OO.o00oo00O
    public static final <R> R o00oOooo(Object obj, o0OOOO.o00oOOo0<? extends R> o00oooo02) {
        R invoke;
        o0OOOOO0.o0ooO.o00oo0O0(obj, "lock");
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "block");
        synchronized (obj) {
            invoke = o00oooo02.invoke();
        }
        return invoke;
    }
}
