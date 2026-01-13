package com.google.android.gms.internal.ads;

import java.util.logging.Logger;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfnt {
    private static final Logger zza = Logger.getLogger(zzfnt.class.getName());
    private static final zzfns zzb = new zzfns(null);

    private zzfnt() {
    }

    public static String zza(@CheckForNull String str) {
        return str == null ? "" : str;
    }

    public static boolean zzb(@CheckForNull String str) {
        return str == null || str.isEmpty();
    }
}
