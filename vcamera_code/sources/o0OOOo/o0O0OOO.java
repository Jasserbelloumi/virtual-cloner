package o0OOOo;

import o0OO0o.o0OO00o0;
import o0OOOO.o0O00000;
import o0OOOo.o0O0OO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public interface o0O0OOO<D, E, V> extends o0O0OO0<V>, o0O00000<D, E, V> {

    /* loaded from: classes3.dex */
    public interface o00oOOo0<D, E, V> extends o0O0OO0.o00oOo00<V>, o0O00000<D, E, V> {
    }

    V get(D d, E e);

    @o0OO00o0(version = "1.1")
    @Nullable
    Object getDelegate(D d, E e);

    @Override // o0OOOo.o0O0OO0
    @NotNull
    o00oOOo0<D, E, V> getGetter();
}
