package androidx.viewpager2.widget;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oOo00 implements ViewPager2.o00ooO0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final List<ViewPager2.o00ooO0> f5421o00oOOo0 = new ArrayList();

    @Override // androidx.viewpager2.widget.ViewPager2.o00ooO0
    public void o00oOOo0(@oo0oO0 View view, float f) {
        for (ViewPager2.o00ooO0 o00ooo02 : this.f5421o00oOOo0) {
            o00ooo02.o00oOOo0(view, f);
        }
    }

    public void o00oOOoO(@oo0oO0 ViewPager2.o00ooO0 o00ooo02) {
        this.f5421o00oOOo0.add(o00ooo02);
    }

    public void o00oOo00(@oo0oO0 ViewPager2.o00ooO0 o00ooo02) {
        this.f5421o00oOOo0.remove(o00ooo02);
    }
}
