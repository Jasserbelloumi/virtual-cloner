package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.base.Ascii;
import com.skydoves.powerspinner.PowerSpinnerView;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0O0OoO0.o00oOo0O;
import o0OOoO0.o00oo;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o0O0O0Oo implements o00oOo00 {
    @oo0oO0
    public final AppCompatTextView appDesc;
    @oo0oO0
    public final ConstraintLayout audioContainer;
    @oo0oO0
    public final AppCompatTextView protectAudio;
    @oo0oO0
    public final SwitchCompat protectAudioSwitch;
    @oo0oO0
    public final AppCompatEditText protectHeightEdit;
    @oo0oO0
    public final AppCompatTextView protectHeightTxt;
    @oo0oO0
    public final PowerSpinnerView protectMethodBtn;
    @oo0oO0
    public final AppCompatTextView protectMethodText;
    @oo0oO0
    public final AppCompatEditText protectPath;
    @oo0oO0
    public final AppCompatButton protectSave;
    @oo0oO0
    public final AppCompatTextView protectTip;
    @oo0oO0
    public final AppCompatButton protectVideoSelect;
    @oo0oO0
    public final AppCompatEditText protectWidthEdit;
    @oo0oO0
    public final AppCompatTextView protectWidthTxt;
    @oo0oO0
    private final ConstraintLayout rootView;
    @oo0oO0
    public final ConstraintLayout sizeContainer;
    @oo0oO0
    public final AppCompatTextView videoSizeNote;

    private o0O0O0Oo(@oo0oO0 ConstraintLayout constraintLayout, @oo0oO0 AppCompatTextView appCompatTextView, @oo0oO0 ConstraintLayout constraintLayout2, @oo0oO0 AppCompatTextView appCompatTextView2, @oo0oO0 SwitchCompat switchCompat, @oo0oO0 AppCompatEditText appCompatEditText, @oo0oO0 AppCompatTextView appCompatTextView3, @oo0oO0 PowerSpinnerView powerSpinnerView, @oo0oO0 AppCompatTextView appCompatTextView4, @oo0oO0 AppCompatEditText appCompatEditText2, @oo0oO0 AppCompatButton appCompatButton, @oo0oO0 AppCompatTextView appCompatTextView5, @oo0oO0 AppCompatButton appCompatButton2, @oo0oO0 AppCompatEditText appCompatEditText3, @oo0oO0 AppCompatTextView appCompatTextView6, @oo0oO0 ConstraintLayout constraintLayout3, @oo0oO0 AppCompatTextView appCompatTextView7) {
        this.rootView = constraintLayout;
        this.appDesc = appCompatTextView;
        this.audioContainer = constraintLayout2;
        this.protectAudio = appCompatTextView2;
        this.protectAudioSwitch = switchCompat;
        this.protectHeightEdit = appCompatEditText;
        this.protectHeightTxt = appCompatTextView3;
        this.protectMethodBtn = powerSpinnerView;
        this.protectMethodText = appCompatTextView4;
        this.protectPath = appCompatEditText2;
        this.protectSave = appCompatButton;
        this.protectTip = appCompatTextView5;
        this.protectVideoSelect = appCompatButton2;
        this.protectWidthEdit = appCompatEditText3;
        this.protectWidthTxt = appCompatTextView6;
        this.sizeContainer = constraintLayout3;
        this.videoSizeNote = appCompatTextView7;
    }

    @oo0oO0
    public static o0O0O0Oo bind(@oo0oO0 View view) {
        int i = R.id.app_desc;
        AppCompatTextView appCompatTextView = (AppCompatTextView) o00oOo0O.o00oOOo0(view, R.id.app_desc);
        if (appCompatTextView != null) {
            i = R.id.audio_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) o00oOo0O.o00oOOo0(view, R.id.audio_container);
            if (constraintLayout != null) {
                i = R.id.protect_audio;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) o00oOo0O.o00oOOo0(view, R.id.protect_audio);
                if (appCompatTextView2 != null) {
                    i = R.id.protect_audio_switch;
                    SwitchCompat switchCompat = (SwitchCompat) o00oOo0O.o00oOOo0(view, R.id.protect_audio_switch);
                    if (switchCompat != null) {
                        i = R.id.protect_height_edit;
                        AppCompatEditText appCompatEditText = (AppCompatEditText) o00oOo0O.o00oOOo0(view, R.id.protect_height_edit);
                        if (appCompatEditText != null) {
                            i = R.id.protect_height_txt;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) o00oOo0O.o00oOOo0(view, R.id.protect_height_txt);
                            if (appCompatTextView3 != null) {
                                i = R.id.protect_method_btn;
                                PowerSpinnerView powerSpinnerView = (PowerSpinnerView) o00oOo0O.o00oOOo0(view, R.id.protect_method_btn);
                                if (powerSpinnerView != null) {
                                    i = R.id.protect_method_text;
                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) o00oOo0O.o00oOOo0(view, R.id.protect_method_text);
                                    if (appCompatTextView4 != null) {
                                        i = R.id.protect_path;
                                        AppCompatEditText appCompatEditText2 = (AppCompatEditText) o00oOo0O.o00oOOo0(view, R.id.protect_path);
                                        if (appCompatEditText2 != null) {
                                            i = R.id.protect_save;
                                            AppCompatButton appCompatButton = (AppCompatButton) o00oOo0O.o00oOOo0(view, R.id.protect_save);
                                            if (appCompatButton != null) {
                                                i = R.id.protect_tip;
                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) o00oOo0O.o00oOOo0(view, R.id.protect_tip);
                                                if (appCompatTextView5 != null) {
                                                    i = R.id.protect_video_select;
                                                    AppCompatButton appCompatButton2 = (AppCompatButton) o00oOo0O.o00oOOo0(view, R.id.protect_video_select);
                                                    if (appCompatButton2 != null) {
                                                        i = R.id.protect_width_edit;
                                                        AppCompatEditText appCompatEditText3 = (AppCompatEditText) o00oOo0O.o00oOOo0(view, R.id.protect_width_edit);
                                                        if (appCompatEditText3 != null) {
                                                            i = R.id.protect_width_txt;
                                                            AppCompatTextView appCompatTextView6 = (AppCompatTextView) o00oOo0O.o00oOOo0(view, R.id.protect_width_txt);
                                                            if (appCompatTextView6 != null) {
                                                                i = R.id.size_container;
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) o00oOo0O.o00oOOo0(view, R.id.size_container);
                                                                if (constraintLayout2 != null) {
                                                                    i = R.id.video_size_note;
                                                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) o00oOo0O.o00oOOo0(view, R.id.video_size_note);
                                                                    if (appCompatTextView7 != null) {
                                                                        return new o0O0O0Oo((ConstraintLayout) view, appCompatTextView, constraintLayout, appCompatTextView2, switchCompat, appCompatEditText, appCompatTextView3, powerSpinnerView, appCompatTextView4, appCompatEditText2, appCompatButton, appCompatTextView5, appCompatButton2, appCompatEditText3, appCompatTextView6, constraintLayout2, appCompatTextView7);
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
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{-20, 3, 32, -25, -1, 59, -24, -69, -45, Ascii.SI, 34, -31, -1, 39, -22, -1, -127, Ascii.FS, 58, -15, -31, 117, -8, -14, -43, 2, 115, -35, -46, 111, -81}, new byte[]{-95, 106, 83, -108, -106, 85, -113, -101}).concat(view.getResources().getResourceName(i)));
    }

    @oo0oO0
    public static o0O0O0Oo inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0O0O0Oo inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.vc_activity_camera_settings, viewGroup, false);
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
