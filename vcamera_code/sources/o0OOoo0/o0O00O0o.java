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
public final class o0O00O0o implements o00oOo00 {
    @oo0oO0
    public final CornerLabelView cornerLabel;
    @oo0oO0
    public final TextView fakeLocation;
    @oo0oO0
    public final ImageView icon;
    @oo0oO0
    public final TextView name;
    @oo0oO0
    private final LinearLayout rootView;

    private o0O00O0o(@oo0oO0 LinearLayout linearLayout, @oo0oO0 CornerLabelView cornerLabelView, @oo0oO0 TextView textView, @oo0oO0 ImageView imageView, @oo0oO0 TextView textView2) {
        this.rootView = linearLayout;
        this.cornerLabel = cornerLabelView;
        this.fakeLocation = textView;
        this.icon = imageView;
        this.name = textView2;
    }

    @oo0oO0
    public static o0O00O0o bind(@oo0oO0 View view) {
        int i = R.id.cornerLabel;
        CornerLabelView cornerLabelView = (CornerLabelView) o00oOo0O.o00oOOo0(view, R.id.cornerLabel);
        if (cornerLabelView != null) {
            i = R.id.fakeLocation;
            TextView textView = (TextView) o00oOo0O.o00oOOo0(view, R.id.fakeLocation);
            if (textView != null) {
                i = R.id.icon;
                ImageView imageView = (ImageView) o00oOo0O.o00oOOo0(view, R.id.icon);
                if (imageView != null) {
                    i = R.id.name;
                    TextView textView2 = (TextView) o00oOo0O.o00oOOo0(view, R.id.name);
                    if (textView2 != null) {
                        return new o0O00O0o((LinearLayout) view, cornerLabelView, textView, imageView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{66, 109, 53, -115, -62, 84, 10, Ascii.SO, 125, 97, 55, -117, -62, 72, 8, 74, 47, 114, 47, -101, -36, Ascii.SUB, Ascii.SUB, 71, 123, 108, 102, -73, -17, 0, 77}, new byte[]{Ascii.SI, 4, 70, -2, -85, 58, 109, 46}).concat(view.getResources().getResourceName(i)));
    }

    @oo0oO0
    public static o0O00O0o inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0O00O0o inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_fake, viewGroup, false);
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
