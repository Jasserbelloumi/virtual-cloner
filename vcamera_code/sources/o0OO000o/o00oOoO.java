package o0OO000o;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes2.dex */
public class o00oOoO {

    /* loaded from: classes2.dex */
    public static class o00oOOo0<T> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f12965o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public Field f12966o00oOOoO;

        public o00oOOo0(Class cls, boolean z, String str) {
            this.f12965o00oOOo0 = z;
            Field o00oOOo02 = o00oOoO.o00oOOo0(cls, z, str);
            this.f12966o00oOOoO = o00oOOo02;
            if (o00oOOo02 != null) {
                o00oOOo02.setAccessible(true);
            }
        }

        public o00oOOo0(String str, boolean z, String str2) {
            try {
                this.f12966o00oOOoO = o00oOoO.o00oOOo0(Class.forName(str), z, str2);
            } catch (ClassNotFoundException unused) {
            }
            this.f12965o00oOOo0 = z;
            Field field = this.f12966o00oOOoO;
            if (field != null) {
                field.setAccessible(true);
            }
        }

        public T o00oOOo0(Object obj) {
            try {
                return (T) this.f12966o00oOOoO.get(obj);
            } catch (Exception unused) {
                return null;
            }
        }

        public boolean o00oOOoO() {
            return this.f12966o00oOOoO != null;
        }

        public void o00oOo00(Object obj, T t) {
            try {
                this.f12966o00oOOoO.set(obj, t);
            } catch (Exception unused) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class o00oOOoO<T> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Method f12967o00oOOo0;

        public o00oOOoO(Class cls, boolean z, String str, Class[] clsArr) {
            Method o00oOOoO2 = o00oOoO.o00oOOoO(cls, z, str, clsArr);
            this.f12967o00oOOo0 = o00oOOoO2;
            if (o00oOOoO2 != null) {
                o00oOOoO2.setAccessible(true);
            }
        }

        public o00oOOoO(String str, boolean z, String str2, Class[] clsArr) {
            try {
                this.f12967o00oOOo0 = o00oOoO.o00oOOoO(Class.forName(str), z, str2, clsArr);
            } catch (Exception unused) {
            }
            Method method = this.f12967o00oOOo0;
            if (method != null) {
                method.setAccessible(true);
            }
        }

        public T o00oOOo0(Object obj, Object... objArr) {
            try {
                return (T) this.f12967o00oOOo0.invoke(obj, objArr);
            } catch (Exception unused) {
                return null;
            }
        }

        public boolean o00oOOoO() {
            return this.f12967o00oOOo0 != null;
        }
    }

    public static Field o00oOOo0(Class cls, boolean z, String str) {
        if (cls != null && str != null) {
            try {
                return cls.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
            }
        }
        return null;
    }

    public static Method o00oOOoO(Class cls, boolean z, String str, Class[] clsArr) {
        if (cls != null && str != null) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
            }
        }
        return null;
    }
}
