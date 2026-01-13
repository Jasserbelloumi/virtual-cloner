package o0OO0o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OO00o0(version = "1.1")
/* loaded from: classes.dex */
public final class o0O00O implements Comparable<o0O00O> {

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f13196o00oo0oO = 255;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final int f13198o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final int f13199o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final int f13200o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final int f13201o00oo0o0;
    @NotNull

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final o00oOOo0 f13195o00oo0o = new o00oOOo0(null);
    @o0OOOO0o.o00oOoO
    @NotNull

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final o0O00O f13197o0O0o = o0O00OO.o00oOOo0();

    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0OOOOO0.o0O00 o0o00) {
        }
    }

    public o0O00O(int i, int i2) {
        this(i, i2, 0);
    }

    public o0O00O(int i, int i2, int i3) {
        this.f13199o00oo0O0 = i;
        this.f13198o00oo0O = i2;
        this.f13200o00oo0Oo = i3;
        this.f13201o00oo0o0 = o00oOoo0(i, i2, i3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        o0O00O o0o00o = obj instanceof o0O00O ? (o0O00O) obj : null;
        return o0o00o != null && this.f13201o00oo0o0 == o0o00o.f13201o00oo0o0;
    }

    public int hashCode() {
        return this.f13201o00oo0o0;
    }

    @Override // java.lang.Comparable
    /* renamed from: o00oOOoO */
    public int compareTo(@NotNull o0O00O o0o00o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o, "other");
        return this.f13201o00oo0o0 - o0o00o.f13201o00oo0o0;
    }

    public final int o00oOo0O() {
        return this.f13198o00oo0O;
    }

    public final int o00oOo0o() {
        return this.f13200o00oo0Oo;
    }

    public final boolean o00oOoO(int i, int i2) {
        int i3 = this.f13199o00oo0O0;
        return i3 > i || (i3 == i && this.f13198o00oo0O >= i2);
    }

    public final boolean o00oOoOo(int i, int i2, int i3) {
        int i4;
        int i5 = this.f13199o00oo0O0;
        return i5 > i || (i5 == i && ((i4 = this.f13198o00oo0O) > i2 || (i4 == i2 && this.f13200o00oo0Oo >= i3)));
    }

    public final int o00oOoo0(int i, int i2, int i3) {
        boolean z = false;
        if (new o0OOOo0o.o0O0O0Oo(0, 255).o00oOoo0(i) && new o0OOOo0o.o0O0O0Oo(0, 255).o00oOoo0(i2) && new o0OOOo0o.o0O0O0Oo(0, 255).o00oOoo0(i3)) {
            z = true;
        }
        if (z) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    public final int o00oOooO() {
        return this.f13199o00oo0O0;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13199o00oo0O0);
        sb.append('.');
        sb.append(this.f13198o00oo0O);
        sb.append('.');
        sb.append(this.f13200o00oo0Oo);
        return sb.toString();
    }
}
