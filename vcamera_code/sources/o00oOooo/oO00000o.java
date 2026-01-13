package o00oOooo;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.o00oOo0O;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class oO00000o extends oO0000O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Object f7149o00oOOo0 = new Object();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final ExecutorService f7150o00oOOoO = Executors.newFixedThreadPool(4, new o00oOOo0());
    @o0OO00OO

    /* renamed from: o00oOo00  reason: collision with root package name */
    public volatile Handler f7151o00oOo00;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements ThreadFactory {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final String f7152o00oOo00 = "arch_disk_io_";

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final AtomicInteger f7153o00oOOo0 = new AtomicInteger(0);

        public o00oOOo0() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0(f7152o00oOo00);
            o00oOOo02.append(this.f7153o00oOOo0.getAndIncrement());
            thread.setName(o00oOOo02.toString());
            return thread;
        }
    }

    @o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @oo0oO0
        public static Handler o00oOOo0(@oo0oO0 Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    @oo0oO0
    public static Handler o00oOo0O(@oo0oO0 Looper looper) {
        return Handler.createAsync(looper);
    }

    @Override // o00oOooo.oO0000O
    public void o00oOOo0(@oo0oO0 Runnable runnable) {
        this.f7150o00oOOoO.execute(runnable);
    }

    @Override // o00oOooo.oO0000O
    public boolean o00oOo00() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // o00oOooo.oO0000O
    public void o00oOooO(@oo0oO0 Runnable runnable) {
        if (this.f7151o00oOo00 == null) {
            synchronized (this.f7149o00oOOo0) {
                if (this.f7151o00oOo00 == null) {
                    this.f7151o00oOo00 = Handler.createAsync(Looper.getMainLooper());
                }
            }
        }
        this.f7151o00oOo00.post(runnable);
    }
}
