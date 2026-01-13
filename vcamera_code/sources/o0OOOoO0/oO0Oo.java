package o0OOOoO0;

import java.util.Iterator;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
/* loaded from: classes3.dex */
public final class oO0Oo<T> implements oO000<T>, o0oo0000<T> {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final oO000<T> f13830o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final int f13831o00oOOoO;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements Iterator<T>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f13832o00oo0O;
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final Iterator<T> f13833o00oo0O0;

        public o00oOOo0(oO0Oo<T> oo0oo) {
            this.f13833o00oo0O0 = oo0oo.f13830o00oOOo0.iterator();
            this.f13832o00oo0O = oo0oo.f13831o00oOOoO;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            o00oOOo0();
            return this.f13833o00oo0O0.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            o00oOOo0();
            return this.f13833o00oo0O0.next();
        }

        public final void o00oOOo0() {
            while (this.f13832o00oo0O > 0 && this.f13833o00oo0O0.hasNext()) {
                this.f13833o00oo0O0.next();
                this.f13832o00oo0O--;
            }
        }

        @NotNull
        public final Iterator<T> o00oOOoO() {
            return this.f13833o00oo0O0;
        }

        public final int o00oOo00() {
            return this.f13832o00oo0O;
        }

        public final void o00oOooO(int i) {
            this.f13832o00oo0O = i;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oO0Oo(@NotNull oO000<? extends T> oo000, int i) {
        o0ooO.o00oo0O0(oo000, "sequence");
        this.f13830o00oOOo0 = oo000;
        this.f13831o00oOOoO = i;
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
        int i2 = this.f13831o00oOOoO + i;
        return i2 < 0 ? new oO0Oo(this, i) : new oO0Oo(this.f13830o00oOOo0, i2);
    }

    @Override // o0OOOoO0.o0oo0000
    @NotNull
    public oO000<T> o00oOOoO(int i) {
        int i2 = this.f13831o00oOOoO;
        int i3 = i2 + i;
        return i3 < 0 ? new oO000Oo0(this, i) : new oO0OOo0o(this.f13830o00oOOo0, i2, i3);
    }
}
