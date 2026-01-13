package o00oo0Oo;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import androidx.browser.trusted.TrustedWebActivityService;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import o00oOooO.o0O;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o0O000O {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f7518o00oOo00 = "TWAConnectionPool";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Context f7519o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Map<Uri, o00oOo00> f7520o00oOOoO = new HashMap();

    /* loaded from: classes.dex */
    public static class o00oOOo0 extends AsyncTask<Void, Void, Exception> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Context f7521o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Intent f7522o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final o00oOo00 f7523o00oOo00;

        public o00oOOo0(Context context, Intent intent, o00oOo00 o00ooo002) {
            this.f7521o00oOOo0 = context.getApplicationContext();
            this.f7522o00oOOoO = intent;
            this.f7523o00oOo00 = o00ooo002;
        }

        @Override // android.os.AsyncTask
        @o0OO00OO
        /* renamed from: o00oOOo0 */
        public Exception doInBackground(Void... voidArr) {
            try {
                if (this.f7521o00oOOo0.bindService(this.f7522o00oOOoO, this.f7523o00oOo00, 4097)) {
                    return null;
                }
                this.f7521o00oOOo0.unbindService(this.f7523o00oOo00);
                return new IllegalStateException("Could not bind to the service");
            } catch (SecurityException e) {
                return e;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: o00oOOoO */
        public void onPostExecute(Exception exc) {
            if (exc != null) {
                this.f7523o00oOo00.o00oOOoO(exc);
            }
        }
    }

    public o0O000O(@oo0oO0 Context context) {
        this.f7519o00oOOo0 = context.getApplicationContext();
    }

    @oo0oO0
    public static o0O000O o00oOo00(@oo0oO0 Context context) {
        return new o0O000O(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o00oOo0O(Uri uri) {
        this.f7520o00oOOoO.remove(uri);
    }

    @o0O
    @oo0oO0
    public ListenableFuture<androidx.browser.trusted.o00oOOo0> o00oOOoO(@oo0oO0 final Uri uri, @oo0oO0 Set<o00oo0O0> set, @oo0oO0 Executor executor) {
        o00oOo00 o00ooo002 = this.f7520o00oOOoO.get(uri);
        if (o00ooo002 != null) {
            return o00ooo002.o00oOo00();
        }
        Intent o00oOooO2 = o00oOooO(this.f7519o00oOOo0, uri, set, true);
        if (o00oOooO2 == null) {
            return o00oOo0O.o00oOOo0(new IllegalArgumentException("No service exists for scope"));
        }
        o00oOo00 o00ooo003 = new o00oOo00(new Runnable() { // from class: o00oo0Oo.o0O000
            @Override // java.lang.Runnable
            public final void run() {
                o0O000O.this.o00oOo0O(uri);
            }
        });
        this.f7520o00oOOoO.put(uri, o00ooo003);
        new o00oOOo0(this.f7519o00oOOo0, o00oOooO2, o00ooo003).executeOnExecutor(executor, new Void[0]);
        return o00ooo003.o00oOo00();
    }

    @o0O
    public boolean o00oOo0o(@oo0oO0 Uri uri, @oo0oO0 Set<o00oo0O0> set) {
        return (this.f7520o00oOOoO.get(uri) == null && o00oOooO(this.f7519o00oOOo0, uri, set, false) == null) ? false : true;
    }

    public void o00oOoO0() {
        for (o00oOo00 o00ooo002 : this.f7520o00oOOoO.values()) {
            this.f7519o00oOOo0.unbindService(o00ooo002);
        }
        this.f7520o00oOOoO.clear();
    }

    @o0OO00OO
    public final Intent o00oOooO(Context context, Uri uri, Set<o00oo0O0> set, boolean z) {
        if (set == null || set.size() == 0) {
            return null;
        }
        Intent intent = new Intent();
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        String str = null;
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
            String str2 = resolveInfo.activityInfo.packageName;
            Iterator<o00oo0O0> it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().o00oOo00(str2, context.getPackageManager())) {
                        str = str2;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (str == null) {
            if (z) {
                Objects.toString(uri);
            }
            return null;
        }
        Intent intent2 = new Intent();
        intent2.setPackage(str);
        intent2.setAction(TrustedWebActivityService.f1634o00oo0o0);
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 131072);
        if (resolveService == null) {
            return null;
        }
        if (z) {
            String str3 = resolveService.serviceInfo.name;
            Objects.toString(uri);
        }
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(str, resolveService.serviceInfo.name));
        return intent3;
    }
}
