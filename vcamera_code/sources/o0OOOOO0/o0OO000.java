package o0OOOOO0;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OO0o.o0OO00o0(version = "1.1")
/* loaded from: classes3.dex */
public final class o0OO000 implements o0OoOoOo {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final String f13603o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Class<?> f13604o00oo0O0;

    public o0OO000(@NotNull Class<?> cls, @NotNull String str) {
        o0ooO.o00oo0O0(cls, "jClass");
        o0ooO.o00oo0O0(str, "moduleName");
        this.f13604o00oo0O0 = cls;
        this.f13603o00oo0O = str;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof o0OO000) && o0ooO.o00oOoO0(this.f13604o00oo0O0, ((o0OO000) obj).f13604o00oo0O0);
    }

    public int hashCode() {
        return this.f13604o00oo0O0.hashCode();
    }

    @Override // o0OOOo.o0O00oO0
    @NotNull
    public Collection<o0OOOo.o0O00O<?>> o00oOOo0() {
        throw new o0OOOO0o.o0O0000O();
    }

    @Override // o0OOOOO0.o0OoOoOo
    @NotNull
    public Class<?> o00oo0O0() {
        return this.f13604o00oo0O0;
    }

    @NotNull
    public String toString() {
        return this.f13604o00oo0O0.toString() + o0OOooO0.f13633o00oOOoO;
    }
}
