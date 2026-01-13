package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.google.common.base.Ascii;
import com.skyfishjy.library.RippleBackground;
import multispace.multiapp.clone.view.pro.location.map.utils.CustomButton;
import multispace.multiapp.clone.view.pro.location.map.utils.CustomTextView;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0O0OoO0.o00oOo0O;
import o0OOoO0.o00oo;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o0O00oO0 implements o00oOo00 {
    @oo0oO0
    public final ImageView icPin;
    @oo0oO0
    public final ProgressBar progressBar;
    @oo0oO0
    public final RippleBackground rippleBg;
    @oo0oO0
    private final RelativeLayout rootView;
    @oo0oO0
    public final ImageView smallPin;
    @oo0oO0
    public final CustomButton submitLocationButton;
    @oo0oO0
    public final CustomTextView tvDisplayMarkerLocation;

    private o0O00oO0(@oo0oO0 RelativeLayout relativeLayout, @oo0oO0 ImageView imageView, @oo0oO0 ProgressBar progressBar, @oo0oO0 RippleBackground rippleBackground, @oo0oO0 ImageView imageView2, @oo0oO0 CustomButton customButton, @oo0oO0 CustomTextView customTextView) {
        this.rootView = relativeLayout;
        this.icPin = imageView;
        this.progressBar = progressBar;
        this.rippleBg = rippleBackground;
        this.smallPin = imageView2;
        this.submitLocationButton = customButton;
        this.tvDisplayMarkerLocation = customTextView;
    }

    @oo0oO0
    public static o0O00oO0 bind(@oo0oO0 View view) {
        int i = R.id.ic_pin;
        ImageView imageView = (ImageView) o00oOo0O.o00oOOo0(view, R.id.ic_pin);
        if (imageView != null) {
            i = R.id.progress_bar;
            ProgressBar progressBar = (ProgressBar) o00oOo0O.o00oOOo0(view, R.id.progress_bar);
            if (progressBar != null) {
                i = R.id.ripple_bg;
                RippleBackground rippleBackground = (RippleBackground) o00oOo0O.o00oOOo0(view, R.id.ripple_bg);
                if (rippleBackground != null) {
                    i = R.id.small_pin;
                    ImageView imageView2 = (ImageView) o00oOo0O.o00oOOo0(view, R.id.small_pin);
                    if (imageView2 != null) {
                        i = R.id.submit_location_button;
                        CustomButton customButton = (CustomButton) o00oOo0O.o00oOOo0(view, R.id.submit_location_button);
                        if (customButton != null) {
                            i = R.id.tv_display_marker_location;
                            CustomTextView customTextView = (CustomTextView) o00oOo0O.o00oOOo0(view, R.id.tv_display_marker_location);
                            if (customTextView != null) {
                                return new o0O00oO0((RelativeLayout) view, imageView, progressBar, rippleBackground, imageView2, customButton, customTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{-53, -48, 62, 35, -7, -70, -52, 105, -12, -36, 60, 37, -7, -90, -50, 45, -90, -49, 36, 53, -25, -12, -36, 32, -14, -47, 109, Ascii.EM, -44, -18, -117}, new byte[]{-122, -71, 77, 80, -112, -44, -85, 73}).concat(view.getResources().getResourceName(i)));
    }

    @oo0oO0
    public static o0O00oO0 inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0O00oO0 inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.map_content_main, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // o0O0OoO0.o00oOo00
    @oo0oO0
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
