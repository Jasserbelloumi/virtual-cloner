package o0OOOOO0;

import java.lang.annotation.Annotation;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OO0o.o0OO00o0(version = "1.4")
/* loaded from: classes3.dex */
public final class o0OOOO0o implements o0OOOo.o0O0OOOo {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f13623o00oo = 4;
    @NotNull

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final o00oOOo0 f13624o00oo0o = new o00oOOo0(null);

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f13625o00oo0oO = 1;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f13626o0O0o = 2;
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final List<o0OOOo.oo0OOoo> f13627o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0OOOo.o0O00o00 f13628o00oo0O0;
    @Nullable

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o0OOOo.o0O0OOOo f13629o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final int f13630o00oo0o0;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f13631o00oOOo0;

        static {
            int[] iArr = new int[o0OOOo.o0O0o000.values().length];
            try {
                iArr[o0OOOo.o0O0o000.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o0OOOo.o0O0o000.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o0OOOo.o0O0o000.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13631o00oOOo0 = iArr;
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0O0OO implements o0OOOO.o00oo<o0OOOo.oo0OOoo, CharSequence> {
        public o00oOo00() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        @NotNull
        public final CharSequence invoke(@NotNull o0OOOo.oo0OOoo oo0oooo) {
            o0ooO.o00oo0O0(oo0oooo, "it");
            return o0OOOO0o.this.o00oOoO(oo0oooo);
        }
    }

    @o0OO0o.o0OO00o0(version = "1.6")
    public o0OOOO0o(@NotNull o0OOOo.o0O00o00 o0o00o00, @NotNull List<o0OOOo.oo0OOoo> list, @Nullable o0OOOo.o0O0OOOo o0o0oooo, int i) {
        o0ooO.o00oo0O0(o0o00o00, "classifier");
        o0ooO.o00oo0O0(list, "arguments");
        this.f13628o00oo0O0 = o0o00o00;
        this.f13627o00oo0O = list;
        this.f13629o00oo0Oo = o0o0oooo;
        this.f13630o00oo0o0 = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0OOOO0o(@NotNull o0OOOo.o0O00o00 o0o00o00, @NotNull List<o0OOOo.oo0OOoo> list, boolean z) {
        this(o0o00o00, list, null, z ? 1 : 0);
        o0ooO.o00oo0O0(o0o00o00, "classifier");
        o0ooO.o00oo0O0(list, "arguments");
    }

    @o0OO0o.o0OO00o0(version = "1.6")
    public static /* synthetic */ void o00ooO0o() {
    }

    @o0OO0o.o0OO00o0(version = "1.6")
    public static /* synthetic */ void o00ooOO0() {
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o0OOOO0o) {
            o0OOOO0o o0oooo0o = (o0OOOO0o) obj;
            if (o0ooO.o00oOoO0(this.f13628o00oo0O0, o0oooo0o.f13628o00oo0O0) && o0ooO.o00oOoO0(this.f13627o00oo0O, o0oooo0o.f13627o00oo0O) && o0ooO.o00oOoO0(this.f13629o00oo0Oo, o0oooo0o.f13629o00oo0Oo) && this.f13630o00oo0o0 == o0oooo0o.f13630o00oo0o0) {
                return true;
            }
        }
        return false;
    }

    @Override // o0OOOo.o0O00O0o
    @NotNull
    public List<Annotation> getAnnotations() {
        return o0OO0oO.o0ooO.INSTANCE;
    }

    @Override // o0OOOo.o0O0OOOo
    @NotNull
    public List<o0OOOo.oo0OOoo> getArguments() {
        return this.f13627o00oo0O;
    }

    public int hashCode() {
        int hashCode = this.f13627o00oo0O.hashCode();
        return Integer.hashCode(this.f13630o00oo0o0) + ((hashCode + (this.f13628o00oo0O0.hashCode() * 31)) * 31);
    }

    @Override // o0OOOo.o0O0OOOo
    public boolean o00oOo0O() {
        return (this.f13630o00oo0o0 & 1) != 0;
    }

    public final String o00oOoO(o0OOOo.oo0OOoo oo0oooo) {
        String valueOf;
        StringBuilder sb;
        String str;
        if (oo0oooo.f13690o00oOOo0 == null) {
            return "*";
        }
        o0OOOo.o0O0OOOo o0o0oooo = oo0oooo.f13691o00oOOoO;
        o0OOOO0o o0oooo0o = o0o0oooo instanceof o0OOOO0o ? (o0OOOO0o) o0o0oooo : null;
        if (o0oooo0o == null || (valueOf = o0oooo0o.o00oo0O0(true)) == null) {
            valueOf = String.valueOf(oo0oooo.f13691o00oOOoO);
        }
        int i = o00oOOoO.f13631o00oOOo0[oo0oooo.f13690o00oOOo0.ordinal()];
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
            return android.support.v4.media.o00oOOoO.o00oOOo0(sb, str, valueOf);
        }
        return valueOf;
    }

    @Override // o0OOOo.o0O0OOOo
    @NotNull
    public o0OOOo.o0O00o00 o00oo0() {
        return this.f13628o00oo0O0;
    }

    public final String o00oo0O0(boolean z) {
        String name;
        o0OOOo.o0O00o00 o0o00o00 = this.f13628o00oo0O0;
        o0OOOo.o0O00OO o0o00oo = o0o00o00 instanceof o0OOOo.o0O00OO ? (o0OOOo.o0O00OO) o0o00o00 : null;
        Class<?> o00oOo0O2 = o0o00oo != null ? o0OOOO0o.o00oOOo0.o00oOo0O(o0o00oo) : null;
        if (o00oOo0O2 == null) {
            name = this.f13628o00oo0O0.toString();
        } else if ((this.f13630o00oo0o0 & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (o00oOo0O2.isArray()) {
            name = o00oo0o(o00oOo0O2);
        } else if (z && o00oOo0O2.isPrimitive()) {
            o0OOOo.o0O00o00 o0o00o002 = this.f13628o00oo0O0;
            o0ooO.o00oo0(o0o00o002, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = o0OOOO0o.o00oOOo0.o00oOoO0((o0OOOo.o0O00OO) o0o00o002).getName();
        } else {
            name = o00oOo0O2.getName();
        }
        String o00oOOo02 = android.support.v4.media.o00oOoO.o00oOOo0(name, this.f13627o00oo0O.isEmpty() ? "" : o0OO0oO.o0O0oo0o.o0OOo0o0(this.f13627o00oo0O, ", ", "<", ">", 0, null, new o00oOo00(), 24, null), o00oOo0O() ? "?" : "");
        o0OOOo.o0O0OOOo o0o0oooo = this.f13629o00oo0Oo;
        if (o0o0oooo instanceof o0OOOO0o) {
            String o00oo0O02 = ((o0OOOO0o) o0o0oooo).o00oo0O0(true);
            if (o0ooO.o00oOoO0(o00oo0O02, o00oOOo02)) {
                return o00oOOo02;
            }
            if (o0ooO.o00oOoO0(o00oo0O02, o00oOOo02 + '?')) {
                return o00oOOo02 + '!';
            }
            return '(' + o00oOOo02 + ".." + o00oo0O02 + ')';
        }
        return o00oOOo02;
    }

    public final String o00oo0o(Class<?> cls) {
        return o0ooO.o00oOoO0(cls, boolean[].class) ? "kotlin.BooleanArray" : o0ooO.o00oOoO0(cls, char[].class) ? "kotlin.CharArray" : o0ooO.o00oOoO0(cls, byte[].class) ? "kotlin.ByteArray" : o0ooO.o00oOoO0(cls, short[].class) ? "kotlin.ShortArray" : o0ooO.o00oOoO0(cls, int[].class) ? "kotlin.IntArray" : o0ooO.o00oOoO0(cls, float[].class) ? "kotlin.FloatArray" : o0ooO.o00oOoO0(cls, long[].class) ? "kotlin.LongArray" : o0ooO.o00oOoO0(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    @Nullable
    public final o0OOOo.o0O0OOOo o00ooO() {
        return this.f13629o00oo0Oo;
    }

    public final int o00ooO0O() {
        return this.f13630o00oo0o0;
    }

    @NotNull
    public String toString() {
        return o00oo0O0(false) + o0OOooO0.f13633o00oOOoO;
    }
}
