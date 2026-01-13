package o0O0Ooo0;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o0O00OO;
/* loaded from: classes.dex */
public final class o0O000Oo extends o0O00OO {
    @SuppressLint({"MinMaxConstant"})

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final long f12175o00oOoO = 300000;
    @SuppressLint({"MinMaxConstant"})

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final long f12176o00oOoO0 = 900000;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0O00OO.o00oOOo0<o00oOOo0, o0O000Oo> {
        public o00oOOo0(@oo0oO0 Class<? extends ListenableWorker> cls, long j, @oo0oO0 TimeUnit timeUnit) {
            super(cls);
            this.f12193o00oOo00.o00oOo0o(timeUnit.toMillis(j));
        }

        public o00oOOo0(@oo0oO0 Class<? extends ListenableWorker> cls, long j, @oo0oO0 TimeUnit timeUnit, long j2, @oo0oO0 TimeUnit timeUnit2) {
            super(cls);
            this.f12193o00oOo00.o00oOoO0(timeUnit.toMillis(j), timeUnit2.toMillis(j2));
        }

        @o0OOooO0(26)
        public o00oOOo0(@oo0oO0 Class<? extends ListenableWorker> cls, @oo0oO0 Duration duration) {
            super(cls);
            this.f12193o00oOo00.o00oOo0o(duration.toMillis());
        }

        @o0OOooO0(26)
        public o00oOOo0(@oo0oO0 Class<? extends ListenableWorker> cls, @oo0oO0 Duration duration, @oo0oO0 Duration duration2) {
            super(cls);
            this.f12193o00oOo00.o00oOoO0(duration.toMillis(), duration2.toMillis());
        }

        @Override // o0O0Ooo0.o0O00OO.o00oOOo0
        @oo0oO0
        public o00oOOo0 o00oOooO() {
            return this;
        }

        @Override // o0O0Ooo0.o0O00OO.o00oOOo0
        @oo0oO0
        /* renamed from: o00oo0Oo */
        public o0O000Oo o00oOo00() {
            if (this.f12191o00oOOo0 && this.f12193o00oOo00.f12470o00oOoOo.f12150o00oOo00) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new o0O000Oo(this);
        }

        @oo0oO0
        public o00oOOo0 o00oo0o0() {
            return this;
        }
    }

    public o0O000Oo(o00oOOo0 o00oooo02) {
        super(o00oooo02.f12192o00oOOoO, o00oooo02.f12193o00oOo00, o00oooo02.f12195o00oOooO);
    }
}
