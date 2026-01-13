package o0ooO0O0;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import com.google.common.base.Ascii;
import multispace.multiapp.clone.app.App;
import o0O0oooo.o0OO;
import o0OOoO0.o00oo;
/* loaded from: classes3.dex */
public class oOo00ooO {
    public static void o00oOOo0(String str, int i) {
        try {
            PackageInfo o00oOoOo2 = o0OO.o00oOoOo(str, i, 0);
            if (o00oOoOo2 == null) {
                return;
            }
            PackageInfo packageInfo = App.o00oOOoO().getPackageManager().getPackageInfo(str, 0);
            if (!o00oOoOo2.applicationInfo.publicSourceDir.equals(packageInfo.applicationInfo.publicSourceDir)) {
                o0OO.o00oo0o0(i, str, "");
                o0OO.o00oo0Oo(str, 0, true);
            } else if (o00oOoOo2.versionCode != packageInfo.versionCode) {
                o0OO.o00oo0o0(i, str, "");
                o0OO.o00oo0Oo(str, 0, true);
            } else if (o00oOoOo2.getLongVersionCode() != packageInfo.getLongVersionCode()) {
                o0OO.o00oo0o0(i, str, "");
                o0OO.o00oo0Oo(str, 0, true);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static String o00oOOoO() {
        return o00oo.o00oOOo0(new byte[]{39, 62, -103, 103, -104, -19, -78, 70, 63, 38, -116, 110, -59, -80, -14, 6, 40, 38, -120, 57, -120, -72, -16, 70, 60, 62, -126, 101, -114, -8, -4, Ascii.EM, 63, 57, -62, 115, -114, -93, -4, 0, 35, 57, -46, 126, -113, -22}, new byte[]{79, 74, -19, Ascii.ETB, -21, -41, -99, 105}) + App.o00oOOoO().getPackageName();
    }

    public static int o00oOo00(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static void o00oOo0O() {
        char c;
        try {
            int i = App.o00oOOoO().getPackageManager().getApplicationInfo(App.o00oOOoO().getPackageName(), 0).uid;
            String packageName = App.o00oOOoO().getPackageName();
            byte b = -76;
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) App.o00oOOoO().getSystemService(o00oo.o00oOOo0(new byte[]{-58, 91, -36, 95, -76, 74, 88, -1}, new byte[]{-89, 56, -88, 54, -62, 35, 44, -122}))).getRunningAppProcesses()) {
                if (runningAppProcessInfo.uid == i && runningAppProcessInfo.pid != Process.myPid()) {
                    if (runningAppProcessInfo.processName.startsWith(packageName)) {
                        c = 7;
                        if (!runningAppProcessInfo.processName.contains(o00oo.o00oOOo0(new byte[]{Ascii.VT, -31, -49, -109, b, 98}, new byte[]{49, Byte.MIN_VALUE, -88, -10, -38, Ascii.SYN, -11, 113}))) {
                            b = -76;
                        }
                    } else {
                        c = 7;
                    }
                    Process.killProcess(runningAppProcessInfo.pid);
                    b = -76;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static String o00oOooO(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }
}
