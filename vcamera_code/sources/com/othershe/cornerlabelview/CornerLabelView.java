package com.othershe.cornerlabelview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import o0.o00oOOo0;
/* loaded from: classes2.dex */
public class CornerLabelView extends View {

    /* renamed from: o00oo  reason: collision with root package name */
    public int f6536o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public Paint f6537o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f6538o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public TextPaint f6539o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public int f6540o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public Path f6541o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public int f6542o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public int f6543o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public String f6544o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public int f6545o00ooO0O;

    /* renamed from: o0O0o  reason: collision with root package name */
    public int f6546o0O0o;

    public CornerLabelView(Context context) {
        this(context, null);
    }

    public CornerLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6542o00oo0oO = (int) TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics());
        this.f6546o0O0o = (int) TypedValue.applyDimension(2, 14.0f, getResources().getDisplayMetrics());
        this.f6536o00oo = -1;
        this.f6543o00ooO0 = o00oOOo0.f6865o00oOo00;
        this.f6545o00ooO0O = -1;
        o00oOOoO(context, attributeSet);
        o00oOOo0();
    }

    public final void o00oOOo0() {
        this.f6541o00oo0o0 = new Path();
        Paint paint = new Paint();
        this.f6537o00oo0O = paint;
        paint.setAntiAlias(true);
        this.f6537o00oo0O.setColor(this.f6543o00ooO0);
        TextPaint textPaint = new TextPaint();
        this.f6539o00oo0Oo = textPaint;
        textPaint.setAntiAlias(true);
        this.f6539o00oo0Oo.setColor(this.f6536o00oo);
        this.f6539o00oo0Oo.setTextSize(this.f6546o0O0o);
    }

    public final void o00oOOoO(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CornerLabelView, 0, 0);
        for (int i = 0; i < obtainStyledAttributes.getIndexCount(); i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == R.styleable.CornerLabelView_position) {
                this.f6540o00oo0o = obtainStyledAttributes.getInt(index, 0);
            } else if (index == R.styleable.CornerLabelView_side_length) {
                this.f6542o00oo0oO = obtainStyledAttributes.getDimensionPixelSize(index, this.f6542o00oo0oO);
            } else if (index == R.styleable.CornerLabelView_text_size) {
                this.f6546o0O0o = obtainStyledAttributes.getDimensionPixelSize(index, this.f6546o0O0o);
            } else if (index == R.styleable.CornerLabelView_text_color) {
                this.f6536o00oo = obtainStyledAttributes.getColor(index, this.f6536o00oo);
            } else if (index == R.styleable.CornerLabelView_text) {
                this.f6544o00ooO00 = obtainStyledAttributes.getString(index);
            } else if (index == R.styleable.CornerLabelView_bg_color) {
                this.f6543o00ooO0 = obtainStyledAttributes.getColor(index, this.f6543o00ooO0);
            } else if (index == R.styleable.CornerLabelView_margin_lean_side) {
                this.f6545o00ooO0O = obtainStyledAttributes.getDimensionPixelSize(index, this.f6545o00ooO0O);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public CornerLabelView o00oOo00(int i) {
        this.f6537o00oo0O.setColor(i);
        invalidate();
        return this;
    }

    public CornerLabelView o00oOo0O(int i) {
        this.f6544o00ooO00 = getResources().getString(i);
        invalidate();
        return this;
    }

    public CornerLabelView o00oOo0o(String str) {
        this.f6544o00ooO00 = str;
        invalidate();
        return this;
    }

    public CornerLabelView o00oOoO(int i) {
        int color = getResources().getColor(i);
        this.f6536o00oo = color;
        this.f6539o00oo0Oo.setColor(color);
        invalidate();
        return this;
    }

    public CornerLabelView o00oOoO0(int i) {
        this.f6539o00oo0Oo.setColor(i);
        invalidate();
        return this;
    }

    public CornerLabelView o00oOooO(int i) {
        int color = getResources().getColor(i);
        this.f6543o00ooO0 = color;
        this.f6537o00oo0O.setColor(color);
        invalidate();
        return this;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        super.onDraw(canvas);
        int i5 = this.f6538o00oo0O0;
        canvas.translate(i5, i5);
        canvas.rotate(this.f6540o00oo0o * 90);
        int i6 = this.f6542o00oo0oO;
        int i7 = this.f6538o00oo0O0;
        if (i6 > i7 * 2) {
            this.f6542o00oo0oO = i7 * 2;
        }
        this.f6541o00oo0o0.moveTo(-i7, -i7);
        Path path = this.f6541o00oo0o0;
        int i8 = this.f6542o00oo0oO;
        int i9 = this.f6538o00oo0O0;
        path.lineTo(i8 - i9, -i9);
        this.f6541o00oo0o0.lineTo(this.f6538o00oo0O0, i - this.f6542o00oo0oO);
        Path path2 = this.f6541o00oo0o0;
        int i10 = this.f6538o00oo0O0;
        path2.lineTo(i10, i10);
        this.f6541o00oo0o0.close();
        canvas.drawPath(this.f6541o00oo0o0, this.f6537o00oo0O);
        canvas.rotate(45.0f);
        int sqrt = (int) ((Math.sqrt(2.0d) / 2.0d) * this.f6542o00oo0oO);
        int i11 = (int) (-(this.f6539o00oo0Oo.descent() + this.f6539o00oo0Oo.ascent()));
        int i12 = ((int) (-this.f6539o00oo0Oo.measureText(this.f6544o00ooO00))) / 2;
        int i13 = this.f6545o00ooO0O;
        if (i13 >= 0) {
            int i14 = this.f6540o00oo0o;
            if (i14 == 1 || i14 == 2) {
                float f = sqrt;
                int i15 = sqrt - i11;
                if (f - (i13 - this.f6539o00oo0Oo.ascent()) < i15 / 2) {
                    i2 = -i15;
                } else {
                    i3 = (int) (-(f - (this.f6545o00ooO0O - this.f6539o00oo0Oo.ascent())));
                }
            } else {
                if (i13 < this.f6539o00oo0Oo.descent()) {
                    this.f6545o00ooO0O = (int) this.f6539o00oo0Oo.descent();
                }
                int i16 = (sqrt - i11) / 2;
                if (this.f6545o00ooO0O > i16) {
                    this.f6545o00ooO0O = i16;
                }
                i3 = -this.f6545o00ooO0O;
            }
            i4 = this.f6540o00oo0o;
            if (i4 != 1 || i4 == 2) {
                canvas.translate(0.0f, (float) (((-Math.sqrt(2.0d)) / 2.0d) * this.f6542o00oo0oO));
                canvas.scale(-1.0f, -1.0f);
            }
            canvas.drawText(this.f6544o00ooO00, i12, i3, this.f6539o00oo0Oo);
        }
        int i17 = this.f6542o00oo0oO;
        int i18 = this.f6538o00oo0O0;
        if (i17 > i18) {
            this.f6542o00oo0oO = i18;
        }
        i2 = (int) ((((-Math.sqrt(2.0d)) / 2.0d) * this.f6542o00oo0oO) + i11);
        i3 = i2 / 2;
        i4 = this.f6540o00oo0o;
        if (i4 != 1) {
        }
        canvas.translate(0.0f, (float) (((-Math.sqrt(2.0d)) / 2.0d) * this.f6542o00oo0oO));
        canvas.scale(-1.0f, -1.0f);
        canvas.drawText(this.f6544o00ooO00, i12, i3, this.f6539o00oo0Oo);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            int i3 = this.f6542o00oo0oO;
            setMeasuredDimension(i3 * 2, i3 * 2);
        } else if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension(size2, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, size);
        } else if (size != size2) {
            int min = Math.min(size, size2);
            setMeasuredDimension(min, min);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f6538o00oo0O0 = Math.min(i, i2) / 2;
    }
}
