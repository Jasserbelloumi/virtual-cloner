package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class o0O0OOO0<T> extends o0O0OOOo<T> {

    /* renamed from: o00oo00O  reason: collision with root package name */
    public o00oo00O.o00oOOoO<LiveData<?>, o00oOOo0<?>> f3346o00oo00O;

    /* loaded from: classes.dex */
    public static class o00oOOo0<V> implements o0OooO0<V> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final LiveData<V> f3347o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o0OooO0<? super V> f3348o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f3349o00oOo00 = -1;

        public o00oOOo0(LiveData<V> liveData, o0OooO0<? super V> o0oooo0) {
            this.f3347o00oOOo0 = liveData;
            this.f3348o00oOOoO = o0oooo0;
        }

        public void o00oOOo0() {
            this.f3347o00oOOo0.o00oOooo(this);
        }

        public void o00oOOoO() {
            this.f3347o00oOOo0.o00oo0O0(this);
        }

        @Override // androidx.lifecycle.o0OooO0
        public void onChanged(@o00oOooO.o0OO00OO V v) {
            if (this.f3349o00oOo00 != this.f3347o00oOOo0.o00oOoO0()) {
                this.f3349o00oOo00 = this.f3347o00oOOo0.o00oOoO0();
                this.f3348o00oOOoO.onChanged(v);
            }
        }
    }

    public o0O0OOO0() {
        this.f3346o00oo00O = new o00oo00O.o00oOOoO<>();
    }

    public o0O0OOO0(T t) {
        super(t);
        this.f3346o00oo00O = new o00oo00O.o00oOOoO<>();
    }

    @Override // androidx.lifecycle.LiveData
    @o00oOooO.o0O00O0
    public void o00oo0() {
        Iterator<Map.Entry<LiveData<?>, o00oOOo0<?>>> it = this.f3346o00oo00O.iterator();
        while (it.hasNext()) {
            it.next().getValue().o00oOOoO();
        }
    }

    @Override // androidx.lifecycle.LiveData
    @o00oOooO.o0O00O0
    public void o00oo00O() {
        Iterator<Map.Entry<LiveData<?>, o00oOOo0<?>>> it = this.f3346o00oo00O.iterator();
        while (it.hasNext()) {
            it.next().getValue().o00oOOo0();
        }
    }

    @o00oOooO.o0O
    public <S> void o00oo0o(@o00oOooO.oo0oO0 LiveData<S> liveData) {
        o00oOOo0<?> o00oOoO02 = this.f3346o00oo00O.o00oOoO0(liveData);
        if (o00oOoO02 != null) {
            o00oOoO02.o00oOOoO();
        }
    }

    @o00oOooO.o0O
    public <S> void o00oo0o0(@o00oOooO.oo0oO0 LiveData<S> liveData, @o00oOooO.oo0oO0 o0OooO0<? super S> o0oooo0) {
        if (liveData == null) {
            throw new NullPointerException("source cannot be null");
        }
        o00oOOo0<?> o00oooo02 = new o00oOOo0<>(liveData, o0oooo0);
        o00oOOo0<?> o00oOo0o2 = this.f3346o00oo00O.o00oOo0o(liveData, o00oooo02);
        if (o00oOo0o2 != null && o00oOo0o2.f3348o00oOOoO != o0oooo0) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (o00oOo0o2 == null && o00oOoO()) {
            o00oooo02.o00oOOo0();
        }
    }
}
