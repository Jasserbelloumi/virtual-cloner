package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.o00oo0OO;
import androidx.appcompat.view.menu.o0O0o;
import androidx.appcompat.widget.o0OOOO;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOO0OO;
import o00oOooO.oo0oO0;
import o00ooo0.o0;
import o00oooo0.o0O0O0Oo;
import o0O00.o00oo0O;
import o0O000oo.o0O0OOO;
import o0O000oo.o0O0o00O;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class BottomNavigationItemView extends FrameLayout implements o0O0o.o00oOOo0 {
    private static final int[] CHECKED_STATE_SET = {16842912};
    public static final int INVALID_ITEM_POSITION = -1;
    @o0OO00OO
    private BadgeDrawable badgeDrawable;
    private final int defaultMargin;
    private ImageView icon;
    @o0OO00OO
    private ColorStateList iconTint;
    private boolean isShifting;
    @o0OO00OO
    private o00oo0OO itemData;
    private int itemPosition;
    private final ViewGroup labelGroup;
    private int labelVisibilityMode;
    private final TextView largeLabel;
    @o0OO00OO
    private Drawable originalIconDrawable;
    private float scaleDownFactor;
    private float scaleUpFactor;
    private float shiftAmount;
    private final TextView smallLabel;
    @o0OO00OO
    private Drawable wrappedIconDrawable;

    public BottomNavigationItemView(@oo0oO0 Context context) {
        this(context, null);
    }

    public BottomNavigationItemView(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BottomNavigationItemView(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.itemPosition = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(R.layout.design_bottom_navigation_item, (ViewGroup) this, true);
        setBackgroundResource(R.drawable.design_bottom_navigation_item_background);
        this.defaultMargin = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_margin);
        this.icon = (ImageView) findViewById(R.id.icon);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.labelGroup);
        this.labelGroup = viewGroup;
        TextView textView = (TextView) findViewById(R.id.smallLabel);
        this.smallLabel = textView;
        TextView textView2 = (TextView) findViewById(R.id.largeLabel);
        this.largeLabel = textView2;
        viewGroup.setTag(R.id.mtrl_view_tag_bottom_padding, Integer.valueOf(viewGroup.getPaddingBottom()));
        o0O0o00O.o0OO00OO(textView, 2);
        o0O0o00O.o00oo0OO.o00oo0o0(textView2, 2);
        setFocusable(true);
        calculateTextScaleFactors(textView.getTextSize(), textView2.getTextSize());
        ImageView imageView = this.icon;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomnavigation.BottomNavigationItemView.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    if (BottomNavigationItemView.this.icon.getVisibility() == 0) {
                        BottomNavigationItemView bottomNavigationItemView = BottomNavigationItemView.this;
                        bottomNavigationItemView.tryUpdateBadgeBounds(bottomNavigationItemView.icon);
                    }
                }
            });
        }
    }

    private void calculateTextScaleFactors(float f, float f2) {
        this.shiftAmount = f - f2;
        this.scaleUpFactor = (f2 * 1.0f) / f;
        this.scaleDownFactor = (f * 1.0f) / f2;
    }

    @o0OO00OO
    private FrameLayout getCustomParentForBadge(View view) {
        ImageView imageView = this.icon;
        if (view == imageView && BadgeUtils.USE_COMPAT_PARENT) {
            return (FrameLayout) imageView.getParent();
        }
        return null;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof BottomNavigationItemView) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private boolean hasBadge() {
        return this.badgeDrawable != null;
    }

    private static void setViewLayoutParams(@oo0oO0 View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    private static void setViewScaleValues(@oo0oO0 View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    private void tryAttachBadgeToAnchor(@o0OO00OO View view) {
        if (hasBadge() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            BadgeUtils.attachBadgeDrawable(this.badgeDrawable, view, getCustomParentForBadge(view));
        }
    }

    private void tryRemoveBadgeFromAnchor(@o0OO00OO View view) {
        if (hasBadge()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                BadgeUtils.detachBadgeDrawable(this.badgeDrawable, view);
            }
            this.badgeDrawable = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryUpdateBadgeBounds(View view) {
        if (hasBadge()) {
            BadgeUtils.setBadgeDrawableBounds(this.badgeDrawable, view, getCustomParentForBadge(view));
        }
    }

    private static void updateViewPaddingBottom(@oo0oO0 View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    @o0OO00OO
    public BadgeDrawable getBadge() {
        return this.badgeDrawable;
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public o00oo0OO getItemData() {
        return this.itemData;
    }

    public int getItemPosition() {
        return this.itemPosition;
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void initialize(@oo0oO0 o00oo0OO o00oo0oo, int i) {
        this.itemData = o00oo0oo;
        setCheckable(o00oo0oo.isCheckable());
        setChecked(o00oo0oo.isChecked());
        setEnabled(o00oo0oo.isEnabled());
        setIcon(o00oo0oo.getIcon());
        setTitle(o00oo0oo.f691o00oo0O0);
        setId(o00oo0oo.f686o00oOooo);
        if (!TextUtils.isEmpty(o00oo0oo.f703o00ooOO0)) {
            setContentDescription(o00oo0oo.f703o00ooOO0);
        }
        o0OOOO.o00oOOo0.o00oOOo0(this, !TextUtils.isEmpty(o00oo0oo.f702o00ooOO) ? o00oo0oo.f702o00ooOO : o00oo0oo.f691o00oo0O0);
        setVisibility(o00oo0oo.isVisible() ? 0 : 8);
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

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@oo0oO0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.badgeDrawable;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            o00oo0OO o00oo0oo = this.itemData;
            CharSequence charSequence = o00oo0oo.f691o00oo0O0;
            if (!TextUtils.isEmpty(o00oo0oo.f703o00ooOO0)) {
                charSequence = this.itemData.f703o00ooOO0;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.badgeDrawable.getContentDescription()));
        }
        o00oo0O o0OO0Ooo2 = o00oo0O.o0OO0Ooo(accessibilityNodeInfo);
        o0OO0Ooo2.o0O0o000(o00oo0O.o00oOo0O.o00oOoO(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            o0OO0Ooo2.o0O0Ooo(false);
            o0OO0Ooo2.o0O0OOoO(o00oo0O.o00oOOo0.f10042o00oOoOo);
        }
        o0OO0Ooo2.o0O0ooO0(getResources().getString(R.string.item_view_role_description));
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void removeBadge() {
        tryRemoveBadgeFromAnchor(this.icon);
    }

    public void setBadge(@oo0oO0 BadgeDrawable badgeDrawable) {
        this.badgeDrawable = badgeDrawable;
        ImageView imageView = this.icon;
        if (imageView != null) {
            tryAttachBadgeToAnchor(imageView);
        }
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
        if (r9 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
        setViewLayoutParams(r8.icon, (int) (r8.defaultMargin + r8.shiftAmount), 49);
        setViewScaleValues(r8.largeLabel, 1.0f, 1.0f, 0);
        r0 = r8.smallLabel;
        r1 = r8.scaleUpFactor;
        setViewScaleValues(r0, r1, r1, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0082, code lost:
        setViewLayoutParams(r8.icon, r8.defaultMargin, 49);
        r0 = r8.largeLabel;
        r1 = r8.scaleDownFactor;
        setViewScaleValues(r0, r1, r1, 4);
        setViewScaleValues(r8.smallLabel, 1.0f, 1.0f, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009a, code lost:
        if (r9 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009c, code lost:
        setViewLayoutParams(r0, r1, 49);
        r0 = r8.labelGroup;
        updateViewPaddingBottom(r0, ((java.lang.Integer) r0.getTag(com.google.android.material.R.id.mtrl_view_tag_bottom_padding)).intValue());
        r8.largeLabel.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b6, code lost:
        setViewLayoutParams(r0, r1, 17);
        updateViewPaddingBottom(r8.labelGroup, 0);
        r8.largeLabel.setVisibility(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c3, code lost:
        r8.smallLabel.setVisibility(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d1, code lost:
        if (r9 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e5, code lost:
        if (r9 != false) goto L13;
     */
    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setChecked(boolean r9) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomnavigation.BottomNavigationItemView.setChecked(boolean):void");
    }

    @Override // android.view.View, androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.smallLabel.setEnabled(z);
        this.largeLabel.setEnabled(z);
        this.icon.setEnabled(z);
        o0O0o00O.o0OO0o0o(this, z ? o0O0OOO.o00oOo00(getContext(), 1002) : null);
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void setIcon(@o0OO00OO Drawable drawable) {
        if (drawable == this.originalIconDrawable) {
            return;
        }
        this.originalIconDrawable = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.wrappedIconDrawable = drawable;
            ColorStateList colorStateList = this.iconTint;
            if (colorStateList != null) {
                o0O0O0Oo.o00oOOoO.o00oOoO(drawable, colorStateList);
            }
        }
        this.icon.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.icon.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.icon.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.iconTint = colorStateList;
        if (this.itemData == null || (drawable = this.wrappedIconDrawable) == null) {
            return;
        }
        o0O0O0Oo.o00oOOoO.o00oOoO(drawable, colorStateList);
        this.wrappedIconDrawable.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : o0.getDrawable(getContext(), i));
    }

    public void setItemBackground(@o0OO00OO Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        o0O0o00O.o0O0ooo0(this, drawable);
    }

    public void setItemPosition(int i) {
        this.itemPosition = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.labelVisibilityMode != i) {
            this.labelVisibilityMode = i;
            o00oo0OO o00oo0oo = this.itemData;
            if (o00oo0oo != null) {
                setChecked(o00oo0oo.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.isShifting != z) {
            this.isShifting = z;
            o00oo0OO o00oo0oo = this.itemData;
            if (o00oo0oo != null) {
                setChecked(o00oo0oo.isChecked());
            }
        }
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearanceActive(@o0OOO0OO int i) {
        this.largeLabel.setTextAppearance(i);
        calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    public void setTextAppearanceInactive(@o0OOO0OO int i) {
        this.smallLabel.setTextAppearance(i);
        calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    public void setTextColor(@o0OO00OO ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.smallLabel.setTextColor(colorStateList);
            this.largeLabel.setTextColor(colorStateList);
        }
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void setTitle(CharSequence charSequence) {
        this.smallLabel.setText(charSequence);
        this.largeLabel.setText(charSequence);
        o00oo0OO o00oo0oo = this.itemData;
        if (o00oo0oo == null || TextUtils.isEmpty(o00oo0oo.f703o00ooOO0)) {
            setContentDescription(charSequence);
        }
        o00oo0OO o00oo0oo2 = this.itemData;
        if (o00oo0oo2 != null && !TextUtils.isEmpty(o00oo0oo2.f702o00ooOO)) {
            charSequence = this.itemData.f702o00ooOO;
        }
        o0OOOO.o00oOOo0.o00oOOo0(this, charSequence);
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public boolean showsIcon() {
        return true;
    }
}
