package oo0ooO;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import oo0ooO.o00oo0OO;
/* loaded from: classes2.dex */
public final class o00oo implements View.OnTouchListener {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o00oo0OO.o00oOo00 f17415o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00oo0OO<?> f17416o00oo0O0;

    public o00oo(o00oo0OO<?> o00oo0oo, o00oo0OO.o00oOo00 o00ooo002) {
        this.f17416o00oo0O0 = o00oo0oo;
        this.f17415o00oo0O = o00ooo002;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        o00oo0OO.o00oOo00 o00ooo002 = this.f17415o00oo0O;
        if (o00ooo002 == null) {
            return false;
        }
        return o00ooo002.o00oOOo0(this.f17416o00oo0O0, view, motionEvent);
    }
}
