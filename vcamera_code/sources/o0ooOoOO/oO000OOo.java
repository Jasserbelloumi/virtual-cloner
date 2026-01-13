package o0ooOoOO;

import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class oO000OOo {

    /* loaded from: classes.dex */
    public interface o00oOOo0<T> {
        @o0OO00OO
        T acquire();

        boolean o00oOOo0(@oo0oO0 T t);
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO<T> implements o00oOOo0<T> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Object[] f17165o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f17166o00oOOoO;

        public o00oOOoO(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f17165o00oOOo0 = new Object[i];
        }

        @Override // o0ooOoOO.oO000OOo.o00oOOo0
        public T acquire() {
            int i = this.f17166o00oOOoO;
            if (i > 0) {
                int i2 = i - 1;
                Object[] objArr = this.f17165o00oOOo0;
                T t = (T) objArr[i2];
                objArr[i2] = null;
                this.f17166o00oOOoO = i - 1;
                return t;
            }
            return null;
        }

        @Override // o0ooOoOO.oO000OOo.o00oOOo0
        public boolean o00oOOo0(@oo0oO0 T t) {
            if (o00oOOoO(t)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i = this.f17166o00oOOoO;
            Object[] objArr = this.f17165o00oOOo0;
            if (i < objArr.length) {
                objArr[i] = t;
                this.f17166o00oOOoO = i + 1;
                return true;
            }
            return false;
        }

        public final boolean o00oOOoO(@oo0oO0 T t) {
            for (int i = 0; i < this.f17166o00oOOoO; i++) {
                if (this.f17165o00oOOo0[i] == t) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00<T> extends o00oOOoO<T> {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Object f17167o00oOo00;

        public o00oOo00(int i) {
            super(i);
            this.f17167o00oOo00 = new Object();
        }

        @Override // o0ooOoOO.oO000OOo.o00oOOoO, o0ooOoOO.oO000OOo.o00oOOo0
        public T acquire() {
            T t;
            synchronized (this.f17167o00oOo00) {
                t = (T) super.acquire();
            }
            return t;
        }

        @Override // o0ooOoOO.oO000OOo.o00oOOoO, o0ooOoOO.oO000OOo.o00oOOo0
        public boolean o00oOOo0(@oo0oO0 T t) {
            boolean o00oOOo02;
            synchronized (this.f17167o00oOo00) {
                o00oOOo02 = super.o00oOOo0(t);
            }
            return o00oOOo02;
        }
    }
}
