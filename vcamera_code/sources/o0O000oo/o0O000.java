package o0O000oo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Field;
import java.util.Objects;
/* loaded from: classes.dex */
public final class o0O000 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f10495o00oOOo0 = "LayoutInflaterCompatHC";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static Field f10496o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static boolean f10497o00oOo00;

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements LayoutInflater.Factory2 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o0O000O f10498o00oo0O0;

        public o00oOOo0(o0O000O o0o000o) {
            this.f10498o00oo0O0 = o0o000o;
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.f10498o00oo0O0.onCreateView(view, str, context, attributeSet);
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.f10498o00oo0O0.onCreateView(null, str, context, attributeSet);
        }

        @o00oOooO.oo0oO0
        public String toString() {
            return getClass().getName() + "{" + this.f10498o00oo0O0 + "}";
        }
    }

    public static void o00oOOo0(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f10497o00oOo00) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f10496o00oOOoO = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f10497o00oOo00 = true;
        }
        Field field = f10496o00oOOoO;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException unused2) {
                Objects.toString(layoutInflater);
            }
        }
    }

    @Deprecated
    public static o0O000O o00oOOoO(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof o00oOOo0) {
            return ((o00oOOo0) factory).f10498o00oo0O0;
        }
        return null;
    }

    @Deprecated
    public static void o00oOo00(@o00oOooO.oo0oO0 LayoutInflater layoutInflater, @o00oOooO.oo0oO0 o0O000O o0o000o) {
        layoutInflater.setFactory2(new o00oOOo0(o0o000o));
    }

    public static void o00oOooO(@o00oOooO.oo0oO0 LayoutInflater layoutInflater, @o00oOooO.oo0oO0 LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }
}
