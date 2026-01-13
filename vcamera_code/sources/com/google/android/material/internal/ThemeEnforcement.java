package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.media.o00oOoO;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.o0OOO0;
import com.google.android.material.R;
import o00oOooO.o0O000Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOO0OO;
import o00oOooO.o0OOOO00;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class ThemeEnforcement {
    private static final String APPCOMPAT_THEME_NAME = "Theme.AppCompat";
    private static final String MATERIAL_THEME_NAME = "Theme.MaterialComponents";
    private static final int[] APPCOMPAT_CHECK_ATTRS = {R.attr.colorPrimary};
    private static final int[] MATERIAL_CHECK_ATTRS = {R.attr.colorPrimaryVariant};

    private ThemeEnforcement() {
    }

    public static void checkAppCompatTheme(@oo0oO0 Context context) {
        checkTheme(context, APPCOMPAT_CHECK_ATTRS, APPCOMPAT_THEME_NAME);
    }

    private static void checkCompatibleTheme(@oo0oO0 Context context, AttributeSet attributeSet, @o0O000Oo int i, @o0OOO0OO int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                checkMaterialTheme(context);
            }
        }
        checkAppCompatTheme(context);
    }

    public static void checkMaterialTheme(@oo0oO0 Context context) {
        checkTheme(context, MATERIAL_CHECK_ATTRS, MATERIAL_THEME_NAME);
    }

    private static void checkTextAppearance(@oo0oO0 Context context, AttributeSet attributeSet, @oo0oO0 @o0OOOO00 int[] iArr, @o0O000Oo int i, @o0OOO0OO int i2, @o0OO00OO @o0OOOO00 int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ThemeEnforcement, i, i2);
        if (!obtainStyledAttributes.getBoolean(R.styleable.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            z = obtainStyledAttributes.getResourceId(R.styleable.ThemeEnforcement_android_textAppearance, -1) != -1;
        } else {
            z = isCustomTextAppearanceValid(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void checkTheme(@oo0oO0 Context context, @oo0oO0 int[] iArr, String str) {
        if (!isTheme(context, iArr)) {
            throw new IllegalArgumentException(o00oOoO.o00oOOo0("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    public static boolean isAppCompatTheme(@oo0oO0 Context context) {
        return isTheme(context, APPCOMPAT_CHECK_ATTRS);
    }

    private static boolean isCustomTextAppearanceValid(@oo0oO0 Context context, AttributeSet attributeSet, @oo0oO0 @o0OOOO00 int[] iArr, @o0O000Oo int i, @o0OOO0OO int i2, @oo0oO0 @o0OOOO00 int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i3, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static boolean isMaterialTheme(@oo0oO0 Context context) {
        return isTheme(context, MATERIAL_CHECK_ATTRS);
    }

    private static boolean isTheme(@oo0oO0 Context context, @oo0oO0 int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    @oo0oO0
    public static TypedArray obtainStyledAttributes(@oo0oO0 Context context, AttributeSet attributeSet, @oo0oO0 @o0OOOO00 int[] iArr, @o0O000Oo int i, @o0OOO0OO int i2, @o0OOOO00 int... iArr2) {
        checkCompatibleTheme(context, attributeSet, i, i2);
        checkTextAppearance(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static o0OOO0 obtainTintedStyledAttributes(@oo0oO0 Context context, AttributeSet attributeSet, @oo0oO0 @o0OOOO00 int[] iArr, @o0O000Oo int i, @o0OOO0OO int i2, @o0OOOO00 int... iArr2) {
        checkCompatibleTheme(context, attributeSet, i, i2);
        checkTextAppearance(context, attributeSet, iArr, i, i2, iArr2);
        return o0OOO0.o00ooOo(context, attributeSet, iArr, i, i2);
    }
}
