package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;
import com.github.nukc.stateview.StateView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0O0OoO0.o00oOo0O;
import o0OOoO0.o00oo;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o0O000o0 implements o00oOo00 {
    @oo0oO0
    public final AppCompatButton btnApply;
    @oo0oO0
    public final FloatingActionButton fab;
    @oo0oO0
    public final RecyclerView recyclerView;
    @oo0oO0
    private final FrameLayout rootView;
    @oo0oO0
    public final StateView stateView;
    @oo0oO0
    public final o0O0OO toolbarLayout;

    private o0O000o0(@oo0oO0 FrameLayout frameLayout, @oo0oO0 AppCompatButton appCompatButton, @oo0oO0 FloatingActionButton floatingActionButton, @oo0oO0 RecyclerView recyclerView, @oo0oO0 StateView stateView, @oo0oO0 o0O0OO o0o0oo) {
        this.rootView = frameLayout;
        this.btnApply = appCompatButton;
        this.fab = floatingActionButton;
        this.recyclerView = recyclerView;
        this.stateView = stateView;
        this.toolbarLayout = o0o0oo;
    }

    @oo0oO0
    public static o0O000o0 bind(@oo0oO0 View view) {
        int i = R.id.btn_apply;
        AppCompatButton appCompatButton = (AppCompatButton) o00oOo0O.o00oOOo0(view, R.id.btn_apply);
        if (appCompatButton != null) {
            i = R.id.fab;
            FloatingActionButton floatingActionButton = (FloatingActionButton) o00oOo0O.o00oOOo0(view, R.id.fab);
            if (floatingActionButton != null) {
                i = R.id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) o00oOo0O.o00oOOo0(view, R.id.recyclerView);
                if (recyclerView != null) {
                    i = R.id.stateView;
                    StateView stateView = (StateView) o00oOo0O.o00oOOo0(view, R.id.stateView);
                    if (stateView != null) {
                        i = R.id.toolbar_layout;
                        View o00oOOo02 = o00oOo0O.o00oOOo0(view, R.id.toolbar_layout);
                        if (o00oOOo02 != null) {
                            return new o0O000o0((FrameLayout) view, appCompatButton, floatingActionButton, recyclerView, stateView, o0O0OO.bind(o00oOOo02));
                        }
                    }
                }
            }
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{-32, -89, -108, 50, 107, -114, -67, -48, -33, -85, -106, 52, 107, -110, -65, -108, -115, -72, -114, 36, 117, -64, -83, -103, -39, -90, -57, 8, 70, -38, -6}, new byte[]{-83, -50, -25, 65, 2, -32, -38, -16}).concat(view.getResources().getResourceName(i)));
    }

    @oo0oO0
    public static o0O000o0 inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0O000o0 inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_xp, viewGroup, false);
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
