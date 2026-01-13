package o0OO0oO;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class o0O0o000<T> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final int f13361o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final T f13362o00oOOoO;

    public o0O0o000(int i, T t) {
        this.f13361o00oOOo0 = i;
        this.f13362o00oOOoO = t;
    }

    public static o0O0o000 o00oOooO(o0O0o000 o0o0o000, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = o0o0o000.f13361o00oOOo0;
        }
        if ((i2 & 2) != 0) {
            obj = o0o0o000.f13362o00oOOoO;
        }
        o0o0o000.getClass();
        return new o0O0o000(i, obj);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0O0o000) {
            o0O0o000 o0o0o000 = (o0O0o000) obj;
            return this.f13361o00oOOo0 == o0o0o000.f13361o00oOOo0 && o0OOOOO0.o0ooO.o00oOoO0(this.f13362o00oOOoO, o0o0o000.f13362o00oOOoO);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f13361o00oOOo0) * 31;
        T t = this.f13362o00oOOoO;
        return hashCode + (t == null ? 0 : t.hashCode());
    }

    public final int o00oOOo0() {
        return this.f13361o00oOOo0;
    }

    public final T o00oOOoO() {
        return this.f13362o00oOOoO;
    }

    @NotNull
    public final o0O0o000<T> o00oOo00(int i, T t) {
        return new o0O0o000<>(i, t);
    }

    public final int o00oOo0O() {
        return this.f13361o00oOOo0;
    }

    public final T o00oOo0o() {
        return this.f13362o00oOOoO;
    }

    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("IndexedValue(index=");
        o00oOOo02.append(this.f13361o00oOOo0);
        o00oOOo02.append(", value=");
        o00oOOo02.append(this.f13362o00oOOoO);
        o00oOOo02.append(')');
        return o00oOOo02.toString();
    }
}
