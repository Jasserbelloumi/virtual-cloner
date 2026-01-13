package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import o00ooO.o00oOoO;
import o0O0oooo.o0OO0oO;
/* loaded from: classes.dex */
public class o00oo0OO extends View {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public View f2293o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f2294o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f2295o00oo0Oo;

    public o00oo0OO(Context context) {
        super(context);
        this.f2294o00oo0O0 = -1;
        this.f2293o00oo0O = null;
        this.f2295o00oo0Oo = 4;
        o00oOOo0(null);
    }

    public o00oo0OO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2294o00oo0O0 = -1;
        this.f2293o00oo0O = null;
        this.f2295o00oo0Oo = 4;
        o00oOOo0(attributeSet);
    }

    public o00oo0OO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2294o00oo0O0 = -1;
        this.f2293o00oo0O = null;
        this.f2295o00oo0Oo = 4;
        o00oOOo0(attributeSet);
    }

    public o00oo0OO(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f2294o00oo0O0 = -1;
        this.f2293o00oo0O = null;
        this.f2295o00oo0Oo = 4;
        o00oOOo0(attributeSet);
    }

    public View getContent() {
        return this.f2293o00oo0O;
    }

    public int getEmptyVisibility() {
        return this.f2295o00oo0Oo;
    }

    public final void o00oOOo0(AttributeSet attributeSet) {
        super.setVisibility(this.f2295o00oo0Oo);
        this.f2294o00oo0O0 = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_placeholder_content) {
                    this.f2294o00oo0O0 = obtainStyledAttributes.getResourceId(index, this.f2294o00oo0O0);
                } else if (index == R.styleable.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.f2295o00oo0Oo = obtainStyledAttributes.getInt(index, this.f2295o00oo0Oo);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void o00oOOoO(ConstraintLayout constraintLayout) {
        if (this.f2293o00oo0O == null) {
            return;
        }
        ConstraintLayout.o00oOOoO o00ooooo2 = (ConstraintLayout.o00oOOoO) getLayoutParams();
        ConstraintLayout.o00oOOoO o00ooooo3 = (ConstraintLayout.o00oOOoO) this.f2293o00oo0O.getLayoutParams();
        o00ooooo3.f1853o0O00OOO.o0O0ooO0(0);
        o00oOoO.o00oOOoO o00ooOoO2 = o00ooooo2.f1853o0O00OOO.o00ooOoO();
        o00oOoO.o00oOOoO o00ooooo4 = o00oOoO.o00oOOoO.FIXED;
        if (o00ooOoO2 != o00ooooo4) {
            o00ooooo2.f1853o0O00OOO.o0O0ooOO(o00ooooo3.f1853o0O00OOO.o0OoO00O());
        }
        if (o00ooooo2.f1853o0O00OOO.o0O000oo() != o00ooooo4) {
            o00ooooo2.f1853o0O00OOO.o0O0o00(o00ooooo3.f1853o0O00OOO.o00ooOO());
        }
        o00ooooo3.f1853o0O00OOO.o0O0ooO0(8);
    }

    public void o00oOo00(ConstraintLayout constraintLayout) {
        if (this.f2294o00oo0O0 == -1 && !isInEditMode()) {
            setVisibility(this.f2295o00oo0Oo);
        }
        View findViewById = constraintLayout.findViewById(this.f2294o00oo0O0);
        this.f2293o00oo0O = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.o00oOOoO) findViewById.getLayoutParams()).f1845o0O000Oo = true;
            this.f2293o00oo0O.setVisibility(0);
            setVisibility(0);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(o0OO0oO.f12881o00oooo, o0OO0oO.f12881o00oooo, o0OO0oO.f12881o00oooo);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (height / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f2294o00oo0O0 == i) {
            return;
        }
        View view = this.f2293o00oo0O;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.o00oOOoO) this.f2293o00oo0O.getLayoutParams()).f1845o0O000Oo = false;
            this.f2293o00oo0O = null;
        }
        this.f2294o00oo0O0 = i;
        if (i == -1 || (findViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.f2295o00oo0Oo = i;
    }
}
