package o0OOO0oO;

import java.io.Closeable;
import o0OO0o.o0O;
import o0OO0o.o0O00000;
import o0OO0o.o0OO00o0;
import o0OOO0OO.o00oo00O;
import o0OOO0OO.o00ooO0;
import o0OOOO.o00oo;
import o0OOOO0o.o00oo0OO;
import org.jetbrains.annotations.Nullable;
@o00oo0OO(name = "CloseableKt")
/* loaded from: classes3.dex */
public final class o0O000o0 {
    @o0O
    @o0OO00o0(version = "1.1")
    public static final void o00oOOo0(@Nullable Closeable closeable, @Nullable Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                o0O00000.o00oOOo0(th, th2);
            }
        }
    }

    @o00oo00O
    public static final <T extends Closeable, R> R o00oOOoO(T t, o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "block");
        try {
            R invoke = o00ooVar.invoke(t);
            if (o00ooO0.o00oOOo0(1, 1, 0)) {
                o00oOOo0(t, null);
            } else if (t != null) {
                t.close();
            }
            return invoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (o00ooO0.o00oOOo0(1, 1, 0)) {
                    o00oOOo0(t, th);
                } else if (t != null) {
                    try {
                        t.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }
}
