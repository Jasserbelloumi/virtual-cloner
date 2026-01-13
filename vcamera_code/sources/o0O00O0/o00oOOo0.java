package o0O00O0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import o00oOoO0.o00oOoO;
/* loaded from: classes.dex */
public class o00oOOo0 implements Interpolator {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final float f10876o00oOo00 = 0.002f;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final float[] f10877o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final float[] f10878o00oOOoO;

    public o00oOOo0(float f, float f2) {
        this(o00oOOoO(f, f2));
    }

    public o00oOOo0(float f, float f2, float f3, float f4) {
        this(o00oOOo0(f, f2, f3, f4));
    }

    public o00oOOo0(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.f10877o00oOOo0 = new float[i];
        this.f10878o00oOOoO = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((i2 * length) / (i - 1), fArr, null);
            this.f10877o00oOOo0[i2] = fArr[0];
            this.f10878o00oOOoO[i2] = fArr[1];
        }
    }

    public static Path o00oOOo0(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }

    public static Path o00oOOoO(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        return path;
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
        int length = this.f10877o00oOOo0.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f10877o00oOOo0[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f10877o00oOOo0;
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        if (f4 == 0.0f) {
            return this.f10878o00oOOoO[i];
        }
        float[] fArr2 = this.f10878o00oOOoO;
        float f5 = fArr2[i];
        return o00oOoO.o00oOOo0(fArr2[length], f5, (f - f3) / f4, f5);
    }
}
