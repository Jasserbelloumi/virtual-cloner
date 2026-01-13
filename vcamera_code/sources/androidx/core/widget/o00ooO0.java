package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00ooO0 {

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static ColorStateList o00oOOo0(ImageView imageView) {
            return imageView.getImageTintList();
        }

        @o0O0O0Oo
        public static PorterDuff.Mode o00oOOoO(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        @o0O0O0Oo
        public static void o00oOo00(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        @o0O0O0Oo
        public static void o00oOooO(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    @o0OO00OO
    public static ColorStateList o00oOOo0(@oo0oO0 ImageView imageView) {
        return o00oOOo0.o00oOOo0(imageView);
    }

    @o0OO00OO
    public static PorterDuff.Mode o00oOOoO(@oo0oO0 ImageView imageView) {
        return o00oOOo0.o00oOOoO(imageView);
    }

    public static void o00oOo00(@oo0oO0 ImageView imageView, @o0OO00OO ColorStateList colorStateList) {
        o00oOOo0.o00oOo00(imageView, colorStateList);
    }

    public static void o00oOooO(@oo0oO0 ImageView imageView, @o0OO00OO PorterDuff.Mode mode) {
        o00oOOo0.o00oOooO(imageView, mode);
    }
}
