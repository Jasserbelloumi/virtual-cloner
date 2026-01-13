package o00oooOo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0O0o0;
import o0O000O.o00oo0OO;
@o0OOooO0(21)
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class oOOO000o extends oOOO00o0 {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f9825o00oOo0O = "android.graphics.FontFamily";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f9826o00oOo0o = "addFontWeightStyle";

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static Class<?> f9827o00oOoO = null;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f9828o00oOoO0 = "createFromFamiliesWithDefault";

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static Constructor<?> f9829o00oOoOO = null;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static Method f9830o00oOoOo = null;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static Method f9831o00oOoo0 = null;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f9832o00oOooO = "TypefaceCompatApi21Impl";

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static boolean f9833o00oOooo;

    public static Typeface o00oo0O0(Object obj) {
        o00oo0Oo();
        try {
            Object newInstance = Array.newInstance(f9827o00oOoO, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f9831o00oOoo0.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean o00oo0OO(Object obj, String str, int i, boolean z) {
        o00oo0Oo();
        try {
            return ((Boolean) f9830o00oOoOo.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void o00oo0Oo() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f9833o00oOooo) {
            return;
        }
        f9833o00oOooo = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        f9829o00oOoOO = constructor;
        f9827o00oOoO = cls;
        f9830o00oOoOo = method2;
        f9831o00oOoo0 = method;
    }

    public static Object o00oo0o0() {
        o00oo0Oo();
        try {
            return f9829o00oOoOO.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // o00oooOo.oOOO00o0
    public Typeface o00oOOoO(Context context, o0O0O0o0.o00oOo0O o00ooo0o2, Resources resources, int i) {
        o0O0O0o0.o00oOoO[] o00ooooArr;
        Object o00oo0o02 = o00oo0o0();
        for (o0O0O0o0.o00oOoO o00oooo2 : o00ooo0o2.f9730o00oOOo0) {
            File o00oOo0O2 = oOOO0O0.o00oOo0O(context);
            if (o00oOo0O2 == null) {
                return null;
            }
            try {
                if (!oOOO0O0.o00oOo00(o00oOo0O2, resources, o00oooo2.f9735o00oOo0o)) {
                    return null;
                }
                if (!o00oo0OO(o00oo0o02, o00oOo0O2.getPath(), o00oooo2.f9732o00oOOoO, o00oooo2.f9733o00oOo00)) {
                    return null;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                o00oOo0O2.delete();
            }
        }
        return o00oo0O0(o00oo0o02);
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
    public Typeface o00oOooO(Context context, CancellationSignal cancellationSignal, @oo0oO0 o00oo0OO.o00oOo00[] o00ooo00Arr, int i) {
        if (o00ooo00Arr.length < 1) {
            return null;
        }
        o00oo0OO.o00oOo00 o00oOooo2 = o00oOooo(o00ooo00Arr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(o00oOooo2.o00oOooO(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File o00oo0O2 = o00oo0O(openFileDescriptor);
            if (o00oo0O2 != null && o00oo0O2.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(o00oo0O2);
                openFileDescriptor.close();
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface o00oOo0O2 = super.o00oOo0O(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return o00oOo0O2;
        } catch (IOException unused) {
            return null;
        }
    }

    public final File o00oo0O(@oo0oO0 ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
