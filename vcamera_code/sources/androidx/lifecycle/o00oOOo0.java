package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.o0OO0o00;
import o00oOooO.o0OO0oO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public abstract class o00oOOo0 extends o0OO0o00.o00oOo0O implements o0OO0o00.o00oOOoO {
    @NotNull

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final C0022o00oOOo0 f3275o00oOo0O = new C0022o00oOOo0(null);
    @NotNull

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f3276o00oOo0o = "androidx.lifecycle.savedstate.vm.tag";
    @Nullable

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public androidx.savedstate.o00oOOo0 f3277o00oOOoO;
    @Nullable

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o0O00 f3278o00oOo00;
    @Nullable

    /* renamed from: o00oOooO  reason: collision with root package name */
    public Bundle f3279o00oOooO;

    /* renamed from: androidx.lifecycle.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0022o00oOOo0 {
        public C0022o00oOOo0() {
        }

        public C0022o00oOOo0(o0OOOOO0.o0O00 o0o00) {
        }
    }

    public o00oOOo0() {
    }

    public o00oOOo0(@NotNull o0O0OOo.o00oOo0O o00ooo0o2, @Nullable Bundle bundle) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooo0o2, "owner");
        this.f3277o00oOOoO = o00ooo0o2.getSavedStateRegistry();
        this.f3278o00oOo00 = o00ooo0o2.getLifecycle();
        this.f3279o00oOooO = bundle;
    }

    @Override // androidx.lifecycle.o0OO0o00.o00oOOoO
    @NotNull
    public <T extends o0OO0> T o00oOOoO(@NotNull Class<T> cls, @NotNull o0O00oO0.o00oOOo0 o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(cls, "modelClass");
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "extras");
        String str = (String) o00oooo02.o00oOOo0(o0OO0o00.o00oOo00.f3397o00oOooO);
        if (str != null) {
            return this.f3277o00oOOoO != null ? (T) o00oOo0O(str, cls) : (T) o00oOo0o(str, cls, o0OO000.o00oOOo0(o00oooo02));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.o0OO0o00.o00oOOoO
    @NotNull
    public <T extends o0OO0> T o00oOo00(@NotNull Class<T> cls) {
        o0OOOOO0.o0ooO.o00oo0O0(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            if (this.f3278o00oOo00 != null) {
                return (T) o00oOo0O(canonicalName, cls);
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final <T extends o0OO0> T o00oOo0O(String str, Class<T> cls) {
        androidx.savedstate.o00oOOo0 o00oooo02 = this.f3277o00oOOoO;
        o0OOOOO0.o0ooO.o00oo00O(o00oooo02);
        o0O00 o0o00 = this.f3278o00oOo00;
        o0OOOOO0.o0ooO.o00oo00O(o0o00);
        SavedStateHandleController o00oOOoO2 = LegacySavedStateHandleController.o00oOOoO(o00oooo02, o0o00, str, this.f3279o00oOooO);
        T t = (T) o00oOo0o(str, cls, o00oOOoO2.f3260o00oo0O);
        t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", o00oOOoO2);
        return t;
    }

    @NotNull
    public abstract <T extends o0OO0> T o00oOo0o(@NotNull String str, @NotNull Class<T> cls, @NotNull o0O o0o);

    @Override // androidx.lifecycle.o0OO0o00.o00oOo0O
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public void o00oOooO(@NotNull o0OO0 o0oo0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0oo0, "viewModel");
        androidx.savedstate.o00oOOo0 o00oooo02 = this.f3277o00oOOoO;
        if (o00oooo02 != null) {
            o0OOOOO0.o0ooO.o00oo00O(o00oooo02);
            o0O00 o0o00 = this.f3278o00oOo00;
            o0OOOOO0.o0ooO.o00oo00O(o0o00);
            LegacySavedStateHandleController.o00oOOo0(o0oo0, o00oooo02, o0o00);
        }
    }
}
