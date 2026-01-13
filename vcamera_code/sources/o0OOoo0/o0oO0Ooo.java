package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0OOoO0.o00oo;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o0oO0Ooo implements o00oOo00 {
    @oo0oO0
    private final ConstraintLayout rootView;

    private o0oO0Ooo(@oo0oO0 ConstraintLayout constraintLayout) {
        this.rootView = constraintLayout;
    }

    @oo0oO0
    public static o0oO0Ooo bind(@oo0oO0 View view) {
        if (view != null) {
            return new o0oO0Ooo((ConstraintLayout) view);
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{-42, -49, -113, -4, -93, -110, -114, -22}, new byte[]{-92, -96, -32, -120, -11, -5, -21, -99}));
    }

    @oo0oO0
    public static o0oO0Ooo inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0oO0Ooo inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_viewpager, viewGroup, false);
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
