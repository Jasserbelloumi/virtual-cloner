package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.gms.common.annotation.KeepForSdk;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public class ViewUtils {
    private ViewUtils() {
    }

    @o0OO00OO
    @KeepForSdk
    public static String getXmlAttributeString(@oo0oO0 String str, @oo0oO0 String str2, @oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet, boolean z, boolean z2, @oo0oO0 String str3) {
        String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue != null && attributeValue.startsWith("@string/") && z) {
            String substring = attributeValue.substring(8);
            String packageName = context.getPackageName();
            TypedValue typedValue = new TypedValue();
            try {
                Resources resources = context.getResources();
                resources.getValue(packageName + ":string/" + substring, typedValue, true);
            } catch (Resources.NotFoundException unused) {
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                return charSequence.toString();
            }
            typedValue.toString();
            return attributeValue;
        }
        return attributeValue;
    }
}
