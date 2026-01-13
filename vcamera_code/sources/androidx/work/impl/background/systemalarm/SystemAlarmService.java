package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.background.systemalarm.o00oOo0O;
import o00oOooO.o0O;
import o00oOooO.o0OO0oO;
import o0O0Ooo0.o0O00000;
import o0O0o0o0.o0O0000O;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SystemAlarmService extends LifecycleService implements o00oOo0O.o00oOo00 {

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final String f5587o00oo0o0 = o0O00000.o00oOo0o("SystemAlarmService");

    /* renamed from: o00oo0O  reason: collision with root package name */
    public o00oOo0O f5588o00oo0O;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f5589o00oo0Oo;

    @Override // androidx.work.impl.background.systemalarm.o00oOo0O.o00oOo00
    @o0O
    public void o00oOOoO() {
        this.f5589o00oo0Oo = true;
        o0O00000.o00oOo00().o00oOOo0(f5587o00oo0o0, "All commands completed in dispatcher", new Throwable[0]);
        o0O0000O.o00oOOo0();
        stopSelf();
    }

    @o0O
    public final void o00oOo0O() {
        o00oOo0O o00ooo0o2 = new o00oOo0O(this, null, null);
        this.f5588o00oo0O = o00ooo0o2;
        o00ooo0o2.o00oo00O(this);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        o00oOo0O();
        this.f5589o00oo0Oo = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f5589o00oo0Oo = true;
        this.f5588o00oo0O.o00oOoOo();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f5589o00oo0Oo) {
            o0O00000.o00oOo00().o00oOooO(f5587o00oo0o0, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f5588o00oo0O.o00oOoOo();
            o00oOo0O();
            this.f5589o00oo0Oo = false;
        }
        if (intent != null) {
            this.f5588o00oo0O.o00oOOo0(intent, i2);
            return 3;
        }
        return 3;
    }
}
