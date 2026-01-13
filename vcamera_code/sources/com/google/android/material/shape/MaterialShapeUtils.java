package com.google.android.material.shape;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.ViewUtils;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public class MaterialShapeUtils {
    private MaterialShapeUtils() {
    }

    @oo0oO0
    public static CornerTreatment createCornerTreatment(int i) {
        return i != 0 ? i != 1 ? createDefaultCornerTreatment() : new CutCornerTreatment() : new RoundedCornerTreatment();
    }

    @oo0oO0
    public static CornerTreatment createDefaultCornerTreatment() {
        return new RoundedCornerTreatment();
    }

    @oo0oO0
    public static EdgeTreatment createDefaultEdgeTreatment() {
        return new EdgeTreatment();
    }

    public static void setElevation(@oo0oO0 View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).setElevation(f);
        }
    }

    public static void setParentAbsoluteElevation(@oo0oO0 View view) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            setParentAbsoluteElevation(view, (MaterialShapeDrawable) background);
        }
    }

    public static void setParentAbsoluteElevation(@oo0oO0 View view, @oo0oO0 MaterialShapeDrawable materialShapeDrawable) {
        if (materialShapeDrawable.isElevationOverlayEnabled()) {
            materialShapeDrawable.setParentAbsoluteElevation(ViewUtils.getParentAbsoluteElevation(view));
        }
    }
}
