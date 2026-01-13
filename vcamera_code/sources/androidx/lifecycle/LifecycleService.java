package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public class LifecycleService extends Service implements o0O0O0O {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0OO00o0 f3229o00oo0O0 = new o0OO00o0(this);

    @Override // androidx.lifecycle.o0O0O0O
    @NotNull
    public o0O00 getLifecycle() {
        return this.f3229o00oo0O0.o00oOOo0();
    }

    @Override // android.app.Service
    @o00oOooO.o0O00O0
    @Nullable
    public IBinder onBind(@NotNull Intent intent) {
        o0OOOOO0.o0ooO.o00oo0O0(intent, "intent");
        this.f3229o00oo0O0.o00oOOoO();
        return null;
    }

    @Override // android.app.Service
    @o00oOooO.o0O00O0
    public void onCreate() {
        this.f3229o00oo0O0.o00oOo00();
        super.onCreate();
    }

    @Override // android.app.Service
    @o00oOooO.o0O00O0
    public void onDestroy() {
        this.f3229o00oo0O0.o00oOooO();
        super.onDestroy();
    }

    @Override // android.app.Service
    @o00oOooO.o0O00O0
    @o0OO0o.o0O0o(message = "Deprecated in Java")
    public void onStart(@Nullable Intent intent, int i) {
        this.f3229o00oo0O0.o00oOo0O();
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    @o00oOooO.o0O00O0
    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
