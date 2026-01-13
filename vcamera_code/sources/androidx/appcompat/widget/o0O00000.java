package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.appcompat.R;
import o0oO0Ooo.oO0Ooooo;
/* loaded from: classes.dex */
public class o0O00000 {
    @o00oOooO.oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final EditText f1138o00oOOo0;
    @o00oOooO.oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final oO0Ooooo f1139o00oOOoO;

    public o0O00000(@o00oOooO.oo0oO0 EditText editText) {
        this.f1138o00oOOo0 = editText;
        this.f1139o00oOOoO = new oO0Ooooo(editText, false);
    }

    @o00oOooO.o0OO00OO
    public KeyListener o00oOOo0(@o00oOooO.o0OO00OO KeyListener keyListener) {
        return o00oOOoO(keyListener) ? this.f1139o00oOOoO.o00oOOoO(keyListener) : keyListener;
    }

    public boolean o00oOOoO(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public boolean o00oOo00() {
        return this.f1139o00oOOoO.o00oOooO();
    }

    @o00oOooO.o0OO00OO
    public InputConnection o00oOo0O(@o00oOooO.o0OO00OO InputConnection inputConnection, @o00oOooO.oo0oO0 EditorInfo editorInfo) {
        return this.f1139o00oOOoO.o00oOo0O(inputConnection, editorInfo);
    }

    public void o00oOo0o(boolean z) {
        this.f1139o00oOOoO.o00oOoO0(z);
    }

    public void o00oOooO(@o00oOooO.o0OO00OO AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1138o00oOOo0.getContext().obtainStyledAttributes(attributeSet, R.styleable.AppCompatTextView, i, 0);
        try {
            int i2 = R.styleable.AppCompatTextView_emojiCompatEnabled;
            boolean z = obtainStyledAttributes.hasValue(i2) ? obtainStyledAttributes.getBoolean(i2, true) : true;
            obtainStyledAttributes.recycle();
            o00oOo0o(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
