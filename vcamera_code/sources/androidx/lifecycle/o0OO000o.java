package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.o00oOOo0;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOOOO0.o0OOO00({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,221:1\n215#2,2:222\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n*L\n146#1:222,2\n*E\n"})
/* loaded from: classes.dex */
public final class o0OO000o implements o00oOOo0.o00oOo00 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final androidx.savedstate.o00oOOo0 f3371o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public boolean f3372o00oOOoO;
    @Nullable

    /* renamed from: o00oOo00  reason: collision with root package name */
    public Bundle f3373o00oOo00;
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o0OO0o.o0oO0Ooo f3374o00oOooO;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0OOOOO0.o0O0OO implements o0OOOO.o00oOOo0<oo0oO0> {
        public final /* synthetic */ o0OO0oO $viewModelStoreOwner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(o0OO0oO o0oo0oo) {
            super(0);
            this.$viewModelStoreOwner = o0oo0oo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final oo0oO0 invoke() {
            return o0OO000.o00oOo0O(this.$viewModelStoreOwner);
        }
    }

    public o0OO000o(@NotNull androidx.savedstate.o00oOOo0 o00oooo02, @NotNull o0OO0oO o0oo0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "savedStateRegistry");
        o0OOOOO0.o0ooO.o00oo0O0(o0oo0oo, "viewModelStoreOwner");
        this.f3371o00oOOo0 = o00oooo02;
        this.f3374o00oOooO = o0OO0o.o0O00oO0.o00oOo00(new o00oOOo0(o0oo0oo));
    }

    @Override // androidx.savedstate.o00oOOo0.o00oOo00
    @NotNull
    public Bundle o00oOOo0() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3373o00oOo00;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, o0O> entry : o00oOo00().getHandles().entrySet()) {
            String key = entry.getKey();
            Bundle o00oOOo02 = entry.getValue().f3324o00oOo0O.o00oOOo0();
            if (!o0OOOOO0.o0ooO.o00oOoO0(o00oOOo02, Bundle.EMPTY)) {
                bundle.putBundle(key, o00oOOo02);
            }
        }
        this.f3372o00oOOoO = false;
        return bundle;
    }

    @Nullable
    public final Bundle o00oOOoO(@NotNull String str) {
        o0OOOOO0.o0ooO.o00oo0O0(str, "key");
        o00oOooO();
        Bundle bundle = this.f3373o00oOo00;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f3373o00oOo00;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f3373o00oOo00;
        boolean z = true;
        if (bundle4 == null || !bundle4.isEmpty()) {
            z = false;
        }
        if (z) {
            this.f3373o00oOo00 = null;
        }
        return bundle2;
    }

    public final oo0oO0 o00oOo00() {
        return (oo0oO0) this.f3374o00oOooO.getValue();
    }

    public final void o00oOooO() {
        if (this.f3372o00oOOoO) {
            return;
        }
        this.f3373o00oOo00 = this.f3371o00oOOo0.o00oOOoO(o0OO000.f3367o00oOOoO);
        this.f3372o00oOOoO = true;
        o00oOo00();
    }
}
