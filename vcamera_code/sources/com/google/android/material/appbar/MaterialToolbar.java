package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.R;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import o00oOooO.o0O00O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o00oooo0.o0O0O0Oo;
import o0O000oo.o0O0o00O;
/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_Toolbar;
    @o0OO00OO
    private Integer navigationIconTint;

    public MaterialToolbar(@oo0oO0 Context context) {
        this(context, null);
    }

    public MaterialToolbar(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialToolbar(@o00oOooO.oo0oO0 android.content.Context r7, @o00oOooO.o0OO00OO android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.DEF_STYLE_RES
            android.content.Context r7 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r7 = r6.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialToolbar
            r0 = 0
            int[] r5 = new int[r0]
            r0 = r7
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.R.styleable.MaterialToolbar_navigationIconTint
            boolean r0 = r8.hasValue(r9)
            if (r0 == 0) goto L29
            r0 = -1
            int r9 = r8.getColor(r9, r0)
            r6.setNavigationIconTint(r9)
        L29:
            r8.recycle()
            r6.initBackground(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void initBackground(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            materialShapeDrawable.initializeElevationOverlay(context);
            materialShapeDrawable.setElevation(o0O0o00O.o00oooo(this));
            o0O0o00O.o00oo0OO.o00oo0O(this, materialShapeDrawable);
        }
    }

    @o0OO00OO
    private Drawable maybeTintNavigationIcon(@o0OO00OO Drawable drawable) {
        Integer num;
        if (drawable != null && (num = this.navigationIconTint) != null) {
            o0O0O0Oo.o00oOOoO.o00oOoO0(drawable, num.intValue());
        }
        return drawable;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    @o0OOooO0(21)
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@o0OO00OO Drawable drawable) {
        super.setNavigationIcon(maybeTintNavigationIcon(drawable));
    }

    public void setNavigationIconTint(@o0O00O int i) {
        this.navigationIconTint = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }
}
