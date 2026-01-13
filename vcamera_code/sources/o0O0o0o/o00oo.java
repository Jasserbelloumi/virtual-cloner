package o0O0o0o;

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
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class o00oo<V> implements ListenableFuture<V> {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final Object f12491o00oo;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final long f12494o00oo0oO = 1000;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final o00oOOoO f12495o0O0o;
    @o0OO00OO

    /* renamed from: o00oo0O  reason: collision with root package name */
    public volatile o00oOoO f12496o00oo0O;
    @o0OO00OO

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public volatile Object f12497o00oo0O0;
    @o0OO00OO

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public volatile o00oo0O0 f12498o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final boolean f12493o00oo0o0 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final Logger f12492o00oo0o = Logger.getLogger(o00oo.class.getName());

    /* loaded from: classes.dex */
    public static abstract class o00oOOoO {
        public o00oOOoO() {
        }

        public o00oOOoO(o00oOOo0 o00oooo02) {
        }

        public abstract boolean o00oOOo0(o00oo<?> o00ooVar, o00oOoO o00oooo2, o00oOoO o00oooo3);

        public abstract boolean o00oOOoO(o00oo<?> o00ooVar, Object obj, Object obj2);

        public abstract boolean o00oOo00(o00oo<?> o00ooVar, o00oo0O0 o00oo0o02, o00oo0O0 o00oo0o03);

        public abstract void o00oOo0O(o00oo0O0 o00oo0o02, Thread thread);

        public abstract void o00oOooO(o00oo0O0 o00oo0o02, o00oo0O0 o00oo0o03);
    }

    /* loaded from: classes.dex */
    public static final class o00oOo00 {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final o00oOo00 f12499o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final o00oOo00 f12500o00oOooO;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final boolean f12501o00oOOo0;
        @o0OO00OO

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Throwable f12502o00oOOoO;

        static {
            if (o00oo.f12493o00oo0o0) {
                f12500o00oOooO = null;
                f12499o00oOo00 = null;
                return;
            }
            f12500o00oOooO = new o00oOo00(false, null);
            f12499o00oOo00 = new o00oOo00(true, null);
        }

        public o00oOo00(boolean z, @o0OO00OO Throwable th) {
            this.f12501o00oOOo0 = z;
            this.f12502o00oOOoO = th;
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOo0O {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final o00oOo0O f12503o00oOOoO = new o00oOo0O(new o00oOOo0("Failure occurred while trying to finish a future."));

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Throwable f12504o00oOOo0;

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
            this.f12504o00oOOo0 = (Throwable) o00oo.o00oOooO(th);
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOoO {

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final o00oOoO f12505o00oOooO = new o00oOoO(null, null);

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Runnable f12506o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Executor f12507o00oOOoO;
        @o0OO00OO

        /* renamed from: o00oOo00  reason: collision with root package name */
        public o00oOoO f12508o00oOo00;

        public o00oOoO(Runnable runnable, Executor executor) {
            this.f12506o00oOOo0 = runnable;
            this.f12507o00oOOoO = executor;
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oo0<V> implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final ListenableFuture<? extends V> f12509o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o00oo<V> f12510o00oo0O0;

        public o00oo0(o00oo<V> o00ooVar, ListenableFuture<? extends V> listenableFuture) {
            this.f12510o00oo0O0 = o00ooVar;
            this.f12509o00oo0O = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f12510o00oo0O0.f12497o00oo0O0 != this) {
                return;
            }
            if (o00oo.f12495o0O0o.o00oOOoO(this.f12510o00oo0O0, this, o00oo.o00oOoOO(this.f12509o00oo0O))) {
                o00oo.o00oOo0o(this.f12510o00oo0O0);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oo00O extends o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<o00oo0O0, Thread> f12511o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<o00oo0O0, o00oo0O0> f12512o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<o00oo, o00oo0O0> f12513o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<o00oo, Object> f12514o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<o00oo, o00oOoO> f12515o00oOooO;

        public o00oo00O(AtomicReferenceFieldUpdater<o00oo0O0, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<o00oo0O0, o00oo0O0> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<o00oo, o00oo0O0> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<o00oo, o00oOoO> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<o00oo, Object> atomicReferenceFieldUpdater5) {
            super(null);
            this.f12511o00oOOo0 = atomicReferenceFieldUpdater;
            this.f12512o00oOOoO = atomicReferenceFieldUpdater2;
            this.f12513o00oOo00 = atomicReferenceFieldUpdater3;
            this.f12515o00oOooO = atomicReferenceFieldUpdater4;
            this.f12514o00oOo0O = atomicReferenceFieldUpdater5;
        }

        @Override // o0O0o0o.o00oo.o00oOOoO
        public boolean o00oOOo0(o00oo<?> o00ooVar, o00oOoO o00oooo2, o00oOoO o00oooo3) {
            return androidx.concurrent.futures.o00oOo00.o00oOOo0(this.f12515o00oOooO, o00ooVar, o00oooo2, o00oooo3);
        }

        @Override // o0O0o0o.o00oo.o00oOOoO
        public boolean o00oOOoO(o00oo<?> o00ooVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.o00oOo00.o00oOOo0(this.f12514o00oOo0O, o00ooVar, obj, obj2);
        }

        @Override // o0O0o0o.o00oo.o00oOOoO
        public boolean o00oOo00(o00oo<?> o00ooVar, o00oo0O0 o00oo0o02, o00oo0O0 o00oo0o03) {
            return androidx.concurrent.futures.o00oOo00.o00oOOo0(this.f12513o00oOo00, o00ooVar, o00oo0o02, o00oo0o03);
        }

        @Override // o0O0o0o.o00oo.o00oOOoO
        public void o00oOo0O(o00oo0O0 o00oo0o02, Thread thread) {
            this.f12511o00oOOo0.lazySet(o00oo0o02, thread);
        }

        @Override // o0O0o0o.o00oo.o00oOOoO
        public void o00oOooO(o00oo0O0 o00oo0o02, o00oo0O0 o00oo0o03) {
            this.f12512o00oOOoO.lazySet(o00oo0o02, o00oo0o03);
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oo0O0 {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final o00oo0O0 f12516o00oOo00 = new o00oo0O0(false);
        @o0OO00OO

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public volatile Thread f12517o00oOOo0;
        @o0OO00OO

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public volatile o00oo0O0 f12518o00oOOoO;

        public o00oo0O0() {
            o00oo.f12495o0O0o.o00oOo0O(this, Thread.currentThread());
        }

        public o00oo0O0(boolean z) {
        }

        public void o00oOOo0(o00oo0O0 o00oo0o02) {
            o00oo.f12495o0O0o.o00oOooO(this, o00oo0o02);
        }

        public void o00oOOoO() {
            Thread thread = this.f12517o00oOOo0;
            if (thread != null) {
                this.f12517o00oOOo0 = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oo0OO extends o00oOOoO {
        public o00oo0OO() {
            super(null);
        }

        @Override // o0O0o0o.o00oo.o00oOOoO
        public boolean o00oOOo0(o00oo<?> o00ooVar, o00oOoO o00oooo2, o00oOoO o00oooo3) {
            synchronized (o00ooVar) {
                if (o00ooVar.f12496o00oo0O == o00oooo2) {
                    o00ooVar.f12496o00oo0O = o00oooo3;
                    return true;
                }
                return false;
            }
        }

        @Override // o0O0o0o.o00oo.o00oOOoO
        public boolean o00oOOoO(o00oo<?> o00ooVar, Object obj, Object obj2) {
            synchronized (o00ooVar) {
                if (o00ooVar.f12497o00oo0O0 == obj) {
                    o00ooVar.f12497o00oo0O0 = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // o0O0o0o.o00oo.o00oOOoO
        public boolean o00oOo00(o00oo<?> o00ooVar, o00oo0O0 o00oo0o02, o00oo0O0 o00oo0o03) {
            synchronized (o00ooVar) {
                if (o00ooVar.f12498o00oo0Oo == o00oo0o02) {
                    o00ooVar.f12498o00oo0Oo = o00oo0o03;
                    return true;
                }
                return false;
            }
        }

        @Override // o0O0o0o.o00oo.o00oOOoO
        public void o00oOo0O(o00oo0O0 o00oo0o02, Thread thread) {
            o00oo0o02.f12517o00oOOo0 = thread;
        }

        @Override // o0O0o0o.o00oo.o00oOOoO
        public void o00oOooO(o00oo0O0 o00oo0o02, o00oo0O0 o00oo0o03) {
            o00oo0o02.f12518o00oOOoO = o00oo0o03;
        }
    }

    static {
        o00oOOoO o00oo0oo;
        try {
            o00oo0oo = new o00oo00O(AtomicReferenceFieldUpdater.newUpdater(o00oo0O0.class, Thread.class, "o00oOOo0"), AtomicReferenceFieldUpdater.newUpdater(o00oo0O0.class, o00oo0O0.class, o0OO000o.o00oOOoO.f12961o00oOo00), AtomicReferenceFieldUpdater.newUpdater(o00oo.class, o00oo0O0.class, "o00oo0Oo"), AtomicReferenceFieldUpdater.newUpdater(o00oo.class, o00oOoO.class, "o00oo0O"), AtomicReferenceFieldUpdater.newUpdater(o00oo.class, Object.class, "o00oo0O0"));
            th = null;
        } catch (Throwable th) {
            th = th;
            o00oo0oo = new o00oo0OO();
        }
        f12495o0O0o = o00oo0oo;
        if (th != null) {
            f12492o00oo0o.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f12491o00oo = new Object();
    }

    public static CancellationException o00oOo00(@o0OO00OO String str, @o0OO00OO Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [o0O0o0o.o00oo$o00oOOoO] */
    /* JADX WARN: Type inference failed for: r4v0, types: [o0O0o0o.o00oo<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [o0O0o0o.o00oo] */
    /* JADX WARN: Type inference failed for: r4v6, types: [o0O0o0o.o00oo<V>, o0O0o0o.o00oo] */
    public static void o00oOo0o(o00oo<?> o00ooVar) {
        o00oOoO o00oooo2 = null;
        while (true) {
            o00ooVar.o00oo0();
            o00ooVar.o00oOOoO();
            o00oOoO o00oOo0O2 = o00ooVar.o00oOo0O(o00oooo2);
            while (o00oOo0O2 != null) {
                o00oooo2 = o00oOo0O2.f12508o00oOo00;
                Runnable runnable = o00oOo0O2.f12506o00oOOo0;
                if (runnable instanceof o00oo0) {
                    o00oo0 o00oo0Var = (o00oo0) runnable;
                    o00ooVar = o00oo0Var.f12510o00oo0O0;
                    if (o00ooVar.f12497o00oo0O0 == o00oo0Var) {
                        if (f12495o0O0o.o00oOOoO(o00ooVar, o00oo0Var, o00oOoOO(o00oo0Var.f12509o00oo0O))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    o00oOoO0(runnable, o00oOo0O2.f12507o00oOOoO);
                }
                o00oOo0O2 = o00oooo2;
            }
            return;
        }
    }

    public static void o00oOoO0(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f12492o00oo0o;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object o00oOoOO(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof o00oo) {
            Object obj = ((o00oo) listenableFuture).f12497o00oo0O0;
            if (obj instanceof o00oOo00) {
                o00oOo00 o00ooo002 = (o00oOo00) obj;
                return o00ooo002.f12501o00oOOo0 ? o00ooo002.f12502o00oOOoO != null ? new o00oOo00(false, o00ooo002.f12502o00oOOoO) : o00oOo00.f12500o00oOooO : obj;
            }
            return obj;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!f12493o00oo0o0) && isCancelled) {
            return o00oOo00.f12500o00oOooO;
        }
        try {
            Object o00oOoOo2 = o00oOoOo(listenableFuture);
            return o00oOoOo2 == null ? f12491o00oo : o00oOoOo2;
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

    public static <V> V o00oOoOo(Future<V> future) throws ExecutionException {
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

    @oo0oO0
    public static <T> T o00oOooO(@o0OO00OO T t) {
        t.getClass();
        return t;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        o00oOoO o00oooo2 = this.f12496o00oo0O;
        if (o00oooo2 == o00oOoO.f12505o00oOooO) {
            o00oOoO0(runnable, executor);
        }
        o00oOoO o00oooo3 = new o00oOoO(runnable, executor);
        do {
            o00oooo3.f12508o00oOo00 = o00oooo2;
            if (f12495o0O0o.o00oOOo0(this, o00oooo2, o00oooo3)) {
                return;
            }
            o00oooo2 = this.f12496o00oo0O;
        } while (o00oooo2 != o00oOoO.f12505o00oOooO);
        o00oOoO0(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f12497o00oo0O0;
        if (!(obj == null) && !(obj instanceof o00oo0)) {
            return false;
        }
        o00oOo00 o00ooo002 = f12493o00oo0o0 ? new o00oOo00(z, new CancellationException("Future.cancel() was called.")) : z ? o00oOo00.f12499o00oOo00 : o00oOo00.f12500o00oOooO;
        o00oo<V> o00ooVar = this;
        boolean z2 = false;
        while (true) {
            if (f12495o0O0o.o00oOOoO(o00ooVar, obj, o00ooo002)) {
                if (z) {
                    o00ooVar.o00oOoo0();
                }
                o00oOo0o(o00ooVar);
                if (!(obj instanceof o00oo0)) {
                    return true;
                }
                ListenableFuture<? extends V> listenableFuture = ((o00oo0) obj).f12509o00oo0O;
                if (!(listenableFuture instanceof o00oo)) {
                    listenableFuture.cancel(z);
                    return true;
                }
                o00ooVar = (o00oo) listenableFuture;
                obj = o00ooVar.f12497o00oo0O0;
                if (!(obj == null) && !(obj instanceof o00oo0)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = o00ooVar.f12497o00oo0O0;
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
        Object obj2 = this.f12497o00oo0O0;
        if ((obj2 != null) && (!(obj2 instanceof o00oo0))) {
            return o00oOoO(obj2);
        }
        o00oo0O0 o00oo0o02 = this.f12498o00oo0Oo;
        if (o00oo0o02 != o00oo0O0.f12516o00oOo00) {
            o00oo0O0 o00oo0o03 = new o00oo0O0();
            do {
                o00oo0o03.o00oOOo0(o00oo0o02);
                if (f12495o0O0o.o00oOo00(this, o00oo0o02, o00oo0o03)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            o00oo0OO(o00oo0o03);
                            throw new InterruptedException();
                        }
                        obj = this.f12497o00oo0O0;
                    } while (!((obj != null) & (!(obj instanceof o00oo0))));
                    return o00oOoO(obj);
                }
                o00oo0o02 = this.f12498o00oo0Oo;
            } while (o00oo0o02 != o00oo0O0.f12516o00oOo00);
            return o00oOoO(this.f12497o00oo0O0);
        }
        return o00oOoO(this.f12497o00oo0O0);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f12497o00oo0O0;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof o00oo0))) {
            return o00oOoO(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            o00oo0O0 o00oo0o02 = this.f12498o00oo0Oo;
            if (o00oo0o02 != o00oo0O0.f12516o00oOo00) {
                o00oo0O0 o00oo0o03 = new o00oo0O0();
                do {
                    o00oo0o03.o00oOOo0(o00oo0o02);
                    if (f12495o0O0o.o00oOo00(this, o00oo0o02, o00oo0o03)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                o00oo0OO(o00oo0o03);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f12497o00oo0O0;
                            if ((obj2 != null) && (!(obj2 instanceof o00oo0))) {
                                return o00oOoO(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        o00oo0OO(o00oo0o03);
                    } else {
                        o00oo0o02 = this.f12498o00oo0Oo;
                    }
                } while (o00oo0o02 != o00oo0O0.f12516o00oOo00);
                return o00oOoO(this.f12497o00oo0O0);
            }
            return o00oOoO(this.f12497o00oo0O0);
        }
        while (nanos > 0) {
            Object obj3 = this.f12497o00oo0O0;
            if ((obj3 != null) && (!(obj3 instanceof o00oo0))) {
                return o00oOoO(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String o00ooVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        StringBuilder o00oOOo02 = androidx.concurrent.futures.o00oOOo0.o00oOOo0("Waited ", j, " ");
        o00oOOo02.append(timeUnit.toString().toLowerCase(locale));
        String sb = o00oOOo02.toString();
        if (nanos + 1000 < 0) {
            String o00oOOo03 = o00oOoOo.o00oo.o00oOOo0(sb, " (plus ");
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
                    str = o00oOoOo.o00oo.o00oOOo0(str, ",");
                }
                o00oOOo03 = o00oOoOo.o00oo.o00oOOo0(str, " ");
            }
            if (z) {
                o00oOOo03 = o00oOOo03 + nanos2 + " nanoseconds ";
            }
            sb = o00oOoOo.o00oo.o00oOOo0(o00oOOo03, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(o00oOoOo.o00oo.o00oOOo0(sb, " but future completed as timeout expired"));
        }
        throw new TimeoutException(android.support.v4.media.o00oOoO.o00oOOo0(sb, " for ", o00ooVar));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f12497o00oo0O0 instanceof o00oOo00;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f12497o00oo0O0;
        return (!(obj instanceof o00oo0)) & (obj != null);
    }

    public final void o00oOOo0(StringBuilder sb) {
        String str = "]";
        try {
            Object o00oOoOo2 = o00oOoOo(this);
            sb.append("SUCCESS, result=[");
            sb.append(o00oo0o0(o00oOoOo2));
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

    public void o00oOOoO() {
    }

    public final o00oOoO o00oOo0O(o00oOoO o00oooo2) {
        o00oOoO o00oooo3;
        do {
            o00oooo3 = this.f12496o00oo0O;
        } while (!f12495o0O0o.o00oOOo0(this, o00oooo3, o00oOoO.f12505o00oOooO));
        o00oOoO o00oooo4 = o00oooo2;
        o00oOoO o00oooo5 = o00oooo3;
        while (o00oooo5 != null) {
            o00oOoO o00oooo6 = o00oooo5.f12508o00oOo00;
            o00oooo5.f12508o00oOo00 = o00oooo4;
            o00oooo4 = o00oooo5;
            o00oooo5 = o00oooo6;
        }
        return o00oooo4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V o00oOoO(Object obj) throws ExecutionException {
        if (obj instanceof o00oOo00) {
            throw o00oOo00("Task was cancelled.", ((o00oOo00) obj).f12502o00oOOoO);
        }
        if (obj instanceof o00oOo0O) {
            throw new ExecutionException(((o00oOo0O) obj).f12504o00oOOo0);
        }
        if (obj == f12491o00oo) {
            return null;
        }
        return obj;
    }

    public void o00oOoo0() {
    }

    public final void o00oOooo(@o0OO00OO Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(o00oo0o());
        }
    }

    public final void o00oo0() {
        o00oo0O0 o00oo0o02;
        do {
            o00oo0o02 = this.f12498o00oo0Oo;
        } while (!f12495o0O0o.o00oOo00(this, o00oo0o02, o00oo0O0.f12516o00oOo00));
        while (o00oo0o02 != null) {
            o00oo0o02.o00oOOoO();
            o00oo0o02 = o00oo0o02.f12518o00oOOoO;
        }
    }

    @o0OO00OO
    public String o00oo00O() {
        Object obj = this.f12497o00oo0O0;
        if (obj instanceof o00oo0) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("setFuture=[");
            o00oOOo02.append(o00oo0o0(((o00oo0) obj).f12509o00oo0O));
            o00oOOo02.append("]");
            return o00oOOo02.toString();
        } else if (this instanceof ScheduledFuture) {
            StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0("remaining delay=[");
            o00oOOo03.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            o00oOOo03.append(" ms]");
            return o00oOOo03.toString();
        } else {
            return null;
        }
    }

    public boolean o00oo0O(Throwable th) {
        th.getClass();
        if (f12495o0O0o.o00oOOoO(this, null, new o00oOo0O(th))) {
            o00oOo0o(this);
            return true;
        }
        return false;
    }

    public boolean o00oo0O0(@o0OO00OO V v) {
        if (v == null) {
            v = (V) f12491o00oo;
        }
        if (f12495o0O0o.o00oOOoO(this, null, v)) {
            o00oOo0o(this);
            return true;
        }
        return false;
    }

    public final void o00oo0OO(o00oo0O0 o00oo0o02) {
        o00oo0o02.f12517o00oOOo0 = null;
        while (true) {
            o00oo0O0 o00oo0o03 = this.f12498o00oo0Oo;
            if (o00oo0o03 == o00oo0O0.f12516o00oOo00) {
                return;
            }
            o00oo0O0 o00oo0o04 = null;
            while (o00oo0o03 != null) {
                o00oo0O0 o00oo0o05 = o00oo0o03.f12518o00oOOoO;
                if (o00oo0o03.f12517o00oOOo0 != null) {
                    o00oo0o04 = o00oo0o03;
                } else if (o00oo0o04 != null) {
                    o00oo0o04.f12518o00oOOoO = o00oo0o05;
                    if (o00oo0o04.f12517o00oOOo0 == null) {
                        break;
                    }
                } else if (!f12495o0O0o.o00oOo00(this, o00oo0o03, o00oo0o05)) {
                    break;
                }
                o00oo0o03 = o00oo0o05;
            }
            return;
        }
    }

    public boolean o00oo0Oo(ListenableFuture<? extends V> listenableFuture) {
        o00oOo0O o00ooo0o2;
        listenableFuture.getClass();
        Object obj = this.f12497o00oo0O0;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (f12495o0O0o.o00oOOoO(this, null, o00oOoOO(listenableFuture))) {
                    o00oOo0o(this);
                    return true;
                }
                return false;
            }
            o00oo0 o00oo0Var = new o00oo0(this, listenableFuture);
            if (f12495o0O0o.o00oOOoO(this, null, o00oo0Var)) {
                try {
                    listenableFuture.addListener(o00oo0Var, o00ooO0.INSTANCE);
                } catch (Throwable th) {
                    try {
                        o00ooo0o2 = new o00oOo0O(th);
                    } catch (Throwable unused) {
                        o00ooo0o2 = o00oOo0O.f12503o00oOOoO;
                    }
                    f12495o0O0o.o00oOOoO(this, o00oo0Var, o00ooo0o2);
                }
                return true;
            }
            obj = this.f12497o00oo0O0;
        }
        if (obj instanceof o00oOo00) {
            listenableFuture.cancel(((o00oOo00) obj).f12501o00oOOo0);
        }
        return false;
    }

    public final boolean o00oo0o() {
        Object obj = this.f12497o00oo0O0;
        return (obj instanceof o00oOo00) && ((o00oOo00) obj).f12501o00oOOo0;
    }

    public final String o00oo0o0(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
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
                    sb = o00oo00O();
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
            o00oOOo0(sb2);
            sb2.append("]");
            return sb2.toString();
        }
        str = "CANCELLED";
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }
}
