package o00oo0O;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsService;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00oo0O.o00oo0;
/* loaded from: classes.dex */
public class o00oOo00 {

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f7291o00oOooO = "CustomTabsClient";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final ICustomTabsService f7292o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final ComponentName f7293o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Context f7294o00oOo00;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o00oo00O {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Context f7295o00oo0O0;

        public o00oOOo0(Context context) {
            this.f7295o00oo0O0 = context;
        }

        @Override // o00oo0O.o00oo00O
        public final void onCustomTabsServiceConnected(@oo0oO0 ComponentName componentName, @oo0oO0 o00oOo00 o00ooo002) {
            o00ooo002.o00oo0(0L);
            this.f7295o00oo0O0.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends ICustomTabsCallback.Stub {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o00oo0O.o00oOOoO f7296o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public Handler f7297o00oo0O0 = new Handler(Looper.getMainLooper());

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Runnable {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ Bundle f7299o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ int f7300o00oo0O0;

            public o00oOOo0(int i, Bundle bundle) {
                this.f7300o00oo0O0 = i;
                this.f7299o00oo0O = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oOOoO.this.f7296o00oo0O.o00oOooO(this.f7300o00oo0O0, this.f7299o00oo0O);
            }
        }

        /* renamed from: o00oo0O.o00oOo00$o00oOOoO$o00oOOoO  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0106o00oOOoO implements Runnable {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ Bundle f7302o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ String f7303o00oo0O0;

            public RunnableC0106o00oOOoO(String str, Bundle bundle) {
                this.f7303o00oo0O0 = str;
                this.f7302o00oo0O = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oOOoO.this.f7296o00oo0O.o00oOOo0(this.f7303o00oo0O0, this.f7302o00oo0O);
            }
        }

        /* renamed from: o00oo0O.o00oOo00$o00oOOoO$o00oOo00  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0107o00oOo00 implements Runnable {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ Bundle f7306o00oo0O0;

            public RunnableC0107o00oOo00(Bundle bundle) {
                this.f7306o00oo0O0 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oOOoO.this.f7296o00oo0O.o00oOo00(this.f7306o00oo0O0);
            }
        }

        /* loaded from: classes.dex */
        public class o00oOo0O implements Runnable {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ Bundle f7307o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ String f7308o00oo0O0;

            public o00oOo0O(String str, Bundle bundle) {
                this.f7308o00oo0O0 = str;
                this.f7307o00oo0O = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oOOoO.this.f7296o00oo0O.o00oOo0O(this.f7308o00oo0O0, this.f7307o00oo0O);
            }
        }

        /* loaded from: classes.dex */
        public class o00oOoO implements Runnable {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ Uri f7310o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ int f7311o00oo0O0;

            /* renamed from: o00oo0Oo  reason: collision with root package name */
            public final /* synthetic */ boolean f7312o00oo0Oo;

            /* renamed from: o00oo0o0  reason: collision with root package name */
            public final /* synthetic */ Bundle f7314o00oo0o0;

            public o00oOoO(int i, Uri uri, boolean z, Bundle bundle) {
                this.f7311o00oo0O0 = i;
                this.f7310o00oo0O = uri;
                this.f7312o00oo0Oo = z;
                this.f7314o00oo0o0 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oOOoO.this.f7296o00oo0O.o00oOo0o(this.f7311o00oo0O0, this.f7310o00oo0O, this.f7312o00oo0Oo, this.f7314o00oo0o0);
            }
        }

        public o00oOOoO(o00oo0O.o00oOOoO o00ooooo2) {
            this.f7296o00oo0O = o00ooooo2;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void extraCallback(String str, Bundle bundle) throws RemoteException {
            if (this.f7296o00oo0O == null) {
                return;
            }
            this.f7297o00oo0O0.post(new RunnableC0106o00oOOoO(str, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public Bundle extraCallbackWithResult(@oo0oO0 String str, @o0OO00OO Bundle bundle) throws RemoteException {
            o00oo0O.o00oOOoO o00ooooo2 = this.f7296o00oo0O;
            if (o00ooooo2 == null) {
                return null;
            }
            return o00ooooo2.o00oOOoO(str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMessageChannelReady(Bundle bundle) throws RemoteException {
            if (this.f7296o00oo0O == null) {
                return;
            }
            this.f7297o00oo0O0.post(new RunnableC0107o00oOo00(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onNavigationEvent(int i, Bundle bundle) {
            if (this.f7296o00oo0O == null) {
                return;
            }
            this.f7297o00oo0O0.post(new o00oOOo0(i, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onPostMessage(String str, Bundle bundle) throws RemoteException {
            if (this.f7296o00oo0O == null) {
                return;
            }
            this.f7297o00oo0O0.post(new o00oOo0O(str, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onRelationshipValidationResult(int i, Uri uri, boolean z, @o0OO00OO Bundle bundle) throws RemoteException {
            if (this.f7296o00oo0O == null) {
                return;
            }
            this.f7297o00oo0O0.post(new o00oOoO(i, uri, z, bundle));
        }
    }

    public o00oOo00(ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
        this.f7292o00oOOo0 = iCustomTabsService;
        this.f7293o00oOOoO = componentName;
        this.f7294o00oOo00 = context;
    }

    public static boolean o00oOOoO(@oo0oO0 Context context, @o0OO00OO String str, @oo0oO0 o00oo00O o00oo00o) {
        o00oo00o.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent(CustomTabsService.f1613o00oo0Oo);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, o00oo00o, 33);
    }

    public static boolean o00oOo00(@oo0oO0 Context context, @o0OO00OO String str, @oo0oO0 o00oo00O o00oo00o) {
        o00oo00o.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent(CustomTabsService.f1613o00oo0Oo);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, o00oo00o, 1);
    }

    public static PendingIntent o00oOo0o(Context context, int i) {
        return PendingIntent.getActivity(context, i, new Intent(), 67108864);
    }

    @o0OO00OO
    public static String o00oOoO(@oo0oO0 Context context, @o0OO00OO List<String> list) {
        return o00oOoOO(context, list, false);
    }

    @o0OO00OO
    public static String o00oOoOO(@oo0oO0 Context context, @o0OO00OO List<String> list, boolean z) {
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent(CustomTabsService.f1613o00oo0Oo);
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        return null;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static o00oo0.o00oOOoO o00oOoOo(@oo0oO0 Context context, @o0OO00OO o00oo0O.o00oOOoO o00ooooo2, int i) {
        return new o00oo0.o00oOOoO(o00ooooo2, o00oOo0o(context, i));
    }

    public static boolean o00oOooO(@oo0oO0 Context context, @oo0oO0 String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return o00oOOoO(applicationContext, str, new o00oOOo0(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public o00oo0 o00oOOo0(@oo0oO0 o00oo0.o00oOOoO o00ooooo2) {
        return o00oo00O(o00ooooo2.o00oOOo0(), o00ooooo2.o00oOOoO());
    }

    public final ICustomTabsCallback.Stub o00oOo0O(@o0OO00OO o00oo0O.o00oOOoO o00ooooo2) {
        return new o00oOOoO(o00ooooo2);
    }

    @o0OO00OO
    public Bundle o00oOoO0(@oo0oO0 String str, @o0OO00OO Bundle bundle) {
        try {
            return this.f7292o00oOOo0.extraCommand(str, bundle);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @o0OO00OO
    public o00oo0 o00oOoo0(@o0OO00OO o00oo0O.o00oOOoO o00ooooo2) {
        return o00oo00O(o00ooooo2, null);
    }

    @o0OO00OO
    public o00oo0 o00oOooo(@o0OO00OO o00oo0O.o00oOOoO o00ooooo2, int i) {
        return o00oo00O(o00ooooo2, o00oOo0o(this.f7294o00oOo00, i));
    }

    public boolean o00oo0(long j) {
        try {
            return this.f7292o00oOOo0.warmup(j);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @o0OO00OO
    public final o00oo0 o00oo00O(@o0OO00OO o00oo0O.o00oOOoO o00ooooo2, @o0OO00OO PendingIntent pendingIntent) {
        boolean newSession;
        ICustomTabsCallback.Stub o00oOo0O2 = o00oOo0O(o00ooooo2);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(o00oOo0O.f7316o00oOo0O, pendingIntent);
                newSession = this.f7292o00oOOo0.newSessionWithExtras(o00oOo0O2, bundle);
            } else {
                newSession = this.f7292o00oOOo0.newSession(o00oOo0O2);
            }
            if (newSession) {
                return new o00oo0(this.f7292o00oOOo0, o00oOo0O2, this.f7293o00oOOoO, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }
}
