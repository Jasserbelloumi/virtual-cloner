package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.github.nukc.stateview.StateView;
import com.google.common.base.Ascii;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0O0OoO0.o00oOo0O;
import o0OOoO0.o00oo;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o0O00O0 implements o00oOo00 {
    @oo0oO0
    public final RecyclerView recyclerView;
    @oo0oO0
    private final ConstraintLayout rootView;
    @oo0oO0
    public final StateView stateView;

    private o0O00O0(@oo0oO0 ConstraintLayout constraintLayout, @oo0oO0 RecyclerView recyclerView, @oo0oO0 StateView stateView) {
        this.rootView = constraintLayout;
        this.recyclerView = recyclerView;
        this.stateView = stateView;
    }

    @oo0oO0
    public static o0O00O0 bind(@oo0oO0 View view) {
        int i = R.id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) o00oOo0O.o00oOOo0(view, R.id.recyclerView);
        if (recyclerView != null) {
            i = R.id.stateView;
            StateView stateView = (StateView) o00oOo0O.o00oOOo0(view, R.id.stateView);
            if (stateView != null) {
                return new o0O00O0((ConstraintLayout) view, recyclerView, stateView);
            }
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{-99, 122, 109, 0, Ascii.GS, -96, -64, 94, -94, 118, 111, 6, Ascii.GS, -68, -62, Ascii.SUB, -16, 101, 119, Ascii.SYN, 3, -18, -48, Ascii.ETB, -92, 123, 62, 58, 48, -12, -121}, new byte[]{-48, 19, Ascii.RS, 115, 116, -50, -89, 126}).concat(view.getResources().getResourceName(i)));
    }

    @oo0oO0
    public static o0O00O0 inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0O00O0 inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_apps, viewGroup, false);
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
