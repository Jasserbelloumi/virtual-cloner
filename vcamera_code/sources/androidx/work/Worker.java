package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import o00oOooO.oO0Oo;
import o00oOooO.oo0oO0;
import o0O0o0o.o00ooO;
/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    public o00ooO<ListenableWorker.o00oOOo0> mFuture;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.mFuture.o00oo0O0(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.mFuture.o00oo0O(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(@oo0oO0 Context context, @oo0oO0 WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @oo0oO0
    @oO0Oo
    public abstract ListenableWorker.o00oOOo0 doWork();

    @Override // androidx.work.ListenableWorker
    @oo0oO0
    public final ListenableFuture<ListenableWorker.o00oOOo0> startWork() {
        this.mFuture = o00ooO.o00oo0oO();
        getBackgroundExecutor().execute(new o00oOOo0());
        return this.mFuture;
    }
}
