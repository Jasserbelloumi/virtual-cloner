package o0O0Ooo;

import android.os.Handler;
import android.os.Looper;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o0O00000 implements o0O0Ooo0.o0O00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Handler f12057o00oOOo0;

    public o0O00000() {
        this.f12057o00oOOo0 = Handler.createAsync(Looper.getMainLooper());
    }

    @o0o0000
    public o0O00000(@oo0oO0 Handler handler) {
        this.f12057o00oOOo0 = handler;
    }

    @Override // o0O0Ooo0.o0O00
    public void o00oOOo0(@oo0oO0 Runnable runnable) {
        this.f12057o00oOOo0.removeCallbacks(runnable);
    }

    @Override // o0O0Ooo0.o0O00
    public void o00oOOoO(long j, @oo0oO0 Runnable runnable) {
        this.f12057o00oOOo0.postDelayed(runnable, j);
    }

    @oo0oO0
    public Handler o00oOo00() {
        return this.f12057o00oOOo0;
    }
}
