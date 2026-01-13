package o0OOOoO0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o0O00Oo.o0oO0Ooo;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SubSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
/* loaded from: classes3.dex */
public final class oO0OOo0o<T> implements oO000<T>, o0oo0000<T> {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final oO000<T> f13824o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final int f13825o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final int f13826o00oOo00;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements Iterator<T>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f13827o00oo0O;
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final Iterator<T> f13828o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ oO0OOo0o<T> f13829o00oo0Oo;

        public o00oOOo0(oO0OOo0o<T> oo0ooo0o) {
            this.f13829o00oo0Oo = oo0ooo0o;
            this.f13828o00oo0O0 = oo0ooo0o.f13824o00oOOo0.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            o00oOOo0();
            return this.f13827o00oo0O < this.f13829o00oo0Oo.f13826o00oOo00 && this.f13828o00oo0O0.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            o00oOOo0();
            int i = this.f13827o00oo0O;
            if (i < this.f13829o00oo0Oo.f13826o00oOo00) {
                this.f13827o00oo0O = i + 1;
                return this.f13828o00oo0O0.next();
            }
            throw new NoSuchElementException();
        }

        public final void o00oOOo0() {
            while (this.f13827o00oo0O < this.f13829o00oo0Oo.f13825o00oOOoO && this.f13828o00oo0O0.hasNext()) {
                this.f13828o00oo0O0.next();
                this.f13827o00oo0O++;
            }
        }

        @NotNull
        public final Iterator<T> o00oOOoO() {
            return this.f13828o00oo0O0;
        }

        public final int o00oOo00() {
            return this.f13827o00oo0O;
        }

        public final void o00oOooO(int i) {
            this.f13827o00oo0O = i;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oO0OOo0o(@NotNull oO000<? extends T> oo000, int i, int i2) {
        o0ooO.o00oo0O0(oo000, "sequence");
        this.f13824o00oOOo0 = oo000;
        this.f13825o00oOOoO = i;
        this.f13826o00oOo00 = i2;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("startIndex should be non-negative, but is ", i).toString());
        }
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("endIndex should be non-negative, but is ", i2).toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(o0oO0Ooo.o00oOOo0("endIndex should be not less than startIndex, but was ", i2, " < ", i).toString());
        }
    }

    @Override // o0OOOoO0.oO000
    @NotNull
    public Iterator<T> iterator() {
        return new o00oOOo0(this);
    }

    @Override // o0OOOoO0.o0oo0000
    @NotNull
    public oO000<T> o00oOOo0(int i) {
        int i2 = this.f13826o00oOo00;
        int i3 = this.f13825o00oOOoO;
        return i >= i2 - i3 ? o.f13767o00oOOo0 : new oO0OOo0o(this.f13824o00oOOo0, i3 + i, i2);
    }

    @Override // o0OOOoO0.o0oo0000
    @NotNull
    public oO000<T> o00oOOoO(int i) {
        int i2 = this.f13826o00oOo00;
        int i3 = this.f13825o00oOOoO;
        return i >= i2 - i3 ? this : new oO0OOo0o(this.f13824o00oOOo0, i3, i + i3);
    }

    public final int o00oOo0o() {
        return this.f13826o00oOo00 - this.f13825o00oOOoO;
    }
}
