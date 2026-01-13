package androidx.viewpager2.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import o00oOooO.o0OOo000;
/* loaded from: classes.dex */
public final class o00oOo0O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final ViewPager2 f5422o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oo0 f5423o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final RecyclerView f5424o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f5425o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public float f5426o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public long f5427o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public int f5428o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public VelocityTracker f5429o00oOooO;

    public o00oOo0O(ViewPager2 viewPager2, o00oo0 o00oo0Var, RecyclerView recyclerView) {
        this.f5422o00oOOo0 = viewPager2;
        this.f5423o00oOOoO = o00oo0Var;
        this.f5424o00oOo00 = recyclerView;
    }

    public final void o00oOOo0(long j, int i, float f, float f2) {
        MotionEvent obtain = MotionEvent.obtain(this.f5427o00oOoO, j, i, f, f2, 0);
        this.f5429o00oOooO.addMovement(obtain);
        obtain.recycle();
    }

    @o0OOo000
    public boolean o00oOOoO() {
        if (this.f5423o00oOOoO.o00oOoO0()) {
            return false;
        }
        this.f5428o00oOoO0 = 0;
        this.f5426o00oOo0o = 0;
        this.f5427o00oOoO = SystemClock.uptimeMillis();
        o00oOo00();
        this.f5423o00oOOoO.o00oOoo0();
        if (!this.f5423o00oOOoO.o00oOoOO()) {
            this.f5424o00oOo00.stopScroll();
        }
        o00oOOo0(this.f5427o00oOoO, 0, 0.0f, 0.0f);
        return true;
    }

    public final void o00oOo00() {
        VelocityTracker velocityTracker = this.f5429o00oOooO;
        if (velocityTracker != null) {
            velocityTracker.clear();
            return;
        }
        this.f5429o00oOooO = VelocityTracker.obtain();
        this.f5425o00oOo0O = ViewConfiguration.get(this.f5422o00oOOo0.getContext()).getScaledMaximumFlingVelocity();
    }

    @o0OOo000
    public boolean o00oOo0O(float f) {
        if (this.f5423o00oOOoO.f5449o00oo00O) {
            float f2 = this.f5426o00oOo0o - f;
            this.f5426o00oOo0o = f2;
            int round = Math.round(f2 - this.f5428o00oOoO0);
            this.f5428o00oOoO0 += round;
            long uptimeMillis = SystemClock.uptimeMillis();
            boolean z = this.f5422o00oOOo0.getOrientation() == 0;
            int i = z ? round : 0;
            int i2 = z ? 0 : round;
            float f3 = z ? this.f5426o00oOo0o : 0.0f;
            float f4 = z ? 0.0f : this.f5426o00oOo0o;
            this.f5424o00oOo00.scrollBy(i, i2);
            o00oOOo0(uptimeMillis, 2, f3, f4);
            return true;
        }
        return false;
    }

    public boolean o00oOo0o() {
        return this.f5423o00oOOoO.f5449o00oo00O;
    }

    @o0OOo000
    public boolean o00oOooO() {
        o00oo0 o00oo0Var = this.f5423o00oOOoO;
        if (o00oo0Var.f5449o00oo00O) {
            o00oo0Var.o00oo00O();
            VelocityTracker velocityTracker = this.f5429o00oOooO;
            velocityTracker.computeCurrentVelocity(1000, this.f5425o00oOo0O);
            if (this.f5424o00oOo00.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
                return true;
            }
            this.f5422o00oOOo0.o0O0o();
            return true;
        }
        return false;
    }
}
