package o0OOOO0o;

import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public class o0O0000O extends Error {
    public o0O0000O() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public o0O0000O(@Nullable String str) {
        super(str);
    }

    public o0O0000O(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }

    public o0O0000O(@Nullable Throwable th) {
        super(th);
    }
}
