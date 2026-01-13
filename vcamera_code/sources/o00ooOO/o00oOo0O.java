package o00ooOO;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.R;
/* loaded from: classes.dex */
public class o00oOo0O extends View {

    /* renamed from: o00oo  reason: collision with root package name */
    public int f8837o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public Paint f8838o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public Paint f8839o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public Paint f8840o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public boolean f8841o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public boolean f8842o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public String f8843o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public int f8844o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public int f8845o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public int f8846o00ooO0O;

    /* renamed from: o0O0o  reason: collision with root package name */
    public Rect f8847o0O0o;

    public o00oOo0O(Context context) {
        super(context);
        this.f8839o00oo0O0 = new Paint();
        this.f8838o00oo0O = new Paint();
        this.f8840o00oo0Oo = new Paint();
        this.f8842o00oo0o0 = true;
        this.f8841o00oo0o = true;
        this.f8843o00oo0oO = null;
        this.f8847o0O0o = new Rect();
        this.f8837o00oo = Color.argb(255, 0, 0, 0);
        this.f8845o00ooO00 = Color.argb(255, 200, 200, 200);
        this.f8844o00ooO0 = Color.argb(255, 50, 50, 50);
        this.f8846o00ooO0O = 4;
        o00oOOo0(context, null);
    }

    public o00oOo0O(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8839o00oo0O0 = new Paint();
        this.f8838o00oo0O = new Paint();
        this.f8840o00oo0Oo = new Paint();
        this.f8842o00oo0o0 = true;
        this.f8841o00oo0o = true;
        this.f8843o00oo0oO = null;
        this.f8847o0O0o = new Rect();
        this.f8837o00oo = Color.argb(255, 0, 0, 0);
        this.f8845o00ooO00 = Color.argb(255, 200, 200, 200);
        this.f8844o00ooO0 = Color.argb(255, 50, 50, 50);
        this.f8846o00ooO0O = 4;
        o00oOOo0(context, attributeSet);
    }

    public o00oOo0O(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8839o00oo0O0 = new Paint();
        this.f8838o00oo0O = new Paint();
        this.f8840o00oo0Oo = new Paint();
        this.f8842o00oo0o0 = true;
        this.f8841o00oo0o = true;
        this.f8843o00oo0oO = null;
        this.f8847o0O0o = new Rect();
        this.f8837o00oo = Color.argb(255, 0, 0, 0);
        this.f8845o00ooO00 = Color.argb(255, 200, 200, 200);
        this.f8844o00ooO0 = Color.argb(255, 50, 50, 50);
        this.f8846o00ooO0O = 4;
        o00oOOo0(context, attributeSet);
    }

    public final void o00oOOo0(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MockView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.MockView_mock_label) {
                    this.f8843o00oo0oO = obtainStyledAttributes.getString(index);
                } else if (index == R.styleable.MockView_mock_showDiagonals) {
                    this.f8842o00oo0o0 = obtainStyledAttributes.getBoolean(index, this.f8842o00oo0o0);
                } else if (index == R.styleable.MockView_mock_diagonalsColor) {
                    this.f8837o00oo = obtainStyledAttributes.getColor(index, this.f8837o00oo);
                } else if (index == R.styleable.MockView_mock_labelBackgroundColor) {
                    this.f8844o00ooO0 = obtainStyledAttributes.getColor(index, this.f8844o00ooO0);
                } else if (index == R.styleable.MockView_mock_labelColor) {
                    this.f8845o00ooO00 = obtainStyledAttributes.getColor(index, this.f8845o00ooO00);
                } else if (index == R.styleable.MockView_mock_showLabel) {
                    this.f8841o00oo0o = obtainStyledAttributes.getBoolean(index, this.f8841o00oo0o);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f8843o00oo0oO == null) {
            try {
                this.f8843o00oo0oO = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f8839o00oo0O0.setColor(this.f8837o00oo);
        this.f8839o00oo0O0.setAntiAlias(true);
        this.f8838o00oo0O.setColor(this.f8845o00ooO00);
        this.f8838o00oo0O.setAntiAlias(true);
        this.f8840o00oo0Oo.setColor(this.f8844o00ooO0);
        this.f8846o00ooO0O = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.f8846o00ooO0O);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f8842o00oo0o0) {
            width--;
            height--;
            float f = width;
            float f2 = height;
            canvas.drawLine(0.0f, 0.0f, f, f2, this.f8839o00oo0O0);
            canvas.drawLine(0.0f, f2, f, 0.0f, this.f8839o00oo0O0);
            canvas.drawLine(0.0f, 0.0f, f, 0.0f, this.f8839o00oo0O0);
            canvas.drawLine(f, 0.0f, f, f2, this.f8839o00oo0O0);
            canvas.drawLine(f, f2, 0.0f, f2, this.f8839o00oo0O0);
            canvas.drawLine(0.0f, f2, 0.0f, 0.0f, this.f8839o00oo0O0);
        }
        String str = this.f8843o00oo0oO;
        if (str == null || !this.f8841o00oo0o) {
            return;
        }
        this.f8838o00oo0O.getTextBounds(str, 0, str.length(), this.f8847o0O0o);
        float width2 = (width - this.f8847o0O0o.width()) / 2.0f;
        float height2 = ((height - this.f8847o0O0o.height()) / 2.0f) + this.f8847o0O0o.height();
        this.f8847o0O0o.offset((int) width2, (int) height2);
        Rect rect = this.f8847o0O0o;
        int i = rect.left;
        int i2 = this.f8846o00ooO0O;
        rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
        canvas.drawRect(this.f8847o0O0o, this.f8840o00oo0Oo);
        canvas.drawText(this.f8843o00oo0oO, width2, height2, this.f8838o00oo0O);
    }
}
