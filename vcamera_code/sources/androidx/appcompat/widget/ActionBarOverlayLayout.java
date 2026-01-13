package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.o00oo0O;
import o00oOooO.o0OO0oO;
import o00oooOo.oOO00o;
import o0O000oo.o0OOo000;
@SuppressLint({"UnknownNullness"})
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements o0O0OOO0, o0O000oo.o0O0O0Oo, o0O000oo.o0oO0O0o, o0O000oo.o0O0oo0o {

    /* renamed from: o0  reason: collision with root package name */
    public static final String f742o0 = "ActionBarOverlayLayout";

    /* renamed from: o0O00000  reason: collision with root package name */
    public static final int f743o0O00000 = 600;

    /* renamed from: o0O0000O  reason: collision with root package name */
    public static final int[] f744o0O0000O = {R.attr.actionBarSize, 16842841};

    /* renamed from: o00oo  reason: collision with root package name */
    public boolean f745o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f746o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f747o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public ContentFrameLayout f748o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public o0O0OOO f749o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public ActionBarContainer f750o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public Drawable f751o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public int f752o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public boolean f753o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public boolean f754o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public boolean f755o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public int f756o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public final Rect f757o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public final Rect f758o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public final Rect f759o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public final Rect f760o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public final Rect f761o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public final Rect f762o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public final Rect f763o00ooOoo;
    @o00oOooO.oo0oO0

    /* renamed from: o00ooo0  reason: collision with root package name */
    public o0O000oo.o0OOo000 f764o00ooo0;
    @o00oOooO.oo0oO0

    /* renamed from: o00ooo00  reason: collision with root package name */
    public o0O000oo.o0OOo000 f765o00ooo00;
    @o00oOooO.oo0oO0

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public o0O000oo.o0OOo000 f766o00ooo0O;
    @o00oOooO.oo0oO0

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public o0O000oo.o0OOo000 f767o00ooo0o;

    /* renamed from: o00oooO  reason: collision with root package name */
    public o00oOo0O f768o00oooO;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public OverScroller f769o00oooOO;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public ViewPropertyAnimator f770o00oooOo;

    /* renamed from: o00oooo  reason: collision with root package name */
    public final Runnable f771o00oooo;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public final AnimatorListenerAdapter f772o00oooo0;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public final Runnable f773o00ooooO;

    /* renamed from: o00ooooo  reason: collision with root package name */
    public final o0O000oo.o0O0O0o0 f774o00ooooo;

    /* renamed from: o0O0o  reason: collision with root package name */
    public boolean f775o0O0o;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends AnimatorListenerAdapter {
        public o00oOOo0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f770o00oooOo = null;
            actionBarOverlayLayout.f755o00ooO0O = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f770o00oooOo = null;
            actionBarOverlayLayout.f755o00ooO0O = false;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Runnable {
        public o00oOOoO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.o00oo0o0();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f770o00oooOo = actionBarOverlayLayout.f750o00oo0o0.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f772o00oooo0);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements Runnable {
        public o00oOo00() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.o00oo0o0();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f770o00oooOo = actionBarOverlayLayout.f750o00oo0o0.animate().translationY(-ActionBarOverlayLayout.this.f750o00oo0o0.getHeight()).setListener(ActionBarOverlayLayout.this.f772o00oooo0);
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOo0O {
        void o00oOOo0();

        void o00oOOoO();

        void o00oOo00(boolean z);

        void o00oOo0O();

        void o00oOooO();

        void onWindowVisibilityChanged(int i);
    }

    /* loaded from: classes.dex */
    public static class o00oOoO extends ViewGroup.MarginLayoutParams {
        public o00oOoO(int i, int i2) {
            super(i, i2);
        }

        public o00oOoO(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public o00oOoO(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public o00oOoO(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public ActionBarOverlayLayout(@o00oOooO.oo0oO0 Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f746o00oo0O = 0;
        this.f758o00ooOO0 = new Rect();
        this.f757o00ooOO = new Rect();
        this.f759o00ooOOo = new Rect();
        this.f761o00ooOo0 = new Rect();
        this.f760o00ooOo = new Rect();
        this.f762o00ooOoO = new Rect();
        this.f763o00ooOoo = new Rect();
        o0O000oo.o0OOo000 o0ooo000 = o0O000oo.o0OOo000.f10753o00oOo00;
        this.f765o00ooo00 = o0ooo000;
        this.f764o00ooo0 = o0ooo000;
        this.f766o00ooo0O = o0ooo000;
        this.f767o00ooo0o = o0ooo000;
        this.f772o00oooo0 = new o00oOOo0();
        this.f771o00oooo = new o00oOOoO();
        this.f773o00ooooO = new o00oOo00();
        o00oo0o(context);
        this.f774o00ooooo = new o0O000oo.o0O0O0o0(this);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o00oOoO;
    }

    @Override // android.view.View
    public void draw(@o00oOooO.oo0oO0 Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f751o00oo0oO == null || this.f775o0O0o) {
            return;
        }
        if (this.f750o00oo0o0.getVisibility() == 0) {
            i = (int) (this.f750o00oo0o0.getTranslationY() + this.f750o00oo0o0.getBottom() + 0.5f);
        } else {
            i = 0;
        }
        this.f751o00oo0oO.setBounds(0, i, getWidth(), this.f751o00oo0oO.getIntrinsicHeight() + i);
        this.f751o00oo0oO.draw(canvas);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new o00oOoO(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f750o00oo0o0;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup, o0O000oo.o0O0O0Oo
    public int getNestedScrollAxes() {
        return this.f774o00ooooo.o00oOOo0();
    }

    @Override // androidx.appcompat.widget.o0O0OOO0
    public CharSequence getTitle() {
        o00ooO0();
        return this.f749o00oo0o.getTitle();
    }

    @Override // androidx.appcompat.widget.o0O0OOO0
    public boolean o00oOOo0() {
        o00ooO0();
        return this.f749o00oo0o.o00oOOo0();
    }

    @Override // androidx.appcompat.widget.o0O0OOO0
    public boolean o00oOOoO() {
        o00ooO0();
        return this.f749o00oo0o.o00oOOoO();
    }

    @Override // androidx.appcompat.widget.o0O0OOO0
    public boolean o00oOo00() {
        o00ooO0();
        return this.f749o00oo0o.o00oOo00();
    }

    @Override // androidx.appcompat.widget.o0O0OOO0
    public void o00oOo0O(Menu menu, o00oo0O.o00oOOo0 o00oooo02) {
        o00ooO0();
        this.f749o00oo0o.o00oOo0O(menu, o00oooo02);
    }

    @Override // androidx.appcompat.widget.o0O0OOO0
    public boolean o00oOo0o() {
        o00ooO0();
        return this.f749o00oo0o.o00oOo0o();
    }

    @Override // androidx.appcompat.widget.o0O0OOO0
    public boolean o00oOoO() {
        o00ooO0();
        return this.f749o00oo0o.o00oOoO();
    }

    @Override // androidx.appcompat.widget.o0O0OOO0
    public void o00oOoO0() {
        o00ooO0();
        this.f749o00oo0o.o00oOoO0();
    }

    @Override // androidx.appcompat.widget.o0O0OOO0
    public boolean o00oOoOO() {
        o00ooO0();
        return this.f749o00oo0o.o00oOoOO();
    }

    @Override // androidx.appcompat.widget.o0O0OOO0
    public void o00oOoOo(SparseArray<Parcelable> sparseArray) {
        o00ooO0();
        this.f749o00oo0o.o00ooOo(sparseArray);
    }

    @Override // androidx.appcompat.widget.o0O0OOO0
    public void o00oOoo0(int i) {
        o00ooO0();
        if (i == 2) {
            this.f749o00oo0o.o00ooO00();
        } else if (i == 5) {
            this.f749o00oo0o.o00oooo0();
        } else if (i != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.o0O0OOO0
    public boolean o00oOooO() {
        o00ooO0();
        return this.f749o00oo0o.o00oOooO();
    }

    @Override // androidx.appcompat.widget.o0O0OOO0
    public void o00oOooo() {
        o00ooO0();
        this.f749o00oo0o.o00ooO();
    }

    public final void o00oo() {
        o00oo0o0();
        postDelayed(this.f773o00ooooO, 600L);
    }

    public final void o00oo0() {
        o00oo0o0();
        this.f773o00ooooO.run();
    }

    @Override // androidx.appcompat.widget.o0O0OOO0
    public void o00oo00O(SparseArray<Parcelable> sparseArray) {
        o00ooO0();
        this.f749o00oo0o.o00ooo0o(sparseArray);
    }

    @Override // android.view.ViewGroup
    /* renamed from: o00oo0O */
    public o00oOoO generateLayoutParams(AttributeSet attributeSet) {
        return new o00oOoO(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: o00oo0O0 */
    public o00oOoO generateDefaultLayoutParams() {
        return new o00oOoO(-1, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o00oo0OO(@o00oOooO.oo0oO0 android.view.View r3, @o00oOooO.oo0oO0 android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$o00oOoO r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.o00oOoO) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.o00oo0OO(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    public final o0O0OOO o00oo0Oo(View view) {
        if (view instanceof o0O0OOO) {
            return (o0O0OOO) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Can't make a decor toolbar out of ");
        o00oOOo02.append(view.getClass().getSimpleName());
        throw new IllegalStateException(o00oOOo02.toString());
    }

    public final void o00oo0o(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f744o0O0000O);
        this.f747o00oo0O0 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f751o00oo0oO = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f775o0O0o = context.getApplicationInfo().targetSdkVersion < 19;
        this.f769o00oooOO = new OverScroller(context);
    }

    public void o00oo0o0() {
        removeCallbacks(this.f771o00oooo);
        removeCallbacks(this.f773o00ooooO);
        ViewPropertyAnimator viewPropertyAnimator = this.f770o00oooOo;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean o00oo0oO() {
        return this.f753o00ooO0;
    }

    public void o00ooO0() {
        if (this.f748o00oo0Oo == null) {
            this.f748o00oo0Oo = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f750o00oo0o0 = (ActionBarContainer) findViewById(R.id.action_bar_container);
            this.f749o00oo0o = o00oo0Oo(findViewById(R.id.action_bar));
        }
    }

    public final void o00ooO00() {
        o00oo0o0();
        postDelayed(this.f771o00oooo, 600L);
    }

    public final void o00ooO0O() {
        o00oo0o0();
        this.f771o00oooo.run();
    }

    public final boolean o00ooO0o(float f) {
        this.f769o00oooOO.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f769o00oooOO.getFinalY() > this.f750o00oo0o0.getHeight();
    }

    public boolean o0O0o() {
        return this.f745o00oo;
    }

    @Override // android.view.View
    @o00oOooO.o0OOooO0(21)
    public WindowInsets onApplyWindowInsets(@o00oOooO.oo0oO0 WindowInsets windowInsets) {
        o00ooO0();
        o0O000oo.o0OOo000 o00ooo0O2 = o0O000oo.o0OOo000.o00ooo0O(windowInsets, this);
        boolean o00oo0OO2 = o00oo0OO(this.f750o00oo0o0, new Rect(o00ooo0O2.o00oo0O0(), o00ooo0O2.o00oo0Oo(), o00ooo0O2.o00oo0O(), o00ooo0O2.o00oo0OO()), true, true, false, true);
        o0O000oo.o0O0o00O.o00oo0OO(this, o00ooo0O2, this.f758o00ooOO0);
        Rect rect = this.f758o00ooOO0;
        o0O000oo.o0OOo000 o00ooO002 = o00ooo0O2.o00ooO00(rect.left, rect.top, rect.right, rect.bottom);
        this.f765o00ooo00 = o00ooO002;
        boolean z = true;
        if (!this.f764o00ooo0.equals(o00ooO002)) {
            this.f764o00ooo0 = this.f765o00ooo00;
            o00oo0OO2 = true;
        }
        if (this.f757o00ooOO.equals(this.f758o00ooOO0)) {
            z = o00oo0OO2;
        } else {
            this.f757o00ooOO.set(this.f758o00ooOO0);
        }
        if (z) {
            requestLayout();
        }
        return o00ooo0O2.o00oOOo0().o00oOo00().o00oOOoO().o00ooo00();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o00oo0o(getContext());
        o0O000oo.o0O0o00O.o0O0oOO0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o00oo0o0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                o00oOoO o00oooo2 = (o00oOoO) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) o00oooo2).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) o00oooo2).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        o0O000oo.o0OOo000 o00oOOo02;
        o00ooO0();
        measureChildWithMargins(this.f750o00oo0o0, i, 0, i2, 0);
        o00oOoO o00oooo2 = (o00oOoO) this.f750o00oo0o0.getLayoutParams();
        int max = Math.max(0, this.f750o00oo0o0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) o00oooo2).leftMargin + ((ViewGroup.MarginLayoutParams) o00oooo2).rightMargin);
        int max2 = Math.max(0, this.f750o00oo0o0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) o00oooo2).topMargin + ((ViewGroup.MarginLayoutParams) o00oooo2).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f750o00oo0o0.getMeasuredState());
        boolean z = (o0O000oo.o0O0o00O.o0O0O0o(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f747o00oo0O0;
            if (this.f754o00ooO00 && this.f750o00oo0o0.getTabContainer() != null) {
                measuredHeight += this.f747o00oo0O0;
            }
        } else {
            measuredHeight = this.f750o00oo0o0.getVisibility() != 8 ? this.f750o00oo0o0.getMeasuredHeight() : 0;
        }
        this.f759o00ooOOo.set(this.f758o00ooOO0);
        o0O000oo.o0OOo000 o0ooo000 = this.f765o00ooo00;
        this.f766o00ooo0O = o0ooo000;
        if (this.f745o00oo || z) {
            oOO00o o00oOooO2 = oOO00o.o00oOooO(o0ooo000.o00oo0O0(), this.f766o00ooo0O.o00oo0Oo() + measuredHeight, this.f766o00ooo0O.o00oo0O(), this.f766o00ooo0O.o00oo0OO() + 0);
            o0OOo000.o00oOOoO o00ooooo2 = new o0OOo000.o00oOOoO(this.f766o00ooo0O);
            o00ooooo2.f10759o00oOOo0.o00oOoOO(o00oOooO2);
            o00oOOo02 = o00ooooo2.o00oOOo0();
        } else {
            Rect rect = this.f759o00ooOOo;
            rect.top += measuredHeight;
            rect.bottom += 0;
            o00oOOo02 = o0ooo000.o00ooO00(0, measuredHeight, 0, 0);
        }
        this.f766o00ooo0O = o00oOOo02;
        o00oo0OO(this.f748o00oo0Oo, this.f759o00ooOOo, true, true, true, true);
        if (!this.f767o00ooo0o.equals(this.f766o00ooo0O)) {
            o0O000oo.o0OOo000 o0ooo0002 = this.f766o00ooo0O;
            this.f767o00ooo0o = o0ooo0002;
            o0O000oo.o0O0o00O.o00oo0O0(this.f748o00oo0Oo, o0ooo0002);
        }
        measureChildWithMargins(this.f748o00oo0Oo, i, 0, i2, 0);
        o00oOoO o00oooo3 = (o00oOoO) this.f748o00oo0Oo.getLayoutParams();
        int max3 = Math.max(max, this.f748o00oo0Oo.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) o00oooo3).leftMargin + ((ViewGroup.MarginLayoutParams) o00oooo3).rightMargin);
        int max4 = Math.max(max2, this.f748o00oo0Oo.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) o00oooo3).topMargin + ((ViewGroup.MarginLayoutParams) o00oooo3).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f748o00oo0Oo.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.f753o00ooO0 && z) {
            if (o00ooO0o(f2)) {
                o00oo0();
            } else {
                o00ooO0O();
            }
            this.f755o00ooO0O = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // o0O000oo.o0oO0O0o
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f756o00ooO0o + i2;
        this.f756o00ooO0o = i5;
        setActionBarHideOffset(i5);
    }

    @Override // o0O000oo.o0oO0O0o
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // o0O000oo.o0O0oo0o
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f774o00ooooo.o00oOOoO(view, view2, i);
        this.f756o00ooO0o = getActionBarHideOffset();
        o00oo0o0();
        o00oOo0O o00ooo0o2 = this.f768o00oooO;
        if (o00ooo0o2 != null) {
            o00ooo0o2.o00oOo0O();
        }
    }

    @Override // o0O000oo.o0oO0O0o
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f750o00oo0o0.getVisibility() != 0) {
            return false;
        }
        return this.f753o00ooO0;
    }

    @Override // o0O000oo.o0oO0O0o
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public void onStopNestedScroll(View view) {
        if (this.f753o00ooO0 && !this.f755o00ooO0O) {
            if (this.f756o00ooO0o <= this.f750o00oo0o0.getHeight()) {
                o00ooO00();
            } else {
                o00oo();
            }
        }
        o00oOo0O o00ooo0o2 = this.f768o00oooO;
        if (o00ooo0o2 != null) {
            o00ooo0o2.o00oOOoO();
        }
    }

    @Override // o0O000oo.o0oO0O0o
    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        o00ooO0();
        int i2 = this.f752o00ooO ^ i;
        this.f752o00ooO = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        o00oOo0O o00ooo0o2 = this.f768o00oooO;
        if (o00ooo0o2 != null) {
            o00ooo0o2.o00oOo00(!z2);
            if (z || !z2) {
                this.f768o00oooO.o00oOOo0();
            } else {
                this.f768o00oooO.o00oOooO();
            }
        }
        if ((i2 & 256) == 0 || this.f768o00oooO == null) {
            return;
        }
        o0O000oo.o0O0o00O.o0O0oOO0(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f746o00oo0O = i;
        o00oOo0O o00ooo0o2 = this.f768o00oooO;
        if (o00ooo0o2 != null) {
            o00ooo0o2.onWindowVisibilityChanged(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        o00oo0o0();
        this.f750o00oo0o0.setTranslationY(-Math.max(0, Math.min(i, this.f750o00oo0o0.getHeight())));
    }

    public void setActionBarVisibilityCallback(o00oOo0O o00ooo0o2) {
        this.f768o00oooO = o00ooo0o2;
        if (getWindowToken() != null) {
            this.f768o00oooO.onWindowVisibilityChanged(this.f746o00oo0O);
            int i = this.f752o00ooO;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                o0O000oo.o0O0o00O.o0O0oOO0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f754o00ooO00 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f753o00ooO0) {
            this.f753o00ooO0 = z;
            if (z) {
                return;
            }
            o00oo0o0();
            setActionBarHideOffset(0);
        }
    }

    @Override // androidx.appcompat.widget.o0O0OOO0
    public void setIcon(int i) {
        o00ooO0();
        this.f749o00oo0o.setIcon(i);
    }

    @Override // androidx.appcompat.widget.o0O0OOO0
    public void setIcon(Drawable drawable) {
        o00ooO0();
        this.f749o00oo0o.setIcon(drawable);
    }

    @Override // androidx.appcompat.widget.o0O0OOO0
    public void setLogo(int i) {
        o00ooO0();
        this.f749o00oo0o.setLogo(i);
    }

    public void setOverlayMode(boolean z) {
        this.f745o00oo = z;
        this.f775o0O0o = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    @Override // androidx.appcompat.widget.o0O0OOO0
    public void setUiOptions(int i) {
    }

    @Override // androidx.appcompat.widget.o0O0OOO0
    public void setWindowCallback(Window.Callback callback) {
        o00ooO0();
        this.f749o00oo0o.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.o0O0OOO0
    public void setWindowTitle(CharSequence charSequence) {
        o00ooO0();
        this.f749o00oo0o.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
