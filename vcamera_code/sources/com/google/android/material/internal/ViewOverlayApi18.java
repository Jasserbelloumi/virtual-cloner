package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(18)
/* loaded from: classes2.dex */
class ViewOverlayApi18 implements ViewOverlayImpl {
    private final ViewOverlay viewOverlay;

    public ViewOverlayApi18(@oo0oO0 View view) {
        this.viewOverlay = view.getOverlay();
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void add(@oo0oO0 Drawable drawable) {
        this.viewOverlay.add(drawable);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void remove(@oo0oO0 Drawable drawable) {
        this.viewOverlay.remove(drawable);
    }
}
