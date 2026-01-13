package o0OOOo0o;

import com.google.common.primitives.UnsignedInts;
import o0OO0o.o0O000;
import o0OO0o.o0O0o;
import o0OO0o.o0OO00o0;
import o0OO0o.o0OoOoOo;
import o0OO0o.o0oo0000;
import o0OO0o.oO0Oo0oo;
import o0OO0o.oO0OoOO0;
import o0OOOOO0.o0O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@oO0Oo0oo(markerClass = {o0OoOoOo.class})
@o0OO00o0(version = "1.5")
/* loaded from: classes3.dex */
public final class oooOO0 extends o0O0o0 implements o0O00o00<o0oo0000>, o0O0OOO<o0oo0000> {
    @NotNull

    /* renamed from: o00oo0o */
    public static final o00oOOo0 f13760o00oo0o = new o00oOOo0(null);
    @NotNull

    /* renamed from: o00oo0oO */
    public static final oooOO0 f13761o00oo0oO = new oooOO0(-1, 0);

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        @NotNull
        public final oooOO0 o00oOOo0() {
            return oooOO0.f13761o00oo0oO;
        }
    }

    public oooOO0(long j, long j2) {
        super(j, j2, 1L);
    }

    public /* synthetic */ oooOO0(long j, long j2, o0O00 o0o00) {
        this(j, j2);
    }

    @o0O000
    @o0O0o(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @o0OO00o0(version = "1.7")
    public static /* synthetic */ void o00oOooo() {
    }

    @Override // o0OOOo0o.o0O00o00, o0OOOo0o.o0O0OOO
    public /* synthetic */ boolean contains(Comparable comparable) {
        return o00oOoOo(((o0oo0000) comparable).f13227o00oo0O0);
    }

    @Override // o0OOOo0o.o0O0o0
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof oooOO0) {
            if (!isEmpty() || !((oooOO0) obj).isEmpty()) {
                oooOO0 ooooo0 = (oooOO0) obj;
                if (this.f13728o00oo0O0 != ooooo0.f13728o00oo0O0 || this.f13727o00oo0O != ooooo0.f13727o00oo0O) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // o0OOOo0o.o0O0o0
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.f13728o00oo0O0;
        long j2 = this.f13727o00oo0O;
        return (((int) (j ^ o0oo0000.o00oOooo(j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2));
    }

    @Override // o0OOOo0o.o0O0o0, o0OOOo0o.o0O00o00, o0OOOo0o.o0O0OOO
    public boolean isEmpty() {
        return Long.compareUnsigned(this.f13728o00oo0O0, this.f13727o00oo0O) > 0;
    }

    @Override // o0OOOo0o.o0O00o00, o0OOOo0o.o0O0OOO
    public Comparable o00oOOo0() {
        return o0oo0000.o00oOooO(this.f13728o00oo0O0);
    }

    @Override // o0OOOo0o.o0O00o00
    public o0oo0000 o00oOo00() {
        return o0oo0000.o00oOooO(this.f13727o00oo0O);
    }

    public boolean o00oOoOo(long j) {
        return Long.compareUnsigned(this.f13728o00oo0O0, j) <= 0 && Long.compareUnsigned(j, this.f13727o00oo0O) <= 0;
    }

    public long o00oOoo0() {
        long j = this.f13727o00oo0O;
        if (j != -1) {
            return o0oo0000.o00oOooo(1 & UnsignedInts.INT_MASK) + j;
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // o0OOOo0o.o0O0OOO
    public /* bridge */ /* synthetic */ o0oo0000 o00oOooO() {
        return o0oo0000.o00oOooO(o00oOoo0());
    }

    public long o00oo0() {
        return this.f13728o00oo0O0;
    }

    public long o00oo00O() {
        return this.f13727o00oo0O;
    }

    @Override // o0OOOo0o.o0O0o0
    @NotNull
    public String toString() {
        return ((Object) o0oo0000.o0O000oo(this.f13728o00oo0O0)) + ".." + ((Object) oO0OoOO0.o00oOoo0(this.f13727o00oo0O));
    }
}
