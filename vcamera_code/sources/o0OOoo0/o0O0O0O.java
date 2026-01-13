package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.common.base.Ascii;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0O0OoO0.o00oOo0O;
import o0OOoO0.o00oo;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o0O0O0O implements o00oOo00 {
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

    private o0O0O0O(@oo0oO0 FrameLayout frameLayout, @oo0oO0 AppCompatImageView appCompatImageView, @oo0oO0 AppCompatTextView appCompatTextView, @oo0oO0 AppCompatTextView appCompatTextView2, @oo0oO0 AppCompatTextView appCompatTextView3) {
        this.rootView = frameLayout;
        this.check = appCompatImageView;
        this.perInfoTV = appCompatTextView;
        this.perTV = appCompatTextView2;
        this.price = appCompatTextView3;
    }

    @oo0oO0
    public static o0O0O0O bind(@oo0oO0 View view) {
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
                        return new o0O0O0O((FrameLayout) view, appCompatImageView, appCompatTextView, appCompatTextView2, appCompatTextView3);
                    }
                }
            }
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{-98, 48, -1, 125, -112, 39, -5, -7, -95, 60, -3, 123, -112, 59, -7, -67, -13, 47, -27, 107, -114, 105, -21, -80, -89, 49, -84, 71, -67, 115, -68}, new byte[]{-45, 89, -116, Ascii.SO, -7, 73, -100, -39}).concat(view.getResources().getResourceName(i)));
    }

    @oo0oO0
    public static o0O0O0O inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0O0O0O inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.period_pw_2, viewGroup, false);
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
