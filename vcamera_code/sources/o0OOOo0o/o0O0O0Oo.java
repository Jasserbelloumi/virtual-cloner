package o0OOOo0o;

import o0OO0o.o0O000;
import o0OO0o.o0O0o;
import o0OO0o.o0OO00o0;
import o0OOOOO0.o0O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class o0O0O0Oo extends o0oO0O0o implements o0O00o00<Integer>, o0O0OOO<Integer> {
    @NotNull

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final o00oOOo0 f13714o00oo0o = new o00oOOo0(null);
    @NotNull

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final o0O0O0Oo f13715o00oo0oO = new o0O0O0Oo(1, 0);

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        @NotNull
        public final o0O0O0Oo o00oOOo0() {
            return o0O0O0Oo.f13715o00oo0oO;
        }
    }

    public o0O0O0Oo(int i, int i2) {
        super(i, i2, 1);
    }

    @o0O000
    @o0O0o(message = "Can throw an exception when it's impossible to represent the value with Int type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @o0OO00o0(version = "1.7")
    public static /* synthetic */ void o00oo00O() {
    }

    @Override // o0OOOo0o.o0O00o00, o0OOOo0o.o0O0OOO
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return o00oOoo0(((Number) comparable).intValue());
    }

    @Override // o0OOOo0o.o0oO0O0o
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o0O0O0Oo) {
            if (!isEmpty() || !((o0O0O0Oo) obj).isEmpty()) {
                o0O0O0Oo o0o0o0oo = (o0O0O0Oo) obj;
                if (this.f13750o00oo0O0 != o0o0o0oo.f13750o00oo0O0 || this.f13749o00oo0O != o0o0o0oo.f13749o00oo0O) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // o0OOOo0o.o0oO0O0o
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f13750o00oo0O0 * 31) + this.f13749o00oo0O;
    }

    @Override // o0OOOo0o.o0oO0O0o, o0OOOo0o.o0O00o00, o0OOOo0o.o0O0OOO
    public boolean isEmpty() {
        return this.f13750o00oo0O0 > this.f13749o00oo0O;
    }

    public boolean o00oOoo0(int i) {
        return this.f13750o00oo0O0 <= i && i <= this.f13749o00oo0O;
    }

    @Override // o0OOOo0o.o0O0OOO
    @NotNull
    /* renamed from: o00oOooo */
    public Integer o00oOooO() {
        int i = this.f13749o00oo0O;
        if (i != Integer.MAX_VALUE) {
            return Integer.valueOf(i + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // o0OOOo0o.o0O00o00
    @NotNull
    /* renamed from: o00oo0 */
    public Integer o00oOo00() {
        return Integer.valueOf(this.f13749o00oo0O);
    }

    @Override // o0OOOo0o.o0O00o00, o0OOOo0o.o0O0OOO
    @NotNull
    /* renamed from: o00oo0OO */
    public Integer o00oOOo0() {
        return Integer.valueOf(this.f13750o00oo0O0);
    }

    @Override // o0OOOo0o.o0oO0O0o
    @NotNull
    public String toString() {
        return this.f13750o00oo0O0 + ".." + this.f13749o00oo0O;
    }
}
