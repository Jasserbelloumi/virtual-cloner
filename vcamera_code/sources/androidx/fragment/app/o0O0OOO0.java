package androidx.fragment.app;

import androidx.lifecycle.o0OO0;
import androidx.lifecycle.o0OO0o00;
import androidx.lifecycle.o0OO0oO;
import androidx.lifecycle.o0OO0oO0;
import kotlin.Metadata;
import o00oOooO.o0O;
import o0OOOOO0.o0OOooO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u000e\b\n\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\bø\u0001\u0000\u001a4\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\bø\u0001\u0000\u001aJ\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/o0OO0;", "VM", "Landroidx/fragment/app/Fragment;", "Lkotlin/Function0;", "Landroidx/lifecycle/o0OO0oO;", "ownerProducer", "Landroidx/lifecycle/o0OO0o00$o00oOOoO;", "factoryProducer", "Lo0OO0o/o0oO0Ooo;", "o00oOo0O", "o00oOOo0", "Lo0OOOo/o0O00OO;", "viewModelClass", "Landroidx/lifecycle/o0OO0oO0;", "storeProducer", "o00oOo00", "fragment-ktx_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class o0O0OOO0 {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/o0OO0;", "VM", "Landroidx/lifecycle/o0OO0oO0;", "invoke", "()Landroidx/lifecycle/o0OO0oO0;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0OOOOO0.o0O0OO implements o0OOOO.o00oOOo0<o0OO0oO0> {
        public final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final o0OO0oO0 invoke() {
            FragmentActivity requireActivity = this.$this_activityViewModels.requireActivity();
            o0OOOOO0.o0ooO.o00oo0OO(requireActivity, "requireActivity()");
            o0OO0oO0 viewModelStore = requireActivity.getViewModelStore();
            o0OOOOO0.o0ooO.o00oo0OO(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/o0OO0;", "VM", "Landroidx/lifecycle/o0OO0o00$o00oOOoO;", "invoke", "()Landroidx/lifecycle/o0OO0o00$o00oOOoO;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes.dex */
    public static final class o00oOOoO extends o0OOOOO0.o0O0OO implements o0OOOO.o00oOOo0<o0OO0o00.o00oOOoO> {
        public final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final o0OO0o00.o00oOOoO invoke() {
            FragmentActivity requireActivity = this.$this_activityViewModels.requireActivity();
            o0OOOOO0.o0ooO.o00oo0OO(requireActivity, "requireActivity()");
            return requireActivity.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/o0OO0;", "VM", "Landroidx/lifecycle/o0OO0o00$o00oOOoO;", "invoke", "()Landroidx/lifecycle/o0OO0o00$o00oOOoO;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes.dex */
    public static final class o00oOo00 extends o0OOOOO0.o0O0OO implements o0OOOO.o00oOOo0<o0OO0o00.o00oOOoO> {
        public final /* synthetic */ Fragment $this_createViewModelLazy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo00(Fragment fragment) {
            super(0);
            this.$this_createViewModelLazy = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final o0OO0o00.o00oOOoO invoke() {
            return this.$this_createViewModelLazy.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/o0OO0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes.dex */
    public static final class o00oOo0O extends o0OOOOO0.o0O0OO implements o0OOOO.o00oOOo0<Fragment> {
        public final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo0O(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/o0OO0;", "VM", "Landroidx/lifecycle/o0OO0oO0;", "invoke", "()Landroidx/lifecycle/o0OO0oO0;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes.dex */
    public static final class o00oOoO extends o0OOOOO0.o0O0OO implements o0OOOO.o00oOOo0<o0OO0oO0> {
        public final /* synthetic */ o0OOOO.o00oOOo0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOoO(o0OOOO.o00oOOo0 o00oooo02) {
            super(0);
            this.$ownerProducer = o00oooo02;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final o0OO0oO0 invoke() {
            o0OO0oO0 viewModelStore = ((o0OO0oO) this.$ownerProducer.invoke()).getViewModelStore();
            o0OOOOO0.o0ooO.o00oo0OO(viewModelStore, "ownerProducer().viewModelStore");
            return viewModelStore;
        }
    }

    @o0O
    public static final <VM extends o0OO0> o0OO0o.o0oO0Ooo<VM> o00oOOo0(Fragment fragment, o0OOOO.o00oOOo0<? extends o0OO0o00.o00oOOoO> o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(fragment, "$this$activityViewModels");
        o0OOOOO0.o0ooO.o00oooOo();
        o0OOOo.o0O00OO o00oOooO2 = o0OOooO0.o00oOooO(o0OO0.class);
        o00oOOo0 o00oooo03 = new o00oOOo0(fragment);
        if (o00oooo02 == null) {
            o00oooo02 = new o00oOOoO(fragment);
        }
        return o00oOo00(fragment, o00oOooO2, o00oooo03, o00oooo02);
    }

    public static o0OO0o.o0oO0Ooo o00oOOoO(Fragment fragment, o0OOOO.o00oOOo0 o00oooo02, int i, Object obj) {
        if ((i & 1) != 0) {
            o00oooo02 = null;
        }
        o0OOOOO0.o0ooO.o00oo0O0(fragment, "$this$activityViewModels");
        o0OOOOO0.o0ooO.o00oooOo();
        o0OOOo.o0O00OO o00oOooO2 = o0OOooO0.o00oOooO(o0OO0.class);
        o00oOOo0 o00oooo03 = new o00oOOo0(fragment);
        if (o00oooo02 == null) {
            o00oooo02 = new o00oOOoO(fragment);
        }
        return o00oOo00(fragment, o00oOooO2, o00oooo03, o00oooo02);
    }

    @o0O
    @NotNull
    public static final <VM extends o0OO0> o0OO0o.o0oO0Ooo<VM> o00oOo00(@NotNull Fragment fragment, @NotNull o0OOOo.o0O00OO<VM> o0o00oo, @NotNull o0OOOO.o00oOOo0<? extends o0OO0oO0> o00oooo02, @Nullable o0OOOO.o00oOOo0<? extends o0OO0o00.o00oOOoO> o00oooo03) {
        o0OOOOO0.o0ooO.o00oo0O0(fragment, "$this$createViewModelLazy");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00oo, "viewModelClass");
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "storeProducer");
        if (o00oooo03 == null) {
            o00oooo03 = new o00oOo00(fragment);
        }
        return new androidx.lifecycle.o0OOooO0(o0o00oo, o00oooo02, o00oooo03);
    }

    @o0O
    public static final <VM extends o0OO0> o0OO0o.o0oO0Ooo<VM> o00oOo0O(Fragment fragment, o0OOOO.o00oOOo0<? extends o0OO0oO> o00oooo02, o0OOOO.o00oOOo0<? extends o0OO0o00.o00oOOoO> o00oooo03) {
        o0OOOOO0.o0ooO.o00oo0O0(fragment, "$this$viewModels");
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "ownerProducer");
        o0OOOOO0.o0ooO.o00oooOo();
        return o00oOo00(fragment, o0OOooO0.o00oOooO(o0OO0.class), new o00oOoO(o00oooo02), o00oooo03);
    }

    public static o0OO0o.o0oO0Ooo o00oOo0o(Fragment fragment, o0OOOO.o00oOOo0 o00oooo02, o0OOOO.o00oOOo0 o00oooo03, int i, Object obj) {
        if ((i & 1) != 0) {
            o00oooo02 = new o00oOo0O(fragment);
        }
        if ((i & 2) != 0) {
            o00oooo03 = null;
        }
        o0OOOOO0.o0ooO.o00oo0O0(fragment, "$this$viewModels");
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "ownerProducer");
        o0OOOOO0.o0ooO.o00oooOo();
        return o00oOo00(fragment, o0OOooO0.o00oOooO(o0OO0.class), new o00oOoO(o00oooo02), o00oooo03);
    }

    public static /* synthetic */ o0OO0o.o0oO0Ooo o00oOooO(Fragment fragment, o0OOOo.o0O00OO o0o00oo, o0OOOO.o00oOOo0 o00oooo02, o0OOOO.o00oOOo0 o00oooo03, int i, Object obj) {
        if ((i & 4) != 0) {
            o00oooo03 = null;
        }
        return o00oOo00(fragment, o0o00oo, o00oooo02, o00oooo03);
    }
}
