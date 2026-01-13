package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.base.Ascii;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0O0OoO0.o00oOo0O;
import o0OOoO0.o00oo;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o0O00 implements o00oOo00 {
    @oo0oO0
    public final TextView emptyTxtEmpty;
    @oo0oO0
    private final LinearLayout rootView;

    private o0O00(@oo0oO0 LinearLayout linearLayout, @oo0oO0 TextView textView) {
        this.rootView = linearLayout;
        this.emptyTxtEmpty = textView;
    }

    @oo0oO0
    public static o0O00 bind(@oo0oO0 View view) {
        TextView textView = (TextView) o00oOo0O.o00oOOo0(view, R.id.empty_txt_empty);
        if (textView != null) {
            return new o0O00((LinearLayout) view, textView);
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{56, 120, 121, 98, 96, -63, -8, 80, 7, 116, 123, 100, 96, -35, -6, Ascii.DC4, 85, 103, 99, 116, 126, -113, -24, Ascii.EM, 1, 121, 42, 88, 77, -107, -65}, new byte[]{117, 17, 10, 17, 9, -81, -97, 112}).concat(view.getResources().getResourceName(R.id.empty_txt_empty)));
    }

    @oo0oO0
    public static o0O00 inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0O00 inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.base_empty, viewGroup, false);
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
