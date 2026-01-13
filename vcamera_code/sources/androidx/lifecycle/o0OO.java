package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.runtime.R;
import o0OOOoO0.oO0OoOO0;
import o0OOOoO0.ooOOOOoo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOOO0o.o00oo0OO(name = "ViewTreeLifecycleOwner")
/* loaded from: classes.dex */
public final class o0OO {

    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0OOOOO0.o0O0OO implements o0OOOO.o00oo<View, View> {
        public static final o00oOOo0 INSTANCE = new o00oOOo0();

        public o00oOOo0() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        @Nullable
        public final View invoke(@NotNull View view) {
            o0OOOOO0.o0ooO.o00oo0O0(view, "currentView");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO extends o0OOOOO0.o0O0OO implements o0OOOO.o00oo<View, o0O0O0O> {
        public static final o00oOOoO INSTANCE = new o00oOOoO();

        public o00oOOoO() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        @Nullable
        public final o0O0O0O invoke(@NotNull View view) {
            o0OOOOO0.o0ooO.o00oo0O0(view, "viewParent");
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            if (tag instanceof o0O0O0O) {
                return (o0O0O0O) tag;
            }
            return null;
        }
    }

    @o0OOOO0o.o00oo0OO(name = "get")
    @Nullable
    public static final o0O0O0O o00oOOo0(@NotNull View view) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        return (o0O0O0O) ooOOOOoo.o0ooO(ooOOOOoo.o0O0oo0O(oO0OoOO0.o00oOooo(view, o00oOOo0.INSTANCE), o00oOOoO.INSTANCE));
    }

    @o0OOOO0o.o00oo0OO(name = "set")
    public static final void o00oOOoO(@NotNull View view, @Nullable o0O0O0O o0o0o0o) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, o0o0o0o);
    }
}
