package o0OOOo00;

import o0OOOOO0.o0ooO;
import o0OOOo.o0O0OO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public abstract class o00oOo0O<V> implements o00oo0<Object, V> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public V f13699o00oOOo0;

    public o00oOo0O(V v) {
        this.f13699o00oOOo0 = v;
    }

    @Override // o0OOOo00.o00oo0, o0OOOo00.o00oo00O
    public V o00oOOo0(@Nullable Object obj, @NotNull o0O0OO0<?> o0o0oo0) {
        o0ooO.o00oo0O0(o0o0oo0, "property");
        return this.f13699o00oOOo0;
    }

    @Override // o0OOOo00.o00oo0
    public void o00oOOoO(@Nullable Object obj, @NotNull o0O0OO0<?> o0o0oo0, V v) {
        o0ooO.o00oo0O0(o0o0oo0, "property");
        V v2 = this.f13699o00oOOo0;
        if (o00oOooO(o0o0oo0, v2, v)) {
            this.f13699o00oOOo0 = v;
            o00oOo00(o0o0oo0, v2, v);
        }
    }

    public void o00oOo00(@NotNull o0O0OO0<?> o0o0oo0, V v, V v2) {
        o0ooO.o00oo0O0(o0o0oo0, "property");
    }

    public boolean o00oOooO(@NotNull o0O0OO0<?> o0o0oo0, V v, V v2) {
        o0ooO.o00oo0O0(o0o0oo0, "property");
        return true;
    }
}
