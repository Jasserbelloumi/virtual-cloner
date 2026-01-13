package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import o00oOooO.o0OO0;
import o00oOooO.oo0oO0;
import o0ooOoOO.ooOOOOoo;
/* loaded from: classes.dex */
public final class o00oOoO implements ViewPager2.o00ooO0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final int f5430o00oOOo0;

    public o00oOoO(@o0OO0 int i) {
        ooOOOOoo.o00oOoOo(i, "Margin must be non-negative");
        this.f5430o00oOOo0 = i;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.o00ooO0
    public void o00oOOo0(@oo0oO0 View view, float f) {
        ViewPager2 o00oOOoO2 = o00oOOoO(view);
        float f2 = this.f5430o00oOOo0 * f;
        if (o00oOOoO2.getOrientation() != 0) {
            view.setTranslationY(f2);
            return;
        }
        if (o00oOOoO2.o00oOoo0()) {
            f2 = -f2;
        }
        view.setTranslationX(f2);
    }

    public final ViewPager2 o00oOOoO(@oo0oO0 View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return (ViewPager2) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }
}
