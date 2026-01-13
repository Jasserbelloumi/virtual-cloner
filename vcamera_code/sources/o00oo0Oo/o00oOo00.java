package o00oo0Oo;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import androidx.concurrent.futures.o00oOo0O;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0O;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oOo00 implements ServiceConnection {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f7477o00oo = 1;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final int f7478o00ooO0 = 3;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f7479o00ooO00 = 2;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f7480o0O0o = 0;
    @oo0oO0

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o00oOOo0 f7481o00oo0O;
    @oo0oO0

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Runnable f7482o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f7483o00oo0Oo;
    @oo0oO0

    /* renamed from: o00oo0o  reason: collision with root package name */
    public List<o00oOo0O.o00oOOo0<androidx.browser.trusted.o00oOOo0>> f7484o00oo0o;
    @o0OO00OO

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public androidx.browser.trusted.o00oOOo0 f7485o00oo0o0;
    @o0OO00OO

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public Exception f7486o00oo0oO;

    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @oo0oO0
        public androidx.browser.trusted.o00oOOo0 o00oOOo0(ComponentName componentName, IBinder iBinder) {
            return new androidx.browser.trusted.o00oOOo0(ITrustedWebActivityService.Stub.asInterface(iBinder), componentName);
        }
    }

    @o0O
    public o00oOo00(@oo0oO0 Runnable runnable) {
        this(runnable, new o00oOOo0());
    }

    @o0O
    public o00oOo00(@oo0oO0 Runnable runnable, @oo0oO0 o00oOOo0 o00oooo02) {
        this.f7483o00oo0Oo = 0;
        this.f7484o00oo0o = new ArrayList();
        this.f7482o00oo0O0 = runnable;
        this.f7481o00oo0O = o00oooo02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o00oOooO(o00oOo0O.o00oOOo0 o00oooo02) throws Exception {
        int i = this.f7483o00oo0Oo;
        if (i == 0) {
            this.f7484o00oo0o.add(o00oooo02);
        } else if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("Connection state is invalid");
                }
                throw this.f7486o00oo0oO;
            }
            throw new IllegalStateException("Service has been disconnected.");
        } else {
            androidx.browser.trusted.o00oOOo0 o00oooo03 = this.f7485o00oo0o0;
            if (o00oooo03 == null) {
                throw new IllegalStateException("ConnectionHolder state is incorrect.");
            }
            o00oooo02.o00oOo00(o00oooo03);
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("ConnectionHolder, state = ");
        o00oOOo02.append(this.f7483o00oo0Oo);
        return o00oOOo02.toString();
    }

    @o0O
    public void o00oOOoO(@oo0oO0 Exception exc) {
        for (o00oOo0O.o00oOOo0<androidx.browser.trusted.o00oOOo0> o00oooo02 : this.f7484o00oo0o) {
            o00oooo02.o00oOo0o(exc);
        }
        this.f7484o00oo0o.clear();
        this.f7482o00oo0O0.run();
        this.f7483o00oo0Oo = 3;
        this.f7486o00oo0oO = exc;
    }

    @o0O
    @oo0oO0
    public ListenableFuture<androidx.browser.trusted.o00oOOo0> o00oOo00() {
        return androidx.concurrent.futures.o00oOo0O.o00oOOo0(new o00oOo0O.o00oOo00() { // from class: o00oo0Oo.o00oOOoO
            @Override // androidx.concurrent.futures.o00oOo0O.o00oOo00
            public final Object o00oOOo0(o00oOo0O.o00oOOo0 o00oooo02) {
                Object o00oOooO2;
                o00oOooO2 = o00oOo00.this.o00oOooO(o00oooo02);
                return o00oOooO2;
            }
        });
    }

    @Override // android.content.ServiceConnection
    @o0O
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f7485o00oo0o0 = this.f7481o00oo0O.o00oOOo0(componentName, iBinder);
        for (o00oOo0O.o00oOOo0<androidx.browser.trusted.o00oOOo0> o00oooo02 : this.f7484o00oo0o) {
            o00oooo02.o00oOo00(this.f7485o00oo0o0);
        }
        this.f7484o00oo0o.clear();
        this.f7483o00oo0Oo = 1;
    }

    @Override // android.content.ServiceConnection
    @o0O
    public void onServiceDisconnected(ComponentName componentName) {
        this.f7485o00oo0o0 = null;
        this.f7482o00oo0O0.run();
        this.f7483o00oo0Oo = 2;
    }
}
