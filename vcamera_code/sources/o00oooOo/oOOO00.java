package o00oooOo;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0O0o0;
import o0O000O.o00oo0OO;
@o0OOooO0(26)
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class oOOO00 extends oOOO000o {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final String f9807o00oo = "addFontFromBuffer";

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final String f9808o00oo0o = "TypefaceCompatApi26Impl";

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final String f9809o00oo0oO = "android.graphics.FontFamily";

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final String f9810o00ooO0 = "freeze";

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final String f9811o00ooO00 = "createFromFamiliesWithDefault";

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final String f9812o00ooO0O = "abortCreation";

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f9813o00ooO0o = -1;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final String f9814o0O0o = "addFontFromAssetManager";

    /* renamed from: o00oo0  reason: collision with root package name */
    public final Constructor<?> f9815o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public final Class<?> f9816o00oo00O;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Method f9817o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Method f9818o00oo0O0;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public final Method f9819o00oo0OO;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final Method f9820o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final Method f9821o00oo0o0;

    public oOOO00() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> o00ooOO02 = o00ooOO0();
            constructor = o00ooOO(o00ooOO02);
            method2 = o00ooO0O(o00ooOO02);
            method3 = o00ooO0o(o00ooOO02);
            method4 = o00ooOOo(o00ooOO02);
            method5 = o00ooO0(o00ooOO02);
            method = o00ooO(o00ooOO02);
            cls = o00ooOO02;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f9816o00oo00O = cls;
        this.f9815o00oo0 = constructor;
        this.f9819o00oo0OO = method2;
        this.f9818o00oo0O0 = method3;
        this.f9817o00oo0O = method4;
        this.f9820o00oo0Oo = method5;
        this.f9821o00oo0o0 = method;
    }

    @o0OO00OO
    private Object o00oo0o0() {
        try {
            return this.f9815o00oo0.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // o00oooOo.oOOO000o, o00oooOo.oOOO00o0
    @o0OO00OO
    public Typeface o00oOOoO(Context context, o0O0O0o0.o00oOo0O o00ooo0o2, Resources resources, int i) {
        o0O0O0o0.o00oOoO[] o00ooooArr;
        if (o00ooO00()) {
            Object o00oo0o02 = o00oo0o0();
            if (o00oo0o02 == null) {
                return null;
            }
            for (o0O0O0o0.o00oOoO o00oooo2 : o00ooo0o2.f9730o00oOOo0) {
                if (!o00oo0oO(context, o00oo0o02, o00oooo2.f9731o00oOOo0, o00oooo2.f9734o00oOo0O, o00oooo2.f9732o00oOOoO, o00oooo2.f9733o00oOo00 ? 1 : 0, FontVariationAxis.fromFontVariationSettings(o00oooo2.f9736o00oOooO))) {
                    o00oo0o(o00oo0o02);
                    return null;
                }
            }
            if (o00oo(o00oo0o02)) {
                return o00oo0O0(o00oo0o02);
            }
            return null;
        }
        return super.o00oOOoO(context, o00ooo0o2, resources, i);
    }

    @Override // o00oooOo.oOOO00o0
    @o0OO00OO
    public Typeface o00oOo0o(Context context, Resources resources, int i, String str, int i2) {
        if (o00ooO00()) {
            Object o00oo0o02 = o00oo0o0();
            if (o00oo0o02 == null) {
                return null;
            }
            if (!o00oo0oO(context, o00oo0o02, str, 0, -1, -1, null)) {
                o00oo0o(o00oo0o02);
                return null;
            } else if (o00oo(o00oo0o02)) {
                return o00oo0O0(o00oo0o02);
            } else {
                return null;
            }
        }
        return super.o00oOo0o(context, resources, i, str, i2);
    }

    @Override // o00oooOo.oOOO000o, o00oooOo.oOOO00o0
    @oo0oO0
    public Typeface o00oOoO0(@oo0oO0 Context context, @oo0oO0 Typeface typeface, int i, boolean z) {
        Typeface typeface2;
        try {
            typeface2 = oOOO0OO.o00oOOoO(typeface, i, z);
        } catch (RuntimeException unused) {
            typeface2 = null;
        }
        return typeface2 == null ? super.o00oOoO0(context, typeface, i, z) : typeface2;
    }

    @Override // o00oooOo.oOOO000o, o00oooOo.oOOO00o0
    @o0OO00OO
    public Typeface o00oOooO(Context context, @o0OO00OO CancellationSignal cancellationSignal, @oo0oO0 o00oo0OO.o00oOo00[] o00ooo00Arr, int i) {
        Typeface o00oo0O02;
        if (o00ooo00Arr.length < 1) {
            return null;
        }
        if (!o00ooO00()) {
            o00oo0OO.o00oOo00 o00oOooo2 = o00oOooo(o00ooo00Arr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(o00oOooo2.o00oOooO(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(o00oOooo2.o00oOo0O()).setItalic(o00oOooo2.o00oOo0o()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> o00oOoO2 = oOOO0O0.o00oOoO(context, o00ooo00Arr, cancellationSignal);
        Object o00oo0o02 = o00oo0o0();
        if (o00oo0o02 == null) {
            return null;
        }
        boolean z = false;
        for (o00oo0OO.o00oOo00 o00ooo002 : o00ooo00Arr) {
            ByteBuffer byteBuffer = o00oOoO2.get(o00ooo002.o00oOooO());
            if (byteBuffer != null) {
                if (!o0O0o(o00oo0o02, byteBuffer, o00ooo002.o00oOo00(), o00ooo002.o00oOo0O(), o00ooo002.o00oOo0o() ? 1 : 0)) {
                    o00oo0o(o00oo0o02);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            o00oo0o(o00oo0o02);
            return null;
        } else if (o00oo(o00oo0o02) && (o00oo0O02 = o00oo0O0(o00oo0o02)) != null) {
            return Typeface.create(o00oo0O02, i);
        } else {
            return null;
        }
    }

    public final boolean o00oo(Object obj) {
        try {
            return ((Boolean) this.f9817o00oo0O.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @o0OO00OO
    public Typeface o00oo0O0(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f9816o00oo00O, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f9821o00oo0o0.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void o00oo0o(Object obj) {
        try {
            this.f9820o00oo0Oo.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean o00oo0oO(Context context, Object obj, String str, int i, int i2, int i3, @o0OO00OO FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f9819o00oo0OO.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method o00ooO(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Method o00ooO0(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f9812o00ooO0O, new Class[0]);
    }

    public final boolean o00ooO00() {
        return this.f9819o00oo0OO != null;
    }

    public Method o00ooO0O(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(f9814o0O0o, AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method o00ooO0o(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(f9807o00oo, ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Constructor<?> o00ooOO(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    public Class<?> o00ooOO0() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    public Method o00ooOOo(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f9810o00ooO0, new Class[0]);
    }

    public final boolean o0O0o(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f9818o00oo0O0.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
