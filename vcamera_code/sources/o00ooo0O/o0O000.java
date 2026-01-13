package o00ooo0O;

import android.annotation.SuppressLint;
import android.content.pm.PermissionInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o0O000 {

    @o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static int o00oOOo0(PermissionInfo permissionInfo) {
            return permissionInfo.getProtection();
        }

        @o0O0O0Oo
        public static int o00oOOoO(PermissionInfo permissionInfo) {
            return permissionInfo.getProtectionFlags();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public @interface o00oOOoO {
    }

    @SuppressLint({"UniqueConstants"})
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface o00oOo00 {
    }

    @SuppressLint({"WrongConstant"})
    public static int o00oOOo0(@oo0oO0 PermissionInfo permissionInfo) {
        return o00oOOo0.o00oOOo0(permissionInfo);
    }

    @SuppressLint({"WrongConstant"})
    public static int o00oOOoO(@oo0oO0 PermissionInfo permissionInfo) {
        return o00oOOo0.o00oOOoO(permissionInfo);
    }
}
