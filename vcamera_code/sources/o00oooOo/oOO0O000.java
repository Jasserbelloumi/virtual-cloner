package o00oooOo;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o00oooOo.oOO000o;
import o0ooOoOO.oO0o0o;
/* loaded from: classes.dex */
public final class oOO0O000 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f9795o00oOOo0 = "\udfffd";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f9796o00oOOoO = "m";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final ThreadLocal<oO0o0o<Rect, Rect>> f9797o00oOo00 = new ThreadLocal<>();

    @o0OOooO0(23)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static boolean o00oOOo0(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    @o0OOooO0(29)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static void o00oOOo0(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    public static boolean o00oOOo0(@oo0oO0 Paint paint, @oo0oO0 String str) {
        return o00oOOo0.o00oOOo0(paint, str);
    }

    public static oO0o0o<Rect, Rect> o00oOOoO() {
        ThreadLocal<oO0o0o<Rect, Rect>> threadLocal = f9797o00oOo00;
        oO0o0o<Rect, Rect> oo0o0o = threadLocal.get();
        if (oo0o0o == null) {
            oO0o0o<Rect, Rect> oo0o0o2 = new oO0o0o<>(new Rect(), new Rect());
            threadLocal.set(oo0o0o2);
            return oo0o0o2;
        }
        oo0o0o.f17227o00oOOo0.setEmpty();
        oo0o0o.f17228o00oOOoO.setEmpty();
        return oo0o0o;
    }

    public static boolean o00oOo00(@oo0oO0 Paint paint, @o0OO00OO oOO000 ooo000) {
        if (Build.VERSION.SDK_INT >= 29) {
            o00oOOoO.o00oOOo0(paint, ooo000 != null ? oOO000o.o00oOOoO.o00oOOo0(ooo000) : null);
            return true;
        } else if (ooo000 == null) {
            paint.setXfermode(null);
            return true;
        } else {
            PorterDuff.Mode o00oOOo02 = oOO000o.o00oOOo0(ooo000);
            paint.setXfermode(o00oOOo02 != null ? new PorterDuffXfermode(o00oOOo02) : null);
            return o00oOOo02 != null;
        }
    }
}
