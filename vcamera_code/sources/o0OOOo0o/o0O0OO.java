package o0OOOo0o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class o0O0OO implements o0O0OOO<Double> {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final double f13720o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final double f13721o00oo0O0;

    public o0O0OO(double d, double d2) {
        this.f13721o00oo0O0 = d;
        this.f13720o00oo0O = d2;
    }

    @Override // o0OOOo0o.o0O0OOO
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return o00oOOoO(((Number) comparable).doubleValue());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o0O0OO) {
            if (isEmpty() && ((o0O0OO) obj).isEmpty()) {
                return true;
            }
            o0O0OO o0o0oo = (o0O0OO) obj;
            if (this.f13721o00oo0O0 == o0o0oo.f13721o00oo0O0) {
                if (this.f13720o00oo0O == o0o0oo.f13720o00oo0O) {
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
        return (Double.hashCode(this.f13721o00oo0O0) * 31) + Double.hashCode(this.f13720o00oo0O);
    }

    @Override // o0OOOo0o.o0O0OOO
    public boolean isEmpty() {
        return this.f13721o00oo0O0 >= this.f13720o00oo0O;
    }

    public boolean o00oOOoO(double d) {
        return d >= this.f13721o00oo0O0 && d < this.f13720o00oo0O;
    }

    @Override // o0OOOo0o.o0O0OOO
    @NotNull
    /* renamed from: o00oOo00 */
    public Double o00oOooO() {
        return Double.valueOf(this.f13720o00oo0O);
    }

    @Override // o0OOOo0o.o0O0OOO
    @NotNull
    /* renamed from: o00oOo0O */
    public Double o00oOOo0() {
        return Double.valueOf(this.f13721o00oo0O0);
    }

    public final boolean o00oOo0o(double d, double d2) {
        return d <= d2;
    }

    @NotNull
    public String toString() {
        return this.f13721o00oo0O0 + "..<" + this.f13720o00oo0O;
    }
}
