package com.google.android.material.internal;

import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0OOoo;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes2.dex */
public class ToolbarUtils {
    private ToolbarUtils() {
    }

    @o0OO00OO
    public static ActionMenuItemView getActionMenuItemView(@oo0oO0 Toolbar toolbar, @oo0OOoo int i) {
        ActionMenuView actionMenuView = getActionMenuView(toolbar);
        if (actionMenuView != null) {
            for (int i2 = 0; i2 < actionMenuView.getChildCount(); i2++) {
                View childAt = actionMenuView.getChildAt(i2);
                if (childAt instanceof ActionMenuItemView) {
                    ActionMenuItemView actionMenuItemView = (ActionMenuItemView) childAt;
                    if (actionMenuItemView.getItemData().f686o00oOooo == i) {
                        return actionMenuItemView;
                    }
                }
            }
            return null;
        }
        return null;
    }

    @o0OO00OO
    public static ActionMenuView getActionMenuView(@oo0oO0 Toolbar toolbar) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    @o0OO00OO
    public static ImageButton getNavigationIconButton(@oo0oO0 Toolbar toolbar) {
        if (toolbar.getChildCount() > 0) {
            View childAt = toolbar.getChildAt(0);
            if (childAt instanceof ImageButton) {
                return (ImageButton) childAt;
            }
            return null;
        }
        return null;
    }

    @o0OO00OO
    public static View getSecondaryActionMenuItemView(@oo0oO0 Toolbar toolbar) {
        ActionMenuView actionMenuView = getActionMenuView(toolbar);
        if (actionMenuView == null || actionMenuView.getChildCount() <= 1) {
            return null;
        }
        return actionMenuView.getChildAt(0);
    }
}
