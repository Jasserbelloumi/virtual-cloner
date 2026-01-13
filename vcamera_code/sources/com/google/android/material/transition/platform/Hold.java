package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(21)
/* loaded from: classes2.dex */
public final class Hold extends Visibility {
    @Override // android.transition.Visibility
    @oo0oO0
    public Animator onAppear(@oo0oO0 ViewGroup viewGroup, @oo0oO0 View view, @o0OO00OO TransitionValues transitionValues, @o0OO00OO TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // android.transition.Visibility
    @oo0oO0
    public Animator onDisappear(@oo0oO0 ViewGroup viewGroup, @oo0oO0 View view, @o0OO00OO TransitionValues transitionValues, @o0OO00OO TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
