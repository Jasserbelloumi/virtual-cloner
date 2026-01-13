package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.base.Ascii;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0O0OoO0.o00oOo0O;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import o0Oo0oo0.o0OO0o00;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o0O00OO implements o00oOo00 {
    @oo0oO0
    public final ImageButton btnDelete;
    @oo0oO0
    public final TextView desc;
    @oo0oO0
    public final ImageView icon;
    @oo0oO0
    public final TextView name;
    @oo0oO0
    private final ConstraintLayout rootView;
    @oo0oO0
    public final LinearLayout textLayout;

    private o0O00OO(@oo0oO0 ConstraintLayout constraintLayout, @oo0oO0 ImageButton imageButton, @oo0oO0 TextView textView, @oo0oO0 ImageView imageView, @oo0oO0 TextView textView2, @oo0oO0 LinearLayout linearLayout) {
        this.rootView = constraintLayout;
        this.btnDelete = imageButton;
        this.desc = textView;
        this.icon = imageView;
        this.name = textView2;
        this.textLayout = linearLayout;
    }

    @oo0oO0
    public static o0O00OO bind(@oo0oO0 View view) {
        int i = R.id.btn_delete;
        ImageButton imageButton = (ImageButton) o00oOo0O.o00oOOo0(view, R.id.btn_delete);
        if (imageButton != null) {
            i = R.id.desc;
            TextView textView = (TextView) o00oOo0O.o00oOOo0(view, R.id.desc);
            if (textView != null) {
                i = R.id.icon;
                ImageView imageView = (ImageView) o00oOo0O.o00oOOo0(view, R.id.icon);
                if (imageView != null) {
                    i = R.id.name;
                    TextView textView2 = (TextView) o00oOo0O.o00oOOo0(view, R.id.name);
                    if (textView2 != null) {
                        i = R.id.text_layout;
                        LinearLayout linearLayout = (LinearLayout) o00oOo0O.o00oOOo0(view, R.id.text_layout);
                        if (linearLayout != null) {
                            return new o0O00OO((ConstraintLayout) view, imageButton, textView, imageView, textView2, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{Ascii.US, Ascii.SI, -68, 39, Ascii.US, 89, -29, 116, 32, 3, -66, o0OO0o00.f16655o00oOoOO, Ascii.US, 69, -31, 48, 114, Ascii.DLE, -90, 49, 1, Ascii.ETB, -13, oo0OOoo.f13516o00oOoO, 38, Ascii.SO, -17, Ascii.GS, 50, Ascii.CR, -92}, new byte[]{82, 102, -49, 84, 118, 55, -124, 84}).concat(view.getResources().getResourceName(i)));
    }

    @oo0oO0
    public static o0O00OO inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0O00OO inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_gps, viewGroup, false);
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
