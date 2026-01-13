package o00oOoOO;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;
import o00oOooO.o0OO0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00oOoO implements TransformationMethod {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public Locale f6996o00oo0O0;

    public o00oOoO(Context context) {
        this.f6996o00oo0O0 = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f6996o00oo0O0);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
