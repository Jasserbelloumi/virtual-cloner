package androidx.activity;

import androidx.lifecycle.o0O0O0O;
import kotlin.Metadata;
import o0OO0o.oO0Ooooo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\n\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¨\u0006\u000b"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "Landroidx/lifecycle/o0O0O0O;", "owner", "", "enabled", "Lkotlin/Function1;", "Landroidx/activity/o00oo0O;", "Lo0OO0o/oO0Ooooo;", "Lo0OO0o/o0O000Oo;", "onBackPressed", "o00oOOo0", "activity-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o00ooO {

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"androidx/activity/o00ooO$o00oOOo0", "Landroidx/activity/o00oo0O;", "Lo0OO0o/oO0Ooooo;", "o00oOo0O", "activity-ktx_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o00oo0O {

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oo<o00oo0O, oO0Ooooo> f62o00oOooO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(boolean z, o0OOOO.o00oo<? super o00oo0O, oO0Ooooo> o00ooVar) {
            super(z);
            this.f62o00oOooO = o00ooVar;
        }

        @Override // androidx.activity.o00oo0O
        public void o00oOo0O() {
            this.f62o00oOooO.invoke(this);
        }
    }

    @NotNull
    public static final o00oo0O o00oOOo0(@NotNull OnBackPressedDispatcher onBackPressedDispatcher, @Nullable o0O0O0O o0o0o0o, boolean z, @NotNull o0OOOO.o00oo<? super o00oo0O, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(onBackPressedDispatcher, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "onBackPressed");
        o00oOOo0 o00oooo02 = new o00oOOo0(z, o00ooVar);
        if (o0o0o0o != null) {
            onBackPressedDispatcher.o00oOo00(o0o0o0o, o00oooo02);
        } else {
            onBackPressedDispatcher.o00oOooO(o00oooo02);
        }
        return o00oooo02;
    }

    public static /* synthetic */ o00oo0O o00oOOoO(OnBackPressedDispatcher onBackPressedDispatcher, o0O0O0O o0o0o0o, boolean z, o0OOOO.o00oo o00ooVar, int i, Object obj) {
        if ((i & 1) != 0) {
            o0o0o0o = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return o00oOOo0(onBackPressedDispatcher, o0o0o0o, z, o00ooVar);
    }
}
