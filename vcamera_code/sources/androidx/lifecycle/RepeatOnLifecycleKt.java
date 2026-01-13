package androidx.lifecycle;

import androidx.lifecycle.o0O00;
import o0OO0o.oO0Ooooo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt {
    @Nullable
    public static final Object o00oOOo0(@NotNull o0O00 o0o00, @NotNull o0O00.o00oOOoO o00ooooo2, @NotNull o0OOOO.o0O00000<? super o0OOo00O.o0O0oo00, ? super o0OO.o00oOo0O<? super oO0Ooooo>, ? extends Object> o0o00000, @NotNull o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
        Object o00oOoO02;
        if (o00ooooo2 != o0O00.o00oOOoO.INITIALIZED) {
            return (o0o00.o00oOOoO() != o0O00.o00oOOoO.DESTROYED && (o00oOoO02 = o0OOo00O.o0O.o00oOoO0(new RepeatOnLifecycleKt$repeatOnLifecycle$3(o0o00, o00ooooo2, o0o00000, null), o00ooo0o2)) == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED) ? o00oOoO02 : oO0Ooooo.f13240o00oOOo0;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
    }

    @Nullable
    public static final Object o00oOOoO(@NotNull o0O0O0O o0o0o0o, @NotNull o0O00.o00oOOoO o00ooooo2, @NotNull o0OOOO.o0O00000<? super o0OOo00O.o0O0oo00, ? super o0OO.o00oOo0O<? super oO0Ooooo>, ? extends Object> o0o00000, @NotNull o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
        Object o00oOOo02 = o00oOOo0(o0o0o0o.getLifecycle(), o00ooooo2, o0o00000, o00ooo0o2);
        return o00oOOo02 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? o00oOOo02 : oO0Ooooo.f13240o00oOOo0;
    }
}
