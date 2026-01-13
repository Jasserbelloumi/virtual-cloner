package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0o00;
import o00oooOo.oOO0O0O0;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class o00ooO0 extends o0O0Oo0o.o0O000O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public Path f5098o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Path f5099o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Matrix f5100o00oOo00;

    public o00ooO0() {
        Path path = new Path();
        this.f5099o00oOOoO = path;
        this.f5100o00oOo00 = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.f5098o00oOOo0 = path;
    }

    @SuppressLint({"RestrictedApi"})
    public o00ooO0(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet) {
        this.f5099o00oOOoO = new Path();
        this.f5100o00oOo00 = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0O00000.f5122o00oOoo0);
        try {
            String o00oo00O2 = o0O0o00.o00oo00O(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (o00oo00O2 == null) {
                throw new RuntimeException("pathData must be supplied for patternPathMotion");
            }
            o00oOo00(oOO0O0O0.o00oOo0O(o00oo00O2));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public o00ooO0(Path path) {
        this.f5099o00oOOoO = new Path();
        this.f5100o00oOo00 = new Matrix();
        o00oOo00(path);
    }

    public static float o00oOOo0(float f, float f2) {
        return (float) Math.sqrt((f2 * f2) + (f * f));
    }

    @Override // o0O0Oo0o.o0O000O
    @oo0oO0
    public Path getPath(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float o00oOOo02 = o00oOOo0(f5, f6);
        double atan2 = Math.atan2(f6, f5);
        this.f5100o00oOo00.setScale(o00oOOo02, o00oOOo02);
        this.f5100o00oOo00.postRotate((float) Math.toDegrees(atan2));
        this.f5100o00oOo00.postTranslate(f, f2);
        Path path = new Path();
        this.f5099o00oOOoO.transform(this.f5100o00oOo00, path);
        return path;
    }

    public Path o00oOOoO() {
        return this.f5098o00oOOo0;
    }

    public void o00oOo00(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f5100o00oOo00.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float o00oOOo02 = 1.0f / o00oOOo0(f5, f6);
        this.f5100o00oOo00.postScale(o00oOOo02, o00oOOo02);
        this.f5100o00oOo00.postRotate((float) Math.toDegrees(-Math.atan2(f6, f5)));
        path.transform(this.f5100o00oOo00, this.f5099o00oOOoO);
        this.f5098o00oOOo0 = path;
    }
}
