package o0O000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oo0O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f10104o00oOOo0 = "HandlerCompat";

    @o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        public static Handler o00oOOo0(Looper looper) {
            return Handler.createAsync(looper);
        }

        public static Handler o00oOOoO(Looper looper, Handler.Callback callback) {
            return Handler.createAsync(looper, callback);
        }

        public static boolean o00oOo00(Handler handler, Runnable runnable, Object obj, long j) {
            return handler.postDelayed(runnable, obj, j);
        }
    }

    @o0OOooO0(29)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        public static boolean o00oOOo0(Handler handler, Runnable runnable) {
            boolean hasCallbacks;
            hasCallbacks = handler.hasCallbacks(runnable);
            return hasCallbacks;
        }
    }

    @oo0oO0
    public static Handler o00oOOo0(@oo0oO0 Looper looper) {
        return Handler.createAsync(looper);
    }

    @oo0oO0
    public static Handler o00oOOoO(@oo0oO0 Looper looper, @oo0oO0 Handler.Callback callback) {
        return Handler.createAsync(looper, callback);
    }

    @o0OOooO0(16)
    public static boolean o00oOo00(@oo0oO0 Handler handler, @oo0oO0 Runnable runnable) {
        boolean hasCallbacks;
        if (Build.VERSION.SDK_INT >= 29) {
            hasCallbacks = handler.hasCallbacks(runnable);
            return hasCallbacks;
        }
        try {
            return ((Boolean) Handler.class.getMethod("hasCallbacks", Runnable.class).invoke(handler, runnable)).booleanValue();
        } catch (IllegalAccessException e) {
            e = e;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (NoSuchMethodException e2) {
            e = e2;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (NullPointerException e3) {
            e = e3;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean o00oOooO(@oo0oO0 Handler handler, @oo0oO0 Runnable runnable, @o0OO00OO Object obj, long j) {
        return handler.postDelayed(runnable, obj, j);
    }
}
