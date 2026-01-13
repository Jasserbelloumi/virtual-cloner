package o00ooOO;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.widget.R;
import o00ooO00.o0O000Oo;
/* loaded from: classes.dex */
public class o00oOoO extends o00oOo0O {

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final String f8848o00ooOoO = "MotionTelltales";

    /* renamed from: o00ooO  reason: collision with root package name */
    public o0O000Oo f8849o00ooO;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public Paint f8850o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public Matrix f8851o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public float[] f8852o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public int f8853o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public float f8854o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public int f8855o00ooOo0;

    public o00oOoO(Context context) {
        super(context);
        this.f8850o00ooO0o = new Paint();
        this.f8852o00ooOO0 = new float[2];
        this.f8851o00ooOO = new Matrix();
        this.f8853o00ooOOo = 0;
        this.f8855o00ooOo0 = -65281;
        this.f8854o00ooOo = 0.25f;
        o00oOOo0(context, null);
    }

    public o00oOoO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8850o00ooO0o = new Paint();
        this.f8852o00ooOO0 = new float[2];
        this.f8851o00ooOO = new Matrix();
        this.f8853o00ooOOo = 0;
        this.f8855o00ooOo0 = -65281;
        this.f8854o00ooOo = 0.25f;
        o00oOOo0(context, attributeSet);
    }

    public o00oOoO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8850o00ooO0o = new Paint();
        this.f8852o00ooOO0 = new float[2];
        this.f8851o00ooOO = new Matrix();
        this.f8853o00ooOOo = 0;
        this.f8855o00ooOo0 = -65281;
        this.f8854o00ooOo = 0.25f;
        o00oOOo0(context, attributeSet);
    }

    private void o00oOOo0(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MotionTelltales);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.MotionTelltales_telltales_tailColor) {
                    this.f8855o00ooOo0 = obtainStyledAttributes.getColor(index, this.f8855o00ooOo0);
                } else if (index == R.styleable.MotionTelltales_telltales_velocityMode) {
                    this.f8853o00ooOOo = obtainStyledAttributes.getInt(index, this.f8853o00ooOOo);
                } else if (index == R.styleable.MotionTelltales_telltales_tailScale) {
                    this.f8854o00ooOo = obtainStyledAttributes.getFloat(index, this.f8854o00ooOo);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f8850o00ooO0o.setColor(this.f8855o00ooOo0);
        this.f8850o00ooO0o.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // o00ooOO.o00oOo0O, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f8851o00ooOO);
        if (this.f8849o00ooO == null) {
            ViewParent parent = getParent();
            if (parent instanceof o0O000Oo) {
                this.f8849o00ooO = (o0O000Oo) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i = 0; i < 5; i++) {
            float f = fArr[i];
            for (int i2 = 0; i2 < 5; i2++) {
                float f2 = fArr[i2];
                this.f8849o00ooO.o00oooOo(this, f2, f, this.f8852o00ooOO0, this.f8853o00ooOOo);
                this.f8851o00ooOO.mapVectors(this.f8852o00ooOO0);
                float f3 = width * f2;
                float f4 = height * f;
                float[] fArr2 = this.f8852o00ooOO0;
                float f5 = fArr2[0];
                float f6 = this.f8854o00ooOo;
                float f7 = f4 - (fArr2[1] * f6);
                this.f8851o00ooOO.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f7, this.f8850o00ooO0o);
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f8843o00oo0oO = charSequence.toString();
        requestLayout();
    }
}
