package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final androidx.collection.o00ooO0<ClassLoader, androidx.collection.o00ooO0<String, Class<?>>> f3022o00oOOo0 = new androidx.collection.o00ooO0<>();

    public static boolean o00oOOoO(@oo0oO0 ClassLoader classLoader, @oo0oO0 String str) {
        try {
            return Fragment.class.isAssignableFrom(o00oOo00(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @oo0oO0
    public static Class<?> o00oOo00(@oo0oO0 ClassLoader classLoader, @oo0oO0 String str) throws ClassNotFoundException {
        androidx.collection.o00ooO0<ClassLoader, androidx.collection.o00ooO0<String, Class<?>>> o00ooo02 = f3022o00oOOo0;
        androidx.collection.o00ooO0<String, Class<?>> o00ooo03 = o00ooo02.get(classLoader);
        if (o00ooo03 == null) {
            o00ooo03 = new androidx.collection.o00ooO0<>();
            o00ooo02.put(classLoader, o00ooo03);
        }
        Class<?> cls = o00ooo03.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            o00ooo03.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    @oo0oO0
    public static Class<? extends Fragment> o00oOooO(@oo0oO0 ClassLoader classLoader, @oo0oO0 String str) {
        try {
            return o00oOo00(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.o00oo(android.support.v4.media.o00oOoO.o00oOOo0("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.o00oo(android.support.v4.media.o00oOoO.o00oOOo0("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    @oo0oO0
    public Fragment o00oOOo0(@oo0oO0 ClassLoader classLoader, @oo0oO0 String str) {
        try {
            return o00oOooO(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new Fragment.o00oo(android.support.v4.media.o00oOoO.o00oOOo0("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new Fragment.o00oo(android.support.v4.media.o00oOoO.o00oOOo0("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment.o00oo(android.support.v4.media.o00oOoO.o00oOOo0("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment.o00oo(android.support.v4.media.o00oOoO.o00oOOo0("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
