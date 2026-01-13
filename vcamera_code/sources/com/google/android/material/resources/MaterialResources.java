package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.o0OOO0;
import o00oOo0o.o00oOo00;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOOO00;
import o00oOooO.oo0oO0;
import o00ooo0.o0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class MaterialResources {
    private static final float FONT_SCALE_1_3 = 1.3f;
    private static final float FONT_SCALE_2_0 = 2.0f;

    private MaterialResources() {
    }

    @o0OO00OO
    public static ColorStateList getColorStateList(@oo0oO0 Context context, @oo0oO0 TypedArray typedArray, @o0OOOO00 int i) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = o0.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    public static int getDimensionPixelSize(@oo0oO0 Context context, @oo0oO0 TypedArray typedArray, @o0OOOO00 int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i, i2);
    }

    @o0OO00OO
    public static Drawable getDrawable(@oo0oO0 Context context, @oo0oO0 TypedArray typedArray, @o0OOOO00 int i) {
        int resourceId;
        Drawable o00oOOoO2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (o00oOOoO2 = o00oOo00.o00oOOoO(context, resourceId)) == null) ? typedArray.getDrawable(i) : o00oOOoO2;
    }

    @o0OOOO00
    public static int getIndexWithValue(@oo0oO0 TypedArray typedArray, @o0OOOO00 int i, @o0OOOO00 int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    @o0OO00OO
    public static TextAppearance getTextAppearance(@oo0oO0 Context context, @oo0oO0 TypedArray typedArray, @o0OOOO00 int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new TextAppearance(context, resourceId);
    }

    public static boolean isFontScaleAtLeast1_3(@oo0oO0 Context context) {
        return context.getResources().getConfiguration().fontScale >= FONT_SCALE_1_3;
    }

    public static boolean isFontScaleAtLeast2_0(@oo0oO0 Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    @o0OO00OO
    public static ColorStateList getColorStateList(@oo0oO0 Context context, @oo0oO0 o0OOO0 o0ooo0, @o0OOOO00 int i) {
        int o00oo0oO2;
        ColorStateList colorStateList;
        return (!o0ooo0.o00ooOO0(i) || (o00oo0oO2 = o0ooo0.o00oo0oO(i, 0)) == 0 || (colorStateList = o0.getColorStateList(context, o00oo0oO2)) == null) ? o0ooo0.o00oOooO(i) : colorStateList;
    }
}
