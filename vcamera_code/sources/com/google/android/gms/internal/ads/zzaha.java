package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import o00oOooO.o0OO00OO;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* loaded from: classes2.dex */
final class zzaha extends zzagy {
    @o0OO00OO
    private zzagz zza;
    private int zzb;
    private boolean zzc;
    @o0OO00OO
    private zzabg zzd;
    @o0OO00OO
    private zzabe zze;

    @Override // com.google.android.gms.internal.ads.zzagy
    public final long zza(zzen zzenVar) {
        if ((zzenVar.zzH()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzenVar.zzH()[0];
        zzagz zzagzVar = this.zza;
        zzdl.zzb(zzagzVar);
        int i = !zzagzVar.zzd[(b >> 1) & (255 >>> (8 - zzagzVar.zze))].zza ? zzagzVar.zza.zze : zzagzVar.zza.zzf;
        int i2 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzenVar.zzb() < zzenVar.zzd() + 4) {
            byte[] copyOf = Arrays.copyOf(zzenVar.zzH(), zzenVar.zzd() + 4);
            zzenVar.zzD(copyOf, copyOf.length);
        } else {
            zzenVar.zzE(zzenVar.zzd() + 4);
        }
        long j = i2;
        byte[] zzH = zzenVar.zzH();
        zzH[zzenVar.zzd() - 4] = (byte) (j & 255);
        zzH[zzenVar.zzd() - 3] = (byte) ((j >>> 8) & 255);
        zzH[zzenVar.zzd() - 2] = (byte) ((j >>> 16) & 255);
        zzH[zzenVar.zzd() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzen zzenVar, long j, zzagv zzagvVar) throws IOException {
        zzagz zzagzVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.zza != null) {
            zzagvVar.zza.getClass();
            return false;
        }
        zzabg zzabgVar = this.zzd;
        if (zzabgVar == null) {
            zzabh.zzd(1, zzenVar, false);
            int zzh = zzenVar.zzh();
            int zzk = zzenVar.zzk();
            int zzh2 = zzenVar.zzh();
            int zzg = zzenVar.zzg();
            int i6 = zzg <= 0 ? -1 : zzg;
            int zzg2 = zzenVar.zzg();
            int i7 = zzg2 <= 0 ? -1 : zzg2;
            int zzg3 = zzenVar.zzg();
            int i8 = zzg3 <= 0 ? -1 : zzg3;
            int zzk2 = zzenVar.zzk();
            this.zzd = new zzabg(zzh, zzk, zzh2, i6, i7, i8, (int) Math.pow(2.0d, zzk2 & 15), (int) Math.pow(2.0d, (zzk2 & PsExtractor.VIDEO_STREAM_MASK) >> 4), 1 == (zzenVar.zzk() & 1), Arrays.copyOf(zzenVar.zzH(), zzenVar.zzd()));
        } else {
            zzabe zzabeVar = this.zze;
            if (zzabeVar == null) {
                this.zze = zzabh.zzc(zzenVar, true, true);
            } else {
                byte[] bArr = new byte[zzenVar.zzd()];
                System.arraycopy(zzenVar.zzH(), 0, bArr, 0, zzenVar.zzd());
                int i9 = zzabgVar.zza;
                int i10 = 5;
                zzabh.zzd(5, zzenVar, false);
                int zzk3 = zzenVar.zzk() + 1;
                zzabd zzabdVar = new zzabd(zzenVar.zzH());
                zzabdVar.zzc(zzenVar.zzc() * 8);
                int i11 = 0;
                while (i11 < zzk3) {
                    if (zzabdVar.zzb(24) != 5653314) {
                        throw zzbu.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzabdVar.zza(), null);
                    }
                    int zzb = zzabdVar.zzb(16);
                    int zzb2 = zzabdVar.zzb(24);
                    long[] jArr = new long[zzb2];
                    long j2 = 0;
                    if (zzabdVar.zzd()) {
                        i3 = zzk3;
                        int zzb3 = zzabdVar.zzb(i10) + 1;
                        int i12 = 0;
                        while (i12 < zzb2) {
                            int zzb4 = zzabdVar.zzb(zzabh.zza(zzb2 - i12));
                            int i13 = 0;
                            while (i13 < zzb4 && i12 < zzb2) {
                                jArr[i12] = zzb3;
                                i12++;
                                i13++;
                                zzabeVar = zzabeVar;
                                bArr = bArr;
                            }
                            zzb3++;
                            zzabeVar = zzabeVar;
                            bArr = bArr;
                        }
                    } else {
                        boolean zzd = zzabdVar.zzd();
                        int i14 = 0;
                        while (i14 < zzb2) {
                            if (zzd) {
                                if (zzabdVar.zzd()) {
                                    i5 = zzk3;
                                    jArr[i14] = zzabdVar.zzb(i10) + 1;
                                } else {
                                    i5 = zzk3;
                                    jArr[i14] = 0;
                                }
                                i4 = 5;
                            } else {
                                i4 = i10;
                                i5 = zzk3;
                                jArr[i14] = zzabdVar.zzb(i4) + 1;
                            }
                            i14++;
                            i10 = i4;
                            zzk3 = i5;
                        }
                        i3 = zzk3;
                    }
                    zzabe zzabeVar2 = zzabeVar;
                    byte[] bArr2 = bArr;
                    int zzb5 = zzabdVar.zzb(4);
                    if (zzb5 > 2) {
                        throw zzbu.zza("lookup type greater than 2 not decodable: " + zzb5, null);
                    }
                    if (zzb5 != 1) {
                        if (zzb5 == 2) {
                            zzb5 = 2;
                        } else {
                            i11++;
                            zzabeVar = zzabeVar2;
                            zzk3 = i3;
                            bArr = bArr2;
                            i10 = 5;
                        }
                    }
                    zzabdVar.zzc(32);
                    zzabdVar.zzc(32);
                    int zzb6 = zzabdVar.zzb(4) + 1;
                    zzabdVar.zzc(1);
                    if (zzb5 != 1) {
                        j2 = zzb2 * zzb;
                    } else if (zzb != 0) {
                        j2 = (long) Math.floor(Math.pow(zzb2, 1.0d / zzb));
                    }
                    zzabdVar.zzc((int) (zzb6 * j2));
                    i11++;
                    zzabeVar = zzabeVar2;
                    zzk3 = i3;
                    bArr = bArr2;
                    i10 = 5;
                }
                zzabe zzabeVar3 = zzabeVar;
                byte[] bArr3 = bArr;
                int i15 = 6;
                int zzb7 = zzabdVar.zzb(6) + 1;
                for (int i16 = 0; i16 < zzb7; i16++) {
                    if (zzabdVar.zzb(16) != 0) {
                        throw zzbu.zza("placeholder of time domain transforms not zeroed out", null);
                    }
                }
                int i17 = 1;
                int zzb8 = zzabdVar.zzb(6) + 1;
                int i18 = 0;
                while (true) {
                    int i19 = 3;
                    if (i18 < zzb8) {
                        int zzb9 = zzabdVar.zzb(16);
                        if (zzb9 == 0) {
                            int i20 = 8;
                            zzabdVar.zzc(8);
                            zzabdVar.zzc(16);
                            zzabdVar.zzc(16);
                            zzabdVar.zzc(6);
                            zzabdVar.zzc(8);
                            int zzb10 = zzabdVar.zzb(4) + 1;
                            int i21 = 0;
                            while (i21 < zzb10) {
                                zzabdVar.zzc(i20);
                                i21++;
                                i20 = 8;
                            }
                        } else if (zzb9 != i17) {
                            throw zzbu.zza("floor type greater than 1 not decodable: " + zzb9, null);
                        } else {
                            int zzb11 = zzabdVar.zzb(5);
                            int[] iArr = new int[zzb11];
                            int i22 = -1;
                            for (int i23 = 0; i23 < zzb11; i23++) {
                                int zzb12 = zzabdVar.zzb(4);
                                iArr[i23] = zzb12;
                                if (zzb12 > i22) {
                                    i22 = zzb12;
                                }
                            }
                            int i24 = i22 + 1;
                            int[] iArr2 = new int[i24];
                            int i25 = 0;
                            while (i25 < i24) {
                                iArr2[i25] = zzabdVar.zzb(i19) + 1;
                                int zzb13 = zzabdVar.zzb(2);
                                int i26 = 8;
                                if (zzb13 > 0) {
                                    zzabdVar.zzc(8);
                                }
                                int i27 = 0;
                                for (int i28 = 1; i27 < (i28 << zzb13); i28 = 1) {
                                    zzabdVar.zzc(i26);
                                    i27++;
                                    i26 = 8;
                                }
                                i25++;
                                i19 = 3;
                            }
                            zzabdVar.zzc(2);
                            int zzb14 = zzabdVar.zzb(4);
                            int i29 = 0;
                            int i30 = 0;
                            for (int i31 = 0; i31 < zzb11; i31++) {
                                i29 += iArr2[iArr[i31]];
                                while (i30 < i29) {
                                    zzabdVar.zzc(zzb14);
                                    i30++;
                                }
                            }
                        }
                        i18++;
                        i15 = 6;
                        i17 = 1;
                    } else {
                        int i32 = 1;
                        int zzb15 = zzabdVar.zzb(i15) + 1;
                        int i33 = 0;
                        while (i33 < zzb15) {
                            if (zzabdVar.zzb(16) > 2) {
                                throw zzbu.zza("residueType greater than 2 is not decodable", null);
                            }
                            zzabdVar.zzc(24);
                            zzabdVar.zzc(24);
                            zzabdVar.zzc(24);
                            int zzb16 = zzabdVar.zzb(i15) + i32;
                            int i34 = 8;
                            zzabdVar.zzc(8);
                            int[] iArr3 = new int[zzb16];
                            for (int i35 = 0; i35 < zzb16; i35++) {
                                iArr3[i35] = ((zzabdVar.zzd() ? zzabdVar.zzb(5) : 0) * 8) + zzabdVar.zzb(3);
                            }
                            int i36 = 0;
                            while (i36 < zzb16) {
                                int i37 = 0;
                                while (i37 < i34) {
                                    if ((iArr3[i36] & (1 << i37)) != 0) {
                                        zzabdVar.zzc(i34);
                                    }
                                    i37++;
                                    i34 = 8;
                                }
                                i36++;
                                i34 = 8;
                            }
                            i33++;
                            i15 = 6;
                            i32 = 1;
                        }
                        int zzb17 = zzabdVar.zzb(i15) + 1;
                        for (int i38 = 0; i38 < zzb17; i38++) {
                            int zzb18 = zzabdVar.zzb(16);
                            if (zzb18 != 0) {
                                zzee.zzb("VorbisUtil", "mapping type other than 0 not supported: " + zzb18);
                            } else {
                                if (zzabdVar.zzd()) {
                                    i = 1;
                                    i2 = zzabdVar.zzb(4) + 1;
                                } else {
                                    i = 1;
                                    i2 = 1;
                                }
                                if (zzabdVar.zzd()) {
                                    int zzb19 = zzabdVar.zzb(8) + i;
                                    for (int i39 = 0; i39 < zzb19; i39++) {
                                        int i40 = i9 - 1;
                                        zzabdVar.zzc(zzabh.zza(i40));
                                        zzabdVar.zzc(zzabh.zza(i40));
                                    }
                                }
                                if (zzabdVar.zzb(2) != 0) {
                                    throw zzbu.zza("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (i2 > 1) {
                                    for (int i41 = 0; i41 < i9; i41++) {
                                        zzabdVar.zzc(4);
                                    }
                                }
                                for (int i42 = 0; i42 < i2; i42++) {
                                    zzabdVar.zzc(8);
                                    zzabdVar.zzc(8);
                                    zzabdVar.zzc(8);
                                }
                            }
                        }
                        int zzb20 = zzabdVar.zzb(6) + 1;
                        zzabf[] zzabfVarArr = new zzabf[zzb20];
                        for (int i43 = 0; i43 < zzb20; i43++) {
                            zzabfVarArr[i43] = new zzabf(zzabdVar.zzd(), zzabdVar.zzb(16), zzabdVar.zzb(16), zzabdVar.zzb(8));
                        }
                        if (!zzabdVar.zzd()) {
                            throw zzbu.zza("framing bit after modes not set as expected", null);
                        }
                        zzagzVar = new zzagz(zzabgVar, zzabeVar3, bArr3, zzabfVarArr, zzabh.zza(zzb20 - 1));
                    }
                }
            }
        }
        zzagzVar = null;
        this.zza = zzagzVar;
        if (zzagzVar == null) {
            return true;
        }
        zzabg zzabgVar2 = zzagzVar.zza;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzabgVar2.zzg);
        arrayList.add(zzagzVar.zzc);
        zzbq zzb21 = zzabh.zzb(zzfqk.zzn(zzagzVar.zzb.zzb));
        zzad zzadVar = new zzad();
        zzadVar.zzS(MimeTypes.AUDIO_VORBIS);
        zzadVar.zzv(zzabgVar2.zzd);
        zzadVar.zzO(zzabgVar2.zzc);
        zzadVar.zzw(zzabgVar2.zza);
        zzadVar.zzT(zzabgVar2.zzb);
        zzadVar.zzI(arrayList);
        zzadVar.zzM(zzb21);
        zzagvVar.zza = zzadVar.zzY();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    public final void zzi(long j) {
        super.zzi(j);
        this.zzc = j != 0;
        zzabg zzabgVar = this.zzd;
        this.zzb = zzabgVar != null ? zzabgVar.zze : 0;
    }
}
