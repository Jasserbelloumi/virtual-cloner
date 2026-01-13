package androidx.lifecycle;

import androidx.lifecycle.o0OO0;
import androidx.lifecycle.o0OO0o00;
import o0O00oO0.o00oOOo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class o0OOooO0<VM extends o0OO0> implements o0OO0o.o0oO0Ooo<VM> {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o0OOOO.o00oOOo0<o0OO0oO0> f3400o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0OOOo.o0O00OO<VM> f3401o00oo0O0;
    @NotNull

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o0OOOO.o00oOOo0<o0OO0o00.o00oOOoO> f3402o00oo0Oo;
    @Nullable

    /* renamed from: o00oo0o  reason: collision with root package name */
    public VM f3403o00oo0o;
    @NotNull

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final o0OOOO.o00oOOo0<o0O00oO0.o00oOOo0> f3404o00oo0o0;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0OOOOO0.o0O0OO implements o0OOOO.o00oOOo0<o00oOOo0.C0143o00oOOo0> {
        public static final o00oOOo0 INSTANCE = new o00oOOo0();

        public o00oOOo0() {
            super(0);
        }

        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final o00oOOo0.C0143o00oOOo0 invoke() {
            return o00oOOo0.C0143o00oOOo0.f11162o00oOOoO;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o0OOOO0o.o00oo0O0
    public o0OOooO0(@NotNull o0OOOo.o0O00OO<VM> o0o00oo, @NotNull o0OOOO.o00oOOo0<? extends o0OO0oO0> o00oooo02, @NotNull o0OOOO.o00oOOo0<? extends o0OO0o00.o00oOOoO> o00oooo03) {
        this(o0o00oo, o00oooo02, o00oooo03, null, 8, null);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00oo, "viewModelClass");
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "storeProducer");
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo03, "factoryProducer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOOO0o.o00oo0O0
    public o0OOooO0(@NotNull o0OOOo.o0O00OO<VM> o0o00oo, @NotNull o0OOOO.o00oOOo0<? extends o0OO0oO0> o00oooo02, @NotNull o0OOOO.o00oOOo0<? extends o0OO0o00.o00oOOoO> o00oooo03, @NotNull o0OOOO.o00oOOo0<? extends o0O00oO0.o00oOOo0> o00oooo04) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00oo, "viewModelClass");
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "storeProducer");
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo03, "factoryProducer");
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo04, "extrasProducer");
        this.f3401o00oo0O0 = o0o00oo;
        this.f3400o00oo0O = o00oooo02;
        this.f3402o00oo0Oo = o00oooo03;
        this.f3404o00oo0o0 = o00oooo04;
    }

    public /* synthetic */ o0OOooO0(o0OOOo.o0O00OO o0o00oo, o0OOOO.o00oOOo0 o00oooo02, o0OOOO.o00oOOo0 o00oooo03, o0OOOO.o00oOOo0 o00oooo04, int i, o0OOOOO0.o0O00 o0o00) {
        this(o0o00oo, o00oooo02, o00oooo03, (i & 8) != 0 ? o00oOOo0.INSTANCE : o00oooo04);
    }

    @Override // o0OO0o.o0oO0Ooo
    public boolean isInitialized() {
        return this.f3403o00oo0o != null;
    }

    @Override // o0OO0o.o0oO0Ooo
    @NotNull
    /* renamed from: o00oOOo0 */
    public VM getValue() {
        VM vm = this.f3403o00oo0o;
        if (vm == null) {
            VM vm2 = (VM) new o0OO0o00(this.f3400o00oo0O.invoke(), this.f3402o00oo0Oo.invoke(), this.f3404o00oo0o0.invoke()).o00oOOo0(o0OOOO0o.o00oOOo0.o00oOo0O(this.f3401o00oo0O0));
            this.f3403o00oo0o = vm2;
            return vm2;
        }
        return vm;
    }
}
