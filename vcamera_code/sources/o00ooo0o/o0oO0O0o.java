package o00ooo0o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import o00oOooO.o0O00O;
import o00oOooO.o0O00OOO;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0oo0000;
import o00oOooO.oo0oO0;
import o0O0000O.o00oOOo0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class o0oO0O0o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f9774o00oOOo0 = new ThreadLocal<>();

    @oo0oO0
    public static ColorStateList o00oOOo0(@oo0oO0 Resources resources, @oo0oO0 XmlPullParser xmlPullParser, @o0OO00OO Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return o00oOOoO(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @oo0oO0
    public static ColorStateList o00oOOoO(@oo0oO0 Resources resources, @oo0oO0 XmlPullParser xmlPullParser, @oo0oO0 AttributeSet attributeSet, @o0OO00OO Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return o00oOo0O(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    @oo0oO0
    public static TypedValue o00oOo00() {
        ThreadLocal<TypedValue> threadLocal = f9774o00oOOo0;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
        if (r9.hasValue(r12) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r9.hasValue(r12) != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList o00oOo0O(@o00oOooO.oo0oO0 android.content.res.Resources r17, @o00oOooO.oo0oO0 org.xmlpull.v1.XmlPullParser r18, @o00oOooO.oo0oO0 android.util.AttributeSet r19, @o00oOooO.o0OO00OO android.content.res.Resources.Theme r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooo0o.o0oO0O0o.o00oOo0O(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    public static boolean o00oOo0o(@oo0oO0 Resources resources, @o0O00OOO int i) {
        TypedValue o00oOo002 = o00oOo00();
        resources.getValue(i, o00oOo002, true);
        int i2 = o00oOo002.type;
        return i2 >= 28 && i2 <= 31;
    }

    public static TypedArray o00oOoO(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @o0O00O
    public static int o00oOoO0(@o0O00O int i, @o00oOooO.o0O0OO0(from = 0.0d, to = 1.0d) float f, @o00oOooO.o0O0OO0(from = 0.0d, to = 100.0d) float f2) {
        boolean z = f2 >= 0.0f && f2 <= 100.0f;
        if (f != 1.0f || z) {
            int o00oOo0O2 = o00oOOo0.o00oOo0O((int) ((Color.alpha(i) * f) + 0.5f), 0, 255);
            if (z) {
                o0O00oO0 o00oOo002 = o0O00oO0.o00oOo00(i);
                i = o0O00oO0.o00oo0O0(o00oOo002.o00oOoOo(), o00oOo002.o00oOoOO(), f2);
            }
            return (i & 16777215) | (o00oOo0O2 << 24);
        }
        return i;
    }

    @o0OO00OO
    public static ColorStateList o00oOooO(@oo0oO0 Resources resources, @o0oo0000 int i, @o0OO00OO Resources.Theme theme) {
        try {
            return o00oOOo0(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }
}
