package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ferfalk.simplesearchview.SimpleSearchView;
import com.github.nukc.stateview.StateView;
import com.google.common.base.Ascii;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0O0OoO0.o00oOo0O;
import o0OOoO0.o00oo;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o0O00000 implements o00oOo00 {
    @oo0oO0
    public final RecyclerView recyclerView;
    @oo0oO0
    private final LinearLayout rootView;
    @oo0oO0
    public final SimpleSearchView searchView;
    @oo0oO0
    public final StateView stateView;
    @oo0oO0
    public final o0O0OO toolbarLayout;

    private o0O00000(@oo0oO0 LinearLayout linearLayout, @oo0oO0 RecyclerView recyclerView, @oo0oO0 SimpleSearchView simpleSearchView, @oo0oO0 StateView stateView, @oo0oO0 o0O0OO o0o0oo) {
        this.rootView = linearLayout;
        this.recyclerView = recyclerView;
        this.searchView = simpleSearchView;
        this.stateView = stateView;
        this.toolbarLayout = o0o0oo;
    }

    @oo0oO0
    public static o0O00000 bind(@oo0oO0 View view) {
        int i = R.id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) o00oOo0O.o00oOOo0(view, R.id.recyclerView);
        if (recyclerView != null) {
            i = R.id.searchView;
            SimpleSearchView simpleSearchView = (SimpleSearchView) o00oOo0O.o00oOOo0(view, R.id.searchView);
            if (simpleSearchView != null) {
                i = R.id.stateView;
                StateView stateView = (StateView) o00oOo0O.o00oOOo0(view, R.id.stateView);
                if (stateView != null) {
                    i = R.id.toolbar_layout;
                    View o00oOOo02 = o00oOo0O.o00oOOo0(view, R.id.toolbar_layout);
                    if (o00oOOo02 != null) {
                        return new o0O00000((LinearLayout) view, recyclerView, simpleSearchView, stateView, o0O0OO.bind(o00oOOo02));
                    }
                }
            }
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{57, -69, Ascii.ETB, -113, 65, -64, 53, -66, 6, -73, Ascii.NAK, -119, 65, -36, 55, -6, 84, -92, Ascii.CR, -103, 95, -114, 37, -9, 0, -70, 68, -75, 108, -108, 114}, new byte[]{116, -46, 100, -4, 40, -82, 82, -98}).concat(view.getResources().getResourceName(i)));
    }

    @oo0oO0
    public static o0O00000 inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0O00000 inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // o0O0OoO0.o00oOo00
    @oo0oO0
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
