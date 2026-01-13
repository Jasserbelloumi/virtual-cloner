package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzgb extends zzfz {
    public final int zzd;
    @o0OO00OO
    public final String zze;
    public final Map zzf;
    public final byte[] zzg;

    public zzgb(int i, @o0OO00OO String str, @o0OO00OO IOException iOException, Map map, zzfl zzflVar, byte[] bArr) {
        super(android.support.v4.media.o00oOOo0.o00oOOo0("Response code: ", i), iOException, zzflVar, 2004, 1);
        this.zzd = i;
        this.zze = str;
        this.zzf = map;
        this.zzg = bArr;
    }
}
