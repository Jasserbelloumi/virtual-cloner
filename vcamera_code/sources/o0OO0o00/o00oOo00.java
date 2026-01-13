package o0OO0o00;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.skydoves.powerspinner.R;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo0O;
/* loaded from: classes2.dex */
public final class o00oOo00 implements o0O0OoO0.o00oOo00 {
    @oo0oO0
    public final LinearLayout powerSpinnerPreference;
    @oo0oO0
    public final AppCompatTextView preferenceTitle;
    @oo0oO0
    private final LinearLayout rootView;

    private o00oOo00(@oo0oO0 LinearLayout linearLayout, @oo0oO0 LinearLayout linearLayout2, @oo0oO0 AppCompatTextView appCompatTextView) {
        this.rootView = linearLayout;
        this.powerSpinnerPreference = linearLayout2;
        this.preferenceTitle = appCompatTextView;
    }

    @oo0oO0
    public static o00oOo00 bind(@oo0oO0 View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.preference_title;
        AppCompatTextView appCompatTextView = (AppCompatTextView) o00oOo0O.o00oOOo0(view, i);
        if (appCompatTextView != null) {
            return new o00oOo00(linearLayout, linearLayout, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @oo0oO0
    public static o00oOo00 inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o00oOo00 inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.powerspinner_layout_preference, viewGroup, false);
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
