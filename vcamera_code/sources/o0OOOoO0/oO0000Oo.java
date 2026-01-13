package o0OOOoO0;

import java.util.Iterator;
import o0OO0oO.o0O00O0o;
import o0OO0oO.o0O0o000;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class oO0000Oo<T> implements oO000<o0O0o000<? extends T>> {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final oO000<T> f13792o00oOOo0;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements Iterator<o0O0o000<? extends T>>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f13793o00oo0O;
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final Iterator<T> f13794o00oo0O0;

        public o00oOOo0(oO0000Oo<T> oo0000oo) {
            this.f13794o00oo0O0 = oo0000oo.f13792o00oOOo0.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13794o00oo0O0.hasNext();
        }

        public final int o00oOOo0() {
            return this.f13793o00oo0O;
        }

        @NotNull
        public final Iterator<T> o00oOOoO() {
            return this.f13794o00oo0O0;
        }

        @Override // java.util.Iterator
        @NotNull
        /* renamed from: o00oOo00 */
        public o0O0o000<T> next() {
            int i = this.f13793o00oo0O;
            this.f13793o00oo0O = i + 1;
            if (i < 0) {
                o0O00O0o.o0O0000O();
            }
            return new o0O0o000<>(i, this.f13794o00oo0O0.next());
        }

        public final void o00oOooO(int i) {
            this.f13793o00oo0O = i;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oO0000Oo(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "sequence");
        this.f13792o00oOOo0 = oo000;
    }

    @Override // o0OOOoO0.oO000
    @NotNull
    public Iterator<o0O0o000<T>> iterator() {
        return new o00oOOo0(this);
    }
}
