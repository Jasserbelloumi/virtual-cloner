package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.appcompat.R;
import o00oOooO.o0OO0oO;
import o0OoO00O.oO;
import o0OoO00O.oOooo;
/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements o0O000oo.oo0OOoo, o0O000oo.o0O0OO, o0O0o000, androidx.core.widget.o0OoO00O {
    @o00oOooO.oo0oO0
    private final o0O00000 mAppCompatEmojiEditTextHelper;
    private final o00oo0 mBackgroundTintHelper;
    private final androidx.core.widget.o0O000o0 mDefaultOnReceiveContentListener;
    @o00oOooO.o0OO00OO
    private o00oOOo0 mSuperCaller;
    private final o0O0O0O mTextClassifierHelper;
    private final o0oO0O0o mTextHelper;

    @o00oOooO.o0OOooO0(api = 26)
    /* loaded from: classes.dex */
    public class o00oOOo0 {
        public o00oOOo0() {
        }

        @o00oOooO.o0OO00OO
        public TextClassifier o00oOOo0() {
            return AppCompatEditText.super.getTextClassifier();
        }

        public void o00oOOoO(TextClassifier textClassifier) {
            AppCompatEditText.super.setTextClassifier(textClassifier);
        }
    }

    public AppCompatEditText(@o00oOooO.oo0oO0 Context context) {
        this(context, null);
    }

    public AppCompatEditText(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public AppCompatEditText(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet, int i) {
        super(o0OO0oO.o00oOOoO(context), attributeSet, i);
        o0OO0o.o00oOOo0(this, getContext());
        o00oo0 o00oo0Var = new o00oo0(this);
        this.mBackgroundTintHelper = o00oo0Var;
        o00oo0Var.o00oOo0O(attributeSet, i);
        o0oO0O0o o0oo0o0o = new o0oO0O0o(this);
        this.mTextHelper = o0oo0o0o;
        o0oo0o0o.o00oo00O(attributeSet, i);
        o0oo0o0o.o00oOOoO();
        this.mTextClassifierHelper = new o0O0O0O(this);
        this.mDefaultOnReceiveContentListener = new androidx.core.widget.o0O000o0();
        o0O00000 o0o00000 = new o0O00000(this);
        this.mAppCompatEmojiEditTextHelper = o0o00000;
        o0o00000.o00oOooO(attributeSet, i);
        initEmojiKeyListener(o0o00000);
    }

    @o00oOooO.o0OOooO0(26)
    @o00oOooO.oo0oO0
    @o00oOooO.o0OOo000
    private o00oOOo0 getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new o00oOOo0();
        }
        return this.mSuperCaller;
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

    @Override // android.widget.EditText, android.widget.TextView
    @o00oOooO.o0OO00OO
    public Editable getText() {
        return super.getText();
    }

    @Override // android.widget.TextView
    @o00oOooO.o0OOooO0(api = 26)
    @o00oOooO.oo0oO0
    public TextClassifier getTextClassifier() {
        return getSuperCaller().o00oOOo0();
    }

    public void initEmojiKeyListener(o0O00000 o0o00000) {
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

    @Override // androidx.appcompat.widget.o0O0o000
    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.o00oOo00();
    }

    @Override // android.widget.TextView, android.view.View
    @o00oOooO.o0OO00OO
    public InputConnection onCreateInputConnection(@o00oOooO.oo0oO0 EditorInfo editorInfo) {
        String[] o0O002;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.o00oo0Oo(this, onCreateInputConnection, editorInfo);
        InputConnection o00oOOo02 = o0O000.o00oOOo0(onCreateInputConnection, editorInfo, this);
        if (o00oOOo02 != null && Build.VERSION.SDK_INT <= 30 && (o0O002 = o0O000oo.o0O0o00O.o0O00(this)) != null) {
            oOooo.o00oOoO(editorInfo, o0O002);
            o00oOOo02 = oO.o00oOooO(this, o00oOOo02, editorInfo);
        }
        return this.mAppCompatEmojiEditTextHelper.o00oOo0O(o00oOOo02, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (o0O00OOO.o00oOOo0(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // o0O000oo.o0O0OO
    @o00oOooO.o0OO00OO
    public o0O000oo.o00oo00O onReceiveContent(@o00oOooO.oo0oO0 o0O000oo.o00oo00O o00oo00o) {
        return this.mDefaultOnReceiveContentListener.o00oOOo0(this, o00oo00o);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (o0O00OOO.o00oOOoO(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@o00oOooO.o0OO00OO ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // androidx.appcompat.widget.o0O0o000
    public void setEmojiCompatEnabled(boolean z) {
        this.mAppCompatEmojiEditTextHelper.o00oOo0o(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@o00oOooO.o0OO00OO KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.o00oOOo0(keyListener));
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
    @o00oOooO.o0OOooO0(api = 26)
    public void setTextClassifier(@o00oOooO.o0OO00OO TextClassifier textClassifier) {
        getSuperCaller().o00oOOoO(textClassifier);
    }
}
