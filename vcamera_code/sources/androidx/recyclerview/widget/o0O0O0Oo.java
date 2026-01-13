package androidx.recyclerview.widget;

import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public interface o0O0O0Oo {

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements o0O0O0Oo {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public long f4641o00oOOo0 = 0;

        /* renamed from: androidx.recyclerview.widget.o0O0O0Oo$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0041o00oOOo0 implements o00oOo0O {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final androidx.collection.o00oo0OO<Long> f4642o00oOOo0 = new androidx.collection.o00oo0OO<>();

            public C0041o00oOOo0() {
            }

            @Override // androidx.recyclerview.widget.o0O0O0Oo.o00oOo0O
            public long o00oOOo0(long j) {
                Long o00oOooo2 = this.f4642o00oOOo0.o00oOooo(j);
                if (o00oOooo2 == null) {
                    o00oOooo2 = Long.valueOf(o00oOOo0.this.o00oOOoO());
                    this.f4642o00oOOo0.o00oo0Oo(j, o00oOooo2);
                }
                return o00oOooo2.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.o0O0O0Oo
        @oo0oO0
        public o00oOo0O o00oOOo0() {
            return new C0041o00oOOo0();
        }

        public long o00oOOoO() {
            long j = this.f4641o00oOOo0;
            this.f4641o00oOOo0 = 1 + j;
            return j;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO implements o0O0O0Oo {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oOo0O f4644o00oOOo0 = new o00oOOo0();

        /* loaded from: classes.dex */
        public class o00oOOo0 implements o00oOo0O {
            public o00oOOo0() {
            }

            @Override // androidx.recyclerview.widget.o0O0O0Oo.o00oOo0O
            public long o00oOOo0(long j) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.o0O0O0Oo
        @oo0oO0
        public o00oOo0O o00oOOo0() {
            return this.f4644o00oOOo0;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 implements o0O0O0Oo {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oOo0O f4646o00oOOo0 = new o00oOOo0();

        /* loaded from: classes.dex */
        public class o00oOOo0 implements o00oOo0O {
            public o00oOOo0() {
            }

            @Override // androidx.recyclerview.widget.o0O0O0Oo.o00oOo0O
            public long o00oOOo0(long j) {
                return j;
            }
        }

        @Override // androidx.recyclerview.widget.o0O0O0Oo
        @oo0oO0
        public o00oOo0O o00oOOo0() {
            return this.f4646o00oOOo0;
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOo0O {
        long o00oOOo0(long j);
    }

    @oo0oO0
    o00oOo0O o00oOOo0();
}
