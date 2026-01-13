package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.base.Ascii;
import multispace.multiapp.clone.widget.RockerView;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0O0OoO0.o00oOo0O;
import o0OOoO0.o00oo;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o0ooO implements o00oOo00 {
    @oo0oO0
    public final RockerView rocker;
    @oo0oO0
    private final ConstraintLayout rootView;

    private o0ooO(@oo0oO0 ConstraintLayout constraintLayout, @oo0oO0 RockerView rockerView) {
        this.rootView = constraintLayout;
        this.rocker = rockerView;
    }

    @oo0oO0
    public static o0ooO bind(@oo0oO0 View view) {
        RockerView rockerView = (RockerView) o00oOo0O.o00oOOo0(view, R.id.rocker);
        if (rockerView != null) {
            return new o0ooO((ConstraintLayout) view, rockerView);
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{107, 126, -31, 108, -55, 75, -36, 117, 84, 114, -29, 106, -55, 87, -34, 49, 6, 97, -5, 122, -41, 5, -52, 60, 82, Byte.MAX_VALUE, -78, 86, -28, Ascii.US, -101}, new byte[]{38, Ascii.ETB, -110, Ascii.US, -96, 37, -69, 85}).concat(view.getResources().getResourceName(R.id.rocker)));
    }

    @oo0oO0
    public static o0ooO inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0ooO inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_float_rocker, viewGroup, false);
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
