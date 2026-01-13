package androidx.lifecycle;

import java.time.Duration;
import org.jetbrains.annotations.NotNull;
@o00oOooO.o0OOooO0(26)
/* loaded from: classes.dex */
public final class o00oOo00 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o00oOo00 f3280o00oOOo0 = new o00oOo00();

    public final long o00oOOo0(@NotNull Duration duration) {
        o0OOOOO0.o0ooO.o00oo0O0(duration, "timeout");
        return duration.toMillis();
    }
}
