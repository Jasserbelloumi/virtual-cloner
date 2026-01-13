package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzgg extends zzfa {
    private final Resources zza;
    private final String zzb;
    @o0OO00OO
    private Uri zzc;
    @o0OO00OO
    private AssetFileDescriptor zzd;
    @o0OO00OO
    private InputStream zze;
    private long zzf;
    private boolean zzg;

    public zzgg(Context context) {
        super(false);
        this.zza = context.getResources();
        this.zzb = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws zzgf {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zzf;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new zzgf(null, e, 2000);
                }
            }
            InputStream inputStream = this.zze;
            int i3 = zzew.zza;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                if (this.zzf == -1) {
                    return -1;
                }
                throw new zzgf("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
            long j2 = this.zzf;
            if (j2 != -1) {
                this.zzf = j2 - read;
            }
            zzg(read);
            return read;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
        if (r3.matches("\\d+") != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0153  */
    @Override // com.google.android.gms.internal.ads.zzfg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzb(com.google.android.gms.internal.ads.zzfl r16) throws com.google.android.gms.internal.ads.zzgf {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgg.zzb(com.google.android.gms.internal.ads.zzfl):long");
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    @o0OO00OO
    public final Uri zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final void zzd() throws zzgf {
        this.zzc = null;
        try {
            try {
                InputStream inputStream = this.zze;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zze = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzd;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.zzd = null;
                        if (this.zzg) {
                            this.zzg = false;
                            zzh();
                        }
                    }
                } catch (IOException e) {
                    throw new zzgf(null, e, 2000);
                }
            } catch (IOException e2) {
                throw new zzgf(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.zze = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.zzd;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.zzd = null;
                    if (this.zzg) {
                        this.zzg = false;
                        zzh();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new zzgf(null, e3, 2000);
                }
            } catch (Throwable th2) {
                this.zzd = null;
                if (this.zzg) {
                    this.zzg = false;
                    zzh();
                }
                throw th2;
            }
        }
    }
}
