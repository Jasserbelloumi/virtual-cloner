package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.foreground.o00oOOo0;
import o00oOooO.o0O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o0O00000;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SystemForegroundService extends LifecycleService implements o00oOOo0.o00oOOoO {

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final String f5644o00oo0oO = o0O00000.o00oOo0o("SystemFgService");
    @o0OO00OO

    /* renamed from: o0O0o  reason: collision with root package name */
    public static SystemForegroundService f5645o0O0o = null;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public Handler f5646o00oo0O;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f5647o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public NotificationManager f5648o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public androidx.work.impl.foreground.o00oOOo0 f5649o00oo0o0;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ Notification f5650o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ int f5651o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ int f5652o00oo0Oo;

        public o00oOOo0(int i, Notification notification, int i2) {
            this.f5651o00oo0O0 = i;
            this.f5650o00oo0O = notification;
            this.f5652o00oo0Oo = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f5651o00oo0O0, this.f5650o00oo0O, this.f5652o00oo0Oo);
            } else {
                SystemForegroundService.this.startForeground(this.f5651o00oo0O0, this.f5650o00oo0O);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ Notification f5654o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ int f5655o00oo0O0;

        public o00oOOoO(int i, Notification notification) {
            this.f5655o00oo0O0 = i;
            this.f5654o00oo0O = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f5648o00oo0o.notify(this.f5655o00oo0O0, this.f5654o00oo0O);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ int f5658o00oo0O0;

        public o00oOo00(int i) {
            this.f5658o00oo0O0 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f5648o00oo0o.cancel(this.f5658o00oo0O0);
        }
    }

    @o0OO00OO
    public static SystemForegroundService o00oOo0O() {
        return f5645o0O0o;
    }

    @Override // androidx.work.impl.foreground.o00oOOo0.o00oOOoO
    public void o00oOOo0(int i, @oo0oO0 Notification notification) {
        this.f5646o00oo0O.post(new o00oOOoO(i, notification));
    }

    @Override // androidx.work.impl.foreground.o00oOOo0.o00oOOoO
    public void o00oOo00(int i, int i2, @oo0oO0 Notification notification) {
        this.f5646o00oo0O.post(new o00oOOo0(i, notification, i2));
    }

    @o0O
    public final void o00oOo0o() {
        this.f5646o00oo0O = new Handler(Looper.getMainLooper());
        this.f5648o00oo0o = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.o00oOOo0 o00oooo02 = new androidx.work.impl.foreground.o00oOOo0(getApplicationContext());
        this.f5649o00oo0o0 = o00oooo02;
        o00oooo02.o00oo0OO(this);
    }

    @Override // androidx.work.impl.foreground.o00oOOo0.o00oOOoO
    public void o00oOooO(int i) {
        this.f5646o00oo0O.post(new o00oOo00(i));
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        f5645o0O0o = this;
        o00oOo0o();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f5649o00oo0o0.o00oo00O();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(@o0OO00OO Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f5647o00oo0Oo) {
            o0O00000.o00oOo00().o00oOooO(f5644o00oo0oO, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f5649o00oo0o0.o00oo00O();
            o00oOo0o();
            this.f5647o00oo0Oo = false;
        }
        if (intent != null) {
            this.f5649o00oo0o0.o00oo0(intent);
            return 3;
        }
        return 3;
    }

    @Override // androidx.work.impl.foreground.o00oOOo0.o00oOOoO
    @o0O
    public void stop() {
        this.f5647o00oo0Oo = true;
        o0O00000.o00oOo00().o00oOOo0(f5644o00oo0oO, "All commands completed.", new Throwable[0]);
        stopForeground(true);
        f5645o0O0o = null;
        stopSelf();
    }
}
