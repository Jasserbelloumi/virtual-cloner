package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.List;
import o00oOooO.o0O0000O;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public interface MotionStrategy {
    void addAnimationListener(@oo0oO0 Animator.AnimatorListener animatorListener);

    AnimatorSet createAnimator();

    MotionSpec getCurrentMotionSpec();

    @o0O0000O
    int getDefaultMotionSpecResource();

    List<Animator.AnimatorListener> getListeners();

    @o0OO00OO
    MotionSpec getMotionSpec();

    void onAnimationCancel();

    void onAnimationEnd();

    void onAnimationStart(Animator animator);

    void onChange(@o0OO00OO ExtendedFloatingActionButton.OnChangedCallback onChangedCallback);

    void performNow();

    void removeAnimationListener(@oo0oO0 Animator.AnimatorListener animatorListener);

    void setMotionSpec(@o0OO00OO MotionSpec motionSpec);

    boolean shouldCancel();
}
