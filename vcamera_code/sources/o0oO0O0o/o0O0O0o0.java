package o0oO0O0o;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o00oOooO.o0OO0oO;
/* loaded from: classes.dex */
public abstract class o0O0O0o0<Params, Progress, Result> {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f16906o00oo = 128;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final String f16907o00oo0oO = "AsyncTask";

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f16908o00ooO = 1;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final ThreadFactory f16909o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f16910o00ooO00 = 1;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final BlockingQueue<Runnable> f16911o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final Executor f16912o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static o00oo00O f16913o00ooOO = null;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f16914o00ooOO0 = 2;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static volatile Executor f16915o00ooOOo = null;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f16916o0O0o = 5;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final FutureTask<Result> f16917o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00oo0OO<Params, Result> f16918o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public volatile o00oo0 f16919o00oo0Oo = o00oo0.PENDING;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final AtomicBoolean f16921o00oo0o0 = new AtomicBoolean();

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final AtomicBoolean f16920o00oo0o = new AtomicBoolean();

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements ThreadFactory {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final AtomicInteger f16922o00oOOo0 = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("ModernAsyncTask #");
            o00oOOo02.append(this.f16922o00oOOo0.getAndIncrement());
            return new Thread(runnable, o00oOOo02.toString());
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends o00oo0OO<Params, Result> {
        public o00oOOoO() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            o0O0O0o0.this.f16920o00oo0o.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) o0O0O0o0.this.o00oOOoO(this.f16928o00oOOo0);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 extends FutureTask<Result> {
        public o00oOo00(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                o0O0O0o0.this.o00oo0Oo(get());
            } catch (InterruptedException unused) {
            } catch (CancellationException unused2) {
                o0O0O0o0.this.o00oo0Oo(null);
            } catch (ExecutionException e) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f16925o00oOOo0;

        static {
            int[] iArr = new int[o00oo0.values().length];
            f16925o00oOOo0 = iArr;
            try {
                iArr[o00oo0.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16925o00oOOo0[o00oo0.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO<Data> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o0O0O0o0 f16926o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Data[] f16927o00oOOoO;

        public o00oOoO(o0O0O0o0 o0o0o0o0, Data... dataArr) {
            this.f16926o00oOOo0 = o0o0o0o0;
            this.f16927o00oOOoO = dataArr;
        }
    }

    /* loaded from: classes.dex */
    public enum o00oo0 {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* loaded from: classes.dex */
    public static class o00oo00O extends Handler {
        public o00oo00O() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            o00oOoO o00oooo2 = (o00oOoO) message.obj;
            int i = message.what;
            if (i == 1) {
                o00oooo2.f16926o00oOOo0.o00oOo0o(o00oooo2.f16927o00oOOoO[0]);
            } else if (i != 2) {
            } else {
                o00oooo2.f16926o00oOOo0.o00oo0O0(o00oooo2.f16927o00oOOoO);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oo0OO<Params, Result> implements Callable<Result> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Params[] f16928o00oOOo0;
    }

    static {
        o00oOOo0 o00oooo02 = new o00oOOo0();
        f16909o00ooO0 = o00oooo02;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f16911o00ooO0O = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, o00oooo02);
        f16912o00ooO0o = threadPoolExecutor;
        f16915o00ooOOo = threadPoolExecutor;
    }

    public o0O0O0o0() {
        o00oOOoO o00ooooo2 = new o00oOOoO();
        this.f16918o00oo0O0 = o00ooooo2;
        this.f16917o00oo0O = new o00oOo00(o00ooooo2);
    }

    public static Handler o00oOoOO() {
        o00oo00O o00oo00o;
        synchronized (o0O0O0o0.class) {
            if (f16913o00ooOO == null) {
                f16913o00ooOO = new o00oo00O();
            }
            o00oo00o = f16913o00ooOO;
        }
        return o00oo00o;
    }

    public static void o00oOooO(Runnable runnable) {
        f16915o00ooOOo.execute(runnable);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static void o00oo0o(Executor executor) {
        f16915o00ooOOo = executor;
    }

    public final boolean o00oOOo0(boolean z) {
        this.f16921o00oo0o0.set(true);
        return this.f16917o00oo0O.cancel(z);
    }

    public abstract Result o00oOOoO(Params... paramsArr);

    public final o0O0O0o0<Params, Progress, Result> o00oOo00(Params... paramsArr) {
        return o00oOo0O(f16915o00ooOOo, paramsArr);
    }

    public final o0O0O0o0<Params, Progress, Result> o00oOo0O(Executor executor, Params... paramsArr) {
        if (this.f16919o00oo0Oo == o00oo0.PENDING) {
            this.f16919o00oo0Oo = o00oo0.RUNNING;
            o00oo0OO();
            this.f16918o00oo0O0.f16928o00oOOo0 = paramsArr;
            executor.execute(this.f16917o00oo0O);
            return this;
        }
        int i = o00oOo0O.f16925o00oOOo0[this.f16919o00oo0Oo.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("We should never reach this state");
            }
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("Cannot execute task: the task is already running.");
    }

    public void o00oOo0o(Result result) {
        if (o00oOoo0()) {
            o00oo00O(result);
        } else {
            o00oo0(result);
        }
        this.f16919o00oo0Oo = o00oo0.FINISHED;
    }

    public final Result o00oOoO(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f16917o00oo0O.get(j, timeUnit);
    }

    public final Result o00oOoO0() throws InterruptedException, ExecutionException {
        return this.f16917o00oo0O.get();
    }

    public final o00oo0 o00oOoOo() {
        return this.f16919o00oo0Oo;
    }

    public final boolean o00oOoo0() {
        return this.f16921o00oo0o0.get();
    }

    public void o00oOooo() {
    }

    public void o00oo0(Result result) {
    }

    public void o00oo00O(Result result) {
        o00oOooo();
    }

    public Result o00oo0O(Result result) {
        o00oOoOO().obtainMessage(1, new o00oOoO(this, result)).sendToTarget();
        return result;
    }

    public void o00oo0O0(Progress... progressArr) {
    }

    public void o00oo0OO() {
    }

    public void o00oo0Oo(Result result) {
        if (this.f16920o00oo0o.get()) {
            return;
        }
        o00oo0O(result);
    }

    public final void o00oo0o0(Progress... progressArr) {
        if (o00oOoo0()) {
            return;
        }
        o00oOoOO().obtainMessage(2, new o00oOoO(this, progressArr)).sendToTarget();
    }
}
