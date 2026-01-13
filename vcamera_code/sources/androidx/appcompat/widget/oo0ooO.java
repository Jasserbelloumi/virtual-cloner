package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.appcompat.resources.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import o00oOoO.o00oOOo0;
import o00oOooO.o0OO0oO;
import o00oooo0.o0O0O0Oo;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class oo0ooO {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f1572o00oOoO = "ResourceManagerInternal";

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final boolean f1573o00oOoOO = false;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final String f1575o00oOoo0 = "appcompat_skip_skip";

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final String f1576o00oOooo = "android.graphics.drawable.VectorDrawable";

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static oo0ooO f1578o00oo00O;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public WeakHashMap<Context, androidx.collection.o00ooO<ColorStateList>> f1579o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public androidx.collection.o00ooO0<String, o00oOoO> f1580o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public androidx.collection.o00ooO<String> f1581o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public TypedValue f1582o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f1583o00oOo0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public o00oo00O f1584o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final WeakHashMap<Context, androidx.collection.o00oo0OO<WeakReference<Drawable.ConstantState>>> f1585o00oOooO = new WeakHashMap<>(0);

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final PorterDuff.Mode f1574o00oOoOo = PorterDuff.Mode.SRC_IN;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final o00oOo00 f1577o00oo0 = new o00oOo00(6);

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements o00oOoO {
        @Override // androidx.appcompat.widget.oo0ooO.o00oOoO
        public Drawable o00oOOo0(@o00oOooO.oo0oO0 Context context, @o00oOooO.oo0oO0 XmlPullParser xmlPullParser, @o00oOooO.oo0oO0 AttributeSet attributeSet, @o00oOooO.o0OO00OO Resources.Theme theme) {
            try {
                return o00oOoO0.o00oOOoO.o00ooOO0(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO implements o00oOoO {
        @Override // androidx.appcompat.widget.oo0ooO.o00oOoO
        public Drawable o00oOOo0(@o00oOooO.oo0oO0 Context context, @o00oOooO.oo0oO0 XmlPullParser xmlPullParser, @o00oOooO.oo0oO0 AttributeSet attributeSet, @o00oOooO.o0OO00OO Resources.Theme theme) {
            try {
                return o0O0Oo.o0O0OOO.o00oOo00(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 extends androidx.collection.o00oo0O<Integer, PorterDuffColorFilter> {
        public o00oOo00(int i) {
            super(i);
        }

        public static int o00oOOo0(int i, PorterDuff.Mode mode) {
            return mode.hashCode() + ((i + 31) * 31);
        }

        public PorterDuffColorFilter o00oOOoO(int i, PorterDuff.Mode mode) {
            return get(Integer.valueOf(o00oOOo0(i, mode)));
        }

        public PorterDuffColorFilter o00oOo00(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(o00oOOo0(i, mode)), porterDuffColorFilter);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O implements o00oOoO {
        @Override // androidx.appcompat.widget.oo0ooO.o00oOoO
        public Drawable o00oOOo0(@o00oOooO.oo0oO0 Context context, @o00oOooO.oo0oO0 XmlPullParser xmlPullParser, @o00oOooO.oo0oO0 AttributeSet attributeSet, @o00oOooO.o0OO00OO Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) o00oOo0O.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    o00oOOo0.o00oOo00.o00oOo00(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOoO {
        Drawable o00oOOo0(@o00oOooO.oo0oO0 Context context, @o00oOooO.oo0oO0 XmlPullParser xmlPullParser, @o00oOooO.oo0oO0 AttributeSet attributeSet, @o00oOooO.o0OO00OO Resources.Theme theme);
    }

    /* loaded from: classes.dex */
    public static class o00oo0 implements o00oOoO {
        @Override // androidx.appcompat.widget.oo0ooO.o00oOoO
        public Drawable o00oOOo0(@o00oOooO.oo0oO0 Context context, @o00oOooO.oo0oO0 XmlPullParser xmlPullParser, @o00oOooO.oo0oO0 AttributeSet attributeSet, @o00oOooO.o0OO00OO Resources.Theme theme) {
            try {
                return o0O0Oo.o0O0o00O.o00oOo00(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface o00oo00O {
        @o00oOooO.o0OO00OO
        Drawable o00oOOo0(@o00oOooO.oo0oO0 oo0ooO oo0ooo, @o00oOooO.oo0oO0 Context context, @o00oOooO.o0O0O0o0 int i);

        @o00oOooO.o0OO00OO
        ColorStateList o00oOOoO(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0O0O0o0 int i);

        boolean o00oOo00(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0O0O0o0 int i, @o00oOooO.oo0oO0 Drawable drawable);

        boolean o00oOo0O(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0O0O0o0 int i, @o00oOooO.oo0oO0 Drawable drawable);

        @o00oOooO.o0OO00OO
        PorterDuff.Mode o00oOooO(int i);
    }

    public static long o00oOo0O(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    public static synchronized oo0ooO o00oOoO() {
        oo0ooO oo0ooo;
        synchronized (oo0ooO.class) {
            if (f1578o00oo00O == null) {
                f1578o00oo00O = new oo0ooO();
            }
            oo0ooo = f1578o00oo00O;
        }
        return oo0ooo;
    }

    public static PorterDuffColorFilter o00oOoO0(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return o00oOooo(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized PorterDuffColorFilter o00oOooo(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter o00oOOoO2;
        synchronized (oo0ooO.class) {
            o00oOo00 o00ooo002 = f1577o00oo0;
            o00oOOoO2 = o00ooo002.o00oOOoO(i, mode);
            if (o00oOOoO2 == null) {
                o00oOOoO2 = new PorterDuffColorFilter(i, mode);
                o00ooo002.o00oOo00(i, mode, o00oOOoO2);
            }
        }
        return o00oOOoO2;
    }

    public static void o00oo(Drawable drawable, o0OO o0oo, int[] iArr) {
        int[] state = drawable.getState();
        if (o0O0OOOo.o00oOOo0(drawable)) {
            if (!(drawable.mutate() == drawable)) {
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = o0oo.f1261o00oOooO;
        if (z || o0oo.f1260o00oOo00) {
            drawable.setColorFilter(o00oOoO0(z ? o0oo.f1258o00oOOo0 : null, o0oo.f1260o00oOo00 ? o0oo.f1259o00oOOoO : f1574o00oOoOo, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public static boolean o00oo0O(@o00oOooO.oo0oO0 Drawable drawable) {
        return (drawable instanceof o0O0Oo.o0O0o00O) || f1576o00oOooo.equals(drawable.getClass().getName());
    }

    public static void o00oo0O0(@o00oOooO.oo0oO0 oo0ooO oo0ooo) {
    }

    public final void o00oOOo0(@o00oOooO.oo0oO0 String str, @o00oOooO.oo0oO0 o00oOoO o00oooo2) {
        if (this.f1580o00oOOoO == null) {
            this.f1580o00oOOoO = new androidx.collection.o00ooO0<>();
        }
        this.f1580o00oOOoO.put(str, o00oooo2);
    }

    public final synchronized boolean o00oOOoO(@o00oOooO.oo0oO0 Context context, long j, @o00oOooO.oo0oO0 Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            androidx.collection.o00oo0OO<WeakReference<Drawable.ConstantState>> o00oo0oo = this.f1585o00oOooO.get(context);
            if (o00oo0oo == null) {
                o00oo0oo = new androidx.collection.o00oo0OO<>();
                this.f1585o00oOooO.put(context, o00oo0oo);
            }
            o00oo0oo.o00oo0Oo(j, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final void o00oOo00(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0O0O0o0 int i, @o00oOooO.oo0oO0 ColorStateList colorStateList) {
        if (this.f1579o00oOOo0 == null) {
            this.f1579o00oOOo0 = new WeakHashMap<>();
        }
        androidx.collection.o00ooO<ColorStateList> o00ooo = this.f1579o00oOOo0.get(context);
        if (o00ooo == null) {
            o00ooo = new androidx.collection.o00ooO<>();
            this.f1579o00oOOo0.put(context, o00ooo);
        }
        o00ooo.o00oOOoO(i, colorStateList);
    }

    public final Drawable o00oOo0o(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0O0O0o0 int i) {
        if (this.f1582o00oOo0O == null) {
            this.f1582o00oOo0O = new TypedValue();
        }
        TypedValue typedValue = this.f1582o00oOo0O;
        context.getResources().getValue(i, typedValue, true);
        long o00oOo0O2 = o00oOo0O(typedValue);
        Drawable o00oOoOO2 = o00oOoOO(context, o00oOo0O2);
        if (o00oOoOO2 != null) {
            return o00oOoOO2;
        }
        o00oo00O o00oo00o = this.f1584o00oOoO0;
        Drawable o00oOOo02 = o00oo00o == null ? null : o00oo00o.o00oOOo0(this, context, i);
        if (o00oOOo02 != null) {
            o00oOOo02.setChangingConfigurations(typedValue.changingConfigurations);
            o00oOOoO(context, o00oOo0O2, o00oOOo02);
        }
        return o00oOOo02;
    }

    public final synchronized Drawable o00oOoOO(@o00oOooO.oo0oO0 Context context, long j) {
        androidx.collection.o00oo0OO<WeakReference<Drawable.ConstantState>> o00oo0oo = this.f1585o00oOooO.get(context);
        if (o00oo0oo == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> o00oOooo2 = o00oo0oo.o00oOooo(j);
        if (o00oOooo2 != null) {
            Drawable.ConstantState constantState = o00oOooo2.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            o00oo0oo.o00oo0oO(j);
        }
        return null;
    }

    public synchronized Drawable o00oOoOo(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0O0O0o0 int i) {
        return o00oOoo0(context, i, false);
    }

    public synchronized Drawable o00oOoo0(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0O0O0o0 int i, boolean z) {
        Drawable o00oo0Oo2;
        o00oOooO(context);
        o00oo0Oo2 = o00oo0Oo(context, i);
        if (o00oo0Oo2 == null) {
            o00oo0Oo2 = o00oOo0o(context, i);
        }
        if (o00oo0Oo2 == null) {
            o00oo0Oo2 = o00ooo0.o0.getDrawable(context, i);
        }
        if (o00oo0Oo2 != null) {
            o00oo0Oo2 = o0O0o(context, i, z, o00oo0Oo2);
        }
        if (o00oo0Oo2 != null) {
            o0O0OOOo.o00oOOoO(o00oo0Oo2);
        }
        return o00oo0Oo2;
    }

    public final void o00oOooO(@o00oOooO.oo0oO0 Context context) {
        if (this.f1583o00oOo0o) {
            return;
        }
        this.f1583o00oOo0o = true;
        Drawable o00oOoOo2 = o00oOoOo(context, R.drawable.abc_vector_test);
        if (o00oOoOo2 == null || !o00oo0O(o00oOoOo2)) {
            this.f1583o00oOo0o = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public final ColorStateList o00oo0(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0O0O0o0 int i) {
        androidx.collection.o00ooO<ColorStateList> o00ooo;
        WeakHashMap<Context, androidx.collection.o00ooO<ColorStateList>> weakHashMap = this.f1579o00oOOo0;
        if (weakHashMap == null || (o00ooo = weakHashMap.get(context)) == null) {
            return null;
        }
        return o00ooo.o00oOooo(i);
    }

    public synchronized ColorStateList o00oo00O(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0O0O0o0 int i) {
        ColorStateList o00oo02;
        o00oo02 = o00oo0(context, i);
        if (o00oo02 == null) {
            o00oo00O o00oo00o = this.f1584o00oOoO0;
            o00oo02 = o00oo00o == null ? null : o00oo00o.o00oOOoO(context, i);
            if (o00oo02 != null) {
                o00oOo00(context, i, o00oo02);
            }
        }
        return o00oo02;
    }

    public PorterDuff.Mode o00oo0OO(int i) {
        o00oo00O o00oo00o = this.f1584o00oOoO0;
        if (o00oo00o == null) {
            return null;
        }
        return o00oo00o.o00oOooO(i);
    }

    public final Drawable o00oo0Oo(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0O0O0o0 int i) {
        int next;
        androidx.collection.o00ooO0<String, o00oOoO> o00ooo02 = this.f1580o00oOOoO;
        if (o00ooo02 == null || o00ooo02.isEmpty()) {
            return null;
        }
        androidx.collection.o00ooO<String> o00ooo = this.f1581o00oOo00;
        if (o00ooo != null) {
            String o00oOooo2 = o00ooo.o00oOooo(i);
            if (f1575o00oOoo0.equals(o00oOooo2) || (o00oOooo2 != null && this.f1580o00oOOoO.get(o00oOooo2) == null)) {
                return null;
            }
        } else {
            this.f1581o00oOo00 = new androidx.collection.o00ooO<>();
        }
        if (this.f1582o00oOo0O == null) {
            this.f1582o00oOo0O = new TypedValue();
        }
        TypedValue typedValue = this.f1582o00oOo0O;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long o00oOo0O2 = o00oOo0O(typedValue);
        Drawable o00oOoOO2 = o00oOoOO(context, o00oOo0O2);
        if (o00oOoOO2 != null) {
            return o00oOoOO2;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(androidx.appcompat.widget.o00oOo00.f1049o00ooO0)) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1581o00oOo00.o00oOOoO(i, name);
                o00oOoO o00oooo2 = this.f1580o00oOOoO.get(name);
                if (o00oooo2 != null) {
                    o00oOoOO2 = o00oooo2.o00oOOo0(context, xml, asAttributeSet, context.getTheme());
                }
                if (o00oOoOO2 != null) {
                    o00oOoOO2.setChangingConfigurations(typedValue.changingConfigurations);
                    o00oOOoO(context, o00oOo0O2, o00oOoOO2);
                }
            } catch (Exception unused) {
            }
        }
        if (o00oOoOO2 == null) {
            this.f1581o00oOo00.o00oOOoO(i, f1575o00oOoo0);
        }
        return o00oOoOO2;
    }

    public synchronized Drawable o00oo0o(@o00oOooO.oo0oO0 Context context, @o00oOooO.oo0oO0 ooo0Oo0 ooo0oo0, @o00oOooO.o0O0O0o0 int i) {
        Drawable o00oo0Oo2 = o00oo0Oo(context, i);
        if (o00oo0Oo2 == null) {
            o00oo0Oo2 = ooo0oo0.o00oOOo0(i);
        }
        if (o00oo0Oo2 != null) {
            return o0O0o(context, i, false, o00oo0Oo2);
        }
        return null;
    }

    public synchronized void o00oo0o0(@o00oOooO.oo0oO0 Context context) {
        androidx.collection.o00oo0OO<WeakReference<Drawable.ConstantState>> o00oo0oo = this.f1585o00oOooO.get(context);
        if (o00oo0oo != null) {
            o00oo0oo.o00oOo00();
        }
    }

    public synchronized void o00oo0oO(o00oo00O o00oo00o) {
        this.f1584o00oOoO0 = o00oo00o;
    }

    public boolean o00ooO00(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0O0O0o0 int i, @o00oOooO.oo0oO0 Drawable drawable) {
        o00oo00O o00oo00o = this.f1584o00oOoO0;
        return o00oo00o != null && o00oo00o.o00oOo00(context, i, drawable);
    }

    public final Drawable o0O0o(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0O0O0o0 int i, boolean z, @o00oOooO.oo0oO0 Drawable drawable) {
        ColorStateList o00oo00O2 = o00oo00O(context, i);
        if (o00oo00O2 == null) {
            o00oo00O o00oo00o = this.f1584o00oOoO0;
            if ((o00oo00o == null || !o00oo00o.o00oOo0O(context, i, drawable)) && !o00ooO00(context, i, drawable) && z) {
                return null;
            }
            return drawable;
        }
        if (o0O0OOOo.o00oOOo0(drawable)) {
            drawable = drawable.mutate();
        }
        o0O0O0Oo.o00oOOoO.o00oOoO(drawable, o00oo00O2);
        PorterDuff.Mode o00oo0OO2 = o00oo0OO(i);
        if (o00oo0OO2 != null) {
            o0O0O0Oo.o00oOOoO.o00oOoOO(drawable, o00oo0OO2);
            return drawable;
        }
        return drawable;
    }
}
