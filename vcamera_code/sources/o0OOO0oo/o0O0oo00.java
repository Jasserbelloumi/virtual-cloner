package o0OOO0oo;

import java.io.InputStream;
import java.io.OutputStream;
import o0OO0o.o0OO00o0;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public class o0O0oo00 {
    @o0oOo0O0
    @o0OO00o0(version = "1.8")
    @NotNull
    public static final InputStream o00oOOo0(@NotNull InputStream inputStream, @NotNull oo0OOoo oo0oooo) {
        o0ooO.o00oo0O0(inputStream, "<this>");
        o0ooO.o00oo0O0(oo0oooo, "base64");
        return new o0O0o00O(inputStream, oo0oooo);
    }

    @o0oOo0O0
    @o0OO00o0(version = "1.8")
    @NotNull
    public static final OutputStream o00oOOoO(@NotNull OutputStream outputStream, @NotNull oo0OOoo oo0oooo) {
        o0ooO.o00oo0O0(outputStream, "<this>");
        o0ooO.o00oo0O0(oo0oooo, "base64");
        return new o0O0o0(outputStream, oo0oooo);
    }
}
