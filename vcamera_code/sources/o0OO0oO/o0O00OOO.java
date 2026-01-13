package o0OO0oO;

import java.util.Iterator;
import o0OO0o.oO0Ooooo;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public class o0O00OOO extends o0O00OO {
    /* JADX WARN: Multi-variable type inference failed */
    @o0OOO0OO.o00oo00O
    public static final <T> Iterator<T> o0O000o(Iterator<? extends T> it) {
        o0OOOOO0.o0ooO.o00oo0O0(it, "<this>");
        return it;
    }

    public static final <T> void o0O000o0(@NotNull Iterator<? extends T> it, @NotNull o0OOOO.o00oo<? super T, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(it, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "operation");
        while (it.hasNext()) {
            o00ooVar.invoke((T) it.next());
        }
    }

    @NotNull
    public static final <T> Iterator<o0O0o000<T>> o0ooOoOO(@NotNull Iterator<? extends T> it) {
        o0OOOOO0.o0ooO.o00oo0O0(it, "<this>");
        return new o0O0o00O(it);
    }
}
