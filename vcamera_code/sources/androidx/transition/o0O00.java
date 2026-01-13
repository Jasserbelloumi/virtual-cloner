package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.transition.o0O0000O;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0O00 {

    /* loaded from: classes.dex */
    public static class o00oOOo0 extends AnimatorListenerAdapter implements o0O0000O.o00oo0OO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final View f5101o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final View f5102o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final int f5103o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int[] f5104o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public float f5105o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public final float f5106o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public float f5107o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public final float f5108o00oOoOO;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final int f5109o00oOooO;

        public o00oOOo0(View view, View view2, int i, int i2, float f, float f2) {
            this.f5102o00oOOoO = view;
            this.f5101o00oOOo0 = view2;
            this.f5103o00oOo00 = i - Math.round(view.getTranslationX());
            this.f5109o00oOooO = i2 - Math.round(view.getTranslationY());
            this.f5106o00oOoO = f;
            this.f5108o00oOoOO = f2;
            int i3 = R.id.transition_position;
            int[] iArr = (int[]) view2.getTag(i3);
            this.f5104o00oOo0O = iArr;
            if (iArr != null) {
                view2.setTag(i3, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f5104o00oOo0O == null) {
                this.f5104o00oOo0O = new int[2];
            }
            this.f5104o00oOo0O[0] = Math.round(this.f5102o00oOOoO.getTranslationX() + this.f5103o00oOo00);
            this.f5104o00oOo0O[1] = Math.round(this.f5102o00oOOoO.getTranslationY() + this.f5109o00oOooO);
            this.f5101o00oOOo0.setTag(R.id.transition_position, this.f5104o00oOo0O);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f5105o00oOo0o = this.f5102o00oOOoO.getTranslationX();
            this.f5107o00oOoO0 = this.f5102o00oOOoO.getTranslationY();
            this.f5102o00oOOoO.setTranslationX(this.f5106o00oOoO);
            this.f5102o00oOOoO.setTranslationY(this.f5108o00oOoOO);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f5102o00oOOoO.setTranslationX(this.f5105o00oOo0o);
            this.f5102o00oOOoO.setTranslationY(this.f5107o00oOoO0);
        }

        @Override // androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionCancel(@oo0oO0 o0O0000O o0o0000o) {
        }

        @Override // androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionEnd(@oo0oO0 o0O0000O o0o0000o) {
            this.f5102o00oOOoO.setTranslationX(this.f5106o00oOoO);
            this.f5102o00oOOoO.setTranslationY(this.f5108o00oOoOO);
            o0o0000o.removeListener(this);
        }

        @Override // androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionPause(@oo0oO0 o0O0000O o0o0000o) {
        }

        @Override // androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionResume(@oo0oO0 o0O0000O o0o0000o) {
        }

        @Override // androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionStart(@oo0oO0 o0O0000O o0o0000o) {
        }
    }

    @o0OO00OO
    public static Animator o00oOOo0(@oo0oO0 View view, @oo0oO0 o0O0Oo0o.o0OoO00O o0ooo00o, int i, int i2, float f, float f2, float f3, float f4, @o0OO00OO TimeInterpolator timeInterpolator, @oo0oO0 o0O0000O o0o0000o) {
        float f5;
        float f6;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) o0ooo00o.f11945o00oOOoO.getTag(R.id.transition_position);
        if (iArr != null) {
            f5 = (iArr[0] - i) + translationX;
            f6 = (iArr[1] - i2) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = Math.round(f5 - translationX) + i;
        int round2 = Math.round(f6 - translationY) + i2;
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f5, f3), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f6, f4));
        o00oOOo0 o00oooo02 = new o00oOOo0(view, o0ooo00o.f11945o00oOOoO, round, round2, translationX, translationY);
        o0o0000o.addListener(o00oooo02);
        ofPropertyValuesHolder.addListener(o00oooo02);
        ofPropertyValuesHolder.addPauseListener(o00oooo02);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
