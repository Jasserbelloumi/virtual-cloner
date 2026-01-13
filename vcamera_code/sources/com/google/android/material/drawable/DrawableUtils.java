package com.google.android.material.drawable;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.support.v4.media.o00oOo0O;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0oo0000;
import o00oOooO.oo0oO0;
import org.xmlpull.v1.XmlPullParserException;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class DrawableUtils {
    private DrawableUtils() {
    }

    @oo0oO0
    public static AttributeSet parseDrawableXml(@oo0oO0 Context context, @o0oo0000 int i, @oo0oO0 CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                if (TextUtils.equals(xml.getName(), charSequence)) {
                    return Xml.asAttributeSet(xml);
                }
                throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e) {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Can't load badge resource ID #0x");
            o00oOOo02.append(Integer.toHexString(i));
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(o00oOOo02.toString());
            notFoundException.initCause(e);
            throw notFoundException;
        }
    }

    @TargetApi(21)
    public static void setRippleDrawableRadius(@o0OO00OO RippleDrawable rippleDrawable, int i) {
        rippleDrawable.setRadius(i);
    }

    @o0OO00OO
    public static PorterDuffColorFilter updateTintFilter(@oo0oO0 Drawable drawable, @o0OO00OO ColorStateList colorStateList, @o0OO00OO PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
