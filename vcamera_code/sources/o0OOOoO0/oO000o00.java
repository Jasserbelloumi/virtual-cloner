package o0OOOoO0;

import java.util.Iterator;
import o0OO0oO.o0O00O0o;
import o0OOOO.o0O00000;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class oO000o00<T, R> implements oO000<R> {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final oO000<T> f13815o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O00000<Integer, T, R> f13816o00oOOoO;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements Iterator<R>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f13817o00oo0O;
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final Iterator<T> f13818o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ oO000o00<T, R> f13819o00oo0Oo;

        public o00oOOo0(oO000o00<T, R> oo000o00) {
            this.f13819o00oo0Oo = oo000o00;
            this.f13818o00oo0O0 = oo000o00.f13815o00oOOo0.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13818o00oo0O0.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            o0O00000<Integer, T, R> o0o00000 = this.f13819o00oo0Oo.f13816o00oOOoO;
            int i = this.f13817o00oo0O;
            this.f13817o00oo0O = i + 1;
            if (i < 0) {
                o0O00O0o.o0O0000O();
            }
            return o0o00000.invoke(Integer.valueOf(i), this.f13818o00oo0O0.next());
        }

        public final int o00oOOo0() {
            return this.f13817o00oo0O;
        }

        @NotNull
        public final Iterator<T> o00oOOoO() {
            return this.f13818o00oo0O0;
        }

        public final void o00oOo00(int i) {
            this.f13817o00oo0O = i;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oO000o00(@NotNull oO000<? extends T> oo000, @NotNull o0O00000<? super Integer, ? super T, ? extends R> o0o00000) {
        o0ooO.o00oo0O0(oo000, "sequence");
        o0ooO.o00oo0O0(o0o00000, "transformer");
        this.f13815o00oOOo0 = oo000;
        this.f13816o00oOOoO = o0o00000;
    }

    @Override // o0OOOoO0.oO000
    @NotNull
    public Iterator<R> iterator() {
        return new o00oOOo0(this);
    }
}
