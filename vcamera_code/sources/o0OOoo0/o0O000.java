package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.common.primitives.SignedBytes;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0OOoO0.o00oo;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o0O000 implements o00oOo00 {
    @oo0oO0
    private final CoordinatorLayout rootView;

    private o0O000(@oo0oO0 CoordinatorLayout coordinatorLayout) {
        this.rootView = coordinatorLayout;
    }

    @oo0oO0
    public static o0O000 bind(@oo0oO0 View view) {
        if (view != null) {
            return new o0O000((CoordinatorLayout) view);
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{-89, -24, -49, 80, -68, 41, 0, -122}, new byte[]{-43, -121, -96, 36, -22, SignedBytes.MAX_POWER_OF_TWO, 101, -15}));
    }

    @oo0oO0
    public static o0O000 inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0O000 inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_map, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // o0O0OoO0.o00oOo00
    @oo0oO0
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}
