package com.google.firebase.platforminfo;

import o00oOooO.o0OO00OO;
import o0OO0o.o0O00O;
/* loaded from: classes2.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    @o0OO00OO
    public static String detectVersion() {
        try {
            return o0O00O.f13197o0O0o.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
