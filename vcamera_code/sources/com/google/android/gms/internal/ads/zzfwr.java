package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes2.dex */
public final class zzfwr {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzfwq zza(String str) throws GeneralSecurityException {
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            zzfwq zzfwqVar = (zzfwq) it.next();
            if (zzfwqVar.zza()) {
                return zzfwqVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
