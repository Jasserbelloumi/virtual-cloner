package o0OOOoO0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o0OOOO.o00oo;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class oO00000<T> implements oO000<T> {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final oO000<T> f13774o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final boolean f13775o00oOOoO;
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o00oo<T, Boolean> f13776o00oOo00;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements Iterator<T>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f13777o00oo0O = -1;
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final Iterator<T> f13778o00oo0O0;
        @Nullable

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public T f13779o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final /* synthetic */ oO00000<T> f13780o00oo0o0;

        public o00oOOo0(oO00000<T> oo00000) {
            this.f13780o00oo0o0 = oo00000;
            this.f13778o00oo0O0 = oo00000.f13774o00oOOo0.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13777o00oo0O == -1) {
                o00oOOo0();
            }
            return this.f13777o00oo0O == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f13777o00oo0O == -1) {
                o00oOOo0();
            }
            if (this.f13777o00oo0O != 0) {
                T t = this.f13779o00oo0Oo;
                this.f13779o00oo0Oo = null;
                this.f13777o00oo0O = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public final void o00oOOo0() {
            int i;
            while (true) {
                if (!this.f13778o00oo0O0.hasNext()) {
                    i = 0;
                    break;
                }
                T next = this.f13778o00oo0O0.next();
                if (this.f13780o00oo0o0.f13776o00oOo00.invoke(next).booleanValue() == this.f13780o00oo0o0.f13775o00oOOoO) {
                    this.f13779o00oo0Oo = next;
                    i = 1;
                    break;
                }
            }
            this.f13777o00oo0O = i;
        }

        @NotNull
        public final Iterator<T> o00oOOoO() {
            return this.f13778o00oo0O0;
        }

        @Nullable
        public final T o00oOo00() {
            return this.f13779o00oo0Oo;
        }

        public final void o00oOo0O(@Nullable T t) {
            this.f13779o00oo0Oo = t;
        }

        public final void o00oOoO0(int i) {
            this.f13777o00oo0O = i;
        }

        public final int o00oOooO() {
            return this.f13777o00oo0O;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oO00000(@NotNull oO000<? extends T> oo000, boolean z, @NotNull o00oo<? super T, Boolean> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "sequence");
        o0ooO.o00oo0O0(o00ooVar, "predicate");
        this.f13774o00oOOo0 = oo000;
        this.f13775o00oOOoO = z;
        this.f13776o00oOo00 = o00ooVar;
    }

    public /* synthetic */ oO00000(oO000 oo000, boolean z, o00oo o00ooVar, int i, o0O00 o0o00) {
        this(oo000, (i & 2) != 0 ? true : z, o00ooVar);
    }

    @Override // o0OOOoO0.oO000
    @NotNull
    public Iterator<T> iterator() {
        return new o00oOOo0(this);
    }
}
