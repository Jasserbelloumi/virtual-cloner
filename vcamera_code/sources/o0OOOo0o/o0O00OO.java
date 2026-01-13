package o0OOOo0o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class o0O00OO implements o0oO0Ooo<Double> {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final double f13706o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final double f13707o00oo0O0;

    public o0O00OO(double d, double d2) {
        this.f13707o00oo0O0 = d;
        this.f13706o00oo0O = d2;
    }

    @Override // o0OOOo0o.o0oO0Ooo, o0OOOo0o.o0O00o00, o0OOOo0o.o0O0OOO
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return o00oOooO(((Number) comparable).doubleValue());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o0O00OO) {
            if (isEmpty() && ((o0O00OO) obj).isEmpty()) {
                return true;
            }
            o0O00OO o0o00oo = (o0O00OO) obj;
            if (this.f13707o00oo0O0 == o0o00oo.f13707o00oo0O0) {
                if (this.f13706o00oo0O == o0o00oo.f13706o00oo0O) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this.f13707o00oo0O0) * 31) + Double.hashCode(this.f13706o00oo0O);
    }

    @Override // o0OOOo0o.o0oO0Ooo, o0OOOo0o.o0O00o00, o0OOOo0o.o0O0OOO
    public boolean isEmpty() {
        return this.f13707o00oo0O0 > this.f13706o00oo0O;
    }

    @Override // o0OOOo0o.o0oO0Ooo
    public /* bridge */ /* synthetic */ boolean o00oOOoO(Double d, Double d2) {
        return o00oOoO0(d.doubleValue(), d2.doubleValue());
    }

    @Override // o0OOOo0o.o0O00o00
    @NotNull
    /* renamed from: o00oOo0O */
    public Double o00oOo00() {
        return Double.valueOf(this.f13706o00oo0O);
    }

    @Override // o0OOOo0o.o0O00o00, o0OOOo0o.o0O0OOO
    @NotNull
    /* renamed from: o00oOo0o */
    public Double o00oOOo0() {
        return Double.valueOf(this.f13707o00oo0O0);
    }

    public boolean o00oOoO0(double d, double d2) {
        return d <= d2;
    }

    public boolean o00oOooO(double d) {
        return d >= this.f13707o00oo0O0 && d <= this.f13706o00oo0O;
    }

    @NotNull
    public String toString() {
        return this.f13707o00oo0O0 + ".." + this.f13706o00oo0O;
    }
}
