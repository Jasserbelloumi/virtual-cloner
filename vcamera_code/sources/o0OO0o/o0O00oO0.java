package o0OO0o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public class o0O00oO0 {

    /* loaded from: classes.dex */
    public /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f13203o00oOOo0;

        static {
            int[] iArr = new int[o0oO0O0o.values().length];
            try {
                iArr[o0oO0O0o.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o0oO0O0o.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o0oO0O0o.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13203o00oOOo0 = iArr;
        }
    }

    @NotNull
    public static final <T> o0oO0Ooo<T> o00oOOo0(@Nullable Object obj, @NotNull o0OOOO.o00oOOo0<? extends T> o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "initializer");
        return new o0OO0o(o00oooo02, obj);
    }

    @NotNull
    public static final <T> o0oO0Ooo<T> o00oOOoO(@NotNull o0oO0O0o o0oo0o0o, @NotNull o0OOOO.o00oOOo0<? extends T> o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o0oo0o0o, "mode");
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "initializer");
        int i = o00oOOo0.f13203o00oOOo0[o0oo0o0o.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new oO0o0o(o00oooo02);
                }
                throw new o0O0O0Oo();
            }
            return new o0OO00OO(o00oooo02);
        }
        return new o0OO0o(o00oooo02, null, 2, null);
    }

    @NotNull
    public static final <T> o0oO0Ooo<T> o00oOo00(@NotNull o0OOOO.o00oOOo0<? extends T> o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "initializer");
        return new o0OO0o(o00oooo02, null, 2, null);
    }
}
