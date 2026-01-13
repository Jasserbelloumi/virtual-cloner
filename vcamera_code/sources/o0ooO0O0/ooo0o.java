package o0ooO0O0;

import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.Metadata;
import multispace.multiapp.clone.app.App;
import o00oOooO.o0OOO0O;
import o0OOOOO0.o0ooO;
import o0OOoO0.o00oo;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "id", "", "", "arg", "o00oOOo0", "(I[Ljava/lang/String;)Ljava/lang/String;", "app_vcamRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class ooo0o {
    @NotNull
    public static final String o00oOOo0(@o0OOO0O int i, @NotNull String... strArr) {
        String string;
        String o00oOOo02;
        o0ooO.o00oo0O0(strArr, o00oo.o00oOOo0(new byte[]{-87, 86, 100}, new byte[]{-56, 36, 3, -119, 103, -7, -49, 35}));
        if (strArr.length == 0) {
            string = App.f6679o00oo0Oo.o00oOOo0().getString(i);
            o00oOOo02 = o00oo.o00oOOo0(new byte[]{84, 68, 35, 60, -116, -100, -4, Ascii.GS, 122, 90, 39, 119, -109, -115, -96, 119, 59, 83, 54, 102, -72, -115, -6, 55, 123, 83, 123, 123, -113, -48}, new byte[]{Ascii.NAK, 52, 83, Ascii.DC2, -21, -7, -120, 94});
        } else {
            string = App.f6679o00oo0Oo.o00oOOo0().getString(i, Arrays.copyOf(strArr, strArr.length));
            o00oOOo02 = o00oo.o00oOOo0(new byte[]{109, 0, 78, -31, 55, -121, 100, 10, 67, Ascii.RS, 74, -86, 40, -106, 56, 96, 2, Ascii.ETB, 91, -69, 3, -106, 98, 32, 66, Ascii.ETB, Ascii.SYN, -90, 52, -50, 58, 40, 94, Ascii.ETB, Ascii.ETB}, new byte[]{44, 112, 62, -49, 80, -30, Ascii.DLE, 73});
        }
        o0ooO.o00oo0OO(string, o00oOOo02);
        return string;
    }
}
