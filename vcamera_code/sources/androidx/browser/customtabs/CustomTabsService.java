package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import androidx.browser.customtabs.CustomTabsService;
import androidx.collection.o00ooO0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.NoSuchElementException;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00oo0O.o00oo0OO;
/* loaded from: classes.dex */
public abstract class CustomTabsService extends Service {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final String f1612o00oo = "androidx.browser.trusted.category.ImmersiveMode";

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final String f1613o00oo0Oo = "android.support.customtabs.action.CustomTabsService";

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final String f1614o00oo0o = "androidx.browser.customtabs.category.ColorSchemeCustomization";

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final String f1615o00oo0o0 = "androidx.browser.customtabs.category.NavBarColorCustomization";

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final String f1616o00oo0oO = "androidx.browser.trusted.category.TrustedWebActivities";

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f1617o00ooO = -2;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final String f1618o00ooO0 = "androidx.browser.customtabs.SUCCESS";

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final String f1619o00ooO00 = "android.support.customtabs.otherurls.URL";

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final int f1620o00ooO0O = 0;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f1621o00ooO0o = -1;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f1622o00ooOO = 1;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f1623o00ooOO0 = -3;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final int f1624o00ooOOo = 2;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final int f1625o00ooOo0 = 1;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final String f1626o0O0o = "androidx.browser.trusted.category.WebShareTargetV2";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00ooO0<IBinder, IBinder.DeathRecipient> f1628o00oo0O0 = new o00ooO0<>();

    /* renamed from: o00oo0O  reason: collision with root package name */
    public ICustomTabsService.Stub f1627o00oo0O = new o00oOOo0();

    /* loaded from: classes.dex */
    public class o00oOOo0 extends ICustomTabsService.Stub {
        public o00oOOo0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o00oo0(o00oo0OO o00oo0oo) {
            CustomTabsService.this.o00oOOo0(o00oo0oo);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public Bundle extraCommand(@oo0oO0 String str, @o0OO00OO Bundle bundle) {
            return CustomTabsService.this.o00oOOoO(str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean mayLaunchUrl(@o0OO00OO ICustomTabsCallback iCustomTabsCallback, @o0OO00OO Uri uri, @o0OO00OO Bundle bundle, @o0OO00OO List<Bundle> list) {
            return CustomTabsService.this.o00oOo00(new o00oo0OO(iCustomTabsCallback, o00oo00O(bundle)), uri, bundle, list);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSession(@oo0oO0 ICustomTabsCallback iCustomTabsCallback) {
            return o00oo0OO(iCustomTabsCallback, null);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSessionWithExtras(@oo0oO0 ICustomTabsCallback iCustomTabsCallback, @o0OO00OO Bundle bundle) {
            return o00oo0OO(iCustomTabsCallback, o00oo00O(bundle));
        }

        @o0OO00OO
        public final PendingIntent o00oo00O(@o0OO00OO Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(o00oo0O.o00oOo0O.f7316o00oOo0O);
            bundle.remove(o00oo0O.o00oOo0O.f7316o00oOo0O);
            return pendingIntent;
        }

        public final boolean o00oo0OO(@oo0oO0 ICustomTabsCallback iCustomTabsCallback, @o0OO00OO PendingIntent pendingIntent) {
            final o00oo0OO o00oo0oo = new o00oo0OO(iCustomTabsCallback, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: o00oo0O.o00oOoO
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        CustomTabsService.o00oOOo0.this.o00oo0(o00oo0oo);
                    }
                };
                synchronized (CustomTabsService.this.f1628o00oo0O0) {
                    iCustomTabsCallback.asBinder().linkToDeath(deathRecipient, 0);
                    CustomTabsService.this.f1628o00oo0O0.put(iCustomTabsCallback.asBinder(), deathRecipient);
                }
                return CustomTabsService.this.o00oOooO(o00oo0oo);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int postMessage(@oo0oO0 ICustomTabsCallback iCustomTabsCallback, @oo0oO0 String str, @o0OO00OO Bundle bundle) {
            return CustomTabsService.this.o00oOo0O(new o00oo0OO(iCustomTabsCallback, o00oo00O(bundle)), str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean receiveFile(@oo0oO0 ICustomTabsCallback iCustomTabsCallback, @oo0oO0 Uri uri, int i, @o0OO00OO Bundle bundle) {
            return CustomTabsService.this.o00oOo0o(new o00oo0OO(iCustomTabsCallback, o00oo00O(bundle)), uri, i, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannel(@oo0oO0 ICustomTabsCallback iCustomTabsCallback, @oo0oO0 Uri uri) {
            return CustomTabsService.this.o00oOoO0(new o00oo0OO(iCustomTabsCallback, null), uri);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannelWithExtras(@oo0oO0 ICustomTabsCallback iCustomTabsCallback, @oo0oO0 Uri uri, @oo0oO0 Bundle bundle) {
            return CustomTabsService.this.o00oOoO0(new o00oo0OO(iCustomTabsCallback, o00oo00O(bundle)), uri);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean updateVisuals(@oo0oO0 ICustomTabsCallback iCustomTabsCallback, @o0OO00OO Bundle bundle) {
            return CustomTabsService.this.o00oOoO(new o00oo0OO(iCustomTabsCallback, o00oo00O(bundle)), bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean validateRelationship(@oo0oO0 ICustomTabsCallback iCustomTabsCallback, int i, @oo0oO0 Uri uri, @o0OO00OO Bundle bundle) {
            return CustomTabsService.this.o00oOoOO(new o00oo0OO(iCustomTabsCallback, o00oo00O(bundle)), i, uri, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean warmup(long j) {
            return CustomTabsService.this.o00oOoOo(j);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public @interface o00oOOoO {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface o00oOo00 {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface o00oOo0O {
    }

    public boolean o00oOOo0(@oo0oO0 o00oo0OO o00oo0oo) {
        try {
            synchronized (this.f1628o00oo0O0) {
                IBinder o00oOo002 = o00oo0oo.o00oOo00();
                if (o00oOo002 == null) {
                    return false;
                }
                o00oOo002.unlinkToDeath(this.f1628o00oo0O0.get(o00oOo002), 0);
                this.f1628o00oo0O0.remove(o00oOo002);
                return true;
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    @o0OO00OO
    public abstract Bundle o00oOOoO(@oo0oO0 String str, @o0OO00OO Bundle bundle);

    public abstract boolean o00oOo00(@oo0oO0 o00oo0OO o00oo0oo, @o0OO00OO Uri uri, @o0OO00OO Bundle bundle, @o0OO00OO List<Bundle> list);

    public abstract int o00oOo0O(@oo0oO0 o00oo0OO o00oo0oo, @oo0oO0 String str, @o0OO00OO Bundle bundle);

    public abstract boolean o00oOo0o(@oo0oO0 o00oo0OO o00oo0oo, @oo0oO0 Uri uri, int i, @o0OO00OO Bundle bundle);

    public abstract boolean o00oOoO(@oo0oO0 o00oo0OO o00oo0oo, @o0OO00OO Bundle bundle);

    public abstract boolean o00oOoO0(@oo0oO0 o00oo0OO o00oo0oo, @oo0oO0 Uri uri);

    public abstract boolean o00oOoOO(@oo0oO0 o00oo0OO o00oo0oo, int i, @oo0oO0 Uri uri, @o0OO00OO Bundle bundle);

    public abstract boolean o00oOoOo(long j);

    public abstract boolean o00oOooO(@oo0oO0 o00oo0OO o00oo0oo);

    @Override // android.app.Service
    @oo0oO0
    public IBinder onBind(@o0OO00OO Intent intent) {
        return this.f1627o00oo0O;
    }
}
