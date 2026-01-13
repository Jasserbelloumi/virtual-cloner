package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.o0O00O0o;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.transition.VisibilityAnimatorProvider;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0Oo0o.o0OoO00O;
/* loaded from: classes2.dex */
abstract class MaterialVisibility<P extends VisibilityAnimatorProvider> extends o0O00O0o {
    private final List<VisibilityAnimatorProvider> additionalAnimatorProviders = new ArrayList();
    private final P primaryAnimatorProvider;
    @o0OO00OO
    private VisibilityAnimatorProvider secondaryAnimatorProvider;

    public MaterialVisibility(P p, @o0OO00OO VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.primaryAnimatorProvider = p;
        this.secondaryAnimatorProvider = visibilityAnimatorProvider;
        setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
    }

    private static void addAnimatorIfNeeded(List<Animator> list, @o0OO00OO VisibilityAnimatorProvider visibilityAnimatorProvider, ViewGroup viewGroup, View view, boolean z) {
        if (visibilityAnimatorProvider == null) {
            return;
        }
        Animator createAppear = z ? visibilityAnimatorProvider.createAppear(viewGroup, view) : visibilityAnimatorProvider.createDisappear(viewGroup, view);
        if (createAppear != null) {
            list.add(createAppear);
        }
    }

    private Animator createAnimator(ViewGroup viewGroup, View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        addAnimatorIfNeeded(arrayList, this.primaryAnimatorProvider, viewGroup, view, z);
        addAnimatorIfNeeded(arrayList, this.secondaryAnimatorProvider, viewGroup, view, z);
        for (VisibilityAnimatorProvider visibilityAnimatorProvider : this.additionalAnimatorProviders) {
            addAnimatorIfNeeded(arrayList, visibilityAnimatorProvider, viewGroup, view, z);
        }
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    public void addAdditionalAnimatorProvider(@oo0oO0 VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.additionalAnimatorProviders.add(visibilityAnimatorProvider);
    }

    public void clearAdditionalAnimatorProvider() {
        this.additionalAnimatorProviders.clear();
    }

    @oo0oO0
    public P getPrimaryAnimatorProvider() {
        return this.primaryAnimatorProvider;
    }

    @o0OO00OO
    public VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return this.secondaryAnimatorProvider;
    }

    @Override // androidx.transition.o0O00O0o
    public Animator onAppear(ViewGroup viewGroup, View view, o0OoO00O o0ooo00o, o0OoO00O o0ooo00o2) {
        return createAnimator(viewGroup, view, true);
    }

    @Override // androidx.transition.o0O00O0o
    public Animator onDisappear(ViewGroup viewGroup, View view, o0OoO00O o0ooo00o, o0OoO00O o0ooo00o2) {
        return createAnimator(viewGroup, view, false);
    }

    public boolean removeAdditionalAnimatorProvider(@oo0oO0 VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return this.additionalAnimatorProviders.remove(visibilityAnimatorProvider);
    }

    public void setSecondaryAnimatorProvider(@o0OO00OO VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.secondaryAnimatorProvider = visibilityAnimatorProvider;
    }
}
