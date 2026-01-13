package o0OOOoO0;

import java.util.Iterator;
import o0OOOO.o0O00000;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class oO0000o0<T1, T2, V> implements oO000<V> {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final oO000<T1> f13795o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final oO000<T2> f13796o00oOOoO;
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o0O00000<T1, T2, V> f13797o00oOo00;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements Iterator<V>, o0OOOOO.o00oOOo0 {
        @NotNull

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final Iterator<T2> f13798o00oo0O;
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final Iterator<T1> f13799o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ oO0000o0<T1, T2, V> f13800o00oo0Oo;

        public o00oOOo0(oO0000o0<T1, T2, V> oo0000o0) {
            this.f13800o00oo0Oo = oo0000o0;
            this.f13799o00oo0O0 = oo0000o0.f13795o00oOOo0.iterator();
            this.f13798o00oo0O = oo0000o0.f13796o00oOOoO.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13799o00oo0O0.hasNext() && this.f13798o00oo0O.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return this.f13800o00oo0Oo.f13797o00oOo00.invoke(this.f13799o00oo0O0.next(), this.f13798o00oo0O.next());
        }

        @NotNull
        public final Iterator<T1> o00oOOo0() {
            return this.f13799o00oo0O0;
        }

        @NotNull
        public final Iterator<T2> o00oOOoO() {
            return this.f13798o00oo0O;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oO0000o0(@NotNull oO000<? extends T1> oo000, @NotNull oO000<? extends T2> oo0002, @NotNull o0O00000<? super T1, ? super T2, ? extends V> o0o00000) {
        o0ooO.o00oo0O0(oo000, "sequence1");
        o0ooO.o00oo0O0(oo0002, "sequence2");
        o0ooO.o00oo0O0(o0o00000, "transform");
        this.f13795o00oOOo0 = oo000;
        this.f13796o00oOOoO = oo0002;
        this.f13797o00oOo00 = o0o00000;
    }

    @Override // o0OOOoO0.oO000
    @NotNull
    public Iterator<V> iterator() {
        return new o00oOOo0(this);
    }
}
