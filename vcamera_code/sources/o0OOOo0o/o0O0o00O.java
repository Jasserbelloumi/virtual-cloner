package o0OOOo0o;

import o0OO0o.o0O000;
import o0OO0o.o0O0o;
import o0OO0o.o0OO00o0;
import o0OO0o.o0OOOO;
import o0OO0o.o0OoOoOo;
import o0OO0o.oO0Oo0oo;
import o0OOOOO0.o0O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@oO0Oo0oo(markerClass = {o0OoOoOo.class})
@o0OO00o0(version = "1.5")
/* loaded from: classes3.dex */
public final class o0O0o00O extends o0O0o000 implements o0O00o00<o0OOOO>, o0O0OOO<o0OOOO> {
    @NotNull

    /* renamed from: o00oo0o */
    public static final o00oOOo0 f13738o00oo0o = new o00oOOo0(null);
    @NotNull

    /* renamed from: o00oo0oO */
    public static final o0O0o00O f13739o00oo0oO = new o0O0o00O(-1, 0, null);

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        @NotNull
        public final o0O0o00O o00oOOo0() {
            return o0O0o00O.f13739o00oo0oO;
        }
    }

    public o0O0o00O(int i, int i2) {
        super(i, i2, 1);
    }

    public static final /* synthetic */ o0O0o00O o00oOoOO() {
        return f13739o00oo0oO;
    }

    @o0O000
    @o0O0o(message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @o0OO00o0(version = "1.7")
    public static /* synthetic */ void o00oOooo() {
    }

    @Override // o0OOOo0o.o0O00o00, o0OOOo0o.o0O0OOO
    public /* synthetic */ boolean contains(Comparable comparable) {
        return o00oOoOo(((o0OOOO) comparable).f13218o00oo0O0);
    }

    @Override // o0OOOo0o.o0O0o000
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o0O0o00O) {
            if (!isEmpty() || !((o0O0o00O) obj).isEmpty()) {
                o0O0o00O o0o0o00o = (o0O0o00O) obj;
                if (this.f13736o00oo0O0 != o0o0o00o.f13736o00oo0O0 || this.f13735o00oo0O != o0o0o00o.f13735o00oo0O) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // o0OOOo0o.o0O0o000
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f13736o00oo0O0 * 31) + this.f13735o00oo0O;
    }

    @Override // o0OOOo0o.o0O0o000, o0OOOo0o.o0O00o00, o0OOOo0o.o0O0OOO
    public boolean isEmpty() {
        return Integer.compareUnsigned(this.f13736o00oo0O0, this.f13735o00oo0O) > 0;
    }

    @Override // o0OOOo0o.o0O00o00, o0OOOo0o.o0O0OOO
    public Comparable o00oOOo0() {
        return o0OOOO.o00oOooO(this.f13736o00oo0O0);
    }

    @Override // o0OOOo0o.o0O00o00
    public o0OOOO o00oOo00() {
        return o0OOOO.o00oOooO(this.f13735o00oo0O);
    }

    public boolean o00oOoOo(int i) {
        return Integer.compareUnsigned(this.f13736o00oo0O0, i) <= 0 && Integer.compareUnsigned(i, this.f13735o00oo0O) <= 0;
    }

    public int o00oOoo0() {
        int i = this.f13735o00oo0O;
        if (i != -1) {
            return o0OOOO.o00oOooo(i + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // o0OOOo0o.o0O0OOO
    public /* bridge */ /* synthetic */ o0OOOO o00oOooO() {
        return o0OOOO.o00oOooO(o00oOoo0());
    }

    public int o00oo0() {
        return this.f13736o00oo0O0;
    }

    public int o00oo00O() {
        return this.f13735o00oo0O;
    }

    @Override // o0OOOo0o.o0O0o000
    @NotNull
    public String toString() {
        return ((Object) o0OOOO.o0O000oo(this.f13736o00oo0O0)) + ".." + ((Object) o0OOOO.o0O000oo(this.f13735o00oo0O));
    }

    public o0O0o00O(int i, int i2, o0O00 o0o00) {
        super(i, i2, 1);
    }
}
