package o0OOOooO;

import android.support.v4.media.o00oOo0O;
import o0OO0o.o0OO00o0;
import o0OOOOO0.o0O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0O0OOO0
@o0OO00o0(version = "1.3")
/* loaded from: classes3.dex */
public final class o0O0o0<T> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final T f13956o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final long f13957o00oOOoO;

    public o0O0o0(T t, long j) {
        this.f13956o00oOOo0 = t;
        this.f13957o00oOOoO = j;
    }

    public /* synthetic */ o0O0o0(Object obj, long j, o0O00 o0o00) {
        this(obj, j);
    }

    public static o0O0o0 o00oOooO(o0O0o0 o0o0o0, Object obj, long j, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = o0o0o0.f13956o00oOOo0;
        }
        if ((i & 2) != 0) {
            j = o0o0o0.f13957o00oOOoO;
        }
        o0o0o0.getClass();
        return new o0O0o0(obj, j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0O0o0) {
            o0O0o0 o0o0o0 = (o0O0o0) obj;
            return o0OOOOO0.o0ooO.o00oOoO0(this.f13956o00oOOo0, o0o0o0.f13956o00oOOo0) && o0oO0O0o.o00oo0Oo(this.f13957o00oOOoO, o0o0o0.f13957o00oOOoO);
        }
        return false;
    }

    public int hashCode() {
        T t = this.f13956o00oOOo0;
        return o0oO0O0o.o0O000O(this.f13957o00oOOoO) + ((t == null ? 0 : t.hashCode()) * 31);
    }

    public final T o00oOOo0() {
        return this.f13956o00oOOo0;
    }

    public final long o00oOOoO() {
        return this.f13957o00oOOoO;
    }

    @NotNull
    public final o0O0o0<T> o00oOo00(T t, long j) {
        return new o0O0o0<>(t, j);
    }

    public final long o00oOo0O() {
        return this.f13957o00oOOoO;
    }

    public final T o00oOo0o() {
        return this.f13956o00oOOo0;
    }

    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("TimedValue(value=");
        o00oOOo02.append(this.f13956o00oOOo0);
        o00oOOo02.append(", duration=");
        o00oOOo02.append((Object) o0oO0O0o.o0O00o0o(this.f13957o00oOOoO));
        o00oOOo02.append(')');
        return o00oOOo02.toString();
    }
}
