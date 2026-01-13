package androidx.activity;

import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import o0OO0o.o0O0oo0o;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0ooO;
import o0OOOoO0.oO0OoOO0;
import o0OOOoO0.ooOOOOoo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOOO0o.o00oo0OO(name = "ViewTreeOnBackPressedDispatcherOwner")
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/activity/o0;", "onBackPressedDispatcherOwner", "Lo0OO0o/oO0Ooooo;", o0OO000o.o00oOOoO.f12961o00oOo00, "(Landroid/view/View;Landroidx/activity/o0;)V", "o00oOOo0", "(Landroid/view/View;)Landroidx/activity/o0;", "activity_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o0O000O {

    @o0O0oo0o(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "it", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0O0OO implements o0OOOO.o00oo<View, View> {
        public static final o00oOOo0 INSTANCE = new o00oOOo0();

        public o00oOOo0() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        @Nullable
        public final View invoke(@NotNull View view) {
            o0ooO.o00oo0O0(view, "it");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Landroidx/activity/o0;", "invoke", "(Landroid/view/View;)Landroidx/activity/o0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOOoO extends o0O0OO implements o0OOOO.o00oo<View, o0> {
        public static final o00oOOoO INSTANCE = new o00oOOoO();

        public o00oOOoO() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        @Nullable
        public final o0 invoke(@NotNull View view) {
            o0ooO.o00oo0O0(view, "it");
            Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
            if (tag instanceof o0) {
                return (o0) tag;
            }
            return null;
        }
    }

    @o0OOOO0o.o00oo0OO(name = "get")
    @Nullable
    public static final o0 o00oOOo0(@NotNull View view) {
        o0ooO.o00oo0O0(view, "<this>");
        return (o0) ooOOOOoo.o0ooO(ooOOOOoo.o0O0oo0O(oO0OoOO0.o00oOooo(view, o00oOOo0.INSTANCE), o00oOOoO.INSTANCE));
    }

    @o0OOOO0o.o00oo0OO(name = "set")
    public static final void o00oOOoO(@NotNull View view, @NotNull o0 o0Var) {
        o0ooO.o00oo0O0(view, "<this>");
        o0ooO.o00oo0O0(o0Var, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, o0Var);
    }
}
