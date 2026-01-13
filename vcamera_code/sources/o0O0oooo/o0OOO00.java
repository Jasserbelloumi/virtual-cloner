package o0O0oooo;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.util.ArrayList;
import o00oOoOo.o00oo;
import o0OO000o.o00oOOoO;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class o0OOO00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f12919o00oOOo0 = ".plugin";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f12920o00oOOoO = "moon.jar";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static ProviderInfo f12921o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static DexClassLoader f12922o00oOooO;

    public static void o00oOOo0(ProviderInfo providerInfo) {
        f12921o00oOo00 = providerInfo;
    }

    public static DexClassLoader o00oOOoO() {
        return f12922o00oOooO;
    }

    public static ProviderInfo o00oOo00() {
        return f12921o00oOo00;
    }

    public static boolean o00oOo0O() {
        return f12921o00oOo00 != null;
    }

    public static void o00oOo0o(File file) {
        File file2 = new File(file, "base.apk");
        File file3 = new File(file, "lib");
        ArrayList arrayList = new ArrayList();
        if (Process.is64Bit()) {
            for (String str : Build.SUPPORTED_64_BIT_ABIS) {
                File file4 = new File(file3, str);
                if (file4.exists()) {
                    arrayList.add(file4.getAbsolutePath());
                }
            }
        } else {
            for (String str2 : Build.SUPPORTED_32_BIT_ABIS) {
                File file5 = new File(file3, str2);
                if (file5.exists()) {
                    arrayList.add(file5.getAbsolutePath());
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) arrayList.get(i));
            if (i != size - 1) {
                sb.append(File.pathSeparator);
            }
        }
        f12922o00oOooO = new DexClassLoader(file2.getPath(), file2.getParent(), sb.toString(), Context.class.getClassLoader());
    }

    public static void o00oOoO(DexClassLoader dexClassLoader) {
        f12922o00oOooO = dexClassLoader;
    }

    public static JSONObject o00oOoO0(File file) {
        String o00oOoO02 = o00oOOoO.o00oOoO0(file);
        if (o00oOoO02 != null) {
            try {
                return new JSONObject(o00oOoO02);
            } catch (JSONException unused) {
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    public static void o00oOooO(Context context, String str, boolean z) {
        if (f12922o00oOooO != null) {
            return;
        }
        File file = new File(context.getFilesDir(), f12919o00oOOo0);
        File file2 = new File(file, o00oo.o00oOOo0(str, ".json"));
        JSONObject o00oOoO02 = o00oOoO0(file2);
        String optString = o00oOoO02.optString("current");
        File file3 = TextUtils.isEmpty(optString) ? null : new File(optString);
        if (z || TextUtils.isEmpty(optString)) {
            long optLong = o00oOoO02.optLong("time");
            long lastModified = new File(context.getPackageCodePath()).lastModified();
            if (optLong != lastModified) {
                if (file3 == null) {
                    file3 = new File(file, o00oo.o00oOOo0(str, "-1"));
                } else {
                    file3 = optString.endsWith("-1") ? new File(file, o00oo.o00oOOo0(str, "-2")) : new File(file, o00oo.o00oOOo0(str, "-1"));
                    o00oOOoO.o00oOooO(new File(optString));
                }
                File file4 = new File(file3, "base.apk");
                try {
                    o00oOOoO.o00oOo0O(context, "moon.jar", file4);
                    o00oOOoO.o00oOo0o(file4, "lib/", file3);
                    o00oOoO02.putOpt("current", file3.getPath());
                    o00oOoO02.putOpt("time", Long.valueOf(lastModified));
                    o00oOOoO.o00oOoOo(file2, o00oOoO02.toString());
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
        }
        o00oOo0o(file3);
    }
}
