package o0OOOoO0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/TakeSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
/* loaded from: classes3.dex */
public final class oO000Oo0<T> implements oO000<T>, o0oo0000<T> {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final oO000<T> f13811o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final int f13812o00oOOoO;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements Iterator<T>, o0OOOOO.o00oOOo0 {
        @NotNull

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final Iterator<T> f13813o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f13814o00oo0O0;

        public o00oOOo0(oO000Oo0<T> oo000oo0) {
            this.f13814o00oo0O0 = oo000oo0.f13812o00oOOoO;
            this.f13813o00oo0O = oo000oo0.f13811o00oOOo0.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13814o00oo0O0 > 0 && this.f13813o00oo0O.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.f13814o00oo0O0;
            if (i != 0) {
                this.f13814o00oo0O0 = i - 1;
                return this.f13813o00oo0O.next();
            }
            throw new NoSuchElementException();
        }

        @NotNull
        public final Iterator<T> o00oOOo0() {
            return this.f13813o00oo0O;
        }

        public final int o00oOOoO() {
            return this.f13814o00oo0O0;
        }

        public final void o00oOo00(int i) {
            this.f13814o00oo0O0 = i;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oO000Oo0(@NotNull oO000<? extends T> oo000, int i) {
        o0ooO.o00oo0O0(oo000, "sequence");
        this.f13811o00oOOo0 = oo000;
        this.f13812o00oOOoO = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // o0OOOoO0.oO000
    @NotNull
    public Iterator<T> iterator() {
        return new o00oOOo0(this);
    }

    @Override // o0OOOoO0.o0oo0000
    @NotNull
    public oO000<T> o00oOOo0(int i) {
        int i2 = this.f13812o00oOOoO;
        return i >= i2 ? o.f13767o00oOOo0 : new oO0OOo0o(this.f13811o00oOOo0, i, i2);
    }

    @Override // o0OOOoO0.o0oo0000
    @NotNull
    public oO000<T> o00oOOoO(int i) {
        return i >= this.f13812o00oOOoO ? this : new oO000Oo0(this.f13811o00oOOo0, i);
    }
}
