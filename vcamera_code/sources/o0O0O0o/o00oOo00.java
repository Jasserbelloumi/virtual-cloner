package o0O0O0o;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import androidx.media.MediaBrowserServiceCompat;
import java.util.List;
import java.util.Objects;
import o00oOooO.o0OO0oO;
import o00ooo0.o0;
/* loaded from: classes.dex */
public class o00oOo00 extends BroadcastReceiver {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f11236o00oOOo0 = "MediaButtonReceiver";

    /* loaded from: classes.dex */
    public static class o00oOOo0 extends MediaBrowserCompat.ConnectionCallback {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Context f11237o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Intent f11238o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final BroadcastReceiver.PendingResult f11239o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public MediaBrowserCompat f11240o00oOooO;

        public o00oOOo0(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f11237o00oOOo0 = context;
            this.f11238o00oOOoO = intent;
            this.f11239o00oOo00 = pendingResult;
        }

        public final void o00oOOo0() {
            this.f11240o00oOooO.disconnect();
            this.f11239o00oOo00.finish();
        }

        public void o00oOOoO(MediaBrowserCompat mediaBrowserCompat) {
            this.f11240o00oOooO = mediaBrowserCompat;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnected() {
            new MediaControllerCompat(this.f11237o00oOOo0, this.f11240o00oOooO.getSessionToken()).dispatchMediaButtonEvent((KeyEvent) this.f11238o00oOOoO.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            o00oOOo0();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnectionFailed() {
            o00oOOo0();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnectionSuspended() {
            o00oOOo0();
        }
    }

    public static PendingIntent o00oOOo0(Context context, long j) {
        ComponentName o00oOo002 = o00oOo00(context);
        if (o00oOo002 == null) {
            return null;
        }
        return o00oOOoO(context, o00oOo002, j);
    }

    @SuppressLint({"WrongConstant"})
    public static PendingIntent o00oOOoO(Context context, ComponentName componentName, long j) {
        int keyCode;
        if (componentName == null || (keyCode = PlaybackStateCompat.toKeyCode(j)) == 0) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, keyCode));
        intent.addFlags(268435456);
        return PendingIntent.getBroadcast(context, keyCode, intent, MediaSessionCompat.PENDING_INTENT_FLAG_MUTABLE);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static ComponentName o00oOo00(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        queryBroadcastReceivers.size();
        return null;
    }

    public static KeyEvent o00oOo0O(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        mediaSessionCompat.getController().dispatchMediaButtonEvent(keyEvent);
        return keyEvent;
    }

    public static ComponentName o00oOooO(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Objects.toString(intent);
            return;
        }
        ComponentName o00oOooO2 = o00oOooO(context, "android.intent.action.MEDIA_BUTTON");
        if (o00oOooO2 != null) {
            intent.setComponent(o00oOooO2);
            o0.startForegroundService(context, intent);
            return;
        }
        ComponentName o00oOooO3 = o00oOooO(context, MediaBrowserServiceCompat.f3500o00ooO0O);
        if (o00oOooO3 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        o00oOOo0 o00oooo02 = new o00oOOo0(applicationContext, intent, goAsync);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, o00oOooO3, o00oooo02, null);
        o00oooo02.f11240o00oOooO = mediaBrowserCompat;
        mediaBrowserCompat.connect();
    }
}
