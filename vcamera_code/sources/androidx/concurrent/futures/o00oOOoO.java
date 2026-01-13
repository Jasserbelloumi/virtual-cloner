package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import o00oOoOo.o00oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class o00oOOoO<V> implements ListenableFuture<V> {
    public static final AbstractC0011o00oOOoO ATOMIC_HELPER;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    @o0OO00OO
    public volatile o00oOoO listeners;
    @o0OO00OO
    public volatile Object value;
    @o0OO00OO
    public volatile o00oo0O0 waiters;
    public static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger log = Logger.getLogger(o00oOOoO.class.getName());

    /* renamed from: androidx.concurrent.futures.o00oOOoO$o00oOOoO  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0011o00oOOoO {
        public AbstractC0011o00oOOoO() {
        }

        public AbstractC0011o00oOOoO(o00oOOo0 o00oooo02) {
        }

        public abstract boolean o00oOOo0(o00oOOoO<?> o00ooooo2, o00oOoO o00oooo2, o00oOoO o00oooo3);

        public abstract boolean o00oOOoO(o00oOOoO<?> o00ooooo2, Object obj, Object obj2);

        public abstract boolean o00oOo00(o00oOOoO<?> o00ooooo2, o00oo0O0 o00oo0o02, o00oo0O0 o00oo0o03);

        public abstract void o00oOo0O(o00oo0O0 o00oo0o02, Thread thread);

        public abstract void o00oOooO(o00oo0O0 o00oo0o02, o00oo0O0 o00oo0o03);
    }

    /* loaded from: classes.dex */
    public static final class o00oOo00 {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final o00oOo00 f1738o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final o00oOo00 f1739o00oOooO;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final boolean f1740o00oOOo0;
        @o0OO00OO

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Throwable f1741o00oOOoO;

        static {
            if (o00oOOoO.GENERATE_CANCELLATION_CAUSES) {
                f1739o00oOooO = null;
                f1738o00oOo00 = null;
                return;
            }
            f1739o00oOooO = new o00oOo00(false, null);
            f1738o00oOo00 = new o00oOo00(true, null);
        }

        public o00oOo00(boolean z, @o0OO00OO Throwable th) {
            this.f1740o00oOOo0 = z;
            this.f1741o00oOOoO = th;
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOo0O {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final o00oOo0O f1742o00oOOoO = new o00oOo0O(new o00oOOo0("Failure occurred while trying to finish a future."));

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Throwable f1743o00oOOo0;

        /* loaded from: classes.dex */
        public class o00oOOo0 extends Throwable {
            public o00oOOo0(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public o00oOo0O(Throwable th) {
            this.f1743o00oOOo0 = (Throwable) o00oOOoO.checkNotNull(th);
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOoO {

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final o00oOoO f1744o00oOooO = new o00oOoO(null, null);

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Runnable f1745o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Executor f1746o00oOOoO;
        @o0OO00OO

        /* renamed from: o00oOo00  reason: collision with root package name */
        public o00oOoO f1747o00oOo00;

        public o00oOoO(Runnable runnable, Executor executor) {
            this.f1745o00oOOo0 = runnable;
            this.f1746o00oOOoO = executor;
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oo0<V> implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final ListenableFuture<? extends V> f1748o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o00oOOoO<V> f1749o00oo0O0;

        public o00oo0(o00oOOoO<V> o00ooooo2, ListenableFuture<? extends V> listenableFuture) {
            this.f1749o00oo0O0 = o00ooooo2;
            this.f1748o00oo0O = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1749o00oo0O0.value != this) {
                return;
            }
            if (o00oOOoO.ATOMIC_HELPER.o00oOOoO(this.f1749o00oo0O0, this, o00oOOoO.getFutureValue(this.f1748o00oo0O))) {
                o00oOOoO.complete(this.f1749o00oo0O0);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oo00O extends AbstractC0011o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<o00oo0O0, Thread> f1750o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<o00oo0O0, o00oo0O0> f1751o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<o00oOOoO, o00oo0O0> f1752o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<o00oOOoO, Object> f1753o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<o00oOOoO, o00oOoO> f1754o00oOooO;

        public o00oo00O(AtomicReferenceFieldUpdater<o00oo0O0, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<o00oo0O0, o00oo0O0> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<o00oOOoO, o00oo0O0> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<o00oOOoO, o00oOoO> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<o00oOOoO, Object> atomicReferenceFieldUpdater5) {
            super(null);
            this.f1750o00oOOo0 = atomicReferenceFieldUpdater;
            this.f1751o00oOOoO = atomicReferenceFieldUpdater2;
            this.f1752o00oOo00 = atomicReferenceFieldUpdater3;
            this.f1754o00oOooO = atomicReferenceFieldUpdater4;
            this.f1753o00oOo0O = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.o00oOOoO.AbstractC0011o00oOOoO
        public boolean o00oOOo0(o00oOOoO<?> o00ooooo2, o00oOoO o00oooo2, o00oOoO o00oooo3) {
            return androidx.concurrent.futures.o00oOo00.o00oOOo0(this.f1754o00oOooO, o00ooooo2, o00oooo2, o00oooo3);
        }

        @Override // androidx.concurrent.futures.o00oOOoO.AbstractC0011o00oOOoO
        public boolean o00oOOoO(o00oOOoO<?> o00ooooo2, Object obj, Object obj2) {
            return androidx.concurrent.futures.o00oOo00.o00oOOo0(this.f1753o00oOo0O, o00ooooo2, obj, obj2);
        }

        @Override // androidx.concurrent.futures.o00oOOoO.AbstractC0011o00oOOoO
        public boolean o00oOo00(o00oOOoO<?> o00ooooo2, o00oo0O0 o00oo0o02, o00oo0O0 o00oo0o03) {
            return androidx.concurrent.futures.o00oOo00.o00oOOo0(this.f1752o00oOo00, o00ooooo2, o00oo0o02, o00oo0o03);
        }

        @Override // androidx.concurrent.futures.o00oOOoO.AbstractC0011o00oOOoO
        public void o00oOo0O(o00oo0O0 o00oo0o02, Thread thread) {
            this.f1750o00oOOo0.lazySet(o00oo0o02, thread);
        }

        @Override // androidx.concurrent.futures.o00oOOoO.AbstractC0011o00oOOoO
        public void o00oOooO(o00oo0O0 o00oo0o02, o00oo0O0 o00oo0o03) {
            this.f1751o00oOOoO.lazySet(o00oo0o02, o00oo0o03);
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oo0O0 {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final o00oo0O0 f1755o00oOo00 = new o00oo0O0(false);
        @o0OO00OO

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public volatile Thread f1756o00oOOo0;
        @o0OO00OO

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public volatile o00oo0O0 f1757o00oOOoO;

        public o00oo0O0() {
            o00oOOoO.ATOMIC_HELPER.o00oOo0O(this, Thread.currentThread());
        }

        public o00oo0O0(boolean z) {
        }

        public void o00oOOo0(o00oo0O0 o00oo0o02) {
            o00oOOoO.ATOMIC_HELPER.o00oOooO(this, o00oo0o02);
        }

        public void o00oOOoO() {
            Thread thread = this.f1756o00oOOo0;
            if (thread != null) {
                this.f1756o00oOOo0 = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oo0OO extends AbstractC0011o00oOOoO {
        public o00oo0OO() {
            super(null);
        }

        @Override // androidx.concurrent.futures.o00oOOoO.AbstractC0011o00oOOoO
        public boolean o00oOOo0(o00oOOoO<?> o00ooooo2, o00oOoO o00oooo2, o00oOoO o00oooo3) {
            synchronized (o00ooooo2) {
                if (o00ooooo2.listeners == o00oooo2) {
                    o00ooooo2.listeners = o00oooo3;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.o00oOOoO.AbstractC0011o00oOOoO
        public boolean o00oOOoO(o00oOOoO<?> o00ooooo2, Object obj, Object obj2) {
            synchronized (o00ooooo2) {
                if (o00ooooo2.value == obj) {
                    o00ooooo2.value = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.o00oOOoO.AbstractC0011o00oOOoO
        public boolean o00oOo00(o00oOOoO<?> o00ooooo2, o00oo0O0 o00oo0o02, o00oo0O0 o00oo0o03) {
            synchronized (o00ooooo2) {
                if (o00ooooo2.waiters == o00oo0o02) {
                    o00ooooo2.waiters = o00oo0o03;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.o00oOOoO.AbstractC0011o00oOOoO
        public void o00oOo0O(o00oo0O0 o00oo0o02, Thread thread) {
            o00oo0o02.f1756o00oOOo0 = thread;
        }

        @Override // androidx.concurrent.futures.o00oOOoO.AbstractC0011o00oOOoO
        public void o00oOooO(o00oo0O0 o00oo0o02, o00oo0O0 o00oo0o03) {
            o00oo0o02.f1757o00oOOoO = o00oo0o03;
        }
    }

    static {
        AbstractC0011o00oOOoO o00oo0oo;
        try {
            o00oo0oo = new o00oo00O(AtomicReferenceFieldUpdater.newUpdater(o00oo0O0.class, Thread.class, "o00oOOo0"), AtomicReferenceFieldUpdater.newUpdater(o00oo0O0.class, o00oo0O0.class, o0OO000o.o00oOOoO.f12961o00oOo00), AtomicReferenceFieldUpdater.newUpdater(o00oOOoO.class, o00oo0O0.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(o00oOOoO.class, o00oOoO.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(o00oOOoO.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            o00oo0oo = new o00oo0OO();
        }
        ATOMIC_HELPER = o00oo0oo;
        if (th != null) {
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        NULL = new Object();
    }

    private void addDoneString(StringBuilder sb) {
        String str = "]";
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            sb.append(userObjectToString(uninterruptibly));
            sb.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append(str);
        }
    }

    private static CancellationException cancellationExceptionWithCause(@o0OO00OO String str, @o0OO00OO Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @oo0oO0
    static <T> T checkNotNull(@o0OO00OO T t) {
        t.getClass();
        return t;
    }

    private o00oOoO clearListeners(o00oOoO o00oooo2) {
        o00oOoO o00oooo3;
        do {
            o00oooo3 = this.listeners;
        } while (!ATOMIC_HELPER.o00oOOo0(this, o00oooo3, o00oOoO.f1744o00oOooO));
        o00oOoO o00oooo4 = o00oooo2;
        o00oOoO o00oooo5 = o00oooo3;
        while (o00oooo5 != null) {
            o00oOoO o00oooo6 = o00oooo5.f1747o00oOo00;
            o00oooo5.f1747o00oOo00 = o00oooo4;
            o00oooo4 = o00oooo5;
            o00oooo5 = o00oooo6;
        }
        return o00oooo4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.concurrent.futures.o00oOOoO$o00oOOoO] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.concurrent.futures.o00oOOoO<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.concurrent.futures.o00oOOoO] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.concurrent.futures.o00oOOoO, androidx.concurrent.futures.o00oOOoO<V>] */
    public static void complete(o00oOOoO<?> o00ooooo2) {
        o00oOoO o00oooo2 = null;
        while (true) {
            o00ooooo2.releaseWaiters();
            o00ooooo2.afterDone();
            o00oOoO clearListeners = o00ooooo2.clearListeners(o00oooo2);
            while (clearListeners != null) {
                o00oooo2 = clearListeners.f1747o00oOo00;
                Runnable runnable = clearListeners.f1745o00oOOo0;
                if (runnable instanceof o00oo0) {
                    o00oo0 o00oo0Var = (o00oo0) runnable;
                    o00ooooo2 = o00oo0Var.f1749o00oo0O0;
                    if (o00ooooo2.value == o00oo0Var) {
                        if (ATOMIC_HELPER.o00oOOoO(o00ooooo2, o00oo0Var, getFutureValue(o00oo0Var.f1748o00oo0O))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    executeListener(runnable, clearListeners.f1746o00oOOoO);
                }
                clearListeners = o00oooo2;
            }
            return;
        }
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = log;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V getDoneValue(Object obj) throws ExecutionException {
        if (obj instanceof o00oOo00) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((o00oOo00) obj).f1741o00oOOoO);
        }
        if (obj instanceof o00oOo0O) {
            throw new ExecutionException(((o00oOo0O) obj).f1743o00oOOo0);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    static Object getFutureValue(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof o00oOOoO) {
            Object obj = ((o00oOOoO) listenableFuture).value;
            if (obj instanceof o00oOo00) {
                o00oOo00 o00ooo002 = (o00oOo00) obj;
                return o00ooo002.f1740o00oOOo0 ? o00ooo002.f1741o00oOOoO != null ? new o00oOo00(false, o00ooo002.f1741o00oOOoO) : o00oOo00.f1739o00oOooO : obj;
            }
            return obj;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && isCancelled) {
            return o00oOo00.f1739o00oOooO;
        }
        try {
            Object uninterruptibly = getUninterruptibly(listenableFuture);
            return uninterruptibly == null ? NULL : uninterruptibly;
        } catch (CancellationException e) {
            if (isCancelled) {
                return new o00oOo00(false, e);
            }
            return new o00oOo0O(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e));
        } catch (ExecutionException e2) {
            return new o00oOo0O(e2.getCause());
        } catch (Throwable th) {
            return new o00oOo0O(th);
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    private void releaseWaiters() {
        o00oo0O0 o00oo0o02;
        do {
            o00oo0o02 = this.waiters;
        } while (!ATOMIC_HELPER.o00oOo00(this, o00oo0o02, o00oo0O0.f1755o00oOo00));
        while (o00oo0o02 != null) {
            o00oo0o02.o00oOOoO();
            o00oo0o02 = o00oo0o02.f1757o00oOOoO;
        }
    }

    private void removeWaiter(o00oo0O0 o00oo0o02) {
        o00oo0o02.f1756o00oOOo0 = null;
        while (true) {
            o00oo0O0 o00oo0o03 = this.waiters;
            if (o00oo0o03 == o00oo0O0.f1755o00oOo00) {
                return;
            }
            o00oo0O0 o00oo0o04 = null;
            while (o00oo0o03 != null) {
                o00oo0O0 o00oo0o05 = o00oo0o03.f1757o00oOOoO;
                if (o00oo0o03.f1756o00oOOo0 != null) {
                    o00oo0o04 = o00oo0o03;
                } else if (o00oo0o04 != null) {
                    o00oo0o04.f1757o00oOOoO = o00oo0o05;
                    if (o00oo0o04.f1756o00oOOo0 == null) {
                        break;
                    }
                } else if (!ATOMIC_HELPER.o00oOo00(this, o00oo0o03, o00oo0o05)) {
                    break;
                }
                o00oo0o03 = o00oo0o05;
            }
            return;
        }
    }

    private String userObjectToString(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        checkNotNull(runnable);
        checkNotNull(executor);
        o00oOoO o00oooo2 = this.listeners;
        if (o00oooo2 == o00oOoO.f1744o00oOooO) {
            executeListener(runnable, executor);
        }
        o00oOoO o00oooo3 = new o00oOoO(runnable, executor);
        do {
            o00oooo3.f1747o00oOo00 = o00oooo2;
            if (ATOMIC_HELPER.o00oOOo0(this, o00oooo2, o00oooo3)) {
                return;
            }
            o00oooo2 = this.listeners;
        } while (o00oooo2 != o00oOoO.f1744o00oOooO);
        executeListener(runnable, executor);
    }

    public void afterDone() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof o00oo0)) {
            return false;
        }
        o00oOo00 o00ooo002 = GENERATE_CANCELLATION_CAUSES ? new o00oOo00(z, new CancellationException("Future.cancel() was called.")) : z ? o00oOo00.f1738o00oOo00 : o00oOo00.f1739o00oOooO;
        o00oOOoO<V> o00ooooo2 = this;
        boolean z2 = false;
        while (true) {
            if (ATOMIC_HELPER.o00oOOoO(o00ooooo2, obj, o00ooo002)) {
                if (z) {
                    o00ooooo2.interruptTask();
                }
                complete(o00ooooo2);
                if (!(obj instanceof o00oo0)) {
                    return true;
                }
                ListenableFuture<? extends V> listenableFuture = ((o00oo0) obj).f1748o00oo0O;
                if (!(listenableFuture instanceof o00oOOoO)) {
                    listenableFuture.cancel(z);
                    return true;
                }
                o00ooooo2 = (o00oOOoO) listenableFuture;
                obj = o00ooooo2.value;
                if (!(obj == null) && !(obj instanceof o00oo0)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = o00ooooo2.value;
                if (!(obj instanceof o00oo0)) {
                    return z2;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof o00oo0))) {
            return getDoneValue(obj2);
        }
        o00oo0O0 o00oo0o02 = this.waiters;
        if (o00oo0o02 != o00oo0O0.f1755o00oOo00) {
            o00oo0O0 o00oo0o03 = new o00oo0O0();
            do {
                o00oo0o03.o00oOOo0(o00oo0o02);
                if (ATOMIC_HELPER.o00oOo00(this, o00oo0o02, o00oo0o03)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            removeWaiter(o00oo0o03);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof o00oo0))));
                    return getDoneValue(obj);
                }
                o00oo0o02 = this.waiters;
            } while (o00oo0o02 != o00oo0O0.f1755o00oOo00);
            return getDoneValue(this.value);
        }
        return getDoneValue(this.value);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof o00oo0))) {
            return getDoneValue(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            o00oo0O0 o00oo0o02 = this.waiters;
            if (o00oo0o02 != o00oo0O0.f1755o00oOo00) {
                o00oo0O0 o00oo0o03 = new o00oo0O0();
                do {
                    o00oo0o03.o00oOOo0(o00oo0o02);
                    if (ATOMIC_HELPER.o00oOo00(this, o00oo0o02, o00oo0o03)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                removeWaiter(o00oo0o03);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof o00oo0))) {
                                return getDoneValue(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        removeWaiter(o00oo0o03);
                    } else {
                        o00oo0o02 = this.waiters;
                    }
                } while (o00oo0o02 != o00oo0O0.f1755o00oOo00);
                return getDoneValue(this.value);
            }
            return getDoneValue(this.value);
        }
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null) && (!(obj3 instanceof o00oo0))) {
                return getDoneValue(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String o00ooooo2 = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        StringBuilder o00oOOo02 = androidx.concurrent.futures.o00oOOo0.o00oOOo0("Waited ", j, " ");
        o00oOOo02.append(timeUnit.toString().toLowerCase(locale));
        String sb = o00oOOo02.toString();
        if (nanos + 1000 < 0) {
            String o00oOOo03 = o00oo.o00oOOo0(sb, " (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            int i = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
            if (i != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (i > 0) {
                String str = o00oOOo03 + convert + " " + lowerCase;
                if (z) {
                    str = o00oo.o00oOOo0(str, ",");
                }
                o00oOOo03 = o00oo.o00oOOo0(str, " ");
            }
            if (z) {
                o00oOOo03 = o00oOOo03 + nanos2 + " nanoseconds ";
            }
            sb = o00oo.o00oOOo0(o00oOOo03, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(o00oo.o00oOOo0(sb, " but future completed as timeout expired"));
        }
        throw new TimeoutException(android.support.v4.media.o00oOoO.o00oOOo0(sb, " for ", o00ooooo2));
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof o00oOo00;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof o00oo0)) & (obj != null);
    }

    final void maybePropagateCancellationTo(@o0OO00OO Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    @o0OO00OO
    public String pendingToString() {
        Object obj = this.value;
        if (obj instanceof o00oo0) {
            return android.support.v4.media.o00oOOoO.o00oOOo0(android.support.v4.media.o00oOo0O.o00oOOo0("setFuture=["), userObjectToString(((o00oo0) obj).f1748o00oo0O), "]");
        }
        if (this instanceof ScheduledFuture) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("remaining delay=[");
            o00oOOo02.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            o00oOOo02.append(" ms]");
            return o00oOOo02.toString();
        }
        return null;
    }

    public boolean set(@o0OO00OO V v) {
        if (v == null) {
            v = (V) NULL;
        }
        if (ATOMIC_HELPER.o00oOOoO(this, null, v)) {
            complete(this);
            return true;
        }
        return false;
    }

    public boolean setException(Throwable th) {
        if (ATOMIC_HELPER.o00oOOoO(this, null, new o00oOo0O((Throwable) checkNotNull(th)))) {
            complete(this);
            return true;
        }
        return false;
    }

    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        o00oOo0O o00ooo0o2;
        checkNotNull(listenableFuture);
        Object obj = this.value;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (ATOMIC_HELPER.o00oOOoO(this, null, getFutureValue(listenableFuture))) {
                    complete(this);
                    return true;
                }
                return false;
            }
            o00oo0 o00oo0Var = new o00oo0(this, listenableFuture);
            if (ATOMIC_HELPER.o00oOOoO(this, null, o00oo0Var)) {
                try {
                    listenableFuture.addListener(o00oo0Var, androidx.concurrent.futures.o00oOoO.INSTANCE);
                } catch (Throwable th) {
                    try {
                        o00ooo0o2 = new o00oOo0O(th);
                    } catch (Throwable unused) {
                        o00ooo0o2 = o00oOo0O.f1742o00oOOoO;
                    }
                    ATOMIC_HELPER.o00oOOoO(this, o00oo0Var, o00ooo0o2);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof o00oOo00) {
            listenableFuture.cancel(((o00oOo00) obj).f1740o00oOOo0);
        }
        return false;
    }

    public String toString() {
        String sb;
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (!isCancelled()) {
            if (!isDone()) {
                try {
                    sb = pendingToString();
                } catch (RuntimeException e) {
                    StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Exception thrown from implementation: ");
                    o00oOOo02.append(e.getClass());
                    sb = o00oOOo02.toString();
                }
                if (sb != null && !sb.isEmpty()) {
                    sb2.append("PENDING, info=[");
                    sb2.append(sb);
                    sb2.append("]");
                    sb2.append("]");
                    return sb2.toString();
                }
                str = isDone() ? "PENDING" : "PENDING";
            }
            addDoneString(sb2);
            sb2.append("]");
            return sb2.toString();
        }
        str = "CANCELLED";
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }

    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof o00oOo00) && ((o00oOo00) obj).f1740o00oOOo0;
    }
}
