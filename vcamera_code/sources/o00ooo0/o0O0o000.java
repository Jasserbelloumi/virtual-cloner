package o00ooo0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import androidx.concurrent.futures.o00oo00O;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executors;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0O000.o0O0O0Oo;
/* loaded from: classes.dex */
public final class o0O0o000 {
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f9622o00oOOo0 = "PackageManagerCompat";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f9623o00oOOoO = "android.intent.action.AUTO_REVOKE_PERMISSIONS";

    @o0OOooO0(30)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        public static boolean o00oOOo0(@oo0oO0 Context context) {
            boolean isAutoRevokeWhitelisted;
            isAutoRevokeWhitelisted = context.getPackageManager().isAutoRevokeWhitelisted();
            return !isAutoRevokeWhitelisted;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public @interface o00oOOoO {
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static boolean o00oOOo0(@oo0oO0 PackageManager packageManager) {
        int i = Build.VERSION.SDK_INT;
        boolean z = i >= 30;
        boolean z2 = i < 30;
        boolean z3 = o00oOOoO(packageManager) != null;
        if (z) {
            return true;
        }
        return z2 && z3;
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static String o00oOOoO(@oo0oO0 PackageManager packageManager) {
        String str = null;
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent(f9623o00oOOoO).setData(Uri.fromParts(oo0oO0.o00oOOoO.f17287o00oOooo, "com.example", null)), 0)) {
            String str2 = resolveInfo.activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    @oo0oO0
    public static ListenableFuture<Integer> o00oOo00(@oo0oO0 Context context) {
        int i;
        o00oo00O<Integer> o00oOOoO2 = o00oo00O.o00oOOoO();
        if (!o0O0O0Oo.o00oOOo0.o00oOOo0(context)) {
            o00oOOoO2.set(0);
            return o00oOOoO2;
        } else if (!o00oOOo0(context.getPackageManager())) {
            o00oOOoO2.set(1);
            return o00oOOoO2;
        } else {
            int i2 = context.getApplicationInfo().targetSdkVersion;
            if (i2 < 30) {
                o00oOOoO2.set(0);
                return o00oOOoO2;
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 31) {
                if (o00oOOo0.o00oOOo0(context)) {
                    i = Integer.valueOf(i2 >= 31 ? 5 : 4);
                } else {
                    i = 2;
                }
                o00oOOoO2.set(i);
                return o00oOOoO2;
            } else if (i3 == 30) {
                o00oOOoO2.set(Integer.valueOf(o00oOOo0.o00oOOo0(context) ? 4 : 2));
                return o00oOOoO2;
            } else {
                final oooOO0 ooooo0 = new oooOO0(context);
                o00oOOoO2.addListener(new Runnable() { // from class: o00ooo0.o0OooO0
                    @Override // java.lang.Runnable
                    public final void run() {
                        oooOO0.this.o00oOOoO();
                    }
                }, Executors.newSingleThreadExecutor());
                ooooo0.o00oOOo0(o00oOOoO2);
                return o00oOOoO2;
            }
        }
    }
}
