package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.base.Ascii;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0O0OoO0.o00oOo0O;
import o0OOoO0.o00oo;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o0O00o00 implements o00oOo00 {
    @oo0oO0
    public final TextView desc;
    @oo0oO0
    public final CheckBox enable;
    @oo0oO0
    public final Button enableBtc;
    @oo0oO0
    public final ImageView icon;
    @oo0oO0
    public final TextView name;
    @oo0oO0
    private final ConstraintLayout rootView;
    @oo0oO0
    public final LinearLayout textLayout;

    private o0O00o00(@oo0oO0 ConstraintLayout constraintLayout, @oo0oO0 TextView textView, @oo0oO0 CheckBox checkBox, @oo0oO0 Button button, @oo0oO0 ImageView imageView, @oo0oO0 TextView textView2, @oo0oO0 LinearLayout linearLayout) {
        this.rootView = constraintLayout;
        this.desc = textView;
        this.enable = checkBox;
        this.enableBtc = button;
        this.icon = imageView;
        this.name = textView2;
        this.textLayout = linearLayout;
    }

    @oo0oO0
    public static o0O00o00 bind(@oo0oO0 View view) {
        int i = R.id.desc;
        TextView textView = (TextView) o00oOo0O.o00oOOo0(view, R.id.desc);
        if (textView != null) {
            i = R.id.enable;
            CheckBox checkBox = (CheckBox) o00oOo0O.o00oOOo0(view, R.id.enable);
            if (checkBox != null) {
                i = R.id.enable_btc;
                Button button = (Button) o00oOo0O.o00oOOo0(view, R.id.enable_btc);
                if (button != null) {
                    i = R.id.icon;
                    ImageView imageView = (ImageView) o00oOo0O.o00oOOo0(view, R.id.icon);
                    if (imageView != null) {
                        i = R.id.name;
                        TextView textView2 = (TextView) o00oOo0O.o00oOOo0(view, R.id.name);
                        if (textView2 != null) {
                            i = R.id.text_layout;
                            LinearLayout linearLayout = (LinearLayout) o00oOo0O.o00oOOo0(view, R.id.text_layout);
                            if (linearLayout != null) {
                                return new o0O00o00((ConstraintLayout) view, textView, checkBox, button, imageView, textView2, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{62, -53, -99, 63, 69, -83, 115, -62, 1, -57, -97, 57, 69, -79, 113, -122, 83, -44, -121, 41, 91, -29, 99, -117, 7, -54, -50, 5, 104, -7, 52}, new byte[]{115, -94, -18, 76, 44, -61, Ascii.DC4, -30}).concat(view.getResources().getResourceName(i)));
    }

    @oo0oO0
    public static o0O00o00 inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0O00o00 inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_xp, viewGroup, false);
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
