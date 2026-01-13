package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import o00oOooO.o0OO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oOOoO extends ViewPager2.o00oo0O {
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final List<ViewPager2.o00oo0O> f5420o00oOOo0;

    public o00oOOoO(int i) {
        this.f5420o00oOOo0 = new ArrayList(i);
    }

    public void o00oOOo0(ViewPager2.o00oo0O o00oo0o2) {
        this.f5420o00oOOo0.add(o00oo0o2);
    }

    public void o00oOOoO(ViewPager2.o00oo0O o00oo0o2) {
        this.f5420o00oOOo0.remove(o00oo0o2);
    }

    public final void o00oOo00(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.o00oo0O
    public void onPageScrollStateChanged(int i) {
        try {
            for (ViewPager2.o00oo0O o00oo0o2 : this.f5420o00oOOo0) {
                o00oo0o2.onPageScrollStateChanged(i);
            }
        } catch (ConcurrentModificationException e) {
            o00oOo00(e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.o00oo0O
    public void onPageScrolled(int i, float f, @o0OO0 int i2) {
        try {
            for (ViewPager2.o00oo0O o00oo0o2 : this.f5420o00oOOo0) {
                o00oo0o2.onPageScrolled(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            o00oOo00(e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.o00oo0O
    public void onPageSelected(int i) {
        try {
            for (ViewPager2.o00oo0O o00oo0o2 : this.f5420o00oOOo0) {
                o00oo0o2.onPageSelected(i);
            }
        } catch (ConcurrentModificationException e) {
            o00oOo00(e);
        }
    }
}
