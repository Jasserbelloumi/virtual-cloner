package o0OO0oo0;

import java.util.Comparator;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0O000<T> implements Comparator<T> {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Comparator<T> f13427o00oo0O0;

    public o0O000(@NotNull Comparator<T> comparator) {
        o0ooO.o00oo0O0(comparator, "comparator");
        this.f13427o00oo0O0 = comparator;
    }

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        return this.f13427o00oo0O0.compare(t2, t);
    }

    @NotNull
    public final Comparator<T> o00oOOo0() {
        return this.f13427o00oo0O0;
    }

    @Override // java.util.Comparator
    @NotNull
    public final Comparator<T> reversed() {
        return this.f13427o00oo0O0;
    }
}
