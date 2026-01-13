package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import kotlin.Metadata;
import o0OO0o.o0O00oO0;
import o0OO0o.o0O0oo0o;
import o0OO0o.o0oO0Ooo;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0OOooO0;
import o0OOOOO0.o0ooO;
import o0OOOo.o0O00OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0016\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002J\u0018\u0010\u0010\u001a\u00020\u0004*\u00020\r2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002J\u0018\u0010\u0012\u001a\u00020\u0004*\u00020\r2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002J \u0010\u0014\u001a\u0012\u0012\u0002\b\u0003 \u0013*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0015\u001a\u0012\u0012\u0002\b\u0003 \u0013*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0016\u001a\u0012\u0012\u0002\b\u0003 \u0013*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0017\u001a\u0012\u0012\u0002\b\u0003 \u0013*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u00020\u0004*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Landroidx/window/layout/o00ooO;", "", "Ljava/lang/ClassLoader;", "classLoader", "", "o00oOoOO", "o00oo0Oo", "o00oo0O0", "o00oo0", "o00oo0O", "Lkotlin/Function0;", "block", "o00oo0o0", "Ljava/lang/reflect/Method;", "Lo0OOOo/o0O00OO;", "clazz", "o00oOoo0", "Ljava/lang/Class;", "o00oOoOo", "kotlin.jvm.PlatformType", "o00oo0oO", "o00oo0o", "o00oOooo", "o0O0o", "Landroidx/window/extensions/layout/WindowLayoutComponent;", o0OO000o.o00oOOoO.f12961o00oOo00, "Lo0OO0o/o0oO0Ooo;", "o00oo00O", "()Landroidx/window/extensions/layout/WindowLayoutComponent;", "windowLayoutComponent", "o00oo0OO", "(Ljava/lang/reflect/Method;)Z", "isPublic", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class o00ooO {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o00ooO f5503o00oOOo0 = new o00ooO();
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final o0oO0Ooo f5504o00oOOoO = o0O00oO0.o00oOo00(o00oOoO.INSTANCE);

    @o0O0oo0o(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0O0OO implements o0OOOO.o00oOOo0<Boolean> {
        public final /* synthetic */ ClassLoader $classLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(ClassLoader classLoader) {
            super(0);
            this.$classLoader = classLoader;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final Boolean invoke() {
            o00ooO o00ooo = o00ooO.f5503o00oOOo0;
            Class<?> o00oOooo2 = o00ooo.o00oOooo(this.$classLoader);
            boolean z = false;
            Method method = o00oOooo2.getMethod("getBounds", new Class[0]);
            Method method2 = o00oOooo2.getMethod("getType", new Class[0]);
            Method method3 = o00oOooo2.getMethod("getState", new Class[0]);
            o0ooO.o00oo0OO(method, "getBoundsMethod");
            if (o00ooo.o00oOoo0(method, o0OOooO0.o00oOooO(Rect.class)) && o00ooo.o00oo0OO(method)) {
                o0ooO.o00oo0OO(method2, "getTypeMethod");
                Class cls = Integer.TYPE;
                if (o00ooo.o00oOoo0(method2, o0OOooO0.o00oOooO(cls)) && o00ooo.o00oo0OO(method2)) {
                    o0ooO.o00oo0OO(method3, "getStateMethod");
                    if (o00ooo.o00oOoo0(method3, o0OOooO0.o00oOooO(cls)) && o00ooo.o00oo0OO(method3)) {
                        z = true;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    }

    @o0O0oo0o(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class o00oOOoO extends o0O0OO implements o0OOOO.o00oOOo0<Boolean> {
        public final /* synthetic */ ClassLoader $classLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(ClassLoader classLoader) {
            super(0);
            this.$classLoader = classLoader;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final Boolean invoke() {
            o00ooO o00ooo = o00ooO.f5503o00oOOo0;
            boolean z = false;
            Method method = o00ooo.o00oo0o(this.$classLoader).getMethod("getWindowLayoutComponent", new Class[0]);
            Class<?> o0O0o2 = o00ooo.o0O0o(this.$classLoader);
            o0ooO.o00oo0OO(method, "getWindowLayoutComponentMethod");
            if (o00ooo.o00oo0OO(method)) {
                o0ooO.o00oo0OO(o0O0o2, "windowLayoutComponentClass");
                if (o00ooo.o00oOoOo(method, o0O0o2)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    @o0O0oo0o(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class o00oOo00 extends o0O0OO implements o0OOOO.o00oOOo0<Boolean> {
        public final /* synthetic */ ClassLoader $classLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo00(ClassLoader classLoader) {
            super(0);
            this.$classLoader = classLoader;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final Boolean invoke() {
            o00ooO o00ooo = o00ooO.f5503o00oOOo0;
            Class<?> o0O0o2 = o00ooo.o0O0o(this.$classLoader);
            boolean z = false;
            Method method = o0O0o2.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
            Method method2 = o0O0o2.getMethod("removeWindowLayoutInfoListener", Consumer.class);
            o0ooO.o00oo0OO(method, "addListenerMethod");
            if (o00ooo.o00oo0OO(method)) {
                o0ooO.o00oo0OO(method2, "removeListenerMethod");
                if (o00ooo.o00oo0OO(method2)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    @o0O0oo0o(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class o00oOo0O extends o0O0OO implements o0OOOO.o00oOOo0<Boolean> {
        public final /* synthetic */ ClassLoader $classLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo0O(ClassLoader classLoader) {
            super(0);
            this.$classLoader = classLoader;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final Boolean invoke() {
            o00ooO o00ooo = o00ooO.f5503o00oOOo0;
            boolean z = false;
            Method declaredMethod = o00ooo.o00oo0oO(this.$classLoader).getDeclaredMethod("getWindowExtensions", new Class[0]);
            Class<?> o00oo0o2 = o00ooo.o00oo0o(this.$classLoader);
            o0ooO.o00oo0OO(declaredMethod, "getWindowExtensionsMethod");
            o0ooO.o00oo0OO(o00oo0o2, "windowExtensionsClass");
            if (o00ooo.o00oOoOo(declaredMethod, o00oo0o2) && o00ooo.o00oo0OO(declaredMethod)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @o0O0oo0o(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class o00oOoO extends o0O0OO implements o0OOOO.o00oOOo0<WindowLayoutComponent> {
        public static final o00oOoO INSTANCE = new o00oOoO();

        public o00oOoO() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o0OOOO.o00oOOo0
        @Nullable
        public final WindowLayoutComponent invoke() {
            ClassLoader classLoader = o00ooO.class.getClassLoader();
            if (classLoader != null && o00ooO.f5503o00oOOo0.o00oOoOO(classLoader)) {
                try {
                    return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                } catch (UnsupportedOperationException unused) {
                }
            }
            return null;
        }
    }

    public final boolean o00oOoOO(ClassLoader classLoader) {
        return o00oo0Oo(classLoader) && o00oo0O0(classLoader) && o00oo0O(classLoader) && o00oo0(classLoader);
    }

    public final boolean o00oOoOo(Method method, Class<?> cls) {
        return method.getReturnType().equals(cls);
    }

    public final boolean o00oOoo0(Method method, o0O00OO<?> o0o00oo) {
        return o00oOoOo(method, o0OOOO0o.o00oOOo0.o00oOo0O(o0o00oo));
    }

    public final Class<?> o00oOooo(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    public final boolean o00oo0(ClassLoader classLoader) {
        return o00oo0o0(new o00oOOo0(classLoader));
    }

    @Nullable
    public final WindowLayoutComponent o00oo00O() {
        return (WindowLayoutComponent) f5504o00oOOoO.getValue();
    }

    @o00oOooO.o0OOooO0(24)
    public final boolean o00oo0O(ClassLoader classLoader) {
        return o00oo0o0(new o00oOo00(classLoader));
    }

    public final boolean o00oo0O0(ClassLoader classLoader) {
        return o00oo0o0(new o00oOOoO(classLoader));
    }

    public final boolean o00oo0OO(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    public final boolean o00oo0Oo(ClassLoader classLoader) {
        return o00oo0o0(new o00oOo0O(classLoader));
    }

    public final Class<?> o00oo0o(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    public final boolean o00oo0o0(o0OOOO.o00oOOo0<Boolean> o00oooo02) {
        try {
            return o00oooo02.invoke().booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    public final Class<?> o00oo0oO(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    public final Class<?> o0O0o(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }
}
