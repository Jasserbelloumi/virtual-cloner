package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.avi.AviExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
final class zzabs implements zzabk {
    public final zzfqk zza;
    private final int zzb;

    private zzabs(int i, zzfqk zzfqkVar) {
        this.zzb = i;
        this.zza = zzfqkVar;
    }

    public static zzabs zzc(int i, zzen zzenVar) {
        String concat;
        int zzi;
        StringBuilder sb;
        String str;
        String str2;
        zzfqh zzfqhVar = new zzfqh();
        int zzd = zzenVar.zzd();
        int i2 = -2;
        while (zzenVar.zza() > 8) {
            int zzg = zzenVar.zzg();
            int zzc = zzenVar.zzc() + zzenVar.zzg();
            zzenVar.zzE(zzc);
            zzabk zzabkVar = null;
            if (zzg != 1414744396) {
                switch (zzg) {
                    case AviExtractor.FOURCC_strf /* 1718776947 */:
                        if (i2 == 2) {
                            zzenVar.zzG(4);
                            int zzg2 = zzenVar.zzg();
                            int zzg3 = zzenVar.zzg();
                            zzenVar.zzG(4);
                            zzi = zzenVar.zzg();
                            switch (zzi) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = MimeTypes.VIDEO_MP4V;
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = MimeTypes.VIDEO_H264;
                                    break;
                                case 842289229:
                                    str2 = MimeTypes.VIDEO_MP42;
                                    break;
                                case 859066445:
                                    str2 = MimeTypes.VIDEO_MP43;
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = MimeTypes.VIDEO_MJPEG;
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                zzad zzadVar = new zzad();
                                zzadVar.zzX(zzg2);
                                zzadVar.zzF(zzg3);
                                zzadVar.zzS(str2);
                                zzabkVar = new zzabt(zzadVar.zzY());
                                break;
                            } else {
                                sb = new StringBuilder();
                                str = "Ignoring track with unsupported compression ";
                                sb.append(str);
                                sb.append(zzi);
                                concat = sb.toString();
                            }
                        } else if (i2 == 1) {
                            zzi = zzenVar.zzi();
                            String str3 = zzi != 1 ? zzi != 85 ? zzi != 255 ? zzi != 8192 ? zzi != 8193 ? null : MimeTypes.AUDIO_DTS : MimeTypes.AUDIO_AC3 : MimeTypes.AUDIO_AAC : MimeTypes.AUDIO_MPEG : MimeTypes.AUDIO_RAW;
                            if (str3 != null) {
                                int zzi2 = zzenVar.zzi();
                                int zzg4 = zzenVar.zzg();
                                zzenVar.zzG(6);
                                int zzn = zzew.zzn(zzenVar.zzo());
                                int zzi3 = zzenVar.zzi();
                                byte[] bArr = new byte[zzi3];
                                zzenVar.zzB(bArr, 0, zzi3);
                                zzad zzadVar2 = new zzad();
                                zzadVar2.zzS(str3);
                                zzadVar2.zzw(zzi2);
                                zzadVar2.zzT(zzg4);
                                if (MimeTypes.AUDIO_RAW.equals(str3) && zzn != 0) {
                                    zzadVar2.zzN(zzn);
                                }
                                if (MimeTypes.AUDIO_AAC.equals(str3) && zzi3 > 0) {
                                    zzadVar2.zzI(zzfqk.zzp(bArr));
                                }
                                zzabkVar = new zzabt(zzadVar2.zzY());
                                break;
                            } else {
                                sb = new StringBuilder();
                                str = "Ignoring track with unsupported format tag ";
                                sb.append(str);
                                sb.append(zzi);
                                concat = sb.toString();
                            }
                        } else {
                            concat = "Ignoring strf box for unsupported track type: ".concat(zzew.zzO(i2));
                        }
                        zzee.zze("StreamFormatChunk", concat);
                        break;
                    case AviExtractor.FOURCC_avih /* 1751742049 */:
                        zzabkVar = zzabp.zzb(zzenVar);
                        break;
                    case AviExtractor.FOURCC_strh /* 1752331379 */:
                        zzabkVar = zzabq.zzb(zzenVar);
                        break;
                    case AviExtractor.FOURCC_strn /* 1852994675 */:
                        zzabkVar = zzabu.zzb(zzenVar);
                        break;
                }
            } else {
                zzabkVar = zzc(zzenVar.zzg(), zzenVar);
            }
            if (zzabkVar != null) {
                if (zzabkVar.zza() == 1752331379) {
                    int i3 = ((zzabq) zzabkVar).zza;
                    if (i3 == 1935960438) {
                        i2 = 2;
                    } else if (i3 == 1935963489) {
                        i2 = 1;
                    } else if (i3 != 1937012852) {
                        zzee.zze("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i3))));
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                }
                zzfqhVar.zzf(zzabkVar);
            }
            zzenVar.zzF(zzc);
            zzenVar.zzE(zzd);
        }
        return new zzabs(i, zzfqhVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final int zza() {
        return this.zzb;
    }

    @o0OO00OO
    public final zzabk zzb(Class cls) {
        zzfqk zzfqkVar = this.zza;
        int size = zzfqkVar.size();
        int i = 0;
        while (i < size) {
            zzabk zzabkVar = (zzabk) zzfqkVar.get(i);
            i++;
            if (zzabkVar.getClass() == cls) {
                return zzabkVar;
            }
        }
        return null;
    }
}
