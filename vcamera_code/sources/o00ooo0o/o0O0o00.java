package o00ooo0o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import o00oOooO.o0O000;
import o00oOooO.o0O00O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOOO00;
import o00oOooO.oo0oO0;
import org.xmlpull.v1.XmlPullParser;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o0O0o00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f9758o00oOOo0 = "http://schemas.android.com/apk/res/android";

    public static int o00oOOo0(@oo0oO0 Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static boolean o00oOOoO(@oo0oO0 TypedArray typedArray, @o0OOOO00 int i, @o0OOOO00 int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    @o0OO00OO
    public static Drawable o00oOo00(@oo0oO0 TypedArray typedArray, @o0OOOO00 int i, @o0OOOO00 int i2) {
        Drawable drawable = typedArray.getDrawable(i);
        return drawable == null ? typedArray.getDrawable(i2) : drawable;
    }

    public static boolean o00oOo0O(@oo0oO0 TypedArray typedArray, @oo0oO0 XmlPullParser xmlPullParser, @oo0oO0 String str, @o0OOOO00 int i, boolean z) {
        return !o00oo0Oo(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    @o0O00O
    public static int o00oOo0o(@oo0oO0 TypedArray typedArray, @oo0oO0 XmlPullParser xmlPullParser, @oo0oO0 String str, @o0OOOO00 int i, @o0O00O int i2) {
        return !o00oo0Oo(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    @oo0oO0
    public static ColorStateList o00oOoO(@oo0oO0 TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    @o0OO00OO
    public static ColorStateList o00oOoO0(@oo0oO0 TypedArray typedArray, @oo0oO0 XmlPullParser xmlPullParser, @o0OO00OO Resources.Theme theme, @oo0oO0 String str, @o0OOOO00 int i) {
        if (o00oo0Oo(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 != 2) {
                return (i2 < 28 || i2 > 31) ? o0oO0O0o.o00oOooO(typedArray.getResources(), typedArray.getResourceId(i, 0), theme) : o00oOoO(typedValue);
            }
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        }
        return null;
    }

    public static o0O0oo0o o00oOoOO(@oo0oO0 TypedArray typedArray, @oo0oO0 XmlPullParser xmlPullParser, @o0OO00OO Resources.Theme theme, @oo0oO0 String str, @o0OOOO00 int i, @o0O00O int i2) {
        if (o00oo0Oo(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return o0O0oo0o.o00oOOoO(typedValue.data);
            }
            o0O0oo0o o00oOoO02 = o0O0oo0o.o00oOoO0(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (o00oOoO02 != null) {
                return o00oOoO02;
            }
        }
        return o0O0oo0o.o00oOOoO(i2);
    }

    public static float o00oOoOo(@oo0oO0 TypedArray typedArray, @oo0oO0 XmlPullParser xmlPullParser, @oo0oO0 String str, @o0OOOO00 int i, float f) {
        return !o00oo0Oo(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int o00oOoo0(@oo0oO0 TypedArray typedArray, @oo0oO0 XmlPullParser xmlPullParser, @oo0oO0 String str, @o0OOOO00 int i, int i2) {
        return !o00oo0Oo(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static int o00oOooO(@oo0oO0 TypedArray typedArray, @o0OOOO00 int i, @o0OOOO00 int i2, int i3) {
        return typedArray.getInt(i, typedArray.getInt(i2, i3));
    }

    @o0O000
    public static int o00oOooo(@oo0oO0 TypedArray typedArray, @oo0oO0 XmlPullParser xmlPullParser, @oo0oO0 String str, @o0OOOO00 int i, @o0O000 int i2) {
        return !o00oo0Oo(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    @o0O000
    public static int o00oo0(@oo0oO0 TypedArray typedArray, @o0OOOO00 int i, @o0OOOO00 int i2, @o0O000 int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    @o0OO00OO
    public static String o00oo00O(@oo0oO0 TypedArray typedArray, @oo0oO0 XmlPullParser xmlPullParser, @oo0oO0 String str, @o0OOOO00 int i) {
        if (o00oo0Oo(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    @o0OO00OO
    public static CharSequence[] o00oo0O(@oo0oO0 TypedArray typedArray, @o0OOOO00 int i, @o0OOOO00 int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    @o0OO00OO
    public static CharSequence o00oo0O0(@oo0oO0 TypedArray typedArray, @o0OOOO00 int i, @o0OOOO00 int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    @o0OO00OO
    public static String o00oo0OO(@oo0oO0 TypedArray typedArray, @o0OOOO00 int i, @o0OOOO00 int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static boolean o00oo0Oo(@oo0oO0 XmlPullParser xmlPullParser, @oo0oO0 String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    @o0OO00OO
    public static TypedValue o00oo0o(@oo0oO0 TypedArray typedArray, @oo0oO0 XmlPullParser xmlPullParser, @oo0oO0 String str, int i) {
        if (o00oo0Oo(xmlPullParser, str)) {
            return typedArray.peekValue(i);
        }
        return null;
    }

    @oo0oO0
    public static TypedArray o00oo0o0(@oo0oO0 Resources resources, @o0OO00OO Resources.Theme theme, @oo0oO0 AttributeSet attributeSet, @oo0oO0 int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
