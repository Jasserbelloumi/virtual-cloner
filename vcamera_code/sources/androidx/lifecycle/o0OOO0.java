package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.viewmodel.R;
import o0OOOoO0.oO0OoOO0;
import o0OOOoO0.ooOOOOoo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOOO0o.o00oo0OO(name = "ViewTreeViewModelStoreOwner")
/* loaded from: classes.dex */
public final class o0OOO0 {

    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0OOOOO0.o0O0OO implements o0OOOO.o00oo<View, View> {
        public static final o00oOOo0 INSTANCE = new o00oOOo0();

        public o00oOOo0() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        @Nullable
        public final View invoke(@NotNull View view) {
            o0OOOOO0.o0ooO.o00oo0O0(view, "view");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO extends o0OOOOO0.o0O0OO implements o0OOOO.o00oo<View, o0OO0oO> {
        public static final o00oOOoO INSTANCE = new o00oOOoO();

        public o00oOOoO() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        @Nullable
        public final o0OO0oO invoke(@NotNull View view) {
            o0OOOOO0.o0ooO.o00oo0O0(view, "view");
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            if (tag instanceof o0OO0oO) {
                return (o0OO0oO) tag;
            }
            return null;
        }
    }

    @o0OOOO0o.o00oo0OO(name = "get")
    @Nullable
    public static final o0OO0oO o00oOOo0(@NotNull View view) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        return (o0OO0oO) ooOOOOoo.o0ooO(ooOOOOoo.o0O0oo0O(oO0OoOO0.o00oOooo(view, o00oOOo0.INSTANCE), o00oOOoO.INSTANCE));
    }

    @o0OOOO0o.o00oo0OO(name = "set")
    public static final void o00oOOoO(@NotNull View view, @Nullable o0OO0oO o0oo0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, o0oo0oo);
    }
}
