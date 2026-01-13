package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.R;
/* loaded from: classes.dex */
public class o0oO0Ooo extends SeekBar {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0O00o00 f1462o00oo0O0;

    public o0oO0Ooo(@o00oOooO.oo0oO0 Context context) {
        this(context, null);
    }

    public o0oO0Ooo(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public o0oO0Ooo(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o0OO0o.o00oOOo0(this, getContext());
        o0O00o00 o0o00o00 = new o0O00o00(this);
        this.f1462o00oo0O0 = o0o00o00;
        o0o00o00.o00oOo00(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1462o00oo0O0.o00oOoO();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1462o00oo0O0.o00oOooo();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1462o00oo0O0.o00oOoO0(canvas);
    }
}
