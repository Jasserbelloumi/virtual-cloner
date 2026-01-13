package com.google.android.gms.common.util;

import android.util.Base64;
import com.google.android.gms.common.annotation.KeepForSdk;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public final class Base64Utils {
    @oo0oO0
    @KeepForSdk
    public static byte[] decode(@oo0oO0 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @oo0oO0
    @KeepForSdk
    public static byte[] decodeUrlSafe(@oo0oO0 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    @oo0oO0
    @KeepForSdk
    public static byte[] decodeUrlSafeNoPadding(@oo0oO0 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    @oo0oO0
    @KeepForSdk
    public static String encode(@oo0oO0 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    @oo0oO0
    @KeepForSdk
    public static String encodeUrlSafe(@oo0oO0 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    @oo0oO0
    @KeepForSdk
    public static String encodeUrlSafeNoPadding(@oo0oO0 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
