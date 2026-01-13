package androidx.lifecycle;

import androidx.lifecycle.o0O00;
import com.google.firebase.analytics.FirebaseAnalytics;
import o00ooOoo.oOo000Oo;
import org.jetbrains.annotations.NotNull;
@o0OOOOO0.o0OOO00({"SMAP\nSavedStateHandleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleController.kt\nandroidx/lifecycle/SavedStateHandleController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
/* loaded from: classes.dex */
public final class SavedStateHandleController implements o0O00OOO {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o0O f3260o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final String f3261o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f3262o00oo0Oo;

    public SavedStateHandleController(@NotNull String str, @NotNull o0O o0o) {
        o0OOOOO0.o0ooO.o00oo0O0(str, "key");
        o0OOOOO0.o0ooO.o00oo0O0(o0o, "handle");
        this.f3261o00oo0O0 = str;
        this.f3260o00oo0O = o0o;
    }

    @Override // androidx.lifecycle.o0O00OOO
    public void o00oOOoO(@NotNull o0O0O0O o0o0o0o, @NotNull o0O00.o00oOOo0 o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o, FirebaseAnalytics.Param.SOURCE);
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, oOo000Oo.f9217o0O00o0o);
        if (o00oooo02 == o0O00.o00oOOo0.ON_DESTROY) {
            this.f3262o00oo0Oo = false;
            o0o0o0o.getLifecycle().o00oOooO(this);
        }
    }

    public final void o00oOo00(@NotNull androidx.savedstate.o00oOOo0 o00oooo02, @NotNull o0O00 o0o00) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "registry");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00, "lifecycle");
        if (!(!this.f3262o00oo0Oo)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.f3262o00oo0Oo = true;
        o0o00.o00oOOo0(this);
        o00oooo02.o00oOoOo(this.f3261o00oo0O0, this.f3260o00oo0O.f3324o00oOo0O);
    }

    public final boolean o00oOo0O() {
        return this.f3262o00oo0Oo;
    }

    @NotNull
    public final o0O o00oOooO() {
        return this.f3260o00oo0O;
    }
}
