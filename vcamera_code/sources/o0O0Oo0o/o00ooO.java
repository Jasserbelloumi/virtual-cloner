package o0O0Oo0o;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00ooO {
    @o0OO00OO
    public static o00oo o00oOOo0(@oo0oO0 View view, @oo0oO0 ViewGroup viewGroup, @o0OO00OO Matrix matrix) {
        return Build.VERSION.SDK_INT == 28 ? o00ooO0.o00oOOoO(view, viewGroup, matrix) : androidx.transition.o00oo.o00oOOoO(view, viewGroup, matrix);
    }

    public static void o00oOOoO(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            o00ooO0.o00oOo0o(view);
        } else {
            androidx.transition.o00oo.o00oOo0o(view);
        }
    }
}
