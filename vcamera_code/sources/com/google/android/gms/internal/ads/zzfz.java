package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public class zzfz extends zzfh {
    public final zzfl zzb;
    public final int zzc;

    public zzfz(zzfl zzflVar, int i, int i2) {
        super(zzb(2008, 1));
        this.zzb = zzflVar;
        this.zzc = 1;
    }

    public zzfz(IOException iOException, zzfl zzflVar, int i, int i2) {
        super(iOException, zzb(i, i2));
        this.zzb = zzflVar;
        this.zzc = i2;
    }

    public zzfz(String str, zzfl zzflVar, int i, int i2) {
        super(str, zzb(i, i2));
        this.zzb = zzflVar;
        this.zzc = i2;
    }

    public zzfz(String str, @o0OO00OO IOException iOException, zzfl zzflVar, int i, int i2) {
        super(str, iOException, zzb(i, i2));
        this.zzb = zzflVar;
        this.zzc = i2;
    }

    public static zzfz zza(IOException iOException, zzfl zzflVar, int i) {
        String message = iOException.getMessage();
        int i2 = 2001;
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && zzfnb.zza(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        }
        return i2 == 2007 ? new zzfy(iOException, zzflVar) : new zzfz(iOException, zzflVar, i2, i);
    }

    private static int zzb(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }
}
