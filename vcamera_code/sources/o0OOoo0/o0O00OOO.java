package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.base.Ascii;
import com.othershe.cornerlabelview.CornerLabelView;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0O0OoO0.o00oOo0O;
import o0OOoO0.o00oo;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o0O00OOO implements o00oOo00 {
    @oo0oO0
    public final CornerLabelView cornerLabel;
    @oo0oO0
    public final ImageView icon;
    @oo0oO0
    public final TextView name;
    @oo0oO0
    public final TextView packageName;
    @oo0oO0
    private final LinearLayout rootView;

    private o0O00OOO(@oo0oO0 LinearLayout linearLayout, @oo0oO0 CornerLabelView cornerLabelView, @oo0oO0 ImageView imageView, @oo0oO0 TextView textView, @oo0oO0 TextView textView2) {
        this.rootView = linearLayout;
        this.cornerLabel = cornerLabelView;
        this.icon = imageView;
        this.name = textView;
        this.packageName = textView2;
    }

    @oo0oO0
    public static o0O00OOO bind(@oo0oO0 View view) {
        int i = R.id.cornerLabel;
        CornerLabelView cornerLabelView = (CornerLabelView) o00oOo0O.o00oOOo0(view, R.id.cornerLabel);
        if (cornerLabelView != null) {
            i = R.id.icon;
            ImageView imageView = (ImageView) o00oOo0O.o00oOOo0(view, R.id.icon);
            if (imageView != null) {
                i = R.id.name;
                TextView textView = (TextView) o00oOo0O.o00oOOo0(view, R.id.name);
                if (textView != null) {
                    i = R.id.packageName;
                    TextView textView2 = (TextView) o00oOo0O.o00oOOo0(view, R.id.packageName);
                    if (textView2 != null) {
                        return new o0O00OOO((LinearLayout) view, cornerLabelView, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{-6, 83, -58, 0, -43, 85, 110, -26, -59, 95, -60, 6, -43, 73, 108, -94, -105, 76, -36, Ascii.SYN, -53, Ascii.ESC, 126, -81, -61, 82, -107, 58, -8, 1, 41}, new byte[]{-73, 58, -75, 115, -68, 59, 9, -58}).concat(view.getResources().getResourceName(i)));
    }

    @oo0oO0
    public static o0O00OOO inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0O00OOO inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_package, viewGroup, false);
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
