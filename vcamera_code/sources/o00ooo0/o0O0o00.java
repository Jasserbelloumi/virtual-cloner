package o00ooo0;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00ooOoo.oO000o00;
import o0ooOoOO.oO0Ooooo;
/* loaded from: classes.dex */
public final class o0O0o00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f9619o00oOOo0 = 0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f9620o00oOOoO = -1;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f9621o00oOo00 = -2;

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o00oOOo0 {
    }

    public static int o00oOOo0(@oo0oO0 Context context, @oo0oO0 String str) {
        return o00oOo00(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int o00oOOoO(@oo0oO0 Context context, @oo0oO0 String str, @o0OO00OO String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return o00oOo00(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static int o00oOo00(@oo0oO0 Context context, @oo0oO0 String str, int i, int i2, @o0OO00OO String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String o00oOooO2 = oO000o00.o00oOOoO.o00oOooO(str);
        if (o00oOooO2 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return (Process.myUid() == i2 && oO0Ooooo.o00oOOo0.o00oOOo0(context.getPackageName(), str2) ? oO000o00.o00oOOo0(context, i2, o00oOooO2, str2) : oO000o00.o00oOo0O(context, o00oOooO2, str2)) == 0 ? 0 : -2;
    }

    public static int o00oOooO(@oo0oO0 Context context, @oo0oO0 String str) {
        return o00oOo00(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
