package o0oO0Ooo;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.o00oo00O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(19)
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public class oO0OOo0o implements TransformationMethod {
    @o0OO00OO

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final TransformationMethod f16955o00oo0O0;

    public oO0OOo0o(@o0OO00OO TransformationMethod transformationMethod) {
        this.f16955o00oo0O0 = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(@o0OO00OO CharSequence charSequence, @oo0oO0 View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f16955o00oo0O0;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || o00oo00O.o00oOOoO().o00oOo0o() != 1) ? charSequence : o00oo00O.o00oOOoO().o00oo0oO(charSequence);
    }

    public TransformationMethod o00oOOo0() {
        return this.f16955o00oo0O0;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f16955o00oo0O0;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
