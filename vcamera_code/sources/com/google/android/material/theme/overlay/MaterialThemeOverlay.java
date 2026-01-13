package com.google.android.material.theme.overlay;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.R;
import o00oOoOo.o00oo0O0;
import o00oOooO.o0O000Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOO0OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public class MaterialThemeOverlay {
    private static final int[] ANDROID_THEME_OVERLAY_ATTRS = {16842752, R.attr.theme};
    private static final int[] MATERIAL_THEME_OVERLAY_ATTR = {R.attr.materialThemeOverlay};

    private MaterialThemeOverlay() {
    }

    @o0OOO0OO
    private static int obtainAndroidThemeOverlayId(@oo0oO0 Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ANDROID_THEME_OVERLAY_ATTRS);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    @o0OOO0OO
    private static int obtainMaterialThemeOverlayId(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, @o0O000Oo int i, @o0OOO0OO int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, MATERIAL_THEME_OVERLAY_ATTR, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @oo0oO0
    public static Context wrap(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, @o0O000Oo int i, @o0OOO0OO int i2) {
        int obtainMaterialThemeOverlayId = obtainMaterialThemeOverlayId(context, attributeSet, i, i2);
        boolean z = (context instanceof o00oo0O0) && ((o00oo0O0) context).o00oOo00() == obtainMaterialThemeOverlayId;
        if (obtainMaterialThemeOverlayId == 0 || z) {
            return context;
        }
        o00oo0O0 o00oo0o02 = new o00oo0O0(context, obtainMaterialThemeOverlayId);
        int obtainAndroidThemeOverlayId = obtainAndroidThemeOverlayId(context, attributeSet);
        if (obtainAndroidThemeOverlayId != 0) {
            o00oo0o02.getTheme().applyStyle(obtainAndroidThemeOverlayId, true);
        }
        return o00oo0o02;
    }
}
