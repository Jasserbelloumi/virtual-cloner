package o00ooo0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.concurrent.futures.o00oo00O;
import androidx.core.content.UnusedAppRestrictionsBackportService;
import o00oOooO.o0OO00OO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o00ooo00.o0O00o00;
import o00ooo00.o0oO0Ooo;
/* loaded from: classes.dex */
public class oooOO0 implements ServiceConnection {
    @oo0oO0

    /* renamed from: o00oo0O  reason: collision with root package name */
    public o00oo00O<Integer> f9636o00oo0O;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final Context f9638o00oo0Oo;
    @o0OO00OO
    @o0o0000

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o00ooo00.o0O00o00 f9637o00oo0O0 = null;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public boolean f9639o00oo0o0 = false;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0oO0Ooo.o00oOOoO {
        public o00oOOo0() {
        }

        @Override // o00ooo00.o0oO0Ooo
        public void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z2) throws RemoteException {
            o00oo00O<Integer> o00oo00o;
            int i;
            if (z) {
                o00oo00o = oooOO0.this.f9636o00oo0O;
                i = z2 ? 3 : 2;
            } else {
                o00oo00o = oooOO0.this.f9636o00oo0O;
                i = 0;
            }
            o00oo00o.set(Integer.valueOf(i));
        }
    }

    public oooOO0(@oo0oO0 Context context) {
        this.f9638o00oo0Oo = context;
    }

    public void o00oOOo0(@oo0oO0 o00oo00O<Integer> o00oo00o) {
        if (this.f9639o00oo0o0) {
            throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
        }
        this.f9639o00oo0o0 = true;
        this.f9636o00oo0O = o00oo00o;
        this.f9638o00oo0Oo.bindService(new Intent(UnusedAppRestrictionsBackportService.f2377o00oo0O).setPackage(o0O0o000.o00oOOoO(this.f9638o00oo0Oo.getPackageManager())), this, 1);
    }

    public void o00oOOoO() {
        if (!this.f9639o00oo0o0) {
            throw new IllegalStateException("bindService must be called before unbind");
        }
        this.f9639o00oo0o0 = false;
        this.f9638o00oo0Oo.unbindService(this);
    }

    public final o00ooo00.o0oO0Ooo o00oOo00() {
        return new o00oOOo0();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        o00ooo00.o0O00o00 asInterface = o0O00o00.o00oOOoO.asInterface(iBinder);
        this.f9637o00oo0O0 = asInterface;
        try {
            asInterface.isPermissionRevocationEnabledForApp(o00oOo00());
        } catch (RemoteException unused) {
            this.f9636o00oo0O.set(0);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f9637o00oo0O0 = null;
    }
}
