package o00ooo0o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;
import o00oOooO.o0O000;
import o00oOooO.o0O00O;
import o00oOooO.o0O00OOO;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0O0o0;
import o00ooo0o.o0O0OO;
import o00oooOo.oOOO000;
import o0ooOoOO.oO0Ooooo;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class o0O0OO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f9741o00oOOo0 = "ResourcesCompat";
    @o0O000

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f9744o00oOo0O = 0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f9742o00oOOoO = new ThreadLocal<>();
    @o00oOooO.o0O0OOOo("sColorStateCacheLock")

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final WeakHashMap<o00oo00O, SparseArray<o00oOoO>> f9743o00oOo00 = new WeakHashMap<>(0);

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final Object f9745o00oOooO = new Object();

    @o0OOooO0(15)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static Drawable o00oOOo0(Resources resources, int i, int i2) {
            return resources.getDrawableForDensity(i, i2);
        }
    }

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o00oOooO.o0O0O0Oo
        public static Drawable o00oOOo0(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        @o00oOooO.o0O0O0Oo
        public static Drawable o00oOOoO(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    @o0OOooO0(23)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o00oOooO.o0O0O0Oo
        public static int o00oOOo0(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        @o00oOooO.o0O0O0Oo
        @oo0oO0
        public static ColorStateList o00oOOoO(@oo0oO0 Resources resources, @o0O00OOO int i, @o0OO00OO Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    @o0OOooO0(29)
    /* loaded from: classes.dex */
    public static class o00oOo0O {
        @o00oOooO.o0O0O0Oo
        public static float o00oOOo0(@oo0oO0 Resources resources, @o00oOooO.o0O00oO0 int i) {
            float f;
            f = resources.getFloat(i);
            return f;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final ColorStateList f9746o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Configuration f9747o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final int f9748o00oOo00;

        public o00oOoO(@oo0oO0 ColorStateList colorStateList, @oo0oO0 Configuration configuration, @o0OO00OO Resources.Theme theme) {
            this.f9746o00oOOo0 = colorStateList;
            this.f9747o00oOOoO = configuration;
            this.f9748o00oOo00 = theme == null ? 0 : theme.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oo0 {
        @oo0oO0
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
        public static Handler getHandler(@o0OO00OO Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public final void callbackFailAsync(final int i, @o0OO00OO Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: o00ooo0o.o0O0OOOo
                @Override // java.lang.Runnable
                public final void run() {
                    o0O0OO.o00oo0.this.lambda$callbackFailAsync$1(i);
                }
            });
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public final void callbackSuccessAsync(@oo0oO0 final Typeface typeface, @o0OO00OO Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: o00ooo0o.o0O0OOO
                @Override // java.lang.Runnable
                public final void run() {
                    o0O0OO.o00oo0.this.lambda$callbackSuccessAsync$0(typeface);
                }
            });
        }

        /* renamed from: onFontRetrievalFailed */
        public abstract void lambda$callbackFailAsync$1(int i);

        /* renamed from: onFontRetrieved */
        public abstract void lambda$callbackSuccessAsync$0(@oo0oO0 Typeface typeface);
    }

    /* loaded from: classes.dex */
    public static final class o00oo00O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Resources f9749o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Resources.Theme f9750o00oOOoO;

        public o00oo00O(@oo0oO0 Resources resources, @o0OO00OO Resources.Theme theme) {
            this.f9749o00oOOo0 = resources;
            this.f9750o00oOOoO = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || o00oo00O.class != obj.getClass()) {
                return false;
            }
            o00oo00O o00oo00o = (o00oo00O) obj;
            return this.f9749o00oOOo0.equals(o00oo00o.f9749o00oOOo0) && oO0Ooooo.o00oOOo0.o00oOOo0(this.f9750o00oOOoO, o00oo00o.f9750o00oOOoO);
        }

        public int hashCode() {
            return oO0Ooooo.o00oOOo0.o00oOOoO(this.f9749o00oOOo0, this.f9750o00oOOoO);
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oo0OO {

        @o0OOooO0(23)
        /* loaded from: classes.dex */
        public static class o00oOOo0 {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public static final Object f9751o00oOOo0 = new Object();

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public static Method f9752o00oOOoO;

            /* renamed from: o00oOo00  reason: collision with root package name */
            public static boolean f9753o00oOo00;

            @SuppressLint({"BanUncheckedReflection"})
            public static void o00oOOo0(@oo0oO0 Resources.Theme theme) {
                synchronized (f9751o00oOOo0) {
                    if (!f9753o00oOo00) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f9752o00oOOoO = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                        }
                        f9753o00oOo00 = true;
                    }
                    Method method = f9752o00oOOoO;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                            f9752o00oOOoO = null;
                        }
                    }
                }
            }
        }

        @o0OOooO0(29)
        /* loaded from: classes.dex */
        public static class o00oOOoO {
            @o00oOooO.o0O0O0Oo
            public static void o00oOOo0(@oo0oO0 Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void o00oOOo0(@oo0oO0 Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                o00oOOoO.o00oOOo0(theme);
            } else {
                o00oOOo0.o00oOOo0(theme);
            }
        }
    }

    public static void o00oOOo0(@oo0oO0 o00oo00O o00oo00o, @o0O00OOO int i, @oo0oO0 ColorStateList colorStateList, @o0OO00OO Resources.Theme theme) {
        synchronized (f9745o00oOooO) {
            WeakHashMap<o00oo00O, SparseArray<o00oOoO>> weakHashMap = f9743o00oOo00;
            SparseArray<o00oOoO> sparseArray = weakHashMap.get(o00oo00o);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(o00oo00o, sparseArray);
            }
            sparseArray.append(i, new o00oOoO(colorStateList, o00oo00o.f9749o00oOOo0.getConfiguration(), theme));
        }
    }

    public static void o00oOOoO(@oo0oO0 Resources.Theme theme) {
        synchronized (f9745o00oOooO) {
            Iterator<o00oo00O> it = f9743o00oOo00.keySet().iterator();
            while (it.hasNext()) {
                o00oo00O next = it.next();
                if (next != null && theme.equals(next.f9750o00oOOoO)) {
                    it.remove();
                }
            }
        }
    }

    @o0OO00OO
    public static ColorStateList o00oOo00(@oo0oO0 o00oo00O o00oo00o, @o0O00OOO int i) {
        o00oOoO o00oooo2;
        Resources.Theme theme;
        synchronized (f9745o00oOooO) {
            SparseArray<o00oOoO> sparseArray = f9743o00oOo00.get(o00oo00o);
            if (sparseArray != null && sparseArray.size() > 0 && (o00oooo2 = sparseArray.get(i)) != null) {
                if (o00oooo2.f9747o00oOOoO.equals(o00oo00o.f9749o00oOOo0.getConfiguration()) && (((theme = o00oo00o.f9750o00oOOoO) == null && o00oooo2.f9748o00oOo00 == 0) || (theme != null && o00oooo2.f9748o00oOo00 == theme.hashCode()))) {
                    return o00oooo2.f9746o00oOOo0;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    @o0O00O
    public static int o00oOo0O(@oo0oO0 Resources resources, @o0O00OOO int i, @o0OO00OO Resources.Theme theme) throws Resources.NotFoundException {
        return o00oOo00.o00oOOo0(resources, i, theme);
    }

    @o0OO00OO
    public static ColorStateList o00oOo0o(@oo0oO0 Resources resources, @o0O00OOO int i, @o0OO00OO Resources.Theme theme) throws Resources.NotFoundException {
        o00oo00O o00oo00o = new o00oo00O(resources, theme);
        ColorStateList o00oOo002 = o00oOo00(o00oo00o, i);
        if (o00oOo002 != null) {
            return o00oOo002;
        }
        ColorStateList o00oo02 = o00oo0(resources, i, theme);
        if (o00oo02 != null) {
            o00oOOo0(o00oo00o, i, o00oo02, theme);
            return o00oo02;
        }
        return o00oOo00.o00oOOoO(resources, i, theme);
    }

    @o0OO00OO
    public static Drawable o00oOoO(@oo0oO0 Resources resources, @o00oOooO.o0O0O0o0 int i, int i2, @o0OO00OO Resources.Theme theme) throws Resources.NotFoundException {
        return o00oOOoO.o00oOOoO(resources, i, i2, theme);
    }

    @o0OO00OO
    public static Drawable o00oOoO0(@oo0oO0 Resources resources, @o00oOooO.o0O0O0o0 int i, @o0OO00OO Resources.Theme theme) throws Resources.NotFoundException {
        return o00oOOoO.o00oOOo0(resources, i, theme);
    }

    public static float o00oOoOO(@oo0oO0 Resources resources, @o00oOooO.o0O00oO0 int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return o00oOo0O.o00oOOo0(resources, i);
        }
        TypedValue o00oo00O2 = o00oo00O();
        resources.getValue(i, o00oo00O2, true);
        if (o00oo00O2.type == 4) {
            return o00oo00O2.getFloat();
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Resource ID #0x");
        o00oOOo02.append(Integer.toHexString(i));
        o00oOOo02.append(" type #0x");
        o00oOOo02.append(Integer.toHexString(o00oo00O2.type));
        o00oOOo02.append(" is not valid");
        throw new Resources.NotFoundException(o00oOOo02.toString());
    }

    @o0OO00OO
    public static Typeface o00oOoOo(@oo0oO0 Context context, @o00oOooO.o0O0OO int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return o00oo0O0(context, i, new TypedValue(), 0, null, null, false, false);
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static Typeface o00oOoo0(@oo0oO0 Context context, @o00oOooO.o0O0OO int i, @oo0oO0 TypedValue typedValue, int i2, @o0OO00OO o00oo0 o00oo0Var) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return o00oo0O0(context, i, typedValue, i2, o00oo0Var, null, true, false);
    }

    @o0OO00OO
    public static Typeface o00oOooO(@oo0oO0 Context context, @o00oOooO.o0O0OO int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return o00oo0O0(context, i, new TypedValue(), 0, null, null, false, true);
    }

    public static void o00oOooo(@oo0oO0 Context context, @o00oOooO.o0O0OO int i, @oo0oO0 o00oo0 o00oo0Var, @o0OO00OO Handler handler) throws Resources.NotFoundException {
        o00oo0Var.getClass();
        if (context.isRestricted()) {
            o00oo0Var.callbackFailAsync(-4, handler);
        } else {
            o00oo0O0(context, i, new TypedValue(), 0, o00oo0Var, handler, false, false);
        }
    }

    @o0OO00OO
    public static ColorStateList o00oo0(Resources resources, int i, @o0OO00OO Resources.Theme theme) {
        if (o00oo0OO(resources, i)) {
            return null;
        }
        try {
            return o0oO0O0o.o00oOOo0(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    @oo0oO0
    public static TypedValue o00oo00O() {
        ThreadLocal<TypedValue> threadLocal = f9742o00oOOoO;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    public static Typeface o00oo0O(@oo0oO0 Context context, Resources resources, @oo0oO0 TypedValue typedValue, int i, int i2, @o0OO00OO o00oo0 o00oo0Var, @o0OO00OO Handler handler, boolean z, boolean z2) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Resource \"");
            o00oOOo02.append(resources.getResourceName(i));
            o00oOOo02.append("\" (");
            o00oOOo02.append(Integer.toHexString(i));
            o00oOOo02.append(") is not a Font: ");
            o00oOOo02.append(typedValue);
            throw new Resources.NotFoundException(o00oOOo02.toString());
        }
        String charSequence2 = charSequence.toString();
        if (!charSequence2.startsWith("res/")) {
            if (o00oo0Var != null) {
                o00oo0Var.callbackFailAsync(-3, handler);
            }
            return null;
        }
        Typeface o00oOoo02 = oOOO000.o00oOoo0(resources, i, charSequence2, typedValue.assetCookie, i2);
        if (o00oOoo02 != null) {
            if (o00oo0Var != null) {
                o00oo0Var.callbackSuccessAsync(o00oOoo02, handler);
            }
            return o00oOoo02;
        } else if (z2) {
            return null;
        } else {
            try {
                if (charSequence2.toLowerCase().endsWith(androidx.appcompat.widget.o00oOo00.f1049o00ooO0)) {
                    o0O0O0o0.o00oOOoO o00oOOoO2 = o0O0O0o0.o00oOOoO(resources.getXml(i), resources);
                    if (o00oOOoO2 == null) {
                        if (o00oo0Var != null) {
                            o00oo0Var.callbackFailAsync(-3, handler);
                        }
                        return null;
                    }
                    return oOOO000.o00oOo0o(context, o00oOOoO2, resources, i, charSequence2, typedValue.assetCookie, i2, o00oo0Var, handler, z);
                }
                Typeface o00oOoO2 = oOOO000.o00oOoO(context, resources, i, charSequence2, typedValue.assetCookie, i2);
                if (o00oo0Var != null) {
                    if (o00oOoO2 != null) {
                        o00oo0Var.callbackSuccessAsync(o00oOoO2, handler);
                    } else {
                        o00oo0Var.callbackFailAsync(-3, handler);
                    }
                }
                return o00oOoO2;
            } catch (IOException | XmlPullParserException unused) {
                if (o00oo0Var != null) {
                    o00oo0Var.callbackFailAsync(-3, handler);
                }
                return null;
            }
        }
    }

    public static Typeface o00oo0O0(@oo0oO0 Context context, int i, @oo0oO0 TypedValue typedValue, int i2, @o0OO00OO o00oo0 o00oo0Var, @o0OO00OO Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface o00oo0O2 = o00oo0O(context, resources, typedValue, i, i2, o00oo0Var, handler, z, z2);
        if (o00oo0O2 == null && o00oo0Var == null && !z2) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Font resource ID #0x");
            o00oOOo02.append(Integer.toHexString(i));
            o00oOOo02.append(" could not be retrieved.");
            throw new Resources.NotFoundException(o00oOOo02.toString());
        }
        return o00oo0O2;
    }

    public static boolean o00oo0OO(@oo0oO0 Resources resources, @o0O00OOO int i) {
        TypedValue o00oo00O2 = o00oo00O();
        resources.getValue(i, o00oo00O2, true);
        int i2 = o00oo00O2.type;
        return i2 >= 28 && i2 <= 31;
    }
}
