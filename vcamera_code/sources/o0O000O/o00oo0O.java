package o0O000O;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
@Deprecated
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00oo0O {

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f10311o00oOoOO = 1;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f10312o00oOoOo = 0;
    @o0O0OOOo("mLock")

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public HandlerThread f10314o00oOOoO;
    @o0O0OOOo("mLock")

    /* renamed from: o00oOo00  reason: collision with root package name */
    public Handler f10315o00oOo00;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final int f10317o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final String f10318o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final int f10319o00oOoO0;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Object f10313o00oOOo0 = new Object();

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public Handler.Callback f10316o00oOo0O = new o00oOOo0();
    @o0O0OOOo("mLock")

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f10320o00oOooO = 0;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Handler.Callback {
        public o00oOOo0() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                o00oo0O.this.o00oOo00();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                o00oo0O.this.o00oOooO((Runnable) message.obj);
                return true;
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ Handler f10322o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Callable f10323o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ o00oOo0O f10324o00oo0Oo;

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Runnable {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ Object f10327o00oo0O0;

            public o00oOOo0(Object obj) {
                this.f10327o00oo0O0 = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oOOoO.this.f10324o00oo0Oo.o00oOOo0(this.f10327o00oo0O0);
            }
        }

        public o00oOOoO(Callable callable, Handler handler, o00oOo0O o00ooo0o2) {
            this.f10323o00oo0O0 = callable;
            this.f10322o00oo0O = handler;
            this.f10324o00oo0Oo = o00ooo0o2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f10323o00oo0O0.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f10322o00oo0O.post(new o00oOOo0(obj));
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ Callable f10328o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f10329o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ ReentrantLock f10330o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public final /* synthetic */ Condition f10331o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f10332o00oo0o0;

        public o00oOo00(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f10329o00oo0O0 = atomicReference;
            this.f10328o00oo0O = callable;
            this.f10330o00oo0Oo = reentrantLock;
            this.f10332o00oo0o0 = atomicBoolean;
            this.f10331o00oo0o = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f10329o00oo0O0.set(this.f10328o00oo0O.call());
            } catch (Exception unused) {
            }
            this.f10330o00oo0Oo.lock();
            try {
                this.f10332o00oo0o0.set(false);
                this.f10331o00oo0o.signal();
            } finally {
                this.f10330o00oo0Oo.unlock();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOo0O<T> {
        void o00oOOo0(T t);
    }

    public o00oo0O(String str, int i, int i2) {
        this.f10318o00oOoO = str;
        this.f10319o00oOoO0 = i;
        this.f10317o00oOo0o = i2;
    }

    @o0o0000
    public int o00oOOo0() {
        int i;
        synchronized (this.f10313o00oOOo0) {
            i = this.f10320o00oOooO;
        }
        return i;
    }

    @o0o0000
    public boolean o00oOOoO() {
        boolean z;
        synchronized (this.f10313o00oOOo0) {
            z = this.f10314o00oOOoO != null;
        }
        return z;
    }

    public void o00oOo00() {
        synchronized (this.f10313o00oOOo0) {
            if (this.f10315o00oOo00.hasMessages(1)) {
                return;
            }
            this.f10314o00oOOoO.quit();
            this.f10314o00oOOoO = null;
            this.f10315o00oOo00 = null;
        }
    }

    public final void o00oOo0O(Runnable runnable) {
        synchronized (this.f10313o00oOOo0) {
            if (this.f10314o00oOOoO == null) {
                HandlerThread handlerThread = new HandlerThread(this.f10318o00oOoO, this.f10319o00oOoO0);
                this.f10314o00oOOoO = handlerThread;
                handlerThread.start();
                this.f10315o00oOo00 = new Handler(this.f10314o00oOOoO.getLooper(), this.f10316o00oOo0O);
                this.f10320o00oOooO++;
            }
            this.f10315o00oOo00.removeMessages(0);
            Handler handler = this.f10315o00oOo00;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    public <T> void o00oOo0o(Callable<T> callable, o00oOo0O<T> o00ooo0o2) {
        o00oOo0O(new o00oOOoO(callable, o0O000O.o00oOOoO.o00oOOo0(), o00ooo0o2));
    }

    public <T> T o00oOoO0(Callable<T> callable, int i) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        o00oOo0O(new o00oOo00(atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (atomicBoolean.get()) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(i);
                do {
                    try {
                        nanos = newCondition.awaitNanos(nanos);
                    } catch (InterruptedException unused) {
                    }
                    if (!atomicBoolean.get()) {
                        return (T) atomicReference.get();
                    }
                } while (nanos > 0);
                throw new InterruptedException("timeout");
            }
            return (T) atomicReference.get();
        } finally {
            reentrantLock.unlock();
        }
    }

    public void o00oOooO(Runnable runnable) {
        runnable.run();
        synchronized (this.f10313o00oOOo0) {
            this.f10315o00oOo00.removeMessages(0);
            Handler handler = this.f10315o00oOo00;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.f10317o00oOo0o);
        }
    }
}
