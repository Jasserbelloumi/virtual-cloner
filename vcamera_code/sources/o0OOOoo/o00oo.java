package o0OOOoo;

import o0OO0o.o0OO00o0;
import o0OOOO0o.o00oo0OO;
import o0OOOOO0.o0ooO;
import o0OOOoo0.oO00Oo0;
import o0OOOoo0.oO00o000;
import o0OOOoo0.oOOoOOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o00oo0OO(name = "RegexExtensionsJDK8Kt")
/* loaded from: classes3.dex */
public final class o00oo {
    @o0OO00o0(version = "1.2")
    @Nullable
    public static final oO00Oo0 o00oOOo0(@NotNull oOOoOOO0 ooooooo0, @NotNull String str) {
        o0ooO.o00oo0O0(ooooooo0, "<this>");
        o0ooO.o00oo0O0(str, "name");
        oO00o000 oo00o000 = ooooooo0 instanceof oO00o000 ? (oO00o000) ooooooo0 : null;
        if (oo00o000 != null) {
            return oo00o000.get(str);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
