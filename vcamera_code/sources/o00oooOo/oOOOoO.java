package o00oooOo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.collection.o00ooO0;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0O0o0;
import o0O000O.o00oo0OO;
@o0OOooO0(24)
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class oOOOoO extends oOOO00o0 {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f9868o00oOo0O = "android.graphics.FontFamily";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f9869o00oOo0o = "addFontWeightStyle";

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final Class<?> f9870o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f9871o00oOoO0 = "createFromFamiliesWithDefault";

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final Constructor<?> f9872o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final Method f9873o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final Method f9874o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f9875o00oOooO = "TypefaceCompatApi24Impl";

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            method2 = null;
        }
        f9872o00oOoOO = constructor;
        f9870o00oOoO = cls;
        f9873o00oOoOo = method2;
        f9874o00oOoo0 = method;
    }

    public static boolean o00oo0O() {
        return f9873o00oOoOo != null;
    }

    public static Typeface o00oo0O0(Object obj) {
        try {
            Object newInstance = Array.newInstance(f9870o00oOoO, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f9874o00oOoo0.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean o00oo0OO(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f9873o00oOoOo.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Object o00oo0Oo() {
        try {
            return f9872o00oOoOO.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // o00oooOo.oOOO00o0
    @o0OO00OO
    public Typeface o00oOOoO(Context context, o0O0O0o0.o00oOo0O o00ooo0o2, Resources resources, int i) {
        o0O0O0o0.o00oOoO[] o00ooooArr;
        Object o00oo0Oo2 = o00oo0Oo();
        if (o00oo0Oo2 == null) {
            return null;
        }
        for (o0O0O0o0.o00oOoO o00oooo2 : o00ooo0o2.f9730o00oOOo0) {
            ByteBuffer o00oOOoO2 = oOOO0O0.o00oOOoO(context, resources, o00oooo2.f9735o00oOo0o);
            if (o00oOOoO2 == null || !o00oo0OO(o00oo0Oo2, o00oOOoO2, o00oooo2.f9734o00oOo0O, o00oooo2.f9732o00oOOoO, o00oooo2.f9733o00oOo00)) {
                return null;
            }
        }
        return o00oo0O0(o00oo0Oo2);
    }

    @Override // o00oooOo.oOOO00o0
    @oo0oO0
    public Typeface o00oOoO0(@oo0oO0 Context context, @oo0oO0 Typeface typeface, int i, boolean z) {
        Typeface typeface2;
        try {
            typeface2 = oOOO0OO0.o00oOOoO(typeface, i, z);
        } catch (RuntimeException unused) {
            typeface2 = null;
        }
        return typeface2 == null ? super.o00oOoO0(context, typeface, i, z) : typeface2;
    }

    @Override // o00oooOo.oOOO00o0
    @o0OO00OO
    public Typeface o00oOooO(Context context, @o0OO00OO CancellationSignal cancellationSignal, @oo0oO0 o00oo0OO.o00oOo00[] o00ooo00Arr, int i) {
        Object o00oo0Oo2 = o00oo0Oo();
        if (o00oo0Oo2 == null) {
            return null;
        }
        o00ooO0 o00ooo02 = new o00ooO0();
        for (o00oo0OO.o00oOo00 o00ooo002 : o00ooo00Arr) {
            Uri o00oOooO2 = o00ooo002.o00oOooO();
            ByteBuffer byteBuffer = (ByteBuffer) o00ooo02.getOrDefault(o00oOooO2, null);
            if (byteBuffer == null) {
                byteBuffer = oOOO0O0.o00oOo0o(context, cancellationSignal, o00oOooO2);
                o00ooo02.put(o00oOooO2, byteBuffer);
            }
            if (byteBuffer == null || !o00oo0OO(o00oo0Oo2, byteBuffer, o00ooo002.o00oOo00(), o00ooo002.o00oOo0O(), o00ooo002.o00oOo0o())) {
                return null;
            }
        }
        Typeface o00oo0O02 = o00oo0O0(o00oo0Oo2);
        if (o00oo0O02 == null) {
            return null;
        }
        return Typeface.create(o00oo0O02, i);
    }
}
