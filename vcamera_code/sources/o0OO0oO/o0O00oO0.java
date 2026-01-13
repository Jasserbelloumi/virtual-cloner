package o0OO0oO;

import java.util.List;
import o00ooOoo.oO00O0oO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public class o0O00oO0 extends o0O00o00 {
    @o0OOOO0o.o00oo0OO(name = "asReversedMutable")
    @NotNull
    public static final <T> List<T> o0O0OoO(@NotNull List<T> list) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "<this>");
        return new o0OO0O0(list);
    }

    public static final int o0O0OoOo(List<?> list, int i) {
        if (new o0OOOo0o.o0O0O0Oo(0, o0O00O0o.o00ooOo(list)).o00oOoo0(i)) {
            return o0O00O0o.o00ooOo(list) - i;
        }
        StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("Element index ", i, " must be in range [");
        o00oOOo02.append(new o0OOOo0o.o0O0O0Oo(0, o0O00O0o.o00ooOo(list)));
        o00oOOo02.append("].");
        throw new IndexOutOfBoundsException(o00oOOo02.toString());
    }

    public static final int o0O0Ooo0(List<?> list, int i) {
        if (new o0OOOo0o.o0O0O0Oo(0, list.size()).o00oOoo0(i)) {
            return list.size() - i;
        }
        StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("Position index ", i, " must be in range [");
        o00oOOo02.append(new o0OOOo0o.o0O0O0Oo(0, list.size()));
        o00oOOo02.append("].");
        throw new IndexOutOfBoundsException(o00oOOo02.toString());
    }

    @NotNull
    public static final <T> List<T> oo0OOoo(@NotNull List<? extends T> list) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "<this>");
        return new o0OOooO0(list);
    }
}
