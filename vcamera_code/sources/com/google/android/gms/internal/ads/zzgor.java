package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgor {
    public static int zza(byte[] bArr, int i, zzgoq zzgoqVar) throws zzgqy {
        int zzj = zzj(bArr, i, zzgoqVar);
        int i2 = zzgoqVar.zza;
        if (i2 >= 0) {
            if (i2 <= bArr.length - zzj) {
                if (i2 == 0) {
                    zzgoqVar.zzc = zzgpe.zzb;
                    return zzj;
                }
                zzgoqVar.zzc = zzgpe.zzw(bArr, zzj, i2);
                return zzj + i2;
            }
            throw zzgqy.zzj();
        }
        throw zzgqy.zzf();
    }

    public static int zzb(byte[] bArr, int i) {
        int i2 = (bArr[i + 1] & 255) << 8;
        return ((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
    }

    public static int zzc(zzgsp zzgspVar, byte[] bArr, int i, int i2, int i3, zzgoq zzgoqVar) throws IOException {
        Object zze = zzgspVar.zze();
        int zzn = zzn(zze, zzgspVar, bArr, i, i2, i3, zzgoqVar);
        zzgspVar.zzf(zze);
        zzgoqVar.zzc = zze;
        return zzn;
    }

    public static int zzd(zzgsp zzgspVar, byte[] bArr, int i, int i2, zzgoq zzgoqVar) throws IOException {
        Object zze = zzgspVar.zze();
        int zzo = zzo(zze, zzgspVar, bArr, i, i2, zzgoqVar);
        zzgspVar.zzf(zze);
        zzgoqVar.zzc = zze;
        return zzo;
    }

    public static int zze(zzgsp zzgspVar, int i, byte[] bArr, int i2, int i3, zzgqv zzgqvVar, zzgoq zzgoqVar) throws IOException {
        int zzd = zzd(zzgspVar, bArr, i2, i3, zzgoqVar);
        while (true) {
            zzgqvVar.add(zzgoqVar.zzc);
            if (zzd >= i3) {
                break;
            }
            int zzj = zzj(bArr, zzd, zzgoqVar);
            if (i != zzgoqVar.zza) {
                break;
            }
            zzd = zzd(zzgspVar, bArr, zzj, i3, zzgoqVar);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i, zzgqv zzgqvVar, zzgoq zzgoqVar) throws IOException {
        zzgqn zzgqnVar = (zzgqn) zzgqvVar;
        int zzj = zzj(bArr, i, zzgoqVar);
        int i2 = zzgoqVar.zza + zzj;
        while (zzj < i2) {
            zzj = zzj(bArr, zzj, zzgoqVar);
            zzgqnVar.zzh(zzgoqVar.zza);
        }
        if (zzj == i2) {
            return zzj;
        }
        throw zzgqy.zzj();
    }

    public static int zzg(byte[] bArr, int i, zzgoq zzgoqVar) throws zzgqy {
        int zzj = zzj(bArr, i, zzgoqVar);
        int i2 = zzgoqVar.zza;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzgoqVar.zzc = "";
                return zzj;
            }
            zzgoqVar.zzc = new String(bArr, zzj, i2, zzgqw.zzb);
            return zzj + i2;
        }
        throw zzgqy.zzf();
    }

    public static int zzh(byte[] bArr, int i, zzgoq zzgoqVar) throws zzgqy {
        int zzj = zzj(bArr, i, zzgoqVar);
        int i2 = zzgoqVar.zza;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzgoqVar.zzc = "";
                return zzj;
            }
            zzgoqVar.zzc = zzgtv.zzh(bArr, zzj, i2);
            return zzj + i2;
        }
        throw zzgqy.zzf();
    }

    public static int zzi(int i, byte[] bArr, int i2, int i3, zzgth zzgthVar, zzgoq zzgoqVar) throws zzgqy {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzm = zzm(bArr, i2, zzgoqVar);
                zzgthVar.zzj(i, Long.valueOf(zzgoqVar.zzb));
                return zzm;
            } else if (i4 == 1) {
                zzgthVar.zzj(i, Long.valueOf(zzp(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zzj = zzj(bArr, i2, zzgoqVar);
                int i5 = zzgoqVar.zza;
                if (i5 >= 0) {
                    if (i5 <= bArr.length - zzj) {
                        zzgthVar.zzj(i, i5 == 0 ? zzgpe.zzb : zzgpe.zzw(bArr, zzj, i5));
                        return zzj + i5;
                    }
                    throw zzgqy.zzj();
                }
                throw zzgqy.zzf();
            } else if (i4 != 3) {
                if (i4 == 5) {
                    zzgthVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
                    return i2 + 4;
                }
                throw zzgqy.zzc();
            } else {
                int i6 = (i & (-8)) | 4;
                zzgth zzf = zzgth.zzf();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i2, zzgoqVar);
                    int i8 = zzgoqVar.zza;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = zzj2;
                        break;
                    }
                    int zzi = zzi(i7, bArr, zzj2, i3, zzf, zzgoqVar);
                    i7 = i8;
                    i2 = zzi;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzgqy.zzg();
                }
                zzgthVar.zzj(i, zzf);
                return i2;
            }
        }
        throw zzgqy.zzc();
    }

    public static int zzj(byte[] bArr, int i, zzgoq zzgoqVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            zzgoqVar.zza = b;
            return i2;
        }
        return zzk(b, bArr, i2, zzgoqVar);
    }

    public static int zzk(int i, byte[] bArr, int i2, zzgoq zzgoqVar) {
        int i3;
        int i4;
        byte b = bArr[i2];
        int i5 = i2 + 1;
        int i6 = i & 127;
        if (b < 0) {
            int i7 = i6 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i5 + 1;
            byte b2 = bArr[i5];
            if (b2 >= 0) {
                i3 = b2 << Ascii.SO;
            } else {
                i6 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i5 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << Ascii.NAK;
                } else {
                    i7 = i6 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i5 + 1;
                    byte b4 = bArr[i5];
                    if (b4 >= 0) {
                        i3 = b4 << Ascii.FS;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                zzgoqVar.zza = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            zzgoqVar.zza = i7 | i3;
            return i8;
        }
        i4 = b << 7;
        zzgoqVar.zza = i6 | i4;
        return i5;
    }

    public static int zzl(int i, byte[] bArr, int i2, int i3, zzgqv zzgqvVar, zzgoq zzgoqVar) {
        zzgqn zzgqnVar = (zzgqn) zzgqvVar;
        int zzj = zzj(bArr, i2, zzgoqVar);
        while (true) {
            zzgqnVar.zzh(zzgoqVar.zza);
            if (zzj >= i3) {
                break;
            }
            int zzj2 = zzj(bArr, zzj, zzgoqVar);
            if (i != zzgoqVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzgoqVar);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i, zzgoq zzgoqVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzgoqVar.zzb = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= (b2 & Byte.MAX_VALUE) << i4;
            i3 = i5;
            b = b2;
        }
        zzgoqVar.zzb = j2;
        return i3;
    }

    public static int zzn(Object obj, zzgsp zzgspVar, byte[] bArr, int i, int i2, int i3, zzgoq zzgoqVar) throws IOException {
        int zzc = ((zzgrz) zzgspVar).zzc(obj, bArr, i, i2, i3, zzgoqVar);
        zzgoqVar.zzc = obj;
        return zzc;
    }

    public static int zzo(Object obj, zzgsp zzgspVar, byte[] bArr, int i, int i2, zzgoq zzgoqVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzk(i4, bArr, i3, zzgoqVar);
            i4 = zzgoqVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzgqy.zzj();
        }
        int i6 = i4 + i5;
        zzgspVar.zzi(obj, bArr, i5, i6, zzgoqVar);
        zzgoqVar.zzc = obj;
        return i6;
    }

    public static long zzp(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
