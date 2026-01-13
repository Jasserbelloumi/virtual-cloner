package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.badge.BadgeDrawable;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0000O.o00oOOo0;
import o0O000oo.o0;
import o0O000oo.o0O0o00O;
import o0O000oo.o0OOo000;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    private int overlayTop;
    public final Rect tempRect1;
    public final Rect tempRect2;
    private int verticalLayoutGap;

    public HeaderScrollingViewBehavior() {
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }

    private static int resolveGravity(int i) {
        return i == 0 ? BadgeDrawable.TOP_START : i;
    }

    @o0OO00OO
    public abstract View findFirstDependency(List<View> list);

    public final int getOverlapPixelsForOffset(View view) {
        if (this.overlayTop == 0) {
            return 0;
        }
        float overlapRatioForOffset = getOverlapRatioForOffset(view);
        int i = this.overlayTop;
        return o00oOOo0.o00oOo0O((int) (overlapRatioForOffset * i), 0, i);
    }

    public float getOverlapRatioForOffset(View view) {
        return 1.0f;
    }

    public final int getOverlayTop() {
        return this.overlayTop;
    }

    public int getScrollRange(@oo0oO0 View view) {
        return view.getMeasuredHeight();
    }

    public final int getVerticalLayoutGap() {
        return this.verticalLayoutGap;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public void layoutChild(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 View view, int i) {
        int i2;
        View findFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
        if (findFirstDependency != null) {
            CoordinatorLayout.o00oo0 o00oo0Var = (CoordinatorLayout.o00oo0) view.getLayoutParams();
            Rect rect = this.tempRect1;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) o00oo0Var).leftMargin, findFirstDependency.getBottom() + ((ViewGroup.MarginLayoutParams) o00oo0Var).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) o00oo0Var).rightMargin, ((findFirstDependency.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) o00oo0Var).bottomMargin);
            o0OOo000 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && o0O0o00O.o0(coordinatorLayout) && !o0O0o00O.o00oo0OO.o00oOOoO(view)) {
                rect.left = lastWindowInsets.o00oo0O0() + rect.left;
                rect.right -= lastWindowInsets.o00oo0O();
            }
            Rect rect2 = this.tempRect2;
            o0.o00oOOo0.o00oOOoO(resolveGravity(o00oo0Var.f2300o00oOo00), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int overlapPixelsForOffset = getOverlapPixelsForOffset(findFirstDependency);
            view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
            i2 = rect2.top - findFirstDependency.getBottom();
        } else {
            super.layoutChild(coordinatorLayout, view, i);
            i2 = 0;
        }
        this.verticalLayoutGap = i2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.o00oOo00
    public boolean onMeasureChild(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 View view, int i, int i2, int i3, int i4) {
        View findFirstDependency;
        o0OOo000 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 == -1 || i5 == -2) && (findFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view))) != null) {
            int size = View.MeasureSpec.getSize(i3);
            if (size <= 0) {
                size = coordinatorLayout.getHeight();
            } else if (o0O0o00O.o0(findFirstDependency) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size = lastWindowInsets.o00oo0OO() + lastWindowInsets.o00oo0Oo() + size;
            }
            int scrollRange = size + getScrollRange(findFirstDependency);
            int measuredHeight = findFirstDependency.getMeasuredHeight();
            if (shouldHeaderOverlapScrollingChild()) {
                view.setTranslationY(-measuredHeight);
            } else {
                scrollRange -= measuredHeight;
            }
            coordinatorLayout.onMeasureChild(view, i, i2, View.MeasureSpec.makeMeasureSpec(scrollRange, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
            return true;
        }
        return false;
    }

    public final void setOverlayTop(int i) {
        this.overlayTop = i;
    }

    public boolean shouldHeaderOverlapScrollingChild() {
        return false;
    }
}
