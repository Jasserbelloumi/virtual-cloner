package o0OOooO0;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.RelativeLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.roger.catloadinglibrary.EyelidView;
import com.roger.catloadinglibrary.GraduallyTextView;
import com.roger.catloadinglibrary.R;
import java.util.HashMap;
import kotlin.Metadata;
import o00oOo0o.o00oOo00;
import o00ooOoo.oOo000Oo;
import o00ooo0.o0;
import o00oooo0.o0O0O0Oo;
import o0OO0o.oO0Ooooo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b9\u0010:J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u0010\u001dR\u0018\u00103\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00108\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006;"}, d2 = {"Lo0OOooO0/oO0O;", "Lo0OOooO0/ooOOO00O;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "Lo0OO0o/oO0Ooooo;", "onResume", "onPause", "onDestroyView", "", "labelText", "o00oo0", "", "flag", "o00oo00O", "", TtmlNode.ATTR_TTS_COLOR, "o00oOooo", "Landroid/view/animation/Animation;", "o00oo0Oo", "Landroid/view/animation/Animation;", "operatingAnim", "o00oo0o0", "eyeLeftAnim", "o00oo0o", "eyeRightAnim", "Landroid/view/View;", "o00oo0oO", "Landroid/view/View;", "eyeLeft", "o0O0o", "eyeRight", "Lcom/roger/catloadinglibrary/EyelidView;", "o00oo", "Lcom/roger/catloadinglibrary/EyelidView;", "eyelidLeft", "o00ooO00", "eyelidRight", "Lcom/roger/catloadinglibrary/GraduallyTextView;", "o00ooO0", "Lcom/roger/catloadinglibrary/GraduallyTextView;", "graduallyTextView", "Landroid/widget/RelativeLayout;", "o00ooO0O", "Landroid/widget/RelativeLayout;", oOo000Oo.o0O000.f9439o00ooOO0, "o00ooO0o", "mouse", "o00ooO", "Ljava/lang/String;", "viewText", "o00ooOO0", "I", "o00ooOO", "Landroid/app/Dialog;", "mainDialog", "<init>", "()V", "catloadinglibrary_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class oO0O extends ooOOO00O {

    /* renamed from: o00oo  reason: collision with root package name */
    public EyelidView f15366o00oo;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public Animation f15367o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public Animation f15368o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public Animation f15369o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public View f15370o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public String f15371o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public GraduallyTextView f15372o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public EyelidView f15373o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public RelativeLayout f15374o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public View f15375o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public Dialog f15376o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public int f15377o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public HashMap f15378o00ooOOo;

    /* renamed from: o0O0o  reason: collision with root package name */
    public View f15379o0O0o;

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/roger/catloadinglibrary/CatLoadingView$onCreateDialog$2$2", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "Lo0OO0o/oO0Ooooo;", "onAnimationStart", "onAnimationEnd", "onAnimationRepeat", "catloadinglibrary_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class o00oOOo0 implements Animation.AnimationListener {
        public o00oOOo0() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@NotNull Animation animation) {
            o0ooO.o00oo0O0(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@NotNull Animation animation) {
            o0ooO.o00oo0O0(animation, "animation");
            oO0O.o00oOoO(oO0O.this).o00oOo0o();
            oO0O.o00oOoOO(oO0O.this).o00oOo0o();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@NotNull Animation animation) {
            o0ooO.o00oo0O0(animation, "animation");
        }
    }

    public static final /* synthetic */ EyelidView o00oOoO(oO0O oo0o) {
        EyelidView eyelidView = oo0o.f15366o00oo;
        if (eyelidView == null) {
            o0ooO.o00ooooO("eyelidLeft");
        }
        return eyelidView;
    }

    public static final /* synthetic */ EyelidView o00oOoOO(oO0O oo0o) {
        EyelidView eyelidView = oo0o.f15373o00ooO00;
        if (eyelidView == null) {
            o0ooO.o00ooooO("eyelidRight");
        }
        return eyelidView;
    }

    @Override // o0OOooO0.ooOOO00O
    public void o00oOo0o() {
        HashMap hashMap = this.f15378o00ooOOo;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // o0OOooO0.ooOOO00O
    public View o00oOoO0(int i) {
        if (this.f15378o00ooOOo == null) {
            this.f15378o00ooOOo = new HashMap();
        }
        View view = (View) this.f15378o00ooOOo.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            View findViewById = view2.findViewById(i);
            this.f15378o00ooOOo.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    public final void o00oOooo(int i) {
        this.f15377o00ooOO0 = i;
    }

    public final void o00oo0(@Nullable String str) {
        this.f15371o00ooO = str;
    }

    public final void o00oo00O(boolean z) {
        this.f15382o00oo0O0 = z;
    }

    @Override // androidx.fragment.app.o00oOo00
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Window window;
        View decorView;
        Dialog dialog = new Dialog(requireActivity(), R.style.cart_dialog);
        dialog.setContentView(R.layout.catloading_main);
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setGravity(17);
        }
        oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
        this.f15376o00ooOO = dialog;
        RotateAnimation rotateAnimation = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.f15367o00oo0Oo = rotateAnimation;
        rotateAnimation.setRepeatCount(-1);
        Animation animation = this.f15367o00oo0Oo;
        if (animation == null) {
            o0ooO.o00ooooO("operatingAnim");
        }
        animation.setDuration(2000L);
        RotateAnimation rotateAnimation2 = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.f15369o00oo0o0 = rotateAnimation2;
        rotateAnimation2.setRepeatCount(-1);
        Animation animation2 = this.f15369o00oo0o0;
        if (animation2 == null) {
            o0ooO.o00ooooO("eyeLeftAnim");
        }
        animation2.setDuration(2000L);
        RotateAnimation rotateAnimation3 = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.f15368o00oo0o = rotateAnimation3;
        rotateAnimation3.setRepeatCount(-1);
        Animation animation3 = this.f15368o00oo0o;
        if (animation3 == null) {
            o0ooO.o00ooooO("eyeRightAnim");
        }
        animation3.setDuration(2000L);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animation animation4 = this.f15367o00oo0Oo;
        if (animation4 == null) {
            o0ooO.o00ooooO("operatingAnim");
        }
        animation4.setInterpolator(linearInterpolator);
        Animation animation5 = this.f15369o00oo0o0;
        if (animation5 == null) {
            o0ooO.o00ooooO("eyeLeftAnim");
        }
        animation5.setInterpolator(linearInterpolator);
        Animation animation6 = this.f15368o00oo0o;
        if (animation6 == null) {
            o0ooO.o00ooooO("eyeRightAnim");
        }
        animation6.setInterpolator(linearInterpolator);
        Dialog dialog2 = this.f15376o00ooOO;
        if (dialog2 != null && (window = dialog2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            View findViewById = decorView.findViewById(R.id.background);
            o0ooO.o00oo0OO(findViewById, "view.findViewById(R.id.background)");
            this.f15374o00ooO0O = (RelativeLayout) findViewById;
            if (this.f15377o00ooOO0 != 0) {
                o0ooO.o00oo0OO(decorView, "view");
                Drawable o00oOOoO2 = o00oOo00.o00oOOoO(decorView.getContext(), R.drawable.background);
                if (o00oOOoO2 != null) {
                    o0O0O0Oo.o00oOOoO.o00oOoO0(o00oOOoO2, o0.getColor(decorView.getContext(), this.f15377o00ooOO0));
                    RelativeLayout relativeLayout = this.f15374o00ooO0O;
                    if (relativeLayout == null) {
                        o0ooO.o00ooooO(oOo000Oo.o0O000.f9439o00ooOO0);
                    }
                    relativeLayout.setBackground(o00oOOoO2);
                }
            }
            View findViewById2 = decorView.findViewById(R.id.mouse);
            o0ooO.o00oo0OO(findViewById2, "view.findViewById(R.id.mouse)");
            this.f15375o00ooO0o = findViewById2;
            View findViewById3 = decorView.findViewById(R.id.eye_left);
            o0ooO.o00oo0OO(findViewById3, "view.findViewById(R.id.eye_left)");
            this.f15370o00oo0oO = findViewById3;
            View findViewById4 = decorView.findViewById(R.id.eye_right);
            o0ooO.o00oo0OO(findViewById4, "view.findViewById(R.id.eye_right)");
            this.f15379o0O0o = findViewById4;
            View findViewById5 = decorView.findViewById(R.id.eyelid_left);
            if (findViewById5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.roger.catloadinglibrary.EyelidView");
            }
            EyelidView eyelidView = (EyelidView) findViewById5;
            this.f15366o00oo = eyelidView;
            Context requireContext = requireContext();
            int i = R.color.eyelid;
            eyelidView.setColor(o0.getColor(requireContext, i));
            EyelidView eyelidView2 = this.f15366o00oo;
            if (eyelidView2 == null) {
                o0ooO.o00ooooO("eyelidLeft");
            }
            eyelidView2.setFromFull(true);
            View findViewById6 = decorView.findViewById(R.id.eyelid_right);
            if (findViewById6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.roger.catloadinglibrary.EyelidView");
            }
            EyelidView eyelidView3 = (EyelidView) findViewById6;
            this.f15373o00ooO00 = eyelidView3;
            eyelidView3.setColor(o0.getColor(requireContext(), i));
            EyelidView eyelidView4 = this.f15373o00ooO00;
            if (eyelidView4 == null) {
                o0ooO.o00ooooO("eyelidRight");
            }
            eyelidView4.setFromFull(true);
            View findViewById7 = decorView.findViewById(R.id.graduallyTextView);
            if (findViewById7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.roger.catloadinglibrary.GraduallyTextView");
            }
            this.f15372o00ooO0 = (GraduallyTextView) findViewById7;
            if (!TextUtils.isEmpty(this.f15371o00ooO)) {
                GraduallyTextView graduallyTextView = this.f15372o00ooO0;
                if (graduallyTextView == null) {
                    o0ooO.o00ooooO("graduallyTextView");
                }
                graduallyTextView.setText(this.f15371o00ooO);
            }
            Animation animation7 = this.f15367o00oo0Oo;
            if (animation7 == null) {
                o0ooO.o00ooooO("operatingAnim");
            }
            animation7.setAnimationListener(new o00oOOo0());
        }
        Dialog dialog3 = this.f15376o00ooOO;
        o0ooO.o00oo00O(dialog3);
        return dialog3;
    }

    @Override // o0OOooO0.ooOOO00O, androidx.fragment.app.o00oOo00, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog dialog = this.f15376o00ooOO;
        if (dialog != null && dialog.isShowing()) {
            Dialog dialog2 = this.f15376o00ooOO;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            this.f15376o00ooOO = null;
        }
        super.onDestroyView();
        o00oOo0o();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        View view = this.f15375o00ooO0o;
        if (view == null) {
            o0ooO.o00ooooO("mouse");
        }
        view.clearAnimation();
        View view2 = this.f15370o00oo0oO;
        if (view2 == null) {
            o0ooO.o00ooooO("eyeLeft");
        }
        view2.clearAnimation();
        View view3 = this.f15379o0O0o;
        if (view3 == null) {
            o0ooO.o00ooooO("eyeRight");
        }
        view3.clearAnimation();
        EyelidView eyelidView = this.f15366o00oo;
        if (eyelidView == null) {
            o0ooO.o00ooooO("eyelidLeft");
        }
        eyelidView.o00oOoO();
        EyelidView eyelidView2 = this.f15373o00ooO00;
        if (eyelidView2 == null) {
            o0ooO.o00ooooO("eyelidRight");
        }
        eyelidView2.o00oOoO();
        GraduallyTextView graduallyTextView = this.f15372o00ooO0;
        if (graduallyTextView == null) {
            o0ooO.o00ooooO("graduallyTextView");
        }
        graduallyTextView.o00oOoO0();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        View view = this.f15375o00ooO0o;
        if (view == null) {
            o0ooO.o00ooooO("mouse");
        }
        Animation animation = this.f15367o00oo0Oo;
        if (animation == null) {
            o0ooO.o00ooooO("operatingAnim");
        }
        view.setAnimation(animation);
        View view2 = this.f15370o00oo0oO;
        if (view2 == null) {
            o0ooO.o00ooooO("eyeLeft");
        }
        Animation animation2 = this.f15369o00oo0o0;
        if (animation2 == null) {
            o0ooO.o00ooooO("eyeLeftAnim");
        }
        view2.setAnimation(animation2);
        View view3 = this.f15379o0O0o;
        if (view3 == null) {
            o0ooO.o00ooooO("eyeRight");
        }
        Animation animation3 = this.f15368o00oo0o;
        if (animation3 == null) {
            o0ooO.o00ooooO("eyeRightAnim");
        }
        view3.setAnimation(animation3);
        EyelidView eyelidView = this.f15366o00oo;
        if (eyelidView == null) {
            o0ooO.o00ooooO("eyelidLeft");
        }
        eyelidView.o00oOoO0();
        EyelidView eyelidView2 = this.f15373o00ooO00;
        if (eyelidView2 == null) {
            o0ooO.o00ooooO("eyelidRight");
        }
        eyelidView2.o00oOoO0();
        GraduallyTextView graduallyTextView = this.f15372o00ooO0;
        if (graduallyTextView == null) {
            o0ooO.o00ooooO("graduallyTextView");
        }
        graduallyTextView.o00oOo0o();
        super.onResume();
    }
}
