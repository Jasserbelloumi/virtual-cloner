package o00ooo0o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.core.R;
import java.io.IOException;
import java.util.List;
import o00oOooO.o0O00O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class o0ooO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f9775o00oOOo0 = 0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f9776o00oOOoO = 1;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f9777o00oOo00 = 2;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final int[] f9778o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final float[] f9779o00oOOoO;

        public o00oOOo0(@o0O00O int i, @o0O00O int i2) {
            this.f9778o00oOOo0 = new int[]{i, i2};
            this.f9779o00oOOoO = new float[]{0.0f, 1.0f};
        }

        public o00oOOo0(@o0O00O int i, @o0O00O int i2, @o0O00O int i3) {
            this.f9778o00oOOo0 = new int[]{i, i2, i3};
            this.f9779o00oOOoO = new float[]{0.0f, 0.5f, 1.0f};
        }

        public o00oOOo0(@oo0oO0 List<Integer> list, @oo0oO0 List<Float> list2) {
            int size = list.size();
            this.f9778o00oOOo0 = new int[size];
            this.f9779o00oOOoO = new float[size];
            for (int i = 0; i < size; i++) {
                this.f9778o00oOOo0[i] = list.get(i).intValue();
                this.f9779o00oOOoO[i] = list2.get(i).floatValue();
            }
        }
    }

    public static o00oOOo0 o00oOOo0(@o0OO00OO o00oOOo0 o00oooo02, @o0O00O int i, @o0O00O int i2, boolean z, @o0O00O int i3) {
        return o00oooo02 != null ? o00oooo02 : z ? new o00oOOo0(i, i3, i2) : new o00oOOo0(i, i2);
    }

    public static Shader o00oOOoO(@oo0oO0 Resources resources, @oo0oO0 XmlPullParser xmlPullParser, @o0OO00OO Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return o00oOo00(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static Shader o00oOo00(@oo0oO0 Resources resources, @oo0oO0 XmlPullParser xmlPullParser, @oo0oO0 AttributeSet attributeSet, @o0OO00OO Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray o00oo0o02 = o0O0o00.o00oo0o0(resources, theme, attributeSet, R.styleable.GradientColor);
        float o00oOoOo2 = o0O0o00.o00oOoOo(o00oo0o02, xmlPullParser, "startX", R.styleable.GradientColor_android_startX, 0.0f);
        float o00oOoOo3 = o0O0o00.o00oOoOo(o00oo0o02, xmlPullParser, "startY", R.styleable.GradientColor_android_startY, 0.0f);
        float o00oOoOo4 = o0O0o00.o00oOoOo(o00oo0o02, xmlPullParser, "endX", R.styleable.GradientColor_android_endX, 0.0f);
        float o00oOoOo5 = o0O0o00.o00oOoOo(o00oo0o02, xmlPullParser, "endY", R.styleable.GradientColor_android_endY, 0.0f);
        float o00oOoOo6 = o0O0o00.o00oOoOo(o00oo0o02, xmlPullParser, "centerX", R.styleable.GradientColor_android_centerX, 0.0f);
        float o00oOoOo7 = o0O0o00.o00oOoOo(o00oo0o02, xmlPullParser, "centerY", R.styleable.GradientColor_android_centerY, 0.0f);
        int o00oOoo02 = o0O0o00.o00oOoo0(o00oo0o02, xmlPullParser, "type", R.styleable.GradientColor_android_type, 0);
        int o00oOo0o2 = o0O0o00.o00oOo0o(o00oo0o02, xmlPullParser, "startColor", R.styleable.GradientColor_android_startColor, 0);
        boolean o00oo0Oo2 = o0O0o00.o00oo0Oo(xmlPullParser, "centerColor");
        int o00oOo0o3 = o0O0o00.o00oOo0o(o00oo0o02, xmlPullParser, "centerColor", R.styleable.GradientColor_android_centerColor, 0);
        int o00oOo0o4 = o0O0o00.o00oOo0o(o00oo0o02, xmlPullParser, "endColor", R.styleable.GradientColor_android_endColor, 0);
        int o00oOoo03 = o0O0o00.o00oOoo0(o00oo0o02, xmlPullParser, "tileMode", R.styleable.GradientColor_android_tileMode, 0);
        float o00oOoOo8 = o0O0o00.o00oOoOo(o00oo0o02, xmlPullParser, "gradientRadius", R.styleable.GradientColor_android_gradientRadius, 0.0f);
        o00oo0o02.recycle();
        o00oOOo0 o00oOOo02 = o00oOOo0(o00oOooO(resources, xmlPullParser, attributeSet, theme), o00oOo0o2, o00oOo0o4, o00oo0Oo2, o00oOo0o3);
        if (o00oOoo02 != 1) {
            return o00oOoo02 != 2 ? new LinearGradient(o00oOoOo2, o00oOoOo3, o00oOoOo4, o00oOoOo5, o00oOOo02.f9778o00oOOo0, o00oOOo02.f9779o00oOOoO, o00oOo0O(o00oOoo03)) : new SweepGradient(o00oOoOo6, o00oOoOo7, o00oOOo02.f9778o00oOOo0, o00oOOo02.f9779o00oOOoO);
        } else if (o00oOoOo8 > 0.0f) {
            return new RadialGradient(o00oOoOo6, o00oOoOo7, o00oOoOo8, o00oOOo02.f9778o00oOOo0, o00oOOo02.f9779o00oOOoO, o00oOo0O(o00oOoo03));
        } else {
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
    }

    public static Shader.TileMode o00oOo0O(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o00ooo0o.o0ooO.o00oOOo0 o00oOooO(@o00oOooO.oo0oO0 android.content.res.Resources r9, @o00oOooO.oo0oO0 org.xmlpull.v1.XmlPullParser r10, @o00oOooO.oo0oO0 android.util.AttributeSet r11, @o00oOooO.o0OO00OO android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = androidx.core.R.styleable.GradientColorItem
            android.content.res.TypedArray r3 = o00ooo0o.o0O0o00.o00oo0o0(r9, r12, r11, r3)
            int r5 = androidx.core.R.styleable.GradientColorItem_android_color
            boolean r6 = r3.hasValue(r5)
            int r7 = androidx.core.R.styleable.GradientColorItem_android_offset
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            o00ooo0o.o0ooO$o00oOOo0 r9 = new o00ooo0o.o0ooO$o00oOOo0
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooo0o.o0ooO.o00oOooO(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):o00ooo0o.o0ooO$o00oOOo0");
    }
}
