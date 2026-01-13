package o0O0Oo0o;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import java.lang.reflect.Field;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0O00000 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static boolean f11911o00oOOo0 = true;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static Field f11912o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static boolean f11913o00oOo00;

    public static void o00oOOo0(@oo0oO0 ImageView imageView, @o0OO00OO Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
        } else if (matrix != null) {
            o00oOo00(imageView, matrix);
        } else {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
            }
        }
    }

    public static void o00oOOoO() {
        if (f11913o00oOo00) {
            return;
        }
        try {
            Field declaredField = ImageView.class.getDeclaredField("mDrawMatrix");
            f11912o00oOOoO = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f11913o00oOo00 = true;
    }

    @o0OOooO0(21)
    @SuppressLint({"NewApi"})
    public static void o00oOo00(@oo0oO0 ImageView imageView, @o0OO00OO Matrix matrix) {
        if (f11911o00oOOo0) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f11911o00oOOo0 = false;
            }
        }
    }
}
