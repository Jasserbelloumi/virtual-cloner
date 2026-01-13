package o0OOO0Oo;

import java.util.List;
import o0OO0oO.o0O00000;
import o0OOO0OO.o00oo;
import o0OOOO0o.o00oOoO;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public class o0O000O extends o00oo {

    @o0OOO00({"SMAP\nJDK7PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK7PlatformImplementations.kt\nkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final o00oOOo0 f13446o00oOOo0 = new o00oOOo0();
        @o00oOoO
        @Nullable

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final Integer f13447o00oOOoO;

        /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
        static {
            /*
                o0OOO0Oo.o0O000O$o00oOOo0 r0 = new o0OOO0Oo.o0O000O$o00oOOo0
                r0.<init>()
                o0OOO0Oo.o0O000O.o00oOOo0.f13446o00oOOo0 = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1f
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1f
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L1f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1f
                goto L20
            L1f:
                r1 = r0
            L20:
                if (r1 == 0) goto L2e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L2a
                r2 = 1
                goto L2b
            L2a:
                r2 = 0
            L2b:
                if (r2 == 0) goto L2e
                r0 = r1
            L2e:
                o0OOO0Oo.o0O000O.o00oOOo0.f13447o00oOOoO = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOO0Oo.o0O000O.o00oOOo0.<clinit>():void");
        }
    }

    @Override // o0OOO0OO.o00oo
    public void o00oOOo0(@NotNull Throwable th, @NotNull Throwable th2) {
        o0ooO.o00oo0O0(th, "cause");
        o0ooO.o00oo0O0(th2, "exception");
        if (o00oOo0O(19)) {
            th.addSuppressed(th2);
        } else {
            super.o00oOOo0(th, th2);
        }
    }

    public final boolean o00oOo0O(int i) {
        Integer num = o00oOOo0.f13447o00oOOoO;
        return num == null || num.intValue() >= i;
    }

    @Override // o0OOO0OO.o00oo
    @NotNull
    public List<Throwable> o00oOooO(@NotNull Throwable th) {
        o0ooO.o00oo0O0(th, "exception");
        if (o00oOo0O(19)) {
            Throwable[] suppressed = th.getSuppressed();
            o0ooO.o00oo0OO(suppressed, "exception.suppressed");
            return o0O00000.o00oo0o(suppressed);
        }
        return super.o00oOooO(th);
    }
}
