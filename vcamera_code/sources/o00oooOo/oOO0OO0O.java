package o00oooOo;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collection;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0O0OO0;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class oOO0OO0O {

    @o0OOooO0(26)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static float[] o00oOOo0(Path path, float f) {
            return path.approximate(f);
        }
    }

    @o0OOooO0(26)
    @oo0oO0
    public static Collection<oOO0O0O> o00oOOo0(@oo0oO0 Path path) {
        return o00oOOoO(path, 0.5f);
    }

    @o0OOooO0(26)
    @oo0oO0
    public static Collection<oOO0O0O> o00oOOoO(@oo0oO0 Path path, @o0O0OO0(from = 0.0d) float f) {
        float[] o00oOOo02 = o00oOOo0.o00oOOo0(path, f);
        int length = o00oOOo02.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 1; i < length; i++) {
            int i2 = i * 3;
            int i3 = (i - 1) * 3;
            float f2 = o00oOOo02[i2];
            float f3 = o00oOOo02[i2 + 1];
            float f4 = o00oOOo02[i2 + 2];
            float f5 = o00oOOo02[i3];
            float f6 = o00oOOo02[i3 + 1];
            float f7 = o00oOOo02[i3 + 2];
            if (f2 != f5 && (f3 != f6 || f4 != f7)) {
                arrayList.add(new oOO0O0O(new PointF(f6, f7), f5, new PointF(f3, f4), f2));
            }
        }
        return arrayList;
    }
}
