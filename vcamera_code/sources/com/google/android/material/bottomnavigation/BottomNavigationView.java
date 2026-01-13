package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.o00oOoO;
import androidx.appcompat.widget.o0OOO0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import o00oOoOo.o00ooO0;
import o00oOooO.o0O00oO0;
import o00oOooO.o0O0O0O;
import o00oOooO.o0O0O0o0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOO0OO;
import o00oOooO.o0o0000;
import o00oOooO.oo0OOoo;
import o00oOooO.oo0oO0;
import o00ooo0.o0;
import o00oooo0.o0O0O0Oo;
import o0O000oo.o0O0o00O;
import o0O000oo.o0OOo000;
/* loaded from: classes2.dex */
public class BottomNavigationView extends FrameLayout {
    private static final int DEF_STYLE_RES = R.style.Widget_Design_BottomNavigationView;
    private static final int MENU_PRESENTER_ID = 1;
    @o0OO00OO
    private ColorStateList itemRippleColor;
    @oo0oO0
    private final o00oOoO menu;
    private MenuInflater menuInflater;
    @oo0oO0
    @o0o0000
    public final BottomNavigationMenuView menuView;
    private final BottomNavigationPresenter presenter;
    private OnNavigationItemReselectedListener reselectedListener;
    private OnNavigationItemSelectedListener selectedListener;

    /* loaded from: classes2.dex */
    public interface OnNavigationItemReselectedListener {
        void onNavigationItemReselected(@oo0oO0 MenuItem menuItem);
    }

    /* loaded from: classes2.dex */
    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@oo0oO0 MenuItem menuItem);
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomnavigation.BottomNavigationView.SavedState.1
            @Override // android.os.Parcelable.Creator
            @o0OO00OO
            public SavedState createFromParcel(@oo0oO0 Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @oo0oO0
            public SavedState createFromParcel(@oo0oO0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @oo0oO0
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        @o0OO00OO
        public Bundle menuPresenterState;

        public SavedState(@oo0oO0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readFromParcel(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void readFromParcel(@oo0oO0 Parcel parcel, ClassLoader classLoader) {
            this.menuPresenterState = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuPresenterState);
        }
    }

    public BottomNavigationView(@oo0oO0 Context context) {
        this(context, null);
    }

    public BottomNavigationView(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, DEF_STYLE_RES), attributeSet, i);
        BottomNavigationPresenter bottomNavigationPresenter = new BottomNavigationPresenter();
        this.presenter = bottomNavigationPresenter;
        Context context2 = getContext();
        o00oOoO bottomNavigationMenu = new BottomNavigationMenu(context2);
        this.menu = bottomNavigationMenu;
        BottomNavigationMenuView bottomNavigationMenuView = new BottomNavigationMenuView(context2);
        this.menuView = bottomNavigationMenuView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        bottomNavigationMenuView.setLayoutParams(layoutParams);
        bottomNavigationPresenter.setBottomNavigationMenuView(bottomNavigationMenuView);
        bottomNavigationPresenter.setId(1);
        bottomNavigationMenuView.setPresenter(bottomNavigationPresenter);
        bottomNavigationMenu.addMenuPresenter(bottomNavigationPresenter);
        bottomNavigationPresenter.initForMenu(getContext(), bottomNavigationMenu);
        int[] iArr = R.styleable.BottomNavigationView;
        int i2 = R.style.Widget_Design_BottomNavigationView;
        int i3 = R.styleable.BottomNavigationView_itemTextAppearanceInactive;
        int i4 = R.styleable.BottomNavigationView_itemTextAppearanceActive;
        o0OOO0 obtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, iArr, i, i2, i3, i4);
        int i5 = R.styleable.BottomNavigationView_itemIconTint;
        bottomNavigationMenuView.setIconTintList(obtainTintedStyledAttributes.o00ooOO0(i5) ? obtainTintedStyledAttributes.o00oOooO(i5) : bottomNavigationMenuView.createDefaultColorStateList(16842808));
        setItemIconSize(obtainTintedStyledAttributes.o00oOoO0(R.styleable.BottomNavigationView_itemIconSize, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_icon_size)));
        if (obtainTintedStyledAttributes.o00ooOO0(i3)) {
            setItemTextAppearanceInactive(obtainTintedStyledAttributes.o00oo0oO(i3, 0));
        }
        if (obtainTintedStyledAttributes.o00ooOO0(i4)) {
            setItemTextAppearanceActive(obtainTintedStyledAttributes.o00oo0oO(i4, 0));
        }
        int i6 = R.styleable.BottomNavigationView_itemTextColor;
        if (obtainTintedStyledAttributes.o00ooOO0(i6)) {
            setItemTextColor(obtainTintedStyledAttributes.o00oOooO(i6));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            o0O0o00O.o0O0ooo0(this, createMaterialShapeDrawableBackground(context2));
        }
        int i7 = R.styleable.BottomNavigationView_elevation;
        if (obtainTintedStyledAttributes.o00ooOO0(i7)) {
            setElevation(obtainTintedStyledAttributes.o00oOoO0(i7, 0));
        }
        o0O0O0Oo.o00oOOoO.o00oOoO(getBackground().mutate(), MaterialResources.getColorStateList(context2, obtainTintedStyledAttributes, R.styleable.BottomNavigationView_backgroundTint));
        setLabelVisibilityMode(obtainTintedStyledAttributes.o00oo0O0(R.styleable.BottomNavigationView_labelVisibilityMode, -1));
        setItemHorizontalTranslationEnabled(obtainTintedStyledAttributes.o00oOOo0(R.styleable.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int o00oo0oO2 = obtainTintedStyledAttributes.o00oo0oO(R.styleable.BottomNavigationView_itemBackground, 0);
        if (o00oo0oO2 != 0) {
            bottomNavigationMenuView.setItemBackgroundRes(o00oo0oO2);
        } else {
            setItemRippleColor(MaterialResources.getColorStateList(context2, obtainTintedStyledAttributes, R.styleable.BottomNavigationView_itemRippleColor));
        }
        int i8 = R.styleable.BottomNavigationView_menu;
        if (obtainTintedStyledAttributes.o00ooOO0(i8)) {
            inflateMenu(obtainTintedStyledAttributes.o00oo0oO(i8, 0));
        }
        obtainTintedStyledAttributes.o00ooOoo();
        addView(bottomNavigationMenuView, layoutParams);
        if (shouldDrawCompatibilityTopDivider()) {
            addCompatibilityTopDivider(context2);
        }
        bottomNavigationMenu.setCallback(new o00oOoO.o00oOOo0() { // from class: com.google.android.material.bottomnavigation.BottomNavigationView.1
            @Override // androidx.appcompat.view.menu.o00oOoO.o00oOOo0
            public boolean onMenuItemSelected(o00oOoO o00oooo2, @oo0oO0 MenuItem menuItem) {
                if (BottomNavigationView.this.reselectedListener == null || menuItem.getItemId() != BottomNavigationView.this.getSelectedItemId()) {
                    return (BottomNavigationView.this.selectedListener == null || BottomNavigationView.this.selectedListener.onNavigationItemSelected(menuItem)) ? false : true;
                }
                BottomNavigationView.this.reselectedListener.onNavigationItemReselected(menuItem);
                return true;
            }

            @Override // androidx.appcompat.view.menu.o00oOoO.o00oOOo0
            public void onMenuModeChange(o00oOoO o00oooo2) {
            }
        });
        applyWindowInsets();
    }

    private void addCompatibilityTopDivider(Context context) {
        View view = new View(context);
        view.setBackgroundColor(o0.getColor(context, R.color.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    private void applyWindowInsets() {
        ViewUtils.doOnApplyWindowInsets(this, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomnavigation.BottomNavigationView.2
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            @oo0oO0
            public o0OOo000 onApplyWindowInsets(View view, @oo0oO0 o0OOo000 o0ooo000, @oo0oO0 ViewUtils.RelativePadding relativePadding) {
                relativePadding.bottom = o0ooo000.o00oo0OO() + relativePadding.bottom;
                boolean z = o0O0o00O.o0O000O(view) == 1;
                int o00oo0O02 = o0ooo000.o00oo0O0();
                int o00oo0O2 = o0ooo000.o00oo0O();
                relativePadding.start += z ? o00oo0O2 : o00oo0O02;
                int i = relativePadding.end;
                if (!z) {
                    o00oo0O02 = o00oo0O2;
                }
                relativePadding.end = i + o00oo0O02;
                relativePadding.applyToView(view);
                return o0ooo000;
            }
        });
    }

    @oo0oO0
    private MaterialShapeDrawable createMaterialShapeDrawableBackground(Context context) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        materialShapeDrawable.initializeElevationOverlay(context);
        return materialShapeDrawable;
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new o00ooO0(getContext());
        }
        return this.menuInflater;
    }

    private boolean shouldDrawCompatibilityTopDivider() {
        return false;
    }

    @o0OO00OO
    public BadgeDrawable getBadge(int i) {
        return this.menuView.getBadge(i);
    }

    @o0OO00OO
    public Drawable getItemBackground() {
        return this.menuView.getItemBackground();
    }

    @o0O0O0o0
    @Deprecated
    public int getItemBackgroundResource() {
        return this.menuView.getItemBackgroundRes();
    }

    @o0O0O0O
    public int getItemIconSize() {
        return this.menuView.getItemIconSize();
    }

    @o0OO00OO
    public ColorStateList getItemIconTintList() {
        return this.menuView.getIconTintList();
    }

    @o0OO00OO
    public ColorStateList getItemRippleColor() {
        return this.itemRippleColor;
    }

    @o0OOO0OO
    public int getItemTextAppearanceActive() {
        return this.menuView.getItemTextAppearanceActive();
    }

    @o0OOO0OO
    public int getItemTextAppearanceInactive() {
        return this.menuView.getItemTextAppearanceInactive();
    }

    @o0OO00OO
    public ColorStateList getItemTextColor() {
        return this.menuView.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.menuView.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    @oo0oO0
    public Menu getMenu() {
        return this.menu;
    }

    public BadgeDrawable getOrCreateBadge(int i) {
        return this.menuView.getOrCreateBadge(i);
    }

    @oo0OOoo
    public int getSelectedItemId() {
        return this.menuView.getSelectedItemId();
    }

    public void inflateMenu(int i) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(true);
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.menuView.isItemHorizontalTranslationEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuPresenterState);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuPresenterState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    public void removeBadge(int i) {
        this.menuView.removeBadge(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setItemBackground(@o0OO00OO Drawable drawable) {
        this.menuView.setItemBackground(drawable);
        this.itemRippleColor = null;
    }

    public void setItemBackgroundResource(@o0O0O0o0 int i) {
        this.menuView.setItemBackgroundRes(i);
        this.itemRippleColor = null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.menuView.isItemHorizontalTranslationEnabled() != z) {
            this.menuView.setItemHorizontalTranslationEnabled(z);
            this.presenter.updateMenuView(false);
        }
    }

    public void setItemIconSize(@o0O0O0O int i) {
        this.menuView.setItemIconSize(i);
    }

    public void setItemIconSizeRes(@o0O00oO0 int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(@o0OO00OO ColorStateList colorStateList) {
        this.menuView.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int i, @o0OO00OO View.OnTouchListener onTouchListener) {
        this.menuView.setItemOnTouchListener(i, onTouchListener);
    }

    public void setItemRippleColor(@o0OO00OO ColorStateList colorStateList) {
        if (this.itemRippleColor == colorStateList) {
            if (colorStateList != null || this.menuView.getItemBackground() == null) {
                return;
            }
            this.menuView.setItemBackground(null);
            return;
        }
        this.itemRippleColor = colorStateList;
        if (colorStateList == null) {
            this.menuView.setItemBackground(null);
            return;
        }
        this.menuView.setItemBackground(new RippleDrawable(RippleUtils.convertToRippleDrawableColor(colorStateList), null, null));
    }

    public void setItemTextAppearanceActive(@o0OOO0OO int i) {
        this.menuView.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(@o0OOO0OO int i) {
        this.menuView.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(@o0OO00OO ColorStateList colorStateList) {
        this.menuView.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.menuView.getLabelVisibilityMode() != i) {
            this.menuView.setLabelVisibilityMode(i);
            this.presenter.updateMenuView(false);
        }
    }

    public void setOnNavigationItemReselectedListener(@o0OO00OO OnNavigationItemReselectedListener onNavigationItemReselectedListener) {
        this.reselectedListener = onNavigationItemReselectedListener;
    }

    public void setOnNavigationItemSelectedListener(@o0OO00OO OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.selectedListener = onNavigationItemSelectedListener;
    }

    public void setSelectedItemId(@oo0OOoo int i) {
        MenuItem findItem = this.menu.findItem(i);
        if (findItem == null || this.menu.performItemAction(findItem, this.presenter, 0)) {
            return;
        }
        findItem.setChecked(true);
    }
}
