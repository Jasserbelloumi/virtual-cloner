package o00ooOoo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class oO0OOO0 {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f9141o00oOOoO = 1048576;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f9142o00oOo00 = "sharedElement:snapshot:bitmap";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f9143o00oOo0O = "sharedElement:snapshot:imageMatrix";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f9144o00oOooO = "sharedElement:snapshot:imageScaleType";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public Matrix f9145o00oOOo0;

    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        void onSharedElementsReady();
    }

    public static Bitmap o00oOOo0(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return null;
        }
        float min = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
        if ((drawable instanceof BitmapDrawable) && min == 1.0f) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int i = (int) (intrinsicWidth * min);
        int i2 = (int) (intrinsicHeight * min);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect bounds = drawable.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(canvas);
        drawable.setBounds(i3, i4, i5, i6);
        return createBitmap;
    }

    public Parcelable o00oOOoO(View view, Matrix matrix, RectF rectF) {
        Bitmap o00oOOo02;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (drawable != null && background == null && (o00oOOo02 = o00oOOo0(drawable)) != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(f9142o00oOo00, o00oOOo02);
                bundle.putString(f9144o00oOooO, imageView.getScaleType().toString());
                if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                    float[] fArr = new float[9];
                    imageView.getImageMatrix().getValues(fArr);
                    bundle.putFloatArray(f9143o00oOo0O, fArr);
                }
                return bundle;
            }
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round <= 0 || round2 <= 0) {
            return null;
        }
        float min = Math.min(1.0f, 1048576.0f / (round * round2));
        int i = (int) (round * min);
        int i2 = (int) (round2 * min);
        if (this.f9145o00oOOo0 == null) {
            this.f9145o00oOOo0 = new Matrix();
        }
        this.f9145o00oOOo0.set(matrix);
        this.f9145o00oOOo0.postTranslate(-rectF.left, -rectF.top);
        this.f9145o00oOOo0.postScale(min, min);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.concat(this.f9145o00oOOo0);
        view.draw(canvas);
        return createBitmap;
    }

    public View o00oOo00(Context context, Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            if (parcelable instanceof Bitmap) {
                ImageView imageView = new ImageView(context);
                imageView.setImageBitmap((Bitmap) parcelable);
                return imageView;
            }
            return null;
        }
        Bundle bundle = (Bundle) parcelable;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f9142o00oOo00);
        if (bitmap == null) {
            return null;
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageBitmap(bitmap);
        imageView2.setScaleType(ImageView.ScaleType.valueOf(bundle.getString(f9144o00oOooO)));
        if (imageView2.getScaleType() == ImageView.ScaleType.MATRIX) {
            float[] floatArray = bundle.getFloatArray(f9143o00oOo0O);
            Matrix matrix = new Matrix();
            matrix.setValues(floatArray);
            imageView2.setImageMatrix(matrix);
            return imageView2;
        }
        return imageView2;
    }

    public void o00oOo0O(List<View> list) {
    }

    public void o00oOo0o(List<String> list, List<View> list2, List<View> list3) {
    }

    public void o00oOoO(List<String> list, List<View> list2, o00oOOo0 o00oooo02) {
        o00oooo02.onSharedElementsReady();
    }

    public void o00oOoO0(List<String> list, List<View> list2, List<View> list3) {
    }

    public void o00oOooO(List<String> list, Map<String, View> map) {
    }
}
