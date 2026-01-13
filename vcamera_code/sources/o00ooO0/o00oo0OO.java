package o00ooO0;
/* loaded from: classes.dex */
public final class o00oo0OO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final boolean f8048o00oOOo0 = false;

    /* loaded from: classes.dex */
    public interface o00oOOo0<T> {
        T acquire();

        boolean o00oOOo0(T t);

        void o00oOOoO(T[] tArr, int i);
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO<T> implements o00oOOo0<T> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Object[] f8049o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f8050o00oOOoO;

        public o00oOOoO(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f8049o00oOOo0 = new Object[i];
        }

        @Override // o00ooO0.o00oo0OO.o00oOOo0
        public T acquire() {
            int i = this.f8050o00oOOoO;
            if (i > 0) {
                int i2 = i - 1;
                Object[] objArr = this.f8049o00oOOo0;
                T t = (T) objArr[i2];
                objArr[i2] = null;
                this.f8050o00oOOoO = i - 1;
                return t;
            }
            return null;
        }

        @Override // o00ooO0.o00oo0OO.o00oOOo0
        public boolean o00oOOo0(T t) {
            int i = this.f8050o00oOOoO;
            Object[] objArr = this.f8049o00oOOo0;
            if (i < objArr.length) {
                objArr[i] = t;
                this.f8050o00oOOoO = i + 1;
                return true;
            }
            return false;
        }

        @Override // o00ooO0.o00oo0OO.o00oOOo0
        public void o00oOOoO(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                int i3 = this.f8050o00oOOoO;
                Object[] objArr = this.f8049o00oOOo0;
                if (i3 < objArr.length) {
                    objArr[i3] = t;
                    this.f8050o00oOOoO = i3 + 1;
                }
            }
        }

        public final boolean o00oOo00(T t) {
            for (int i = 0; i < this.f8050o00oOOoO; i++) {
                if (this.f8049o00oOOo0[i] == t) {
                    return true;
                }
            }
            return false;
        }
    }
}
