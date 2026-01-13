package o0OO0oO;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0O0o00O<T> implements Iterator<o0O0o000<? extends T>>, o0OOOOO.o00oOOo0 {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f13363o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Iterator<T> f13364o00oo0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public o0O0o00O(@NotNull Iterator<? extends T> it) {
        o0OOOOO0.o0ooO.o00oo0O0(it, "iterator");
        this.f13364o00oo0O0 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13364o00oo0O0.hasNext();
    }

    @Override // java.util.Iterator
    @NotNull
    /* renamed from: o00oOOo0 */
    public final o0O0o000<T> next() {
        int i = this.f13363o00oo0O;
        this.f13363o00oo0O = i + 1;
        if (i < 0) {
            o0O00O0o.o0O0000O();
        }
        return new o0O0o000<>(i, this.f13364o00oo0O0.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
