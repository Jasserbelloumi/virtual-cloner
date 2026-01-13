package com.google.android.gms.common.util;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public final class CrashUtils {
    private static final String[] zza = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    @KeepForSdk
    public static boolean addDynamiteErrorToDropBox(@oo0oO0 Context context, @oo0oO0 Throwable th) {
        try {
            Preconditions.checkNotNull(context);
            Preconditions.checkNotNull(th);
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
