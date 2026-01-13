package androidx.recyclerview.widget;

import androidx.recyclerview.widget.o00oo;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oOo00<T> {
    @o0OO00OO

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Executor f4299o00oOOo0;
    @oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Executor f4300o00oOOoO;
    @oo0oO0

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o00oo.o00oo00O<T> f4301o00oOo00;

    /* loaded from: classes.dex */
    public static final class o00oOOo0<T> {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static Executor f4302o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final Object f4303o00oOooO = new Object();
        @o0OO00OO

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Executor f4304o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public Executor f4305o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final o00oo.o00oo00O<T> f4306o00oOo00;

        public o00oOOo0(@oo0oO0 o00oo.o00oo00O<T> o00oo00o) {
            this.f4306o00oOo00 = o00oo00o;
        }

        @oo0oO0
        public o00oOo00<T> o00oOOo0() {
            if (this.f4305o00oOOoO == null) {
                synchronized (f4303o00oOooO) {
                    if (f4302o00oOo0O == null) {
                        f4302o00oOo0O = Executors.newFixedThreadPool(2);
                    }
                }
                this.f4305o00oOOoO = f4302o00oOo0O;
            }
            return new o00oOo00<>(this.f4304o00oOOo0, this.f4305o00oOOoO, this.f4306o00oOo00);
        }

        @oo0oO0
        public o00oOOo0<T> o00oOOoO(Executor executor) {
            this.f4305o00oOOoO = executor;
            return this;
        }

        @oo0oO0
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
        public o00oOOo0<T> o00oOo00(Executor executor) {
            this.f4304o00oOOo0 = executor;
            return this;
        }
    }

    public o00oOo00(@o0OO00OO Executor executor, @oo0oO0 Executor executor2, @oo0oO0 o00oo.o00oo00O<T> o00oo00o) {
        this.f4299o00oOOo0 = executor;
        this.f4300o00oOOoO = executor2;
        this.f4301o00oOo00 = o00oo00o;
    }

    @oo0oO0
    public Executor o00oOOo0() {
        return this.f4300o00oOOoO;
    }

    @oo0oO0
    public o00oo.o00oo00O<T> o00oOOoO() {
        return this.f4301o00oOo00;
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public Executor o00oOo00() {
        return this.f4299o00oOOo0;
    }
}
