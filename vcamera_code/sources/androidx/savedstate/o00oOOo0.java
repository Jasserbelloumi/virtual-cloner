package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.o0O00;
import androidx.lifecycle.o0O00OOO;
import androidx.lifecycle.o0O0O0O;
import androidx.savedstate.Recreator;
import androidx.savedstate.o00oOOo0;
import java.util.Iterator;
import java.util.Map;
import o00oOooO.o0O;
import o00ooOoo.oOo000Oo;
import o0O0OOo.o00oOo0O;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
@o0OOO00({"SMAP\nSavedStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateRegistry.kt\nandroidx/savedstate/SavedStateRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class o00oOOo0 {
    @Deprecated
    @NotNull

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f4872o00oOoO = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    @NotNull

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final o00oOOoO f4873o00oOoO0 = new o00oOOoO(null);

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public boolean f4875o00oOOoO;
    @Nullable

    /* renamed from: o00oOo00  reason: collision with root package name */
    public Bundle f4876o00oOo00;
    @Nullable

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public Recreator.o00oOOoO f4877o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public boolean f4879o00oOooO;
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oo00O.o00oOOoO<String, o00oOo00> f4874o00oOOo0 = new o00oo00O.o00oOOoO<>();

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f4878o00oOo0o = true;

    /* renamed from: androidx.savedstate.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0049o00oOOo0 {
        void o00oOOo0(@NotNull o00oOo0O o00ooo0o2);
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO {
        public o00oOOoO() {
        }

        public o00oOOoO(o0O00 o0o00) {
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOo00 {
        @NotNull
        Bundle o00oOOo0();
    }

    public static final void o00oOo0o(o00oOOo0 o00oooo02, o0O0O0O o0o0o0o, o0O00.o00oOOo0 o00oooo03) {
        boolean z;
        o0ooO.o00oo0O0(o00oooo02, "this$0");
        o0ooO.o00oo0O0(o0o0o0o, "<anonymous parameter 0>");
        o0ooO.o00oo0O0(o00oooo03, oOo000Oo.f9217o0O00o0o);
        if (o00oooo03 == o0O00.o00oOOo0.ON_START) {
            z = true;
        } else if (o00oooo03 != o0O00.o00oOOo0.ON_STOP) {
            return;
        } else {
            z = false;
        }
        o00oooo02.f4878o00oOo0o = z;
    }

    @o0O
    @Nullable
    public final Bundle o00oOOoO(@NotNull String str) {
        o0ooO.o00oo0O0(str, "key");
        if (this.f4879o00oOooO) {
            Bundle bundle = this.f4876o00oOo00;
            if (bundle != null) {
                Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
                Bundle bundle3 = this.f4876o00oOo00;
                if (bundle3 != null) {
                    bundle3.remove(str);
                }
                Bundle bundle4 = this.f4876o00oOo00;
                boolean z = false;
                if (bundle4 != null && !bundle4.isEmpty()) {
                    z = true;
                }
                if (!z) {
                    this.f4876o00oOo00 = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    @Nullable
    public final o00oOo00 o00oOo00(@NotNull String str) {
        o0ooO.o00oo0O0(str, "key");
        Iterator<Map.Entry<String, o00oOo00>> it = this.f4874o00oOOo0.iterator();
        while (it.hasNext()) {
            Map.Entry<String, o00oOo00> next = it.next();
            o0ooO.o00oo0OO(next, "components");
            o00oOo00 value = next.getValue();
            if (o0ooO.o00oOoO0(next.getKey(), str)) {
                return value;
            }
        }
        return null;
    }

    @o0O
    public final boolean o00oOo0O() {
        return this.f4879o00oOooO;
    }

    @o0O
    public final void o00oOoO(@Nullable Bundle bundle) {
        if (!this.f4875o00oOOoO) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.f4879o00oOooO)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.f4876o00oOo00 = bundle != null ? bundle.getBundle(f4872o00oOoO) : null;
        this.f4879o00oOooO = true;
    }

    @o0O
    public final void o00oOoO0(@NotNull androidx.lifecycle.o0O00 o0o00) {
        o0ooO.o00oo0O0(o0o00, "lifecycle");
        if (!(!this.f4875o00oOOoO)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        o0o00.o00oOOo0(new o0O00OOO() { // from class: o0O0OOo.o00oOOoO
            @Override // androidx.lifecycle.o0O00OOO
            public final void o00oOOoO(o0O0O0O o0o0o0o, o0O00.o00oOOo0 o00oooo02) {
                o00oOOo0.o00oOo0o(o00oOOo0.this, o0o0o0o, o00oooo02);
            }
        });
        this.f4875o00oOOoO = true;
    }

    @o0O
    public final void o00oOoOO(@NotNull Bundle bundle) {
        o0ooO.o00oo0O0(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f4876o00oOo00;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        o00oo00O.o00oOOoO<String, o00oOo00>.o00oOo0O o00oOo002 = this.f4874o00oOOo0.o00oOo00();
        o0ooO.o00oo0OO(o00oOo002, "this.components.iteratorWithAdditions()");
        while (o00oOo002.hasNext()) {
            Map.Entry next = o00oOo002.next();
            bundle2.putBundle((String) next.getKey(), ((o00oOo00) next.getValue()).o00oOOo0());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle(f4872o00oOoO, bundle2);
    }

    @o0O
    public final void o00oOoOo(@NotNull String str, @NotNull o00oOo00 o00ooo002) {
        o0ooO.o00oo0O0(str, "key");
        o0ooO.o00oo0O0(o00ooo002, DatabaseFileArchive.COLUMN_PROVIDER);
        if (!(this.f4874o00oOOo0.o00oOo0o(str, o00ooo002) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    @o0O
    public final void o00oOoo0(@NotNull Class<? extends InterfaceC0049o00oOOo0> cls) {
        o0ooO.o00oo0O0(cls, "clazz");
        if (!this.f4878o00oOo0o) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.o00oOOoO o00ooooo2 = this.f4877o00oOo0O;
        if (o00ooooo2 == null) {
            o00ooooo2 = new Recreator.o00oOOoO(this);
        }
        this.f4877o00oOo0O = o00ooooo2;
        try {
            cls.getDeclaredConstructor(new Class[0]);
            Recreator.o00oOOoO o00ooooo3 = this.f4877o00oOo0O;
            if (o00ooooo3 != null) {
                String name = cls.getName();
                o0ooO.o00oo0OO(name, "clazz.name");
                o00ooooo3.o00oOOoO(name);
            }
        } catch (NoSuchMethodException e) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Class ");
            o00oOOo02.append(cls.getSimpleName());
            o00oOOo02.append(" must have default constructor in order to be automatically recreated");
            throw new IllegalArgumentException(o00oOOo02.toString(), e);
        }
    }

    public final boolean o00oOooO() {
        return this.f4878o00oOo0o;
    }

    public final void o00oOooo(boolean z) {
        this.f4878o00oOo0o = z;
    }

    @o0O
    public final void o00oo00O(@NotNull String str) {
        o0ooO.o00oo0O0(str, "key");
        this.f4874o00oOOo0.o00oOoO0(str);
    }
}
