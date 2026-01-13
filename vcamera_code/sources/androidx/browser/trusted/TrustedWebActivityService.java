package androidx.browser.trusted;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import androidx.browser.trusted.o00oOOo0;
import java.util.Locale;
import o00oOooO.o0O;
import o00oOooO.o0O000o0;
import o00oOooO.o0O00O0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00oo0Oo.o00oo;
import o00oo0Oo.o00oo00O;
import o00oo0Oo.o00oo0O0;
import o00oo0Oo.o00ooO;
import o00ooOoo.oO0O0OO;
/* loaded from: classes.dex */
public abstract class TrustedWebActivityService extends Service {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f1632o00oo = -1;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final String f1633o00oo0o = "android.support.customtabs.trusted.SMALL_ICON";
    @SuppressLint({"ActionValue", "ServiceName"})

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final String f1634o00oo0o0 = "android.support.customtabs.trusted.TRUSTED_WEB_ACTIVITY_SERVICE";

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final String f1635o00oo0oO = "android.support.customtabs.trusted.SMALL_ICON_BITMAP";

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final String f1636o0O0o = "androidx.browser.trusted.SUCCESS";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public NotificationManager f1638o00oo0O0;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f1637o00oo0O = -1;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final ITrustedWebActivityService.Stub f1639o00oo0Oo = new o00oOOo0();

    /* loaded from: classes.dex */
    public class o00oOOo0 extends ITrustedWebActivityService.Stub {
        public o00oOOo0() {
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle areNotificationsEnabled(Bundle bundle) {
            o00oOooo();
            return new o00oOOo0.o00oo00O(TrustedWebActivityService.this.o00oOooO(o00oOOo0.o00oOo0O.o00oOOo0(bundle).f1653o00oOOo0)).o00oOOoO();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public void cancelNotification(Bundle bundle) {
            o00oOooo();
            o00oOOo0.o00oOo00 o00oOOo02 = o00oOOo0.o00oOo00.o00oOOo0(bundle);
            TrustedWebActivityService.this.o00oOo0O(o00oOOo02.f1651o00oOOo0, o00oOOo02.f1652o00oOOoO);
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) {
            o00oOooo();
            return TrustedWebActivityService.this.o00oOo0o(str, bundle, o00ooO.o00oOOo0(iBinder));
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle getActiveNotifications() {
            o00oOooo();
            return new o00oOOo0.o00oOOoO(TrustedWebActivityService.this.o00oOoO0()).o00oOOoO();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle getSmallIconBitmap() {
            o00oOooo();
            return TrustedWebActivityService.this.o00oOoO();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public int getSmallIconId() {
            o00oOooo();
            return TrustedWebActivityService.this.o00oOoOO();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle notifyNotificationWithChannel(Bundle bundle) {
            o00oOooo();
            o00oOOo0.o00oOoO o00oOOo02 = o00oOOo0.o00oOoO.o00oOOo0(bundle);
            return new o00oOOo0.o00oo00O(TrustedWebActivityService.this.o00oOoOo(o00oOOo02.f1654o00oOOo0, o00oOOo02.f1655o00oOOoO, o00oOOo02.f1656o00oOo00, o00oOOo02.f1657o00oOooO)).o00oOOoO();
        }

        public final void o00oOooo() {
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            if (trustedWebActivityService.f1637o00oo0O == -1) {
                String[] packagesForUid = trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                int i = 0;
                if (packagesForUid == null) {
                    packagesForUid = new String[0];
                }
                o00oo0O0 load = TrustedWebActivityService.this.o00oOo00().load();
                PackageManager packageManager = TrustedWebActivityService.this.getPackageManager();
                if (load != null) {
                    int length = packagesForUid.length;
                    while (true) {
                        if (i >= length) {
                            break;
                        } else if (load.o00oOo00(packagesForUid[i], packageManager)) {
                            TrustedWebActivityService.this.f1637o00oo0O = Binder.getCallingUid();
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            if (TrustedWebActivityService.this.f1637o00oo0O != Binder.getCallingUid()) {
                throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
        }
    }

    public static String o00oOOo0(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    public final void o00oOOoO() {
        if (this.f1638o00oo0O0 == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    @o0O000o0
    @oo0oO0
    public abstract o00oo o00oOo00();

    @o0O000o0
    public void o00oOo0O(@oo0oO0 String str, int i) {
        o00oOOoO();
        this.f1638o00oo0O0.cancel(str, i);
    }

    @o0O000o0
    @o0OO00OO
    public Bundle o00oOo0o(@oo0oO0 String str, @oo0oO0 Bundle bundle, @o0OO00OO o00ooO o00ooo) {
        return null;
    }

    @o0O000o0
    @oo0oO0
    public Bundle o00oOoO() {
        int o00oOoOO2 = o00oOoOO();
        Bundle bundle = new Bundle();
        if (o00oOoOO2 == -1) {
            return bundle;
        }
        bundle.putParcelable(f1635o00oo0oO, BitmapFactory.decodeResource(getResources(), o00oOoOO2));
        return bundle;
    }

    @o0O000o0
    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public Parcelable[] o00oOoO0() {
        o00oOOoO();
        return this.f1638o00oo0O0.getActiveNotifications();
    }

    @o0O000o0
    public int o00oOoOO() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt(f1633o00oo0o, -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    @o0O000o0
    public boolean o00oOoOo(@oo0oO0 String str, int i, @oo0oO0 Notification notification, @oo0oO0 String str2) {
        o00oOOoO();
        if (oO0O0OO.o00oo0O0(this).o00oOOo0()) {
            String o00oOOo02 = o00oOOo0(str2);
            Notification o00oOOo03 = o00oo00O.o00oOOo0(this, this.f1638o00oo0O0, notification, o00oOOo02, str2);
            if (o00oo00O.o00oOOoO(this.f1638o00oo0O0, o00oOOo02)) {
                this.f1638o00oo0O0.notify(str, i, o00oOOo03);
                return true;
            }
            return false;
        }
        return false;
    }

    @o0O000o0
    public boolean o00oOooO(@oo0oO0 String str) {
        o00oOOoO();
        if (oO0O0OO.o00oo0O0(this).o00oOOo0()) {
            return o00oo00O.o00oOOoO(this.f1638o00oo0O0, o00oOOo0(str));
        }
        return false;
    }

    @Override // android.app.Service
    @o0O
    @o0OO00OO
    public final IBinder onBind(@o0OO00OO Intent intent) {
        return this.f1639o00oo0Oo;
    }

    @Override // android.app.Service
    @o0O00O0
    @o0O
    public void onCreate() {
        super.onCreate();
        this.f1638o00oo0O0 = (NotificationManager) getSystemService("notification");
    }

    @Override // android.app.Service
    @o0O
    public final boolean onUnbind(@o0OO00OO Intent intent) {
        this.f1637o00oo0O = -1;
        return super.onUnbind(intent);
    }
}
