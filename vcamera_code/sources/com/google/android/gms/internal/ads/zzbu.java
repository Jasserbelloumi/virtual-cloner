package com.google.android.gms.internal.ads;

import java.io.IOException;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public class zzbu extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzbu(@o0OO00OO String str, @o0OO00OO Throwable th, boolean z, int i) {
        super(str, th);
        this.zza = z;
        this.zzb = i;
    }

    public static zzbu zza(@o0OO00OO String str, @o0OO00OO Throwable th) {
        return new zzbu(str, th, true, 1);
    }

    public static zzbu zzb(@o0OO00OO String str, @o0OO00OO Throwable th) {
        return new zzbu(str, th, true, 0);
    }

    public static zzbu zzc(@o0OO00OO String str) {
        return new zzbu(str, null, false, 1);
    }
}
