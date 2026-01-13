package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import o0O0Ooo.o0O00O0;
import o0O0Ooo0.o0O00000;
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f5586o00oOOo0 = o0O00000.o00oOo0o("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        o0O00000.o00oOo00().o00oOOo0(f5586o00oOOo0, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            o0O00O0.o00ooOoO(context).o00ooooo(goAsync());
        } catch (IllegalStateException e) {
            o0O00000.o00oOo00().o00oOOoO(f5586o00oOOo0, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
