package o0OO0o;

import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class o0O0O0o0 extends Error {
    public o0O0O0o0() {
        this(null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0o0(@NotNull String str) {
        super(str);
        o0OOOOO0.o0ooO.o00oo0O0(str, "message");
    }

    public /* synthetic */ o0O0O0o0(String str, int i, o0OOOOO0.o0O00 o0o00) {
        this((i & 1) != 0 ? "An operation is not implemented." : str);
    }
}
