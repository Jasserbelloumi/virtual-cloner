package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.R;
import o00oOooO.o0O000Oo;
import o00oOooO.o0O00oO0;
import o00oOooO.o0OO0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class MaterialAttributes {
    @o0OO00OO
    public static TypedValue resolve(@oo0oO0 Context context, @o0O000Oo int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean resolveBoolean(@oo0oO0 Context context, @o0O000Oo int i, boolean z) {
        TypedValue resolve = resolve(context, i);
        return (resolve == null || resolve.type != 18) ? z : resolve.data != 0;
    }

    public static boolean resolveBooleanOrThrow(@oo0oO0 Context context, @o0O000Oo int i, @oo0oO0 String str) {
        return resolveOrThrow(context, i, str) != 0;
    }

    @o0OO0
    public static int resolveDimension(@oo0oO0 Context context, @o0O000Oo int i, @o0O00oO0 int i2) {
        TypedValue resolve = resolve(context, i);
        return (int) ((resolve == null || resolve.type != 5) ? context.getResources().getDimension(i2) : resolve.getDimension(context.getResources().getDisplayMetrics()));
    }

    @o0OO0
    public static int resolveMinimumAccessibleTouchTarget(@oo0oO0 Context context) {
        return resolveDimension(context, R.attr.minTouchTargetSize, R.dimen.mtrl_min_touch_target_size);
    }

    public static int resolveOrThrow(@oo0oO0 Context context, @o0O000Oo int i, @oo0oO0 String str) {
        TypedValue resolve = resolve(context, i);
        if (resolve != null) {
            return resolve.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static int resolveOrThrow(@oo0oO0 View view, @o0O000Oo int i) {
        return resolveOrThrow(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
