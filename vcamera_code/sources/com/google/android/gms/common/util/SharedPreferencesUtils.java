package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.annotation.KeepForSdk;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public class SharedPreferencesUtils {
    private SharedPreferencesUtils() {
    }

    @KeepForSdk
    @Deprecated
    public static void publishWorldReadableSharedPreferences(@oo0oO0 Context context, @oo0oO0 SharedPreferences.Editor editor, @oo0oO0 String str) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
