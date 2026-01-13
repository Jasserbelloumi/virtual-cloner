package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import o00oOooO.o0OO0oO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class o0OO00OO {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final List<Class<?>> f3375o00oOOo0 = o0OO0oO.o0O00O0o.o00ooo0O(Application.class, o0O.class);
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final List<Class<?>> f3376o00oOOoO = o0OO0oO.o0OoO00O.o00oOoo0(o0O.class);

    public static final /* synthetic */ List o00oOOo0() {
        return f3375o00oOOo0;
    }

    public static final /* synthetic */ List o00oOOoO() {
        return f3376o00oOOoO;
    }

    @Nullable
    public static final <T> Constructor<T> o00oOo00(@NotNull Class<T> cls, @NotNull List<? extends Class<?>> list) {
        o0OOOOO0.o0ooO.o00oo0O0(cls, "modelClass");
        o0OOOOO0.o0ooO.o00oo0O0(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        o0OOOOO0.o0ooO.o00oo0OO(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            o0OOOOO0.o0ooO.o00oo0OO(parameterTypes, "constructor.parameterTypes");
            List oooO0O0O = o0OO0oO.o0O000O.oooO0O0O(parameterTypes);
            if (o0OOOOO0.o0ooO.o00oOoO0(list, oooO0O0O)) {
                o0OOOOO0.o0ooO.o00oo0(constructor2, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor2;
            } else if (list.size() == oooO0O0O.size() && oooO0O0O.containsAll(list)) {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Class ");
                o00oOOo02.append(cls.getSimpleName());
                o00oOOo02.append(" must have parameters in the proper order: ");
                o00oOOo02.append(list);
                throw new UnsupportedOperationException(o00oOOo02.toString());
            }
        }
        return null;
    }

    public static final <T extends o0OO0> T o00oOooO(@NotNull Class<T> cls, @NotNull Constructor<T> constructor, @NotNull Object... objArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cls, "modelClass");
        o0OOOOO0.o0ooO.o00oo0O0(constructor, "constructor");
        o0OOOOO0.o0ooO.o00oo0O0(objArr, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
