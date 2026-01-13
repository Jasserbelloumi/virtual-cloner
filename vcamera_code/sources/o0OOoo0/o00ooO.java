package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ZoomControls;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.base.Ascii;
import com.skydoves.powerspinner.PowerSpinnerView;
import multispace.multiapp.clone.widget.RoundMenuView;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0O0OoO0.o00oOo0O;
import o0OOoO0.o00oo;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o00ooO implements o00oOo00 {
    @oo0oO0
    public final View bottomView;
    @oo0oO0
    public final PowerSpinnerView channelsSelect;
    @oo0oO0
    public final PowerSpinnerView flipSettings;
    @oo0oO0
    public final AppCompatTextView flipTxt;
    @oo0oO0
    public final RoundMenuView moveMenu;
    @oo0oO0
    public final AppCompatTextView moveTxt;
    @oo0oO0
    private final ConstraintLayout rootView;
    @oo0oO0
    public final AppCompatImageView rotateBtn;
    @oo0oO0
    public final AppCompatTextView rotateTxt;
    @oo0oO0
    public final AppCompatImageView screenRotateBtn;
    @oo0oO0
    public final AppCompatTextView screenRotateTxt;
    @oo0oO0
    public final ConstraintLayout settings;
    @oo0oO0
    public final ZoomControls sizeSeekbar;
    @oo0oO0
    public final AppCompatTextView sizeTxt;
    @oo0oO0
    public final ZoomControls zoomSeekbar;
    @oo0oO0
    public final AppCompatTextView zoomTxt;

    private o00ooO(@oo0oO0 ConstraintLayout constraintLayout, @oo0oO0 View view, @oo0oO0 PowerSpinnerView powerSpinnerView, @oo0oO0 PowerSpinnerView powerSpinnerView2, @oo0oO0 AppCompatTextView appCompatTextView, @oo0oO0 RoundMenuView roundMenuView, @oo0oO0 AppCompatTextView appCompatTextView2, @oo0oO0 AppCompatImageView appCompatImageView, @oo0oO0 AppCompatTextView appCompatTextView3, @oo0oO0 AppCompatImageView appCompatImageView2, @oo0oO0 AppCompatTextView appCompatTextView4, @oo0oO0 ConstraintLayout constraintLayout2, @oo0oO0 ZoomControls zoomControls, @oo0oO0 AppCompatTextView appCompatTextView5, @oo0oO0 ZoomControls zoomControls2, @oo0oO0 AppCompatTextView appCompatTextView6) {
        this.rootView = constraintLayout;
        this.bottomView = view;
        this.channelsSelect = powerSpinnerView;
        this.flipSettings = powerSpinnerView2;
        this.flipTxt = appCompatTextView;
        this.moveMenu = roundMenuView;
        this.moveTxt = appCompatTextView2;
        this.rotateBtn = appCompatImageView;
        this.rotateTxt = appCompatTextView3;
        this.screenRotateBtn = appCompatImageView2;
        this.screenRotateTxt = appCompatTextView4;
        this.settings = constraintLayout2;
        this.sizeSeekbar = zoomControls;
        this.sizeTxt = appCompatTextView5;
        this.zoomSeekbar = zoomControls2;
        this.zoomTxt = appCompatTextView6;
    }

    @oo0oO0
    public static o00ooO bind(@oo0oO0 View view) {
        int i = R.id.bottom_view;
        View o00oOOo02 = o00oOo0O.o00oOOo0(view, R.id.bottom_view);
        if (o00oOOo02 != null) {
            i = R.id.channels_select;
            PowerSpinnerView powerSpinnerView = (PowerSpinnerView) o00oOo0O.o00oOOo0(view, R.id.channels_select);
            if (powerSpinnerView != null) {
                i = R.id.flip_settings;
                PowerSpinnerView powerSpinnerView2 = (PowerSpinnerView) o00oOo0O.o00oOOo0(view, R.id.flip_settings);
                if (powerSpinnerView2 != null) {
                    i = R.id.flip_txt;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) o00oOo0O.o00oOOo0(view, R.id.flip_txt);
                    if (appCompatTextView != null) {
                        i = R.id.move_menu;
                        RoundMenuView roundMenuView = (RoundMenuView) o00oOo0O.o00oOOo0(view, R.id.move_menu);
                        if (roundMenuView != null) {
                            i = R.id.move_txt;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) o00oOo0O.o00oOOo0(view, R.id.move_txt);
                            if (appCompatTextView2 != null) {
                                i = R.id.rotate_btn;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) o00oOo0O.o00oOOo0(view, R.id.rotate_btn);
                                if (appCompatImageView != null) {
                                    i = R.id.rotate_txt;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) o00oOo0O.o00oOOo0(view, R.id.rotate_txt);
                                    if (appCompatTextView3 != null) {
                                        i = R.id.screen_rotate_btn;
                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) o00oOo0O.o00oOOo0(view, R.id.screen_rotate_btn);
                                        if (appCompatImageView2 != null) {
                                            i = R.id.screen_rotate_txt;
                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) o00oOo0O.o00oOOo0(view, R.id.screen_rotate_txt);
                                            if (appCompatTextView4 != null) {
                                                i = R.id.settings;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) o00oOo0O.o00oOOo0(view, R.id.settings);
                                                if (constraintLayout != null) {
                                                    i = R.id.size_seekbar;
                                                    ZoomControls zoomControls = (ZoomControls) o00oOo0O.o00oOOo0(view, R.id.size_seekbar);
                                                    if (zoomControls != null) {
                                                        i = R.id.size_txt;
                                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) o00oOo0O.o00oOOo0(view, R.id.size_txt);
                                                        if (appCompatTextView5 != null) {
                                                            i = R.id.zoom_seekbar;
                                                            ZoomControls zoomControls2 = (ZoomControls) o00oOo0O.o00oOOo0(view, R.id.zoom_seekbar);
                                                            if (zoomControls2 != null) {
                                                                i = R.id.zoom_txt;
                                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) o00oOo0O.o00oOOo0(view, R.id.zoom_txt);
                                                                if (appCompatTextView6 != null) {
                                                                    return new o00ooO((ConstraintLayout) view, o00oOOo02, powerSpinnerView, powerSpinnerView2, appCompatTextView, roundMenuView, appCompatTextView2, appCompatImageView, appCompatTextView3, appCompatImageView2, appCompatTextView4, constraintLayout, zoomControls, appCompatTextView5, zoomControls2, appCompatTextView6);
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
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{Byte.MIN_VALUE, 98, -26, -77, Ascii.SUB, 70, 34, -90, -65, 110, -28, -75, Ascii.SUB, 90, 32, -30, -19, 125, -4, -91, 4, 8, 50, -17, -71, 99, -75, -119, 55, Ascii.DC2, 101}, new byte[]{-51, Ascii.VT, -107, -64, 115, 40, 69, -122}).concat(view.getResources().getResourceName(i)));
    }

    @oo0oO0
    public static o00ooO inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o00ooO inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_float, viewGroup, false);
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
