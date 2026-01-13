package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0O0OoO0.o00oOo0O;
import o0OOoO0.o00oo;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o0oO0O0o implements o00oOo00 {
    @oo0oO0
    public final AppCompatImageView check;
    @oo0oO0
    public final AppCompatTextView perInfoTV;
    @oo0oO0
    public final AppCompatTextView perTV;
    @oo0oO0
    public final AppCompatTextView price;
    @oo0oO0
    private final FrameLayout rootView;

    private o0oO0O0o(@oo0oO0 FrameLayout frameLayout, @oo0oO0 AppCompatImageView appCompatImageView, @oo0oO0 AppCompatTextView appCompatTextView, @oo0oO0 AppCompatTextView appCompatTextView2, @oo0oO0 AppCompatTextView appCompatTextView3) {
        this.rootView = frameLayout;
        this.check = appCompatImageView;
        this.perInfoTV = appCompatTextView;
        this.perTV = appCompatTextView2;
        this.price = appCompatTextView3;
    }

    @oo0oO0
    public static o0oO0O0o bind(@oo0oO0 View view) {
        int i = R.id.check;
        AppCompatImageView appCompatImageView = (AppCompatImageView) o00oOo0O.o00oOOo0(view, R.id.check);
        if (appCompatImageView != null) {
            i = R.id.perInfoTV;
            AppCompatTextView appCompatTextView = (AppCompatTextView) o00oOo0O.o00oOOo0(view, R.id.perInfoTV);
            if (appCompatTextView != null) {
                i = R.id.perTV;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) o00oOo0O.o00oOOo0(view, R.id.perTV);
                if (appCompatTextView2 != null) {
                    i = R.id.price;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) o00oOo0O.o00oOOo0(view, R.id.price);
                    if (appCompatTextView3 != null) {
                        return new o0oO0O0o((FrameLayout) view, appCompatImageView, appCompatTextView, appCompatTextView2, appCompatTextView3);
                    }
                }
            }
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{43, -32, 124, -59, Ascii.DC4, 40, 80, 47, Ascii.DC4, -20, 126, -61, Ascii.DC4, 52, 82, 107, 70, -1, 102, -45, 10, 102, SignedBytes.MAX_POWER_OF_TWO, 102, Ascii.DC2, -31, 47, -1, 57, 124, Ascii.ETB}, new byte[]{102, -119, Ascii.SI, -74, 125, 70, 55, Ascii.SI}).concat(view.getResources().getResourceName(i)));
    }

    @oo0oO0
    public static o0oO0O0o inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0oO0O0o inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.period_pw, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // o0O0OoO0.o00oOo00
    @oo0oO0
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
