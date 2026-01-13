package o0O0Oo0o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0O0O0Oo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final androidx.transition.o0OoO00O f11931o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f11932o00oOOoO = "ViewUtils";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final Property<View, Float> f11933o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final Property<View, Rect> f11934o00oOooO;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends Property<View, Float> {
        public o00oOOo0(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: o00oOOo0 */
        public Float get(View view) {
            return Float.valueOf(o0O0O0Oo.o00oOo00(view));
        }

        @Override // android.util.Property
        /* renamed from: o00oOOoO */
        public void set(View view, Float f) {
            o0O0O0Oo.o00oOoO(view, f.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends Property<View, Rect> {
        public o00oOOoO(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: o00oOOo0 */
        public Rect get(View view) {
            return o0O000oo.o0O0o00O.o00oooOo(view);
        }

        @Override // android.util.Property
        /* renamed from: o00oOOoO */
        public void set(View view, Rect rect) {
            o0O000oo.o0O0o00O.o0O(view, rect);
        }
    }

    static {
        f11931o00oOOo0 = Build.VERSION.SDK_INT >= 29 ? new o0O0o00O() : new o0O0o00();
        f11933o00oOo00 = new o00oOOo0(Float.class, "translationAlpha");
        f11934o00oOooO = new o00oOOoO(Rect.class, "clipBounds");
    }

    public static void o00oOOo0(@oo0oO0 View view) {
        f11931o00oOOo0.o00oOOo0(view);
    }

    public static o0O0oo0o o00oOOoO(@oo0oO0 View view) {
        return new o0oO0O0o(view);
    }

    public static float o00oOo00(@oo0oO0 View view) {
        return f11931o00oOOo0.o00oOo00(view);
    }

    public static void o00oOo0O(@oo0oO0 View view) {
        f11931o00oOOo0.o00oOooO(view);
    }

    public static void o00oOo0o(@oo0oO0 View view, @o0OO00OO Matrix matrix) {
        f11931o00oOOo0.o00oOo0O(view, matrix);
    }

    public static void o00oOoO(@oo0oO0 View view, float f) {
        f11931o00oOOo0.o00oOoO0(view, f);
    }

    public static void o00oOoO0(@oo0oO0 View view, int i, int i2, int i3, int i4) {
        f11931o00oOOo0.o00oOo0o(view, i, i2, i3, i4);
    }

    public static void o00oOoOO(@oo0oO0 View view, int i) {
        f11931o00oOOo0.o00oOoO(view, i);
    }

    public static void o00oOoOo(@oo0oO0 View view, @oo0oO0 Matrix matrix) {
        f11931o00oOOo0.o00oOoOO(view, matrix);
    }

    public static void o00oOoo0(@oo0oO0 View view, @oo0oO0 Matrix matrix) {
        f11931o00oOOo0.o00oOoOo(view, matrix);
    }

    public static o0O0oo00 o00oOooO(@oo0oO0 View view) {
        return new oooOO0(view);
    }
}
