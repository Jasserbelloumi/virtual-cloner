package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public final class o00oo00O extends ViewPager2.o00oo0O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final LinearLayoutManager f5453o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public ViewPager2.o00ooO0 f5454o00oOOoO;

    public o00oo00O(LinearLayoutManager linearLayoutManager) {
        this.f5453o00oOOo0 = linearLayoutManager;
    }

    public ViewPager2.o00ooO0 o00oOOo0() {
        return this.f5454o00oOOoO;
    }

    public void o00oOOoO(@o0OO00OO ViewPager2.o00ooO0 o00ooo02) {
        this.f5454o00oOOoO = o00ooo02;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.o00oo0O
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.o00oo0O
    public void onPageScrolled(int i, float f, int i2) {
        if (this.f5454o00oOOoO == null) {
            return;
        }
        float f2 = -f;
        for (int i3 = 0; i3 < this.f5453o00oOOo0.getChildCount(); i3++) {
            View childAt = this.f5453o00oOOo0.getChildAt(i3);
            if (childAt == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(this.f5453o00oOOo0.getChildCount())));
            }
            this.f5454o00oOOoO.o00oOOo0(childAt, (this.f5453o00oOOo0.getPosition(childAt) - i) + f2);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.o00oo0O
    public void onPageSelected(int i) {
    }
}
