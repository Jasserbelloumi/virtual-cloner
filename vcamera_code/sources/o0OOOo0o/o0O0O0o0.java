package o0OOOo0o;

import o0OOO0OO.o00ooO;
import o0OOOOO0.o0O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public class o0O0O0o0 implements Iterable<Long>, o0OOOOO.o00oOOo0 {
    @NotNull

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final o00oOOo0 f13716o00oo0o0 = new o00oOOo0(null);

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final long f13717o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final long f13718o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final long f13719o00oo0Oo;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        @NotNull
        public final o0O0O0o0 o00oOOo0(long j, long j2, long j3) {
            return new o0O0O0o0(j, j2, j3);
        }
    }

    public o0O0O0o0(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f13718o00oo0O0 = j;
        this.f13717o00oo0O = o00ooO.o00oOooO(j, j2, j3);
        this.f13719o00oo0Oo = j3;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o0O0O0o0) {
            if (!isEmpty() || !((o0O0O0o0) obj).isEmpty()) {
                o0O0O0o0 o0o0o0o0 = (o0O0O0o0) obj;
                if (this.f13718o00oo0O0 != o0o0o0o0.f13718o00oo0O0 || this.f13717o00oo0O != o0o0o0o0.f13717o00oo0O || this.f13719o00oo0Oo != o0o0o0o0.f13719o00oo0Oo) {
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
        long j = 31;
        long j2 = this.f13718o00oo0O0;
        long j3 = this.f13717o00oo0O;
        long j4 = (((j2 ^ (j2 >>> 32)) * j) + (j3 ^ (j3 >>> 32))) * j;
        long j5 = this.f13719o00oo0Oo;
        return (int) (j4 + (j5 ^ (j5 >>> 32)));
    }

    public boolean isEmpty() {
        int i = (this.f13719o00oo0Oo > 0L ? 1 : (this.f13719o00oo0Oo == 0L ? 0 : -1));
        long j = this.f13718o00oo0O0;
        long j2 = this.f13717o00oo0O;
        if (i > 0) {
            if (j > j2) {
                return true;
            }
        } else if (j < j2) {
            return true;
        }
        return false;
    }

    public final long o00oOo0O() {
        return this.f13718o00oo0O0;
    }

    public final long o00oOoO() {
        return this.f13719o00oo0Oo;
    }

    public final long o00oOoO0() {
        return this.f13717o00oo0O;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* renamed from: o00oOoOO */
    public o0OO0oO.o0oOo0O0 iterator() {
        return new o0ooO(this.f13718o00oo0O0, this.f13717o00oo0O, this.f13719o00oo0Oo);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        long j;
        if (this.f13719o00oo0Oo > 0) {
            sb = new StringBuilder();
            sb.append(this.f13718o00oo0O0);
            sb.append("..");
            sb.append(this.f13717o00oo0O);
            sb.append(" step ");
            j = this.f13719o00oo0Oo;
        } else {
            sb = new StringBuilder();
            sb.append(this.f13718o00oo0O0);
            sb.append(" downTo ");
            sb.append(this.f13717o00oo0O);
            sb.append(" step ");
            j = -this.f13719o00oo0Oo;
        }
        sb.append(j);
        return sb.toString();
    }
}
