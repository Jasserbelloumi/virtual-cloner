package o0OOOoO0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0OOOO<T> implements oO000<T> {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final AtomicReference<oO000<T>> f13768o00oOOo0;

    public o0OOOO(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "sequence");
        this.f13768o00oOOo0 = new AtomicReference<>(oo000);
    }

    @Override // o0OOOoO0.oO000
    @NotNull
    public Iterator<T> iterator() {
        oO000<T> andSet = this.f13768o00oOOo0.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
