package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.common.base.Ascii;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0O0OoO0.o00oOo0O;
import o0OOoO0.o00oo;
import o0Oo0oo0.o0OO0o00;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o0OoOoOo implements o00oOo00 {
    @oo0oO0
    public final FrameLayout advBox;
    @oo0oO0
    public final AppCompatTextView autoClean;
    @oo0oO0
    public final AppCompatImageView close;
    @oo0oO0
    public final MaterialButton continueBtn;
    @oo0oO0
    public final FrameLayout mainBox;
    @oo0oO0
    public final o0O0O0O month1;
    @oo0oO0
    public final o0O0O0O month3;
    @oo0oO0
    public final o0O0O0O month6;
    @oo0oO0
    public final AppCompatTextView noAdTv;
    @oo0oO0
    public final AppCompatTextView photoHide;
    @oo0oO0
    public final TextView premText;
    @oo0oO0
    public final TextView privacy;
    @oo0oO0
    public final LinearLayoutCompat privacyBox;
    @oo0oO0
    public final ProgressBar progressBar;
    @oo0oO0
    private final ConstraintLayout rootView;
    @oo0oO0
    public final TextView terms;
    @oo0oO0
    public final o0O0O0O year1;

    private o0OoOoOo(@oo0oO0 ConstraintLayout constraintLayout, @oo0oO0 FrameLayout frameLayout, @oo0oO0 AppCompatTextView appCompatTextView, @oo0oO0 AppCompatImageView appCompatImageView, @oo0oO0 MaterialButton materialButton, @oo0oO0 FrameLayout frameLayout2, @oo0oO0 o0O0O0O o0o0o0o, @oo0oO0 o0O0O0O o0o0o0o2, @oo0oO0 o0O0O0O o0o0o0o3, @oo0oO0 AppCompatTextView appCompatTextView2, @oo0oO0 AppCompatTextView appCompatTextView3, @oo0oO0 TextView textView, @oo0oO0 TextView textView2, @oo0oO0 LinearLayoutCompat linearLayoutCompat, @oo0oO0 ProgressBar progressBar, @oo0oO0 TextView textView3, @oo0oO0 o0O0O0O o0o0o0o4) {
        this.rootView = constraintLayout;
        this.advBox = frameLayout;
        this.autoClean = appCompatTextView;
        this.close = appCompatImageView;
        this.continueBtn = materialButton;
        this.mainBox = frameLayout2;
        this.month1 = o0o0o0o;
        this.month3 = o0o0o0o2;
        this.month6 = o0o0o0o3;
        this.noAdTv = appCompatTextView2;
        this.photoHide = appCompatTextView3;
        this.premText = textView;
        this.privacy = textView2;
        this.privacyBox = linearLayoutCompat;
        this.progressBar = progressBar;
        this.terms = textView3;
        this.year1 = o0o0o0o4;
    }

    @oo0oO0
    public static o0OoOoOo bind(@oo0oO0 View view) {
        int i = R.id.advBox;
        FrameLayout frameLayout = (FrameLayout) o00oOo0O.o00oOOo0(view, R.id.advBox);
        if (frameLayout != null) {
            i = R.id.autoClean;
            AppCompatTextView appCompatTextView = (AppCompatTextView) o00oOo0O.o00oOOo0(view, R.id.autoClean);
            if (appCompatTextView != null) {
                i = R.id.close;
                AppCompatImageView appCompatImageView = (AppCompatImageView) o00oOo0O.o00oOOo0(view, R.id.close);
                if (appCompatImageView != null) {
                    i = R.id.continueBtn;
                    MaterialButton materialButton = (MaterialButton) o00oOo0O.o00oOOo0(view, R.id.continueBtn);
                    if (materialButton != null) {
                        i = R.id.mainBox;
                        FrameLayout frameLayout2 = (FrameLayout) o00oOo0O.o00oOOo0(view, R.id.mainBox);
                        if (frameLayout2 != null) {
                            i = R.id.month1;
                            View o00oOOo02 = o00oOo0O.o00oOOo0(view, R.id.month1);
                            if (o00oOOo02 != null) {
                                o0O0O0O bind = o0O0O0O.bind(o00oOOo02);
                                i = R.id.month3;
                                View o00oOOo03 = o00oOo0O.o00oOOo0(view, R.id.month3);
                                if (o00oOOo03 != null) {
                                    o0O0O0O bind2 = o0O0O0O.bind(o00oOOo03);
                                    i = R.id.month6;
                                    View o00oOOo04 = o00oOo0O.o00oOOo0(view, R.id.month6);
                                    if (o00oOOo04 != null) {
                                        o0O0O0O bind3 = o0O0O0O.bind(o00oOOo04);
                                        i = R.id.noAdTv;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) o00oOo0O.o00oOOo0(view, R.id.noAdTv);
                                        if (appCompatTextView2 != null) {
                                            i = R.id.photoHide;
                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) o00oOo0O.o00oOOo0(view, R.id.photoHide);
                                            if (appCompatTextView3 != null) {
                                                i = R.id.premText;
                                                TextView textView = (TextView) o00oOo0O.o00oOOo0(view, R.id.premText);
                                                if (textView != null) {
                                                    i = R.id.privacy;
                                                    TextView textView2 = (TextView) o00oOo0O.o00oOOo0(view, R.id.privacy);
                                                    if (textView2 != null) {
                                                        i = R.id.privacyBox;
                                                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) o00oOo0O.o00oOOo0(view, R.id.privacyBox);
                                                        if (linearLayoutCompat != null) {
                                                            i = R.id.progressBar;
                                                            ProgressBar progressBar = (ProgressBar) o00oOo0O.o00oOOo0(view, R.id.progressBar);
                                                            if (progressBar != null) {
                                                                i = R.id.terms;
                                                                TextView textView3 = (TextView) o00oOo0O.o00oOOo0(view, R.id.terms);
                                                                if (textView3 != null) {
                                                                    i = R.id.year1;
                                                                    View o00oOOo05 = o00oOo0O.o00oOOo0(view, R.id.year1);
                                                                    if (o00oOOo05 != null) {
                                                                        return new o0OoOoOo((ConstraintLayout) view, frameLayout, appCompatTextView, appCompatImageView, materialButton, frameLayout2, bind, bind2, bind3, appCompatTextView2, appCompatTextView3, textView, textView2, linearLayoutCompat, progressBar, textView3, o0O0O0O.bind(o00oOOo05));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{Ascii.FS, -1, 73, 108, o0OO0o00.f16655o00oOoOO, 3, -41, -59, 35, -13, 75, 106, o0OO0o00.f16655o00oOoOO, Ascii.US, -43, -127, 113, -32, 83, 122, 63, 77, -57, -116, 37, -2, Ascii.SUB, 86, Ascii.FF, 87, -112}, new byte[]{81, -106, 58, Ascii.US, 72, 109, -80, -27}).concat(view.getResources().getResourceName(i)));
    }

    @oo0oO0
    public static o0OoOoOo inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0OoOoOo inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_pay, viewGroup, false);
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
