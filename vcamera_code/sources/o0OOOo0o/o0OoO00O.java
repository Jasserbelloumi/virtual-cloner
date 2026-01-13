package o0OOOo0o;

import o0OOO0OO.o00ooO;
import o0OOOOO0.o0O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public class o0OoO00O implements Iterable<Character>, o0OOOOO.o00oOOo0 {
    @NotNull

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final o00oOOo0 f13744o00oo0o0 = new o00oOOo0(null);

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final char f13745o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final char f13746o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final int f13747o00oo0Oo;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        @NotNull
        public final o0OoO00O o00oOOo0(char c, char c2, int i) {
            return new o0OoO00O(c, c2, i);
        }
    }

    public o0OoO00O(char c, char c2, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f13746o00oo0O0 = c;
        this.f13745o00oo0O = (char) o00ooO.o00oOo00(c, c2, i);
        this.f13747o00oo0Oo = i;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o0OoO00O) {
            if (!isEmpty() || !((o0OoO00O) obj).isEmpty()) {
                o0OoO00O o0ooo00o = (o0OoO00O) obj;
                if (this.f13746o00oo0O0 != o0ooo00o.f13746o00oo0O0 || this.f13745o00oo0O != o0ooo00o.f13745o00oo0O || this.f13747o00oo0Oo != o0ooo00o.f13747o00oo0Oo) {
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
        return (((this.f13746o00oo0O0 * 31) + this.f13745o00oo0O) * 31) + this.f13747o00oo0Oo;
    }

    public boolean isEmpty() {
        if (this.f13747o00oo0Oo > 0) {
            if (o0OOOOO0.o0ooO.o00oo0o(this.f13746o00oo0O0, this.f13745o00oo0O) > 0) {
                return true;
            }
        } else if (o0OOOOO0.o0ooO.o00oo0o(this.f13746o00oo0O0, this.f13745o00oo0O) < 0) {
            return true;
        }
        return false;
    }

    public final char o00oOo0O() {
        return this.f13746o00oo0O0;
    }

    public final int o00oOoO() {
        return this.f13747o00oo0Oo;
    }

    public final char o00oOoO0() {
        return this.f13745o00oo0O;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* renamed from: o00oOoOO */
    public o0OO0oO.o0O00 iterator() {
        return new o0O00O0o(this.f13746o00oo0O0, this.f13745o00oo0O, this.f13747o00oo0Oo);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f13747o00oo0Oo > 0) {
            sb = new StringBuilder();
            sb.append(this.f13746o00oo0O0);
            sb.append("..");
            sb.append(this.f13745o00oo0O);
            sb.append(" step ");
            i = this.f13747o00oo0Oo;
        } else {
            sb = new StringBuilder();
            sb.append(this.f13746o00oo0O0);
            sb.append(" downTo ");
            sb.append(this.f13745o00oo0O);
            sb.append(" step ");
            i = -this.f13747o00oo0Oo;
        }
        sb.append(i);
        return sb.toString();
    }
}
