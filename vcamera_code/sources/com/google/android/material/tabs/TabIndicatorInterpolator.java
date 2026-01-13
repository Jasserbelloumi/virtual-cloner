package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.tabs.TabLayout;
import o00oOooO.o0O0O0O;
import o00oOooO.o0O0OO0;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class TabIndicatorInterpolator {
    @o0O0O0O(unit = 0)
    private static final int MIN_INDICATOR_WIDTH = 24;

    public static RectF calculateIndicatorWidthForTab(TabLayout tabLayout, @o0OO00OO View view) {
        return view == null ? new RectF() : (tabLayout.isTabIndicatorFullWidth() || !(view instanceof TabLayout.TabView)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : calculateTabViewContentBounds((TabLayout.TabView) view, 24);
    }

    public static RectF calculateTabViewContentBounds(@oo0oO0 TabLayout.TabView tabView, @o0O0O0O(unit = 0) int i) {
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int dpToPx = (int) ViewUtils.dpToPx(tabView.getContext(), i);
        if (contentWidth < dpToPx) {
            contentWidth = dpToPx;
        }
        int right = (tabView.getRight() + tabView.getLeft()) / 2;
        int bottom = (tabView.getBottom() + tabView.getTop()) / 2;
        int i2 = contentWidth / 2;
        return new RectF(right - i2, bottom - (contentHeight / 2), i2 + right, (right / 2) + bottom);
    }

    public void setIndicatorBoundsForOffset(TabLayout tabLayout, View view, View view2, @o0O0OO0(from = 0.0d, to = 1.0d) float f, @oo0oO0 Drawable drawable) {
        RectF calculateIndicatorWidthForTab = calculateIndicatorWidthForTab(tabLayout, view);
        RectF calculateIndicatorWidthForTab2 = calculateIndicatorWidthForTab(tabLayout, view2);
        drawable.setBounds(AnimationUtils.lerp((int) calculateIndicatorWidthForTab.left, (int) calculateIndicatorWidthForTab2.left, f), drawable.getBounds().top, AnimationUtils.lerp((int) calculateIndicatorWidthForTab.right, (int) calculateIndicatorWidthForTab2.right, f), drawable.getBounds().bottom);
    }

    public void setIndicatorBoundsForTab(TabLayout tabLayout, View view, @oo0oO0 Drawable drawable) {
        RectF calculateIndicatorWidthForTab = calculateIndicatorWidthForTab(tabLayout, view);
        drawable.setBounds((int) calculateIndicatorWidthForTab.left, drawable.getBounds().top, (int) calculateIndicatorWidthForTab.right, drawable.getBounds().bottom);
    }
}
