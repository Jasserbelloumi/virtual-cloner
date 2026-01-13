package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.o0OO0o00;
import java.lang.reflect.Constructor;
import o00oOooO.o0OO0oO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class oo0ooO extends o0OO0o00.o00oOo0O implements o0OO0o00.o00oOOoO {
    @Nullable

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public Application f3430o00oOOoO;
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o0OO0o00.o00oOOoO f3431o00oOo00;
    @Nullable

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public o0O00 f3432o00oOo0O;
    @Nullable

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public androidx.savedstate.o00oOOo0 f3433o00oOo0o;
    @Nullable

    /* renamed from: o00oOooO  reason: collision with root package name */
    public Bundle f3434o00oOooO;

    public oo0ooO() {
        this.f3431o00oOo00 = new o0OO0o00.o00oOOo0();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oo0ooO(@Nullable Application application, @NotNull o0O0OOo.o00oOo0O o00ooo0o2) {
        this(application, o00ooo0o2, null);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooo0o2, "owner");
    }

    @SuppressLint({"LambdaLast"})
    public oo0ooO(@Nullable Application application, @NotNull o0O0OOo.o00oOo0O o00ooo0o2, @Nullable Bundle bundle) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooo0o2, "owner");
        this.f3433o00oOo0o = o00ooo0o2.getSavedStateRegistry();
        this.f3432o00oOo0O = o00ooo0o2.getLifecycle();
        this.f3434o00oOooO = bundle;
        this.f3430o00oOOoO = application;
        this.f3431o00oOo00 = application != null ? o0OO0o00.o00oOOo0.f3387o00oOo0o.o00oOOoO(application) : new o0OO0o00.o00oOOo0();
    }

    @Override // androidx.lifecycle.o0OO0o00.o00oOOoO
    @NotNull
    public <T extends o0OO0> T o00oOOoO(@NotNull Class<T> cls, @NotNull o0O00oO0.o00oOOo0 o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(cls, "modelClass");
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "extras");
        String str = (String) o00oooo02.o00oOOo0(o0OO0o00.o00oOo00.f3397o00oOooO);
        if (str != null) {
            if (o00oooo02.o00oOOo0(o0OO000.f3368o00oOo00) == null || o00oooo02.o00oOOo0(o0OO000.f3370o00oOooO) == null) {
                if (this.f3432o00oOo0O != null) {
                    return (T) o00oOo0O(str, cls);
                }
                throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            }
            Application application = (Application) o00oooo02.o00oOOo0(o0OO0o00.o00oOOo0.f3390o00oOoOO);
            boolean isAssignableFrom = o00oOOoO.class.isAssignableFrom(cls);
            Constructor o00oOo002 = o0OO00OO.o00oOo00(cls, (!isAssignableFrom || application == null) ? o0OO00OO.o00oOOoO() : o0OO00OO.o00oOOo0());
            return o00oOo002 == null ? (T) this.f3431o00oOo00.o00oOOoO(cls, o00oooo02) : (!isAssignableFrom || application == null) ? (T) o0OO00OO.o00oOooO(cls, o00oOo002, o0OO000.o00oOOo0(o00oooo02)) : (T) o0OO00OO.o00oOooO(cls, o00oOo002, application, o0OO000.o00oOOo0(o00oooo02));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.o0OO0o00.o00oOOoO
    @NotNull
    public <T extends o0OO0> T o00oOo00(@NotNull Class<T> cls) {
        o0OOOOO0.o0ooO.o00oo0O0(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) o00oOo0O(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @NotNull
    public final <T extends o0OO0> T o00oOo0O(@NotNull String str, @NotNull Class<T> cls) {
        T t;
        Application application;
        o0OOOOO0.o0ooO.o00oo0O0(str, "key");
        o0OOOOO0.o0ooO.o00oo0O0(cls, "modelClass");
        o0O00 o0o00 = this.f3432o00oOo0O;
        if (o0o00 != null) {
            boolean isAssignableFrom = o00oOOoO.class.isAssignableFrom(cls);
            Constructor o00oOo002 = o0OO00OO.o00oOo00(cls, (!isAssignableFrom || this.f3430o00oOOoO == null) ? o0OO00OO.o00oOOoO() : o0OO00OO.o00oOOo0());
            if (o00oOo002 == null) {
                return this.f3430o00oOOoO != null ? (T) this.f3431o00oOo00.o00oOo00(cls) : (T) o0OO0o00.o00oOo00.f3395o00oOOoO.o00oOOo0().o00oOo00(cls);
            }
            androidx.savedstate.o00oOOo0 o00oooo02 = this.f3433o00oOo0o;
            o0OOOOO0.o0ooO.o00oo00O(o00oooo02);
            SavedStateHandleController o00oOOoO2 = LegacySavedStateHandleController.o00oOOoO(o00oooo02, o0o00, str, this.f3434o00oOooO);
            if (!isAssignableFrom || (application = this.f3430o00oOOoO) == null) {
                t = (T) o0OO00OO.o00oOooO(cls, o00oOo002, o00oOOoO2.f3260o00oo0O);
            } else {
                o0OOOOO0.o0ooO.o00oo00O(application);
                t = (T) o0OO00OO.o00oOooO(cls, o00oOo002, application, o00oOOoO2.f3260o00oo0O);
            }
            t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", o00oOOoO2);
            return t;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.o0OO0o00.o00oOo0O
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public void o00oOooO(@NotNull o0OO0 o0oo0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0oo0, "viewModel");
        if (this.f3432o00oOo0O != null) {
            androidx.savedstate.o00oOOo0 o00oooo02 = this.f3433o00oOo0o;
            o0OOOOO0.o0ooO.o00oo00O(o00oooo02);
            o0O00 o0o00 = this.f3432o00oOo0O;
            o0OOOOO0.o0ooO.o00oo00O(o0o00);
            LegacySavedStateHandleController.o00oOOo0(o0oo0, o00oooo02, o0o00);
        }
    }
}
