package o0OOOOO0;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\nTypeParameterReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterReference.kt\nkotlin/jvm/internal/TypeParameterReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
@o0OO0o.o0OO00o0(version = "1.4")
/* loaded from: classes3.dex */
public final class o0OOOO00 implements o0OOOo.o0OooO0 {
    @NotNull

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final o00oOOo0 f13616o00oo0oO = new o00oOOo0(null);
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final String f13617o00oo0O;
    @Nullable

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Object f13618o00oo0O0;
    @NotNull

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o0OOOo.o0O0o000 f13619o00oo0Oo;
    @Nullable

    /* renamed from: o00oo0o  reason: collision with root package name */
    public volatile List<? extends o0OOOo.o0O0OOOo> f13620o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final boolean f13621o00oo0o0;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {

        /* renamed from: o0OOOOO0.o0OOOO00$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C0171o00oOOo0 {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public static final /* synthetic */ int[] f13622o00oOOo0;

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
                f13622o00oOOo0 = iArr;
            }
        }

        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        @NotNull
        public final String o00oOOo0(@NotNull o0OOOo.o0OooO0 o0oooo0) {
            String str;
            o0ooO.o00oo0O0(o0oooo0, "typeParameter");
            StringBuilder sb = new StringBuilder();
            int i = C0171o00oOOo0.f13622o00oOOo0[o0oooo0.o00oOoO().ordinal()];
            if (i != 2) {
                str = i == 3 ? "out " : "in ";
                sb.append(o0oooo0.getName());
                String sb2 = sb.toString();
                o0ooO.o00oo0OO(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            }
            sb.append(str);
            sb.append(o0oooo0.getName());
            String sb22 = sb.toString();
            o0ooO.o00oo0OO(sb22, "StringBuilder().apply(builderAction).toString()");
            return sb22;
        }
    }

    public o0OOOO00(@Nullable Object obj, @NotNull String str, @NotNull o0OOOo.o0O0o000 o0o0o000, boolean z) {
        o0ooO.o00oo0O0(str, "name");
        o0ooO.o00oo0O0(o0o0o000, "variance");
        this.f13618o00oo0O0 = obj;
        this.f13617o00oo0O = str;
        this.f13619o00oo0Oo = o0o0o000;
        this.f13621o00oo0o0 = z;
    }

    public static /* synthetic */ void o00oOo0O() {
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o0OOOO00) {
            o0OOOO00 o0oooo00 = (o0OOOO00) obj;
            if (o0ooO.o00oOoO0(this.f13618o00oo0O0, o0oooo00.f13618o00oo0O0) && o0ooO.o00oOoO0(this.f13617o00oo0O, o0oooo00.f13617o00oo0O)) {
                return true;
            }
        }
        return false;
    }

    @Override // o0OOOo.o0OooO0
    @NotNull
    public String getName() {
        return this.f13617o00oo0O;
    }

    @Override // o0OOOo.o0OooO0
    @NotNull
    public List<o0OOOo.o0O0OOOo> getUpperBounds() {
        List list = this.f13620o00oo0o;
        if (list == null) {
            List<o0OOOo.o0O0OOOo> o00oOoo02 = o0OO0oO.o0OoO00O.o00oOoo0(o0OOooO0.o00oo0(Object.class));
            this.f13620o00oo0o = o00oOoo02;
            return o00oOoo02;
        }
        return list;
    }

    public int hashCode() {
        Object obj = this.f13618o00oo0O0;
        return this.f13617o00oo0O.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31);
    }

    @Override // o0OOOo.o0OooO0
    @NotNull
    public o0OOOo.o0O0o000 o00oOoO() {
        return this.f13619o00oo0Oo;
    }

    public final void o00oOoOo(@NotNull List<? extends o0OOOo.o0O0OOOo> list) {
        o0ooO.o00oo0O0(list, "upperBounds");
        if (this.f13620o00oo0o == null) {
            this.f13620o00oo0o = list;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
    }

    @Override // o0OOOo.o0OooO0
    public boolean o00oOooO() {
        return this.f13621o00oo0o0;
    }

    @NotNull
    public String toString() {
        return f13616o00oo0oO.o00oOOo0(this);
    }
}
