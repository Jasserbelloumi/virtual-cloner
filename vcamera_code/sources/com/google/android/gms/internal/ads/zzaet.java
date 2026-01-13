package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes2.dex */
public final class zzaet {
    public byte[] zzM;
    public zzabc zzS;
    public boolean zzT;
    public zzabb zzV;
    public int zzW;
    private int zzX;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzaba zzi;
    public byte[] zzj;
    public zzx zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = 0;
    public int zzq = -1;
    public float zzr = 0.0f;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public byte[] zzu = null;
    public int zzv = -1;
    public boolean zzw = false;
    public int zzx = -1;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = 1000;
    public int zzB = 200;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public int zzN = 1;
    public int zzO = -1;
    public int zzP = 8000;
    public long zzQ = 0;
    public long zzR = 0;
    public boolean zzU = true;
    private String zzY = "eng";

    private static Pair zzf(zzen zzenVar) throws zzbu {
        try {
            zzenVar.zzG(16);
            long zzq = zzenVar.zzq();
            if (zzq == 1482049860) {
                return new Pair(MimeTypes.VIDEO_DIVX, null);
            }
            if (zzq == 859189832) {
                return new Pair(MimeTypes.VIDEO_H263, null);
            }
            if (zzq != 826496599) {
                zzee.zze("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair(MimeTypes.VIDEO_UNKNOWN, null);
            }
            int zzc = zzenVar.zzc() + 20;
            byte[] zzH = zzenVar.zzH();
            while (true) {
                int length = zzH.length;
                if (zzc >= length - 4) {
                    throw zzbu.zza("Failed to find FourCC VC1 initialization data", null);
                }
                if (zzH[zzc] == 0 && zzH[zzc + 1] == 0 && zzH[zzc + 2] == 1 && zzH[zzc + 3] == 15) {
                    return new Pair(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(zzH, zzc, length)));
                }
                zzc++;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzbu {
        int i;
        int i2;
        try {
            if (bArr[0] == 2) {
                int i3 = 0;
                int i4 = 1;
                while (true) {
                    i = bArr[i4] & 255;
                    if (i != 255) {
                        break;
                    }
                    i4++;
                    i3 += 255;
                }
                int i5 = i3 + i;
                int i6 = i4 + 1;
                int i7 = 0;
                while (true) {
                    i2 = bArr[i6] & 255;
                    if (i2 != 255) {
                        break;
                    }
                    i6++;
                    i7 += 255;
                }
                int i8 = i6 + 1;
                int i9 = i7 + i2;
                if (bArr[i8] == 1) {
                    byte[] bArr2 = new byte[i5];
                    System.arraycopy(bArr, i8, bArr2, 0, i5);
                    int i10 = i8 + i5;
                    if (bArr[i10] == 3) {
                        int i11 = i10 + i9;
                        if (bArr[i11] == 5) {
                            int length = bArr.length - i11;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i11, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw zzbu.zza("Error parsing vorbis codec private", null);
                    }
                    throw zzbu.zza("Error parsing vorbis codec private", null);
                }
                throw zzbu.zza("Error parsing vorbis codec private", null);
            }
            throw zzbu.zza("Error parsing vorbis codec private", null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzen zzenVar) throws zzbu {
        UUID uuid;
        UUID uuid2;
        try {
            int zzi = zzenVar.zzi();
            if (zzi == 1) {
                return true;
            }
            if (zzi == 65534) {
                zzenVar.zzF(24);
                long zzr = zzenVar.zzr();
                uuid = zzaeu.zzf;
                if (zzr == uuid.getMostSignificantBits()) {
                    long zzr2 = zzenVar.zzr();
                    uuid2 = zzaeu.zzf;
                    if (zzr2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.zza("Error parsing MS/ACM codec private", null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzbu {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzbu.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0568  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(com.google.android.gms.internal.ads.zzzx r21, int r22) throws com.google.android.gms.internal.ads.zzbu {
        /*
            Method dump skipped, instructions count: 1654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaet.zze(com.google.android.gms.internal.ads.zzzx, int):void");
    }
}
