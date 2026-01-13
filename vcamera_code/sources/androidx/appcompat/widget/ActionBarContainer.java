package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.R;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: o00oo  reason: collision with root package name */
    public boolean f718o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public View f719o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public boolean f720o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public View f721o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public Drawable f722o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public View f723o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public Drawable f724o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public int f725o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public boolean f726o00ooO00;

    /* renamed from: o0O0o  reason: collision with root package name */
    public Drawable f727o0O0o;

    @o00oOooO.o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        public static void o00oOOo0(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o0O000oo.o0O0o00O.o0O0ooo0(this, new o00oOOoO(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionBar);
        this.f722o00oo0o = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_background);
        this.f724o00oo0oO = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_backgroundStacked);
        this.f725o00ooO0 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionBar_height, -1);
        boolean z = true;
        if (getId() == R.id.split_action_bar) {
            this.f718o00oo = true;
            this.f727o0O0o = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f718o00oo ? this.f722o00oo0o != null || this.f724o00oo0oO != null : this.f727o0O0o != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f722o00oo0o;
        if (drawable != null && drawable.isStateful()) {
            this.f722o00oo0o.setState(getDrawableState());
        }
        Drawable drawable2 = this.f724o00oo0oO;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f724o00oo0oO.setState(getDrawableState());
        }
        Drawable drawable3 = this.f727o0O0o;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f727o0O0o.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f719o00oo0O;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f722o00oo0o;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f724o00oo0oO;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f727o0O0o;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public final int o00oOOo0(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean o00oOOoO(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f721o00oo0Oo = findViewById(R.id.action_bar);
        this.f723o00oo0o0 = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f720o00oo0O0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        View view2 = this.f719o00oo0O;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i, (measuredHeight - view2.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f718o00oo) {
            Drawable drawable3 = this.f727o0O0o;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z2 = z3;
        } else {
            if (this.f722o00oo0o != null) {
                if (this.f721o00oo0Oo.getVisibility() == 0) {
                    drawable2 = this.f722o00oo0o;
                    left = this.f721o00oo0Oo.getLeft();
                    top = this.f721o00oo0Oo.getTop();
                    right = this.f721o00oo0Oo.getRight();
                    view = this.f721o00oo0Oo;
                } else {
                    View view3 = this.f723o00oo0o0;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f722o00oo0o.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.f722o00oo0o;
                        left = this.f723o00oo0o0.getLeft();
                        top = this.f723o00oo0o0.getTop();
                        right = this.f723o00oo0o0.getRight();
                        view = this.f723o00oo0o0;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f726o00ooO00 = z4;
            if (z4 && (drawable = this.f724o00oo0oO) != null) {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
            z2 = z3;
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f721o00oo0Oo
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f725o00ooO0
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f721o00oo0Oo
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f719o00oo0O
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f721o00oo0Oo
            boolean r0 = r3.o00oOOoO(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f721o00oo0Oo
        L42:
            int r0 = r3.o00oOOo0(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f723o00oo0o0
            boolean r0 = r3.o00oOOoO(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f723o00oo0o0
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f719o00oo0O
            int r1 = r3.o00oOOo0(r1)
            int r1 = r1 + r0
            int r4 = java.lang.Math.min(r1, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f722o00oo0o;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f722o00oo0o);
        }
        this.f722o00oo0o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f721o00oo0Oo;
            if (view != null) {
                this.f722o00oo0o.setBounds(view.getLeft(), this.f721o00oo0Oo.getTop(), this.f721o00oo0Oo.getRight(), this.f721o00oo0Oo.getBottom());
            }
        }
        boolean z = true;
        if (!this.f718o00oo ? this.f722o00oo0o != null || this.f724o00oo0oO != null : this.f727o0O0o != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f727o0O0o;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f727o0O0o);
        }
        this.f727o0O0o = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f718o00oo && (drawable2 = this.f727o0O0o) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f718o00oo ? !(this.f722o00oo0o != null || this.f724o00oo0oO != null) : this.f727o0O0o == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f724o00oo0oO;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f724o00oo0oO);
        }
        this.f724o00oo0oO = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f726o00ooO00 && (drawable2 = this.f724o00oo0oO) != null) {
                drawable2.setBounds(this.f719o00oo0O.getLeft(), this.f719o00oo0O.getTop(), this.f719o00oo0O.getRight(), this.f719o00oo0O.getBottom());
            }
        }
        boolean z = true;
        if (!this.f718o00oo ? this.f722o00oo0o != null || this.f724o00oo0oO != null : this.f727o0O0o != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(o0OoOoO o0ooooo) {
        View view = this.f719o00oo0O;
        if (view != null) {
            removeView(view);
        }
        this.f719o00oo0O = o0ooooo;
        if (o0ooooo != null) {
            addView(o0ooooo);
            ViewGroup.LayoutParams layoutParams = o0ooooo.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            o0ooooo.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f720o00oo0O0 = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f722o00oo0o;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f724o00oo0oO;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f727o0O0o;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(@o00oOooO.oo0oO0 Drawable drawable) {
        return (drawable == this.f722o00oo0o && !this.f718o00oo) || (drawable == this.f724o00oo0oO && this.f726o00ooO00) || ((drawable == this.f727o0O0o && this.f718o00oo) || super.verifyDrawable(drawable));
    }
}
