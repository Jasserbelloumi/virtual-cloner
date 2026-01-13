package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oOo00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f2652o00oOOo0 = 15;

    @o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static Handler o00oOOo0(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    @oo0oO0
    @Deprecated
    public static Executor o00oOOoO(@oo0oO0 Handler handler) {
        Objects.requireNonNull(handler);
        return new o00oOOoO(handler);
    }

    public static ThreadPoolExecutor o00oOo00(@oo0oO0 final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: androidx.emoji2.text.o00oOOo0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return o00oOo00.o00oOooO(str, runnable);
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Handler o00oOo0O() {
        return o00oOOo0.o00oOOo0(Looper.getMainLooper());
    }

    public static /* synthetic */ Thread o00oOooO(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }
}
