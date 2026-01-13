package androidx.profileinstaller;

import android.content.Context;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oOOo0 {

    @o0OOooO0(api = 21)
    /* renamed from: androidx.profileinstaller.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0035o00oOOo0 {
        public static File o00oOOo0(Context context) {
            return context.getCodeCacheDir();
        }
    }

    @o0OOooO0(api = 24)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        public static File o00oOOo0(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    public static boolean o00oOOo0(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = o00oOOo0(file2) && z;
        }
        return z;
    }

    public static void o00oOOoO(@oo0oO0 Context context, @oo0oO0 ProfileInstallReceiver.o00oOOo0 o00oooo02) {
        o00oooo02.o00oOOo0(o00oOOo0(o00oOOoO.o00oOOo0(context)) ? 14 : 15, null);
    }
}
