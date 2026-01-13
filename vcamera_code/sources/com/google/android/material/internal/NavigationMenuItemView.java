package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.o00oo0OO;
import androidx.appcompat.view.menu.o0O0o;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.o0OOOO;
import androidx.core.widget.o0OoOoOo;
import com.google.android.material.R;
import o00oOooO.o0O0O0O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0OO;
import o00oooo0.o0O0O0Oo;
import o0O00.o00oo0O;
import o0O000oo.o00oOOoO;
import o0O000oo.o0O0o00O;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements o0O0o.o00oOOo0 {
    private static final int[] CHECKED_STATE_SET = {16842912};
    private final o00oOOoO accessibilityDelegate;
    private FrameLayout actionArea;
    public boolean checkable;
    private Drawable emptyDrawable;
    private boolean hasIconTintList;
    private int iconSize;
    private ColorStateList iconTintList;
    private o00oo0OO itemData;
    private boolean needsEmptyIcon;
    private final CheckedTextView textView;

    public NavigationMenuItemView(@oo0oO0 Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o00oOOoO o00ooooo2 = new o00oOOoO() { // from class: com.google.android.material.internal.NavigationMenuItemView.1
            @Override // o0O000oo.o00oOOoO
            public void onInitializeAccessibilityNodeInfo(View view, @oo0oO0 o00oo0O o00oo0o2) {
                super.onInitializeAccessibilityNodeInfo(view, o00oo0o2);
                o00oo0o2.o0O0OoO(NavigationMenuItemView.this.checkable);
            }
        };
        this.accessibilityDelegate = o00ooooo2;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.textView = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        o0O0o00O.o0O0oOo(checkedTextView, o00ooooo2);
    }

    private void adjustAppearance() {
        LinearLayoutCompat.o00oOOoO o00ooooo2;
        int i;
        if (shouldExpandActionArea()) {
            this.textView.setVisibility(8);
            FrameLayout frameLayout = this.actionArea;
            if (frameLayout == null) {
                return;
            }
            o00ooooo2 = (LinearLayoutCompat.o00oOOoO) frameLayout.getLayoutParams();
            i = -1;
        } else {
            this.textView.setVisibility(0);
            FrameLayout frameLayout2 = this.actionArea;
            if (frameLayout2 == null) {
                return;
            }
            o00ooooo2 = (LinearLayoutCompat.o00oOOoO) frameLayout2.getLayoutParams();
            i = -2;
        }
        ((LinearLayout.LayoutParams) o00ooooo2).width = i;
        this.actionArea.setLayoutParams(o00ooooo2);
    }

    @o0OO00OO
    private StateListDrawable createDefaultBackground() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorControlHighlight, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(CHECKED_STATE_SET, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    private void setActionView(@o0OO00OO View view) {
        if (view != null) {
            if (this.actionArea == null) {
                this.actionArea = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.actionArea.removeAllViews();
            this.actionArea.addView(view);
        }
    }

    private boolean shouldExpandActionArea() {
        o00oo0OO o00oo0oo = this.itemData;
        return o00oo0oo.f691o00oo0O0 == null && o00oo0oo.getIcon() == null && this.itemData.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public o00oo0OO getItemData() {
        return this.itemData;
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void initialize(@oo0oO0 o00oo0OO o00oo0oo, int i) {
        this.itemData = o00oo0oo;
        int i2 = o00oo0oo.f686o00oOooo;
        if (i2 > 0) {
            setId(i2);
        }
        setVisibility(o00oo0oo.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            o0O0o00O.o0O0ooo0(this, createDefaultBackground());
        }
        setCheckable(o00oo0oo.isCheckable());
        setChecked(o00oo0oo.isChecked());
        setEnabled(o00oo0oo.isEnabled());
        setTitle(o00oo0oo.f691o00oo0O0);
        setIcon(o00oo0oo.getIcon());
        setActionView(o00oo0oo.getActionView());
        setContentDescription(o00oo0oo.f703o00ooOO0);
        o0OOOO.o00oOOo0.o00oOOo0(this, o00oo0oo.f702o00ooOO);
        adjustAppearance();
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        o00oo0OO o00oo0oo = this.itemData;
        if (o00oo0oo != null && o00oo0oo.isCheckable() && this.itemData.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void recycle() {
        FrameLayout frameLayout = this.actionArea;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.textView.setCompoundDrawables(null, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.checkable != z) {
            this.checkable = z;
            this.accessibilityDelegate.sendAccessibilityEvent(this.textView, 2048);
        }
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void setChecked(boolean z) {
        refreshDrawableState();
        this.textView.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void setIcon(@o0OO00OO Drawable drawable) {
        if (drawable != null) {
            if (this.hasIconTintList) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                o0O0O0Oo.o00oOOoO.o00oOoO(drawable, this.iconTintList);
            }
            int i = this.iconSize;
            drawable.setBounds(0, 0, i, i);
        } else if (this.needsEmptyIcon) {
            if (this.emptyDrawable == null) {
                Drawable o00oOoO02 = o0O0OO.o00oOoO0(getResources(), R.drawable.navigation_empty_icon, getContext().getTheme());
                this.emptyDrawable = o00oOoO02;
                if (o00oOoO02 != null) {
                    int i2 = this.iconSize;
                    o00oOoO02.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.emptyDrawable;
        }
        o0OoOoOo.o00oOOoO.o00oOo0O(this.textView, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.textView.setCompoundDrawablePadding(i);
    }

    public void setIconSize(@o0O0O0O int i) {
        this.iconSize = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        this.hasIconTintList = colorStateList != null;
        o00oo0OO o00oo0oo = this.itemData;
        if (o00oo0oo != null) {
            setIcon(o00oo0oo.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.textView.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.needsEmptyIcon = z;
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearance(int i) {
        this.textView.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.textView.setTextColor(colorStateList);
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void setTitle(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public boolean showsIcon() {
        return true;
    }
}
