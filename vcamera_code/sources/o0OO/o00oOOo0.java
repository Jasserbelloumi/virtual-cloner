package o0OO;

import o0OO.o00oo0;
import o0OO0o.o0OO00o0;
import o0OOOO.o0O00000;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OO00o0(version = "1.3")
/* loaded from: classes3.dex */
public abstract class o00oOOo0 implements o00oo0.o00oOOoO {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00oo0.o00oOo00<?> f12923o00oo0O0;

    public o00oOOo0(@NotNull o00oo0.o00oOo00<?> o00ooo002) {
        o0ooO.o00oo0O0(o00ooo002, "key");
        this.f12923o00oo0O0 = o00ooo002;
    }

    @Override // o0OO.o00oo0.o00oOOoO, o0OO.o00oo0
    public <R> R fold(R r, @NotNull o0O00000<? super R, ? super o00oo0.o00oOOoO, ? extends R> o0o00000) {
        return (R) o00oo0.o00oOOoO.o00oOOo0.o00oOOo0(this, r, o0o00000);
    }

    @Override // o0OO.o00oo0.o00oOOoO, o0OO.o00oo0
    @Nullable
    public <E extends o00oo0.o00oOOoO> E get(@NotNull o00oo0.o00oOo00<E> o00ooo002) {
        return (E) o00oo0.o00oOOoO.o00oOOo0.o00oOOoO(this, o00ooo002);
    }

    @Override // o0OO.o00oo0.o00oOOoO
    @NotNull
    public o00oo0.o00oOo00<?> getKey() {
        return this.f12923o00oo0O0;
    }

    @Override // o0OO.o00oo0.o00oOOoO, o0OO.o00oo0
    @NotNull
    public o00oo0 minusKey(@NotNull o00oo0.o00oOo00<?> o00ooo002) {
        return o00oo0.o00oOOoO.o00oOOo0.o00oOo00(this, o00ooo002);
    }

    @Override // o0OO.o00oo0
    @NotNull
    public o00oo0 plus(@NotNull o00oo0 o00oo0Var) {
        return o00oo0.o00oOOoO.o00oOOo0.o00oOooO(this, o00oo0Var);
    }
}
