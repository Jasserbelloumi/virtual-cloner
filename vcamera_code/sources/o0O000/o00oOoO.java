package o0O000;

import android.os.CancellationSignal;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
/* loaded from: classes.dex */
public final class o00oOoO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f10098o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o00oOOoO f10099o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public Object f10100o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public boolean f10101o00oOooO;

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static void o00oOOo0(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        @o00oOooO.o0O0O0Oo
        public static CancellationSignal o00oOOoO() {
            return new CancellationSignal();
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO {
        void onCancel();
    }

    public void o00oOOo0() {
        synchronized (this) {
            if (this.f10098o00oOOo0) {
                return;
            }
            this.f10098o00oOOo0 = true;
            this.f10101o00oOooO = true;
            o00oOOoO o00ooooo2 = this.f10099o00oOOoO;
            Object obj = this.f10100o00oOo00;
            if (o00ooooo2 != null) {
                try {
                    o00ooooo2.onCancel();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f10101o00oOooO = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                o00oOOo0.o00oOOo0(obj);
            }
            synchronized (this) {
                this.f10101o00oOooO = false;
                notifyAll();
            }
        }
    }

    @o0OO00OO
    public Object o00oOOoO() {
        Object obj;
        synchronized (this) {
            if (this.f10100o00oOo00 == null) {
                CancellationSignal o00oOOoO2 = o00oOOo0.o00oOOoO();
                this.f10100o00oOo00 = o00oOOoO2;
                if (this.f10098o00oOOo0) {
                    o00oOOo0.o00oOOo0(o00oOOoO2);
                }
            }
            obj = this.f10100o00oOo00;
        }
        return obj;
    }

    public boolean o00oOo00() {
        boolean z;
        synchronized (this) {
            z = this.f10098o00oOOo0;
        }
        return z;
    }

    public void o00oOo0O() {
        if (o00oOo00()) {
            throw new o0O000();
        }
    }

    public final void o00oOo0o() {
        while (this.f10101o00oOooO) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void o00oOooO(@o0OO00OO o00oOOoO o00ooooo2) {
        synchronized (this) {
            o00oOo0o();
            if (this.f10099o00oOOoO == o00ooooo2) {
                return;
            }
            this.f10099o00oOOoO = o00ooooo2;
            if (this.f10098o00oOOo0 && o00ooooo2 != null) {
                o00ooooo2.onCancel();
            }
        }
    }
}
