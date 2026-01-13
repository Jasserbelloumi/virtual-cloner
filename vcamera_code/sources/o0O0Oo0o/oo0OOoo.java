package o0O0Oo0o;

import android.annotation.SuppressLint;
import android.view.View;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(22)
/* loaded from: classes.dex */
public class oo0OOoo extends o0O0OOOo {

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static boolean f11955o00oOooo = true;

    @Override // androidx.transition.o0OoO00O
    @SuppressLint({"NewApi"})
    public void o00oOo0o(@oo0oO0 View view, int i, int i2, int i3, int i4) {
        if (f11955o00oOooo) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f11955o00oOooo = false;
            }
        }
    }
}
