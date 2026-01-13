package o0OOOOo;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import o0OO0o.o0O000;
import o0OO0o.o0OO00o0;
import o0OO0o.oO0Oo0oo;
import o0OO0oO.o0O0OO;
import o0OO0oO.o0OO0oO0;
import o0OO0oO.o0OoO00O;
import o0OOOO.o00oOOo0;
import o0OOOOO0.o0ooO;
import o0OOOoO0.o;
import o0OOOoO0.oO000;
import o0OOOoO0.oO0OoOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class o00oo0O0 {
    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.8")
    @NotNull
    public static final <T> oO000<T> o00oOOo0(@NotNull Optional<? extends T> optional) {
        o0ooO.o00oo0O0(optional, "<this>");
        return optional.isPresent() ? oO0OoOO0.o00oo0O(optional.get()) : o.f13767o00oOOo0;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.8")
    public static final <T> T o00oOOoO(@NotNull Optional<? extends T> optional, T t) {
        o0ooO.o00oo0O0(optional, "<this>");
        return optional.isPresent() ? optional.get() : t;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.8")
    public static final <T> T o00oOo00(@NotNull Optional<? extends T> optional, @NotNull o00oOOo0<? extends T> o00oooo02) {
        o0ooO.o00oo0O0(optional, "<this>");
        o0ooO.o00oo0O0(o00oooo02, "defaultValue");
        return optional.isPresent() ? optional.get() : o00oooo02.invoke();
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.8")
    @NotNull
    public static final <T, C extends Collection<? super T>> C o00oOo0O(@NotNull Optional<T> optional, @NotNull C c) {
        o0ooO.o00oo0O0(optional, "<this>");
        o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        if (optional.isPresent()) {
            T t = optional.get();
            o0ooO.o00oo0OO(t, "get()");
            c.add(t);
        }
        return c;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.8")
    @NotNull
    public static final <T> List<T> o00oOo0o(@NotNull Optional<? extends T> optional) {
        o0ooO.o00oo0O0(optional, "<this>");
        return optional.isPresent() ? o0OoO00O.o00oOoo0(optional.get()) : o0OO0oO.o0ooO.INSTANCE;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.8")
    @NotNull
    public static final <T> Set<T> o00oOoO0(@NotNull Optional<? extends T> optional) {
        o0ooO.o00oo0O0(optional, "<this>");
        return optional.isPresent() ? o0OO0oO0.o00oOo0o(optional.get()) : o0O0OO.INSTANCE;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.8")
    @Nullable
    public static final <T> T o00oOooO(@NotNull Optional<T> optional) {
        o0ooO.o00oo0O0(optional, "<this>");
        return optional.orElse(null);
    }
}
