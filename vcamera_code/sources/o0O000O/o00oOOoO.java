package o0O000O;

import android.os.Handler;
import android.os.Looper;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oOOoO {
    @oo0oO0
    public static Handler o00oOOo0() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
