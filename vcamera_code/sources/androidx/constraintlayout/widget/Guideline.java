package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.o00oOOoO o00ooooo2 = (ConstraintLayout.o00oOOoO) getLayoutParams();
        o00ooooo2.f1794o00oOOo0 = i;
        setLayoutParams(o00ooooo2);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.o00oOOoO o00ooooo2 = (ConstraintLayout.o00oOOoO) getLayoutParams();
        o00ooooo2.f1795o00oOOoO = i;
        setLayoutParams(o00ooooo2);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.o00oOOoO o00ooooo2 = (ConstraintLayout.o00oOOoO) getLayoutParams();
        o00ooooo2.f1796o00oOo00 = f;
        setLayoutParams(o00ooooo2);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
