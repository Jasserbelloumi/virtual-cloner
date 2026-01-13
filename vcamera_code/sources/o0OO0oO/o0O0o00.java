package o0OO0oO;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0O0o00<T> implements Iterable<o0O0o000<? extends T>>, o0OOOOO.o00oOOo0 {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0OOOO.o00oOOo0<Iterator<T>> f13360o00oo0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public o0O0o00(@NotNull o0OOOO.o00oOOo0<? extends Iterator<? extends T>> o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "iteratorFactory");
        this.f13360o00oo0O0 = o00oooo02;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<o0O0o000<T>> iterator() {
        return new o0O0o00O(this.f13360o00oo0O0.invoke());
    }
}
