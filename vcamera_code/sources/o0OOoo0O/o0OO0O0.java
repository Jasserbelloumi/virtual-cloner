package o0OOoo0O;

import android.graphics.Bitmap;
import android.graphics.Matrix;
/* loaded from: classes3.dex */
public class o0OO0O0 {
    public static Bitmap o00oOOo0(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < height) {
            height = width;
        }
        int i = height / 2;
        return Bitmap.createBitmap(bitmap, width / 3, 0, i, (int) (i / 1.2d), (Matrix) null, false);
    }

    public static Bitmap o00oOOoO(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        switch (i) {
            case 2001:
                return bitmap;
            case 2002:
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 2004:
                matrix.postScale(-1.0f, 1.0f);
            case 2003:
                matrix.postScale(1.0f, -1.0f);
                break;
        }
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
    }

    public static Bitmap o00oOo00(Bitmap bitmap, float f) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
    }

    public static Bitmap o00oOo0O(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
    }

    public static Bitmap o00oOo0o(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postSkew(-0.6f, -0.3f);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
    }

    public static Bitmap o00oOooO(Bitmap bitmap, float f) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.preScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
    }
}
