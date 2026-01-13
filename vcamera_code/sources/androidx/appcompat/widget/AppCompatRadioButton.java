package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.appcompat.R;
import o00oOooO.o0OO0oO;
/* loaded from: classes.dex */
public class AppCompatRadioButton extends RadioButton implements androidx.core.widget.o0O00O0, o0O000oo.oo0OOoo, o0O0o000, androidx.core.widget.o0OoO00O {
    private o0O0000O mAppCompatEmojiTextHelper;
    private final o00oo0 mBackgroundTintHelper;
    private final o00ooO0 mCompoundButtonHelper;
    private final o0oO0O0o mTextHelper;

    public AppCompatRadioButton(Context context) {
        this(context, null);
    }

    public AppCompatRadioButton(Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.radioButtonStyle);
    }

    public AppCompatRadioButton(Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet, int i) {
        super(o0OO0oO.o00oOOoO(context), attributeSet, i);
        o0OO0o.o00oOOo0(this, getContext());
        o00ooO0 o00ooo02 = new o00ooO0(this);
        this.mCompoundButtonHelper = o00ooo02;
        o00ooo02.o00oOo0O(attributeSet, i);
        o00oo0 o00oo0Var = new o00oo0(this);
        this.mBackgroundTintHelper = o00oo0Var;
        o00oo0Var.o00oOo0O(attributeSet, i);
        o0oO0O0o o0oo0o0o = new o0oO0O0o(this);
        this.mTextHelper = o0oo0o0o;
        o0oo0o0o.o00oo00O(attributeSet, i);
        getEmojiTextViewHelper().o00oOo00(attributeSet, i);
    }

    @o00oOooO.oo0oO0
    private o0O0000O getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new o0O0000O(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
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

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        o00ooO0 o00ooo02 = this.mCompoundButtonHelper;
        return o00ooo02 != null ? o00ooo02.o00oOOoO(compoundPaddingLeft) : compoundPaddingLeft;
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

    @Override // androidx.core.widget.o0O00O0
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportButtonTintList() {
        o00ooO0 o00ooo02 = this.mCompoundButtonHelper;
        if (o00ooo02 != null) {
            return o00ooo02.o00oOo00();
        }
        return null;
    }

    @Override // androidx.core.widget.o0O00O0
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportButtonTintMode() {
        o00ooO0 o00ooo02 = this.mCompoundButtonHelper;
        if (o00ooo02 != null) {
            return o00ooo02.o00oOooO();
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

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().o00oOooO(z);
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(@o00oOooO.o0O0O0o0 int i) {
        setButtonDrawable(o00oOo0o.o00oOo00.o00oOOoO(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        o00ooO0 o00ooo02 = this.mCompoundButtonHelper;
        if (o00ooo02 != null) {
            o00ooo02.o00oOo0o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@o00oOooO.o0OO00OO Drawable drawable, @o00oOooO.o0OO00OO Drawable drawable2, @o00oOooO.o0OO00OO Drawable drawable3, @o00oOooO.o0OO00OO Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oo0O0();
        }
    }

    @Override // android.widget.TextView
    @o00oOooO.o0OOooO0(17)
    public void setCompoundDrawablesRelative(@o00oOooO.o0OO00OO Drawable drawable, @o00oOooO.o0OO00OO Drawable drawable2, @o00oOooO.o0OO00OO Drawable drawable3, @o00oOooO.o0OO00OO Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oo0O0();
        }
    }

    @Override // androidx.appcompat.widget.o0O0o000
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().o00oOo0O(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@o00oOooO.oo0oO0 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().o00oOOo0(inputFilterArr));
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

    @Override // androidx.core.widget.o0O00O0
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintList(@o00oOooO.o0OO00OO ColorStateList colorStateList) {
        o00ooO0 o00ooo02 = this.mCompoundButtonHelper;
        if (o00ooo02 != null) {
            o00ooo02.o00oOoO0(colorStateList);
        }
    }

    @Override // androidx.core.widget.o0O00O0
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintMode(@o00oOooO.o0OO00OO PorterDuff.Mode mode) {
        o00ooO0 o00ooo02 = this.mCompoundButtonHelper;
        if (o00ooo02 != null) {
            o00ooo02.o00oOoO(mode);
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
}
