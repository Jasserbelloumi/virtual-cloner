package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.appcompat.R;
/* loaded from: classes.dex */
public class o0O00OO extends RatingBar {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0O00O0o f1171o00oo0O0;

    public o0O00OO(@o00oOooO.oo0oO0 Context context) {
        this(context, null);
    }

    public o0O00OO(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ratingBarStyle);
    }

    public o0O00OO(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o0OO0o.o00oOOo0(this, getContext());
        o0O00O0o o0o00o0o = new o0O00O0o(this);
        this.f1171o00oo0O0 = o0o00o0o;
        o0o00o0o.o00oOo00(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap o00oOOoO2 = this.f1171o00oo0O0.o00oOOoO();
        if (o00oOOoO2 != null) {
            setMeasuredDimension(View.resolveSizeAndState(o00oOOoO2.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
