package o0OOOo0o;

import o0OO0o.o0O000;
import o0OO0o.o0O0o;
import o0OO0o.o0OO00o0;
import o0OOOOO0.o0O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class o0O00O extends o0OoO00O implements o0O00o00<Character>, o0O0OOO<Character> {
    @NotNull

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final o00oOOo0 f13700o00oo0o = new o00oOOo0(null);
    @NotNull

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final o0O00O f13701o00oo0oO = new o0O00O(1, 0);

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        @NotNull
        public final o0O00O o00oOOo0() {
            return o0O00O.f13701o00oo0oO;
        }
    }

    public o0O00O(char c, char c2) {
        super(c, c2, 1);
    }

    @o0O000
    @o0O0o(message = "Can throw an exception when it's impossible to represent the value with Char type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @o0OO00o0(version = "1.7")
    public static /* synthetic */ void o00oo00O() {
    }

    @Override // o0OOOo0o.o0O00o00, o0OOOo0o.o0O0OOO
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return o00oOoo0(((Character) comparable).charValue());
    }

    @Override // o0OOOo0o.o0OoO00O
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o0O00O) {
            if (!isEmpty() || !((o0O00O) obj).isEmpty()) {
                o0O00O o0o00o = (o0O00O) obj;
                if (this.f13746o00oo0O0 != o0o00o.f13746o00oo0O0 || this.f13745o00oo0O != o0o00o.f13745o00oo0O) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // o0OOOo0o.o0OoO00O
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f13746o00oo0O0 * 31) + this.f13745o00oo0O;
    }

    @Override // o0OOOo0o.o0OoO00O, o0OOOo0o.o0O00o00, o0OOOo0o.o0O0OOO
    public boolean isEmpty() {
        return o0OOOOO0.o0ooO.o00oo0o(this.f13746o00oo0O0, this.f13745o00oo0O) > 0;
    }

    public boolean o00oOoo0(char c) {
        return o0OOOOO0.o0ooO.o00oo0o(this.f13746o00oo0O0, c) <= 0 && o0OOOOO0.o0ooO.o00oo0o(c, this.f13745o00oo0O) <= 0;
    }

    @Override // o0OOOo0o.o0O0OOO
    @NotNull
    /* renamed from: o00oOooo */
    public Character o00oOooO() {
        char c = this.f13745o00oo0O;
        if (c != 65535) {
            return Character.valueOf((char) (c + 1));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // o0OOOo0o.o0O00o00
    @NotNull
    /* renamed from: o00oo0 */
    public Character o00oOo00() {
        return Character.valueOf(this.f13745o00oo0O);
    }

    @Override // o0OOOo0o.o0O00o00, o0OOOo0o.o0O0OOO
    @NotNull
    /* renamed from: o00oo0OO */
    public Character o00oOOo0() {
        return Character.valueOf(this.f13746o00oo0O0);
    }

    @Override // o0OOOo0o.o0OoO00O
    @NotNull
    public String toString() {
        return this.f13746o00oo0O0 + ".." + this.f13745o00oo0O;
    }
}
