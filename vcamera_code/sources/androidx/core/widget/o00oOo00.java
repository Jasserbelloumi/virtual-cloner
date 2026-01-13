package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import java.lang.reflect.Field;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oOo00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f2500o00oOOo0 = "CheckedTextViewCompat";

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static Field f2501o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static boolean f2502o00oOOoO;

        @o0OO00OO
        public static Drawable o00oOOo0(@oo0oO0 CheckedTextView checkedTextView) {
            if (!f2502o00oOOoO) {
                try {
                    Field declaredField = CheckedTextView.class.getDeclaredField("mCheckMarkDrawable");
                    f2501o00oOOo0 = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f2502o00oOOoO = true;
            }
            Field field = f2501o00oOOo0;
            if (field != null) {
                try {
                    return (Drawable) field.get(checkedTextView);
                } catch (IllegalAccessException unused2) {
                    f2501o00oOOo0 = null;
                }
            }
            return null;
        }
    }

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0OO00OO
        public static Drawable o00oOOo0(@oo0oO0 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    @o0OOooO0(21)
    /* renamed from: androidx.core.widget.o00oOo00$o00oOo00  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0016o00oOo00 {
        @o0OO00OO
        public static ColorStateList o00oOOo0(@oo0oO0 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintList();
        }

        @o0OO00OO
        public static PorterDuff.Mode o00oOOoO(@oo0oO0 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintMode();
        }

        public static void o00oOo00(@oo0oO0 CheckedTextView checkedTextView, @o0OO00OO ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        public static void o00oOooO(@oo0oO0 CheckedTextView checkedTextView, @o0OO00OO PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    @o0OO00OO
    public static Drawable o00oOOo0(@oo0oO0 CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkDrawable();
    }

    @o0OO00OO
    public static ColorStateList o00oOOoO(@oo0oO0 CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkTintList();
    }

    @o0OO00OO
    public static PorterDuff.Mode o00oOo00(@oo0oO0 CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkTintMode();
    }

    public static void o00oOo0O(@oo0oO0 CheckedTextView checkedTextView, @o0OO00OO PorterDuff.Mode mode) {
        checkedTextView.setCheckMarkTintMode(mode);
    }

    public static void o00oOooO(@oo0oO0 CheckedTextView checkedTextView, @o0OO00OO ColorStateList colorStateList) {
        checkedTextView.setCheckMarkTintList(colorStateList);
    }
}
