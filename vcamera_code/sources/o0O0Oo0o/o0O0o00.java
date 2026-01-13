package o0O0Oo0o;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(23)
/* loaded from: classes.dex */
public class o0O0o00 extends oo0OOoo {

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static boolean f11943o00oo00O = true;

    @Override // androidx.transition.o0OoO00O
    @SuppressLint({"NewApi"})
    public void o00oOoO(@oo0oO0 View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.o00oOoO(view, i);
        } else if (f11943o00oo00O) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f11943o00oo00O = false;
            }
        }
    }
}
