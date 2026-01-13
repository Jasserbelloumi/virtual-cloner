package o0OO;

import o0OO.o00oo0;
import o0OO0o.o0O000;
import o0OO0o.o0OO00o0;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class o00oo0OO {
    /* JADX WARN: Multi-variable type inference failed */
    @o0O000
    @o0OO00o0(version = "1.3")
    @Nullable
    public static final <E extends o00oo0.o00oOOoO> E o00oOOo0(@NotNull o00oo0.o00oOOoO o00ooooo2, @NotNull o00oo0.o00oOo00<E> o00ooo002) {
        o0ooO.o00oo0O0(o00ooooo2, "<this>");
        o0ooO.o00oo0O0(o00ooo002, "key");
        if (!(o00ooo002 instanceof o00oOOoO)) {
            if (o00ooooo2.getKey() == o00ooo002) {
                return o00ooooo2;
            }
            return null;
        }
        o00oOOoO o00ooooo3 = (o00oOOoO) o00ooo002;
        if (o00ooooo3.o00oOOo0(o00ooooo2.getKey())) {
            E e = (E) o00ooooo3.o00oOOoO(o00ooooo2);
            if (e instanceof o00oo0.o00oOOoO) {
                return e;
            }
            return null;
        }
        return null;
    }

    @o0O000
    @o0OO00o0(version = "1.3")
    @NotNull
    public static final o00oo0 o00oOOoO(@NotNull o00oo0.o00oOOoO o00ooooo2, @NotNull o00oo0.o00oOo00<?> o00ooo002) {
        o0ooO.o00oo0O0(o00ooooo2, "<this>");
        o0ooO.o00oo0O0(o00ooo002, "key");
        if (!(o00ooo002 instanceof o00oOOoO)) {
            return o00ooooo2.getKey() == o00ooo002 ? o00oo0O0.INSTANCE : o00ooooo2;
        }
        o00oOOoO o00ooooo3 = (o00oOOoO) o00ooo002;
        return (!o00ooooo3.o00oOOo0(o00ooooo2.getKey()) || o00ooooo3.o00oOOoO(o00ooooo2) == null) ? o00ooooo2 : o00oo0O0.INSTANCE;
    }
}
