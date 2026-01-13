package com.google.android.gms.internal.ads;

import android.system.ErrnoException;
import android.system.OsConstants;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
@o0OOooO0(21)
/* loaded from: classes2.dex */
final class zzfu {
    /* JADX INFO: Access modifiers changed from: private */
    @o0O0O0Oo
    public static boolean zzb(@o0OO00OO Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}
