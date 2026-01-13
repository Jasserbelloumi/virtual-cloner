package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzahj implements zzahn {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzem zzc = new zzem(new byte[7], 7);
    private final zzen zzd = new zzen(Arrays.copyOf(zza, 10));
    @o0OO00OO
    private final String zze;
    private String zzf;
    private zzabb zzg;
    private zzabb zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private zzabb zzu;
    private long zzv;

    public zzahj(boolean z, @o0OO00OO String str) {
        zzh();
        this.zzn = -1;
        this.zzo = -1;
        this.zzr = C.TIME_UNSET;
        this.zzt = C.TIME_UNSET;
        this.zzb = z;
        this.zze = str;
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzm = false;
        zzh();
    }

    private final void zzh() {
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = 256;
    }

    private final void zzi() {
        this.zzi = 3;
        this.zzj = 0;
    }

    private final void zzj(zzabb zzabbVar, long j, int i, int i2) {
        this.zzi = 4;
        this.zzj = i;
        this.zzu = zzabbVar;
        this.zzv = j;
        this.zzs = i2;
    }

    private final boolean zzk(zzen zzenVar, byte[] bArr, int i) {
        int min = Math.min(zzenVar.zza(), i - this.zzj);
        zzenVar.zzB(bArr, this.zzj, min);
        int i2 = this.zzj + min;
        this.zzj = i2;
        return i2 == i;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & 255) | 65280);
    }

    private static final boolean zzm(zzen zzenVar, byte[] bArr, int i) {
        if (zzenVar.zza() < i) {
            return false;
        }
        zzenVar.zzB(bArr, 0, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zza(zzen zzenVar) throws zzbu {
        int i;
        zzabb zzabbVar;
        long j;
        int i2;
        int i3;
        int i4;
        this.zzg.getClass();
        int i5 = zzew.zza;
        while (zzenVar.zza() > 0) {
            int i6 = this.zzi;
            int i7 = 13;
            int i8 = 2;
            if (i6 == 0) {
                byte[] zzH = zzenVar.zzH();
                int zzc = zzenVar.zzc();
                int zzd = zzenVar.zzd();
                while (zzc < zzd) {
                    int i9 = zzc + 1;
                    int i10 = zzH[zzc] & 255;
                    if (this.zzk == 512 && zzl((byte) -1, (byte) i10)) {
                        if (!this.zzm) {
                            int i11 = i9 - 2;
                            zzenVar.zzF(i11 + 1);
                            if (zzm(zzenVar, this.zzc.zza, 1)) {
                                this.zzc.zzj(4);
                                int zzd2 = this.zzc.zzd(1);
                                int i12 = this.zzn;
                                if (i12 == -1 || zzd2 == i12) {
                                    if (this.zzo != -1) {
                                        if (zzm(zzenVar, this.zzc.zza, 1)) {
                                            this.zzc.zzj(i8);
                                            if (this.zzc.zzd(4) == this.zzo) {
                                                zzenVar.zzF(i11 + 2);
                                            }
                                        }
                                    }
                                    if (zzm(zzenVar, this.zzc.zza, 4)) {
                                        this.zzc.zzj(14);
                                        int zzd3 = this.zzc.zzd(i7);
                                        if (zzd3 >= 7) {
                                            byte[] zzH2 = zzenVar.zzH();
                                            int zzd4 = zzenVar.zzd();
                                            int i13 = i11 + zzd3;
                                            if (i13 < zzd4) {
                                                byte b = zzH2[i13];
                                                if (b == -1) {
                                                    int i14 = i13 + 1;
                                                    if (i14 != zzd4) {
                                                        byte b2 = zzH2[i14];
                                                        if (zzl((byte) -1, b2) && ((b2 & 8) >> 3) == zzd2) {
                                                        }
                                                    }
                                                } else if (b == 73) {
                                                    int i15 = i13 + 1;
                                                    if (i15 != zzd4) {
                                                        if (zzH2[i15] == 68) {
                                                            int i16 = i13 + 2;
                                                            if (i16 != zzd4) {
                                                                if (zzH2[i16] == 51) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                zzenVar.zzF(i9);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        this.zzp = (i10 & 8) >> 3;
                        this.zzl = 1 == ((i10 & 1) ^ 1);
                        if (this.zzm) {
                            zzi();
                        } else {
                            this.zzi = 1;
                            this.zzj = 0;
                        }
                        zzenVar.zzF(i9);
                        break;
                        break;
                    }
                    int i17 = this.zzk;
                    int i18 = i17 | i10;
                    if (i18 == 329) {
                        i3 = 2;
                        i4 = 768;
                    } else if (i18 == 511) {
                        i3 = 2;
                        i4 = 512;
                    } else if (i18 == 836) {
                        i3 = 2;
                        i4 = 1024;
                    } else if (i18 == 1075) {
                        this.zzi = 2;
                        this.zzj = 3;
                        this.zzs = 0;
                        this.zzd.zzF(0);
                        zzenVar.zzF(i9);
                        break;
                        break;
                    } else if (i17 != 256) {
                        this.zzk = 256;
                        zzc = i9 - 1;
                        i7 = 13;
                        i8 = 2;
                    } else {
                        i3 = 2;
                        i8 = i3;
                        zzc = i9;
                        i7 = 13;
                    }
                    this.zzk = i4;
                    i8 = i3;
                    zzc = i9;
                    i7 = 13;
                }
                zzenVar.zzF(zzc);
            } else if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        int min = Math.min(zzenVar.zza(), this.zzs - this.zzj);
                        this.zzu.zzq(zzenVar, min);
                        int i19 = this.zzj + min;
                        this.zzj = i19;
                        int i20 = this.zzs;
                        if (i19 == i20) {
                            long j2 = this.zzt;
                            if (j2 != C.TIME_UNSET) {
                                this.zzu.zzs(j2, 1, i20, 0, null);
                                this.zzt += this.zzv;
                            }
                            zzh();
                        }
                    } else {
                        if (zzk(zzenVar, this.zzc.zza, true != this.zzl ? 5 : 7)) {
                            this.zzc.zzj(0);
                            if (this.zzq) {
                                this.zzc.zzl(10);
                            } else {
                                int zzd5 = this.zzc.zzd(2) + 1;
                                if (zzd5 != 2) {
                                    zzee.zze("AdtsReader", "Detected audio object type: " + zzd5 + ", but assuming AAC LC.");
                                }
                                this.zzc.zzl(5);
                                int zzd6 = this.zzc.zzd(3);
                                int i21 = this.zzo;
                                int i22 = zzys.zza;
                                byte[] bArr = {(byte) (((i21 >> 1) & 7) | 16), (byte) (((zzd6 << 3) & 120) | ((i21 << 7) & 128))};
                                zzyr zza2 = zzys.zza(bArr);
                                zzad zzadVar = new zzad();
                                zzadVar.zzH(this.zzf);
                                zzadVar.zzS(MimeTypes.AUDIO_AAC);
                                zzadVar.zzx(zza2.zzc);
                                zzadVar.zzw(zza2.zzb);
                                zzadVar.zzT(zza2.zza);
                                zzadVar.zzI(Collections.singletonList(bArr));
                                zzadVar.zzK(this.zze);
                                zzaf zzY = zzadVar.zzY();
                                this.zzr = 1024000000 / zzY.zzA;
                                this.zzg.zzk(zzY);
                                this.zzq = true;
                            }
                            this.zzc.zzl(4);
                            int zzd7 = this.zzc.zzd(13) - 7;
                            if (this.zzl) {
                                zzd7 -= 2;
                            }
                            i = zzd7;
                            zzabbVar = this.zzg;
                            j = this.zzr;
                            i2 = 0;
                            zzj(zzabbVar, j, i2, i);
                        }
                    }
                } else if (zzk(zzenVar, this.zzd.zzH(), 10)) {
                    this.zzh.zzq(this.zzd, 10);
                    this.zzd.zzF(6);
                    zzabbVar = this.zzh;
                    j = 0;
                    i = 10 + this.zzd.zzj();
                    i2 = 10;
                    zzj(zzabbVar, j, i2, i);
                }
            } else if (zzenVar.zza() != 0) {
                zzem zzemVar = this.zzc;
                zzemVar.zza[0] = zzenVar.zzH()[zzenVar.zzc()];
                zzemVar.zzj(2);
                int zzd8 = this.zzc.zzd(4);
                int i23 = this.zzo;
                if (i23 == -1 || zzd8 == i23) {
                    if (!this.zzm) {
                        this.zzm = true;
                        this.zzn = this.zzp;
                        this.zzo = zzd8;
                    }
                    zzi();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzzx zzzxVar, zzaiz zzaizVar) {
        zzaizVar.zzc();
        this.zzf = zzaizVar.zzb();
        zzabb zzv = zzzxVar.zzv(zzaizVar.zza(), 1);
        this.zzg = zzv;
        this.zzu = zzv;
        if (!this.zzb) {
            this.zzh = new zzzt();
            return;
        }
        zzaizVar.zzc();
        zzabb zzv2 = zzzxVar.zzv(zzaizVar.zza(), 5);
        this.zzh = zzv2;
        zzad zzadVar = new zzad();
        zzadVar.zzH(zzaizVar.zzb());
        zzadVar.zzS(MimeTypes.APPLICATION_ID3);
        zzv2.zzk(zzadVar.zzY());
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzd(long j, int i) {
        if (j != C.TIME_UNSET) {
            this.zzt = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zze() {
        this.zzt = C.TIME_UNSET;
        zzg();
    }
}
