package o0OOOoO0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o0OOOO.o00oo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class oO00000o<T, R, E> implements oO000<E> {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final oO000<T> f13781o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oo<T, R> f13782o00oOOoO;
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o00oo<R, Iterator<E>> f13783o00oOo00;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements Iterator<E>, o0OOOOO.o00oOOo0 {
        @Nullable

        /* renamed from: o00oo0O  reason: collision with root package name */
        public Iterator<? extends E> f13784o00oo0O;
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final Iterator<T> f13785o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ oO00000o<T, R, E> f13786o00oo0Oo;

        public o00oOOo0(oO00000o<T, R, E> oo00000o) {
            this.f13786o00oo0Oo = oo00000o;
            this.f13785o00oo0O0 = oo00000o.f13781o00oOOo0.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return o00oOOo0();
        }

        @Override // java.util.Iterator
        public E next() {
            if (o00oOOo0()) {
                Iterator<? extends E> it = this.f13784o00oo0O;
                o0ooO.o00oo00O(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean o00oOOo0() {
            /*
                r5 = this;
                java.util.Iterator<? extends E> r0 = r5.f13784o00oo0O
                r1 = 1
                r2 = 0
                if (r0 == 0) goto Le
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto Le
                r0 = r1
                goto Lf
            Le:
                r0 = r2
            Lf:
                if (r0 == 0) goto L14
                r0 = 0
                r5.f13784o00oo0O = r0
            L14:
                java.util.Iterator<? extends E> r0 = r5.f13784o00oo0O
                if (r0 != 0) goto L3f
                java.util.Iterator<T> r0 = r5.f13785o00oo0O0
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L21
                return r2
            L21:
                java.util.Iterator<T> r0 = r5.f13785o00oo0O0
                java.lang.Object r0 = r0.next()
                o0OOOoO0.oO00000o<T, R, E> r3 = r5.f13786o00oo0Oo
                o0OOOO.o00oo<R, java.util.Iterator<E>> r4 = r3.f13783o00oOo00
                o0OOOO.o00oo<T, R> r3 = r3.f13782o00oOOoO
                java.lang.Object r0 = r3.invoke(r0)
                java.lang.Object r0 = r4.invoke(r0)
                java.util.Iterator r0 = (java.util.Iterator) r0
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L14
                r5.f13784o00oo0O = r0
            L3f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOOoO0.oO00000o.o00oOOo0.o00oOOo0():boolean");
        }

        @Nullable
        public final Iterator<E> o00oOOoO() {
            return (Iterator<? extends E>) this.f13784o00oo0O;
        }

        @NotNull
        public final Iterator<T> o00oOo00() {
            return this.f13785o00oo0O0;
        }

        public final void o00oOooO(@Nullable Iterator<? extends E> it) {
            this.f13784o00oo0O = it;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oO00000o(@NotNull oO000<? extends T> oo000, @NotNull o00oo<? super T, ? extends R> o00ooVar, @NotNull o00oo<? super R, ? extends Iterator<? extends E>> o00ooVar2) {
        o0ooO.o00oo0O0(oo000, "sequence");
        o0ooO.o00oo0O0(o00ooVar, "transformer");
        o0ooO.o00oo0O0(o00ooVar2, "iterator");
        this.f13781o00oOOo0 = oo000;
        this.f13782o00oOOoO = o00ooVar;
        this.f13783o00oOo00 = o00ooVar2;
    }

    @Override // o0OOOoO0.oO000
    @NotNull
    public Iterator<E> iterator() {
        return new o00oOOo0(this);
    }
}
