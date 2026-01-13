package o0O000oo;

import android.view.View;
import android.view.ViewTreeObserver;
/* loaded from: classes.dex */
public final class o0O0OOO0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public ViewTreeObserver f10623o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final View f10624o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final Runnable f10625o00oo0Oo;

    public o0O0OOO0(View view, Runnable runnable) {
        this.f10624o00oo0O0 = view;
        this.f10623o00oo0O = view.getViewTreeObserver();
        this.f10625o00oo0Oo = runnable;
    }

    @o00oOooO.oo0oO0
    public static o0O0OOO0 o00oOOo0(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 Runnable runnable) {
        if (view != null) {
            if (runnable != null) {
                o0O0OOO0 o0o0ooo0 = new o0O0OOO0(view, runnable);
                view.getViewTreeObserver().addOnPreDrawListener(o0o0ooo0);
                view.addOnAttachStateChangeListener(o0o0ooo0);
                return o0o0ooo0;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    public void o00oOOoO() {
        (this.f10623o00oo0O.isAlive() ? this.f10623o00oo0O : this.f10624o00oo0O0.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f10624o00oo0O0.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        o00oOOoO();
        this.f10625o00oo0Oo.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@o00oOooO.oo0oO0 View view) {
        this.f10623o00oo0O = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@o00oOooO.oo0oO0 View view) {
        o00oOOoO();
    }
}
