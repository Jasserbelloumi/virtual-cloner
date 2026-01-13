package o0OOOO00;

import o0OO0o.o0O;
import o0OO0o.o0O00000;
import o0OO0o.o0OO00o0;
import o0OOO0OO.o00oo00O;
import o0OOOO.o00oo;
import o0OOOO0o.o00oo0OO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.Nullable;
@o00oo0OO(name = "AutoCloseableKt")
/* loaded from: classes3.dex */
public final class o00oOOo0 {
    @o0O
    @o0OO00o0(version = "1.2")
    public static final void o00oOOo0(@Nullable AutoCloseable autoCloseable, @Nullable Throwable th) {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                o0O00000.o00oOOo0(th, th2);
            }
        }
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final <T extends AutoCloseable, R> R o00oOOoO(T t, o00oo<? super T, ? extends R> o00ooVar) {
        o0ooO.o00oo0O0(o00ooVar, "block");
        try {
            R invoke = o00ooVar.invoke(t);
            o00oOOo0(t, null);
            return invoke;
        } finally {
        }
    }
}
