package o00oooo0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.lang.reflect.Method;
import o00oOooO.o0O00O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class o0O0O0Oo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f9884o00oOOo0 = "DrawableCompat";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static Method f9885o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static boolean f9886o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static boolean f9887o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static Method f9888o00oOooO;

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static int o00oOOo0(Drawable drawable) {
            return drawable.getAlpha();
        }

        @o00oOooO.o0O0O0Oo
        public static Drawable o00oOOoO(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
            return drawableContainerState.getChild(i);
        }

        @o00oOooO.o0O0O0Oo
        public static Drawable o00oOo00(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo0O(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOooO(Drawable drawable) {
            return drawable.isAutoMirrored();
        }
    }

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o00oOooO.o0O0O0Oo
        public static void o00oOOo0(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOOoO(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @o00oOooO.o0O0O0Oo
        public static ColorFilter o00oOo00(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo0O(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo0o(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOoO(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOoO0(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOoOO(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOooO(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }
    }

    @o0OOooO0(23)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o00oOooO.o0O0O0Oo
        public static int o00oOOo0(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOOoO(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    public static void o00oOOo0(@oo0oO0 Drawable drawable, @oo0oO0 Resources.Theme theme) {
        o00oOOoO.o00oOOo0(drawable, theme);
    }

    public static boolean o00oOOoO(@oo0oO0 Drawable drawable) {
        return o00oOOoO.o00oOOoO(drawable);
    }

    public static void o00oOo00(@oo0oO0 Drawable drawable) {
        drawable.clearColorFilter();
    }

    @o0OO00OO
    public static ColorFilter o00oOo0O(@oo0oO0 Drawable drawable) {
        return o00oOOoO.o00oOo00(drawable);
    }

    public static int o00oOo0o(@oo0oO0 Drawable drawable) {
        return o00oOo00.o00oOOo0(drawable);
    }

    public static boolean o00oOoO(@oo0oO0 Drawable drawable) {
        return o00oOOo0.o00oOooO(drawable);
    }

    public static void o00oOoO0(@oo0oO0 Drawable drawable, @oo0oO0 Resources resources, @oo0oO0 XmlPullParser xmlPullParser, @oo0oO0 AttributeSet attributeSet, @o0OO00OO Resources.Theme theme) throws XmlPullParserException, IOException {
        o00oOOoO.o00oOooO(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    @Deprecated
    public static void o00oOoOO(@oo0oO0 Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void o00oOoOo(@oo0oO0 Drawable drawable, boolean z) {
        o00oOOo0.o00oOo0O(drawable, z);
    }

    public static void o00oOoo0(@oo0oO0 Drawable drawable, float f, float f2) {
        o00oOOoO.o00oOo0O(drawable, f, f2);
    }

    public static int o00oOooO(@oo0oO0 Drawable drawable) {
        return o00oOOo0.o00oOOo0(drawable);
    }

    public static void o00oOooo(@oo0oO0 Drawable drawable, int i, int i2, int i3, int i4) {
        o00oOOoO.o00oOo0o(drawable, i, i2, i3, i4);
    }

    public static void o00oo0(@oo0oO0 Drawable drawable, @o0O00O int i) {
        o00oOOoO.o00oOoO0(drawable, i);
    }

    public static boolean o00oo00O(@oo0oO0 Drawable drawable, int i) {
        return o00oOo00.o00oOOoO(drawable, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T o00oo0O(@oo0oO0 Drawable drawable) {
        return drawable instanceof o0OooO0 ? (T) ((o0OooO0) drawable).o00oOOo0() : drawable;
    }

    public static void o00oo0O0(@oo0oO0 Drawable drawable, @o0OO00OO PorterDuff.Mode mode) {
        o00oOOoO.o00oOoOO(drawable, mode);
    }

    public static void o00oo0OO(@oo0oO0 Drawable drawable, @o0OO00OO ColorStateList colorStateList) {
        o00oOOoO.o00oOoO(drawable, colorStateList);
    }

    @oo0oO0
    public static Drawable o00oo0Oo(@oo0oO0 Drawable drawable) {
        return drawable;
    }
}
