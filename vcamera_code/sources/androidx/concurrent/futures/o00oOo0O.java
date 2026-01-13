package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oOo0O {

    /* loaded from: classes.dex */
    public static final class o00oOOo0<T> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Object f1758o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public C0012o00oOo0O<T> f1759o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public o00oo00O<Void> f1760o00oOo00 = o00oo00O.o00oOOoO();

        /* renamed from: o00oOooO  reason: collision with root package name */
        public boolean f1761o00oOooO;

        public void finalize() {
            o00oo00O<Void> o00oo00o;
            C0012o00oOo0O<T> c0012o00oOo0O = this.f1759o00oOOoO;
            if (c0012o00oOo0O != null && !c0012o00oOo0O.isDone()) {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
                o00oOOo02.append(this.f1758o00oOOo0);
                c0012o00oOo0O.o00oOo00(new o00oOOoO(o00oOOo02.toString()));
            }
            if (this.f1761o00oOooO || (o00oo00o = this.f1760o00oOo00) == null) {
                return;
            }
            o00oo00o.set(null);
        }

        public void o00oOOo0(@oo0oO0 Runnable runnable, @oo0oO0 Executor executor) {
            o00oo00O<Void> o00oo00o = this.f1760o00oOo00;
            if (o00oo00o != null) {
                o00oo00o.addListener(runnable, executor);
            }
        }

        public void o00oOOoO() {
            this.f1758o00oOOo0 = null;
            this.f1759o00oOOoO = null;
            this.f1760o00oOo00.set(null);
        }

        public boolean o00oOo00(T t) {
            boolean z = true;
            this.f1761o00oOooO = true;
            C0012o00oOo0O<T> c0012o00oOo0O = this.f1759o00oOOoO;
            z = (c0012o00oOo0O == null || !c0012o00oOo0O.o00oOOoO(t)) ? false : false;
            if (z) {
                o00oOo0O();
            }
            return z;
        }

        public final void o00oOo0O() {
            this.f1758o00oOOo0 = null;
            this.f1759o00oOOoO = null;
            this.f1760o00oOo00 = null;
        }

        public boolean o00oOo0o(@oo0oO0 Throwable th) {
            boolean z = true;
            this.f1761o00oOooO = true;
            C0012o00oOo0O<T> c0012o00oOo0O = this.f1759o00oOOoO;
            z = (c0012o00oOo0O == null || !c0012o00oOo0O.o00oOo00(th)) ? false : false;
            if (z) {
                o00oOo0O();
            }
            return z;
        }

        public boolean o00oOooO() {
            boolean z = true;
            this.f1761o00oOooO = true;
            C0012o00oOo0O<T> c0012o00oOo0O = this.f1759o00oOOoO;
            z = (c0012o00oOo0O == null || !c0012o00oOo0O.o00oOOo0(true)) ? false : false;
            if (z) {
                o00oOo0O();
            }
            return z;
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO extends Throwable {
        public o00oOOoO(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOo00<T> {
        @o0OO00OO
        Object o00oOOo0(@oo0oO0 o00oOOo0<T> o00oooo02) throws Exception;
    }

    /* renamed from: androidx.concurrent.futures.o00oOo0O$o00oOo0O  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0012o00oOo0O<T> implements ListenableFuture<T> {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final androidx.concurrent.futures.o00oOOoO<T> f1762o00oo0O = new o00oOOo0();

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final WeakReference<o00oOOo0<T>> f1763o00oo0O0;

        /* renamed from: androidx.concurrent.futures.o00oOo0O$o00oOo0O$o00oOOo0 */
        /* loaded from: classes.dex */
        public class o00oOOo0 extends androidx.concurrent.futures.o00oOOoO<T> {
            public o00oOOo0() {
            }

            @Override // androidx.concurrent.futures.o00oOOoO
            public String pendingToString() {
                o00oOOo0<T> o00oooo02 = C0012o00oOo0O.this.f1763o00oo0O0.get();
                if (o00oooo02 == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("tag=[");
                o00oOOo02.append(o00oooo02.f1758o00oOOo0);
                o00oOOo02.append("]");
                return o00oOOo02.toString();
            }
        }

        public C0012o00oOo0O(o00oOOo0<T> o00oooo02) {
            this.f1763o00oo0O0 = new WeakReference<>(o00oooo02);
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(@oo0oO0 Runnable runnable, @oo0oO0 Executor executor) {
            this.f1762o00oo0O.addListener(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            o00oOOo0<T> o00oooo02 = this.f1763o00oo0O0.get();
            boolean cancel = this.f1762o00oo0O.cancel(z);
            if (cancel && o00oooo02 != null) {
                o00oooo02.o00oOOoO();
            }
            return cancel;
        }

        @Override // java.util.concurrent.Future
        public T get() throws InterruptedException, ExecutionException {
            return this.f1762o00oo0O.get();
        }

        @Override // java.util.concurrent.Future
        public T get(long j, @oo0oO0 TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.f1762o00oo0O.get(j, timeUnit);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f1762o00oo0O.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f1762o00oo0O.isDone();
        }

        public boolean o00oOOo0(boolean z) {
            return this.f1762o00oo0O.cancel(z);
        }

        public boolean o00oOOoO(T t) {
            return this.f1762o00oo0O.set(t);
        }

        public boolean o00oOo00(Throwable th) {
            return this.f1762o00oo0O.setException(th);
        }

        public String toString() {
            return this.f1762o00oo0O.toString();
        }
    }

    @oo0oO0
    public static <T> ListenableFuture<T> o00oOOo0(@oo0oO0 o00oOo00<T> o00ooo002) {
        o00oOOo0<T> o00oooo02 = new o00oOOo0<>();
        C0012o00oOo0O<T> c0012o00oOo0O = new C0012o00oOo0O<>(o00oooo02);
        o00oooo02.f1759o00oOOoO = c0012o00oOo0O;
        o00oooo02.f1758o00oOOo0 = o00ooo002.getClass();
        try {
            Object o00oOOo02 = o00ooo002.o00oOOo0(o00oooo02);
            if (o00oOOo02 != null) {
                o00oooo02.f1758o00oOOo0 = o00oOOo02;
            }
        } catch (Exception e) {
            c0012o00oOo0O.o00oOo00(e);
        }
        return c0012o00oOo0O;
    }
}
