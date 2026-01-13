package o0OO;

import o0OO.o00oo0;
import o0OO.o00oo0.o00oOOoO;
import o0OO0o.o0O000;
import o0OO0o.o0OO00o0;
import o0OOOO.o00oo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0O000
@o0OO00o0(version = "1.3")
/* loaded from: classes3.dex */
public abstract class o00oOOoO<B extends o00oo0.o00oOOoO, E extends B> implements o00oo0.o00oOo00<E> {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o00oo0.o00oOo00<?> f12924o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00oo<o00oo0.o00oOOoO, E> f12925o00oo0O0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [o0OOOO.o00oo<? super o0OO.o00oo0$o00oOOoO, ? extends E extends B>, java.lang.Object, o0OOOO.o00oo<o0OO.o00oo0$o00oOOoO, E extends B>] */
    public o00oOOoO(@NotNull o00oo0.o00oOo00<B> o00ooo002, @NotNull o00oo<? super o00oo0.o00oOOoO, ? extends E> o00ooVar) {
        o0ooO.o00oo0O0(o00ooo002, "baseKey");
        o0ooO.o00oo0O0(o00ooVar, "safeCast");
        this.f12925o00oo0O0 = o00ooVar;
        this.f12924o00oo0O = o00ooo002 instanceof o00oOOoO ? (o00oo0.o00oOo00<B>) ((o00oOOoO) o00ooo002).f12924o00oo0O : o00ooo002;
    }

    public final boolean o00oOOo0(@NotNull o00oo0.o00oOo00<?> o00ooo002) {
        o0ooO.o00oo0O0(o00ooo002, "key");
        return o00ooo002 == this || this.f12924o00oo0O == o00ooo002;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lo0OO/o00oo0$o00oOOoO;)TE; */
    @Nullable
    public final o00oo0.o00oOOoO o00oOOoO(@NotNull o00oo0.o00oOOoO o00ooooo2) {
        o0ooO.o00oo0O0(o00ooooo2, "element");
        return (o00oo0.o00oOOoO) this.f12925o00oo0O0.invoke(o00ooooo2);
    }
}
