package o0ooO0O0;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import o0OO00OO.o00oOo0O;
/* loaded from: classes3.dex */
public class oO0O00 extends o00oOo0O {

    /* renamed from: o00ooO0  reason: collision with root package name */
    public float f17061o00ooO0;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public float f17062o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public boolean f17063o00ooO0o;

    @Override // o0OO00OO.o00oOo0O
    public boolean o00oOoOo(float f, float f2, float f3, float f4) {
        float o00oOooO2 = o00oOooO();
        return Math.abs(f - f2) >= o00oOooO2 || Math.abs(f3 - f4) >= o00oOooO2;
    }

    @Override // o0OO00OO.o00oOo0O
    public float o00oOooO() {
        return 75.0f;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f17061o00ooO0 = motionEvent.getX();
            this.f17062o00ooO0O = motionEvent.getY();
            this.f17063o00ooO0o = false;
        } else if (action == 2) {
            float rawX = motionEvent.getRawX() - o00oOoO();
            float rawY = motionEvent.getRawY() - o00oOoO0();
            float f = this.f17061o00ooO0;
            float f2 = rawX - f;
            float f3 = rawY - this.f17062o00ooO0O;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (!this.f17063o00ooO0o && o00oOoOo(f, motionEvent.getX(), this.f17062o00ooO0O, motionEvent.getY())) {
                this.f17063o00ooO0o = true;
            }
            if (this.f17063o00ooO0o) {
                o00oo0O0(f2, f3);
            }
        }
        return false;
    }
}
