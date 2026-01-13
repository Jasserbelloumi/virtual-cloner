package o0O0Oo0o;

import android.annotation.SuppressLint;
import android.view.View;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(19)
/* loaded from: classes.dex */
public class o0O0OO0 extends androidx.transition.o0OoO00O {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static boolean f11935o00oOoO = true;

    @Override // androidx.transition.o0OoO00O
    public void o00oOOo0(@oo0oO0 View view) {
    }

    @Override // androidx.transition.o0OoO00O
    @SuppressLint({"NewApi"})
    public float o00oOo00(@oo0oO0 View view) {
        float transitionAlpha;
        if (f11935o00oOoO) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f11935o00oOoO = false;
            }
        }
        return view.getAlpha();
    }

    @Override // androidx.transition.o0OoO00O
    @SuppressLint({"NewApi"})
    public void o00oOoO0(@oo0oO0 View view, float f) {
        if (f11935o00oOoO) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f11935o00oOoO = false;
            }
        }
        view.setAlpha(f);
    }

    @Override // androidx.transition.o0OoO00O
    public void o00oOooO(@oo0oO0 View view) {
    }
}
