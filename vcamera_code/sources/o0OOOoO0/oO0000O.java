package o0OOOoO0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o0OOOO.o00oo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class oO0000O<T> implements oO000<T> {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0OOOO.o00oOOo0<T> f13787o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oo<T, T> f13788o00oOOoO;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements Iterator<T>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f13789o00oo0O = -2;
        @Nullable

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public T f13790o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ oO0000O<T> f13791o00oo0Oo;

        public o00oOOo0(oO0000O<T> oo0000o) {
            this.f13791o00oo0Oo = oo0000o;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13789o00oo0O < 0) {
                o00oOOo0();
            }
            return this.f13789o00oo0O == 1;
        }

        @Override // java.util.Iterator
        @NotNull
        public T next() {
            if (this.f13789o00oo0O < 0) {
                o00oOOo0();
            }
            if (this.f13789o00oo0O != 0) {
                T t = this.f13790o00oo0O0;
                o0ooO.o00oo0(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f13789o00oo0O = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public final void o00oOOo0() {
            T invoke;
            if (this.f13789o00oo0O == -2) {
                invoke = this.f13791o00oo0Oo.f13787o00oOOo0.invoke();
            } else {
                o00oo<T, T> o00ooVar = this.f13791o00oo0Oo.f13788o00oOOoO;
                T t = this.f13790o00oo0O0;
                o0ooO.o00oo00O(t);
                invoke = o00ooVar.invoke(t);
            }
            this.f13790o00oo0O0 = invoke;
            this.f13789o00oo0O = invoke == null ? 0 : 1;
        }

        @Nullable
        public final T o00oOOoO() {
            return this.f13790o00oo0O0;
        }

        public final int o00oOo00() {
            return this.f13789o00oo0O;
        }

        public final void o00oOo0O(int i) {
            this.f13789o00oo0O = i;
        }

        public final void o00oOooO(@Nullable T t) {
            this.f13790o00oo0O0 = t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oO0000O(@NotNull o0OOOO.o00oOOo0<? extends T> o00oooo02, @NotNull o00oo<? super T, ? extends T> o00ooVar) {
        o0ooO.o00oo0O0(o00oooo02, "getInitialValue");
        o0ooO.o00oo0O0(o00ooVar, "getNextValue");
        this.f13787o00oOOo0 = o00oooo02;
        this.f13788o00oOOoO = o00ooVar;
    }

    @Override // o0OOOoO0.oO000
    @NotNull
    public Iterator<T> iterator() {
        return new o00oOOo0(this);
    }
}
