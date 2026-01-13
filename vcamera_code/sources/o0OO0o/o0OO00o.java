package o0OO0o;
/* loaded from: classes.dex */
public class o0OO00o {
    @o0OOO0OO.o00oo00O
    public static final Void o00oOOo0() {
        throw new o0O0O0o0(null, 1, null);
    }

    @o0OOO0OO.o00oo00O
    public static final Void o00oOOoO(String str) {
        o0OOOOO0.o0ooO.o00oo0O0(str, "reason");
        throw new o0O0O0o0(o00oOoOo.o00oo.o00oOOo0("An operation is not implemented: ", str));
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.1")
    public static final <T> T o00oOo00(T t, o0OOOO.o00oo<? super T, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "block");
        o00ooVar.invoke(t);
        return t;
    }

    @o0OOO0OO.o00oo00O
    public static final <T, R> R o00oOo0O(T t, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "block");
        return o00ooVar.invoke(t);
    }

    @o0OOO0OO.o00oo00O
    public static final void o00oOo0o(int i, o0OOOO.o00oo<? super Integer, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        for (int i2 = 0; i2 < i; i2++) {
            o00ooVar.invoke(Integer.valueOf(i2));
        }
    }

    @o0OOO0OO.o00oo00O
    public static final <R> R o00oOoO(o0OOOO.o00oOOo0<? extends R> o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "block");
        return o00oooo02.invoke();
    }

    @o0OOO0OO.o00oo00O
    public static final <T, R> R o00oOoO0(T t, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "block");
        return o00ooVar.invoke(t);
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.1")
    public static final <T> T o00oOoOO(T t, o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        if (o00ooVar.invoke(t).booleanValue()) {
            return t;
        }
        return null;
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.1")
    public static final <T> T o00oOoOo(T t, o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        if (o00ooVar.invoke(t).booleanValue()) {
            return null;
        }
        return t;
    }

    @o0OOO0OO.o00oo00O
    public static final <T, R> R o00oOoo0(T t, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "block");
        return o00ooVar.invoke(t);
    }

    @o0OOO0OO.o00oo00O
    public static final <T> T o00oOooO(T t, o0OOOO.o00oo<? super T, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "block");
        o00ooVar.invoke(t);
        return t;
    }
}
