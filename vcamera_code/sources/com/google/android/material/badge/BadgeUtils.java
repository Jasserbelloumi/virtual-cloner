package com.google.android.material.badge;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.ToolbarUtils;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0OOoo;
import o00oOooO.oo0oO0;
@ExperimentalBadgeUtils
/* loaded from: classes2.dex */
public class BadgeUtils {
    private static final String LOG_TAG = "BadgeUtils";
    public static final boolean USE_COMPAT_PARENT = false;

    private BadgeUtils() {
    }

    public static void attachBadgeDrawable(@oo0oO0 BadgeDrawable badgeDrawable, @oo0oO0 View view) {
        attachBadgeDrawable(badgeDrawable, view, (FrameLayout) null);
    }

    public static void attachBadgeDrawable(@oo0oO0 BadgeDrawable badgeDrawable, @oo0oO0 View view, @o0OO00OO FrameLayout frameLayout) {
        setBadgeDrawableBounds(badgeDrawable, view, frameLayout);
        if (badgeDrawable.getCustomBadgeParent() != null) {
            badgeDrawable.getCustomBadgeParent().setForeground(badgeDrawable);
        } else if (USE_COMPAT_PARENT) {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        } else {
            view.getOverlay().add(badgeDrawable);
        }
    }

    public static void attachBadgeDrawable(@oo0oO0 BadgeDrawable badgeDrawable, @oo0oO0 Toolbar toolbar, @oo0OOoo int i) {
        attachBadgeDrawable(badgeDrawable, toolbar, i, null);
    }

    public static void attachBadgeDrawable(@oo0oO0 final BadgeDrawable badgeDrawable, @oo0oO0 final Toolbar toolbar, @oo0OOoo final int i, @o0OO00OO final FrameLayout frameLayout) {
        toolbar.post(new Runnable() { // from class: com.google.android.material.badge.BadgeUtils.1
            @Override // java.lang.Runnable
            public void run() {
                ActionMenuItemView actionMenuItemView = ToolbarUtils.getActionMenuItemView(Toolbar.this, i);
                if (actionMenuItemView != null) {
                    BadgeDrawable badgeDrawable2 = badgeDrawable;
                    badgeDrawable2.setHorizontalOffset(Toolbar.this.getResources().getDimensionPixelOffset(R.dimen.mtrl_badge_toolbar_action_menu_item_horizontal_offset) + badgeDrawable2.getHorizontalOffset());
                    BadgeDrawable badgeDrawable3 = badgeDrawable;
                    badgeDrawable3.setVerticalOffset(Toolbar.this.getResources().getDimensionPixelOffset(R.dimen.mtrl_badge_toolbar_action_menu_item_vertical_offset) + badgeDrawable3.getVerticalOffset());
                    BadgeUtils.attachBadgeDrawable(badgeDrawable, actionMenuItemView, frameLayout);
                }
            }
        });
    }

    @oo0oO0
    public static SparseArray<BadgeDrawable> createBadgeDrawablesFromSavedStates(Context context, @oo0oO0 ParcelableSparseArray parcelableSparseArray) {
        SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i = 0; i < parcelableSparseArray.size(); i++) {
            int keyAt = parcelableSparseArray.keyAt(i);
            BadgeDrawable.SavedState savedState = (BadgeDrawable.SavedState) parcelableSparseArray.valueAt(i);
            if (savedState == null) {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
            sparseArray.put(keyAt, BadgeDrawable.createFromSavedState(context, savedState));
        }
        return sparseArray;
    }

    @oo0oO0
    public static ParcelableSparseArray createParcelableBadgeStates(@oo0oO0 SparseArray<BadgeDrawable> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            BadgeDrawable valueAt = sparseArray.valueAt(i);
            if (valueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            parcelableSparseArray.put(keyAt, valueAt.getSavedState());
        }
        return parcelableSparseArray;
    }

    public static void detachBadgeDrawable(@o0OO00OO BadgeDrawable badgeDrawable, @oo0oO0 View view) {
        if (badgeDrawable == null) {
            return;
        }
        if (USE_COMPAT_PARENT || badgeDrawable.getCustomBadgeParent() != null) {
            badgeDrawable.getCustomBadgeParent().setForeground(null);
        } else {
            view.getOverlay().remove(badgeDrawable);
        }
    }

    public static void detachBadgeDrawable(@o0OO00OO BadgeDrawable badgeDrawable, @oo0oO0 Toolbar toolbar, @oo0OOoo int i) {
        ActionMenuItemView actionMenuItemView;
        if (badgeDrawable == null || (actionMenuItemView = ToolbarUtils.getActionMenuItemView(toolbar, i)) == null) {
            return;
        }
        detachBadgeDrawable(badgeDrawable, actionMenuItemView);
    }

    public static void setBadgeDrawableBounds(@oo0oO0 BadgeDrawable badgeDrawable, @oo0oO0 View view, @o0OO00OO FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.updateBadgeCoordinates(view, frameLayout);
    }

    public static void updateBadgeBounds(@oo0oO0 Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
