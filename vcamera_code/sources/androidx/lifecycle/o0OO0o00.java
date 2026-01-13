package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import o00oOooO.o0OO0oO;
import o0O00oO0.o00oOOo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOOOO0.o0OOO00({"SMAP\nViewModelProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProvider.kt\nandroidx/lifecycle/ViewModelProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,375:1\n1#2:376\n*E\n"})
/* loaded from: classes.dex */
public class o0OO0o00 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0OO0oO0 f3384o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oOOoO f3385o00oOOoO;
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o0O00oO0.o00oOOo0 f3386o00oOo00;

    /* loaded from: classes.dex */
    public static class o00oOOo0 extends o00oOo00 {
        @Nullable

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static o00oOOo0 f3388o00oOoO = null;
        @NotNull

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final String f3389o00oOoO0 = "androidx.lifecycle.ViewModelProvider.DefaultKey";
        @Nullable

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final Application f3391o00oOo0O;
        @NotNull

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final C0030o00oOOo0 f3387o00oOo0o = new C0030o00oOOo0(null);
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static final o00oOOo0.o00oOOoO<Application> f3390o00oOoOO = C0030o00oOOo0.C0031o00oOOo0.f3392o00oOOo0;

        /* renamed from: androidx.lifecycle.o0OO0o00$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0030o00oOOo0 {

            /* renamed from: androidx.lifecycle.o0OO0o00$o00oOOo0$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0031o00oOOo0 implements o00oOOo0.o00oOOoO<Application> {
                @NotNull

                /* renamed from: o00oOOo0  reason: collision with root package name */
                public static final C0031o00oOOo0 f3392o00oOOo0 = new C0031o00oOOo0();
            }

            public C0030o00oOOo0() {
            }

            public C0030o00oOOo0(o0OOOOO0.o0O00 o0o00) {
            }

            @NotNull
            public final o00oOOoO o00oOOo0(@NotNull o0OO0oO o0oo0oo) {
                o0OOOOO0.o0ooO.o00oo0O0(o0oo0oo, "owner");
                return o0oo0oo instanceof o0O000o0 ? ((o0O000o0) o0oo0oo).getDefaultViewModelProviderFactory() : o00oOo00.f3395o00oOOoO.o00oOOo0();
            }

            @o0OOOO0o.o00ooO0
            @NotNull
            public final o00oOOo0 o00oOOoO(@NotNull Application application) {
                o0OOOOO0.o0ooO.o00oo0O0(application, "application");
                if (o00oOOo0.f3388o00oOoO == null) {
                    o00oOOo0.f3388o00oOoO = new o00oOOo0(application);
                }
                o00oOOo0 o00oooo02 = o00oOOo0.f3388o00oOoO;
                o0OOOOO0.o0ooO.o00oo00O(o00oooo02);
                return o00oooo02;
            }
        }

        public o00oOOo0() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(@NotNull Application application) {
            this(application, 0);
            o0OOOOO0.o0ooO.o00oo0O0(application, "application");
        }

        public o00oOOo0(Application application, int i) {
            this.f3391o00oOo0O = application;
        }

        @o0OOOO0o.o00ooO0
        @NotNull
        public static final o00oOOo0 o00oOoOo(@NotNull Application application) {
            return f3387o00oOo0o.o00oOOoO(application);
        }

        @Override // androidx.lifecycle.o0OO0o00.o00oOOoO
        @NotNull
        public <T extends o0OO0> T o00oOOoO(@NotNull Class<T> cls, @NotNull o0O00oO0.o00oOOo0 o00oooo02) {
            o0OOOOO0.o0ooO.o00oo0O0(cls, "modelClass");
            o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "extras");
            if (this.f3391o00oOo0O != null) {
                return (T) o00oOo00(cls);
            }
            Application application = (Application) o00oooo02.o00oOOo0(f3390o00oOoOO);
            if (application != null) {
                return (T) o00oOoOO(cls, application);
            }
            if (androidx.lifecycle.o00oOOoO.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.o00oOo00(cls);
        }

        @Override // androidx.lifecycle.o0OO0o00.o00oOo00, androidx.lifecycle.o0OO0o00.o00oOOoO
        @NotNull
        public <T extends o0OO0> T o00oOo00(@NotNull Class<T> cls) {
            o0OOOOO0.o0ooO.o00oo0O0(cls, "modelClass");
            Application application = this.f3391o00oOo0O;
            if (application != null) {
                return (T) o00oOoOO(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public final <T extends o0OO0> T o00oOoOO(Class<T> cls, Application application) {
            if (androidx.lifecycle.o00oOOoO.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    o0OOOOO0.o0ooO.o00oo0OO(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e4);
                }
            }
            return (T) super.o00oOo00(cls);
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO {
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final o00oOOo0 f3393o00oOOo0 = o00oOOo0.f3394o00oOOo0;

        /* loaded from: classes.dex */
        public static final class o00oOOo0 {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public static final /* synthetic */ o00oOOo0 f3394o00oOOo0 = new o00oOOo0();

            @o0OOOO0o.o00ooO0
            @NotNull
            public final o00oOOoO o00oOOo0(@NotNull o0O00oO0.o00oo0<?>... o00oo0VarArr) {
                o0OOOOO0.o0ooO.o00oo0O0(o00oo0VarArr, "initializers");
                return new o0O00oO0.o00oOOoO((o0O00oO0.o00oo0[]) Arrays.copyOf(o00oo0VarArr, o00oo0VarArr.length));
            }
        }

        @o0OOOO0o.o00ooO0
        @NotNull
        static o00oOOoO o00oOOo0(@NotNull o0O00oO0.o00oo0<?>... o00oo0VarArr) {
            return f3393o00oOOo0.o00oOOo0(o00oo0VarArr);
        }

        @NotNull
        default <T extends o0OO0> T o00oOOoO(@NotNull Class<T> cls, @NotNull o0O00oO0.o00oOOo0 o00oooo02) {
            o0OOOOO0.o0ooO.o00oo0O0(cls, "modelClass");
            o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "extras");
            return (T) o00oOo00(cls);
        }

        @NotNull
        default <T extends o0OO0> T o00oOo00(@NotNull Class<T> cls) {
            o0OOOOO0.o0ooO.o00oo0O0(cls, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 implements o00oOOoO {
        @Nullable

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static o00oOo00 f3396o00oOo00;
        @NotNull

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final o00oOOo0 f3395o00oOOoO = new o00oOOo0(null);
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final o00oOOo0.o00oOOoO<String> f3397o00oOooO = o00oOOo0.C0032o00oOOo0.f3398o00oOOo0;

        /* loaded from: classes.dex */
        public static final class o00oOOo0 {

            /* renamed from: androidx.lifecycle.o0OO0o00$o00oOo00$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0032o00oOOo0 implements o00oOOo0.o00oOOoO<String> {
                @NotNull

                /* renamed from: o00oOOo0  reason: collision with root package name */
                public static final C0032o00oOOo0 f3398o00oOOo0 = new C0032o00oOOo0();
            }

            public o00oOOo0() {
            }

            public o00oOOo0(o0OOOOO0.o0O00 o0o00) {
            }

            @o0OOOO0o.o00ooO0
            public static /* synthetic */ void o00oOOoO() {
            }

            @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
            @NotNull
            public final o00oOo00 o00oOOo0() {
                if (o00oOo00.f3396o00oOo00 == null) {
                    o00oOo00.f3396o00oOo00 = new o00oOo00();
                }
                o00oOo00 o00ooo002 = o00oOo00.f3396o00oOo00;
                o0OOOOO0.o0ooO.o00oo00O(o00ooo002);
                return o00ooo002;
            }
        }

        @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
        @NotNull
        public static final o00oOo00 o00oOo0o() {
            return f3395o00oOOoO.o00oOOo0();
        }

        @Override // androidx.lifecycle.o0OO0o00.o00oOOoO
        @NotNull
        public <T extends o0OO0> T o00oOo00(@NotNull Class<T> cls) {
            o0OOOOO0.o0ooO.o00oo0O0(cls, "modelClass");
            try {
                T newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                o0OOOOO0.o0ooO.o00oo0OO(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            }
        }
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class o00oOo0O {
        public void o00oOooO(@NotNull o0OO0 o0oo0) {
            o0OOOOO0.o0ooO.o00oo0O0(o0oo0, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o0OOOO0o.o00oo0O0
    public o0OO0o00(@NotNull o0OO0oO0 o0oo0oo0, @NotNull o00oOOoO o00ooooo2) {
        this(o0oo0oo0, o00ooooo2, null, 4, null);
        o0OOOOO0.o0ooO.o00oo0O0(o0oo0oo0, "store");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooooo2, "factory");
    }

    @o0OOOO0o.o00oo0O0
    public o0OO0o00(@NotNull o0OO0oO0 o0oo0oo0, @NotNull o00oOOoO o00ooooo2, @NotNull o0O00oO0.o00oOOo0 o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o0oo0oo0, "store");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooooo2, "factory");
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "defaultCreationExtras");
        this.f3384o00oOOo0 = o0oo0oo0;
        this.f3385o00oOOoO = o00ooooo2;
        this.f3386o00oOo00 = o00oooo02;
    }

    public /* synthetic */ o0OO0o00(o0OO0oO0 o0oo0oo0, o00oOOoO o00ooooo2, o0O00oO0.o00oOOo0 o00oooo02, int i, o0OOOOO0.o0O00 o0o00) {
        this(o0oo0oo0, o00ooooo2, (i & 4) != 0 ? o00oOOo0.C0143o00oOOo0.f11162o00oOOoO : o00oooo02);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0OO0o00(@NotNull o0OO0oO o0oo0oo) {
        this(o0oo0oo.getViewModelStore(), o00oOOo0.f3387o00oOo0o.o00oOOo0(o0oo0oo), o0OO0o.o00oOOo0(o0oo0oo));
        o0OOOOO0.o0ooO.o00oo0O0(o0oo0oo, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0OO0o00(@NotNull o0OO0oO o0oo0oo, @NotNull o00oOOoO o00ooooo2) {
        this(o0oo0oo.getViewModelStore(), o00ooooo2, o0OO0o.o00oOOo0(o0oo0oo));
        o0OOOOO0.o0ooO.o00oo0O0(o0oo0oo, "owner");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooooo2, "factory");
    }

    @o00oOooO.o0O
    @NotNull
    public <T extends o0OO0> T o00oOOo0(@NotNull Class<T> cls) {
        o0OOOOO0.o0ooO.o00oo0O0(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) o00oOOoO("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @o00oOooO.o0O
    @NotNull
    public <T extends o0OO0> T o00oOOoO(@NotNull String str, @NotNull Class<T> cls) {
        T t;
        o0OOOOO0.o0ooO.o00oo0O0(str, "key");
        o0OOOOO0.o0ooO.o00oo0O0(cls, "modelClass");
        T t2 = (T) this.f3384o00oOOo0.o00oOOoO(str);
        if (!cls.isInstance(t2)) {
            o0O00oO0.o00oOoO o00oooo2 = new o0O00oO0.o00oOoO(this.f3386o00oOo00);
            o00oooo2.o00oOo00(o00oOo00.f3397o00oOooO, str);
            try {
                t = (T) this.f3385o00oOOoO.o00oOOoO(cls, o00oooo2);
            } catch (AbstractMethodError unused) {
                t = (T) this.f3385o00oOOoO.o00oOo00(cls);
            }
            this.f3384o00oOOo0.o00oOooO(str, t);
            return t;
        }
        o00oOOoO o00ooooo2 = this.f3385o00oOOoO;
        o00oOo0O o00ooo0o2 = o00ooooo2 instanceof o00oOo0O ? (o00oOo0O) o00ooooo2 : null;
        if (o00ooo0o2 != null) {
            o0OOOOO0.o0ooO.o00oo00O(t2);
            o00ooo0o2.o00oOooO(t2);
        }
        o0OOOOO0.o0ooO.o00oo0(t2, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return t2;
    }
}
