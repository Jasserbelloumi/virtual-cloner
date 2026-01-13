package o00oooOo;

import android.graphics.BlendMode;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o00oooOo.oOO000o;
/* loaded from: classes.dex */
public class oOO0000 {

    @o0OOooO0(29)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static ColorFilter o00oOOo0(final int i, Object obj) {
            final BlendMode blendMode = (BlendMode) obj;
            return new ColorFilter(i, blendMode) { // from class: android.graphics.BlendModeColorFilter
                static {
                    throw new NoClassDefFoundError();
                }
            };
        }
    }

    @o0OO00OO
    public static ColorFilter o00oOOo0(int i, @oo0oO0 oOO000 ooo000) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object o00oOOo02 = oOO000o.o00oOOoO.o00oOOo0(ooo000);
            if (o00oOOo02 != null) {
                return o00oOOo0.o00oOOo0(i, o00oOOo02);
            }
            return null;
        }
        PorterDuff.Mode o00oOOo03 = oOO000o.o00oOOo0(ooo000);
        if (o00oOOo03 != null) {
            return new PorterDuffColorFilter(i, o00oOOo03);
        }
        return null;
    }
}
