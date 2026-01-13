package o0Oo0Oo0;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
/* loaded from: classes3.dex */
public final class o0oO0Ooo {

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final o0oO0Ooo f16112o00oo0;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final o0oO0Ooo f16113o00oo0OO;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final boolean f16114o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final boolean f16115o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final int f16116o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final boolean f16117o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final boolean f16118o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final int f16119o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final boolean f16120o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final int f16121o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public final boolean f16122o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public final boolean f16123o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final int f16124o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public final boolean f16125o00oOooo;
    @Nullable

    /* renamed from: o00oo00O  reason: collision with root package name */
    public String f16126o00oo00O;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f16127o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public boolean f16128o00oOOoO;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public boolean f16131o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public boolean f16132o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public boolean f16133o00oOoO0;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f16129o00oOo00 = -1;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f16134o00oOooO = -1;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f16130o00oOo0O = -1;

        public o0oO0Ooo o00oOOo0() {
            return new o0oO0Ooo(this);
        }

        public o00oOOo0 o00oOOoO() {
            this.f16132o00oOoO = true;
            return this;
        }

        public o00oOOo0 o00oOo00(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds(i);
                this.f16129o00oOo00 = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("maxAge < 0: ", i));
        }

        public o00oOOo0 o00oOo0O(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds(i);
                this.f16130o00oOo0O = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("minFresh < 0: ", i));
        }

        public o00oOOo0 o00oOo0o() {
            this.f16127o00oOOo0 = true;
            return this;
        }

        public o00oOOo0 o00oOoO() {
            this.f16133o00oOoO0 = true;
            return this;
        }

        public o00oOOo0 o00oOoO0() {
            this.f16128o00oOOoO = true;
            return this;
        }

        public o00oOOo0 o00oOoOO() {
            this.f16131o00oOo0o = true;
            return this;
        }

        public o00oOOo0 o00oOooO(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds(i);
                this.f16134o00oOooO = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("maxStale < 0: ", i));
        }
    }

    static {
        o00oOOo0 o00oooo02 = new o00oOOo0();
        o00oooo02.f16127o00oOOo0 = true;
        f16112o00oo0 = new o0oO0Ooo(o00oooo02);
        o00oOOo0 o00oooo03 = new o00oOOo0();
        o00oooo03.f16131o00oOo0o = true;
        o00oOOo0 o00oOooO2 = o00oooo03.o00oOooO(Integer.MAX_VALUE, TimeUnit.SECONDS);
        o00oOooO2.getClass();
        f16113o00oo0OO = new o0oO0Ooo(o00oOooO2);
    }

    public o0oO0Ooo(o00oOOo0 o00oooo02) {
        this.f16114o00oOOo0 = o00oooo02.f16127o00oOOo0;
        this.f16115o00oOOoO = o00oooo02.f16128o00oOOoO;
        this.f16116o00oOo00 = o00oooo02.f16129o00oOo00;
        this.f16124o00oOooO = -1;
        this.f16117o00oOo0O = false;
        this.f16118o00oOo0o = false;
        this.f16120o00oOoO0 = false;
        this.f16119o00oOoO = o00oooo02.f16134o00oOooO;
        this.f16121o00oOoOO = o00oooo02.f16130o00oOo0O;
        this.f16122o00oOoOo = o00oooo02.f16131o00oOo0o;
        this.f16123o00oOoo0 = o00oooo02.f16133o00oOoO0;
        this.f16125o00oOooo = o00oooo02.f16132o00oOoO;
    }

    public o0oO0Ooo(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, @Nullable String str) {
        this.f16114o00oOOo0 = z;
        this.f16115o00oOOoO = z2;
        this.f16116o00oOo00 = i;
        this.f16124o00oOooO = i2;
        this.f16117o00oOo0O = z3;
        this.f16118o00oOo0o = z4;
        this.f16120o00oOoO0 = z5;
        this.f16119o00oOoO = i3;
        this.f16121o00oOoOO = i4;
        this.f16122o00oOoOo = z6;
        this.f16123o00oOoo0 = z7;
        this.f16125o00oOooo = z8;
        this.f16126o00oo00O = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o0Oo0Oo0.o0oO0Ooo o00oo00O(o0Oo0Oo0.o0O0o00 r22) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0Oo0Oo0.o0oO0Ooo.o00oo00O(o0Oo0Oo0.o0O0o00):o0Oo0Oo0.o0oO0Ooo");
    }

    public final String o00oOOo0() {
        StringBuilder sb = new StringBuilder();
        if (this.f16114o00oOOo0) {
            sb.append("no-cache, ");
        }
        if (this.f16115o00oOOoO) {
            sb.append("no-store, ");
        }
        if (this.f16116o00oOo00 != -1) {
            sb.append("max-age=");
            sb.append(this.f16116o00oOo00);
            sb.append(", ");
        }
        if (this.f16124o00oOooO != -1) {
            sb.append("s-maxage=");
            sb.append(this.f16124o00oOooO);
            sb.append(", ");
        }
        if (this.f16117o00oOo0O) {
            sb.append("private, ");
        }
        if (this.f16118o00oOo0o) {
            sb.append("public, ");
        }
        if (this.f16120o00oOoO0) {
            sb.append("must-revalidate, ");
        }
        if (this.f16119o00oOoO != -1) {
            sb.append("max-stale=");
            sb.append(this.f16119o00oOoO);
            sb.append(", ");
        }
        if (this.f16121o00oOoOO != -1) {
            sb.append("min-fresh=");
            sb.append(this.f16121o00oOoOO);
            sb.append(", ");
        }
        if (this.f16122o00oOoOo) {
            sb.append("only-if-cached, ");
        }
        if (this.f16123o00oOoo0) {
            sb.append("no-transform, ");
        }
        if (this.f16125o00oOooo) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    public boolean o00oOOoO() {
        return this.f16125o00oOooo;
    }

    public boolean o00oOo00() {
        return this.f16117o00oOo0O;
    }

    public int o00oOo0O() {
        return this.f16116o00oOo00;
    }

    public int o00oOo0o() {
        return this.f16119o00oOoO;
    }

    public boolean o00oOoO() {
        return this.f16120o00oOoO0;
    }

    public int o00oOoO0() {
        return this.f16121o00oOoOO;
    }

    public boolean o00oOoOO() {
        return this.f16114o00oOOo0;
    }

    public boolean o00oOoOo() {
        return this.f16115o00oOOoO;
    }

    public boolean o00oOoo0() {
        return this.f16123o00oOoo0;
    }

    public boolean o00oOooO() {
        return this.f16118o00oOo0o;
    }

    public boolean o00oOooo() {
        return this.f16122o00oOoOo;
    }

    public int o00oo0() {
        return this.f16124o00oOooO;
    }

    public String toString() {
        String str = this.f16126o00oo00O;
        if (str != null) {
            return str;
        }
        String o00oOOo02 = o00oOOo0();
        this.f16126o00oo00O = o00oOOo02;
        return o00oOOo02;
    }
}
