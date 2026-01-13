package o0OO0o;

import o0OO0o.oo0oO0;
import org.jetbrains.annotations.NotNull;
@o0OOOOO0.o0OOO00({"SMAP\nResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Result.kt\nkotlin/ResultKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1#2:341\n*E\n"})
/* loaded from: classes.dex */
public final class oo0ooO {
    @o0O
    @o0OO00o0(version = "1.3")
    @NotNull
    public static final Object o00oOOo0(@NotNull Throwable th) {
        o0OOOOO0.o0ooO.o00oo0O0(th, "exception");
        return new oo0oO0.o00oOOoO(th);
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.3")
    public static final <R, T> R o00oOOoO(Object obj, o0OOOO.o00oo<? super T, ? extends R> o00ooVar, o0OOOO.o00oo<? super Throwable, ? extends R> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "onSuccess");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "onFailure");
        Throwable m10exceptionOrNullimpl = oo0oO0.m10exceptionOrNullimpl(obj);
        return m10exceptionOrNullimpl == null ? o00ooVar.invoke(obj) : o00ooVar2.invoke(m10exceptionOrNullimpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.3")
    public static final <R, T extends R> R o00oOo00(Object obj, R r) {
        return oo0oO0.m13isFailureimpl(obj) ? r : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.3")
    public static final <T> T o00oOo0O(Object obj) {
        o00oo0(obj);
        return obj;
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.3")
    public static final <R, T> Object o00oOo0o(Object obj, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        if (oo0oO0.m14isSuccessimpl(obj)) {
            oo0oO0.o00oOOo0 o00oooo02 = oo0oO0.Companion;
            obj = o00ooVar.invoke(obj);
        }
        return oo0oO0.m7constructorimpl(obj);
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.3")
    public static final <T> Object o00oOoO(Object obj, o0OOOO.o00oo<? super Throwable, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        Throwable m10exceptionOrNullimpl = oo0oO0.m10exceptionOrNullimpl(obj);
        if (m10exceptionOrNullimpl != null) {
            o00ooVar.invoke(m10exceptionOrNullimpl);
        }
        return obj;
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.3")
    public static final <R, T> Object o00oOoO0(Object obj, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        if (oo0oO0.m14isSuccessimpl(obj)) {
            try {
                oo0oO0.o00oOOo0 o00oooo02 = oo0oO0.Companion;
                return oo0oO0.m7constructorimpl(o00ooVar.invoke(obj));
            } catch (Throwable th) {
                oo0oO0.o00oOOo0 o00oooo03 = oo0oO0.Companion;
                obj = o00oOOo0(th);
            }
        }
        return oo0oO0.m7constructorimpl(obj);
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.3")
    public static final <T> Object o00oOoOO(Object obj, o0OOOO.o00oo<? super T, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        if (oo0oO0.m14isSuccessimpl(obj)) {
            o00ooVar.invoke(obj);
        }
        return obj;
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.3")
    public static final <R, T extends R> Object o00oOoOo(Object obj, o0OOOO.o00oo<? super Throwable, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        Throwable m10exceptionOrNullimpl = oo0oO0.m10exceptionOrNullimpl(obj);
        if (m10exceptionOrNullimpl == null) {
            return obj;
        }
        oo0oO0.o00oOOo0 o00oooo02 = oo0oO0.Companion;
        return oo0oO0.m7constructorimpl(o00ooVar.invoke(m10exceptionOrNullimpl));
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.3")
    public static final <R, T extends R> Object o00oOoo0(Object obj, o0OOOO.o00oo<? super Throwable, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        Throwable m10exceptionOrNullimpl = oo0oO0.m10exceptionOrNullimpl(obj);
        if (m10exceptionOrNullimpl == null) {
            return obj;
        }
        try {
            oo0oO0.o00oOOo0 o00oooo02 = oo0oO0.Companion;
            return oo0oO0.m7constructorimpl(o00ooVar.invoke(m10exceptionOrNullimpl));
        } catch (Throwable th) {
            oo0oO0.o00oOOo0 o00oooo03 = oo0oO0.Companion;
            return oo0oO0.m7constructorimpl(o00oOOo0(th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.3")
    public static final <R, T extends R> R o00oOooO(Object obj, o0OOOO.o00oo<? super Throwable, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "onFailure");
        Throwable m10exceptionOrNullimpl = oo0oO0.m10exceptionOrNullimpl(obj);
        return m10exceptionOrNullimpl == null ? obj : o00ooVar.invoke(m10exceptionOrNullimpl);
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.3")
    public static final <T, R> Object o00oOooo(T t, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "block");
        try {
            oo0oO0.o00oOOo0 o00oooo02 = oo0oO0.Companion;
            return oo0oO0.m7constructorimpl(o00ooVar.invoke(t));
        } catch (Throwable th) {
            oo0oO0.o00oOOo0 o00oooo03 = oo0oO0.Companion;
            return oo0oO0.m7constructorimpl(o00oOOo0(th));
        }
    }

    @o0O
    @o0OO00o0(version = "1.3")
    public static final void o00oo0(@NotNull Object obj) {
        if (obj instanceof oo0oO0.o00oOOoO) {
            throw ((oo0oO0.o00oOOoO) obj).exception;
        }
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.3")
    public static final <R> Object o00oo00O(o0OOOO.o00oOOo0<? extends R> o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "block");
        try {
            oo0oO0.o00oOOo0 o00oooo03 = oo0oO0.Companion;
            return oo0oO0.m7constructorimpl(o00oooo02.invoke());
        } catch (Throwable th) {
            oo0oO0.o00oOOo0 o00oooo04 = oo0oO0.Companion;
            return oo0oO0.m7constructorimpl(o00oOOo0(th));
        }
    }
}
