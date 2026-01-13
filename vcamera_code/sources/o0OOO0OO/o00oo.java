package o0OOO0OO;

import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import o0OOOoo0.oO00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
/* loaded from: classes3.dex */
public class o00oo {

    @o0OOO00({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations$ReflectThrowable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final o00oOOo0 f13442o00oOOo0 = new o00oOOo0();
        @o0OOOO0o.o00oOoO
        @Nullable

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final Method f13443o00oOOoO;
        @o0OOOO0o.o00oOoO
        @Nullable

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final Method f13444o00oOo00;

        /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[LOOP:0: B:3:0x0015->B:13:0x003f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0043 A[EDGE_INSN: B:24:0x0043->B:15:0x0043 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                o0OOO0OO.o00oo$o00oOOo0 r0 = new o0OOO0OO.o00oo$o00oOOo0
                r0.<init>()
                o0OOO0OO.o00oo.o00oOOo0.f13442o00oOOo0 = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                o0OOOOO0.o0ooO.o00oo0OO(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L15:
                r5 = 0
                if (r4 >= r2) goto L42
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = o0OOOOO0.o0ooO.o00oOoO0(r7, r8)
                if (r7 == 0) goto L3b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                o0OOOOO0.o0ooO.o00oo0OO(r7, r8)
                java.lang.Object r7 = o0OO0oO.o0O000O.ooO00O0o(r7)
                boolean r7 = o0OOOOO0.o0ooO.o00oOoO0(r7, r0)
                if (r7 == 0) goto L3b
                r7 = 1
                goto L3c
            L3b:
                r7 = r3
            L3c:
                if (r7 == 0) goto L3f
                goto L43
            L3f:
                int r4 = r4 + 1
                goto L15
            L42:
                r6 = r5
            L43:
                o0OOO0OO.o00oo.o00oOOo0.f13443o00oOOoO = r6
                int r0 = r1.length
            L46:
                if (r3 >= r0) goto L5b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = o0OOOOO0.o0ooO.o00oOoO0(r4, r6)
                if (r4 == 0) goto L58
                r5 = r2
                goto L5b
            L58:
                int r3 = r3 + 1
                goto L46
            L5b:
                o0OOO0OO.o00oo.o00oOOo0.f13444o00oOo00 = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOO0OO.o00oo.o00oOOo0.<clinit>():void");
        }
    }

    public void o00oOOo0(@NotNull Throwable th, @NotNull Throwable th2) {
        o0ooO.o00oo0O0(th, "cause");
        o0ooO.o00oo0O0(th2, "exception");
        Method method = o00oOOo0.f13443o00oOOoO;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    @NotNull
    public o0OOOo0.o00oo0 o00oOOoO() {
        return new o0OOOo0.o00oOo00();
    }

    @Nullable
    public oO00Oo0 o00oOo00(@NotNull MatchResult matchResult, @NotNull String str) {
        o0ooO.o00oo0O0(matchResult, "matchResult");
        o0ooO.o00oo0O0(str, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    @NotNull
    public List<Throwable> o00oOooO(@NotNull Throwable th) {
        Object invoke;
        List<Throwable> o00oo0o2;
        o0ooO.o00oo0O0(th, "exception");
        Method method = o00oOOo0.f13444o00oOo00;
        return (method == null || (invoke = method.invoke(th, new Object[0])) == null || (o00oo0o2 = o0OO0oO.o0O00000.o00oo0o((Throwable[]) invoke)) == null) ? o0OO0oO.o0ooO.INSTANCE : o00oo0o2;
    }
}
