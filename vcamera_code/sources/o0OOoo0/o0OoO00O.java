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
public final class o0OoO00O implements o00oOo00 {
    @oo0oO0
    public final CornerLabelView cornerLabel;
    @oo0oO0
    public final ImageView icon;
    @oo0oO0
    public final TextView name;
    @oo0oO0
    private final LinearLayout rootView;

    private o0OoO00O(@oo0oO0 LinearLayout linearLayout, @oo0oO0 CornerLabelView cornerLabelView, @oo0oO0 ImageView imageView, @oo0oO0 TextView textView) {
        this.rootView = linearLayout;
        this.cornerLabel = cornerLabelView;
        this.icon = imageView;
        this.name = textView;
    }

    @oo0oO0
    public static o0OoO00O bind(@oo0oO0 View view) {
        int i = R.id.cornerLabel;
        CornerLabelView cornerLabelView = (CornerLabelView) o00oOo0O.o00oOOo0(view, R.id.cornerLabel);
        if (cornerLabelView != null) {
            i = R.id.icon;
            ImageView imageView = (ImageView) o00oOo0O.o00oOOo0(view, R.id.icon);
            if (imageView != null) {
                i = R.id.name;
                TextView textView = (TextView) o00oOo0O.o00oOOo0(view, R.id.name);
                if (textView != null) {
                    return new o0OoO00O((LinearLayout) view, cornerLabelView, imageView, textView);
                }
            }
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{-52, 2, -83, 5, -100, 119, 82, -117, -13, Ascii.SO, -81, 3, -100, 107, 80, -49, -95, Ascii.GS, -73, 19, -126, 57, 66, -62, -11, 3, -2, 63, -79, 35, Ascii.NAK}, new byte[]{-127, 107, -34, 118, -11, Ascii.EM, 53, -85}).concat(view.getResources().getResourceName(i)));
    }

    @oo0oO0
    public static o0OoO00O inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0OoO00O inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_app, viewGroup, false);
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
