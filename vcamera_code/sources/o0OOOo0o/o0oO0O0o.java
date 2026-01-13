package o0OOOo0o;

import o0OOO0OO.o00ooO;
import o0OOOOO0.o0O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public class o0oO0O0o implements Iterable<Integer>, o0OOOOO.o00oOOo0 {
    @NotNull

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final o00oOOo0 f13748o00oo0o0 = new o00oOOo0(null);

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final int f13749o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final int f13750o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final int f13751o00oo0Oo;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        @NotNull
        public final o0oO0O0o o00oOOo0(int i, int i2, int i3) {
            return new o0oO0O0o(i, i2, i3);
        }
    }

    public o0oO0O0o(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f13750o00oo0O0 = i;
        this.f13749o00oo0O = o00ooO.o00oOo00(i, i2, i3);
        this.f13751o00oo0Oo = i3;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o0oO0O0o) {
            if (!isEmpty() || !((o0oO0O0o) obj).isEmpty()) {
                o0oO0O0o o0oo0o0o = (o0oO0O0o) obj;
                if (this.f13750o00oo0O0 != o0oo0o0o.f13750o00oo0O0 || this.f13749o00oo0O != o0oo0o0o.f13749o00oo0O || this.f13751o00oo0Oo != o0oo0o0o.f13751o00oo0Oo) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f13750o00oo0O0 * 31) + this.f13749o00oo0O) * 31) + this.f13751o00oo0Oo;
    }

    public boolean isEmpty() {
        if (this.f13751o00oo0Oo > 0) {
            if (this.f13750o00oo0O0 > this.f13749o00oo0O) {
                return true;
            }
        } else if (this.f13750o00oo0O0 < this.f13749o00oo0O) {
            return true;
        }
        return false;
    }

    public final int o00oOo0O() {
        return this.f13750o00oo0O0;
    }

    public final int o00oOoO() {
        return this.f13751o00oo0Oo;
    }

    public final int o00oOoO0() {
        return this.f13749o00oo0O;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* renamed from: o00oOoOO */
    public o0OO0oO.o0O0o0 iterator() {
        return new o0O0oo0o(this.f13750o00oo0O0, this.f13749o00oo0O, this.f13751o00oo0Oo);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f13751o00oo0Oo > 0) {
            sb = new StringBuilder();
            sb.append(this.f13750o00oo0O0);
            sb.append("..");
            sb.append(this.f13749o00oo0O);
            sb.append(" step ");
            i = this.f13751o00oo0Oo;
        } else {
            sb = new StringBuilder();
            sb.append(this.f13750o00oo0O0);
            sb.append(" downTo ");
            sb.append(this.f13749o00oo0O);
            sb.append(" step ");
            i = -this.f13751o00oo0Oo;
        }
        sb.append(i);
        return sb.toString();
    }
}
