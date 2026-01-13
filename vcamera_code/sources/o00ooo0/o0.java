package o00ooo0;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.concurrent.Executor;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0OoOoO;
import o00oOooO.oo0oO0;
import o00ooOoo.oO0O0OO;
import o00ooOoo.oOo000Oo;
import o0O000.o00oOOo0;
import o0ooOoOO.oO0Ooooo;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class o0 {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sLock = new Object();
    private static final Object sSync = new Object();
    private static TypedValue sTempValue;

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static void o00oOOo0(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOOoO(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o00oOooO.o0O0O0Oo
        public static File[] o00oOOo0(Context context) {
            return context.getExternalCacheDirs();
        }

        @o00oOooO.o0O0O0Oo
        public static File[] o00oOOoO(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        @o00oOooO.o0O0O0Oo
        public static File[] o00oOo00(Context context) {
            return context.getObbDirs();
        }
    }

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o00oOooO.o0O0O0Oo
        public static File o00oOOo0(Context context) {
            return context.getCodeCacheDir();
        }

        @o00oOooO.o0O0O0Oo
        public static Drawable o00oOOoO(Context context, int i) {
            return context.getDrawable(i);
        }

        @o00oOooO.o0O0O0Oo
        public static File o00oOo00(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    @o0OOooO0(23)
    /* loaded from: classes.dex */
    public static class o00oOo0O {
        @o00oOooO.o0O0O0Oo
        public static int o00oOOo0(Context context, int i) {
            return context.getColor(i);
        }

        @o00oOooO.o0O0O0Oo
        public static <T> T o00oOOoO(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @o00oOooO.o0O0O0Oo
        public static String o00oOo00(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOoO {
        @o00oOooO.o0O0O0Oo
        public static Context o00oOOo0(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        @o00oOooO.o0O0O0Oo
        public static File o00oOOoO(Context context) {
            return context.getDataDir();
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOo00(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    @o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o00oo0 {
        @o00oOooO.o0O0O0Oo
        public static Executor o00oOOo0(Context context) {
            return context.getMainExecutor();
        }
    }

    @o0OOooO0(26)
    /* loaded from: classes.dex */
    public static class o00oo00O {
        @o00oOooO.o0O0O0Oo
        public static Intent o00oOOo0(Context context, @o0OO00OO BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return ((i & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1) : context.registerReceiver(broadcastReceiver, intentFilter, o0.obtainAndCheckReceiverPermission(context), handler);
        }

        @o00oOooO.o0O0O0Oo
        public static ComponentName o00oOOoO(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final HashMap<Class<?>, String> f9569o00oOOo0;

        static {
            HashMap<Class<?>, String> hashMap = new HashMap<>();
            f9569o00oOOo0 = hashMap;
            hashMap.put(SubscriptionManager.class, "telephony_subscription_service");
            hashMap.put(UsageStatsManager.class, "usagestats");
            hashMap.put(AppWidgetManager.class, "appwidget");
            hashMap.put(BatteryManager.class, "batterymanager");
            hashMap.put(CameraManager.class, "camera");
            hashMap.put(JobScheduler.class, "jobscheduler");
            hashMap.put(LauncherApps.class, "launcherapps");
            hashMap.put(MediaProjectionManager.class, "media_projection");
            hashMap.put(MediaSessionManager.class, "media_session");
            hashMap.put(RestrictionsManager.class, "restrictions");
            hashMap.put(TelecomManager.class, "telecom");
            hashMap.put(TvInputManager.class, "tv_input");
            hashMap.put(AppOpsManager.class, "appops");
            hashMap.put(CaptioningManager.class, "captioning");
            hashMap.put(ConsumerIrManager.class, "consumer_ir");
            hashMap.put(PrintManager.class, "print");
            hashMap.put(BluetoothManager.class, "bluetooth");
            hashMap.put(DisplayManager.class, "display");
            hashMap.put(UserManager.class, "user");
            hashMap.put(InputManager.class, "input");
            hashMap.put(MediaRouter.class, "media_router");
            hashMap.put(NsdManager.class, "servicediscovery");
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, "account");
            hashMap.put(ActivityManager.class, "activity");
            hashMap.put(AlarmManager.class, oOo000Oo.f9218o0O00oO0);
            hashMap.put(AudioManager.class, "audio");
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, FirebaseAnalytics.Param.LOCATION);
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, "notification");
            hashMap.put(PowerManager.class, "power");
            hashMap.put(SearchManager.class, FirebaseAnalytics.Event.SEARCH);
            hashMap.put(SensorManager.class, "sensor");
            hashMap.put(StorageManager.class, "storage");
            hashMap.put(TelephonyManager.class, "phone");
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, "wifi");
            hashMap.put(WindowManager.class, "window");
        }
    }

    @o0OOooO0(33)
    /* loaded from: classes.dex */
    public static class o00oo0O0 {
        @o00oOooO.o0O0O0Oo
        public static Intent o00oOOo0(Context context, @o0OO00OO BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        }
    }

    @o0OOooO0(30)
    /* loaded from: classes.dex */
    public static class o00oo0OO {
        @o00oOooO.o0O0O0Oo
        public static String o00oOOo0(Context context) {
            String attributionTag;
            attributionTag = context.getAttributionTag();
            return attributionTag;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public @interface o0O0o {
    }

    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    public static int checkSelfPermission(@oo0oO0 Context context, @oo0oO0 String str) {
        oO0Ooooo.o00oOo0O(str, "permission must be non-null");
        return (o0O000.o00oOOo0.o00oOoo0() || !TextUtils.equals(oo0oO0.o00oo0.f17327o00oo0, str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : oO0O0OO.o00oo0O0(context).o00oOOo0() ? 0 : -1;
    }

    @o0OO00OO
    public static Context createDeviceProtectedStorageContext(@oo0oO0 Context context) {
        return o00oOoO.o00oOOo0(context);
    }

    private static File createFilesDir(File file) {
        synchronized (sSync) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                file.getPath();
            }
            return file;
        }
    }

    @o0OO00OO
    public static String getAttributionTag(@oo0oO0 Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return o00oo0OO.o00oOOo0(context);
        }
        return null;
    }

    @oo0oO0
    public static File getCodeCacheDir(@oo0oO0 Context context) {
        return o00oOo00.o00oOOo0(context);
    }

    @o00oOooO.o0O00O
    public static int getColor(@oo0oO0 Context context, @o00oOooO.o0O00OOO int i) {
        return o00oOo0O.o00oOOo0(context, i);
    }

    @o0OO00OO
    public static ColorStateList getColorStateList(@oo0oO0 Context context, @o00oOooO.o0O00OOO int i) {
        return o00ooo0o.o0O0OO.o00oOo0o(context.getResources(), i, context.getTheme());
    }

    @o0OO00OO
    public static File getDataDir(@oo0oO0 Context context) {
        return o00oOoO.o00oOOoO(context);
    }

    @o0OO00OO
    public static Drawable getDrawable(@oo0oO0 Context context, @o00oOooO.o0O0O0o0 int i) {
        return o00oOo00.o00oOOoO(context, i);
    }

    @oo0oO0
    public static File[] getExternalCacheDirs(@oo0oO0 Context context) {
        return o00oOOoO.o00oOOo0(context);
    }

    @oo0oO0
    public static File[] getExternalFilesDirs(@oo0oO0 Context context, @o0OO00OO String str) {
        return o00oOOoO.o00oOOoO(context, str);
    }

    @oo0oO0
    public static Executor getMainExecutor(@oo0oO0 Context context) {
        return o00oo0.o00oOOo0(context);
    }

    @o0OO00OO
    public static File getNoBackupFilesDir(@oo0oO0 Context context) {
        return o00oOo00.o00oOo00(context);
    }

    @oo0oO0
    public static File[] getObbDirs(@oo0oO0 Context context) {
        return o00oOOoO.o00oOo00(context);
    }

    @o0OO00OO
    public static <T> T getSystemService(@oo0oO0 Context context, @oo0oO0 Class<T> cls) {
        return (T) o00oOo0O.o00oOOoO(context, cls);
    }

    @o0OO00OO
    public static String getSystemServiceName(@oo0oO0 Context context, @oo0oO0 Class<?> cls) {
        return o00oOo0O.o00oOo00(context, cls);
    }

    public static boolean isDeviceProtectedStorage(@oo0oO0 Context context) {
        return o00oOoO.o00oOo00(context);
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (o0O0o00.o00oOooO(context, str) == 0) {
            return str;
        }
        throw new RuntimeException(android.support.v4.media.o00oOoO.o00oOOo0("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    @o0OO00OO
    public static Intent registerReceiver(@oo0oO0 Context context, @o0OO00OO BroadcastReceiver broadcastReceiver, @oo0oO0 IntentFilter intentFilter, int i) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i);
    }

    @o0OO00OO
    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    public static Intent registerReceiver(@oo0oO0 Context context, @o0OO00OO BroadcastReceiver broadcastReceiver, @oo0oO0 IntentFilter intentFilter, @o0OO00OO String str, @o0OO00OO Handler handler, int i) {
        int i2 = i & 1;
        if (i2 == 0 || (i & 4) == 0) {
            if (i2 != 0) {
                i |= 2;
            }
            int i3 = i;
            int i4 = i3 & 2;
            if (i4 == 0 && (i3 & 4) == 0) {
                throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            }
            if (i4 == 0 || (i3 & 4) == 0) {
                return o0O000.o00oOOo0.o00oOoo0() ? o00oo0O0.o00oOOo0(context, broadcastReceiver, intentFilter, str, handler, i3) : o00oo00O.o00oOOo0(context, broadcastReceiver, intentFilter, str, handler, i3);
            }
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
    }

    public static boolean startActivities(@oo0oO0 Context context, @oo0oO0 Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static boolean startActivities(@oo0oO0 Context context, @oo0oO0 Intent[] intentArr, @o0OO00OO Bundle bundle) {
        o00oOOo0.o00oOOo0(context, intentArr, bundle);
        return true;
    }

    public static void startActivity(@oo0oO0 Context context, @oo0oO0 Intent intent, @o0OO00OO Bundle bundle) {
        o00oOOo0.o00oOOoO(context, intent, bundle);
    }

    public static void startForegroundService(@oo0oO0 Context context, @oo0oO0 Intent intent) {
        o00oo00O.o00oOOoO(context, intent);
    }
}
