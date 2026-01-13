package o0OOO0oO;

import java.io.File;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public class o0O0oo0o extends o0oO0O0o {
    public static /* synthetic */ o0oO0Ooo o00ooo0(File file, o0O00o00 o0o00o00, int i, Object obj) {
        if ((i & 1) != 0) {
            o0o00o00 = o0O00o00.TOP_DOWN;
        }
        return o00ooo00(file, o0o00o00);
    }

    @NotNull
    public static final o0oO0Ooo o00ooo00(@NotNull File file, @NotNull o0O00o00 o0o00o00) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "direction");
        return new o0oO0Ooo(file, o0o00o00);
    }

    @NotNull
    public static final o0oO0Ooo o00ooo0O(@NotNull File file) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        return o00ooo00(file, o0O00o00.BOTTOM_UP);
    }

    @NotNull
    public static final o0oO0Ooo o00ooo0o(@NotNull File file) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        return o00ooo00(file, o0O00o00.TOP_DOWN);
    }
}
