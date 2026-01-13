package oo0ooO;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
/* loaded from: classes2.dex */
public final class o00ooO0 extends FrameLayout {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public View.OnTouchListener f17437o00oo0O0;

    public o00ooO0(Context context) {
        super(context);
    }

    public o00ooO0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public o00ooO0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.f17437o00oo0O0;
        if (onTouchListener == null || !onTouchListener.onTouch(this, motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f17437o00oo0O0 = onTouchListener;
    }
}
