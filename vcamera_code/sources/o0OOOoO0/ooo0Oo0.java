package o0OOOoO0;

import java.util.Iterator;
import o0OOOO.o00oo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class ooo0Oo0<T> implements oO000<T> {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final oO000<T> f13857o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oo<T, Boolean> f13858o00oOOoO;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements Iterator<T>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f13859o00oo0O = -1;
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final Iterator<T> f13860o00oo0O0;
        @Nullable

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public T f13861o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final /* synthetic */ ooo0Oo0<T> f13862o00oo0o0;

        public o00oOOo0(ooo0Oo0<T> ooo0oo0) {
            this.f13862o00oo0o0 = ooo0oo0;
            this.f13860o00oo0O0 = ooo0oo0.f13857o00oOOo0.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13859o00oo0O == -1) {
                o00oOOo0();
            }
            return this.f13859o00oo0O == 1 || this.f13860o00oo0O0.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f13859o00oo0O == -1) {
                o00oOOo0();
            }
            if (this.f13859o00oo0O == 1) {
                T t = this.f13861o00oo0Oo;
                this.f13861o00oo0Oo = null;
                this.f13859o00oo0O = 0;
                return t;
            }
            return this.f13860o00oo0O0.next();
        }

        public final void o00oOOo0() {
            int i;
            while (true) {
                if (!this.f13860o00oo0O0.hasNext()) {
                    i = 0;
                    break;
                }
                T next = this.f13860o00oo0O0.next();
                if (!this.f13862o00oo0o0.f13858o00oOOoO.invoke(next).booleanValue()) {
                    this.f13861o00oo0Oo = next;
                    i = 1;
                    break;
                }
            }
            this.f13859o00oo0O = i;
        }

        public final int o00oOOoO() {
            return this.f13859o00oo0O;
        }

        @NotNull
        public final Iterator<T> o00oOo00() {
            return this.f13860o00oo0O0;
        }

        public final void o00oOo0O(int i) {
            this.f13859o00oo0O = i;
        }

        public final void o00oOoO0(@Nullable T t) {
            this.f13861o00oo0Oo = t;
        }

        @Nullable
        public final T o00oOooO() {
            return this.f13861o00oo0Oo;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ooo0Oo0(@NotNull oO000<? extends T> oo000, @NotNull o00oo<? super T, Boolean> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "sequence");
        o0ooO.o00oo0O0(o00ooVar, "predicate");
        this.f13857o00oOOo0 = oo000;
        this.f13858o00oOOoO = o00ooVar;
    }

    @Override // o0OOOoO0.oO000
    @NotNull
    public Iterator<T> iterator() {
        return new o00oOOo0(this);
    }
}
