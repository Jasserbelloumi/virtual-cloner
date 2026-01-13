package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(18)
/* loaded from: classes2.dex */
class ViewGroupOverlayApi18 implements ViewGroupOverlayImpl {
    private final ViewGroupOverlay viewGroupOverlay;

    public ViewGroupOverlayApi18(@oo0oO0 ViewGroup viewGroup) {
        this.viewGroupOverlay = viewGroup.getOverlay();
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void add(@oo0oO0 Drawable drawable) {
        this.viewGroupOverlay.add(drawable);
    }

    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void add(@oo0oO0 View view) {
        this.viewGroupOverlay.add(view);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void remove(@oo0oO0 Drawable drawable) {
        this.viewGroupOverlay.remove(drawable);
    }

    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void remove(@oo0oO0 View view) {
        this.viewGroupOverlay.remove(view);
    }
}
