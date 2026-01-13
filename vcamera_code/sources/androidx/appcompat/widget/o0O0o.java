package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.appcompat.R;
import o00oOooO.o0OO0oO;
/* loaded from: classes.dex */
public class o0O0o extends CheckedTextView implements androidx.core.widget.o0O00, o0O000oo.oo0OOoo, o0O0o000, androidx.core.widget.o0OoO00O {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o00oo0 f1221o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00oo f1222o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o0oO0O0o f1223o00oo0Oo;
    @o00oOooO.oo0oO0

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public o0O0000O f1224o00oo0o0;

    public o0O0o(@o00oOooO.oo0oO0 Context context) {
        this(context, null);
    }

    public o0O0o(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public o0O0o(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet, int i) {
        super(o0OO0oO.o00oOOoO(context), attributeSet, i);
        o0OO0o.o00oOOo0(this, getContext());
        o0oO0O0o o0oo0o0o = new o0oO0O0o(this);
        this.f1223o00oo0Oo = o0oo0o0o;
        o0oo0o0o.o00oo00O(attributeSet, i);
        o0oo0o0o.o00oOOoO();
        o00oo0 o00oo0Var = new o00oo0(this);
        this.f1221o00oo0O = o00oo0Var;
        o00oo0Var.o00oOo0O(attributeSet, i);
        o00oo o00ooVar = new o00oo(this);
        this.f1222o00oo0O0 = o00ooVar;
        o00ooVar.o00oOooO(attributeSet, i);
        getEmojiTextViewHelper().o00oOo00(attributeSet, i);
    }

    @o00oOooO.oo0oO0
    private o0O0000O getEmojiTextViewHelper() {
        if (this.f1224o00oo0o0 == null) {
            this.f1224o00oo0o0 = new o0O0000O(this);
        }
        return this.f1224o00oo0o0;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        o0oO0O0o o0oo0o0o = this.f1223o00oo0Oo;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oOOoO();
        }
        o00oo0 o00oo0Var = this.f1221o00oo0O;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOOoO();
        }
        o00oo o00ooVar = this.f1222o00oo0O0;
        if (o00ooVar != null) {
            o00ooVar.o00oOOo0();
        }
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
        o00oo0 o00oo0Var = this.f1221o00oo0O;
        if (o00oo0Var != null) {
            return o00oo0Var.o00oOo00();
        }
        return null;
    }

    @Override // o0O000oo.oo0OOoo
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o00oo0 o00oo0Var = this.f1221o00oo0O;
        if (o00oo0Var != null) {
            return o00oo0Var.o00oOooO();
        }
        return null;
    }

    @Override // androidx.core.widget.o0O00
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCheckMarkTintList() {
        o00oo o00ooVar = this.f1222o00oo0O0;
        if (o00ooVar != null) {
            return o00ooVar.o00oOOoO();
        }
        return null;
    }

    @Override // androidx.core.widget.o0O00
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        o00oo o00ooVar = this.f1222o00oo0O0;
        if (o00ooVar != null) {
            return o00ooVar.o00oOo00();
        }
        return null;
    }

    @Override // androidx.core.widget.o0OoO00O
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1223o00oo0Oo.o00oOoOo();
    }

    @Override // androidx.core.widget.o0OoO00O
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1223o00oo0Oo.o00oOoo0();
    }

    @Override // androidx.appcompat.widget.o0O0o000
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().o00oOOoO();
    }

    @Override // android.widget.TextView, android.view.View
    @o00oOooO.o0OO00OO
    public InputConnection onCreateInputConnection(@o00oOooO.oo0oO0 EditorInfo editorInfo) {
        return o0O000.o00oOOo0(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().o00oOooO(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@o00oOooO.o0OO00OO Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o00oo0 o00oo0Var = this.f1221o00oo0O;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOo0o(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@o00oOooO.o0O0O0o0 int i) {
        super.setBackgroundResource(i);
        o00oo0 o00oo0Var = this.f1221o00oo0O;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOoO0(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@o00oOooO.o0O0O0o0 int i) {
        setCheckMarkDrawable(o00oOo0o.o00oOo00.o00oOOoO(getContext(), i));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@o00oOooO.o0OO00OO Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        o00oo o00ooVar = this.f1222o00oo0O0;
        if (o00ooVar != null) {
            o00ooVar.o00oOo0O();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@o00oOooO.o0OO00OO Drawable drawable, @o00oOooO.o0OO00OO Drawable drawable2, @o00oOooO.o0OO00OO Drawable drawable3, @o00oOooO.o0OO00OO Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o0oO0O0o o0oo0o0o = this.f1223o00oo0Oo;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oo0O0();
        }
    }

    @Override // android.widget.TextView
    @o00oOooO.o0OOooO0(17)
    public void setCompoundDrawablesRelative(@o00oOooO.o0OO00OO Drawable drawable, @o00oOooO.o0OO00OO Drawable drawable2, @o00oOooO.o0OO00OO Drawable drawable3, @o00oOooO.o0OO00OO Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o0oO0O0o o0oo0o0o = this.f1223o00oo0Oo;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oo0O0();
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

    @Override // o0O000oo.oo0OOoo
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@o00oOooO.o0OO00OO ColorStateList colorStateList) {
        o00oo0 o00oo0Var = this.f1221o00oo0O;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOoOO(colorStateList);
        }
    }

    @Override // o0O000oo.oo0OOoo
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@o00oOooO.o0OO00OO PorterDuff.Mode mode) {
        o00oo0 o00oo0Var = this.f1221o00oo0O;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOoOo(mode);
        }
    }

    @Override // androidx.core.widget.o0O00
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintList(@o00oOooO.o0OO00OO ColorStateList colorStateList) {
        o00oo o00ooVar = this.f1222o00oo0O0;
        if (o00ooVar != null) {
            o00ooVar.o00oOo0o(colorStateList);
        }
    }

    @Override // androidx.core.widget.o0O00
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintMode(@o00oOooO.o0OO00OO PorterDuff.Mode mode) {
        o00oo o00ooVar = this.f1222o00oo0O0;
        if (o00ooVar != null) {
            o00ooVar.o00oOoO0(mode);
        }
    }

    @Override // androidx.core.widget.o0OoO00O
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@o00oOooO.o0OO00OO ColorStateList colorStateList) {
        this.f1223o00oo0Oo.o00oo(colorStateList);
        this.f1223o00oo0Oo.o00oOOoO();
    }

    @Override // androidx.core.widget.o0OoO00O
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@o00oOooO.o0OO00OO PorterDuff.Mode mode) {
        this.f1223o00oo0Oo.o00ooO00(mode);
        this.f1223o00oo0Oo.o00oOOoO();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(@o00oOooO.oo0oO0 Context context, int i) {
        super.setTextAppearance(context, i);
        o0oO0O0o o0oo0o0o = this.f1223o00oo0Oo;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oo0O(context, i);
        }
    }
}
