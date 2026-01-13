package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.appcompat.R;
import o00oOooO.o0OO0oO;
/* loaded from: classes.dex */
public class o0O00O0 extends MultiAutoCompleteTextView implements o0O000oo.oo0OOoo, o0O0o000, androidx.core.widget.o0OoO00O {

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int[] f1164o00oo0o0 = {16843126};

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o0oO0O0o f1165o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00oo0 f1166o00oo0O0;
    @o00oOooO.oo0oO0

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o0O00000 f1167o00oo0Oo;

    public o0O00O0(@o00oOooO.oo0oO0 Context context) {
        this(context, null);
    }

    public o0O00O0(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public o0O00O0(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet, int i) {
        super(o0OO0oO.o00oOOoO(context), attributeSet, i);
        o0OO0o.o00oOOo0(this, getContext());
        o0OOO0 o00ooOo2 = o0OOO0.o00ooOo(getContext(), attributeSet, f1164o00oo0o0, i, 0);
        if (o00ooOo2.o00ooOO0(0)) {
            setDropDownBackgroundDrawable(o00ooOo2.o00oOoO(0));
        }
        o00ooOo2.o00ooOoo();
        o00oo0 o00oo0Var = new o00oo0(this);
        this.f1166o00oo0O0 = o00oo0Var;
        o00oo0Var.o00oOo0O(attributeSet, i);
        o0oO0O0o o0oo0o0o = new o0oO0O0o(this);
        this.f1165o00oo0O = o0oo0o0o;
        o0oo0o0o.o00oo00O(attributeSet, i);
        o0oo0o0o.o00oOOoO();
        o0O00000 o0o00000 = new o0O00000(this);
        this.f1167o00oo0Oo = o0o00000;
        o0o00000.o00oOooO(attributeSet, i);
        o00oOOo0(o0o00000);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        o00oo0 o00oo0Var = this.f1166o00oo0O0;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOOoO();
        }
        o0oO0O0o o0oo0o0o = this.f1165o00oo0O;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oOOoO();
        }
    }

    @Override // o0O000oo.oo0OOoo
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        o00oo0 o00oo0Var = this.f1166o00oo0O0;
        if (o00oo0Var != null) {
            return o00oo0Var.o00oOo00();
        }
        return null;
    }

    @Override // o0O000oo.oo0OOoo
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o00oo0 o00oo0Var = this.f1166o00oo0O0;
        if (o00oo0Var != null) {
            return o00oo0Var.o00oOooO();
        }
        return null;
    }

    @Override // androidx.core.widget.o0OoO00O
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1165o00oo0O.o00oOoOo();
    }

    @Override // androidx.core.widget.o0OoO00O
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1165o00oo0O.o00oOoo0();
    }

    @Override // androidx.appcompat.widget.o0O0o000
    public boolean isEmojiCompatEnabled() {
        return this.f1167o00oo0Oo.o00oOo00();
    }

    public void o00oOOo0(o0O00000 o0o00000) {
        KeyListener keyListener = getKeyListener();
        if (o0o00000.o00oOOoO(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener o00oOOo02 = o0o00000.o00oOOo0(keyListener);
            if (o00oOOo02 == keyListener) {
                return;
            }
            super.setKeyListener(o00oOOo02);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f1167o00oo0Oo.o00oOo0O(o0O000.o00oOOo0(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@o00oOooO.o0OO00OO Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o00oo0 o00oo0Var = this.f1166o00oo0O0;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOo0o(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@o00oOooO.o0O0O0o0 int i) {
        super.setBackgroundResource(i);
        o00oo0 o00oo0Var = this.f1166o00oo0O0;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOoO0(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@o00oOooO.o0OO00OO Drawable drawable, @o00oOooO.o0OO00OO Drawable drawable2, @o00oOooO.o0OO00OO Drawable drawable3, @o00oOooO.o0OO00OO Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o0oO0O0o o0oo0o0o = this.f1165o00oo0O;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oo0O0();
        }
    }

    @Override // android.widget.TextView
    @o00oOooO.o0OOooO0(17)
    public void setCompoundDrawablesRelative(@o00oOooO.o0OO00OO Drawable drawable, @o00oOooO.o0OO00OO Drawable drawable2, @o00oOooO.o0OO00OO Drawable drawable3, @o00oOooO.o0OO00OO Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o0oO0O0o o0oo0o0o = this.f1165o00oo0O;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oo0O0();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@o00oOooO.o0O0O0o0 int i) {
        setDropDownBackgroundDrawable(o00oOo0o.o00oOo00.o00oOOoO(getContext(), i));
    }

    @Override // androidx.appcompat.widget.o0O0o000
    public void setEmojiCompatEnabled(boolean z) {
        this.f1167o00oo0Oo.o00oOo0o(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@o00oOooO.o0OO00OO KeyListener keyListener) {
        super.setKeyListener(this.f1167o00oo0Oo.o00oOOo0(keyListener));
    }

    @Override // o0O000oo.oo0OOoo
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@o00oOooO.o0OO00OO ColorStateList colorStateList) {
        o00oo0 o00oo0Var = this.f1166o00oo0O0;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOoOO(colorStateList);
        }
    }

    @Override // o0O000oo.oo0OOoo
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@o00oOooO.o0OO00OO PorterDuff.Mode mode) {
        o00oo0 o00oo0Var = this.f1166o00oo0O0;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOoOo(mode);
        }
    }

    @Override // androidx.core.widget.o0OoO00O
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@o00oOooO.o0OO00OO ColorStateList colorStateList) {
        this.f1165o00oo0O.o00oo(colorStateList);
        this.f1165o00oo0O.o00oOOoO();
    }

    @Override // androidx.core.widget.o0OoO00O
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@o00oOooO.o0OO00OO PorterDuff.Mode mode) {
        this.f1165o00oo0O.o00ooO00(mode);
        this.f1165o00oo0O.o00oOOoO();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o0oO0O0o o0oo0o0o = this.f1165o00oo0O;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oo0O(context, i);
        }
    }
}
