package androidx.lifecycle;

import o0OO0o.oO0Ooooo;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class o0ooO {

    @o0OOOOO0.o0OOO00({"SMAP\nLiveData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveData.kt\nandroidx/lifecycle/LiveDataKt$observe$wrappedObserver$1\n*L\n1#1,55:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class o00oOOo0<T> implements o0OooO0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oo<T, oO0Ooooo> f3429o00oOOo0;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(o0OOOO.o00oo<? super T, oO0Ooooo> o00ooVar) {
            this.f3429o00oOOo0 = o00ooVar;
        }

        @Override // androidx.lifecycle.o0OooO0
        public final void onChanged(T t) {
            this.f3429o00oOOo0.invoke(t);
        }
    }

    @o00oOooO.o0O
    @o0OO0o.o0O0o(message = "This extension method is not required when using Kotlin 1.4. You should remove \"import androidx.lifecycle.observe\"")
    @NotNull
    public static final <T> o0OooO0<T> o00oOOo0(@NotNull LiveData<T> liveData, @NotNull o0O0O0O o0o0o0o, @NotNull o0OOOO.o00oo<? super T, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(liveData, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o, "owner");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "onChanged");
        o00oOOo0 o00oooo02 = new o00oOOo0(o00ooVar);
        liveData.o00oOoo0(o0o0o0o, o00oooo02);
        return o00oooo02;
    }
}
