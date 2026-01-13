package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.google.common.base.Ascii;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0O0OoO0.o00oOo0O;
import o0OOoO0.o00oo;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o0O000Oo implements o00oOo00 {
    @oo0oO0
    public final FragmentContainerView fragment;
    @oo0oO0
    private final ConstraintLayout rootView;
    @oo0oO0
    public final o0O0OO toolbarLayout;

    private o0O000Oo(@oo0oO0 ConstraintLayout constraintLayout, @oo0oO0 FragmentContainerView fragmentContainerView, @oo0oO0 o0O0OO o0o0oo) {
        this.rootView = constraintLayout;
        this.fragment = fragmentContainerView;
        this.toolbarLayout = o0o0oo;
    }

    @oo0oO0
    public static o0O000Oo bind(@oo0oO0 View view) {
        int i = R.id.fragment;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) o00oOo0O.o00oOOo0(view, R.id.fragment);
        if (fragmentContainerView != null) {
            i = R.id.toolbar_layout;
            View o00oOOo02 = o00oOo0O.o00oOOo0(view, R.id.toolbar_layout);
            if (o00oOOo02 != null) {
                return new o0O000Oo((ConstraintLayout) view, fragmentContainerView, o0O0OO.bind(o00oOOo02));
            }
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{105, -10, -124, -82, 98, -107, 95, -39, 86, -6, -122, -88, 98, -119, 93, -99, 4, -23, -98, -72, 124, -37, 79, -112, 80, -9, -41, -108, 79, -63, Ascii.CAN}, new byte[]{36, -97, -9, -35, Ascii.VT, -5, 56, -7}).concat(view.getResources().getResourceName(i)));
    }

    @oo0oO0
    public static o0O000Oo inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0O000Oo inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // o0O0OoO0.o00oOo00
    @oo0oO0
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
