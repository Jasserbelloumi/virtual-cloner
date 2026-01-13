package o0O0Oo;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.v4.media.o00oOo0O;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import o00oOoO0.o00oOoO;
import o00oOoOo.o00oo;
import o00oOooO.o0OO0oO;
import o00oooOo.oOO0O0O0;
import org.xmlpull.v1.XmlPullParser;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o0O0o000 implements Interpolator {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final float f11660o00oOo00 = 0.002f;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final double f11661o00oOo0O = 1.0E-5d;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f11662o00oOooO = 3000;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public float[] f11663o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public float[] f11664o00oOOoO;

    public o0O0o000(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public o0O0o000(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray o00oo0o02 = o00ooo0o.o0O0o00.o00oo0o0(resources, theme, attributeSet, o0O0OO.f11624o0O00Ooo);
        o00oOooO(o00oo0o02, xmlPullParser);
        o00oo0o02.recycle();
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f11663o00oOOo0.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f11663o00oOOo0[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f11663o00oOOo0;
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        if (f4 == 0.0f) {
            return this.f11664o00oOOoO[i];
        }
        float[] fArr2 = this.f11664o00oOOoO;
        float f5 = fArr2[i];
        return o00oOoO.o00oOOo0(fArr2[length], f5, (f - f3) / f4, f5);
    }

    public final void o00oOOo0(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        o00oOOoO(path);
    }

    public final void o00oOOoO(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min((int) f11662o00oOooO, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f11663o00oOOo0 = new float[min];
        this.f11664o00oOOoO = new float[min];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < min; i2++) {
            pathMeasure.getPosTan((i2 * length) / (min - 1), fArr, null);
            this.f11663o00oOOo0[i2] = fArr[0];
            this.f11664o00oOOoO[i2] = fArr[1];
        }
        if (Math.abs(this.f11663o00oOOo0[0]) <= 1.0E-5d && Math.abs(this.f11664o00oOOoO[0]) <= 1.0E-5d) {
            int i3 = min - 1;
            if (Math.abs(this.f11663o00oOOo0[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.f11664o00oOOoO[i3] - 1.0f) <= 1.0E-5d) {
                float f = 0.0f;
                int i4 = 0;
                while (i < min) {
                    float[] fArr2 = this.f11663o00oOOo0;
                    int i5 = i4 + 1;
                    float f2 = fArr2[i4];
                    if (f2 < f) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                    }
                    fArr2[i] = f2;
                    i++;
                    f = f2;
                    i4 = i5;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("The Path must start at (0,0) and end at (1,1) start: ");
        o00oOOo02.append(this.f11663o00oOOo0[0]);
        o00oOOo02.append(",");
        o00oOOo02.append(this.f11664o00oOOoO[0]);
        o00oOOo02.append(" end:");
        int i6 = min - 1;
        o00oOOo02.append(this.f11663o00oOOo0[i6]);
        o00oOOo02.append(",");
        o00oOOo02.append(this.f11664o00oOOoO[i6]);
        throw new IllegalArgumentException(o00oOOo02.toString());
    }

    public final void o00oOo00(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        o00oOOoO(path);
    }

    public final void o00oOooO(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (o00ooo0o.o0O0o00.o00oo0Oo(xmlPullParser, "pathData")) {
            String o00oo00O2 = o00ooo0o.o0O0o00.o00oo00O(typedArray, xmlPullParser, "pathData", 4);
            Path o00oOo0O2 = oOO0O0O0.o00oOo0O(o00oo00O2);
            if (o00oOo0O2 == null) {
                throw new InflateException(o00oo.o00oOOo0("The path is null, which is created from ", o00oo00O2));
            }
            o00oOOoO(o00oOo0O2);
        } else if (!o00ooo0o.o0O0o00.o00oo0Oo(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else {
            if (!o00ooo0o.o0O0o00.o00oo0Oo(xmlPullParser, "controlY1")) {
                throw new InflateException("pathInterpolator requires the controlY1 attribute");
            }
            float o00oOoOo2 = o00ooo0o.o0O0o00.o00oOoOo(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float o00oOoOo3 = o00ooo0o.o0O0o00.o00oOoOo(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean o00oo0Oo2 = o00ooo0o.o0O0o00.o00oo0Oo(xmlPullParser, "controlX2");
            if (o00oo0Oo2 != o00ooo0o.o0O0o00.o00oo0Oo(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            if (o00oo0Oo2) {
                o00oOOo0(o00oOoOo2, o00oOoOo3, o00ooo0o.o0O0o00.o00oOoOo(typedArray, xmlPullParser, "controlX2", 2, 0.0f), o00ooo0o.o0O0o00.o00oOoOo(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            } else {
                o00oOo00(o00oOoOo2, o00oOoOo3);
            }
        }
    }
}
