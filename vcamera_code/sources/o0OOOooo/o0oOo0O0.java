package o0OOOooo;

import java.time.Duration;
import o0OO0o.o0OO00o0;
import o0OO0o.oO0Oo0oo;
import o0OOO0OO.o00oo00O;
import o0OOOO0o.o00oo0OO;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import o0OOOooO.o0O0O0Oo;
import o0OOOooO.o0O0O0o0;
import o0OOOooO.o0O0OOO0;
import o0OOOooO.o0oO0O0o;
@o00oo0OO(name = "DurationConversionsJDK8Kt")
@o0OOO00({"SMAP\nDurationConversions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n+ 2 Duration.kt\nkotlin/time/Duration\n*L\n1#1,33:1\n720#2,2:34\n*S KotlinDebug\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n*L\n33#1:34,2\n*E\n"})
/* loaded from: classes3.dex */
public final class o0oOo0O0 {
    @oO0Oo0oo(markerClass = {o0O0OOO0.class})
    @o00oo00O
    @o0OO00o0(version = "1.6")
    public static final Duration o00oOOo0(long j) {
        Duration ofSeconds = Duration.ofSeconds(o0oO0O0o.o00oooOo(j), o0oO0O0o.o00ooooo(j));
        o0ooO.o00oo0OO(ofSeconds, "toJavaDuration-LRDsOJo");
        return ofSeconds;
    }

    @oO0Oo0oo(markerClass = {o0O0OOO0.class})
    @o00oo00O
    @o0OO00o0(version = "1.6")
    public static final long o00oOOoO(Duration duration) {
        o0ooO.o00oo0O0(duration, "<this>");
        return o0oO0O0o.o0O00(o0O0O0Oo.o0O00OOO(duration.getSeconds(), o0O0O0o0.SECONDS), o0O0O0Oo.o0O00OO(duration.getNano(), o0O0O0o0.NANOSECONDS));
    }
}
