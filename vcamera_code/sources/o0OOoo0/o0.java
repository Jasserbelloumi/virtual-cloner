package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Ascii;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0O0OoO0.o00oOo0O;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o0 implements o00oOo00 {
    @oo0oO0
    public final RecyclerView recyclerView;
    @oo0oO0
    private final ConstraintLayout rootView;
    @oo0oO0
    public final o0O0OO toolbarLayout;

    private o0(@oo0oO0 ConstraintLayout constraintLayout, @oo0oO0 RecyclerView recyclerView, @oo0oO0 o0O0OO o0o0oo) {
        this.rootView = constraintLayout;
        this.recyclerView = recyclerView;
        this.toolbarLayout = o0o0oo;
    }

    @oo0oO0
    public static o0 bind(@oo0oO0 View view) {
        int i = R.id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) o00oOo0O.o00oOOo0(view, R.id.recyclerView);
        if (recyclerView != null) {
            i = R.id.toolbar_layout;
            View o00oOOo02 = o00oOo0O.o00oOOo0(view, R.id.toolbar_layout);
            if (o00oOOo02 != null) {
                return new o0((ConstraintLayout) view, recyclerView, o0O0OO.bind(o00oOOo02));
            }
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{49, 94, 110, -12, -92, -28, 75, -101, Ascii.SO, 82, 108, -14, -92, -8, 73, -33, 92, 65, 116, -30, -70, -86, 91, -46, 8, 95, oo0OOoo.f13516o00oOoO, -50, -119, -80, Ascii.FF}, new byte[]{124, 55, Ascii.GS, -121, -51, -118, 44, -69}).concat(view.getResources().getResourceName(i)));
    }

    @oo0oO0
    public static o0 inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0 inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_gms, viewGroup, false);
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
