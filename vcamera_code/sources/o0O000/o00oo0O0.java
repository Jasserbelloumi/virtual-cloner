package o0O000;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oo0O0 {

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements Executor {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final Handler f10105o00oo0O0;

        public o00oOOo0(@oo0oO0 Handler handler) {
            handler.getClass();
            this.f10105o00oo0O0 = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(@oo0oO0 Runnable runnable) {
            Handler handler = this.f10105o00oo0O0;
            runnable.getClass();
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(this.f10105o00oo0O0 + " is shutting down");
        }
    }

    @oo0oO0
    public static Executor o00oOOo0(@oo0oO0 Handler handler) {
        return new o00oOOo0(handler);
    }
}
