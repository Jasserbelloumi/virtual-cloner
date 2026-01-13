package o0OOOooO;

import java.util.concurrent.TimeUnit;
import o0OO0o.o0OO00o0;
import o0OO0o.oO0Oo0oo;
import org.jetbrains.annotations.NotNull;
@oO0Oo0oo(markerClass = {o0O0OOO0.class})
@o0OO00o0(version = "1.6")
/* loaded from: classes3.dex */
public enum o0O0O0o0 {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    
    @NotNull
    private final TimeUnit timeUnit;

    o0O0O0o0(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    @NotNull
    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }
}
