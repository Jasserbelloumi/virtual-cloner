package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
@Deprecated
/* loaded from: classes.dex */
public final class o0O000O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public OverScroller f2526o00oOOo0;

    public o0O000O(Context context, Interpolator interpolator) {
        this.f2526o00oOOo0 = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    @Deprecated
    public static o0O000O o00oOo00(Context context) {
        return new o0O000O(context, null);
    }

    @Deprecated
    public static o0O000O o00oOooO(Context context, Interpolator interpolator) {
        return new o0O000O(context, interpolator);
    }

    @Deprecated
    public void o00oOOo0() {
        this.f2526o00oOOo0.abortAnimation();
    }

    @Deprecated
    public boolean o00oOOoO() {
        return this.f2526o00oOOo0.computeScrollOffset();
    }

    @Deprecated
    public void o00oOo0O(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f2526o00oOOo0.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    @Deprecated
    public void o00oOo0o(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f2526o00oOOo0.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    @Deprecated
    public int o00oOoO() {
        return this.f2526o00oOOo0.getCurrX();
    }

    @Deprecated
    public float o00oOoO0() {
        return this.f2526o00oOOo0.getCurrVelocity();
    }

    @Deprecated
    public int o00oOoOO() {
        return this.f2526o00oOOo0.getCurrY();
    }

    @Deprecated
    public int o00oOoOo() {
        return this.f2526o00oOOo0.getFinalX();
    }

    @Deprecated
    public int o00oOoo0() {
        return this.f2526o00oOOo0.getFinalY();
    }

    @Deprecated
    public boolean o00oOooo() {
        return this.f2526o00oOOo0.isFinished();
    }

    @Deprecated
    public void o00oo0(int i, int i2, int i3) {
        this.f2526o00oOOo0.notifyHorizontalEdgeReached(i, i2, i3);
    }

    @Deprecated
    public boolean o00oo00O() {
        return this.f2526o00oOOo0.isOverScrolled();
    }

    @Deprecated
    public void o00oo0O(int i, int i2, int i3, int i4) {
        this.f2526o00oOOo0.startScroll(i, i2, i3, i4);
    }

    @Deprecated
    public boolean o00oo0O0(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.f2526o00oOOo0.springBack(i, i2, i3, i4, i5, i6);
    }

    @Deprecated
    public void o00oo0OO(int i, int i2, int i3) {
        this.f2526o00oOOo0.notifyVerticalEdgeReached(i, i2, i3);
    }

    @Deprecated
    public void o00oo0Oo(int i, int i2, int i3, int i4, int i5) {
        this.f2526o00oOOo0.startScroll(i, i2, i3, i4, i5);
    }
}
