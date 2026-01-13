package o0OO0ooO;

import o0OO0o.oO0Ooooo;
import o0OOO0OO.o00oo00O;
import o0OOOO0o.o00oo0OO;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o00oo0OO(name = "ThreadsKt")
@o0OOO00({"SMAP\nThread.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Thread.kt\nkotlin/concurrent/ThreadsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* loaded from: classes3.dex */
public final class o0O0o00O {

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends Thread {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oOOo0<oO0Ooooo> f13432o00oo0O0;

        public o00oOOo0(o0OOOO.o00oOOo0<oO0Ooooo> o00oooo02) {
            this.f13432o00oo0O0 = o00oooo02;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f13432o00oo0O0.invoke();
        }
    }

    @o00oo00O
    public static final <T> T o00oOOo0(ThreadLocal<T> threadLocal, o0OOOO.o00oOOo0<? extends T> o00oooo02) {
        o0ooO.o00oo0O0(threadLocal, "<this>");
        o0ooO.o00oo0O0(o00oooo02, "default");
        T t = threadLocal.get();
        if (t == null) {
            T invoke = o00oooo02.invoke();
            threadLocal.set(invoke);
            return invoke;
        }
        return t;
    }

    @NotNull
    public static final Thread o00oOOoO(boolean z, boolean z2, @Nullable ClassLoader classLoader, @Nullable String str, int i, @NotNull o0OOOO.o00oOOo0<oO0Ooooo> o00oooo02) {
        o0ooO.o00oo0O0(o00oooo02, "block");
        o00oOOo0 o00oooo03 = new o00oOOo0(o00oooo02);
        if (z2) {
            o00oooo03.setDaemon(true);
        }
        if (i > 0) {
            o00oooo03.setPriority(i);
        }
        if (str != null) {
            o00oooo03.setName(str);
        }
        if (classLoader != null) {
            o00oooo03.setContextClassLoader(classLoader);
        }
        if (z) {
            o00oooo03.start();
        }
        return o00oooo03;
    }

    public static /* synthetic */ Thread o00oOo00(boolean z, boolean z2, ClassLoader classLoader, String str, int i, o0OOOO.o00oOOo0 o00oooo02, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        ClassLoader classLoader2 = (i2 & 4) != 0 ? null : classLoader;
        String str2 = (i2 & 8) != 0 ? null : str;
        if ((i2 & 16) != 0) {
            i = -1;
        }
        return o00oOOoO(z3, z4, classLoader2, str2, i, o00oooo02);
    }
}
