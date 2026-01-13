package o0ooO0O0;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes3.dex */
public class oO0O00oO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static Handler f17113o00oOOo0 = new Handler(Looper.getMainLooper());

    public static void o00oOOo0(Runnable runnable) {
        f17113o00oOOo0.post(runnable);
    }

    public static void o00oOOoO(Runnable runnable, long j) {
        f17113o00oOOo0.postDelayed(runnable, j);
    }
}
