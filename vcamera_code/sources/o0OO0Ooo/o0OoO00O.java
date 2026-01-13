package o0OO0Ooo;

import o00oOooO.o0OO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes2.dex */
public final class o0OoO00O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final int f13182o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final int f13183o00oOOoO;

    public o0OoO00O(@o0OO0 int i, @o0OO0 int i2) {
        this.f13182o00oOOo0 = i;
        this.f13183o00oOOoO = i2;
    }

    public static o0OoO00O o00oOooO(o0OoO00O o0ooo00o, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = o0ooo00o.f13182o00oOOo0;
        }
        if ((i3 & 2) != 0) {
            i2 = o0ooo00o.f13183o00oOOoO;
        }
        o0ooo00o.getClass();
        return new o0OoO00O(i, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0OoO00O) {
            o0OoO00O o0ooo00o = (o0OoO00O) obj;
            return this.f13182o00oOOo0 == o0ooo00o.f13182o00oOOo0 && this.f13183o00oOOoO == o0ooo00o.f13183o00oOOoO;
        }
        return false;
    }

    public int hashCode() {
        return Integer.hashCode(this.f13183o00oOOoO) + (Integer.hashCode(this.f13182o00oOOo0) * 31);
    }

    public final int o00oOOo0() {
        return this.f13182o00oOOo0;
    }

    public final int o00oOOoO() {
        return this.f13183o00oOOoO;
    }

    @NotNull
    public final o0OoO00O o00oOo00(@o0OO0 int i, @o0OO0 int i2) {
        return new o0OoO00O(i, i2);
    }

    public final int o00oOo0O() {
        return this.f13183o00oOOoO;
    }

    public final int o00oOo0o() {
        return this.f13182o00oOOo0;
    }

    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("SpinnerSizeSpec(width=");
        o00oOOo02.append(this.f13182o00oOOo0);
        o00oOOo02.append(", height=");
        o00oOOo02.append(this.f13183o00oOOoO);
        o00oOOo02.append(')');
        return o00oOOo02.toString();
    }
}
