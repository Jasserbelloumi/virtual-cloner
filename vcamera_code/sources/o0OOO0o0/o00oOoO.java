package o0OOO0o0;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import o0OOO0Oo.o0O000O;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import o0OOOo0.o00oOo00;
import o0OOOo0.o00oo0;
import o0OOOo0O.o0O00O0;
import o0OOOo0o.o0O0O0Oo;
import o0OOOoo0.oO00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public class o00oOoO extends o0O000O {

    @o0OOO00({"SMAP\nJDK8PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK8PlatformImplementations.kt\nkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final o00oOOo0 f13448o00oOOo0 = new o00oOOo0();
        @o0OOOO0o.o00oOoO
        @Nullable

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final Integer f13449o00oOOoO;

        /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
        static {
            /*
                o0OOO0o0.o00oOoO$o00oOOo0 r0 = new o0OOO0o0.o00oOoO$o00oOOo0
                r0.<init>()
                o0OOO0o0.o00oOoO.o00oOOo0.f13448o00oOOo0 = r0
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
                o0OOO0o0.o00oOoO.o00oOOo0.f13449o00oOOoO = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOO0o0.o00oOoO.o00oOOo0.<clinit>():void");
        }
    }

    private final boolean o00oOo0O(int i) {
        Integer num = o00oOOo0.f13449o00oOOoO;
        return num == null || num.intValue() >= i;
    }

    @Override // o0OOO0OO.o00oo
    @NotNull
    public o00oo0 o00oOOoO() {
        return o00oOo0O(34) ? new o0O00O0() : new o00oOo00();
    }

    @Override // o0OOO0OO.o00oo
    @Nullable
    public oO00Oo0 o00oOo00(@NotNull MatchResult matchResult, @NotNull String str) {
        o0ooO.o00oo0O0(matchResult, "matchResult");
        o0ooO.o00oo0O0(str, "name");
        Matcher matcher = matchResult instanceof Matcher ? (Matcher) matchResult : null;
        if (matcher != null) {
            o0O0O0Oo o0o0o0oo = new o0O0O0Oo(matcher.start(str), matcher.end(str) - 1);
            if (o0o0o0oo.o00oOOo0().intValue() >= 0) {
                String group = matcher.group(str);
                o0ooO.o00oo0OO(group, "matcher.group(name)");
                return new oO00Oo0(group, o0o0o0oo);
            }
            return null;
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
