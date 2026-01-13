package o0O000O;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o00oOooO.o0O0o00O;
import o00oOooO.oo0oO0;
import o0ooOoOO.o;
/* loaded from: classes.dex */
public class o00oo0O0 {

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements ThreadFactory {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public String f10334o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f10335o00oOOoO;

        /* renamed from: o0O000O.o00oo0O0$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0127o00oOOo0 extends Thread {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final int f10336o00oo0O0;

            public C0127o00oOOo0(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f10336o00oo0O0 = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f10336o00oo0O0);
                super.run();
            }
        }

        public o00oOOo0(@oo0oO0 String str, int i) {
            this.f10334o00oOOo0 = str;
            this.f10335o00oOOoO = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0127o00oOOo0(runnable, this.f10334o00oOOo0, this.f10335o00oOOoO);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO implements Executor {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final Handler f10337o00oo0O0;

        public o00oOOoO(@oo0oO0 Handler handler) {
            handler.getClass();
            this.f10337o00oo0O0 = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(@oo0oO0 Runnable runnable) {
            Handler handler = this.f10337o00oo0O0;
            runnable.getClass();
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(this.f10337o00oo0O0 + " is shutting down");
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00<T> implements Runnable {
        @oo0oO0

        /* renamed from: o00oo0O  reason: collision with root package name */
        public o<T> f10338o00oo0O;
        @oo0oO0

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public Callable<T> f10339o00oo0O0;
        @oo0oO0

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public Handler f10340o00oo0Oo;

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Runnable {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ Object f10341o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o f10342o00oo0O0;

            public o00oOOo0(o oVar, Object obj) {
                this.f10342o00oo0O0 = oVar;
                this.f10341o00oo0O = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f10342o00oo0O0.accept(this.f10341o00oo0O);
            }
        }

        public o00oOo00(@oo0oO0 Handler handler, @oo0oO0 Callable<T> callable, @oo0oO0 o<T> oVar) {
            this.f10339o00oo0O0 = callable;
            this.f10338o00oo0O = oVar;
            this.f10340o00oo0Oo = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t;
            try {
                t = this.f10339o00oo0O0.call();
            } catch (Exception unused) {
                t = null;
            }
            this.f10340o00oo0Oo.post(new o00oOOo0(this.f10338o00oo0O, t));
        }
    }

    public static ThreadPoolExecutor o00oOOo0(@oo0oO0 String str, int i, @o0O0o00O(from = 0) int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new o00oOOo0(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Executor o00oOOoO(@oo0oO0 Handler handler) {
        return new o00oOOoO(handler);
    }

    public static <T> void o00oOo00(@oo0oO0 Executor executor, @oo0oO0 Callable<T> callable, @oo0oO0 o<T> oVar) {
        executor.execute(new o00oOo00(o0O000O.o00oOOoO.o00oOOo0(), callable, oVar));
    }

    public static <T> T o00oOooO(@oo0oO0 ExecutorService executorService, @oo0oO0 Callable<T> callable, @o0O0o00O(from = 0) int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
