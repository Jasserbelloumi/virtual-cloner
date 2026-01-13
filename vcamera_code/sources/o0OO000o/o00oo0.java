package o0OO000o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class o00oo0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static Thread f12968o00oOOo0 = Looper.getMainLooper().getThread();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static Handler f12969o00oOOoO = new Handler(Looper.getMainLooper());

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static volatile ThreadPoolExecutor f12970o00oOo00 = null;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f12971o00oOooO = 4;

    public static void o00oOOo0() {
        if (!o00oOooO()) {
            throw new RuntimeException("Must be called on the UI thread");
        }
    }

    public static ExecutorService o00oOOoO() {
        if (f12970o00oOo00 == null) {
            synchronized (o00oo0.class) {
                if (f12970o00oOo00 == null) {
                    int availableProcessors = Runtime.getRuntime().availableProcessors();
                    int i = availableProcessors > 4 ? 4 : availableProcessors;
                    f12970o00oOo00 = new ThreadPoolExecutor(i, i, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    f12970o00oOo00.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f12970o00oOo00;
    }

    public static Handler o00oOo00() {
        return f12969o00oOOoO;
    }

    public static Future o00oOo0O(Runnable runnable) {
        return o00oOOoO().submit(runnable);
    }

    public static Future o00oOo0o(Callable callable) {
        return o00oOOoO().submit(callable);
    }

    public static void o00oOoO0(Runnable runnable) {
        f12969o00oOOoO.post(runnable);
    }

    public static boolean o00oOooO() {
        return Thread.currentThread() == f12968o00oOOo0;
    }
}
