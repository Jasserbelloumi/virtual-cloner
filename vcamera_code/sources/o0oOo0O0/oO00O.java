package o0oOo0O0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0o0o0.o00oo;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class oO00O implements oO00O0oO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oo f16981o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Handler f16982o00oOOoO = new Handler(Looper.getMainLooper());

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Executor f16983o00oOo00 = new o00oOOo0();

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Executor {
        public o00oOOo0() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@oo0oO0 Runnable runnable) {
            oO00O.this.o00oOo00(runnable);
        }
    }

    public oO00O(@oo0oO0 Executor executor) {
        this.f16981o00oOOo0 = new o00oo(executor);
    }

    @Override // o0oOo0O0.oO00O0oO
    public Executor o00oOOo0() {
        return this.f16983o00oOo00;
    }

    @Override // o0oOo0O0.oO00O0oO
    public void o00oOOoO(Runnable runnable) {
        this.f16981o00oOOo0.execute(runnable);
    }

    @Override // o0oOo0O0.oO00O0oO
    public void o00oOo00(Runnable runnable) {
        this.f16982o00oOOoO.post(runnable);
    }

    @Override // o0oOo0O0.oO00O0oO
    @oo0oO0
    public o00oo o00oOooO() {
        return this.f16981o00oOOo0;
    }
}
