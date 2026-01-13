package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import o0O0Oo0o.o0O0O0Oo;
/* loaded from: classes.dex */
public class o0O000o0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f5170o00oOOo0 = 1048576;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final boolean f5171o00oOOoO = true;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final boolean f5172o00oOo00 = true;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final boolean f5173o00oOooO = true;

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements TypeEvaluator<Matrix> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final float[] f5174o00oOOo0 = new float[9];

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final float[] f5175o00oOOoO = new float[9];

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Matrix f5176o00oOo00 = new Matrix();

        @Override // android.animation.TypeEvaluator
        /* renamed from: o00oOOo0 */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f5174o00oOOo0);
            matrix2.getValues(this.f5175o00oOOoO);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f5175o00oOOoO;
                float f2 = fArr[i];
                float f3 = this.f5174o00oOOo0[i];
                fArr[i] = o00oOoO0.o00oOoO.o00oOOo0(f2, f3, f, f3);
            }
            this.f5176o00oOo00.setValues(this.f5175o00oOOoO);
            return this.f5176o00oOo00;
        }
    }

    public static View o00oOOo0(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        o0O0O0Oo.o00oOoOo(view, matrix);
        o0O0O0Oo.o00oOoo0(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap o00oOOoO2 = o00oOOoO(view, matrix, rectF, viewGroup);
        if (o00oOOoO2 != null) {
            imageView.setImageBitmap(o00oOOoO2);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    public static Bitmap o00oOOoO(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        boolean z;
        boolean z2;
        int i;
        ViewGroup viewGroup2;
        if (f5171o00oOOoO) {
            z = !view.isAttachedToWindow();
            z2 = viewGroup == null ? false : viewGroup.isAttachedToWindow();
        } else {
            z = false;
            z2 = false;
        }
        boolean z3 = f5172o00oOo00;
        Bitmap bitmap = null;
        if (!z3 || !z) {
            i = 0;
            viewGroup2 = null;
        } else if (!z2) {
            return null;
        } else {
            viewGroup2 = (ViewGroup) view.getParent();
            i = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round > 0 && round2 > 0) {
            float min = Math.min(1.0f, 1048576.0f / (round * round2));
            int round3 = Math.round(round * min);
            int round4 = Math.round(round2 * min);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(min, min);
            if (f5173o00oOooO) {
                Picture picture = new Picture();
                Canvas beginRecording = picture.beginRecording(round3, round4);
                beginRecording.concat(matrix);
                view.draw(beginRecording);
                picture.endRecording();
                bitmap = Bitmap.createBitmap(picture);
            } else {
                bitmap = Bitmap.createBitmap(round3, round4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (z3 && z) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, i);
        }
        return bitmap;
    }

    public static Animator o00oOo00(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
