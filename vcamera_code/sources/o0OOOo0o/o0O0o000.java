package o0OOOo0o;

import java.util.Iterator;
import o0OO0o.o0OO00o0;
import o0OO0o.o0OOOO;
import o0OO0o.o0OoOoOo;
import o0OO0o.oO0Oo0oo;
import o0OOO0OO.o0O000;
import o0OOOOO0.o0O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@oO0Oo0oo(markerClass = {o0OoOoOo.class})
@o0OO00o0(version = "1.5")
/* loaded from: classes3.dex */
public class o0O0o000 implements Iterable<o0OOOO>, o0OOOOO.o00oOOo0 {
    @NotNull

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final o00oOOo0 f13734o00oo0o0 = new o00oOOo0(null);

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final int f13735o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final int f13736o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final int f13737o00oo0Oo;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        @NotNull
        public final o0O0o000 o00oOOo0(int i, int i2, int i3) {
            return new o0O0o000(i, i2, i3);
        }
    }

    public o0O0o000(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f13736o00oo0O0 = i;
        this.f13735o00oo0O = o0O000.o00oOooO(i, i2, i3);
        this.f13737o00oo0Oo = i3;
    }

    public /* synthetic */ o0O0o000(int i, int i2, int i3, o0O00 o0o00) {
        this(i, i2, i3);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o0O0o000) {
            if (!isEmpty() || !((o0O0o000) obj).isEmpty()) {
                o0O0o000 o0o0o000 = (o0O0o000) obj;
                if (this.f13736o00oo0O0 != o0o0o000.f13736o00oo0O0 || this.f13735o00oo0O != o0o0o000.f13735o00oo0O || this.f13737o00oo0Oo != o0o0o000.f13737o00oo0Oo) {
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
        return (((this.f13736o00oo0O0 * 31) + this.f13735o00oo0O) * 31) + this.f13737o00oo0Oo;
    }

    public boolean isEmpty() {
        if (this.f13737o00oo0Oo > 0) {
            if (Integer.compareUnsigned(this.f13736o00oo0O0, this.f13735o00oo0O) > 0) {
                return true;
            }
        } else if (Integer.compareUnsigned(this.f13736o00oo0O0, this.f13735o00oo0O) < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<o0OOOO> iterator() {
        return new o0O0o00(this.f13736o00oo0O0, this.f13735o00oo0O, this.f13737o00oo0Oo);
    }

    public final int o00oOo0O() {
        return this.f13736o00oo0O0;
    }

    public final int o00oOoO() {
        return this.f13737o00oo0Oo;
    }

    public final int o00oOoO0() {
        return this.f13735o00oo0O;
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f13737o00oo0Oo > 0) {
            sb = new StringBuilder();
            sb.append((Object) o0OOOO.o0O000oo(this.f13736o00oo0O0));
            sb.append("..");
            sb.append((Object) o0OOOO.o0O000oo(this.f13735o00oo0O));
            sb.append(" step ");
            i = this.f13737o00oo0Oo;
        } else {
            sb = new StringBuilder();
            sb.append((Object) o0OOOO.o0O000oo(this.f13736o00oo0O0));
            sb.append(" downTo ");
            sb.append((Object) o0OOOO.o0O000oo(this.f13735o00oo0O));
            sb.append(" step ");
            i = -this.f13737o00oo0Oo;
        }
        sb.append(i);
        return sb.toString();
    }
}
