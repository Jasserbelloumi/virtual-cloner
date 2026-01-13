package o0OOOoO0;

import java.util.Collection;
import java.util.Iterator;
import o0OO.o00oOo0O;
import o0OO.o00oo0O;
import o0OO0o.o0OO00o0;
import o0OOO00o.o00oOOo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o00oo0O
@o0OO00o0(version = "1.3")
/* loaded from: classes3.dex */
public abstract class oO000O0O<T> {
    @Nullable
    public abstract Object o00oOOoO(T t, @NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2);

    @Nullable
    public final Object o00oOo00(@NotNull Iterable<? extends T> iterable, @NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        Object o00oOooO2;
        return (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) && (o00oOooO2 = o00oOooO(iterable.iterator(), o00ooo0o2)) == o00oOOo0.COROUTINE_SUSPENDED) ? o00oOooO2 : o0OO0o.oO0Ooooo.f13240o00oOOo0;
    }

    @Nullable
    public final Object o00oOo0O(@NotNull oO000<? extends T> oo000, @NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        Object o00oOooO2 = o00oOooO(oo000.iterator(), o00ooo0o2);
        return o00oOooO2 == o00oOOo0.COROUTINE_SUSPENDED ? o00oOooO2 : o0OO0o.oO0Ooooo.f13240o00oOOo0;
    }

    @Nullable
    public abstract Object o00oOooO(@NotNull Iterator<? extends T> it, @NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2);
}
