package o0OO000;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import o0O0oooo.o0OO;
/* loaded from: classes2.dex */
public class o00oOo0O implements Application.ActivityLifecycleCallbacks {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final String f12951o00oo0O0 = o00oOo0O.class.getSimpleName();

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final o00oOo0O f12950o00oo0O = new o00oOo0O();

    public final boolean o00oOOo0(Activity activity) {
        Bitmap bitmap;
        int intValue = ((Integer) o0OO.o00oo00O("space", 0)).intValue();
        ActivityInfo o00oOooO2 = o0OO.o00oOooO(new ComponentName(activity.getPackageName(), activity.getClass().getName()), 0, intValue);
        if (o00oOooO2 == null) {
            return false;
        }
        PackageManager packageManager = activity.getPackageManager();
        Drawable loadIcon = o00oOooO2.loadIcon(packageManager);
        String valueOf = String.valueOf(o00oOooO2.loadLabel(packageManager));
        if (intValue != 0) {
            StringBuilder o00oOOo02 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(valueOf, "(");
            o00oOOo02.append(intValue + 1);
            o00oOOo02.append(")");
            valueOf = o00oOOo02.toString();
        }
        if (loadIcon instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) loadIcon).getBitmap();
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(loadIcon.getIntrinsicWidth(), loadIcon.getIntrinsicHeight(), loadIcon.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(createBitmap);
            loadIcon.setBounds(0, 0, loadIcon.getIntrinsicWidth(), loadIcon.getIntrinsicHeight());
            loadIcon.draw(canvas);
            bitmap = createBitmap;
        }
        activity.setTaskDescription(new ActivityManager.TaskDescription(valueOf, bitmap));
        return true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.isTaskRoot()) {
            o00oOOo0(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
