package o0Oo;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import o0O0OO0.o00oOo0O;
/* loaded from: classes3.dex */
public class o0O0O0o0 {

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final o0O0O0o0 f15502o00oOooO = new o00oOOo0();

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f15503o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public long f15504o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public long f15505o00oOo00;

    /* loaded from: classes3.dex */
    public class o00oOOo0 extends o0O0O0o0 {
        @Override // o0Oo.o0O0O0o0
        public o0O0O0o0 o00oOo0O(long j) {
            return this;
        }

        @Override // o0Oo.o0O0O0o0
        public o0O0O0o0 o00oOoO(long j, TimeUnit timeUnit) {
            return this;
        }

        @Override // o0Oo.o0O0O0o0
        public void o00oOoO0() throws IOException {
        }
    }

    public o0O0O0o0 o00oOOo0() {
        this.f15503o00oOOo0 = false;
        return this;
    }

    public o0O0O0o0 o00oOOoO() {
        this.f15505o00oOo00 = 0L;
        return this;
    }

    public final o0O0O0o0 o00oOo00(long j, TimeUnit timeUnit) {
        if (j > 0) {
            if (timeUnit != null) {
                return o00oOo0O(timeUnit.toNanos(j) + System.nanoTime());
            }
            throw new IllegalArgumentException("unit == null");
        }
        throw new IllegalArgumentException(o00oOo0O.o00oOOo0("duration <= 0: ", j));
    }

    public o0O0O0o0 o00oOo0O(long j) {
        this.f15503o00oOOo0 = true;
        this.f15504o00oOOoO = j;
        return this;
    }

    public boolean o00oOo0o() {
        return this.f15503o00oOOo0;
    }

    public o0O0O0o0 o00oOoO(long j, TimeUnit timeUnit) {
        if (j >= 0) {
            if (timeUnit != null) {
                this.f15505o00oOo00 = timeUnit.toNanos(j);
                return this;
            }
            throw new IllegalArgumentException("unit == null");
        }
        throw new IllegalArgumentException(o00oOo0O.o00oOOo0("timeout < 0: ", j));
    }

    public void o00oOoO0() throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        }
        if (this.f15503o00oOOo0 && this.f15504o00oOOoO - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long o00oOoOO() {
        return this.f15505o00oOo00;
    }

    public final void o00oOoOo(Object obj) throws InterruptedIOException {
        try {
            boolean o00oOo0o2 = o00oOo0o();
            long o00oOoOO2 = o00oOoOO();
            long j = 0;
            if (!o00oOo0o2 && o00oOoOO2 == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (o00oOo0o2 && o00oOoOO2 != 0) {
                o00oOoOO2 = Math.min(o00oOoOO2, o00oOooO() - nanoTime);
            } else if (o00oOo0o2) {
                o00oOoOO2 = o00oOooO() - nanoTime;
            }
            if (o00oOoOO2 > 0) {
                long j2 = o00oOoOO2 / 1000000;
                obj.wait(j2, (int) (o00oOoOO2 - (1000000 * j2)));
                j = System.nanoTime() - nanoTime;
            }
            if (j >= o00oOoOO2) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            throw new InterruptedIOException("interrupted");
        }
    }

    public long o00oOooO() {
        if (this.f15503o00oOOo0) {
            return this.f15504o00oOOoO;
        }
        throw new IllegalStateException("No deadline");
    }
}
