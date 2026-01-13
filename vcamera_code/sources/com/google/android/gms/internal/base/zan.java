package com.google.android.gms.internal.base;

import android.os.Build;
import o00oOooO.o0O00O0o;
/* loaded from: classes2.dex */
final class zan {
    @o0O00O0o(api = 33, codename = "Tiramisu")
    public static boolean zaa() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }
}
