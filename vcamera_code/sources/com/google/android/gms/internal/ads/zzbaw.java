package com.google.android.gms.internal.ads;

import android.os.StrictMode;
/* loaded from: classes2.dex */
public final class zzbaw {
    public static Object zza(zzfok zzfokVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return zzfokVar.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
