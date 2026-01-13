package com.google.android.gms.common.util;

import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;
import o00oOooO.o0O00O0o;
import o0O000.o00oOOo0;
@VisibleForTesting
@KeepForSdk
/* loaded from: classes.dex */
public final class PlatformVersion {
    private PlatformVersion() {
    }

    @o0O00O0o(api = 11)
    @KeepForSdk
    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    @o0O00O0o(api = 12)
    @KeepForSdk
    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    @o0O00O0o(api = 14)
    @KeepForSdk
    public static boolean isAtLeastIceCreamSandwich() {
        return true;
    }

    @o0O00O0o(api = 15)
    @KeepForSdk
    public static boolean isAtLeastIceCreamSandwichMR1() {
        return true;
    }

    @o0O00O0o(api = 16)
    @KeepForSdk
    public static boolean isAtLeastJellyBean() {
        return true;
    }

    @o0O00O0o(api = 17)
    @KeepForSdk
    public static boolean isAtLeastJellyBeanMR1() {
        return true;
    }

    @o0O00O0o(api = 18)
    @KeepForSdk
    public static boolean isAtLeastJellyBeanMR2() {
        return true;
    }

    @o0O00O0o(api = 19)
    @KeepForSdk
    public static boolean isAtLeastKitKat() {
        return true;
    }

    @o0O00O0o(api = 20)
    @KeepForSdk
    public static boolean isAtLeastKitKatWatch() {
        return true;
    }

    @o0O00O0o(api = 21)
    @KeepForSdk
    public static boolean isAtLeastLollipop() {
        return true;
    }

    @o0O00O0o(api = 22)
    @KeepForSdk
    public static boolean isAtLeastLollipopMR1() {
        return true;
    }

    @o0O00O0o(api = 23)
    @KeepForSdk
    public static boolean isAtLeastM() {
        return true;
    }

    @o0O00O0o(api = 24)
    @KeepForSdk
    public static boolean isAtLeastN() {
        return true;
    }

    @o0O00O0o(api = 26)
    @KeepForSdk
    public static boolean isAtLeastO() {
        return true;
    }

    @o0O00O0o(api = 28)
    @KeepForSdk
    public static boolean isAtLeastP() {
        return true;
    }

    @o0O00O0o(api = 29)
    @KeepForSdk
    public static boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @o0O00O0o(api = 30)
    @KeepForSdk
    public static boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @o0O00O0o(api = 31)
    @KeepForSdk
    public static boolean isAtLeastS() {
        return Build.VERSION.SDK_INT >= 31;
    }

    @o0O00O0o(api = 32)
    @KeepForSdk
    public static boolean isAtLeastSv2() {
        return Build.VERSION.SDK_INT >= 32;
    }

    @o0O00O0o(api = 33)
    @KeepForSdk
    public static boolean isAtLeastT() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }

    @o0O00O0o(api = 33, codename = "UpsideDownCake")
    @KeepForSdk
    public static boolean isAtLeastU() {
        if (isAtLeastT()) {
            return o00oOOo0.o00oOooo();
        }
        return false;
    }
}
