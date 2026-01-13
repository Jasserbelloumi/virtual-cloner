package o0OOOo;

import o0OO0o.o0OO00o0;
import o0OOOO0o.o00oOoO;
import o0OOOO0o.o00ooO0;
import o0OOOOO0.o0O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OO00o0(version = "1.1")
/* loaded from: classes3.dex */
public final class oo0OOoo {
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final o00oOOo0 f13688o00oOo00 = new o00oOOo0(null);
    @o00oOoO
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final oo0OOoo f13689o00oOooO = new oo0OOoo(null, null);
    @Nullable

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O0o000 f13690o00oOOo0;
    @Nullable

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O0OOOo f13691o00oOOoO;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        @o0OO0o.o0O
        public static /* synthetic */ void o00oOooO() {
        }

        @o00ooO0
        @NotNull
        public final oo0OOoo o00oOOo0(@NotNull o0O0OOOo o0o0oooo) {
            o0OOOOO0.o0ooO.o00oo0O0(o0o0oooo, "type");
            return new oo0OOoo(o0O0o000.IN, o0o0oooo);
        }

        @o00ooO0
        @NotNull
        public final oo0OOoo o00oOOoO(@NotNull o0O0OOOo o0o0oooo) {
            o0OOOOO0.o0ooO.o00oo0O0(o0o0oooo, "type");
            return new oo0OOoo(o0O0o000.OUT, o0o0oooo);
        }

        @NotNull
        public final oo0OOoo o00oOo00() {
            return oo0OOoo.f13689o00oOooO;
        }

        @o00ooO0
        @NotNull
        public final oo0OOoo o00oOo0O(@NotNull o0O0OOOo o0o0oooo) {
            o0OOOOO0.o0ooO.o00oo0O0(o0o0oooo, "type");
            return new oo0OOoo(o0O0o000.INVARIANT, o0o0oooo);
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f13692o00oOOo0;

        static {
            int[] iArr = new int[o0O0o000.values().length];
            try {
                iArr[o0O0o000.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o0O0o000.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o0O0o000.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13692o00oOOo0 = iArr;
        }
    }

    public oo0OOoo(@Nullable o0O0o000 o0o0o000, @Nullable o0O0OOOo o0o0oooo) {
        String str;
        this.f13690o00oOOo0 = o0o0o000;
        this.f13691o00oOOoO = o0o0oooo;
        if ((o0o0o000 == null) == (o0o0oooo == null)) {
            return;
        }
        if (o0o0o000 == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + o0o0o000 + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    @o00ooO0
    @NotNull
    public static final oo0OOoo o00oOo00(@NotNull o0O0OOOo o0o0oooo) {
        return f13688o00oOo00.o00oOOo0(o0o0oooo);
    }

    public static oo0OOoo o00oOo0O(oo0OOoo oo0oooo, o0O0o000 o0o0o000, o0O0OOOo o0o0oooo, int i, Object obj) {
        if ((i & 1) != 0) {
            o0o0o000 = oo0oooo.f13690o00oOOo0;
        }
        if ((i & 2) != 0) {
            o0o0oooo = oo0oooo.f13691o00oOOoO;
        }
        oo0oooo.getClass();
        return new oo0OOoo(o0o0o000, o0o0oooo);
    }

    @o00ooO0
    @NotNull
    public static final oo0OOoo o00oOo0o(@NotNull o0O0OOOo o0o0oooo) {
        return f13688o00oOo00.o00oOOoO(o0o0oooo);
    }

    @o00ooO0
    @NotNull
    public static final oo0OOoo o00oOoOO(@NotNull o0O0OOOo o0o0oooo) {
        return f13688o00oOo00.o00oOo0O(o0o0oooo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oo0OOoo) {
            oo0OOoo oo0oooo = (oo0OOoo) obj;
            return this.f13690o00oOOo0 == oo0oooo.f13690o00oOOo0 && o0OOOOO0.o0ooO.o00oOoO0(this.f13691o00oOOoO, oo0oooo.f13691o00oOOoO);
        }
        return false;
    }

    public int hashCode() {
        o0O0o000 o0o0o000 = this.f13690o00oOOo0;
        int hashCode = (o0o0o000 == null ? 0 : o0o0o000.hashCode()) * 31;
        o0O0OOOo o0o0oooo = this.f13691o00oOOoO;
        return hashCode + (o0o0oooo != null ? o0o0oooo.hashCode() : 0);
    }

    @Nullable
    public final o0O0o000 o00oOOo0() {
        return this.f13690o00oOOo0;
    }

    @Nullable
    public final o0O0OOOo o00oOOoO() {
        return this.f13691o00oOOoO;
    }

    @Nullable
    public final o0O0o000 o00oOoO() {
        return this.f13690o00oOOo0;
    }

    @Nullable
    public final o0O0OOOo o00oOoO0() {
        return this.f13691o00oOOoO;
    }

    @NotNull
    public final oo0OOoo o00oOooO(@Nullable o0O0o000 o0o0o000, @Nullable o0O0OOOo o0o0oooo) {
        return new oo0OOoo(o0o0o000, o0o0oooo);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        String str;
        o0O0o000 o0o0o000 = this.f13690o00oOOo0;
        int i = o0o0o000 == null ? -1 : o00oOOoO.f13692o00oOOo0[o0o0o000.ordinal()];
        if (i != -1) {
            if (i != 1) {
                if (i == 2) {
                    sb = new StringBuilder();
                    str = "in ";
                } else if (i != 3) {
                    throw new o0OO0o.o0O0O0Oo();
                } else {
                    sb = new StringBuilder();
                    str = "out ";
                }
                sb.append(str);
                sb.append(this.f13691o00oOOoO);
                return sb.toString();
            }
            return String.valueOf(this.f13691o00oOOoO);
        }
        return "*";
    }
}
