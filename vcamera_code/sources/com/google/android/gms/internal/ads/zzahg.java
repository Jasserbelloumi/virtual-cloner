package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.primitives.SignedBytes;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzahg implements zzahn {
    private final zzem zza;
    private final zzen zzb;
    @o0OO00OO
    private final String zzc;
    private String zzd;
    private zzabb zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private zzaf zzj;
    private int zzk;
    private long zzl;

    public zzahg() {
        this(null);
    }

    public zzahg(@o0OO00OO String str) {
        zzem zzemVar = new zzem(new byte[16], 16);
        this.zza = zzemVar;
        this.zzb = new zzen(zzemVar.zza);
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = C.TIME_UNSET;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zza(zzen zzenVar) {
        zzdl.zzb(this.zze);
        while (zzenVar.zza() > 0) {
            int i = this.zzf;
            if (i == 0) {
                while (zzenVar.zza() > 0) {
                    if (this.zzh) {
                        int zzk = zzenVar.zzk();
                        this.zzh = zzk == 172;
                        byte b = SignedBytes.MAX_POWER_OF_TWO;
                        if (zzk != 64) {
                            if (zzk == 65) {
                                zzk = 65;
                            }
                        }
                        this.zzf = 1;
                        zzen zzenVar2 = this.zzb;
                        zzenVar2.zzH()[0] = -84;
                        byte[] zzH = zzenVar2.zzH();
                        if (zzk == 65) {
                            b = 65;
                        }
                        zzH[1] = b;
                        this.zzg = 2;
                    } else {
                        this.zzh = zzenVar.zzk() == 172;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(zzenVar.zza(), this.zzk - this.zzg);
                this.zze.zzq(zzenVar, min);
                int i2 = this.zzg + min;
                this.zzg = i2;
                int i3 = this.zzk;
                if (i2 == i3) {
                    long j = this.zzl;
                    if (j != C.TIME_UNSET) {
                        this.zze.zzs(j, 1, i3, 0, null);
                        this.zzl += this.zzi;
                    }
                    this.zzf = 0;
                }
            } else {
                byte[] zzH2 = this.zzb.zzH();
                int min2 = Math.min(zzenVar.zza(), 16 - this.zzg);
                zzenVar.zzB(zzH2, this.zzg, min2);
                int i4 = this.zzg + min2;
                this.zzg = i4;
                if (i4 == 16) {
                    this.zza.zzj(0);
                    zzyx zza = zzyy.zza(this.zza);
                    zzaf zzafVar = this.zzj;
                    if (zzafVar == null || zzafVar.zzz != 2 || zza.zza != zzafVar.zzA || !MimeTypes.AUDIO_AC4.equals(zzafVar.zzm)) {
                        zzad zzadVar = new zzad();
                        zzadVar.zzH(this.zzd);
                        zzadVar.zzS(MimeTypes.AUDIO_AC4);
                        zzadVar.zzw(2);
                        zzadVar.zzT(zza.zza);
                        zzadVar.zzK(this.zzc);
                        zzaf zzY = zzadVar.zzY();
                        this.zzj = zzY;
                        this.zze.zzk(zzY);
                    }
                    this.zzk = zza.zzb;
                    this.zzi = (zza.zzc * 1000000) / this.zzj.zzA;
                    this.zzb.zzF(0);
                    this.zze.zzq(this.zzb, 16);
                    this.zzf = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzzx zzzxVar, zzaiz zzaizVar) {
        zzaizVar.zzc();
        this.zzd = zzaizVar.zzb();
        this.zze = zzzxVar.zzv(zzaizVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzd(long j, int i) {
        if (j != C.TIME_UNSET) {
            this.zzl = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zze() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = C.TIME_UNSET;
    }
}
