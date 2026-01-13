package o0O0Oo0o;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(21)
/* loaded from: classes.dex */
public class o0O0OOOo extends o0O0OO0 {

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static boolean f11936o00oOoOO = true;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static boolean f11937o00oOoOo = true;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static boolean f11938o00oOoo0 = true;

    @Override // androidx.transition.o0OoO00O
    @SuppressLint({"NewApi"})
    public void o00oOo0O(@oo0oO0 View view, @o0OO00OO Matrix matrix) {
        if (f11936o00oOoOO) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f11936o00oOoOO = false;
            }
        }
    }

    @Override // androidx.transition.o0OoO00O
    @SuppressLint({"NewApi"})
    public void o00oOoOO(@oo0oO0 View view, @oo0oO0 Matrix matrix) {
        if (f11937o00oOoOo) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f11937o00oOoOo = false;
            }
        }
    }

    @Override // androidx.transition.o0OoO00O
    @SuppressLint({"NewApi"})
    public void o00oOoOo(@oo0oO0 View view, @oo0oO0 Matrix matrix) {
        if (f11938o00oOoo0) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f11938o00oOoo0 = false;
            }
        }
    }
}
