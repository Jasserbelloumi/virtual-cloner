package o0OO0o00;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.skydoves.powerspinner.R;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public final class o00oOOo0 implements o0O0OoO0.o00oOo00 {
    @oo0oO0
    public final AppCompatTextView itemDefaultText;
    @oo0oO0
    private final AppCompatTextView rootView;

    private o00oOOo0(@oo0oO0 AppCompatTextView appCompatTextView, @oo0oO0 AppCompatTextView appCompatTextView2) {
        this.rootView = appCompatTextView;
        this.itemDefaultText = appCompatTextView2;
    }

    @oo0oO0
    public static o00oOOo0 bind(@oo0oO0 View view) {
        if (view != null) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) view;
            return new o00oOOo0(appCompatTextView, appCompatTextView);
        }
        throw new NullPointerException("rootView");
    }

    @oo0oO0
    public static o00oOOo0 inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o00oOOo0 inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.powerspinner_item_default_power, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // o0O0OoO0.o00oOo00
    @oo0oO0
    public AppCompatTextView getRoot() {
        return this.rootView;
    }
}
