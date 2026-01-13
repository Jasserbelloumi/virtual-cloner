package o00oo0O;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.widget.RemoteViews;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o00oo0O.o00oo0OO;
/* loaded from: classes.dex */
public final class o00oo0 {

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f7369o00oOo0o = "CustomTabsSession";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Object f7370o00oOOo0 = new Object();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final ICustomTabsService f7371o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final ICustomTabsCallback f7372o00oOo00;
    @o0OO00OO

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final PendingIntent f7373o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final ComponentName f7374o00oOooO;

    /* loaded from: classes.dex */
    public static class o00oOOo0 extends ICustomTabsService.Stub {
        @Override // android.support.customtabs.ICustomTabsService
        public Bundle extraCommand(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSession(ICustomTabsCallback iCustomTabsCallback) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean warmup(long j) throws RemoteException {
            return false;
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0OO00OO

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oo0O.o00oOOoO f7375o00oOOo0;
        @o0OO00OO

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final PendingIntent f7376o00oOOoO;

        public o00oOOoO(@o0OO00OO o00oo0O.o00oOOoO o00ooooo2, @o0OO00OO PendingIntent pendingIntent) {
            this.f7375o00oOOo0 = o00ooooo2;
            this.f7376o00oOOoO = pendingIntent;
        }

        @o0OO00OO
        public o00oo0O.o00oOOoO o00oOOo0() {
            return this.f7375o00oOOo0;
        }

        @o0OO00OO
        public PendingIntent o00oOOoO() {
            return this.f7376o00oOOoO;
        }
    }

    public o00oo0(ICustomTabsService iCustomTabsService, ICustomTabsCallback iCustomTabsCallback, ComponentName componentName, @o0OO00OO PendingIntent pendingIntent) {
        this.f7371o00oOOoO = iCustomTabsService;
        this.f7372o00oOo00 = iCustomTabsCallback;
        this.f7374o00oOooO = componentName;
        this.f7373o00oOo0O = pendingIntent;
    }

    @oo0oO0
    @o0o0000
    public static o00oo0 o00oOo00(@oo0oO0 ComponentName componentName) {
        return new o00oo0(new o00oOOo0(), new o00oo0OO.o00oOOoO(), componentName, null);
    }

    public final void o00oOOo0(Bundle bundle) {
        PendingIntent pendingIntent = this.f7373o00oOo0O;
        if (pendingIntent != null) {
            bundle.putParcelable(o00oOo0O.f7316o00oOo0O, pendingIntent);
        }
    }

    public final Bundle o00oOOoO(@o0OO00OO Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        o00oOOo0(bundle2);
        return bundle2;
    }

    public ComponentName o00oOo0O() {
        return this.f7374o00oOooO;
    }

    @o0OO00OO
    public PendingIntent o00oOo0o() {
        return this.f7373o00oOo0O;
    }

    public int o00oOoO(@oo0oO0 String str, @o0OO00OO Bundle bundle) {
        int postMessage;
        Bundle o00oOOoO2 = o00oOOoO(bundle);
        synchronized (this.f7370o00oOOo0) {
            try {
                try {
                    postMessage = this.f7371o00oOOoO.postMessage(this.f7372o00oOo00, str, o00oOOoO2);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return postMessage;
    }

    public boolean o00oOoO0(@o0OO00OO Uri uri, @o0OO00OO Bundle bundle, @o0OO00OO List<Bundle> list) {
        try {
            return this.f7371o00oOOoO.mayLaunchUrl(this.f7372o00oOo00, uri, o00oOOoO(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean o00oOoOO(@oo0oO0 Uri uri, int i, @o0OO00OO Bundle bundle) {
        try {
            return this.f7371o00oOOoO.receiveFile(this.f7372o00oOo00, uri, i, o00oOOoO(bundle));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean o00oOoOo(@oo0oO0 Uri uri) {
        try {
            return this.f7373o00oOo0O != null ? this.f7371o00oOOoO.requestPostMessageChannelWithExtras(this.f7372o00oOo00, uri, o00oOOoO(null)) : this.f7371o00oOOoO.requestPostMessageChannel(this.f7372o00oOo00, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean o00oOoo0(@oo0oO0 Bitmap bitmap, @oo0oO0 String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(o00oOo0O.f7332o00oo0o, bitmap);
        bundle.putString(o00oOo0O.f7334o00oo0oO, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(o00oOo0O.f7328o00oo0O, bundle);
        o00oOOo0(bundle);
        try {
            return this.f7371o00oOOoO.updateVisuals(this.f7372o00oOo00, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public IBinder o00oOooO() {
        return this.f7372o00oOo00.asBinder();
    }

    public boolean o00oOooo(@o0OO00OO RemoteViews remoteViews, @o0OO00OO int[] iArr, @o0OO00OO PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(o00oOo0O.f7343o00ooOo, remoteViews);
        bundle.putIntArray(o00oOo0O.f7345o00ooOoO, iArr);
        bundle.putParcelable(o00oOo0O.f7346o00ooOoo, pendingIntent);
        o00oOOo0(bundle);
        try {
            return this.f7371o00oOOoO.updateVisuals(this.f7372o00oOo00, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean o00oo0(int i, @oo0oO0 Uri uri, @o0OO00OO Bundle bundle) {
        if (i >= 1 && i <= 2) {
            try {
                return this.f7371o00oOOoO.validateRelationship(this.f7372o00oOo00, i, uri, o00oOOoO(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    @Deprecated
    public boolean o00oo00O(int i, @oo0oO0 Bitmap bitmap, @oo0oO0 String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(o00oOo0O.f7352o00oooOO, i);
        bundle.putParcelable(o00oOo0O.f7332o00oo0o, bitmap);
        bundle.putString(o00oOo0O.f7334o00oo0oO, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(o00oOo0O.f7328o00oo0O, bundle);
        o00oOOo0(bundle2);
        try {
            return this.f7371o00oOOoO.updateVisuals(this.f7372o00oOo00, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
