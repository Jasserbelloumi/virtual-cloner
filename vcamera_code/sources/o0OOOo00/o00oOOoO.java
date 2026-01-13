package o0OOOo00;

import o0OO0o.oO0Ooooo;
import o0OOOO.o0O0000O;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import o0OOOo.o0O0OO0;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o00oOOoO {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o00oOOoO f13695o00oOOo0 = new o00oOOoO();

    /* JADX INFO: Add missing generic type declarations: [T] */
    @o0OOO00({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n*L\n1#1,70:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<T> extends o00oOo0O<T> {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ o0O0000O<o0O0OO0<?>, T, T, oO0Ooooo> f13696o00oOOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(T t, o0O0000O<? super o0O0OO0<?>, ? super T, ? super T, oO0Ooooo> o0o0000o) {
            super(t);
            this.f13696o00oOOoO = o0o0000o;
        }

        @Override // o0OOOo00.o00oOo0O
        public void o00oOo00(@NotNull o0O0OO0<?> o0o0oo0, T t, T t2) {
            o0ooO.o00oo0O0(o0o0oo0, "property");
            this.f13696o00oOOoO.invoke(o0o0oo0, t, t2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @o0OOO00({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$vetoable$1\n*L\n1#1,70:1\n*E\n"})
    /* renamed from: o0OOOo00.o00oOOoO$o00oOOoO  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0173o00oOOoO<T> extends o00oOo0O<T> {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ o0O0000O<o0O0OO0<?>, T, T, Boolean> f13697o00oOOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0173o00oOOoO(T t, o0O0000O<? super o0O0OO0<?>, ? super T, ? super T, Boolean> o0o0000o) {
            super(t);
            this.f13697o00oOOoO = o0o0000o;
        }

        @Override // o0OOOo00.o00oOo0O
        public boolean o00oOooO(@NotNull o0O0OO0<?> o0o0oo0, T t, T t2) {
            o0ooO.o00oo0O0(o0o0oo0, "property");
            return this.f13697o00oOOoO.invoke(o0o0oo0, t, t2).booleanValue();
        }
    }

    @NotNull
    public final <T> o00oo0<Object, T> o00oOOo0() {
        return new o00oOo00();
    }

    @NotNull
    public final <T> o00oo0<Object, T> o00oOOoO(T t, @NotNull o0O0000O<? super o0O0OO0<?>, ? super T, ? super T, oO0Ooooo> o0o0000o) {
        o0ooO.o00oo0O0(o0o0000o, "onChange");
        return new o00oOOo0(t, o0o0000o);
    }

    @NotNull
    public final <T> o00oo0<Object, T> o00oOo00(T t, @NotNull o0O0000O<? super o0O0OO0<?>, ? super T, ? super T, Boolean> o0o0000o) {
        o0ooO.o00oo0O0(o0o0000o, "onChange");
        return new C0173o00oOOoO(t, o0o0000o);
    }
}
