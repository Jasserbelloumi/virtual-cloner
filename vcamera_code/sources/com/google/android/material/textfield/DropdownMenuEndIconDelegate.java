package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.textfield.TextInputLayout;
import o00oOo0o.o00oOo00;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O00.o00oo0O;
import o0O000oo.o0O0o00O;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class DropdownMenuEndIconDelegate extends EndIconDelegate {
    private static final int ANIMATION_FADE_IN_DURATION = 67;
    private static final int ANIMATION_FADE_OUT_DURATION = 50;
    private static final boolean IS_LOLLIPOP = true;
    private final TextInputLayout.AccessibilityDelegate accessibilityDelegate;
    @o0OO00OO
    private AccessibilityManager accessibilityManager;
    private final TextInputLayout.OnEditTextAttachedListener dropdownMenuOnEditTextAttachedListener;
    private long dropdownPopupActivatedAt;
    private boolean dropdownPopupDirty;
    @SuppressLint({"ClickableViewAccessibility"})
    private final TextInputLayout.OnEndIconChangedListener endIconChangedListener;
    private final TextWatcher exposedDropdownEndIconTextWatcher;
    private ValueAnimator fadeInAnim;
    private ValueAnimator fadeOutAnim;
    private StateListDrawable filledPopupBackground;
    private boolean isEndIconChecked;
    private final View.OnFocusChangeListener onFocusChangeListener;
    private MaterialShapeDrawable outlinedPopupBackground;

    public DropdownMenuEndIconDelegate(@oo0oO0 TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.exposedDropdownEndIconTextWatcher = new TextWatcherAdapter() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.1
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                final AutoCompleteTextView castAutoCompleteTextViewOrThrow = DropdownMenuEndIconDelegate.castAutoCompleteTextViewOrThrow(DropdownMenuEndIconDelegate.this.textInputLayout.getEditText());
                if (DropdownMenuEndIconDelegate.this.accessibilityManager.isTouchExplorationEnabled() && DropdownMenuEndIconDelegate.isEditable(castAutoCompleteTextViewOrThrow) && !DropdownMenuEndIconDelegate.this.endIconView.hasFocus()) {
                    castAutoCompleteTextViewOrThrow.dismissDropDown();
                }
                castAutoCompleteTextViewOrThrow.post(new Runnable() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        boolean isPopupShowing = castAutoCompleteTextViewOrThrow.isPopupShowing();
                        DropdownMenuEndIconDelegate.this.setEndIconChecked(isPopupShowing);
                        DropdownMenuEndIconDelegate.this.dropdownPopupDirty = isPopupShowing;
                    }
                });
            }
        };
        this.onFocusChangeListener = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.2
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                DropdownMenuEndIconDelegate.this.textInputLayout.setEndIconActivated(z);
                if (z) {
                    return;
                }
                DropdownMenuEndIconDelegate.this.setEndIconChecked(false);
                DropdownMenuEndIconDelegate.this.dropdownPopupDirty = false;
            }
        };
        this.accessibilityDelegate = new TextInputLayout.AccessibilityDelegate(this.textInputLayout) { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.3
            @Override // com.google.android.material.textfield.TextInputLayout.AccessibilityDelegate, o0O000oo.o00oOOoO
            public void onInitializeAccessibilityNodeInfo(View view, @oo0oO0 o00oo0O o00oo0o2) {
                super.onInitializeAccessibilityNodeInfo(view, o00oo0o2);
                if (!DropdownMenuEndIconDelegate.isEditable(DropdownMenuEndIconDelegate.this.textInputLayout.getEditText())) {
                    o00oo0o2.o0O0Ooo0(Spinner.class.getName());
                }
                if (o00oo0o2.o0O0O0o0()) {
                    o00oo0o2.o0O0o0oo(null);
                }
            }

            @Override // o0O000oo.o00oOOoO
            public void onPopulateAccessibilityEvent(View view, @oo0oO0 AccessibilityEvent accessibilityEvent) {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                AutoCompleteTextView castAutoCompleteTextViewOrThrow = DropdownMenuEndIconDelegate.castAutoCompleteTextViewOrThrow(DropdownMenuEndIconDelegate.this.textInputLayout.getEditText());
                if (accessibilityEvent.getEventType() == 1 && DropdownMenuEndIconDelegate.this.accessibilityManager.isTouchExplorationEnabled() && !DropdownMenuEndIconDelegate.isEditable(DropdownMenuEndIconDelegate.this.textInputLayout.getEditText())) {
                    DropdownMenuEndIconDelegate.this.showHideDropdown(castAutoCompleteTextViewOrThrow);
                }
            }
        };
        this.dropdownMenuOnEditTextAttachedListener = new TextInputLayout.OnEditTextAttachedListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.4
            @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
            public void onEditTextAttached(@oo0oO0 TextInputLayout textInputLayout2) {
                AutoCompleteTextView castAutoCompleteTextViewOrThrow = DropdownMenuEndIconDelegate.castAutoCompleteTextViewOrThrow(textInputLayout2.getEditText());
                DropdownMenuEndIconDelegate.this.setPopupBackground(castAutoCompleteTextViewOrThrow);
                DropdownMenuEndIconDelegate.this.addRippleEffect(castAutoCompleteTextViewOrThrow);
                DropdownMenuEndIconDelegate.this.setUpDropdownShowHideBehavior(castAutoCompleteTextViewOrThrow);
                castAutoCompleteTextViewOrThrow.setThreshold(0);
                castAutoCompleteTextViewOrThrow.removeTextChangedListener(DropdownMenuEndIconDelegate.this.exposedDropdownEndIconTextWatcher);
                castAutoCompleteTextViewOrThrow.addTextChangedListener(DropdownMenuEndIconDelegate.this.exposedDropdownEndIconTextWatcher);
                textInputLayout2.setEndIconCheckable(true);
                textInputLayout2.setErrorIconDrawable((Drawable) null);
                if (!DropdownMenuEndIconDelegate.isEditable(castAutoCompleteTextViewOrThrow)) {
                    o0O0o00O.o0OO00OO(DropdownMenuEndIconDelegate.this.endIconView, 2);
                }
                textInputLayout2.setTextInputAccessibilityDelegate(DropdownMenuEndIconDelegate.this.accessibilityDelegate);
                textInputLayout2.setEndIconVisible(true);
            }
        };
        this.endIconChangedListener = new TextInputLayout.OnEndIconChangedListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.5
            @Override // com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener
            public void onEndIconChanged(@oo0oO0 TextInputLayout textInputLayout2, int i) {
                final AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout2.getEditText();
                if (autoCompleteTextView == null || i != 3) {
                    return;
                }
                autoCompleteTextView.post(new Runnable() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        autoCompleteTextView.removeTextChangedListener(DropdownMenuEndIconDelegate.this.exposedDropdownEndIconTextWatcher);
                    }
                });
                if (autoCompleteTextView.getOnFocusChangeListener() == DropdownMenuEndIconDelegate.this.onFocusChangeListener) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                if (DropdownMenuEndIconDelegate.IS_LOLLIPOP) {
                    autoCompleteTextView.setOnDismissListener(null);
                }
            }
        };
        this.dropdownPopupDirty = false;
        this.isEndIconChecked = false;
        this.dropdownPopupActivatedAt = Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRippleEffect(@oo0oO0 AutoCompleteTextView autoCompleteTextView) {
        if (isEditable(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.textInputLayout.getBoxBackgroundMode();
        MaterialShapeDrawable boxBackground = this.textInputLayout.getBoxBackground();
        int color = MaterialColors.getColor(autoCompleteTextView, R.attr.colorControlHighlight);
        int[][] iArr = {new int[]{16842919}, new int[0]};
        if (boxBackgroundMode == 2) {
            addRippleEffectOnOutlinedLayout(autoCompleteTextView, color, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            addRippleEffectOnFilledLayout(autoCompleteTextView, color, iArr, boxBackground);
        }
    }

    private void addRippleEffectOnFilledLayout(@oo0oO0 AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, @oo0oO0 MaterialShapeDrawable materialShapeDrawable) {
        int boxBackgroundColor = this.textInputLayout.getBoxBackgroundColor();
        int[] iArr2 = {MaterialColors.layer(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (IS_LOLLIPOP) {
            o0O0o00O.o0O0ooo0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), materialShapeDrawable, materialShapeDrawable));
            return;
        }
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        materialShapeDrawable2.setFillColor(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{materialShapeDrawable, materialShapeDrawable2});
        int o0O00O0o2 = o0O0o00O.o0O00O0o(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int o00oOo0O2 = o0O0o00O.o00oo0O0.o00oOo0O(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        o0O0o00O.o00oo0OO.o00oo0O(autoCompleteTextView, layerDrawable);
        o0O0o00O.o00oo0O0.o00oOoo0(autoCompleteTextView, o0O00O0o2, paddingTop, o00oOo0O2, paddingBottom);
    }

    private void addRippleEffectOnOutlinedLayout(@oo0oO0 AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, @oo0oO0 MaterialShapeDrawable materialShapeDrawable) {
        LayerDrawable layerDrawable;
        int color = MaterialColors.getColor(autoCompleteTextView, R.attr.colorSurface);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        int layer = MaterialColors.layer(i, color, 0.1f);
        materialShapeDrawable2.setFillColor(new ColorStateList(iArr, new int[]{layer, 0}));
        if (IS_LOLLIPOP) {
            materialShapeDrawable2.setTint(color);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{layer, color});
            MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
            materialShapeDrawable3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable2, materialShapeDrawable3), materialShapeDrawable});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable});
        }
        o0O0o00O.o0O0ooo0(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @oo0oO0
    public static AutoCompleteTextView castAutoCompleteTextViewOrThrow(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator getAlphaAnimator(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@oo0oO0 ValueAnimator valueAnimator) {
                DropdownMenuEndIconDelegate.this.endIconView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return ofFloat;
    }

    private MaterialShapeDrawable getPopUpMaterialShapeDrawable(float f, float f2, float f3, int i) {
        ShapeAppearanceModel build = ShapeAppearanceModel.builder().setTopLeftCornerSize(f).setTopRightCornerSize(f).setBottomLeftCornerSize(f2).setBottomRightCornerSize(f2).build();
        MaterialShapeDrawable createWithElevationOverlay = MaterialShapeDrawable.createWithElevationOverlay(this.context, f3);
        createWithElevationOverlay.setShapeAppearanceModel(build);
        createWithElevationOverlay.setPadding(0, i, 0, i);
        return createWithElevationOverlay;
    }

    private void initAnimators() {
        this.fadeInAnim = getAlphaAnimator(67, 0.0f, 1.0f);
        ValueAnimator alphaAnimator = getAlphaAnimator(50, 1.0f, 0.0f);
        this.fadeOutAnim = alphaAnimator;
        alphaAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = DropdownMenuEndIconDelegate.this;
                dropdownMenuEndIconDelegate.endIconView.setChecked(dropdownMenuEndIconDelegate.isEndIconChecked);
                DropdownMenuEndIconDelegate.this.fadeInAnim.start();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDropdownPopupActive() {
        long currentTimeMillis = System.currentTimeMillis() - this.dropdownPopupActivatedAt;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isEditable(@oo0oO0 EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndIconChecked(boolean z) {
        if (this.isEndIconChecked != z) {
            this.isEndIconChecked = z;
            this.fadeInAnim.cancel();
            this.fadeOutAnim.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopupBackground(@oo0oO0 AutoCompleteTextView autoCompleteTextView) {
        Drawable drawable;
        if (IS_LOLLIPOP) {
            int boxBackgroundMode = this.textInputLayout.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = this.outlinedPopupBackground;
            } else if (boxBackgroundMode != 1) {
                return;
            } else {
                drawable = this.filledPopupBackground;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void setUpDropdownShowHideBehavior(@oo0oO0 final AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.7
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(@oo0oO0 View view, @oo0oO0 MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    if (DropdownMenuEndIconDelegate.this.isDropdownPopupActive()) {
                        DropdownMenuEndIconDelegate.this.dropdownPopupDirty = false;
                    }
                    DropdownMenuEndIconDelegate.this.showHideDropdown(autoCompleteTextView);
                }
                return false;
            }
        });
        autoCompleteTextView.setOnFocusChangeListener(this.onFocusChangeListener);
        if (IS_LOLLIPOP) {
            autoCompleteTextView.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.8
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public void onDismiss() {
                    DropdownMenuEndIconDelegate.this.dropdownPopupDirty = true;
                    DropdownMenuEndIconDelegate.this.dropdownPopupActivatedAt = System.currentTimeMillis();
                    DropdownMenuEndIconDelegate.this.setEndIconChecked(false);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showHideDropdown(@o0OO00OO AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (isDropdownPopupActive()) {
            this.dropdownPopupDirty = false;
        }
        if (this.dropdownPopupDirty) {
            this.dropdownPopupDirty = false;
            return;
        }
        if (IS_LOLLIPOP) {
            setEndIconChecked(!this.isEndIconChecked);
        } else {
            this.isEndIconChecked = !this.isEndIconChecked;
            this.endIconView.toggle();
        }
        if (!this.isEndIconChecked) {
            autoCompleteTextView.dismissDropDown();
            return;
        }
        autoCompleteTextView.requestFocus();
        autoCompleteTextView.showDropDown();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void initialize() {
        float dimensionPixelOffset = this.context.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        MaterialShapeDrawable popUpMaterialShapeDrawable = getPopUpMaterialShapeDrawable(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        MaterialShapeDrawable popUpMaterialShapeDrawable2 = getPopUpMaterialShapeDrawable(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.outlinedPopupBackground = popUpMaterialShapeDrawable;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.filledPopupBackground = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, popUpMaterialShapeDrawable);
        this.filledPopupBackground.addState(new int[0], popUpMaterialShapeDrawable2);
        this.textInputLayout.setEndIconDrawable(o00oOo00.o00oOOoO(this.context, IS_LOLLIPOP ? R.drawable.mtrl_dropdown_arrow : R.drawable.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.textInputLayout;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.textInputLayout.setEndIconOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DropdownMenuEndIconDelegate.this.showHideDropdown((AutoCompleteTextView) DropdownMenuEndIconDelegate.this.textInputLayout.getEditText());
            }
        });
        this.textInputLayout.addOnEditTextAttachedListener(this.dropdownMenuOnEditTextAttachedListener);
        this.textInputLayout.addOnEndIconChangedListener(this.endIconChangedListener);
        initAnimators();
        this.accessibilityManager = (AccessibilityManager) this.context.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public boolean isBoxBackgroundModeSupported(int i) {
        return i != 0;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public boolean shouldTintIconOnError() {
        return true;
    }
}
