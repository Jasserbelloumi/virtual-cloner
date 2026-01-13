package androidx.savedstate;

import android.os.Bundle;
import android.support.v4.media.o00oOoO;
import androidx.lifecycle.o0O00;
import androidx.lifecycle.o0O00OOO;
import androidx.lifecycle.o0O0O0O;
import androidx.savedstate.o00oOOo0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import o00oOoOo.o00oo;
import o00ooOoo.oOo000Oo;
import o0O0OOo.o00oOo0O;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class Recreator implements o0O00OOO {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final o00oOOo0 f4867o00oo0O = new o00oOOo0(null);
    @NotNull

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final String f4868o00oo0Oo = "classes_to_restore";
    @NotNull

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final String f4869o00oo0o0 = "androidx.savedstate.Restarter";
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00oOo0O f4870o00oo0O0;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO implements o00oOOo0.o00oOo00 {
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Set<String> f4871o00oOOo0;

        public o00oOOoO(@NotNull androidx.savedstate.o00oOOo0 o00oooo02) {
            o0ooO.o00oo0O0(o00oooo02, "registry");
            this.f4871o00oOOo0 = new LinkedHashSet();
            o00oooo02.o00oOoOo(Recreator.f4869o00oo0o0, this);
        }

        @Override // androidx.savedstate.o00oOOo0.o00oOo00
        @NotNull
        public Bundle o00oOOo0() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(Recreator.f4868o00oo0Oo, new ArrayList<>(this.f4871o00oOOo0));
            return bundle;
        }

        public final void o00oOOoO(@NotNull String str) {
            o0ooO.o00oo0O0(str, "className");
            this.f4871o00oOOo0.add(str);
        }
    }

    public Recreator(@NotNull o00oOo0O o00ooo0o2) {
        o0ooO.o00oo0O0(o00ooo0o2, "owner");
        this.f4870o00oo0O0 = o00ooo0o2;
    }

    @Override // androidx.lifecycle.o0O00OOO
    public void o00oOOoO(@NotNull o0O0O0O o0o0o0o, @NotNull o0O00.o00oOOo0 o00oooo02) {
        o0ooO.o00oo0O0(o0o0o0o, FirebaseAnalytics.Param.SOURCE);
        o0ooO.o00oo0O0(o00oooo02, oOo000Oo.f9217o0O00o0o);
        if (o00oooo02 != o0O00.o00oOOo0.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        o0o0o0o.getLifecycle().o00oOooO(this);
        Bundle o00oOOoO2 = this.f4870o00oo0O0.getSavedStateRegistry().o00oOOoO(f4869o00oo0o0);
        if (o00oOOoO2 == null) {
            return;
        }
        ArrayList<String> stringArrayList = o00oOOoO2.getStringArrayList(f4868o00oo0Oo);
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            o00oOo00(str);
        }
    }

    public final void o00oOo00(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(o00oOOo0.InterfaceC0049o00oOOo0.class);
            o0ooO.o00oo0OO(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    o0ooO.o00oo0OO(newInstance, "{\n                constr…wInstance()\n            }");
                    ((o00oOOo0.InterfaceC0049o00oOOo0) newInstance).o00oOOo0(this.f4870o00oo0O0);
                } catch (Exception e) {
                    throw new RuntimeException(o00oo.o00oOOo0("Failed to instantiate ", str), e);
                }
            } catch (NoSuchMethodException e2) {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Class ");
                o00oOOo02.append(asSubclass.getSimpleName());
                o00oOOo02.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalStateException(o00oOOo02.toString(), e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException(o00oOoO.o00oOOo0("Class ", str, " wasn't found"), e3);
        }
    }
}
