package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.o0O00O0o;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0Oo0o.o0OoO00O;
/* loaded from: classes2.dex */
public final class Hold extends o0O00O0o {
    @Override // androidx.transition.o0O00O0o
    @oo0oO0
    public Animator onAppear(@oo0oO0 ViewGroup viewGroup, @oo0oO0 View view, @o0OO00OO o0OoO00O o0ooo00o, @o0OO00OO o0OoO00O o0ooo00o2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // androidx.transition.o0O00O0o
    @oo0oO0
    public Animator onDisappear(@oo0oO0 ViewGroup viewGroup, @oo0oO0 View view, @o0OO00OO o0OoO00O o0ooo00o, @o0OO00OO o0OoO00O o0ooo00o2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
