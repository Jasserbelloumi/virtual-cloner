package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
abstract class EndIconDelegate {
    public Context context;
    public CheckableImageButton endIconView;
    public TextInputLayout textInputLayout;

    public EndIconDelegate(@oo0oO0 TextInputLayout textInputLayout) {
        this.textInputLayout = textInputLayout;
        this.context = textInputLayout.getContext();
        this.endIconView = textInputLayout.getEndIconView();
    }

    public abstract void initialize();

    public boolean isBoxBackgroundModeSupported(int i) {
        return true;
    }

    public void onSuffixVisibilityChanged(boolean z) {
    }

    public boolean shouldTintIconOnError() {
        return false;
    }
}
