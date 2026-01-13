package o00oo0O;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.IPostMessageService;
import androidx.browser.customtabs.PostMessageService;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class o00oo0O implements o00oo0O0, ServiceConnection {

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final String f7378o00oo0oO = "PostMessageServConn";

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final ICustomTabsCallback f7379o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Object f7380o00oo0O0 = new Object();
    @o0OO00OO

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public IPostMessageService f7381o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public boolean f7382o00oo0o;
    @o0OO00OO

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public String f7383o00oo0o0;

    public o00oo0O(@oo0oO0 o00oo0OO o00oo0oo) {
        IBinder o00oOo002 = o00oo0oo.o00oOo00();
        if (o00oOo002 == null) {
            throw new IllegalArgumentException("Provided session must have binder.");
        }
        this.f7379o00oo0O = ICustomTabsCallback.Stub.asInterface(o00oOo002);
    }

    @Override // o00oo0O.o00oo0O0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public void o00oOOo0(@oo0oO0 Context context) {
        o00oo00O(context);
    }

    @Override // o00oo0O.o00oo0O0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public final boolean o00oOOoO(@o0OO00OO Bundle bundle) {
        return o00oOoO0(bundle);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public boolean o00oOo00(@oo0oO0 Context context) {
        String str = this.f7383o00oo0o0;
        if (str != null) {
            return o00oOooO(context, str);
        }
        throw new IllegalStateException("setPackageName must be called before bindSessionToPostMessageService.");
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public void o00oOo0O(@oo0oO0 Context context) {
        if (o00oOo0o()) {
            o00oo00O(context);
        }
    }

    public final boolean o00oOo0o() {
        return this.f7381o00oo0Oo != null;
    }

    public final boolean o00oOoO(@o0OO00OO Bundle bundle) {
        if (this.f7381o00oo0Oo == null) {
            return false;
        }
        synchronized (this.f7380o00oo0O0) {
            try {
                try {
                    this.f7381o00oo0Oo.onMessageChannelReady(this.f7379o00oo0O, bundle);
                } catch (RemoteException unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public final boolean o00oOoO0(@o0OO00OO Bundle bundle) {
        this.f7382o00oo0o = true;
        return o00oOoO(bundle);
    }

    public void o00oOoOO() {
        if (this.f7382o00oo0o) {
            o00oOoO(null);
        }
    }

    public void o00oOoOo() {
    }

    public final boolean o00oOoo0(@oo0oO0 String str, @o0OO00OO Bundle bundle) {
        if (this.f7381o00oo0Oo == null) {
            return false;
        }
        synchronized (this.f7380o00oo0O0) {
            try {
                try {
                    this.f7381o00oo0Oo.onPostMessage(this.f7379o00oo0O, str, bundle);
                } catch (RemoteException unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public boolean o00oOooO(@oo0oO0 Context context, @oo0oO0 String str) {
        Intent intent = new Intent();
        intent.setClassName(str, PostMessageService.class.getName());
        return context.bindService(intent, this, 1);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public void o00oOooo(@oo0oO0 String str) {
        this.f7383o00oo0o0 = str;
    }

    public void o00oo00O(@oo0oO0 Context context) {
        if (o00oOo0o()) {
            context.unbindService(this);
            this.f7381o00oo0Oo = null;
        }
    }

    @Override // o00oo0O.o00oo0O0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public final boolean onPostMessage(@oo0oO0 String str, @o0OO00OO Bundle bundle) {
        return o00oOoo0(str, bundle);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@oo0oO0 ComponentName componentName, @oo0oO0 IBinder iBinder) {
        this.f7381o00oo0Oo = IPostMessageService.Stub.asInterface(iBinder);
        o00oOoOO();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@oo0oO0 ComponentName componentName) {
        this.f7381o00oo0Oo = null;
        o00oOoOo();
    }
}
