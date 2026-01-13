package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public class o00oo0 extends o00oOOoO {
    public o00oo0(Context context) {
        super(context);
    }

    public o00oo0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public o00oo0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.constraintlayout.widget.o00oOOoO
    public void o00oo0OO(AttributeSet attributeSet) {
        super.o00oo0OO(attributeSet);
        this.f1934o00oo0o = false;
    }

    @Override // androidx.constraintlayout.widget.o00oOOoO
    public void o00oo0o(ConstraintLayout constraintLayout) {
        ConstraintLayout.o00oOOoO o00ooooo2 = (ConstraintLayout.o00oOOoO) getLayoutParams();
        o00ooooo2.f1853o0O00OOO.o0O0ooOO(0);
        o00ooooo2.f1853o0O00OOO.o0O0o00(0);
    }

    @Override // androidx.constraintlayout.widget.o00oOOoO, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        o00oOoOO();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        o00oOoOO();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        o00oOoOO();
    }
}
