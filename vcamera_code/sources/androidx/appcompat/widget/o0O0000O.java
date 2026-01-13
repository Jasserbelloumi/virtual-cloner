package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.R;
import o0oO0Ooo.oO000OOo;
/* loaded from: classes.dex */
public class o0O0000O {
    @o00oOooO.oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final TextView f1140o00oOOo0;
    @o00oOooO.oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final oO000OOo f1141o00oOOoO;

    public o0O0000O(@o00oOooO.oo0oO0 TextView textView) {
        this.f1140o00oOOo0 = textView;
        this.f1141o00oOOoO = new oO000OOo(textView, false);
    }

    @o00oOooO.oo0oO0
    public InputFilter[] o00oOOo0(@o00oOooO.oo0oO0 InputFilter[] inputFilterArr) {
        return this.f1141o00oOOoO.o00oOOo0(inputFilterArr);
    }

    public boolean o00oOOoO() {
        return this.f1141o00oOOoO.o00oOOoO();
    }

    public void o00oOo00(@o00oOooO.o0OO00OO AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1140o00oOOo0.getContext().obtainStyledAttributes(attributeSet, R.styleable.AppCompatTextView, i, 0);
        try {
            int i2 = R.styleable.AppCompatTextView_emojiCompatEnabled;
            boolean z = obtainStyledAttributes.hasValue(i2) ? obtainStyledAttributes.getBoolean(i2, true) : true;
            obtainStyledAttributes.recycle();
            o00oOo0O(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void o00oOo0O(boolean z) {
        this.f1141o00oOOoO.o00oOooO(z);
    }

    @o00oOooO.o0OO00OO
    public TransformationMethod o00oOo0o(@o00oOooO.o0OO00OO TransformationMethod transformationMethod) {
        return this.f1141o00oOOoO.o00oOo0o(transformationMethod);
    }

    public void o00oOooO(boolean z) {
        this.f1141o00oOOoO.o00oOo00(z);
    }
}
