package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.o0O00;
import androidx.savedstate.o00oOOo0;
import com.google.firebase.analytics.FirebaseAnalytics;
import o00ooOoo.oOo000Oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class LegacySavedStateHandleController {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final LegacySavedStateHandleController f3223o00oOOo0 = new LegacySavedStateHandleController();
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f3224o00oOOoO = "androidx.lifecycle.savedstate.vm.tag";

    /* loaded from: classes.dex */
    public static final class o00oOOo0 implements o00oOOo0.InterfaceC0049o00oOOo0 {
        @Override // androidx.savedstate.o00oOOo0.InterfaceC0049o00oOOo0
        public void o00oOOo0(@NotNull o0O0OOo.o00oOo0O o00ooo0o2) {
            o0OOOOO0.o0ooO.o00oo0O0(o00ooo0o2, "owner");
            if (!(o00ooo0o2 instanceof o0OO0oO)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            o0OO0oO0 viewModelStore = ((o0OO0oO) o00ooo0o2).getViewModelStore();
            androidx.savedstate.o00oOOo0 savedStateRegistry = o00ooo0o2.getSavedStateRegistry();
            for (String str : viewModelStore.o00oOo00()) {
                o0OO0 o00oOOoO2 = viewModelStore.o00oOOoO(str);
                o0OOOOO0.o0ooO.o00oo00O(o00oOOoO2);
                LegacySavedStateHandleController.o00oOOo0(o00oOOoO2, savedStateRegistry, o00ooo0o2.getLifecycle());
            }
            if (!viewModelStore.o00oOo00().isEmpty()) {
                savedStateRegistry.o00oOoo0(o00oOOo0.class);
            }
        }
    }

    @o0OOOO0o.o00ooO0
    public static final void o00oOOo0(@NotNull o0OO0 o0oo0, @NotNull androidx.savedstate.o00oOOo0 o00oooo02, @NotNull o0O00 o0o00) {
        o0OOOOO0.o0ooO.o00oo0O0(o0oo0, "viewModel");
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "registry");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) o0oo0.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.f3262o00oo0Oo) {
            return;
        }
        savedStateHandleController.o00oOo00(o00oooo02, o0o00);
        f3223o00oOOo0.o00oOo00(o00oooo02, o0o00);
    }

    @o0OOOO0o.o00ooO0
    @NotNull
    public static final SavedStateHandleController o00oOOoO(@NotNull androidx.savedstate.o00oOOo0 o00oooo02, @NotNull o0O00 o0o00, @Nullable String str, @Nullable Bundle bundle) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "registry");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00, "lifecycle");
        o0OOOOO0.o0ooO.o00oo00O(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, o0O.f3317o00oOo0o.o00oOOo0(o00oooo02.o00oOOoO(str), bundle));
        savedStateHandleController.o00oOo00(o00oooo02, o0o00);
        f3223o00oOOo0.o00oOo00(o00oooo02, o0o00);
        return savedStateHandleController;
    }

    public final void o00oOo00(final androidx.savedstate.o00oOOo0 o00oooo02, final o0O00 o0o00) {
        o0O00.o00oOOoO o00oOOoO2 = o0o00.o00oOOoO();
        if (o00oOOoO2 == o0O00.o00oOOoO.INITIALIZED || o00oOOoO2.isAtLeast(o0O00.o00oOOoO.STARTED)) {
            o00oooo02.o00oOoo0(o00oOOo0.class);
        } else {
            o0o00.o00oOOo0(new o0O00OOO() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.o0O00OOO
                public void o00oOOoO(@NotNull o0O0O0O o0o0o0o, @NotNull o0O00.o00oOOo0 o00oooo03) {
                    o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o, FirebaseAnalytics.Param.SOURCE);
                    o0OOOOO0.o0ooO.o00oo0O0(o00oooo03, oOo000Oo.f9217o0O00o0o);
                    if (o00oooo03 == o0O00.o00oOOo0.ON_START) {
                        o0O00.this.o00oOooO(this);
                        o00oooo02.o00oOoo0(LegacySavedStateHandleController.o00oOOo0.class);
                    }
                }
            });
        }
    }
}
