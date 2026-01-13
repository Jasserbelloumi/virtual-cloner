package o0OOO0OO;

import o0OO0o.o0O;
import o0OO0o.o0O00O;
import o0OO0o.o0OO00o0;
import o0OOO0Oo.o0O000O;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o00ooO0 {
    @o0OOOO0o.o00oOoO
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o00oo f13445o00oOOo0;

    static {
        o00oo o00ooVar;
        Object newInstance;
        try {
            newInstance = o0OOO0o0.o00oOoO.class.newInstance();
            o0ooO.o00oo0OO(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                } catch (ClassNotFoundException unused) {
                    Object newInstance2 = o0O000O.class.newInstance();
                    o0ooO.o00oo0OO(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        try {
                            if (newInstance2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                            }
                            o00ooVar = (o00oo) newInstance2;
                        } catch (ClassCastException e) {
                            ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                            ClassLoader classLoader2 = o00oo.class.getClassLoader();
                            if (o0ooO.o00oOoO0(classLoader, classLoader2)) {
                                throw e;
                            }
                            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
                        }
                    } catch (ClassNotFoundException unused2) {
                        o00ooVar = new o00oo();
                    }
                }
            } catch (ClassCastException e2) {
                ClassLoader classLoader3 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader4 = o00oo.class.getClassLoader();
                if (o0ooO.o00oOoO0(classLoader3, classLoader4)) {
                    throw e2;
                }
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e2);
            }
        } catch (ClassNotFoundException unused3) {
            Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
            o0ooO.o00oo0OO(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    if (newInstance3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    o00ooVar = (o00oo) newInstance3;
                } catch (ClassCastException e3) {
                    ClassLoader classLoader5 = newInstance3.getClass().getClassLoader();
                    ClassLoader classLoader6 = o00oo.class.getClassLoader();
                    if (o0ooO.o00oOoO0(classLoader5, classLoader6)) {
                        throw e3;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e3);
                }
            } catch (ClassNotFoundException unused4) {
                Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                o0ooO.o00oo0OO(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (newInstance4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    o00ooVar = (o00oo) newInstance4;
                } catch (ClassCastException e4) {
                    ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                    ClassLoader classLoader8 = o00oo.class.getClassLoader();
                    if (o0ooO.o00oOoO0(classLoader7, classLoader8)) {
                        throw e4;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e4);
                }
            }
        }
        if (newInstance == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
        }
        o00ooVar = (o00oo) newInstance;
        f13445o00oOOo0 = o00ooVar;
    }

    @o0O
    @o0OO00o0(version = "1.2")
    public static final boolean o00oOOo0(int i, int i2, int i3) {
        return o0O00O.f13197o0O0o.o00oOoOo(i, i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o00oo00O
    public static final <T> T o00oOOoO(Object obj) {
        try {
            o0ooO.o00oooOo();
            return obj;
        } catch (ClassCastException e) {
            ClassLoader classLoader = obj.getClass().getClassLoader();
            o0ooO.o00oooOo();
            ClassLoader classLoader2 = Object.class.getClassLoader();
            if (o0ooO.o00oOoO0(classLoader, classLoader2)) {
                throw e;
            }
            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
        }
    }
}
