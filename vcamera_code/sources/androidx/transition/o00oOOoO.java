package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0o00;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class o00oOOoO extends o0O0Oo0o.o0O000O {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final float f4954o00oOoO = 70.0f;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final float f4955o00oOoO0 = 0.0f;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final float f4956o00oOoOO = (float) Math.tan(Math.toRadians(35.0d));

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public float f4957o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public float f4958o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public float f4959o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public float f4960o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public float f4961o00oOo0o;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public float f4962o00oOooO;

    public o00oOOoO() {
        this.f4957o00oOOo0 = 0.0f;
        this.f4958o00oOOoO = 0.0f;
        this.f4959o00oOo00 = 70.0f;
        this.f4962o00oOooO = 0.0f;
        this.f4960o00oOo0O = 0.0f;
        this.f4961o00oOo0o = f4956o00oOoOO;
    }

    @SuppressLint({"RestrictedApi"})
    public o00oOOoO(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4957o00oOOo0 = 0.0f;
        this.f4958o00oOOoO = 0.0f;
        this.f4959o00oOo00 = 70.0f;
        this.f4962o00oOooO = 0.0f;
        this.f4960o00oOo0O = 0.0f;
        this.f4961o00oOo0o = f4956o00oOoOO;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0O00000.f5121o00oOoOo);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        o00oOo0o(o0O0o00.o00oOoOo(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        o00oOo0O(o0O0o00.o00oOoOo(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        o00oOooO(o0O0o00.o00oOoOo(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }

    public static float o00oOoO0(float f) {
        if (f < 0.0f || f > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f / 2.0f));
    }

    @Override // o0O0Oo0o.o0O000O
    @oo0oO0
    public Path getPath(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        Path path = new Path();
        path.moveTo(f, f2);
        float f8 = f3 - f;
        float f9 = f4 - f2;
        float f10 = (f9 * f9) + (f8 * f8);
        float f11 = (f + f3) / 2.0f;
        float f12 = (f2 + f4) / 2.0f;
        float f13 = 0.25f * f10;
        boolean z = f2 > f4;
        if (Math.abs(f8) < Math.abs(f9)) {
            float abs = Math.abs(f10 / (f9 * 2.0f));
            if (z) {
                f6 = abs + f4;
                f5 = f3;
            } else {
                f6 = abs + f2;
                f5 = f;
            }
            f7 = this.f4960o00oOo0O;
        } else {
            float f14 = f10 / (f8 * 2.0f);
            if (z) {
                f6 = f2;
                f5 = f14 + f;
            } else {
                f5 = f3 - f14;
                f6 = f4;
            }
            f7 = this.f4962o00oOooO;
        }
        float f15 = f13 * f7 * f7;
        float f16 = f11 - f5;
        float f17 = f12 - f6;
        float f18 = (f17 * f17) + (f16 * f16);
        float f19 = this.f4961o00oOo0o;
        float f20 = f13 * f19 * f19;
        if (f18 >= f15) {
            f15 = f18 > f20 ? f20 : 0.0f;
        }
        if (f15 != 0.0f) {
            float sqrt = (float) Math.sqrt(f15 / f18);
            f5 = o00oOoO0.o00oOoO.o00oOOo0(f5, f11, sqrt, f11);
            f6 = o00oOoO0.o00oOoO.o00oOOo0(f6, f12, sqrt, f12);
        }
        path.cubicTo((f + f5) / 2.0f, (f2 + f6) / 2.0f, (f5 + f3) / 2.0f, (f6 + f4) / 2.0f, f3, f4);
        return path;
    }

    public float o00oOOo0() {
        return this.f4959o00oOo00;
    }

    public float o00oOOoO() {
        return this.f4957o00oOOo0;
    }

    public float o00oOo00() {
        return this.f4958o00oOOoO;
    }

    public void o00oOo0O(float f) {
        this.f4957o00oOOo0 = f;
        this.f4962o00oOooO = o00oOoO0(f);
    }

    public void o00oOo0o(float f) {
        this.f4958o00oOOoO = f;
        this.f4960o00oOo0O = o00oOoO0(f);
    }

    public void o00oOooO(float f) {
        this.f4959o00oOo00 = f;
        this.f4961o00oOo0o = o00oOoO0(f);
    }
}
