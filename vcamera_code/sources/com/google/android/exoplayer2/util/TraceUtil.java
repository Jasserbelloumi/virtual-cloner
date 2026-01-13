package com.google.android.exoplayer2.util;

import android.os.Trace;
import o00oOooO.o0OOooO0;
/* loaded from: classes.dex */
public final class TraceUtil {
    private TraceUtil() {
    }

    public static void beginSection(String str) {
        if (Util.SDK_INT >= 18) {
            beginSectionV18(str);
        }
    }

    @o0OOooO0(18)
    private static void beginSectionV18(String str) {
        Trace.beginSection(str);
    }

    public static void endSection() {
        if (Util.SDK_INT >= 18) {
            endSectionV18();
        }
    }

    @o0OOooO0(18)
    private static void endSectionV18() {
        Trace.endSection();
    }
}
