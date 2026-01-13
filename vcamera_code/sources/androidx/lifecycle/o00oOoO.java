package androidx.lifecycle;

import androidx.lifecycle.o0O00;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Deprecated
/* loaded from: classes.dex */
public final class o00oOoO {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static o00oOoO f3288o00oOo00 = new o00oOoO();

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f3289o00oOo0O = 1;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f3290o00oOo0o = 2;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f3291o00oOooO = 0;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Map<Class<?>, o00oOOo0> f3292o00oOOo0 = new HashMap();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Map<Class<?>, Boolean> f3293o00oOOoO = new HashMap();

    @Deprecated
    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Map<o0O00.o00oOOo0, List<o00oOOoO>> f3294o00oOOo0 = new HashMap();

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Map<o00oOOoO, o0O00.o00oOOo0> f3295o00oOOoO;

        public o00oOOo0(Map<o00oOOoO, o0O00.o00oOOo0> map) {
            this.f3295o00oOOoO = map;
            for (Map.Entry<o00oOOoO, o0O00.o00oOOo0> entry : map.entrySet()) {
                o0O00.o00oOOo0 value = entry.getValue();
                List<o00oOOoO> list = this.f3294o00oOOo0.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f3294o00oOOo0.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        public static void o00oOOoO(List<o00oOOoO> list, o0O0O0O o0o0o0o, o0O00.o00oOOo0 o00oooo02, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).o00oOOo0(o0o0o0o, o00oooo02, obj);
                }
            }
        }

        public void o00oOOo0(o0O0O0O o0o0o0o, o0O00.o00oOOo0 o00oooo02, Object obj) {
            o00oOOoO(this.f3294o00oOOo0.get(o00oooo02), o0o0o0o, o00oooo02, obj);
            o00oOOoO(this.f3294o00oOOo0.get(o0O00.o00oOOo0.ON_ANY), o0o0o0o, o00oooo02, obj);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static final class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final int f3296o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Method f3297o00oOOoO;

        public o00oOOoO(int i, Method method) {
            this.f3296o00oOOo0 = i;
            this.f3297o00oOOoO = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o00oOOoO) {
                o00oOOoO o00ooooo2 = (o00oOOoO) obj;
                return this.f3296o00oOOo0 == o00ooooo2.f3296o00oOOo0 && this.f3297o00oOOoO.getName().equals(o00ooooo2.f3297o00oOOoO.getName());
            }
            return false;
        }

        public int hashCode() {
            return this.f3297o00oOOoO.getName().hashCode() + (this.f3296o00oOOo0 * 31);
        }

        public void o00oOOo0(o0O0O0O o0o0o0o, o0O00.o00oOOo0 o00oooo02, Object obj) {
            try {
                int i = this.f3296o00oOOo0;
                if (i == 0) {
                    this.f3297o00oOOoO.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f3297o00oOOoO.invoke(obj, o0o0o0o);
                } else if (i != 2) {
                } else {
                    this.f3297o00oOOoO.invoke(obj, o0o0o0o, o00oooo02);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }
    }

    public final o00oOOo0 o00oOOo0(Class<?> cls, @o00oOooO.o0OO00OO Method[] methodArr) {
        int i;
        o00oOOo0 o00oOo002;
        Class<?> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (o00oOo002 = o00oOo00(superclass)) != null) {
            hashMap.putAll(o00oOo002.f3295o00oOOoO);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<o00oOOoO, o0O00.o00oOOo0> entry : o00oOo00(cls2).f3295o00oOOoO.entrySet()) {
                o00oOo0O(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = o00oOOoO(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            oo0OOoo oo0oooo = (oo0OOoo) method.getAnnotation(oo0OOoo.class);
            if (oo0oooo != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (!o0O0O0O.class.isAssignableFrom(parameterTypes[0])) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i = 1;
                }
                o0O00.o00oOOo0 value = oo0oooo.value();
                if (parameterTypes.length > 1) {
                    if (!o0O00.o00oOOo0.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != o0O00.o00oOOo0.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                o00oOo0O(hashMap, new o00oOOoO(i, method), value, cls);
                z = true;
            }
        }
        o00oOOo0 o00oooo02 = new o00oOOo0(hashMap);
        this.f3292o00oOOo0.put(cls, o00oooo02);
        this.f3293o00oOOoO.put(cls, Boolean.valueOf(z));
        return o00oooo02;
    }

    public final Method[] o00oOOoO(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    public o00oOOo0 o00oOo00(Class<?> cls) {
        o00oOOo0 o00oooo02 = this.f3292o00oOOo0.get(cls);
        return o00oooo02 != null ? o00oooo02 : o00oOOo0(cls, null);
    }

    public final void o00oOo0O(Map<o00oOOoO, o0O00.o00oOOo0> map, o00oOOoO o00ooooo2, o0O00.o00oOOo0 o00oooo02, Class<?> cls) {
        o0O00.o00oOOo0 o00oooo03 = map.get(o00ooooo2);
        if (o00oooo03 == null || o00oooo02 == o00oooo03) {
            if (o00oooo03 == null) {
                map.put(o00ooooo2, o00oooo02);
                return;
            }
            return;
        }
        Method method = o00ooooo2.f3297o00oOOoO;
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Method ");
        o00oOOo02.append(method.getName());
        o00oOOo02.append(" in ");
        o00oOOo02.append(cls.getName());
        o00oOOo02.append(" already declared with different @OnLifecycleEvent value: previous value ");
        o00oOOo02.append(o00oooo03);
        o00oOOo02.append(", new value ");
        o00oOOo02.append(o00oooo02);
        throw new IllegalArgumentException(o00oOOo02.toString());
    }

    public boolean o00oOooO(Class<?> cls) {
        Boolean bool = this.f3293o00oOOoO.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] o00oOOoO2 = o00oOOoO(cls);
        for (Method method : o00oOOoO2) {
            if (((oo0OOoo) method.getAnnotation(oo0OOoo.class)) != null) {
                o00oOOo0(cls, o00oOOoO2);
                return true;
            }
        }
        this.f3293o00oOOoO.put(cls, Boolean.FALSE);
        return false;
    }
}
