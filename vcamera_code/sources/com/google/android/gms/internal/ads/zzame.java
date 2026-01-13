package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;
/* loaded from: classes2.dex */
public final class zzame extends zzgwh {
    private Date zza;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzgwr zzm;
    private long zzn;

    public zzame() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzgwr.zza;
    }

    public final String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("MovieHeaderBox[creationTime=");
        o00oOOo02.append(this.zza);
        o00oOOo02.append(";modificationTime=");
        o00oOOo02.append(this.zzh);
        o00oOOo02.append(";timescale=");
        o00oOOo02.append(this.zzi);
        o00oOOo02.append(";duration=");
        o00oOOo02.append(this.zzj);
        o00oOOo02.append(";rate=");
        o00oOOo02.append(this.zzk);
        o00oOOo02.append(";volume=");
        o00oOOo02.append(this.zzl);
        o00oOOo02.append(";matrix=");
        o00oOOo02.append(this.zzm);
        o00oOOo02.append(";nextTrackId=");
        return android.support.v4.media.session.o00oOo00.o00oOOo0(o00oOOo02, this.zzn, "]");
    }

    public final long zzd() {
        return this.zzj;
    }

    public final long zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgwf
    public final void zzf(ByteBuffer byteBuffer) {
        long zze;
        zzi(byteBuffer);
        if (zzh() == 1) {
            this.zza = zzgwm.zza(zzama.zzf(byteBuffer));
            this.zzh = zzgwm.zza(zzama.zzf(byteBuffer));
            this.zzi = zzama.zze(byteBuffer);
            zze = zzama.zzf(byteBuffer);
        } else {
            this.zza = zzgwm.zza(zzama.zze(byteBuffer));
            this.zzh = zzgwm.zza(zzama.zze(byteBuffer));
            this.zzi = zzama.zze(byteBuffer);
            zze = zzama.zze(byteBuffer);
        }
        this.zzj = zze;
        this.zzk = zzama.zzb(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.zzl = ((short) ((bArr[1] & 255) | ((short) (65280 & (bArr[0] << 8))))) / 256.0f;
        zzama.zzd(byteBuffer);
        zzama.zze(byteBuffer);
        zzama.zze(byteBuffer);
        double zzb = zzama.zzb(byteBuffer);
        double zzb2 = zzama.zzb(byteBuffer);
        double zza = zzama.zza(byteBuffer);
        this.zzm = new zzgwr(zzb, zzb2, zzama.zzb(byteBuffer), zzama.zzb(byteBuffer), zza, zzama.zza(byteBuffer), zzama.zza(byteBuffer), zzama.zzb(byteBuffer), zzama.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzama.zze(byteBuffer);
    }
}
