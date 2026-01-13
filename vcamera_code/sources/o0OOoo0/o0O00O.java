package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0O0OoO0.o00oOo0O;
import o0OOoO0.o00oo;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o0O00O implements o00oOo00 {
    @oo0oO0
    public final Switch checkbox;
    @oo0oO0
    private final LinearLayout rootView;
    @oo0oO0
    public final TextView tvTitle;

    private o0O00O(@oo0oO0 LinearLayout linearLayout, @oo0oO0 Switch r2, @oo0oO0 TextView textView) {
        this.rootView = linearLayout;
        this.checkbox = r2;
        this.tvTitle = textView;
    }

    @oo0oO0
    public static o0O00O bind(@oo0oO0 View view) {
        int i = R.id.checkbox;
        Switch r1 = (Switch) o00oOo0O.o00oOOo0(view, R.id.checkbox);
        if (r1 != null) {
            i = R.id.tvTitle;
            TextView textView = (TextView) o00oOo0O.o00oOOo0(view, R.id.tvTitle);
            if (textView != null) {
                return new o0O00O((LinearLayout) view, r1, textView);
            }
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{-50, -75, -91, -34, -112, -109, -113, 7, -15, -71, -89, -40, -112, -113, -115, 67, -93, -86, -65, -56, -114, -35, -97, 78, -9, -76, -10, -28, -67, -57, -56}, new byte[]{-125, -36, -42, -83, -7, -3, -24, 39}).concat(view.getResources().getResourceName(i)));
    }

    @oo0oO0
    public static o0O00O inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0O00O inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_gms, viewGroup, false);
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
