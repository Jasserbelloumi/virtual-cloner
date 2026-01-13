package o0OOOo00;

import o0OOOOO0.o0ooO;
import o0OOOo.o0O0OO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class o00oOo00<T> implements o00oo0<Object, T> {
    @Nullable

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public T f13698o00oOOo0;

    @Override // o0OOOo00.o00oo0, o0OOOo00.o00oo00O
    @NotNull
    public T o00oOOo0(@Nullable Object obj, @NotNull o0O0OO0<?> o0o0oo0) {
        o0ooO.o00oo0O0(o0o0oo0, "property");
        T t = this.f13698o00oOOo0;
        if (t != null) {
            return t;
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Property ");
        o00oOOo02.append(o0o0oo0.getName());
        o00oOOo02.append(" should be initialized before get.");
        throw new IllegalStateException(o00oOOo02.toString());
    }

    @Override // o0OOOo00.o00oo0
    public void o00oOOoO(@Nullable Object obj, @NotNull o0O0OO0<?> o0o0oo0, @NotNull T t) {
        o0ooO.o00oo0O0(o0o0oo0, "property");
        o0ooO.o00oo0O0(t, "value");
        this.f13698o00oOOo0 = t;
    }
}
