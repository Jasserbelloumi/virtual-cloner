package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oOOo0 {

    /* renamed from: androidx.transition.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0056o00oOOo0 {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    public static void o00oOOo0(@oo0oO0 Animator animator, @oo0oO0 AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    public static void o00oOOoO(@oo0oO0 Animator animator) {
        animator.pause();
    }

    public static void o00oOo00(@oo0oO0 Animator animator) {
        animator.resume();
    }
}
