package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import o00oOooO.o0O00O;
import o00oOooO.oo0oO0;
import o00oooOo.oOO00OO;
/* loaded from: classes2.dex */
public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(@oo0oO0 Context context) {
        this.elevationOverlayEnabled = MaterialAttributes.resolveBoolean(context, R.attr.elevationOverlayEnabled, false);
        this.elevationOverlayColor = MaterialColors.getColor(context, R.attr.elevationOverlayColor, 0);
        this.colorSurface = MaterialColors.getColor(context, R.attr.colorSurface, 0);
        this.displayDensity = context.getResources().getDisplayMetrics().density;
    }

    private boolean isThemeSurfaceColor(@o0O00O int i) {
        return oOO00OO.o00ooO(i, 255) == this.colorSurface;
    }

    public int calculateOverlayAlpha(float f) {
        return Math.round(calculateOverlayAlphaFraction(f) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f) {
        float f2 = this.displayDensity;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f / f2)) * FORMULA_MULTIPLIER) + 2.0f) / 100.0f, 1.0f);
    }

    @o0O00O
    public int compositeOverlay(@o0O00O int i, float f) {
        float calculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f);
        return oOO00OO.o00ooO(MaterialColors.layer(oOO00OO.o00ooO(i, 255), this.elevationOverlayColor, calculateOverlayAlphaFraction), Color.alpha(i));
    }

    @o0O00O
    public int compositeOverlay(@o0O00O int i, float f, @oo0oO0 View view) {
        return compositeOverlay(i, getParentAbsoluteElevation(view) + f);
    }

    @o0O00O
    public int compositeOverlayIfNeeded(@o0O00O int i, float f) {
        return (this.elevationOverlayEnabled && isThemeSurfaceColor(i)) ? compositeOverlay(i, f) : i;
    }

    @o0O00O
    public int compositeOverlayIfNeeded(@o0O00O int i, float f, @oo0oO0 View view) {
        return compositeOverlayIfNeeded(i, getParentAbsoluteElevation(view) + f);
    }

    @o0O00O
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f) {
        return compositeOverlayIfNeeded(this.colorSurface, f);
    }

    @o0O00O
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f, @oo0oO0 View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(getParentAbsoluteElevation(view) + f);
    }

    public float getParentAbsoluteElevation(@oo0oO0 View view) {
        return ViewUtils.getParentAbsoluteElevation(view);
    }

    @o0O00O
    public int getThemeElevationOverlayColor() {
        return this.elevationOverlayColor;
    }

    @o0O00O
    public int getThemeSurfaceColor() {
        return this.colorSurface;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.elevationOverlayEnabled;
    }
}
