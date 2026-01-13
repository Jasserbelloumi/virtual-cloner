package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.common.base.Ascii;
import com.willy.ratingbar.BaseRatingBar;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0O0OoO0.o00oOo0O;
import o0OOoO0.o00oo;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o0O0oo0o implements o00oOo00 {
    @oo0oO0
    public final TextView btnExit;
    @oo0oO0
    public final MaterialButton btnRate;
    @oo0oO0
    public final ImageView imageSmile;
    @oo0oO0
    public final BaseRatingBar ratingBar;
    @oo0oO0
    private final LinearLayout rootView;

    private o0O0oo0o(@oo0oO0 LinearLayout linearLayout, @oo0oO0 TextView textView, @oo0oO0 MaterialButton materialButton, @oo0oO0 ImageView imageView, @oo0oO0 BaseRatingBar baseRatingBar) {
        this.rootView = linearLayout;
        this.btnExit = textView;
        this.btnRate = materialButton;
        this.imageSmile = imageView;
        this.ratingBar = baseRatingBar;
    }

    @oo0oO0
    public static o0O0oo0o bind(@oo0oO0 View view) {
        int i = R.id.btn_exit;
        TextView textView = (TextView) o00oOo0O.o00oOOo0(view, R.id.btn_exit);
        if (textView != null) {
            i = R.id.btn_rate;
            MaterialButton materialButton = (MaterialButton) o00oOo0O.o00oOOo0(view, R.id.btn_rate);
            if (materialButton != null) {
                i = R.id.image_smile;
                ImageView imageView = (ImageView) o00oOo0O.o00oOOo0(view, R.id.image_smile);
                if (imageView != null) {
                    i = R.id.rating_bar;
                    BaseRatingBar baseRatingBar = (BaseRatingBar) o00oOo0O.o00oOOo0(view, R.id.rating_bar);
                    if (baseRatingBar != null) {
                        return new o0O0oo0o((LinearLayout) view, textView, materialButton, imageView, baseRatingBar);
                    }
                }
            }
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{89, -63, -23, 83, 46, 48, Ascii.CAN, -79, 102, -51, -21, 85, 46, 44, Ascii.SUB, -11, 52, -34, -13, 69, 48, 126, 8, -8, 96, -64, -70, 105, 3, 100, 95}, new byte[]{Ascii.DC4, -88, -102, 32, 71, 94, Byte.MAX_VALUE, -111}).concat(view.getResources().getResourceName(i)));
    }

    @oo0oO0
    public static o0O0oo0o inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0O0oo0o inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.rate_layout, viewGroup, false);
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
