package o00oo0Oo;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00ooO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final ITrustedWebActivityCallback f7499o00oOOo0;

    public o00ooO(@oo0oO0 ITrustedWebActivityCallback iTrustedWebActivityCallback) {
        this.f7499o00oOOo0 = iTrustedWebActivityCallback;
    }

    @o0OO00OO
    public static o00ooO o00oOOo0(@o0OO00OO IBinder iBinder) {
        ITrustedWebActivityCallback asInterface = iBinder == null ? null : ITrustedWebActivityCallback.Stub.asInterface(iBinder);
        if (asInterface == null) {
            return null;
        }
        return new o00ooO(asInterface);
    }

    public void o00oOOoO(@oo0oO0 String str, @oo0oO0 Bundle bundle) throws RemoteException {
        this.f7499o00oOOo0.onExtraCallback(str, bundle);
    }
}
