package o00oo0O;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00ooOoo.oO00O0o0;
/* loaded from: classes.dex */
public class o00oo0OO {

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f7384o00oOooO = "CustomTabsSessionToken";
    @o0OO00OO

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final ICustomTabsCallback f7385o00oOOo0;
    @o0OO00OO

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final PendingIntent f7386o00oOOoO;
    @o0OO00OO

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o00oo0O.o00oOOoO f7387o00oOo00;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o00oo0O.o00oOOoO {
        public o00oOOo0() {
        }

        @Override // o00oo0O.o00oOOoO
        public void o00oOOo0(@oo0oO0 String str, @o0OO00OO Bundle bundle) {
            try {
                o00oo0OO.this.f7385o00oOOo0.extraCallback(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // o00oo0O.o00oOOoO
        @oo0oO0
        public Bundle o00oOOoO(@oo0oO0 String str, @o0OO00OO Bundle bundle) {
            try {
                return o00oo0OO.this.f7385o00oOOo0.extraCallbackWithResult(str, bundle);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // o00oo0O.o00oOOoO
        public void o00oOo00(@o0OO00OO Bundle bundle) {
            try {
                o00oo0OO.this.f7385o00oOOo0.onMessageChannelReady(bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // o00oo0O.o00oOOoO
        public void o00oOo0O(@oo0oO0 String str, @o0OO00OO Bundle bundle) {
            try {
                o00oo0OO.this.f7385o00oOOo0.onPostMessage(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // o00oo0O.o00oOOoO
        public void o00oOo0o(int i, @oo0oO0 Uri uri, boolean z, @o0OO00OO Bundle bundle) {
            try {
                o00oo0OO.this.f7385o00oOOo0.onRelationshipValidationResult(i, uri, z, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // o00oo0O.o00oOOoO
        public void o00oOooO(int i, @o0OO00OO Bundle bundle) {
            try {
                o00oo0OO.this.f7385o00oOOo0.onNavigationEvent(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO extends ICustomTabsCallback.Stub {
        @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void extraCallback(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public Bundle extraCallbackWithResult(String str, Bundle bundle) {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMessageChannelReady(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onNavigationEvent(int i, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onPostMessage(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
        }
    }

    public o00oo0OO(@o0OO00OO ICustomTabsCallback iCustomTabsCallback, @o0OO00OO PendingIntent pendingIntent) {
        if (iCustomTabsCallback == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f7385o00oOOo0 = iCustomTabsCallback;
        this.f7386o00oOOoO = pendingIntent;
        this.f7387o00oOo00 = iCustomTabsCallback == null ? null : new o00oOOo0();
    }

    @oo0oO0
    public static o00oo0OO o00oOOo0() {
        return new o00oo0OO(new o00oOOoO(), null);
    }

    @o0OO00OO
    public static o00oo0OO o00oOo0o(@oo0oO0 Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        IBinder o00oOOo02 = oO00O0o0.o00oOOo0.o00oOOo0(extras, o00oOo0O.f7323o00oOooO);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(o00oOo0O.f7316o00oOo0O);
        if (o00oOOo02 == null && pendingIntent == null) {
            return null;
        }
        return new o00oo0OO(o00oOOo02 != null ? ICustomTabsCallback.Stub.asInterface(o00oOOo02) : null, pendingIntent);
    }

    public boolean equals(Object obj) {
        if (obj instanceof o00oo0OO) {
            o00oo0OO o00oo0oo = (o00oo0OO) obj;
            PendingIntent o00oOo0O2 = o00oo0oo.o00oOo0O();
            PendingIntent pendingIntent = this.f7386o00oOOoO;
            if ((pendingIntent == null) != (o00oOo0O2 == null)) {
                return false;
            }
            return pendingIntent != null ? pendingIntent.equals(o00oOo0O2) : o00oOooO().equals(o00oo0oo.o00oOooO());
        }
        return false;
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.f7386o00oOOoO;
        return pendingIntent != null ? pendingIntent.hashCode() : o00oOooO().hashCode();
    }

    @o0OO00OO
    public o00oo0O.o00oOOoO o00oOOoO() {
        return this.f7387o00oOo00;
    }

    @o0OO00OO
    public IBinder o00oOo00() {
        ICustomTabsCallback iCustomTabsCallback = this.f7385o00oOOo0;
        if (iCustomTabsCallback == null) {
            return null;
        }
        return iCustomTabsCallback.asBinder();
    }

    @o0OO00OO
    public PendingIntent o00oOo0O() {
        return this.f7386o00oOOoO;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public boolean o00oOoO() {
        return this.f7386o00oOOoO != null;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public boolean o00oOoO0() {
        return this.f7385o00oOOo0 != null;
    }

    public boolean o00oOoOO(@oo0oO0 o00oo0 o00oo0Var) {
        return o00oo0Var.o00oOooO().equals(this.f7385o00oOOo0);
    }

    public final IBinder o00oOooO() {
        ICustomTabsCallback iCustomTabsCallback = this.f7385o00oOOo0;
        if (iCustomTabsCallback != null) {
            return iCustomTabsCallback.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }
}
