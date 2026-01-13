package o0OoOoOO;

import java.nio.CharBuffer;
import java.util.Locale;
/* loaded from: classes.dex */
public final class o0OO0oO0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0OO0o f16862o00oOOo0 = new o00oOoO(null, false);

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final o0OO0o f16863o00oOOoO = new o00oOoO(null, true);

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final o0OO0o f16864o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final o0OO0o f16865o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final o0OO0o f16866o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f16867o00oOoO = 1;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f16868o00oOoO0 = 0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f16869o00oOoOO = 2;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final o0OO0o f16870o00oOooO;

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements o00oOo00 {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final o00oOOo0 f16871o00oOOoO = new o00oOOo0(true);

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final boolean f16872o00oOOo0;

        public o00oOOo0(boolean z) {
            this.f16872o00oOOo0 = z;
        }

        @Override // o0OoOoOO.o0OO0oO0.o00oOo00
        public int o00oOOo0(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int o00oOOo02 = o0OO0oO0.o00oOOo0(Character.getDirectionality(charSequence.charAt(i)));
                if (o00oOOo02 != 0) {
                    if (o00oOOo02 != 1) {
                        continue;
                        i++;
                        z = z;
                    } else if (!this.f16872o00oOOo0) {
                        return 1;
                    }
                } else if (this.f16872o00oOOo0) {
                    return 0;
                }
                z = true;
                i++;
                z = z;
            }
            if (z) {
                return this.f16872o00oOOo0 ? 1 : 0;
            }
            return 2;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO implements o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final o00oOOoO f16873o00oOOo0 = new o00oOOoO();

        @Override // o0OoOoOO.o0OO0oO0.o00oOo00
        public int o00oOOo0(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = o0OO0oO0.o00oOOoO(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOo00 {
        int o00oOOo0(CharSequence charSequence, int i, int i2);
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOo0O implements o0OO0o {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oOo00 f16874o00oOOo0;

        public o00oOo0O(o00oOo00 o00ooo002) {
            this.f16874o00oOOo0 = o00ooo002;
        }

        @Override // o0OoOoOO.o0OO0o
        public boolean isRtl(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            return this.f16874o00oOOo0 == null ? o00oOOo0() : o00oOOoO(charSequence, i, i2);
        }

        @Override // o0OoOoOO.o0OO0o
        public boolean isRtl(char[] cArr, int i, int i2) {
            return isRtl(CharBuffer.wrap(cArr), i, i2);
        }

        public abstract boolean o00oOOo0();

        public final boolean o00oOOoO(CharSequence charSequence, int i, int i2) {
            int o00oOOo02 = this.f16874o00oOOo0.o00oOOo0(charSequence, i, i2);
            if (o00oOOo02 != 0) {
                if (o00oOOo02 != 1) {
                    return o00oOOo0();
                }
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO extends o00oOo0O {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final boolean f16875o00oOOoO;

        public o00oOoO(o00oOo00 o00ooo002, boolean z) {
            super(o00ooo002);
            this.f16875o00oOOoO = z;
        }

        @Override // o0OoOoOO.o0OO0oO0.o00oOo0O
        public boolean o00oOOo0() {
            return this.f16875o00oOOoO;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo00O extends o00oOo0O {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final o00oo00O f16876o00oOOoO = new o00oo00O();

        public o00oo00O() {
            super(null);
        }

        @Override // o0OoOoOO.o0OO0oO0.o00oOo0O
        public boolean o00oOOo0() {
            return o0OO0oO.o00oOOoO(Locale.getDefault()) == 1;
        }
    }

    static {
        o00oOOoO o00ooooo2 = o00oOOoO.f16873o00oOOo0;
        f16864o00oOo00 = new o00oOoO(o00ooooo2, false);
        f16870o00oOooO = new o00oOoO(o00ooooo2, true);
        f16865o00oOo0O = new o00oOoO(o00oOOo0.f16871o00oOOoO, false);
        f16866o00oOo0o = o00oo00O.f16876o00oOOoO;
    }

    public static int o00oOOo0(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int o00oOOoO(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
