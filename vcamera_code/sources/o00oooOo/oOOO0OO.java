package o00oooOo;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.collection.o00oo0OO;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(26)
@SuppressLint({"SoonBlockedPrivateApi"})
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class oOOO0OO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f9850o00oOOo0 = "WeightTypeface";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f9851o00oOOoO = "native_instance";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f9852o00oOo00 = "nativeCreateFromTypefaceWithExactStyle";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final Method f9853o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final Constructor<Typeface> f9854o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final Object f9855o00oOoO;
    @o0O0OOOo("sWeightCacheLock")

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final o00oo0OO<SparseArray<Typeface>> f9856o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final Field f9857o00oOooO;

    static {
        Method method;
        Constructor<Typeface> constructor;
        Field field = null;
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            method = Typeface.class.getDeclaredMethod(f9852o00oOo00, cls, Integer.TYPE, Boolean.TYPE);
            method.setAccessible(true);
            constructor = Typeface.class.getDeclaredConstructor(cls);
            constructor.setAccessible(true);
            field = declaredField;
        } catch (NoSuchFieldException | NoSuchMethodException unused) {
            method = null;
            constructor = null;
        }
        f9857o00oOooO = field;
        f9853o00oOo0O = method;
        f9854o00oOo0o = constructor;
        f9856o00oOoO0 = new o00oo0OO<>(3);
        f9855o00oOoO = new Object();
    }

    @o0OO00OO
    public static Typeface o00oOOo0(long j) {
        try {
            return f9854o00oOo0o.newInstance(Long.valueOf(j));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @o0OO00OO
    public static Typeface o00oOOoO(@oo0oO0 Typeface typeface, int i, boolean z) {
        if (o00oOooO()) {
            int i2 = (i << 1) | (z ? 1 : 0);
            synchronized (f9855o00oOoO) {
                long o00oOo002 = o00oOo00(typeface);
                o00oo0OO<SparseArray<Typeface>> o00oo0oo = f9856o00oOoO0;
                SparseArray<Typeface> o00oOooo2 = o00oo0oo.o00oOooo(o00oOo002);
                if (o00oOooo2 == null) {
                    o00oOooo2 = new SparseArray<>(4);
                    o00oo0oo.o00oo0Oo(o00oOo002, o00oOooo2);
                } else {
                    Typeface typeface2 = o00oOooo2.get(i2);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                Typeface o00oOOo02 = o00oOOo0(o00oOo0O(o00oOo002, i, z));
                o00oOooo2.put(i2, o00oOOo02);
                return o00oOOo02;
            }
        }
        return null;
    }

    public static long o00oOo00(@oo0oO0 Typeface typeface) {
        try {
            return f9857o00oOooO.getLong(typeface);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static long o00oOo0O(long j, int i, boolean z) {
        try {
            return ((Long) f9853o00oOo0O.invoke(null, Long.valueOf(j), Integer.valueOf(i), Boolean.valueOf(z))).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static boolean o00oOooO() {
        return f9857o00oOooO != null;
    }
}
