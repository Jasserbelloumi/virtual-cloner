package o0ooO0O0;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
/* loaded from: classes3.dex */
public class oO0OO0O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static Looper f17125o00oOOo0 = Looper.getMainLooper();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static Handler f17126o00oOOoO = new Handler(Looper.getMainLooper());

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static ExecutorService f17127o00oOo00 = null;

    @SuppressLint({"NewApi"})
    public static ExecutorService o00oOOo0() {
        return (ExecutorService) AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public static void o00oOOoO(Runnable runnable) {
        f17126o00oOOoO.removeCallbacks(runnable);
    }

    @SuppressLint({"NewApi"})
    public static void o00oOo00(Runnable runnable) {
        ((ExecutorService) AsyncTask.THREAD_POOL_EXECUTOR).execute(runnable);
    }

    public static void o00oOo0O(Runnable runnable) {
        if (Thread.currentThread() == f17125o00oOOo0.getThread()) {
            runnable.run();
        } else {
            f17126o00oOOoO.post(runnable);
        }
    }

    public static void o00oOo0o(Runnable runnable, long j) {
        f17126o00oOOoO.postDelayed(runnable, j);
    }

    public static void o00oOooO(Runnable runnable, boolean z) {
        if (z) {
            new Thread(runnable).start();
        } else {
            o00oOo00(runnable);
        }
    }
}
