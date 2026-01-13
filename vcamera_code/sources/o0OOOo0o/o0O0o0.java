package o0OOOo0o;

import java.util.Iterator;
import o0OO0o.o0OO00o0;
import o0OO0o.o0OoOoOo;
import o0OO0o.o0oo0000;
import o0OO0o.oO0Oo0oo;
import o0OO0o.oO0OoOO0;
import o0OOO0OO.o0O000;
import o0OOOOO0.o0O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@oO0Oo0oo(markerClass = {o0OoOoOo.class})
@o0OO00o0(version = "1.5")
/* loaded from: classes3.dex */
public class o0O0o0 implements Iterable<o0oo0000>, o0OOOOO.o00oOOo0 {
    @NotNull

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final o00oOOo0 f13726o00oo0o0 = new o00oOOo0(null);

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final long f13727o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final long f13728o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final long f13729o00oo0Oo;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        @NotNull
        public final o0O0o0 o00oOOo0(long j, long j2, long j3) {
            return new o0O0o0(j, j2, j3);
        }
    }

    public o0O0o0(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f13728o00oo0O0 = j;
        this.f13727o00oo0O = o0O000.o00oOo00(j, j2, j3);
        this.f13729o00oo0Oo = j3;
    }

    public /* synthetic */ o0O0o0(long j, long j2, long j3, o0O00 o0o00) {
        this(j, j2, j3);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o0O0o0) {
            if (!isEmpty() || !((o0O0o0) obj).isEmpty()) {
                o0O0o0 o0o0o0 = (o0O0o0) obj;
                if (this.f13728o00oo0O0 != o0o0o0.f13728o00oo0O0 || this.f13727o00oo0O != o0o0o0.f13727o00oo0O || this.f13729o00oo0Oo != o0o0o0.f13729o00oo0Oo) {
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
        long j = this.f13728o00oo0O0;
        long j2 = this.f13727o00oo0O;
        long j3 = this.f13729o00oo0Oo;
        return (((((int) (j ^ o0oo0000.o00oOooo(j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3));
    }

    public boolean isEmpty() {
        int i = (this.f13729o00oo0Oo > 0L ? 1 : (this.f13729o00oo0Oo == 0L ? 0 : -1));
        long j = this.f13728o00oo0O0;
        long j2 = this.f13727o00oo0O;
        if (i > 0) {
            if (Long.compareUnsigned(j, j2) > 0) {
                return true;
            }
        } else if (Long.compareUnsigned(j, j2) < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<o0oo0000> iterator() {
        return new o0oOo0O0(this.f13728o00oo0O0, this.f13727o00oo0O, this.f13729o00oo0Oo);
    }

    public final long o00oOo0O() {
        return this.f13728o00oo0O0;
    }

    public final long o00oOoO() {
        return this.f13729o00oo0Oo;
    }

    public final long o00oOoO0() {
        return this.f13727o00oo0O;
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        long j;
        if (this.f13729o00oo0Oo > 0) {
            sb = new StringBuilder();
            sb.append((Object) o0oo0000.o0O000oo(this.f13728o00oo0O0));
            sb.append("..");
            sb.append((Object) oO0OoOO0.o00oOoo0(this.f13727o00oo0O));
            sb.append(" step ");
            j = this.f13729o00oo0Oo;
        } else {
            sb = new StringBuilder();
            sb.append((Object) o0oo0000.o0O000oo(this.f13728o00oo0O0));
            sb.append(" downTo ");
            sb.append((Object) oO0OoOO0.o00oOoo0(this.f13727o00oo0O));
            sb.append(" step ");
            j = -this.f13729o00oo0Oo;
        }
        sb.append(j);
        return sb.toString();
    }
}
