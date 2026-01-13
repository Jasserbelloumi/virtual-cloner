package o0Oo0o0o;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public final class o0oO0Ooo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final CountDownLatch f16595o00oOOo0 = new CountDownLatch(1);

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public long f16596o00oOOoO = -1;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public long f16597o00oOo00 = -1;

    public void o00oOOo0() {
        if (this.f16597o00oOo00 == -1) {
            long j = this.f16596o00oOOoO;
            if (j != -1) {
                this.f16597o00oOo00 = j - 1;
                this.f16595o00oOOo0.countDown();
                return;
            }
        }
        throw new IllegalStateException();
    }

    public void o00oOOoO() {
        if (this.f16597o00oOo00 != -1 || this.f16596o00oOOoO == -1) {
            throw new IllegalStateException();
        }
        this.f16597o00oOo00 = System.nanoTime();
        this.f16595o00oOOo0.countDown();
    }

    public long o00oOo00() throws InterruptedException {
        this.f16595o00oOOo0.await();
        return this.f16597o00oOo00 - this.f16596o00oOOoO;
    }

    public void o00oOo0O() {
        if (this.f16596o00oOOoO != -1) {
            throw new IllegalStateException();
        }
        this.f16596o00oOOoO = System.nanoTime();
    }

    public long o00oOooO(long j, TimeUnit timeUnit) throws InterruptedException {
        if (this.f16595o00oOOo0.await(j, timeUnit)) {
            return this.f16597o00oOo00 - this.f16596o00oOOoO;
        }
        return -2L;
    }
}
