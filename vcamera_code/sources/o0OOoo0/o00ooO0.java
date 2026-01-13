package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.common.base.Ascii;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0O0OoO0.o00oOo0O;
import o0OOoO0.o00oo;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o00ooO0 implements o00oOo00 {
    @oo0oO0
    public final LinearLayoutCompat aboutContainer;
    @oo0oO0
    public final TextView privacyAndTerms;
    @oo0oO0
    private final ConstraintLayout rootView;
    @oo0oO0
    public final Toolbar toolbar;
    @oo0oO0
    public final MaterialButton updateBtn;
    @oo0oO0
    public final LinearLayoutCompat updateContainer;
    @oo0oO0
    public final TextView updateDetails;
    @oo0oO0
    public final TextView updateTitle;
    @oo0oO0
    public final TextView version;

    private o00ooO0(@oo0oO0 ConstraintLayout constraintLayout, @oo0oO0 LinearLayoutCompat linearLayoutCompat, @oo0oO0 TextView textView, @oo0oO0 Toolbar toolbar, @oo0oO0 MaterialButton materialButton, @oo0oO0 LinearLayoutCompat linearLayoutCompat2, @oo0oO0 TextView textView2, @oo0oO0 TextView textView3, @oo0oO0 TextView textView4) {
        this.rootView = constraintLayout;
        this.aboutContainer = linearLayoutCompat;
        this.privacyAndTerms = textView;
        this.toolbar = toolbar;
        this.updateBtn = materialButton;
        this.updateContainer = linearLayoutCompat2;
        this.updateDetails = textView2;
        this.updateTitle = textView3;
        this.version = textView4;
    }

    @oo0oO0
    public static o00ooO0 bind(@oo0oO0 View view) {
        int i = R.id.about_container;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) o00oOo0O.o00oOOo0(view, R.id.about_container);
        if (linearLayoutCompat != null) {
            i = R.id.privacyAndTerms;
            TextView textView = (TextView) o00oOo0O.o00oOOo0(view, R.id.privacyAndTerms);
            if (textView != null) {
                i = R.id.toolbar;
                Toolbar toolbar = (Toolbar) o00oOo0O.o00oOOo0(view, R.id.toolbar);
                if (toolbar != null) {
                    i = R.id.update_btn;
                    MaterialButton materialButton = (MaterialButton) o00oOo0O.o00oOOo0(view, R.id.update_btn);
                    if (materialButton != null) {
                        i = R.id.update_container;
                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) o00oOo0O.o00oOOo0(view, R.id.update_container);
                        if (linearLayoutCompat2 != null) {
                            i = R.id.update_details;
                            TextView textView2 = (TextView) o00oOo0O.o00oOOo0(view, R.id.update_details);
                            if (textView2 != null) {
                                i = R.id.update_title;
                                TextView textView3 = (TextView) o00oOo0O.o00oOOo0(view, R.id.update_title);
                                if (textView3 != null) {
                                    i = R.id.version;
                                    TextView textView4 = (TextView) o00oOo0O.o00oOOo0(view, R.id.version);
                                    if (textView4 != null) {
                                        return new o00ooO0((ConstraintLayout) view, linearLayoutCompat, textView, toolbar, materialButton, linearLayoutCompat2, textView2, textView3, textView4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{118, -111, -122, -89, -51, -62, -88, -82, 73, -99, -124, -95, -51, -34, -86, -22, Ascii.ESC, -114, -100, -79, -45, -116, -72, -25, 79, -112, -43, -99, -32, -106, -17}, new byte[]{59, -8, -11, -44, -92, -84, -49, -114}).concat(view.getResources().getResourceName(i)));
    }

    @oo0oO0
    public static o00ooO0 inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o00ooO0 inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_about, viewGroup, false);
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
