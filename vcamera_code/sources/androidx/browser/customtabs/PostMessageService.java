package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.IPostMessageService;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class PostMessageService extends Service {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public IPostMessageService.Stub f1630o00oo0O0 = new o00oOOo0();

    /* loaded from: classes.dex */
    public class o00oOOo0 extends IPostMessageService.Stub {
        public o00oOOo0() {
        }

        @Override // android.support.customtabs.IPostMessageService
        public void onMessageChannelReady(@oo0oO0 ICustomTabsCallback iCustomTabsCallback, @o0OO00OO Bundle bundle) throws RemoteException {
            iCustomTabsCallback.onMessageChannelReady(bundle);
        }

        @Override // android.support.customtabs.IPostMessageService
        public void onPostMessage(@oo0oO0 ICustomTabsCallback iCustomTabsCallback, @oo0oO0 String str, @o0OO00OO Bundle bundle) throws RemoteException {
            iCustomTabsCallback.onPostMessage(str, bundle);
        }
    }

    @Override // android.app.Service
    @oo0oO0
    public IBinder onBind(@o0OO00OO Intent intent) {
        return this.f1630o00oo0O0;
    }
}
