package com.hack.server.core;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.hack.opensdk.R;
/* loaded from: classes2.dex */
public class ForgroundService extends Service {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f6522o00oo0O = "hack_forground_channel";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final String f6523o00oo0O0 = "hack_forground_id";

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f6524o00oo0Oo = 1000000;

    public final void o00oOOo0(Context context) {
        ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(new NotificationChannel(f6523o00oo0O0, f6522o00oo0O, 3));
        Intent intent = new Intent();
        intent.setPackage(getPackageName());
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 67108864);
        String valueOf = String.valueOf(getApplicationInfo().loadLabel(getPackageManager()));
        try {
            startForeground(1000000, new Notification.Builder(this, f6523o00oo0O0).setContentTitle(getString(R.string.notification_running_title, valueOf)).setContentText(getString(R.string.notification_running_warn, valueOf)).setContentIntent(activity).setAutoCancel(false).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        o00oOOo0(getApplicationContext());
    }
}
