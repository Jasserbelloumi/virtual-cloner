package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.github.nukc.stateview.StateView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.common.base.Ascii;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0O0OoO0.o00oOo0O;
import o0OOoO0.o00oo;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o0O0000O implements o00oOo00 {
    @oo0oO0
    public final WormDotsIndicator dotsIndicator;
    @oo0oO0
    public final FloatingActionButton fab;
    @oo0oO0
    private final ConstraintLayout rootView;
    @oo0oO0
    public final StateView stateView;
    @oo0oO0
    public final o0O0OO toolbarLayout;
    @oo0oO0
    public final ViewPager2 viewPager;

    private o0O0000O(@oo0oO0 ConstraintLayout constraintLayout, @oo0oO0 WormDotsIndicator wormDotsIndicator, @oo0oO0 FloatingActionButton floatingActionButton, @oo0oO0 StateView stateView, @oo0oO0 o0O0OO o0o0oo, @oo0oO0 ViewPager2 viewPager2) {
        this.rootView = constraintLayout;
        this.dotsIndicator = wormDotsIndicator;
        this.fab = floatingActionButton;
        this.stateView = stateView;
        this.toolbarLayout = o0o0oo;
        this.viewPager = viewPager2;
    }

    @oo0oO0
    public static o0O0000O bind(@oo0oO0 View view) {
        int i = R.id.dots_indicator;
        WormDotsIndicator wormDotsIndicator = (WormDotsIndicator) o00oOo0O.o00oOOo0(view, R.id.dots_indicator);
        if (wormDotsIndicator != null) {
            i = R.id.fab;
            FloatingActionButton floatingActionButton = (FloatingActionButton) o00oOo0O.o00oOOo0(view, R.id.fab);
            if (floatingActionButton != null) {
                i = R.id.stateView;
                StateView stateView = (StateView) o00oOo0O.o00oOOo0(view, R.id.stateView);
                if (stateView != null) {
                    i = R.id.toolbar_layout;
                    View o00oOOo02 = o00oOo0O.o00oOOo0(view, R.id.toolbar_layout);
                    if (o00oOOo02 != null) {
                        o0O0OO bind = o0O0OO.bind(o00oOOo02);
                        i = R.id.viewPager;
                        ViewPager2 viewPager2 = (ViewPager2) o00oOo0O.o00oOOo0(view, R.id.viewPager);
                        if (viewPager2 != null) {
                            return new o0O0000O((ConstraintLayout) view, wormDotsIndicator, floatingActionButton, stateView, bind, viewPager2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{-82, -66, -61, -124, 77, -90, 2, 60, -111, -78, -63, -126, 77, -70, 0, 120, -61, -95, -39, -110, 83, -24, Ascii.DC2, 117, -105, -65, -112, -66, 96, -14, 69}, new byte[]{-29, -41, -80, -9, 36, -56, 101, Ascii.FS}).concat(view.getResources().getResourceName(i)));
    }

    @oo0oO0
    public static o0O0000O inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0O0000O inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
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
