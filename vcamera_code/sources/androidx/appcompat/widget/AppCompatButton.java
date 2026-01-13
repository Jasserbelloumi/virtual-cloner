package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.appcompat.R;
import o00oOooO.o0OO0oO;
/* loaded from: classes.dex */
public class AppCompatButton extends Button implements o0O000oo.oo0OOoo, androidx.core.widget.o00oOOoO, androidx.core.widget.o0OoO00O, o0O0o000 {
    @o00oOooO.oo0oO0
    private o0O0000O mAppCompatEmojiTextHelper;
    private final o00oo0 mBackgroundTintHelper;
    private final o0oO0O0o mTextHelper;

    public AppCompatButton(@o00oOooO.oo0oO0 Context context) {
        this(context, null);
    }

    public AppCompatButton(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public AppCompatButton(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet, int i) {
        super(o0OO0oO.o00oOOoO(context), attributeSet, i);
        o0OO0o.o00oOOo0(this, getContext());
        o00oo0 o00oo0Var = new o00oo0(this);
        this.mBackgroundTintHelper = o00oo0Var;
        o00oo0Var.o00oOo0O(attributeSet, i);
        o0oO0O0o o0oo0o0o = new o0oO0O0o(this);
        this.mTextHelper = o0oo0o0o;
        o0oo0o0o.o00oo00O(attributeSet, i);
        o0oo0o0o.o00oOOoO();
        getEmojiTextViewHelper().o00oOo00(attributeSet, i);
    }

    @o00oOooO.oo0oO0
    private o0O0000O getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new o0O0000O(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        o00oo0 o00oo0Var = this.mBackgroundTintHelper;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOOoO();
        }
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oOOoO();
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.o00oOOoO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (o.f1019o00oOo00) {
            return super.getAutoSizeMaxTextSize();
        }
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            return o0oo0o0o.o00oOo0O();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.o00oOOoO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (o.f1019o00oOo00) {
            return super.getAutoSizeMinTextSize();
        }
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            return o0oo0o0o.o00oOo0o();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.o00oOOoO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (o.f1019o00oOo00) {
            return super.getAutoSizeStepGranularity();
        }
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            return o0oo0o0o.o00oOoO0();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.o00oOOoO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (o.f1019o00oOo00) {
            return super.getAutoSizeTextAvailableSizes();
        }
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        return o0oo0o0o != null ? o0oo0o0o.o00oOoO() : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.o00oOOoO
    @SuppressLint({"WrongConstant"})
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (o.f1019o00oOo00) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            return o0oo0o0o.o00oOoOO();
        }
        return 0;
    }

    @Override // android.widget.TextView
    @o00oOooO.o0OO00OO
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.o0OoOoOo.o00ooOo(super.getCustomSelectionActionModeCallback());
    }

    @Override // o0O000oo.oo0OOoo
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        o00oo0 o00oo0Var = this.mBackgroundTintHelper;
        if (o00oo0Var != null) {
            return o00oo0Var.o00oOo00();
        }
        return null;
    }

    @Override // o0O000oo.oo0OOoo
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o00oo0 o00oo0Var = this.mBackgroundTintHelper;
        if (o00oo0Var != null) {
            return o00oo0Var.o00oOooO();
        }
        return null;
    }

    @Override // androidx.core.widget.o0OoO00O
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.o00oOoOo();
    }

    @Override // androidx.core.widget.o0OoO00O
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.o00oOoo0();
    }

    @Override // androidx.appcompat.widget.o0O0o000
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().o00oOOoO();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oo0OO(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if ((o0oo0o0o == null || o.f1019o00oOo00 || !o0oo0o0o.o00oOooo()) ? false : true) {
            this.mTextHelper.o00oOo00();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().o00oOooO(z);
    }

    @Override // android.widget.TextView, androidx.core.widget.o00oOOoO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (o.f1019o00oOo00) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oo0o(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.o00oOOoO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@o00oOooO.oo0oO0 int[] iArr, int i) throws IllegalArgumentException {
        if (o.f1019o00oOo00) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oo0oO(iArr, i);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.o00oOOoO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (o.f1019o00oOo00) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            o0oo0o0o.o0O0o(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@o00oOooO.o0OO00OO Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o00oo0 o00oo0Var = this.mBackgroundTintHelper;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOo0o(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@o00oOooO.o0O0O0o0 int i) {
        super.setBackgroundResource(i);
        o00oo0 o00oo0Var = this.mBackgroundTintHelper;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOoO0(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@o00oOooO.o0OO00OO ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // androidx.appcompat.widget.o0O0o000
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().o00oOo0O(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@o00oOooO.oo0oO0 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().o00oOOo0(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oo0o0(z);
        }
    }

    @Override // o0O000oo.oo0OOoo
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@o00oOooO.o0OO00OO ColorStateList colorStateList) {
        o00oo0 o00oo0Var = this.mBackgroundTintHelper;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOoOO(colorStateList);
        }
    }

    @Override // o0O000oo.oo0OOoo
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@o00oOooO.o0OO00OO PorterDuff.Mode mode) {
        o00oo0 o00oo0Var = this.mBackgroundTintHelper;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOoOo(mode);
        }
    }

    @Override // androidx.core.widget.o0OoO00O
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@o00oOooO.o0OO00OO ColorStateList colorStateList) {
        this.mTextHelper.o00oo(colorStateList);
        this.mTextHelper.o00oOOoO();
    }

    @Override // androidx.core.widget.o0OoO00O
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@o00oOooO.o0OO00OO PorterDuff.Mode mode) {
        this.mTextHelper.o00ooO00(mode);
        this.mTextHelper.o00oOOoO();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oo0O(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (o.f1019o00oOo00) {
            super.setTextSize(i, f);
            return;
        }
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00ooO0o(i, f);
        }
    }
}
