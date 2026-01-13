package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.o0O000o0;
import java.util.Map;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oOoO extends o0O0000O {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final String f5011o00oo0O0 = "android:changeImageTransform:matrix";

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f5010o00oo0O = "android:changeImageTransform:bounds";

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final String[] f5012o00oo0Oo = {f5011o00oo0O0, f5010o00oo0O};

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final TypeEvaluator<Matrix> f5014o00oo0o0 = new o00oOOo0();

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final Property<ImageView, Matrix> f5013o00oo0o = new o00oOOoO(Matrix.class, "animatedTransform");

    /* loaded from: classes.dex */
    public class o00oOOo0 implements TypeEvaluator<Matrix> {
        @Override // android.animation.TypeEvaluator
        /* renamed from: o00oOOo0 */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends Property<ImageView, Matrix> {
        public o00oOOoO(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: o00oOOo0 */
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: o00oOOoO */
        public void set(ImageView imageView, Matrix matrix) {
            o0O0Oo0o.o0O00000.o00oOOo0(imageView, matrix);
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f5015o00oOOo0;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f5015o00oOOo0 = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5015o00oOOo0[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public o00oOoO() {
    }

    public o00oOoO(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static Matrix o00oOOoO(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f2 = intrinsicHeight;
        float max = Math.max(width / f, height / f2);
        int round = Math.round((width - (f * max)) / 2.0f);
        int round2 = Math.round((height - (f2 * max)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate(round, round2);
        return matrix;
    }

    @oo0oO0
    public static Matrix o00oOo00(@oo0oO0 ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return new Matrix(imageView.getImageMatrix());
        }
        int i = o00oOo00.f5015o00oOOo0[imageView.getScaleType().ordinal()];
        return i != 1 ? i != 2 ? new Matrix(imageView.getImageMatrix()) : o00oOOoO(imageView) : o00oOoOO(imageView);
    }

    public static Matrix o00oOoOO(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    @Override // androidx.transition.o0O0000O
    public void captureEndValues(@oo0oO0 o0O0Oo0o.o0OoO00O o0ooo00o) {
        captureValues(o0ooo00o);
    }

    @Override // androidx.transition.o0O0000O
    public void captureStartValues(@oo0oO0 o0O0Oo0o.o0OoO00O o0ooo00o) {
        captureValues(o0ooo00o);
    }

    public final void captureValues(o0O0Oo0o.o0OoO00O o0ooo00o) {
        View view = o0ooo00o.f11945o00oOOoO;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = o0ooo00o.f11944o00oOOo0;
            map.put(f5010o00oo0O, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            map.put(f5011o00oo0O0, o00oOo00(imageView));
        }
    }

    @Override // androidx.transition.o0O0000O
    @o0OO00OO
    public Animator createAnimator(@oo0oO0 ViewGroup viewGroup, @o0OO00OO o0O0Oo0o.o0OoO00O o0ooo00o, @o0OO00OO o0O0Oo0o.o0OoO00O o0ooo00o2) {
        if (o0ooo00o == null || o0ooo00o2 == null) {
            return null;
        }
        Rect rect = (Rect) o0ooo00o.f11944o00oOOo0.get(f5010o00oo0O);
        Rect rect2 = (Rect) o0ooo00o2.f11944o00oOOo0.get(f5010o00oo0O);
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) o0ooo00o.f11944o00oOOo0.get(f5011o00oo0O0);
        Matrix matrix2 = (Matrix) o0ooo00o2.f11944o00oOOo0.get(f5011o00oo0O0);
        boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) o0ooo00o2.f11945o00oOOoO;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return o00oOo0o(imageView);
        }
        if (matrix == null) {
            matrix = o0O0Oo0o.o0O0000O.f11914o00oOOo0;
        }
        if (matrix2 == null) {
            matrix2 = o0O0Oo0o.o0O0000O.f11914o00oOOo0;
        }
        f5013o00oo0o.set(imageView, matrix);
        return o00oOooO(imageView, matrix, matrix2);
    }

    @Override // androidx.transition.o0O0000O
    @oo0oO0
    public String[] getTransitionProperties() {
        return f5012o00oo0Oo;
    }

    @oo0oO0
    public final ObjectAnimator o00oOo0o(@oo0oO0 ImageView imageView) {
        Property<ImageView, Matrix> property = f5013o00oo0o;
        TypeEvaluator<Matrix> typeEvaluator = f5014o00oo0o0;
        Matrix matrix = o0O0Oo0o.o0O0000O.f11914o00oOOo0;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix, matrix});
    }

    public final ObjectAnimator o00oOooO(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) f5013o00oo0o, (TypeEvaluator) new o0O000o0.o00oOOo0(), (Object[]) new Matrix[]{matrix, matrix2});
    }
}
