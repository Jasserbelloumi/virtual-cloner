package o0Oo0oO;

import android.support.v4.media.o00oOo0O;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes3.dex */
public class oO000O0O<T> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Class<?> f16620o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final String f16621o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Class[] f16622o00oOo00;

    public oO000O0O(Class<?> cls, String str, Class... clsArr) {
        this.f16620o00oOOo0 = cls;
        this.f16621o00oOOoO = str;
        this.f16622o00oOo00 = clsArr;
    }

    public static Method o00oOOoO(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    public final Method o00oOOo0(Class<?> cls) {
        Class<?> cls2;
        String str = this.f16621o00oOOoO;
        if (str != null) {
            Method o00oOOoO2 = o00oOOoO(cls, str, this.f16622o00oOo00);
            if (o00oOOoO2 == null || (cls2 = this.f16620o00oOOo0) == null || cls2.isAssignableFrom(o00oOOoO2.getReturnType())) {
                return o00oOOoO2;
            }
            return null;
        }
        return null;
    }

    public Object o00oOo00(T t, Object... objArr) throws InvocationTargetException {
        Method o00oOOo02 = o00oOOo0(t.getClass());
        if (o00oOOo02 == null) {
            StringBuilder o00oOOo03 = o00oOo0O.o00oOOo0("Method ");
            o00oOOo03.append(this.f16621o00oOOoO);
            o00oOOo03.append(" not supported for object ");
            o00oOOo03.append(t);
            throw new AssertionError(o00oOOo03.toString());
        }
        try {
            return o00oOOo02.invoke(t, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + o00oOOo02);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    public Object o00oOo0O(T t, Object... objArr) {
        try {
            return o00oOooO(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object o00oOo0o(T t, Object... objArr) {
        try {
            return o00oOo00(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public boolean o00oOoO0(T t) {
        return o00oOOo0(t.getClass()) != null;
    }

    public Object o00oOooO(T t, Object... objArr) throws InvocationTargetException {
        Method o00oOOo02 = o00oOOo0(t.getClass());
        if (o00oOOo02 == null) {
            return null;
        }
        try {
            return o00oOOo02.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }
}
