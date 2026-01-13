package o0O0000o;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OO0oO0;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oOOoO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f10267o00oOOo0 = 1;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f10268o00oOOoO = 2;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f10269o00oOo00 = 3;

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        @o0OO0oO0("android.permission.ACCESS_NETWORK_STATE")
        public static boolean o00oOOo0(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    @o0OOooO0(24)
    /* renamed from: o0O0000o.o00oOOoO$o00oOOoO  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0124o00oOOoO {
        @o0O0O0Oo
        public static int o00oOOo0(ConnectivityManager connectivityManager) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o00oOo00 {
    }

    @o0OO00OO
    @o0OO0oO0("android.permission.ACCESS_NETWORK_STATE")
    @SuppressLint({"ReferencesDeprecated"})
    public static NetworkInfo o00oOOo0(@oo0oO0 ConnectivityManager connectivityManager, @oo0oO0 Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    public static int o00oOOoO(@oo0oO0 ConnectivityManager connectivityManager) {
        return C0124o00oOOoO.o00oOOo0(connectivityManager);
    }

    @o0OO0oO0("android.permission.ACCESS_NETWORK_STATE")
    public static boolean o00oOo00(@oo0oO0 ConnectivityManager connectivityManager) {
        return o00oOOo0.o00oOOo0(connectivityManager);
    }
}
