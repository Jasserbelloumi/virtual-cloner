package o0OO0o00;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.skydoves.powerspinner.R;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo0O;
/* loaded from: classes2.dex */
public final class o00oOOoO implements o0O0OoO0.o00oOo00 {
    @oo0oO0
    public final FrameLayout body;
    @oo0oO0
    public final RecyclerView recyclerView;
    @oo0oO0
    private final FrameLayout rootView;

    private o00oOOoO(@oo0oO0 FrameLayout frameLayout, @oo0oO0 FrameLayout frameLayout2, @oo0oO0 RecyclerView recyclerView) {
        this.rootView = frameLayout;
        this.body = frameLayout2;
        this.recyclerView = recyclerView;
    }

    @oo0oO0
    public static o00oOOoO bind(@oo0oO0 View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = R.id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) o00oOo0O.o00oOOo0(view, i);
        if (recyclerView != null) {
            return new o00oOOoO(frameLayout, frameLayout, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @oo0oO0
    public static o00oOOoO inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o00oOOoO inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.powerspinner_layout_body, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // o0O0OoO0.o00oOo00
    @oo0oO0
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
