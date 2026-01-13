package o0OO0o;
@o0OOOOO0.o0OOO00({"SMAP\nPreconditions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preconditions.kt\nkotlin/PreconditionsKt__PreconditionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
/* loaded from: classes.dex */
public class oooOO0 extends o0oOo0O0 {
    @o0OOO0OO.o00oo00O
    public static final void o00oOo00(boolean z) {
        if (!z) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @o0OOO0OO.o00oo00O
    public static final <T> T o00oOo0O(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @o0OOO0OO.o00oo00O
    public static final <T> T o00oOo0o(T t, o0OOOO.o00oOOo0<? extends Object> o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "lazyMessage");
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(o00oooo02.invoke().toString());
    }

    @o0OOO0OO.o00oo00O
    public static final void o00oOoO(boolean z) {
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @o0OOO0OO.o00oo00O
    public static final Void o00oOoO0(Object obj) {
        o0OOOOO0.o0ooO.o00oo0O0(obj, "message");
        throw new IllegalStateException(obj.toString());
    }

    @o0OOO0OO.o00oo00O
    public static final void o00oOoOO(boolean z, o0OOOO.o00oOOo0<? extends Object> o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "lazyMessage");
        if (!z) {
            throw new IllegalArgumentException(o00oooo02.invoke().toString());
        }
    }

    @o0OOO0OO.o00oo00O
    public static final <T> T o00oOoOo(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @o0OOO0OO.o00oo00O
    public static final <T> T o00oOoo0(T t, o0OOOO.o00oOOo0<? extends Object> o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "lazyMessage");
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(o00oooo02.invoke().toString());
    }

    @o0OOO0OO.o00oo00O
    public static final void o00oOooO(boolean z, o0OOOO.o00oOOo0<? extends Object> o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "lazyMessage");
        if (!z) {
            throw new IllegalStateException(o00oooo02.invoke().toString());
        }
    }
}
