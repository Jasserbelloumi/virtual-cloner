package androidx.core.content;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooo0.o0oOo0O0;
import o00ooo00.o0O00o00;
import o00ooo00.o0oO0Ooo;
/* loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {
    @SuppressLint({"ActionValue"})

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f2377o00oo0O = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o0O00o00.o00oOOoO f2378o00oo0O0 = new o00oOOo0();

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0O00o00.o00oOOoO {
        public o00oOOo0() {
        }

        @Override // o00ooo00.o0O00o00
        public void isPermissionRevocationEnabledForApp(@o0OO00OO o0oO0Ooo o0oo0ooo) throws RemoteException {
            if (o0oo0ooo == null) {
                return;
            }
            UnusedAppRestrictionsBackportService.this.o00oOOo0(new o0oOo0O0(o0oo0ooo));
        }
    }

    public abstract void o00oOOo0(@oo0oO0 o0oOo0O0 o0ooo0o0);

    @Override // android.app.Service
    @o0OO00OO
    public IBinder onBind(@o0OO00OO Intent intent) {
        return this.f2378o00oo0O0;
    }
}
