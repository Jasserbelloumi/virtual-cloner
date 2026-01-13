package o0O0Oo0o;

import android.graphics.Matrix;
import android.view.View;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(29)
/* loaded from: classes.dex */
public class o0O0o00O extends o0O0o00 {
    @Override // o0O0Oo0o.o0O0OO0, androidx.transition.o0OoO00O
    public float o00oOo00(@oo0oO0 View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // o0O0Oo0o.o0O0OOOo, androidx.transition.o0OoO00O
    public void o00oOo0O(@oo0oO0 View view, @o0OO00OO Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // o0O0Oo0o.oo0OOoo, androidx.transition.o0OoO00O
    public void o00oOo0o(@oo0oO0 View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // o0O0Oo0o.o0O0o00, androidx.transition.o0OoO00O
    public void o00oOoO(@oo0oO0 View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // o0O0Oo0o.o0O0OO0, androidx.transition.o0OoO00O
    public void o00oOoO0(@oo0oO0 View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // o0O0Oo0o.o0O0OOOo, androidx.transition.o0OoO00O
    public void o00oOoOO(@oo0oO0 View view, @oo0oO0 Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // o0O0Oo0o.o0O0OOOo, androidx.transition.o0OoO00O
    public void o00oOoOo(@oo0oO0 View view, @oo0oO0 Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
