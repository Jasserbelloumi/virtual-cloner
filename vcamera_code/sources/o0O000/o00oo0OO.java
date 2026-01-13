package o0O000;

import android.os.Environment;
import java.io.File;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oo0OO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f10106o00oOOo0 = "EnvironmentCompat";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f10107o00oOOoO = "unknown";

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static String o00oOOo0(File file) {
            return Environment.getStorageState(file);
        }
    }

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o00oOooO.o0O0O0Oo
        public static String o00oOOo0(File file) {
            return Environment.getExternalStorageState(file);
        }
    }

    @oo0oO0
    public static String o00oOOo0(@oo0oO0 File file) {
        return o00oOOoO.o00oOOo0(file);
    }
}
