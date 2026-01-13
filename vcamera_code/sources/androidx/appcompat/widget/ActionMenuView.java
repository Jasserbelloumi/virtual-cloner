package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.o00oOoO;
import androidx.appcompat.view.menu.o00oo0O;
import androidx.appcompat.widget.LinearLayoutCompat;
import o00oOooO.o0OO0oO;
/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements o00oOoO.o00oOOoO, androidx.appcompat.view.menu.o0O0o {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final String f810o00ooO = "ActionMenuView";

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f811o00ooOO = 4;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f812o00ooOO0 = 56;

    /* renamed from: o00oo  reason: collision with root package name */
    public boolean f813o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public Context f814o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public androidx.appcompat.view.menu.o00oOoO f815o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f816o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public ActionMenuPresenter f817o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public boolean f818o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public o00oo0O.o00oOOo0 f819o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public int f820o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public int f821o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public int f822o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public o00oOoO f823o00ooO0o;

    /* renamed from: o0O0o  reason: collision with root package name */
    public o00oOoO.o00oOOo0 f824o0O0o;

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        boolean o00oOo00();

        boolean o00oOooO();
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO implements o00oo0O.o00oOOo0 {
        @Override // androidx.appcompat.view.menu.o00oo0O.o00oOOo0
        public boolean o00oOOo0(@o00oOooO.oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.o00oo0O.o00oOOo0
        public void onCloseMenu(@o00oOooO.oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2, boolean z) {
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 extends LinearLayoutCompat.o00oOOoO {
        @ViewDebug.ExportedProperty

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f825o00oOOo0;
        @ViewDebug.ExportedProperty

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f826o00oOOoO;
        @ViewDebug.ExportedProperty

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f827o00oOo00;
        @ViewDebug.ExportedProperty

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public boolean f828o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public boolean f829o00oOo0o;
        @ViewDebug.ExportedProperty

        /* renamed from: o00oOooO  reason: collision with root package name */
        public boolean f830o00oOooO;

        public o00oOo00(int i, int i2) {
            super(i, i2);
            this.f825o00oOOo0 = false;
        }

        public o00oOo00(int i, int i2, boolean z) {
            super(i, i2);
            this.f825o00oOOo0 = z;
        }

        public o00oOo00(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public o00oOo00(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public o00oOo00(o00oOo00 o00ooo002) {
            super((ViewGroup.LayoutParams) o00ooo002);
            this.f825o00oOOo0 = o00ooo002.f825o00oOOo0;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O implements o00oOoO.o00oOOo0 {
        public o00oOo0O() {
        }

        @Override // androidx.appcompat.view.menu.o00oOoO.o00oOOo0
        public boolean onMenuItemSelected(@o00oOooO.oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2, @o00oOooO.oo0oO0 MenuItem menuItem) {
            o00oOoO o00oooo3 = ActionMenuView.this.f823o00ooO0o;
            return o00oooo3 != null && o00oooo3.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.o00oOoO.o00oOOo0
        public void onMenuModeChange(@o00oOooO.oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2) {
            o00oOoO.o00oOOo0 o00oooo02 = ActionMenuView.this.f824o0O0o;
            if (o00oooo02 != null) {
                o00oooo02.onMenuModeChange(o00oooo2);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOoO {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@o00oOooO.oo0oO0 Context context) {
        this(context, null);
    }

    public ActionMenuView(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f820o00ooO0 = (int) (56.0f * f);
        this.f822o00ooO0O = (int) (f * 4.0f);
        this.f814o00oo0O = context;
        this.f816o00oo0Oo = 0;
    }

    public static int o00oOooo(View view, int i, int i2, int i3, int i4) {
        o00oOo00 o00ooo002 = (o00oOo00) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.o00oOo0O();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (o00ooo002.f825o00oOOo0 || !z2) {
            z = false;
        }
        o00ooo002.f830o00oOooO = z;
        o00ooo002.f826o00oOOoO = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o00oOo00;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f815o00oo0O0 == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.o00oOoO o00oooo2 = new androidx.appcompat.view.menu.o00oOoO(context);
            this.f815o00oo0O0 = o00oooo2;
            o00oooo2.setCallback(new o00oOo0O());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f817o00oo0o = actionMenuPresenter;
            actionMenuPresenter.o00ooOO(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f817o00oo0o;
            o00oo0O.o00oOOo0 o00oooo02 = this.f819o00oo0oO;
            if (o00oooo02 == null) {
                o00oooo02 = new o00oOOoO();
            }
            actionMenuPresenter2.setCallback(o00oooo02);
            this.f815o00oo0O0.addMenuPresenter(this.f817o00oo0o, this.f814o00oo0O);
            this.f817o00oo0o.o00ooO(this);
        }
        return this.f815o00oo0O0;
    }

    @o00oOooO.o0OO00OO
    public Drawable getOverflowIcon() {
        getMenu();
        return this.f817o00oo0o.o00oo0o0();
    }

    public int getPopupTheme() {
        return this.f816o00oo0Oo;
    }

    @Override // androidx.appcompat.view.menu.o0O0o
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.o0O0o
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void initialize(androidx.appcompat.view.menu.o00oOoO o00oooo2) {
        this.f815o00oo0O0 = o00oooo2;
    }

    @Override // androidx.appcompat.view.menu.o00oOoO.o00oOOoO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public boolean o00oOOo0(androidx.appcompat.view.menu.o00oo0OO o00oo0oo) {
        return this.f815o00oo0O0.performItemAction(o00oo0oo, 0);
    }

    public void o00oOOoO() {
        ActionMenuPresenter actionMenuPresenter = this.f817o00oo0o;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.o00oo0O();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: o00oOo00 */
    public o00oOo00 generateDefaultLayoutParams() {
        o00oOo00 o00ooo002 = new o00oOo00(-2, -2);
        ((LinearLayout.LayoutParams) o00ooo002).gravity = 16;
        return o00ooo002;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: o00oOo0O */
    public o00oOo00 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            o00oOo00 o00ooo002 = layoutParams instanceof o00oOo00 ? new o00oOo00((o00oOo00) layoutParams) : new o00oOo00(layoutParams);
            if (((LinearLayout.LayoutParams) o00ooo002).gravity <= 0) {
                ((LinearLayout.LayoutParams) o00ooo002).gravity = 16;
            }
            return o00ooo002;
        }
        return generateDefaultLayoutParams();
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public o00oOo00 o00oOo0o() {
        o00oOo00 generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f825o00oOOo0 = true;
        return generateDefaultLayoutParams;
    }

    public boolean o00oOoO() {
        ActionMenuPresenter actionMenuPresenter = this.f817o00oo0o;
        return actionMenuPresenter != null && actionMenuPresenter.o00oo0o();
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public boolean o00oOoO0(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof o00oOOo0)) {
            z = false | ((o00oOOo0) childAt).o00oOo00();
        }
        return (i <= 0 || !(childAt2 instanceof o00oOOo0)) ? z : z | ((o00oOOo0) childAt2).o00oOooO();
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public boolean o00oOoOO() {
        ActionMenuPresenter actionMenuPresenter = this.f817o00oo0o;
        return actionMenuPresenter != null && actionMenuPresenter.o0O0o();
    }

    public boolean o00oOoOo() {
        ActionMenuPresenter actionMenuPresenter = this.f817o00oo0o;
        return actionMenuPresenter != null && actionMenuPresenter.o00oo();
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public boolean o00oOoo0() {
        return this.f818o00oo0o0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: o00oOooO */
    public o00oOo00 generateLayoutParams(AttributeSet attributeSet) {
        return new o00oOo00(getContext(), attributeSet);
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public androidx.appcompat.view.menu.o00oOoO o00oo0() {
        return this.f815o00oo0O0;
    }

    /* JADX WARN: Type inference failed for: r14v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v9 */
    public final void o00oo00O(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        ?? r14;
        int i8;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i9 = size - paddingRight;
        int i10 = this.f820o00ooO0;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = (i12 / i11) + i10;
        int childCount = getChildCount();
        int i14 = 0;
        int i15 = 0;
        boolean z4 = false;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        long j = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            int i19 = size2;
            if (childAt.getVisibility() == 8) {
                i8 = paddingBottom;
            } else {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i20 = i16 + 1;
                if (z5) {
                    int i21 = this.f822o00ooO0O;
                    i7 = i20;
                    r14 = 0;
                    childAt.setPadding(i21, 0, i21, 0);
                } else {
                    i7 = i20;
                    r14 = 0;
                }
                o00oOo00 o00ooo002 = (o00oOo00) childAt.getLayoutParams();
                o00ooo002.f829o00oOo0o = r14;
                o00ooo002.f827o00oOo00 = r14;
                o00ooo002.f826o00oOOoO = r14;
                o00ooo002.f830o00oOooO = r14;
                ((LinearLayout.LayoutParams) o00ooo002).leftMargin = r14;
                ((LinearLayout.LayoutParams) o00ooo002).rightMargin = r14;
                o00ooo002.f828o00oOo0O = z5 && ((ActionMenuItemView) childAt).o00oOo0O();
                int o00oOooo2 = o00oOooo(childAt, i13, o00ooo002.f825o00oOOo0 ? 1 : i11, childMeasureSpec, paddingBottom);
                i17 = Math.max(i17, o00oOooo2);
                if (o00ooo002.f830o00oOooO) {
                    i18++;
                }
                if (o00ooo002.f825o00oOOo0) {
                    z4 = true;
                }
                i11 -= o00oOooo2;
                i14 = Math.max(i14, childAt.getMeasuredHeight());
                if (o00oOooo2 == 1) {
                    i8 = paddingBottom;
                    j |= 1 << i15;
                    i11 = i11;
                } else {
                    i8 = paddingBottom;
                }
                i16 = i7;
            }
            i15++;
            paddingBottom = i8;
            size2 = i19;
        }
        int i22 = size2;
        boolean z6 = z4 && i16 == 2;
        boolean z7 = false;
        while (i18 > 0 && i11 > 0) {
            int i23 = Integer.MAX_VALUE;
            int i24 = 0;
            int i25 = 0;
            long j2 = 0;
            while (i25 < childCount) {
                boolean z8 = z7;
                o00oOo00 o00ooo003 = (o00oOo00) getChildAt(i25).getLayoutParams();
                int i26 = i14;
                if (o00ooo003.f830o00oOooO) {
                    int i27 = o00ooo003.f826o00oOOoO;
                    if (i27 < i23) {
                        j2 = 1 << i25;
                        i23 = i27;
                        i24 = 1;
                    } else if (i27 == i23) {
                        i24++;
                        j2 |= 1 << i25;
                    }
                }
                i25++;
                i14 = i26;
                z7 = z8;
            }
            z = z7;
            i5 = i14;
            j |= j2;
            if (i24 > i11) {
                i3 = mode;
                i4 = i9;
                break;
            }
            int i28 = i23 + 1;
            int i29 = 0;
            while (i29 < childCount) {
                View childAt2 = getChildAt(i29);
                o00oOo00 o00ooo004 = (o00oOo00) childAt2.getLayoutParams();
                int i30 = i9;
                int i31 = mode;
                long j3 = 1 << i29;
                if ((j2 & j3) == 0) {
                    if (o00ooo004.f826o00oOOoO == i28) {
                        j |= j3;
                    }
                    z3 = z6;
                } else {
                    if (z6 && o00ooo004.f828o00oOo0O && i11 == 1) {
                        int i32 = this.f822o00ooO0O;
                        z3 = z6;
                        childAt2.setPadding(i32 + i13, 0, i32, 0);
                    } else {
                        z3 = z6;
                    }
                    o00ooo004.f826o00oOOoO++;
                    o00ooo004.f829o00oOo0o = true;
                    i11--;
                }
                i29++;
                mode = i31;
                i9 = i30;
                z6 = z3;
            }
            i14 = i5;
            z7 = true;
        }
        i3 = mode;
        i4 = i9;
        z = z7;
        i5 = i14;
        boolean z9 = !z4 && i16 == 1;
        if (i11 <= 0 || j == 0 || (i11 >= i16 - 1 && !z9 && i17 <= 1)) {
            i6 = 0;
            z2 = z;
        } else {
            float bitCount = Long.bitCount(j);
            if (z9) {
                i6 = 0;
            } else {
                i6 = 0;
                if ((j & 1) != 0 && !((o00oOo00) getChildAt(0).getLayoutParams()).f828o00oOo0O) {
                    bitCount -= 0.5f;
                }
                int i33 = childCount - 1;
                if ((j & (1 << i33)) != 0 && !((o00oOo00) getChildAt(i33).getLayoutParams()).f828o00oOo0O) {
                    bitCount -= 0.5f;
                }
            }
            int i34 = bitCount > 0.0f ? (int) ((i11 * i13) / bitCount) : i6;
            z2 = z;
            for (int i35 = i6; i35 < childCount; i35++) {
                if ((j & (1 << i35)) != 0) {
                    View childAt3 = getChildAt(i35);
                    o00oOo00 o00ooo005 = (o00oOo00) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        o00ooo005.f827o00oOo00 = i34;
                        o00ooo005.f829o00oOo0o = true;
                        if (i35 == 0 && !o00ooo005.f828o00oOo0O) {
                            ((LinearLayout.LayoutParams) o00ooo005).leftMargin = (-i34) / 2;
                        }
                        z2 = true;
                    } else if (o00ooo005.f825o00oOOo0) {
                        o00ooo005.f827o00oOo00 = i34;
                        o00ooo005.f829o00oOo0o = true;
                        ((LinearLayout.LayoutParams) o00ooo005).rightMargin = (-i34) / 2;
                        z2 = true;
                    } else {
                        if (i35 != 0) {
                            ((LinearLayout.LayoutParams) o00ooo005).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount - 1) {
                            ((LinearLayout.LayoutParams) o00ooo005).rightMargin = i34 / 2;
                        }
                    }
                }
            }
        }
        if (z2) {
            for (int i36 = i6; i36 < childCount; i36++) {
                View childAt4 = getChildAt(i36);
                o00oOo00 o00ooo006 = (o00oOo00) childAt4.getLayoutParams();
                if (o00ooo006.f829o00oOo0o) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((o00ooo006.f826o00oOOoO * i13) + o00ooo006.f827o00oOo00, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i4, i3 != 1073741824 ? i5 : i22);
    }

    public boolean o00oo0O0() {
        ActionMenuPresenter actionMenuPresenter = this.f817o00oo0o;
        return actionMenuPresenter != null && actionMenuPresenter.o00ooOo0();
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oo0OO(o00oo0O.o00oOOo0 o00oooo02, o00oOoO.o00oOOo0 o00oooo03) {
        this.f819o00oo0oO = o00oooo02;
        this.f824o0O0o = o00oooo03;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f817o00oo0o;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            if (this.f817o00oo0o.o00oo()) {
                this.f817o00oo0o.o00oo0o();
                this.f817o00oo0o.o00ooOo0();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o00oOOoO();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.f813o00oo) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean o00oOOoO2 = o.o00oOOoO(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                o00oOo00 o00ooo002 = (o00oOo00) childAt.getLayoutParams();
                if (o00ooo002.f825o00oOOo0) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (o00oOoO0(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (o00oOOoO2) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) o00ooo002).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) o00ooo002).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) o00ooo002).leftMargin) + ((LinearLayout.LayoutParams) o00ooo002).rightMargin;
                    o00oOoO0(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (o00oOOoO2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                o00oOo00 o00ooo003 = (o00oOo00) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !o00ooo003.f825o00oOOo0) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) o00ooo003).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) o00ooo003).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            o00oOo00 o00ooo004 = (o00oOo00) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !o00ooo004.f825o00oOOo0) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) o00ooo004).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) o00ooo004).rightMargin + max + i19;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        androidx.appcompat.view.menu.o00oOoO o00oooo2;
        boolean z = this.f813o00oo;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f813o00oo = z2;
        if (z != z2) {
            this.f821o00ooO00 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f813o00oo && (o00oooo2 = this.f815o00oo0O0) != null && size != this.f821o00ooO00) {
            this.f821o00ooO00 = size;
            o00oooo2.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (this.f813o00oo && childCount > 0) {
            o00oo00O(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            o00oOo00 o00ooo002 = (o00oOo00) getChildAt(i3).getLayoutParams();
            ((LinearLayout.LayoutParams) o00ooo002).rightMargin = 0;
            ((LinearLayout.LayoutParams) o00ooo002).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z) {
        this.f817o00oo0o.o00ooO0O(z);
    }

    public void setOnMenuItemClickListener(o00oOoO o00oooo2) {
        this.f823o00ooO0o = o00oooo2;
    }

    public void setOverflowIcon(@o00oOooO.o0OO00OO Drawable drawable) {
        getMenu();
        this.f817o00oo0o.o00ooOO0(drawable);
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z) {
        this.f818o00oo0o0 = z;
    }

    public void setPopupTheme(@o00oOooO.o0OOO0OO int i) {
        if (this.f816o00oo0Oo != i) {
            this.f816o00oo0Oo = i;
            if (i == 0) {
                this.f814o00oo0O = getContext();
            } else {
                this.f814o00oo0O = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f817o00oo0o = actionMenuPresenter;
        actionMenuPresenter.o00ooO(this);
    }
}
