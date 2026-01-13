package o0OOOo0o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.Comparable;
import o0OOOo0o.o0O0OOO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public class o0O00oO0<T extends Comparable<? super T>> implements o0O0OOO<T> {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final T f13710o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final T f13711o00oo0O0;

    public o0O00oO0(@NotNull T t, @NotNull T t2) {
        o0OOOOO0.o0ooO.o00oo0O0(t, TtmlNode.START);
        o0OOOOO0.o0ooO.o00oo0O0(t2, "endExclusive");
        this.f13711o00oo0O0 = t;
        this.f13710o00oo0O = t2;
    }

    @Override // o0OOOo0o.o0O0OOO
    public boolean contains(@NotNull T t) {
        return o0O0OOO.o00oOOo0.o00oOOo0(this, t);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o0O00oO0) {
            if (!isEmpty() || !((o0O00oO0) obj).isEmpty()) {
                o0O00oO0 o0o00oo0 = (o0O00oO0) obj;
                if (!o0OOOOO0.o0ooO.o00oOoO0(o00oOOo0(), o0o00oo0.o00oOOo0()) || !o0OOOOO0.o0ooO.o00oOoO0(o00oOooO(), o0o00oo0.o00oOooO())) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (o00oOOo0().hashCode() * 31) + o00oOooO().hashCode();
    }

    @Override // o0OOOo0o.o0O0OOO
    public boolean isEmpty() {
        return o0O0OOO.o00oOOo0.o00oOOoO(this);
    }

    @Override // o0OOOo0o.o0O0OOO
    @NotNull
    public T o00oOOo0() {
        return this.f13711o00oo0O0;
    }

    @Override // o0OOOo0o.o0O0OOO
    @NotNull
    public T o00oOooO() {
        return this.f13710o00oo0O;
    }

    @NotNull
    public String toString() {
        return o00oOOo0() + "..<" + o00oOooO();
    }
}
