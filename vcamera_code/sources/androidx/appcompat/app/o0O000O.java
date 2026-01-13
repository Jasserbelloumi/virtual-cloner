package androidx.appcompat.app;

import android.content.res.Resources;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0O000O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f484o00oOOo0 = "ResourcesFlusher";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static Field f485o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static boolean f486o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static boolean f487o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static Field f488o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static Field f489o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static boolean f490o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static boolean f491o00oOoOO;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static Class<?> f492o00oOooO;

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static void o00oOOo0(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    public static void o00oOOo0(@oo0oO0 Resources resources) {
    }

    @o0OOooO0(21)
    public static void o00oOOoO(@oo0oO0 Resources resources) {
        if (!f486o00oOo00) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f485o00oOOoO = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f486o00oOo00 = true;
        }
        Field field = f485o00oOOoO;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException unused2) {
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    @o0OOooO0(23)
    public static void o00oOo00(@oo0oO0 Resources resources) {
        if (!f486o00oOo00) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f485o00oOOoO = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f486o00oOo00 = true;
        }
        Object obj = null;
        Field field = f485o00oOOoO;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException unused2) {
            }
        }
        if (obj == null) {
            return;
        }
        o00oOo0O(obj);
    }

    @o0OOooO0(16)
    public static void o00oOo0O(@oo0oO0 Object obj) {
        if (!f487o00oOo0O) {
            try {
                f492o00oOooO = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f487o00oOo0O = true;
        }
        Class<?> cls = f492o00oOooO;
        if (cls == null) {
            return;
        }
        if (!f490o00oOoO0) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f488o00oOo0o = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f490o00oOoO0 = true;
        }
        Field field = f488o00oOo0o;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
        }
        if (longSparseArray != null) {
            o00oOOo0.o00oOOo0(longSparseArray);
        }
    }

    @o0OOooO0(24)
    public static void o00oOooO(@oo0oO0 Resources resources) {
        Object obj;
        if (!f491o00oOoOO) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f489o00oOoO = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f491o00oOoOO = true;
        }
        Field field = f489o00oOoO;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException unused2) {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f486o00oOo00) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f485o00oOOoO = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f486o00oOo00 = true;
        }
        Field field2 = f485o00oOOoO;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException unused4) {
            }
        }
        if (obj2 != null) {
            o00oOo0O(obj2);
        }
    }
}
