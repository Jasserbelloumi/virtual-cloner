package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public interface VisibilityAnimatorProvider {
    @o0OO00OO
    Animator createAppear(@oo0oO0 ViewGroup viewGroup, @oo0oO0 View view);

    @o0OO00OO
    Animator createDisappear(@oo0oO0 ViewGroup viewGroup, @oo0oO0 View view);
}
