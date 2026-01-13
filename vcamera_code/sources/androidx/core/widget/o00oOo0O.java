package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import java.lang.reflect.Field;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oOo0O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f2503o00oOOo0 = "CompoundButtonCompat";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static Field f2504o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static boolean f2505o00oOo00;

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static ColorStateList o00oOOo0(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        @o0O0O0Oo
        public static PorterDuff.Mode o00oOOoO(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        @o0O0O0Oo
        public static void o00oOo00(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        @o0O0O0Oo
        public static void o00oOooO(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    @o0OOooO0(23)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static Drawable o00oOOo0(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    @o0OO00OO
    public static Drawable o00oOOo0(@oo0oO0 CompoundButton compoundButton) {
        return o00oOOoO.o00oOOo0(compoundButton);
    }

    @o0OO00OO
    public static ColorStateList o00oOOoO(@oo0oO0 CompoundButton compoundButton) {
        return o00oOOo0.o00oOOo0(compoundButton);
    }

    @o0OO00OO
    public static PorterDuff.Mode o00oOo00(@oo0oO0 CompoundButton compoundButton) {
        return o00oOOo0.o00oOOoO(compoundButton);
    }

    public static void o00oOo0O(@oo0oO0 CompoundButton compoundButton, @o0OO00OO PorterDuff.Mode mode) {
        o00oOOo0.o00oOooO(compoundButton, mode);
    }

    public static void o00oOooO(@oo0oO0 CompoundButton compoundButton, @o0OO00OO ColorStateList colorStateList) {
        o00oOOo0.o00oOo00(compoundButton, colorStateList);
    }
}
