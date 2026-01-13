package o0OOOo;

import o0OO0o.o0OO00o0;
import o0OOOO.o00oo;
import o0OOOo.o0O0OO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public interface o0O0OOO0<T, V> extends o0O0OO0<V>, o00oo<T, V> {

    /* loaded from: classes3.dex */
    public interface o00oOOo0<T, V> extends o0O0OO0.o00oOo00<V>, o00oo<T, V> {
    }

    V get(T t);

    @o0OO00o0(version = "1.1")
    @Nullable
    Object getDelegate(T t);

    @Override // o0OOOo.o0O0OO0
    @NotNull
    o00oOOo0<T, V> getGetter();
}
