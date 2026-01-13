package o0OO000o;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
/* loaded from: classes2.dex */
public class o00oOo0O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static String f12962o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static o00oOOoO f12963o00oOOoO = o00oOOoO.TYPE_UNKNOWN;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f12964o00oOOo0;

        static {
            int[] iArr = new int[o00oOOoO.values().length];
            f12964o00oOOo0 = iArr;
            try {
                iArr[o00oOOoO.TYPE_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12964o00oOOo0[o00oOOoO.TYPE_CLIENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12964o00oOOo0[o00oOOoO.TYPE_SERVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12964o00oOOo0[o00oOOoO.TYPE_ASSIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum o00oOOoO {
        TYPE_UNKNOWN,
        TYPE_CLIENT,
        TYPE_APP,
        TYPE_ASSIST,
        TYPE_SERVICE
    }

    public static String o00oOOo0(Context context) {
        String str = f12962o00oOOo0;
        if (TextUtils.isEmpty(str)) {
            try {
                int myPid = Process.myPid();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        String str2 = runningAppProcessInfo.processName;
                        f12962o00oOOo0 = str2;
                        return str2;
                    }
                }
            } catch (Exception unused) {
            }
            String o00oOOoO2 = o00oOOoO(-1);
            f12962o00oOOo0 = o00oOOoO2;
            return o00oOOoO2;
        }
        return str;
    }

    public static String o00oOOoO(int i) {
        BufferedReader bufferedReader;
        if (i == -1) {
            i = Process.myPid();
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + i + "/cmdline"), "iso-8859-1"));
        } catch (Throwable unused) {
            bufferedReader = null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = bufferedReader.read();
                if (read <= 0) {
                    break;
                }
                sb.append((char) read);
            }
            String sb2 = sb.toString();
            try {
                bufferedReader.close();
            } catch (Exception unused2) {
            }
            return sb2;
        } catch (Throwable unused3) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Exception unused4) {
                }
            }
            return null;
        }
    }

    public static boolean o00oOo00() {
        return f12963o00oOOoO == o00oOOoO.TYPE_APP;
    }

    public static boolean o00oOo0O() {
        return f12963o00oOOoO == o00oOOoO.TYPE_CLIENT;
    }

    public static boolean o00oOo0o() {
        return f12963o00oOOoO == o00oOOoO.TYPE_SERVICE;
    }

    public static String o00oOoO(o00oOOoO o00ooooo2) {
        StringBuilder sb;
        String str;
        int i = o00oOOo0.f12964o00oOOo0[o00ooooo2.ordinal()];
        if (i == 1) {
            sb = new StringBuilder();
            sb.append(o00ooooo2);
            str = "#TYPE_APP";
        } else if (i == 2) {
            sb = new StringBuilder();
            sb.append(o00ooooo2);
            str = "#TYPE_CLIENT";
        } else if (i == 3) {
            sb = new StringBuilder();
            sb.append(o00ooooo2);
            str = "#TYPE_SERVICE";
        } else if (i != 4) {
            return null;
        } else {
            sb = new StringBuilder();
            sb.append(o00ooooo2);
            str = "#TYPE_ASSIST";
        }
        sb.append(str);
        return sb.toString();
    }

    public static o00oOOoO o00oOoO0(Context context) {
        o00oOOoO o00ooooo2;
        if (f12963o00oOOoO == o00oOOoO.TYPE_UNKNOWN) {
            String packageName = context.getPackageName();
            String o00oOOo02 = o00oOOo0(context);
            if (!TextUtils.equals(o00oOOo02, packageName)) {
                if (!TextUtils.equals(o00oOOo02, packageName + ":client")) {
                    if (TextUtils.equals(o00oOOo02, packageName + ":core")) {
                        o00ooooo2 = o00oOOoO.TYPE_SERVICE;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(packageName);
                        sb.append(":assist");
                        o00ooooo2 = TextUtils.equals(o00oOOo02, sb.toString()) ? o00oOOoO.TYPE_ASSIST : o00oOOoO.TYPE_APP;
                    }
                    f12963o00oOOoO = o00ooooo2;
                }
            }
            o00ooooo2 = o00oOOoO.TYPE_CLIENT;
            f12963o00oOOoO = o00ooooo2;
        }
        return f12963o00oOOoO;
    }

    public static boolean o00oOooO() {
        return f12963o00oOOoO == o00oOOoO.TYPE_ASSIST;
    }
}
