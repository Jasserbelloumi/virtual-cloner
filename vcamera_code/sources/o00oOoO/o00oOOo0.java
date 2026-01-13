package o00oOoO;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.io.IOException;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class o00oOOo0 {

    @o0OOooO0(15)
    /* renamed from: o00oOoO.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0100o00oOOo0 {
        @o0O0O0Oo
        public static void o00oOOo0(@oo0oO0 Resources resources, int i, int i2, @oo0oO0 TypedValue typedValue, boolean z) {
            resources.getValueForDensity(i, i2, typedValue, z);
        }
    }

    @o0OOooO0(18)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static void o00oOOo0(@oo0oO0 ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o0O0O0Oo
        @oo0oO0
        public static Drawable o00oOOo0(@oo0oO0 Resources resources, @oo0oO0 XmlPullParser xmlPullParser, @oo0oO0 AttributeSet attributeSet, @o0OO00OO Resources.Theme theme) throws IOException, XmlPullParserException {
            return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }

        @o0O0O0Oo
        public static int o00oOOoO(@oo0oO0 TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @o0O0O0Oo
        public static void o00oOo00(@oo0oO0 Drawable drawable, @oo0oO0 Resources resources, @oo0oO0 XmlPullParser xmlPullParser, @oo0oO0 AttributeSet attributeSet, @o0OO00OO Resources.Theme theme) throws IOException, XmlPullParserException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }
    }
}
