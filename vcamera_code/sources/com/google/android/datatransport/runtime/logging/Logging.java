package com.google.android.datatransport.runtime.logging;

import android.util.Log;
import o00oOoOo.o00oo;
/* loaded from: classes.dex */
public final class Logging {
    private static final String LOG_PREFIX = "TRuntime.";
    private static final int MAX_LOG_TAG_SIZE_IN_SDK_N = 23;

    private Logging() {
    }

    private static String concatTag(String str, String str2) {
        String o00oOOo02 = o00oo.o00oOOo0(str, str2);
        return o00oOOo02.length() > 23 ? o00oOOo02.substring(0, 23) : o00oOOo02;
    }

    public static void d(String str, String str2) {
        getTag(str);
    }

    public static void d(String str, String str2, Object obj) {
        if (Log.isLoggable(getTag(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        if (Log.isLoggable(getTag(str), 3)) {
            String.format(str2, obj, obj2);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        if (Log.isLoggable(getTag(str), 3)) {
            String.format(str2, objArr);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        getTag(str);
    }

    private static String getTag(String str) {
        return o00oo.o00oOOo0(LOG_PREFIX, str);
    }

    public static void i(String str, String str2, Object obj) {
        if (Log.isLoggable(getTag(str), 4)) {
            String.format(str2, obj);
        }
    }

    public static void w(String str, String str2, Object obj) {
        if (Log.isLoggable(getTag(str), 5)) {
            String.format(str2, obj);
        }
    }
}
