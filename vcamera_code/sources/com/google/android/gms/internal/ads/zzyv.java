package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import o00oOooO.o0OO00OO;
import o0O0oooo.o0OO0oO;
import org.videolan.libvlc.MediaPlayer;
/* loaded from: classes2.dex */
public final class zzyv {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {OpusUtil.SAMPLE_RATE, 44100, 32000};
    private static final int[] zzd = {24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, o0OO0oO.f12884o00ooooo, MediaPlayer.Event.ESSelected, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b = bArr[4];
            return zzf((b & 192) >> 6, b & 63);
        }
        int i = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
        return i + i;
    }

    public static zzaf zzc(zzen zzenVar, String str, String str2, @o0OO00OO zzx zzxVar) {
        zzem zzemVar = new zzem();
        zzemVar.zzh(zzenVar);
        int i = zzc[zzemVar.zzd(2)];
        zzemVar.zzl(8);
        int i2 = zze[zzemVar.zzd(3)];
        if (zzemVar.zzd(1) != 0) {
            i2++;
        }
        int i3 = zzf[zzemVar.zzd(5)] * 1000;
        zzemVar.zze();
        zzenVar.zzF(zzemVar.zzb());
        zzad zzadVar = new zzad();
        zzadVar.zzH(str);
        zzadVar.zzS(MimeTypes.AUDIO_AC3);
        zzadVar.zzw(i2);
        zzadVar.zzT(i);
        zzadVar.zzB(zzxVar);
        zzadVar.zzK(str2);
        zzadVar.zzv(i3);
        zzadVar.zzO(i3);
        return zzadVar.zzY();
    }

    public static zzaf zzd(zzen zzenVar, String str, String str2, @o0OO00OO zzx zzxVar) {
        String str3;
        zzem zzemVar = new zzem();
        zzemVar.zzh(zzenVar);
        int zzd2 = zzemVar.zzd(13) * 1000;
        zzemVar.zzl(3);
        int i = zzc[zzemVar.zzd(2)];
        zzemVar.zzl(10);
        int i2 = zze[zzemVar.zzd(3)];
        if (zzemVar.zzd(1) != 0) {
            i2++;
        }
        zzemVar.zzl(3);
        int zzd3 = zzemVar.zzd(4);
        zzemVar.zzl(1);
        if (zzd3 > 0) {
            zzemVar.zzm(6);
            if (zzemVar.zzd(1) != 0) {
                i2 += 2;
            }
            zzemVar.zzl(1);
        }
        if (zzemVar.zza() > 7) {
            zzemVar.zzl(7);
            if (zzemVar.zzd(1) != 0) {
                str3 = MimeTypes.AUDIO_E_AC3_JOC;
                zzemVar.zze();
                zzenVar.zzF(zzemVar.zzb());
                zzad zzadVar = new zzad();
                zzadVar.zzH(str);
                zzadVar.zzS(str3);
                zzadVar.zzw(i2);
                zzadVar.zzT(i);
                zzadVar.zzB(zzxVar);
                zzadVar.zzK(str2);
                zzadVar.zzO(zzd2);
                return zzadVar.zzY();
            }
        }
        str3 = MimeTypes.AUDIO_E_AC3;
        zzemVar.zze();
        zzenVar.zzF(zzemVar.zzb());
        zzad zzadVar2 = new zzad();
        zzadVar2.zzH(str);
        zzadVar2.zzS(str3);
        zzadVar2.zzw(i2);
        zzadVar2.zzT(i);
        zzadVar2.zzB(zzxVar);
        zzadVar2.zzK(str2);
        zzadVar2.zzO(zzd2);
        return zzadVar2.zzY();
    }

    public static zzyu zze(zzem zzemVar) {
        int i;
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int zzc2 = zzemVar.zzc();
        zzemVar.zzl(40);
        int zzd2 = zzemVar.zzd(5);
        zzemVar.zzj(zzc2);
        int i12 = -1;
        if (zzd2 > 10) {
            zzemVar.zzl(16);
            int zzd3 = zzemVar.zzd(2);
            if (zzd3 == 0) {
                i12 = 0;
            } else if (zzd3 == 1) {
                i12 = 1;
            } else if (zzd3 == 2) {
                i12 = 2;
            }
            zzemVar.zzl(3);
            int zzd4 = zzemVar.zzd(11) + 1;
            int zzd5 = zzemVar.zzd(2);
            if (zzd5 == 3) {
                i8 = zzd[zzemVar.zzd(2)];
                i9 = 6;
                i7 = 3;
            } else {
                int zzd6 = zzemVar.zzd(2);
                int i13 = zzb[zzd6];
                i7 = zzd6;
                i8 = zzc[zzd5];
                i9 = i13;
            }
            int i14 = zzd4 + zzd4;
            int i15 = (i14 * i8) / (i9 * 32);
            int zzd7 = zzemVar.zzd(3);
            boolean zzn = zzemVar.zzn();
            i = zze[zzd7] + (zzn ? 1 : 0);
            zzemVar.zzl(10);
            if (zzemVar.zzn()) {
                zzemVar.zzl(8);
            }
            if (zzd7 == 0) {
                zzemVar.zzl(5);
                if (zzemVar.zzn()) {
                    zzemVar.zzl(8);
                }
                i10 = 0;
                zzd7 = 0;
            } else {
                i10 = zzd7;
            }
            if (i12 == 1) {
                if (zzemVar.zzn()) {
                    zzemVar.zzl(16);
                }
                i11 = 1;
            } else {
                i11 = i12;
            }
            if (zzemVar.zzn()) {
                if (i10 > 2) {
                    zzemVar.zzl(2);
                }
                if ((i10 & 1) != 0 && i10 > 2) {
                    zzemVar.zzl(6);
                }
                if ((i10 & 4) != 0) {
                    zzemVar.zzl(6);
                }
                if (zzn && zzemVar.zzn()) {
                    zzemVar.zzl(5);
                }
                if (i11 == 0) {
                    if (zzemVar.zzn()) {
                        zzemVar.zzl(6);
                    }
                    if (i10 == 0 && zzemVar.zzn()) {
                        zzemVar.zzl(6);
                    }
                    if (zzemVar.zzn()) {
                        zzemVar.zzl(6);
                    }
                    int zzd8 = zzemVar.zzd(2);
                    if (zzd8 == 1) {
                        zzemVar.zzl(5);
                    } else if (zzd8 == 2) {
                        zzemVar.zzl(12);
                    } else if (zzd8 == 3) {
                        int zzd9 = zzemVar.zzd(5);
                        if (zzemVar.zzn()) {
                            zzemVar.zzl(5);
                            if (zzemVar.zzn()) {
                                zzemVar.zzl(4);
                            }
                            if (zzemVar.zzn()) {
                                zzemVar.zzl(4);
                            }
                            if (zzemVar.zzn()) {
                                zzemVar.zzl(4);
                            }
                            if (zzemVar.zzn()) {
                                zzemVar.zzl(4);
                            }
                            if (zzemVar.zzn()) {
                                zzemVar.zzl(4);
                            }
                            if (zzemVar.zzn()) {
                                zzemVar.zzl(4);
                            }
                            if (zzemVar.zzn()) {
                                zzemVar.zzl(4);
                            }
                            if (zzemVar.zzn()) {
                                if (zzemVar.zzn()) {
                                    zzemVar.zzl(4);
                                }
                                if (zzemVar.zzn()) {
                                    zzemVar.zzl(4);
                                }
                            }
                        }
                        if (zzemVar.zzn()) {
                            zzemVar.zzl(5);
                            if (zzemVar.zzn()) {
                                zzemVar.zzl(7);
                                if (zzemVar.zzn()) {
                                    zzemVar.zzl(8);
                                }
                            }
                        }
                        zzemVar.zzl((zzd9 + 2) * 8);
                        zzemVar.zze();
                    }
                    if (i10 < 2) {
                        if (zzemVar.zzn()) {
                            zzemVar.zzl(14);
                        }
                        if (zzd7 == 0 && zzemVar.zzn()) {
                            zzemVar.zzl(14);
                        }
                    }
                    if (zzemVar.zzn()) {
                        if (i7 == 0) {
                            zzemVar.zzl(5);
                            i11 = 0;
                            i7 = 0;
                        } else {
                            for (int i16 = 0; i16 < i9; i16++) {
                                if (zzemVar.zzn()) {
                                    zzemVar.zzl(5);
                                }
                            }
                        }
                    }
                    i11 = 0;
                }
            }
            if (zzemVar.zzn()) {
                zzemVar.zzl(5);
                if (i10 == 2) {
                    zzemVar.zzl(4);
                    i10 = 2;
                }
                if (i10 >= 6) {
                    zzemVar.zzl(2);
                }
                if (zzemVar.zzn()) {
                    zzemVar.zzl(8);
                }
                if (i10 == 0 && zzemVar.zzn()) {
                    zzemVar.zzl(8);
                }
                if (zzd5 < 3) {
                    zzemVar.zzk();
                }
            }
            if (i11 == 0 && i7 != 3) {
                zzemVar.zzk();
            }
            if (i11 == 2 && (i7 == 3 || zzemVar.zzn())) {
                zzemVar.zzl(6);
            }
            str = (zzemVar.zzn() && zzemVar.zzd(6) == 1 && zzemVar.zzd(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
            i2 = i12;
            i4 = i14;
            i5 = i8;
            i6 = i9 * 256;
            i3 = i15;
        } else {
            zzemVar.zzl(32);
            int zzd10 = zzemVar.zzd(2);
            String str2 = zzd10 == 3 ? null : MimeTypes.AUDIO_AC3;
            int zzd11 = zzemVar.zzd(6);
            int i17 = zzf[zzd11 / 2] * 1000;
            int zzf2 = zzf(zzd10, zzd11);
            zzemVar.zzl(8);
            int zzd12 = zzemVar.zzd(3);
            if ((zzd12 & 1) != 0 && zzd12 != 1) {
                zzemVar.zzl(2);
            }
            if ((zzd12 & 4) != 0) {
                zzemVar.zzl(2);
            }
            if (zzd12 == 2) {
                zzemVar.zzl(2);
            }
            int i18 = zzd10 < 3 ? zzc[zzd10] : -1;
            i = zze[zzd12] + (zzemVar.zzn() ? 1 : 0);
            str = str2;
            i2 = -1;
            i3 = i17;
            i4 = zzf2;
            i5 = i18;
            i6 = 1536;
        }
        return new zzyu(str, i2, i, i5, i4, i6, i3, null);
    }

    private static int zzf(int i, int i2) {
        int i3;
        if (i < 0 || i >= 3 || i2 < 0 || (i3 = i2 >> 1) >= 19) {
            return -1;
        }
        int i4 = zzc[i];
        if (i4 == 44100) {
            int i5 = zzg[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = zzf[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
