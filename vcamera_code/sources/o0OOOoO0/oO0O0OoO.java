package o0OOOoO0;

import java.util.Iterator;
import o0OOOO.o00oo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class oO0O0OoO<T, R> implements oO000<R> {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final oO000<T> f13820o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oo<T, R> f13821o00oOOoO;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements Iterator<R>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ oO0O0OoO<T, R> f13822o00oo0O;
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final Iterator<T> f13823o00oo0O0;

        public o00oOOo0(oO0O0OoO<T, R> oo0o0ooo) {
            this.f13822o00oo0O = oo0o0ooo;
            this.f13823o00oo0O0 = oo0o0ooo.f13820o00oOOo0.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13823o00oo0O0.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return this.f13822o00oo0O.f13821o00oOOoO.invoke(this.f13823o00oo0O0.next());
        }

        @NotNull
        public final Iterator<T> o00oOOo0() {
            return this.f13823o00oo0O0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oO0O0OoO(@NotNull oO000<? extends T> oo000, @NotNull o00oo<? super T, ? extends R> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "sequence");
        o0ooO.o00oo0O0(o00ooVar, "transformer");
        this.f13820o00oOOo0 = oo000;
        this.f13821o00oOOoO = o00ooVar;
    }

    @Override // o0OOOoO0.oO000
    @NotNull
    public Iterator<R> iterator() {
        return new o00oOOo0(this);
    }

    @NotNull
    public final <E> oO000<E> o00oOo0O(@NotNull o00oo<? super R, ? extends Iterator<? extends E>> o00ooVar) {
        o0ooO.o00oo0O0(o00ooVar, "iterator");
        return new oO00000o(this.f13820o00oOOo0, this.f13821o00oOOoO, o00ooVar);
    }
}
