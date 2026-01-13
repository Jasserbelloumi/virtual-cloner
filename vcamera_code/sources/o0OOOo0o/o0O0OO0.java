package o0OOOo0o;

import o0OO0o.o0O000;
import o0OO0o.o0O0o;
import o0OO0o.o0OO00o0;
import o0OOOOO0.o0O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class o0O0OO0 extends o0O0O0o0 implements o0O00o00<Long>, o0O0OOO<Long> {
    @NotNull

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final o00oOOo0 f13722o00oo0o = new o00oOOo0(null);
    @NotNull

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final o0O0OO0 f13723o00oo0oO = new o0O0OO0(1, 0);

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        @NotNull
        public final o0O0OO0 o00oOOo0() {
            return o0O0OO0.f13723o00oo0oO;
        }
    }

    public o0O0OO0(long j, long j2) {
        super(j, j2, 1L);
    }

    @o0O000
    @o0O0o(message = "Can throw an exception when it's impossible to represent the value with Long type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @o0OO00o0(version = "1.7")
    public static /* synthetic */ void o00oo00O() {
    }

    @Override // o0OOOo0o.o0O00o00, o0OOOo0o.o0O0OOO
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return o00oOoo0(((Number) comparable).longValue());
    }

    @Override // o0OOOo0o.o0O0O0o0
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o0O0OO0) {
            if (!isEmpty() || !((o0O0OO0) obj).isEmpty()) {
                o0O0OO0 o0o0oo0 = (o0O0OO0) obj;
                if (this.f13718o00oo0O0 != o0o0oo0.f13718o00oo0O0 || this.f13717o00oo0O != o0o0oo0.f13717o00oo0O) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // o0OOOo0o.o0O0O0o0
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.f13718o00oo0O0;
        long j2 = 31 * (j ^ (j >>> 32));
        long j3 = this.f13717o00oo0O;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    @Override // o0OOOo0o.o0O0O0o0, o0OOOo0o.o0O00o00, o0OOOo0o.o0O0OOO
    public boolean isEmpty() {
        return this.f13718o00oo0O0 > this.f13717o00oo0O;
    }

    public boolean o00oOoo0(long j) {
        return this.f13718o00oo0O0 <= j && j <= this.f13717o00oo0O;
    }

    @Override // o0OOOo0o.o0O0OOO
    @NotNull
    /* renamed from: o00oOooo */
    public Long o00oOooO() {
        long j = this.f13717o00oo0O;
        if (j != Long.MAX_VALUE) {
            return Long.valueOf(j + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // o0OOOo0o.o0O00o00
    @NotNull
    /* renamed from: o00oo0 */
    public Long o00oOo00() {
        return Long.valueOf(this.f13717o00oo0O);
    }

    @Override // o0OOOo0o.o0O00o00, o0OOOo0o.o0O0OOO
    @NotNull
    /* renamed from: o00oo0OO */
    public Long o00oOOo0() {
        return Long.valueOf(this.f13718o00oo0O0);
    }

    @Override // o0OOOo0o.o0O0O0o0
    @NotNull
    public String toString() {
        return this.f13718o00oo0O0 + ".." + this.f13717o00oo0O;
    }
}
