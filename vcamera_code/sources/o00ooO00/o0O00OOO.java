package o00ooO00;

import o00ooO00.o0O00;
/* loaded from: classes.dex */
public class o0O00OOO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f8668o00oOOo0 = "TransitionBuilder";

    public static o0O00.o00oOOoO o00oOOo0(o0O00 o0o00, int i, int i2, androidx.constraintlayout.widget.o00oOoO o00oooo2, int i3, androidx.constraintlayout.widget.o00oOoO o00oooo3) {
        o0O00.o00oOOoO o00ooooo2 = new o0O00.o00oOOoO(i, o0o00, i2, i3);
        o00oOOoO(o0o00, o00ooooo2, o00oooo2, o00oooo3);
        return o00ooooo2;
    }

    public static void o00oOOoO(o0O00 o0o00, o0O00.o00oOOoO o00ooooo2, androidx.constraintlayout.widget.o00oOoO o00oooo2, androidx.constraintlayout.widget.o00oOoO o00oooo3) {
        int o00ooOo2 = o00ooooo2.o00ooOo();
        int o00ooO0O2 = o00ooooo2.o00ooO0O();
        o0o00.o0O0000O(o00ooOo2, o00oooo2);
        o0o00.o0O0000O(o00ooO0O2, o00oooo3);
    }

    public static void o00oOo00(o0O000Oo o0o000oo) {
        o0O00 o0o00 = o0o000oo.f8468o00oo0O0;
        if (o0o00 == null) {
            throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
        }
        if (!o0o00.o0ooOoOO(o0o000oo)) {
            throw new RuntimeException("MotionLayout doesn't have the right motion scene.");
        }
        if (o0o00.f8279o00oOo00 == null || o0o00.o00oo0OO().isEmpty()) {
            throw new RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
        }
    }
}
