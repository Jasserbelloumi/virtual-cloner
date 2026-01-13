package o0OO;

import java.io.Serializable;
import o0OO.o00oo0;
import o0OO0o.o0OO00o0;
import o0OOOO.o0O00000;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OO00o0(version = "1.3")
/* loaded from: classes3.dex */
public final class o00oo0O0 implements o00oo0, Serializable {
    @NotNull
    public static final o00oo0O0 INSTANCE = new o00oo0O0();
    private static final long serialVersionUID = 0;

    private o00oo0O0() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // o0OO.o00oo0
    public <R> R fold(R r, @NotNull o0O00000<? super R, ? super o00oo0.o00oOOoO, ? extends R> o0o00000) {
        o0ooO.o00oo0O0(o0o00000, "operation");
        return r;
    }

    @Override // o0OO.o00oo0
    @Nullable
    public <E extends o00oo0.o00oOOoO> E get(@NotNull o00oo0.o00oOo00<E> o00ooo002) {
        o0ooO.o00oo0O0(o00ooo002, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // o0OO.o00oo0
    @NotNull
    public o00oo0 minusKey(@NotNull o00oo0.o00oOo00<?> o00ooo002) {
        o0ooO.o00oo0O0(o00ooo002, "key");
        return this;
    }

    @Override // o0OO.o00oo0
    @NotNull
    public o00oo0 plus(@NotNull o00oo0 o00oo0Var) {
        o0ooO.o00oo0O0(o00oo0Var, "context");
        return o00oo0Var;
    }

    @NotNull
    public String toString() {
        return "EmptyCoroutineContext";
    }
}
