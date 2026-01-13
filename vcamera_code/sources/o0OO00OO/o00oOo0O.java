package o0OO00OO;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.google.android.material.badge.BadgeDrawable;
/* loaded from: classes2.dex */
public abstract class o00oOo0O implements View.OnTouchListener {

    /* renamed from: o00oo  reason: collision with root package name */
    public int f12979o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public View f12980o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public oo0ooO.o00oo0OO<?> f12981o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final Rect f12982o00oo0Oo = new Rect();

    /* renamed from: o00oo0o  reason: collision with root package name */
    public int f12983o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f12984o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public int f12985o00oo0oO;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public int f12986o00ooO00;

    /* renamed from: o0O0o  reason: collision with root package name */
    public int f12987o0O0o;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o00oOoo0(float f, int i, float f2) {
        o00oOo00().getWindowVisibleDisplayFrame(this.f12982o00oo0Oo);
        Rect rect = this.f12982o00oo0Oo;
        int i2 = rect.right - rect.left;
        int i3 = rect.bottom - rect.top;
        float f3 = i2 * f;
        float f4 = i / 2.0f;
        o00oo0O((int) (f3 - f4), (int) ((i3 * f2) - f4));
        o00oOo0O().o00ooO00(new o00oOOo0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean o00oOooo(View view, MotionEvent motionEvent) {
        o00oo0();
        return onTouch(view, motionEvent);
    }

    public View o00oOo00() {
        return this.f12980o00oo0O;
    }

    public oo0ooO.o00oo0OO<?> o00oOo0O() {
        return this.f12981o00oo0O0;
    }

    public int o00oOo0o() {
        return this.f12983o00oo0o;
    }

    public int o00oOoO() {
        return this.f12979o00oo;
    }

    public int o00oOoO0() {
        return this.f12986o00ooO00;
    }

    public int o00oOoOO() {
        return this.f12984o00oo0o0;
    }

    public boolean o00oOoOo(float f, float f2, float f3, float f4) {
        float o00oOooO2 = o00oOooO();
        return Math.abs(f - f2) >= o00oOooO2 || Math.abs(f3 - f4) >= o00oOooO2;
    }

    public float o00oOooO() {
        return TypedValue.applyDimension(1, 1.0f, Resources.getSystem().getDisplayMetrics());
    }

    public void o00oo0() {
        View o00oOo002 = o00oOo00();
        if (o00oOo002 == null) {
            return;
        }
        o00oOo002.getWindowVisibleDisplayFrame(this.f12982o00oo0Oo);
        Rect rect = this.f12982o00oo0Oo;
        this.f12984o00oo0o0 = rect.right - rect.left;
        this.f12983o00oo0o = rect.bottom - rect.top;
        int[] iArr = new int[2];
        o00oOo002.getLocationOnScreen(iArr);
        this.f12985o00oo0oO = iArr[0];
        this.f12987o0O0o = iArr[1];
        Rect rect2 = this.f12982o00oo0Oo;
        this.f12979o00oo = rect2.left;
        this.f12986o00ooO00 = rect2.top;
    }

    public void o00oo00O() {
        final int width = o00oOo00().getWidth();
        int height = o00oOo00().getHeight();
        int i = this.f12985o00oo0oO - this.f12979o00oo;
        int i2 = this.f12987o0O0o - this.f12986o00ooO00;
        float f = i;
        final float f2 = 1.0f;
        final float f3 = f < 1.0f ? 0.0f : ((float) Math.abs(this.f12984o00oo0o0 - (i + width))) < 1.0f ? 1.0f : ((width / 2.0f) + f) / this.f12984o00oo0o0;
        float f4 = i2;
        if (f4 < 1.0f) {
            f2 = 0.0f;
        } else if (Math.abs(this.f12983o00oo0o - (i2 + height)) >= 1.0f) {
            f2 = ((height / 2.0f) + f4) / this.f12983o00oo0o;
        }
        o00oOo0O().o00ooO0O(new Runnable() { // from class: o0OO00OO.o00oOo00
            @Override // java.lang.Runnable
            public final void run() {
                o00oOo0O.this.o00oOoo0(f3, width, f2);
            }
        }, 100L);
    }

    public void o00oo0O(int i, int i2) {
        WindowManager.LayoutParams o00oo0Oo2 = this.f12981o00oo0O0.o00oo0Oo();
        if (o00oo0Oo2 == null) {
            return;
        }
        if (o00oo0Oo2.gravity == 8388659 && o00oo0Oo2.x == i && o00oo0Oo2.y == i2) {
            return;
        }
        o00oo0Oo2.x = i;
        o00oo0Oo2.y = i2;
        o00oo0Oo2.gravity = BadgeDrawable.TOP_START;
        this.f12981o00oo0O0.oo0OOoo();
    }

    public void o00oo0O0(float f, float f2) {
        o00oo0O((int) f, (int) f2);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void o00oo0OO(oo0ooO.o00oo0OO<?> o00oo0oo) {
        this.f12981o00oo0O0 = o00oo0oo;
        View o00oo00O2 = o00oo0oo.o00oo00O();
        this.f12980o00oo0O = o00oo00O2;
        o00oo00O2.setOnTouchListener(new View.OnTouchListener() { // from class: o0OO00OO.o00oOOoO
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean o00oOooo2;
                o00oOooo2 = o00oOo0O.this.o00oOooo(view, motionEvent);
                return o00oOooo2;
            }
        });
        this.f12980o00oo0O.post(new o00oOOo0(this));
    }
}
