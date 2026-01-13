package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.o0O00;
import androidx.lifecycle.o0OO0o00;
import androidx.savedstate.o00oOOo0;
import o0O00oO0.o00oOOo0;
import org.jetbrains.annotations.NotNull;
@o0OOOO0o.o00oo0OO(name = "SavedStateHandleSupport")
@o0OOOOO0.o0OOO00({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,221:1\n1#2:222\n31#3:223\n63#3,2:224\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n*L\n109#1:223\n110#1:224,2\n*E\n"})
/* loaded from: classes.dex */
public final class o0OO000 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f3366o00oOOo0 = "androidx.lifecycle.internal.SavedStateHandlesVM";
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f3367o00oOOoO = "androidx.lifecycle.internal.SavedStateHandlesProvider";
    @o0OOOO0o.o00oOoO
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final o00oOOo0.o00oOOoO<o0O0OOo.o00oOo0O> f3368o00oOo00 = new o00oOOoO();
    @o0OOOO0o.o00oOoO
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final o00oOOo0.o00oOOoO<o0OO0oO> f3370o00oOooO = new o00oOo00();
    @o0OOOO0o.o00oOoO
    @NotNull

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final o00oOOo0.o00oOOoO<Bundle> f3369o00oOo0O = new o00oOOo0();

    /* loaded from: classes.dex */
    public static final class o00oOOo0 implements o00oOOo0.o00oOOoO<Bundle> {
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO implements o00oOOo0.o00oOOoO<o0O0OOo.o00oOo0O> {
    }

    /* loaded from: classes.dex */
    public static final class o00oOo00 implements o00oOOo0.o00oOOoO<o0OO0oO> {
    }

    /* loaded from: classes.dex */
    public static final class o00oOo0O extends o0OOOOO0.o0O0OO implements o0OOOO.o00oo<o0O00oO0.o00oOOo0, oo0oO0> {
        public static final o00oOo0O INSTANCE = new o00oOo0O();

        public o00oOo0O() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        @NotNull
        public final oo0oO0 invoke(@NotNull o0O00oO0.o00oOOo0 o00oooo02) {
            o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "$this$initializer");
            return new oo0oO0();
        }
    }

    @o00oOooO.o0O
    @NotNull
    public static final o0O o00oOOo0(@NotNull o0O00oO0.o00oOOo0 o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "<this>");
        o0O0OOo.o00oOo0O o00ooo0o2 = (o0O0OOo.o00oOo0O) o00oooo02.o00oOOo0(f3368o00oOo00);
        if (o00ooo0o2 != null) {
            o0OO0oO o0oo0oo = (o0OO0oO) o00oooo02.o00oOOo0(f3370o00oOooO);
            if (o0oo0oo != null) {
                Bundle bundle = (Bundle) o00oooo02.o00oOOo0(f3369o00oOo0O);
                String str = (String) o00oooo02.o00oOOo0(o0OO0o00.o00oOo00.f3397o00oOooO);
                if (str != null) {
                    return o00oOOoO(o00ooo0o2, o0oo0oo, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final o0O o00oOOoO(o0O0OOo.o00oOo0O o00ooo0o2, o0OO0oO o0oo0oo, String str, Bundle bundle) {
        o0OO000o o00oOooO2 = o00oOooO(o00ooo0o2);
        oo0oO0 o00oOo0O2 = o00oOo0O(o0oo0oo);
        o0O o0o = o00oOo0O2.getHandles().get(str);
        if (o0o == null) {
            o0O o00oOOo02 = o0O.f3317o00oOo0o.o00oOOo0(o00oOooO2.o00oOOoO(str), bundle);
            o00oOo0O2.getHandles().put(str, o00oOOo02);
            return o00oOOo02;
        }
        return o0o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o00oOooO.o0O
    public static final <T extends o0O0OOo.o00oOo0O & o0OO0oO> void o00oOo00(@NotNull T t) {
        o0OOOOO0.o0ooO.o00oo0O0(t, "<this>");
        o0O00.o00oOOoO o00oOOoO2 = t.getLifecycle().o00oOOoO();
        if (!(o00oOOoO2 == o0O00.o00oOOoO.INITIALIZED || o00oOOoO2 == o0O00.o00oOOoO.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t.getSavedStateRegistry().o00oOo00(f3367o00oOOoO) == null) {
            o0OO000o o0oo000o = new o0OO000o(t.getSavedStateRegistry(), t);
            t.getSavedStateRegistry().o00oOoOo(f3367o00oOOoO, o0oo000o);
            t.getLifecycle().o00oOOo0(new SavedStateHandleAttacher(o0oo000o));
        }
    }

    @NotNull
    public static final oo0oO0 o00oOo0O(@NotNull o0OO0oO o0oo0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(o0oo0oo, "<this>");
        o0O00oO0.o00oOo00 o00ooo002 = new o0O00oO0.o00oOo00();
        o00ooo002.o00oOOo0(o0OOOOO0.o0OOooO0.o00oOooO(oo0oO0.class), o00oOo0O.INSTANCE);
        return (oo0oO0) new o0OO0o00(o0oo0oo, o00ooo002.o00oOOoO()).o00oOOoO(f3366o00oOOo0, oo0oO0.class);
    }

    @NotNull
    public static final o0OO000o o00oOooO(@NotNull o0O0OOo.o00oOo0O o00ooo0o2) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooo0o2, "<this>");
        o00oOOo0.o00oOo00 o00oOo002 = o00ooo0o2.getSavedStateRegistry().o00oOo00(f3367o00oOOoO);
        o0OO000o o0oo000o = o00oOo002 instanceof o0OO000o ? (o0OO000o) o00oOo002 : null;
        if (o0oo000o != null) {
            return o0oo000o;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }
}
