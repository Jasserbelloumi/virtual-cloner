package o0OOO0;

import java.lang.reflect.Method;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/ModuleNameRetriever\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* loaded from: classes3.dex */
public final class o00oo0O0 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o00oo0O0 f13436o00oOOo0 = new o00oo0O0();
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final o00oOOo0 f13437o00oOOoO = new o00oOOo0(null, null, null);
    @Nullable

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static o00oOOo0 f13438o00oOo00;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        @o0OOOO0o.o00oOoO
        @Nullable

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Method f13439o00oOOo0;
        @o0OOOO0o.o00oOoO
        @Nullable

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Method f13440o00oOOoO;
        @o0OOOO0o.o00oOoO
        @Nullable

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Method f13441o00oOo00;

        public o00oOOo0(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
            this.f13439o00oOOo0 = method;
            this.f13440o00oOOoO = method2;
            this.f13441o00oOo00 = method3;
        }
    }

    public final o00oOOo0 o00oOOo0(o0OOO0.o00oOOo0 o00oooo02) {
        try {
            o00oOOo0 o00oooo03 = new o00oOOo0(Class.class.getDeclaredMethod("getModule", new Class[0]), o00oooo02.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), o00oooo02.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f13438o00oOo00 = o00oooo03;
            return o00oooo03;
        } catch (Exception unused) {
            o00oOOo0 o00oooo04 = f13437o00oOOoO;
            f13438o00oOo00 = o00oooo04;
            return o00oooo04;
        }
    }

    @Nullable
    public final String o00oOOoO(@NotNull o0OOO0.o00oOOo0 o00oooo02) {
        o0ooO.o00oo0O0(o00oooo02, "continuation");
        o00oOOo0 o00oooo03 = f13438o00oOo00;
        if (o00oooo03 == null) {
            o00oooo03 = o00oOOo0(o00oooo02);
        }
        if (o00oooo03 == f13437o00oOOoO) {
            return null;
        }
        Method method = o00oooo03.f13439o00oOOo0;
        Object invoke = method != null ? method.invoke(o00oooo02.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = o00oooo03.f13440o00oOOoO;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = o00oooo03.f13441o00oOo00;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
