package androidx.browser.trusted;

import android.app.Notification;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import o00oOoOo.o00oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o00oo0Oo.o00ooO0;
/* loaded from: classes.dex */
public final class o00oOOo0 {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f1641o00oOo00 = "android.support.customtabs.trusted.PLATFORM_TAG";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f1642o00oOo0O = "android.support.customtabs.trusted.NOTIFICATION";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f1643o00oOo0o = "android.support.customtabs.trusted.CHANNEL_NAME";

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f1644o00oOoO = "android.support.customtabs.trusted.NOTIFICATION_SUCCESS";

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f1645o00oOoO0 = "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f1646o00oOooO = "android.support.customtabs.trusted.PLATFORM_ID";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final ITrustedWebActivityService f1647o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final ComponentName f1648o00oOOoO;

    /* renamed from: androidx.browser.trusted.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class BinderC0009o00oOOo0 extends ITrustedWebActivityCallback.Stub {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o00ooO0 f1649o00oo0O0;

        public BinderC0009o00oOOo0(o00ooO0 o00ooo02) {
            this.f1649o00oo0O0 = o00ooo02;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityCallback
        public void onExtraCallback(String str, Bundle bundle) throws RemoteException {
            this.f1649o00oo0O0.o00oOOo0(str, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Parcelable[] f1650o00oOOo0;

        public o00oOOoO(Parcelable[] parcelableArr) {
            this.f1650o00oOOo0 = parcelableArr;
        }

        public static o00oOOoO o00oOOo0(Bundle bundle) {
            o00oOOo0.o00oOo00(bundle, o00oOOo0.f1645o00oOoO0);
            return new o00oOOoO(bundle.getParcelableArray(o00oOOo0.f1645o00oOoO0));
        }

        public Bundle o00oOOoO() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(o00oOOo0.f1645o00oOoO0, this.f1650o00oOOo0);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f1651o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final int f1652o00oOOoO;

        public o00oOo00(String str, int i) {
            this.f1651o00oOOo0 = str;
            this.f1652o00oOOoO = i;
        }

        public static o00oOo00 o00oOOo0(Bundle bundle) {
            o00oOOo0.o00oOo00(bundle, o00oOOo0.f1641o00oOo00);
            o00oOOo0.o00oOo00(bundle, o00oOOo0.f1646o00oOooO);
            return new o00oOo00(bundle.getString(o00oOOo0.f1641o00oOo00), bundle.getInt(o00oOOo0.f1646o00oOooO));
        }

        public Bundle o00oOOoO() {
            Bundle bundle = new Bundle();
            bundle.putString(o00oOOo0.f1641o00oOo00, this.f1651o00oOOo0);
            bundle.putInt(o00oOOo0.f1646o00oOooO, this.f1652o00oOOoO);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f1653o00oOOo0;

        public o00oOo0O(String str) {
            this.f1653o00oOOo0 = str;
        }

        public static o00oOo0O o00oOOo0(Bundle bundle) {
            o00oOOo0.o00oOo00(bundle, o00oOOo0.f1643o00oOo0o);
            return new o00oOo0O(bundle.getString(o00oOOo0.f1643o00oOo0o));
        }

        public Bundle o00oOOoO() {
            Bundle bundle = new Bundle();
            bundle.putString(o00oOOo0.f1643o00oOo0o, this.f1653o00oOOo0);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f1654o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final int f1655o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Notification f1656o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final String f1657o00oOooO;

        public o00oOoO(String str, int i, Notification notification, String str2) {
            this.f1654o00oOOo0 = str;
            this.f1655o00oOOoO = i;
            this.f1656o00oOo00 = notification;
            this.f1657o00oOooO = str2;
        }

        public static o00oOoO o00oOOo0(Bundle bundle) {
            o00oOOo0.o00oOo00(bundle, o00oOOo0.f1641o00oOo00);
            o00oOOo0.o00oOo00(bundle, o00oOOo0.f1646o00oOooO);
            o00oOOo0.o00oOo00(bundle, o00oOOo0.f1642o00oOo0O);
            o00oOOo0.o00oOo00(bundle, o00oOOo0.f1643o00oOo0o);
            return new o00oOoO(bundle.getString(o00oOOo0.f1641o00oOo00), bundle.getInt(o00oOOo0.f1646o00oOooO), (Notification) bundle.getParcelable(o00oOOo0.f1642o00oOo0O), bundle.getString(o00oOOo0.f1643o00oOo0o));
        }

        public Bundle o00oOOoO() {
            Bundle bundle = new Bundle();
            bundle.putString(o00oOOo0.f1641o00oOo00, this.f1654o00oOOo0);
            bundle.putInt(o00oOOo0.f1646o00oOooO, this.f1655o00oOOoO);
            bundle.putParcelable(o00oOOo0.f1642o00oOo0O, this.f1656o00oOo00);
            bundle.putString(o00oOOo0.f1643o00oOo0o, this.f1657o00oOooO);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo00O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final boolean f1658o00oOOo0;

        public o00oo00O(boolean z) {
            this.f1658o00oOOo0 = z;
        }

        public static o00oo00O o00oOOo0(Bundle bundle) {
            o00oOOo0.o00oOo00(bundle, o00oOOo0.f1644o00oOoO);
            return new o00oo00O(bundle.getBoolean(o00oOOo0.f1644o00oOoO));
        }

        public Bundle o00oOOoO() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(o00oOOo0.f1644o00oOoO, this.f1658o00oOOo0);
            return bundle;
        }
    }

    public o00oOOo0(@oo0oO0 ITrustedWebActivityService iTrustedWebActivityService, @oo0oO0 ComponentName componentName) {
        this.f1647o00oOOo0 = iTrustedWebActivityService;
        this.f1648o00oOOoO = componentName;
    }

    public static void o00oOo00(Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            throw new IllegalArgumentException(o00oo.o00oOOo0("Bundle must contain ", str));
        }
    }

    @o0OO00OO
    public static ITrustedWebActivityCallback o00oOoOo(@o0OO00OO o00ooO0 o00ooo02) {
        if (o00ooo02 == null) {
            return null;
        }
        return new BinderC0009o00oOOo0(o00ooo02);
    }

    public boolean o00oOOo0(@oo0oO0 String str) throws RemoteException {
        return o00oo00O.o00oOOo0(this.f1647o00oOOo0.areNotificationsEnabled(new o00oOo0O(str).o00oOOoO())).f1658o00oOOo0;
    }

    public void o00oOOoO(@oo0oO0 String str, int i) throws RemoteException {
        this.f1647o00oOOo0.cancelNotification(new o00oOo00(str, i).o00oOOoO());
    }

    @oo0oO0
    public ComponentName o00oOo0O() {
        return this.f1648o00oOOoO;
    }

    @o0OO00OO
    public Bitmap o00oOo0o() throws RemoteException {
        return (Bitmap) this.f1647o00oOOo0.getSmallIconBitmap().getParcelable(TrustedWebActivityService.f1635o00oo0oO);
    }

    public boolean o00oOoO(@oo0oO0 String str, int i, @oo0oO0 Notification notification, @oo0oO0 String str2) throws RemoteException {
        return o00oo00O.o00oOOo0(this.f1647o00oOOo0.notifyNotificationWithChannel(new o00oOoO(str, i, notification, str2).o00oOOoO())).f1658o00oOOo0;
    }

    public int o00oOoO0() throws RemoteException {
        return this.f1647o00oOOo0.getSmallIconId();
    }

    @o0OO00OO
    public Bundle o00oOoOO(@oo0oO0 String str, @oo0oO0 Bundle bundle, @o0OO00OO o00ooO0 o00ooo02) throws RemoteException {
        ITrustedWebActivityCallback o00oOoOo2 = o00oOoOo(o00ooo02);
        return this.f1647o00oOOo0.extraCommand(str, bundle, o00oOoOo2 == null ? null : o00oOoOo2.asBinder());
    }

    @o0OOooO0(23)
    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public Parcelable[] o00oOooO() throws RemoteException {
        return o00oOOoO.o00oOOo0(this.f1647o00oOOo0.getActiveNotifications()).f1650o00oOOo0;
    }
}
