package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Pattern;
import o00oOooO.o0OO00OO;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
@VisibleForTesting
@KeepForSdk
/* loaded from: classes.dex */
public class Strings {
    private static final Pattern zza = Pattern.compile("\\$\\{(.*?)\\}");

    private Strings() {
    }

    @o0OO00OO
    @KeepForSdk
    public static String emptyToNull(@o0OO00OO String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    @KeepForSdk
    public static boolean isEmptyOrWhitespace(@o0OO00OO String str) {
        return str == null || str.trim().isEmpty();
    }
}
