package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oo0 extends RecyclerView.o0O000Oo {

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f5431o00oo0 = 0;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f5432o00oo0O = 3;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f5433o00oo0O0 = 2;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f5434o00oo0OO = 1;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f5435o00oo0Oo = 4;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f5436o00oo0o0 = -1;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public ViewPager2.o00oo0O f5437o00oOOo0;
    @oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final ViewPager2 f5438o00oOOoO;
    @oo0oO0

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final RecyclerView f5439o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f5440o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f5441o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int f5442o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public o00oOOo0 f5443o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public int f5444o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public boolean f5445o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public boolean f5446o00oOoo0;
    @oo0oO0

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final LinearLayoutManager f5447o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public boolean f5448o00oOooo;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public boolean f5449o00oo00O;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f5450o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public float f5451o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f5452o00oOo00;

        public void o00oOOo0() {
            this.f5450o00oOOo0 = -1;
            this.f5451o00oOOoO = 0.0f;
            this.f5452o00oOo00 = 0;
        }
    }

    public o00oo0(@oo0oO0 ViewPager2 viewPager2) {
        this.f5438o00oOOoO = viewPager2;
        RecyclerView recyclerView = viewPager2.f5384o00ooO0;
        this.f5439o00oOo00 = recyclerView;
        this.f5447o00oOooO = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f5443o00oOoO0 = new o00oOOo0();
        o00oo0OO();
    }

    public final void o00oOOo0(int i, float f, int i2) {
        ViewPager2.o00oo0O o00oo0o2 = this.f5437o00oOOo0;
        if (o00oo0o2 != null) {
            o00oo0o2.onPageScrolled(i, f, i2);
        }
    }

    public final void o00oOOoO(int i) {
        ViewPager2.o00oo0O o00oo0o2 = this.f5437o00oOOo0;
        if (o00oo0o2 != null) {
            o00oo0o2.onPageSelected(i);
        }
    }

    public final void o00oOo00(int i) {
        if ((this.f5440o00oOo0O == 3 && this.f5441o00oOo0o == 0) || this.f5441o00oOo0o == i) {
            return;
        }
        this.f5441o00oOo0o = i;
        ViewPager2.o00oo0O o00oo0o2 = this.f5437o00oOOo0;
        if (o00oo0o2 != null) {
            o00oo0o2.onPageScrollStateChanged(i);
        }
    }

    public double o00oOo0O() {
        o00oo0Oo();
        o00oOOo0 o00oooo02 = this.f5443o00oOoO0;
        return o00oooo02.f5450o00oOOo0 + o00oooo02.f5451o00oOOoO;
    }

    public int o00oOo0o() {
        return this.f5441o00oOo0o;
    }

    public boolean o00oOoO() {
        return this.f5449o00oo00O;
    }

    public boolean o00oOoO0() {
        return this.f5441o00oOo0o == 1;
    }

    public boolean o00oOoOO() {
        return this.f5441o00oOo0o == 0;
    }

    public final boolean o00oOoOo() {
        int i = this.f5440o00oOo0O;
        return i == 1 || i == 4;
    }

    public void o00oOoo0() {
        this.f5440o00oOo0O = 4;
        o00oo0O(true);
    }

    public final int o00oOooO() {
        return this.f5447o00oOooO.findFirstVisibleItemPosition();
    }

    public void o00oOooo() {
        this.f5448o00oOooo = true;
    }

    public void o00oo0(int i, boolean z) {
        this.f5440o00oOo0O = z ? 2 : 3;
        this.f5449o00oo00O = false;
        boolean z2 = this.f5444o00oOoOO != i;
        this.f5444o00oOoOO = i;
        o00oOo00(2);
        if (z2) {
            o00oOOoO(i);
        }
    }

    public void o00oo00O() {
        if (!o00oOoO0() || this.f5449o00oo00O) {
            this.f5449o00oo00O = false;
            o00oo0Oo();
            o00oOOo0 o00oooo02 = this.f5443o00oOoO0;
            if (o00oooo02.f5452o00oOo00 != 0) {
                o00oOo00(2);
                return;
            }
            int i = o00oooo02.f5450o00oOOo0;
            if (i != this.f5442o00oOoO) {
                o00oOOoO(i);
            }
            o00oOo00(0);
            o00oo0OO();
        }
    }

    public final void o00oo0O(boolean z) {
        this.f5449o00oo00O = z;
        this.f5440o00oOo0O = z ? 4 : 1;
        int i = this.f5444o00oOoOO;
        if (i != -1) {
            this.f5442o00oOoO = i;
            this.f5444o00oOoOO = -1;
        } else if (this.f5442o00oOoO == -1) {
            this.f5442o00oOoO = o00oOooO();
        }
        o00oOo00(1);
    }

    public void o00oo0O0(ViewPager2.o00oo0O o00oo0o2) {
        this.f5437o00oOOo0 = o00oo0o2;
    }

    public final void o00oo0OO() {
        this.f5440o00oOo0O = 0;
        this.f5441o00oOo0o = 0;
        this.f5443o00oOoO0.o00oOOo0();
        this.f5442o00oOoO = -1;
        this.f5444o00oOoOO = -1;
        this.f5445o00oOoOo = false;
        this.f5446o00oOoo0 = false;
        this.f5449o00oo00O = false;
        this.f5448o00oOooo = false;
    }

    public final void o00oo0Oo() {
        int top;
        o00oOOo0 o00oooo02 = this.f5443o00oOoO0;
        int findFirstVisibleItemPosition = this.f5447o00oOooO.findFirstVisibleItemPosition();
        o00oooo02.f5450o00oOOo0 = findFirstVisibleItemPosition;
        if (findFirstVisibleItemPosition == -1) {
            o00oooo02.o00oOOo0();
            return;
        }
        View findViewByPosition = this.f5447o00oOooO.findViewByPosition(findFirstVisibleItemPosition);
        if (findViewByPosition == null) {
            o00oooo02.o00oOOo0();
            return;
        }
        int leftDecorationWidth = this.f5447o00oOooO.getLeftDecorationWidth(findViewByPosition);
        int rightDecorationWidth = this.f5447o00oOooO.getRightDecorationWidth(findViewByPosition);
        int topDecorationHeight = this.f5447o00oOooO.getTopDecorationHeight(findViewByPosition);
        int bottomDecorationHeight = this.f5447o00oOooO.getBottomDecorationHeight(findViewByPosition);
        ViewGroup.LayoutParams layoutParams = findViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = findViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = findViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.f5447o00oOooO.getOrientation() == 0) {
            top = (findViewByPosition.getLeft() - leftDecorationWidth) - this.f5439o00oOo00.getPaddingLeft();
            if (this.f5438o00oOOoO.o00oOoo0()) {
                top = -top;
            }
            height = width;
        } else {
            top = (findViewByPosition.getTop() - topDecorationHeight) - this.f5439o00oOo00.getPaddingTop();
        }
        int i = -top;
        o00oooo02.f5452o00oOo00 = i;
        if (i >= 0) {
            o00oooo02.f5451o00oOOoO = height == 0 ? 0.0f : i / height;
        } else if (!new androidx.viewpager2.widget.o00oOOo0(this.f5447o00oOooO).o00oOooO()) {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(o00oooo02.f5452o00oOo00)));
        } else {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O000Oo
    public void onScrollStateChanged(@oo0oO0 RecyclerView recyclerView, int i) {
        boolean z = true;
        if (!(this.f5440o00oOo0O == 1 && this.f5441o00oOo0o == 1) && i == 1) {
            o00oo0O(false);
        } else if (o00oOoOo() && i == 2) {
            if (this.f5446o00oOoo0) {
                o00oOo00(2);
                this.f5445o00oOoOo = true;
            }
        } else {
            if (o00oOoOo() && i == 0) {
                o00oo0Oo();
                if (this.f5446o00oOoo0) {
                    o00oOOo0 o00oooo02 = this.f5443o00oOoO0;
                    if (o00oooo02.f5452o00oOo00 == 0) {
                        int i2 = this.f5442o00oOoO;
                        int i3 = o00oooo02.f5450o00oOOo0;
                        if (i2 != i3) {
                            o00oOOoO(i3);
                        }
                    } else {
                        z = false;
                    }
                } else {
                    int i4 = this.f5443o00oOoO0.f5450o00oOOo0;
                    if (i4 != -1) {
                        o00oOOo0(i4, 0.0f, 0);
                    }
                }
                if (z) {
                    o00oOo00(0);
                    o00oo0OO();
                }
            }
            if (this.f5440o00oOo0O == 2 && i == 0 && this.f5448o00oOooo) {
                o00oo0Oo();
                o00oOOo0 o00oooo03 = this.f5443o00oOoO0;
                if (o00oooo03.f5452o00oOo00 == 0) {
                    int i5 = this.f5444o00oOoOO;
                    int i6 = o00oooo03.f5450o00oOOo0;
                    if (i5 != i6) {
                        if (i6 == -1) {
                            i6 = 0;
                        }
                        o00oOOoO(i6);
                    }
                    o00oOo00(0);
                    o00oo0OO();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        if ((r5 < 0) == r3.f5438o00oOOoO.o00oOoo0()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
        if (r3.f5442o00oOoO != r5) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    @Override // androidx.recyclerview.widget.RecyclerView.o0O000Oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrolled(@o00oOooO.oo0oO0 androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f5446o00oOoo0 = r4
            r3.o00oo0Oo()
            boolean r0 = r3.f5445o00oOoOo
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L3a
            r3.f5445o00oOoOo = r2
            if (r6 > 0) goto L22
            if (r6 != 0) goto L20
            if (r5 >= 0) goto L16
            r5 = r4
            goto L17
        L16:
            r5 = r2
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f5438o00oOOoO
            boolean r6 = r6.o00oOoo0()
            if (r5 != r6) goto L20
            goto L22
        L20:
            r5 = r2
            goto L23
        L22:
            r5 = r4
        L23:
            if (r5 == 0) goto L2f
            androidx.viewpager2.widget.o00oo0$o00oOOo0 r5 = r3.f5443o00oOoO0
            int r6 = r5.f5452o00oOo00
            if (r6 == 0) goto L2f
            int r5 = r5.f5450o00oOOo0
            int r5 = r5 + r4
            goto L33
        L2f:
            androidx.viewpager2.widget.o00oo0$o00oOOo0 r5 = r3.f5443o00oOoO0
            int r5 = r5.f5450o00oOOo0
        L33:
            r3.f5444o00oOoOO = r5
            int r6 = r3.f5442o00oOoO
            if (r6 == r5) goto L48
            goto L45
        L3a:
            int r5 = r3.f5440o00oOo0O
            if (r5 != 0) goto L48
            androidx.viewpager2.widget.o00oo0$o00oOOo0 r5 = r3.f5443o00oOoO0
            int r5 = r5.f5450o00oOOo0
            if (r5 != r1) goto L45
            r5 = r2
        L45:
            r3.o00oOOoO(r5)
        L48:
            androidx.viewpager2.widget.o00oo0$o00oOOo0 r5 = r3.f5443o00oOoO0
            int r6 = r5.f5450o00oOOo0
            if (r6 != r1) goto L4f
            r6 = r2
        L4f:
            float r0 = r5.f5451o00oOOoO
            int r5 = r5.f5452o00oOo00
            r3.o00oOOo0(r6, r0, r5)
            androidx.viewpager2.widget.o00oo0$o00oOOo0 r5 = r3.f5443o00oOoO0
            int r6 = r5.f5450o00oOOo0
            int r0 = r3.f5444o00oOoOO
            if (r6 == r0) goto L60
            if (r0 != r1) goto L6e
        L60:
            int r5 = r5.f5452o00oOo00
            if (r5 != 0) goto L6e
            int r5 = r3.f5441o00oOo0o
            if (r5 == r4) goto L6e
            r3.o00oOo00(r2)
            r3.o00oo0OO()
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.o00oo0.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
