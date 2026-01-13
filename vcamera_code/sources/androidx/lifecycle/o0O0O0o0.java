package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o00oOooO.o0OO0oO;
import o0OOOoo0.oO0O00o0;
import org.jetbrains.annotations.NotNull;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class o0O0O0o0 {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f3339o00oOOoO = 1;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f3340o00oOo00 = 2;
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0O0O0o0 f3338o00oOOo0 = new o0O0O0o0();
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final Map<Class<?>, Integer> f3342o00oOooO = new HashMap();
    @NotNull

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final Map<Class<?>, List<Constructor<? extends o0OoOoOo>>> f3341o00oOo0O = new HashMap();

    @o0OOOO0o.o00ooO0
    @NotNull
    public static final String o00oOo00(@NotNull String str) {
        o0OOOOO0.o0ooO.o00oo0O0(str, "className");
        return android.support.v4.media.o00oOOoO.o00oOOo0(new StringBuilder(), oO0O00o0.o0OOoooO(str, ".", "_", false, 4, null), "_LifecycleAdapter");
    }

    @o0OOOO0o.o00ooO0
    @NotNull
    public static final o0O00OOO o00oOo0o(@NotNull Object obj) {
        o0OOOOO0.o0ooO.o00oo0O0(obj, "object");
        boolean z = obj instanceof o0O00OOO;
        boolean z2 = obj instanceof o00oo;
        if (z && z2) {
            return new DefaultLifecycleObserverAdapter((o00oo) obj, (o0O00OOO) obj);
        }
        if (z2) {
            return new DefaultLifecycleObserverAdapter((o00oo) obj, null);
        }
        if (z) {
            return (o0O00OOO) obj;
        }
        Class<?> cls = obj.getClass();
        o0O0O0o0 o0o0o0o0 = f3338o00oOOo0;
        if (o0o0o0o0.o00oOooO(cls) == 2) {
            List<Constructor<? extends o0OoOoOo>> list = f3341o00oOo0O.get(cls);
            o0OOOOO0.o0ooO.o00oo00O(list);
            List<Constructor<? extends o0OoOoOo>> list2 = list;
            if (list2.size() == 1) {
                return new SingleGeneratedAdapterObserver(o0o0o0o0.o00oOOo0(list2.get(0), obj));
            }
            int size = list2.size();
            o0OoOoOo[] o0ooooooArr = new o0OoOoOo[size];
            for (int i = 0; i < size; i++) {
                o0ooooooArr[i] = f3338o00oOOo0.o00oOOo0(list2.get(i), obj);
            }
            return new CompositeGeneratedAdaptersObserver(o0ooooooArr);
        }
        return new ReflectiveGenericLifecycleObserver(obj);
    }

    public final o0OoOoOo o00oOOo0(Constructor<? extends o0OoOoOo> constructor, Object obj) {
        try {
            o0OoOoOo newInstance = constructor.newInstance(obj);
            o0OOOOO0.o0ooO.o00oo0OO(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final Constructor<? extends o0OoOoOo> o00oOOoO(Class<?> cls) {
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            o0OOOOO0.o0ooO.o00oo0OO(name, "fullPackage");
            if (!(name.length() == 0)) {
                o0OOOOO0.o0ooO.o00oo0OO(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                o0OOOOO0.o0ooO.o00oo0OO(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            o0OOOOO0.o0ooO.o00oo0OO(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String o00oOo002 = o00oOo00(canonicalName);
            if (!(name.length() == 0)) {
                o00oOo002 = name + '.' + o00oOo002;
            }
            Class<?> cls2 = Class.forName(o00oOo002);
            o0OOOOO0.o0ooO.o00oo0(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean o00oOo0O(Class<?> cls) {
        return cls != null && o0O00oO0.class.isAssignableFrom(cls);
    }

    public final int o00oOoO0(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends o0OoOoOo> o00oOOoO2 = o00oOOoO(cls);
        if (o00oOOoO2 != null) {
            f3341o00oOo0O.put(cls, o0OO0oO.o0OoO00O.o00oOoo0(o00oOOoO2));
            return 2;
        } else if (o00oOoO.f3288o00oOo00.o00oOooO(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (o00oOo0O(superclass)) {
                o0OOOOO0.o0ooO.o00oo0OO(superclass, "superclass");
                if (o00oOooO(superclass) == 1) {
                    return 1;
                }
                List<Constructor<? extends o0OoOoOo>> list = f3341o00oOo0O.get(superclass);
                o0OOOOO0.o0ooO.o00oo00O(list);
                arrayList = new ArrayList(list);
            }
            Class<?>[] interfaces = cls.getInterfaces();
            o0OOOOO0.o0ooO.o00oo0OO(interfaces, "klass.interfaces");
            for (Class<?> cls2 : interfaces) {
                if (o00oOo0O(cls2)) {
                    o0OOOOO0.o0ooO.o00oo0OO(cls2, "intrface");
                    if (o00oOooO(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    List<Constructor<? extends o0OoOoOo>> list2 = f3341o00oOo0O.get(cls2);
                    o0OOOOO0.o0ooO.o00oo00O(list2);
                    arrayList.addAll(list2);
                }
            }
            if (arrayList != null) {
                f3341o00oOo0O.put(cls, arrayList);
                return 2;
            }
            return 1;
        }
    }

    public final int o00oOooO(Class<?> cls) {
        Map<Class<?>, Integer> map = f3342o00oOooO;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int o00oOoO02 = o00oOoO0(cls);
        map.put(cls, Integer.valueOf(o00oOoO02));
        return o00oOoO02;
    }
}
