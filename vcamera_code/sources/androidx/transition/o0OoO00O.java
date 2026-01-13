package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0OoO00O {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f5202o00oOOoO = "ViewUtilsBase";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static Method f5203o00oOo00 = null;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static Field f5204o00oOo0O = null;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static boolean f5205o00oOo0o = false;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f5206o00oOoO0 = 12;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static boolean f5207o00oOooO;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public float[] f5208o00oOOo0;

    public void o00oOOo0(@oo0oO0 View view) {
        if (view.getVisibility() == 0) {
            view.setTag(R.id.save_non_transition_alpha, null);
        }
    }

    @SuppressLint({"PrivateApi", "SoonBlockedPrivateApi"})
    public final void o00oOOoO() {
        if (f5207o00oOooO) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            f5203o00oOo00 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f5207o00oOooO = true;
    }

    public float o00oOo00(@oo0oO0 View view) {
        Float f = (Float) view.getTag(R.id.save_non_transition_alpha);
        float alpha = view.getAlpha();
        return f != null ? alpha / f.floatValue() : alpha;
    }

    public void o00oOo0O(@oo0oO0 View view, @o0OO00OO Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX(view.getWidth() / 2);
            view.setPivotY(view.getHeight() / 2);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.f5208o00oOOo0;
        if (fArr == null) {
            fArr = new float[9];
            this.f5208o00oOOo0 = fArr;
        }
        matrix.getValues(fArr);
        float f = fArr[3];
        float sqrt = ((float) Math.sqrt(1.0f - (f * f))) * (fArr[0] < 0.0f ? -1 : 1);
        float degrees = (float) Math.toDegrees(Math.atan2(f, sqrt));
        float f2 = fArr[0] / sqrt;
        float f3 = fArr[4] / sqrt;
        float f4 = fArr[2];
        float f5 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f4);
        view.setTranslationY(f5);
        view.setRotation(degrees);
        view.setScaleX(f2);
        view.setScaleY(f3);
    }

    public void o00oOo0o(@oo0oO0 View view, int i, int i2, int i3, int i4) {
        o00oOOoO();
        Method method = f5203o00oOo00;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    public void o00oOoO(@oo0oO0 View view, int i) {
        if (!f5205o00oOo0o) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f5204o00oOo0O = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f5205o00oOo0o = true;
        }
        Field field = f5204o00oOo0O;
        if (field != null) {
            try {
                f5204o00oOo0O.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void o00oOoO0(@oo0oO0 View view, float f) {
        Float f2 = (Float) view.getTag(R.id.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    public void o00oOoOO(@oo0oO0 View view, @oo0oO0 Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            o00oOoOO(view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    public void o00oOoOo(@oo0oO0 View view, @oo0oO0 Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            o00oOoOo(view2, matrix);
            matrix.postTranslate(view2.getScrollX(), view2.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }

    public void o00oOooO(@oo0oO0 View view) {
        int i = R.id.save_non_transition_alpha;
        if (view.getTag(i) == null) {
            view.setTag(i, Float.valueOf(view.getAlpha()));
        }
    }
}
