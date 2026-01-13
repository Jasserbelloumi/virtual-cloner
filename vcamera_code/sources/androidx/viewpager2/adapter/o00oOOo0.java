package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import o00oOooO.oo0oO0;
import o0O000oo.o0O0o00O;
/* loaded from: classes.dex */
public final class o00oOOo0 extends RecyclerView.o0O00oO0 {
    public o00oOOo0(@oo0oO0 FrameLayout frameLayout) {
        super(frameLayout);
    }

    @oo0oO0
    public static o00oOOo0 o00oOOo0(@oo0oO0 ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(o0O0o00O.o00ooOO());
        frameLayout.setSaveEnabled(false);
        return new o00oOOo0(frameLayout);
    }

    @oo0oO0
    public FrameLayout o00oOOoO() {
        return (FrameLayout) this.itemView;
    }
}
