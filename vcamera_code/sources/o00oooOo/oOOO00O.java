package o00oooOo;

import android.content.Context;
import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(28)
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class oOOO00O extends oOOO00 {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final String f9834o00ooO = "createFromFamiliesWithDefault";

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final String f9835o00ooOO = "sans-serif";

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f9836o00ooOO0 = -1;

    @Override // o00oooOo.oOOO00, o00oooOo.oOOO000o, o00oooOo.oOOO00o0
    @oo0oO0
    public Typeface o00oOoO0(@oo0oO0 Context context, @oo0oO0 Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    @Override // o00oooOo.oOOO00
    public Typeface o00oo0O0(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f9816o00oo00O, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f9821o00oo0o0.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // o00oooOo.oOOO00
    public Method o00ooO(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
