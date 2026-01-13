package androidx.savedstate;

import android.view.View;
import android.view.ViewParent;
import o0O0OOo.o00oOo0O;
import o0OOOO.o00oo;
import o0OOOO0o.o00oo0OO;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0ooO;
import o0OOOoO0.oO0OoOO0;
import o0OOOoO0.ooOOOOoo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o00oo0OO(name = "ViewTreeSavedStateRegistryOwner")
/* loaded from: classes.dex */
public final class o00oOOoO {

    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0O0OO implements o00oo<View, View> {
        public static final o00oOOo0 INSTANCE = new o00oOOo0();

        public o00oOOo0() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        @Nullable
        public final View invoke(@NotNull View view) {
            o0ooO.o00oo0O0(view, "view");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* renamed from: androidx.savedstate.o00oOOoO$o00oOOoO  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0050o00oOOoO extends o0O0OO implements o00oo<View, o00oOo0O> {
        public static final C0050o00oOOoO INSTANCE = new C0050o00oOOoO();

        public C0050o00oOOoO() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        @Nullable
        public final o00oOo0O invoke(@NotNull View view) {
            o0ooO.o00oo0O0(view, "view");
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            if (tag instanceof o00oOo0O) {
                return (o00oOo0O) tag;
            }
            return null;
        }
    }

    @o00oo0OO(name = "get")
    @Nullable
    public static final o00oOo0O o00oOOo0(@NotNull View view) {
        o0ooO.o00oo0O0(view, "<this>");
        return (o00oOo0O) ooOOOOoo.o0ooO(ooOOOOoo.o0O0oo0O(oO0OoOO0.o00oOooo(view, o00oOOo0.INSTANCE), C0050o00oOOoO.INSTANCE));
    }

    @o00oo0OO(name = "set")
    public static final void o00oOOoO(@NotNull View view, @Nullable o00oOo0O o00ooo0o2) {
        o0ooO.o00oo0O0(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, o00ooo0o2);
    }
}
