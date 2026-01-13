package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.fragment.app.o0O00;
import androidx.recyclerview.widget.o00oo0O0;
import com.google.android.exoplayer2.util.MimeTypes;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0o0000;
import o0O00Oo.o0oO0Ooo;
import o0ooOoOO.oO0OoOO0;
/* loaded from: classes2.dex */
public final class zzqx {
    public final String zza;
    public final String zzb;
    public final String zzc;
    @o0OO00OO
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    private final boolean zzh;

    @o0o0000
    public zzqx(String str, String str2, String str3, @o0OO00OO MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z4;
        this.zzf = z6;
        this.zzh = zzbt.zzh(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        if ("Nexus 10".equals(r3) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzqx zzc(java.lang.String r12, java.lang.String r13, java.lang.String r14, @o00oOooO.o0OO00OO android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.google.android.gms.internal.ads.zzqx r11 = new com.google.android.gms.internal.ads.zzqx
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L3b
            int r3 = com.google.android.gms.internal.ads.zzew.zza
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L3b
            r5 = 22
            if (r3 > r5) goto L39
            java.lang.String r3 = com.google.android.gms.internal.ads.zzew.zzd
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L28
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L39
        L28:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L3b
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L39
            goto L3b
        L39:
            r8 = r0
            goto L3c
        L3b:
            r8 = r2
        L3c:
            r3 = 21
            if (r4 == 0) goto L4e
            int r5 = com.google.android.gms.internal.ads.zzew.zza
            if (r5 < r3) goto L4e
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L4e
            r9 = r0
            goto L4f
        L4e:
            r9 = r2
        L4f:
            if (r20 != 0) goto L62
            if (r4 == 0) goto L60
            int r5 = com.google.android.gms.internal.ads.zzew.zza
            if (r5 < r3) goto L60
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L60
            goto L62
        L60:
            r10 = r2
            goto L63
        L62:
            r10 = r0
        L63:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqx.zzc(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzqx");
    }

    @o0OOooO0(21)
    private static Point zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(zzew.zze(i, widthAlignment) * widthAlignment, zzew.zze(i2, heightAlignment) * heightAlignment);
    }

    private final void zzj(String str) {
        String str2 = this.zza;
        String str3 = this.zzb;
        String str4 = zzew.zze;
        StringBuilder o00oOOo02 = oO0OoOO0.o00oOOo0("NoSupport [", str, "] [", str2, ", ");
        o00oOOo02.append(str3);
        o00oOOo02.append("] [");
        o00oOOo02.append(str4);
        o00oOOo02.append("]");
        zzee.zza(com.google.android.exoplayer2.mediacodec.MediaCodecInfo.TAG, o00oOOo02.toString());
    }

    @o0OOooO0(21)
    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point zzi = zzi(videoCapabilities, i, i2);
        int i3 = zzi.x;
        int i4 = zzi.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    private final boolean zzl(zzaf zzafVar, boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair zzb = zzrp.zzb(zzafVar);
        if (zzb == null) {
            return true;
        }
        int intValue = ((Integer) zzb.first).intValue();
        int intValue2 = ((Integer) zzb.second).intValue();
        int i = 8;
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(zzafVar.zzm)) {
            if (MimeTypes.VIDEO_H264.equals(this.zzb)) {
                intValue = 8;
            } else if (MimeTypes.VIDEO_H265.equals(this.zzb)) {
                intValue = 2;
            }
            intValue2 = 0;
        }
        if (this.zzh || intValue == 42) {
            MediaCodecInfo.CodecProfileLevel[] zzh = zzh();
            if (zzew.zza <= 23 && MimeTypes.VIDEO_VP9.equals(this.zzb) && zzh.length == 0) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                if (intValue3 >= 180000000) {
                    i = 1024;
                } else if (intValue3 >= 120000000) {
                    i = 512;
                } else if (intValue3 >= 60000000) {
                    i = 256;
                } else if (intValue3 >= 30000000) {
                    i = 128;
                } else if (intValue3 >= 18000000) {
                    i = 64;
                } else if (intValue3 >= 12000000) {
                    i = 32;
                } else if (intValue3 >= 7200000) {
                    i = 16;
                } else if (intValue3 < 3600000) {
                    i = intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                codecProfileLevel.profile = 1;
                codecProfileLevel.level = i;
                zzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : zzh) {
                if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z)) {
                    if (MimeTypes.VIDEO_H265.equals(this.zzb) && intValue == 2) {
                        String str = zzew.zzb;
                        if (!"sailfish".equals(str) && !"marlin".equals(str)) {
                        }
                    }
                    return true;
                }
            }
            zzj(o0O00.o00oOOo0("codec.profileLevel, ", zzafVar.zzj, ", ", this.zzc));
            return false;
        }
        return true;
    }

    private final boolean zzm(zzaf zzafVar) {
        return this.zzb.equals(zzafVar.zzm) || this.zzb.equals(zzrp.zze(zzafVar));
    }

    public final String toString() {
        return this.zza;
    }

    @o0OOooO0(21)
    @o0OO00OO
    public final Point zza(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzi(videoCapabilities, i, i2);
    }

    public final zzhc zzb(zzaf zzafVar, zzaf zzafVar2) {
        int i = true != zzew.zzU(zzafVar.zzm, zzafVar2.zzm) ? 8 : 0;
        if (this.zzh) {
            if (zzafVar.zzu != zzafVar2.zzu) {
                i |= 1024;
            }
            if (!this.zze && (zzafVar.zzr != zzafVar2.zzr || zzafVar.zzs != zzafVar2.zzs)) {
                i |= 512;
            }
            if (!zzew.zzU(zzafVar.zzy, zzafVar2.zzy)) {
                i |= 2048;
            }
            String str = this.zza;
            if (zzew.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzafVar.zze(zzafVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzhc(this.zza, zzafVar, zzafVar2, true != zzafVar.zze(zzafVar2) ? 2 : 3, 0);
            }
        } else {
            if (zzafVar.zzz != zzafVar2.zzz) {
                i |= 4096;
            }
            if (zzafVar.zzA != zzafVar2.zzA) {
                i |= 8192;
            }
            if (zzafVar.zzB != zzafVar2.zzB) {
                i |= 16384;
            }
            if (i == 0 && MimeTypes.AUDIO_AAC.equals(this.zzb)) {
                Pair zzb = zzrp.zzb(zzafVar);
                Pair zzb2 = zzrp.zzb(zzafVar2);
                if (zzb != null && zzb2 != null) {
                    int intValue = ((Integer) zzb.first).intValue();
                    int intValue2 = ((Integer) zzb2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzhc(this.zza, zzafVar, zzafVar2, 3, 0);
                    }
                }
            }
            if (!zzafVar.zze(zzafVar2)) {
                i |= 32;
            }
            if (MimeTypes.AUDIO_OPUS.equals(this.zzb)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzhc(this.zza, zzafVar, zzafVar2, 1, 0);
            }
        }
        return new zzhc(this.zza, zzafVar, zzafVar2, 0, i);
    }

    public final boolean zzd(zzaf zzafVar) {
        return zzm(zzafVar) && zzl(zzafVar, false);
    }

    public final boolean zze(zzaf zzafVar) throws zzrj {
        String o00oOOo02;
        String o00oOOo03;
        int i;
        if (zzm(zzafVar) && zzl(zzafVar, true)) {
            if (this.zzh) {
                int i2 = zzafVar.zzr;
                if (i2 <= 0 || (i = zzafVar.zzs) <= 0) {
                    return true;
                }
                if (zzew.zza >= 21) {
                    return zzg(i2, i, zzafVar.zzt);
                }
                boolean z = i2 * i <= zzrp.zza();
                if (!z) {
                    zzj(o0oO0Ooo.o00oOOo0("legacyFrameSize, ", zzafVar.zzr, "x", zzafVar.zzs));
                }
                return z;
            }
            int i3 = zzew.zza;
            if (i3 >= 21) {
                int i4 = zzafVar.zzA;
                if (i4 != -1) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                    if (codecCapabilities == null) {
                        o00oOOo03 = "sampleRate.caps";
                    } else {
                        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                        if (audioCapabilities == null) {
                            o00oOOo03 = "sampleRate.aCaps";
                        } else if (!audioCapabilities.isSampleRateSupported(i4)) {
                            o00oOOo03 = android.support.v4.media.o00oOOo0.o00oOOo0("sampleRate.support, ", i4);
                        }
                    }
                    zzj(o00oOOo03);
                    return false;
                }
                int i5 = zzafVar.zzz;
                if (i5 != -1) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
                    if (codecCapabilities2 == null) {
                        o00oOOo02 = "channelCount.caps";
                    } else {
                        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                        if (audioCapabilities2 == null) {
                            o00oOOo02 = "channelCount.aCaps";
                        } else {
                            String str = this.zza;
                            String str2 = this.zzb;
                            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                            if (maxInputChannelCount <= 1 && ((i3 < 26 || maxInputChannelCount <= 0) && !MimeTypes.AUDIO_MPEG.equals(str2) && !MimeTypes.AUDIO_AMR_NB.equals(str2) && !MimeTypes.AUDIO_AMR_WB.equals(str2) && !MimeTypes.AUDIO_AAC.equals(str2) && !MimeTypes.AUDIO_VORBIS.equals(str2) && !MimeTypes.AUDIO_OPUS.equals(str2) && !MimeTypes.AUDIO_RAW.equals(str2) && !MimeTypes.AUDIO_FLAC.equals(str2) && !MimeTypes.AUDIO_ALAW.equals(str2) && !MimeTypes.AUDIO_MLAW.equals(str2) && !MimeTypes.AUDIO_MSGSM.equals(str2))) {
                                int i6 = MimeTypes.AUDIO_AC3.equals(str2) ? 6 : MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
                                zzee.zze(com.google.android.exoplayer2.mediacodec.MediaCodecInfo.TAG, "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i6 + "]");
                                maxInputChannelCount = i6;
                            }
                            if (maxInputChannelCount < i5) {
                                o00oOOo02 = android.support.v4.media.o00oOOo0.o00oOOo0("channelCount.support, ", i5);
                            }
                        }
                    }
                    zzj(o00oOOo02);
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean zzf(zzaf zzafVar) {
        if (this.zzh) {
            return this.zze;
        }
        Pair zzb = zzrp.zzb(zzafVar);
        return zzb != null && ((Integer) zzb.first).intValue() == 42;
    }

    @o0OOooO0(21)
    public final boolean zzg(int i, int i2, double d) {
        StringBuilder sb;
        String str;
        String sb2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            sb2 = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities != null) {
                if (zzew.zza >= 29) {
                    int zza = zzqw.zza(videoCapabilities, i, i2, d);
                    if (zza == 2) {
                        return true;
                    }
                    if (zza == 1) {
                        sb = new StringBuilder();
                        str = "sizeAndRate.cover, ";
                        sb.append(str);
                        sb.append(i);
                        sb.append("x");
                        sb.append(i2);
                        sb.append("@");
                        sb.append(d);
                        sb2 = sb.toString();
                    }
                }
                if (!zzk(videoCapabilities, i, i2, d)) {
                    if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) && "mcv5a".equals(zzew.zzb)) || !zzk(videoCapabilities, i2, i, d))) {
                        sb = new StringBuilder();
                        str = "sizeAndRate.support, ";
                        sb.append(str);
                        sb.append(i);
                        sb.append("x");
                        sb.append(i2);
                        sb.append("@");
                        sb.append(d);
                        sb2 = sb.toString();
                    } else {
                        StringBuilder o00oOOo02 = o00oo0O0.o00oOOo0("sizeAndRate.rotated, ", i, "x", i2, "@");
                        o00oOOo02.append(d);
                        String sb3 = o00oOOo02.toString();
                        String str2 = this.zza;
                        String str3 = this.zzb;
                        String str4 = zzew.zze;
                        StringBuilder o00oOOo03 = oO0OoOO0.o00oOOo0("AssumedSupport [", sb3, "] [", str2, ", ");
                        o00oOOo03.append(str3);
                        o00oOOo03.append("] [");
                        o00oOOo03.append(str4);
                        o00oOOo03.append("]");
                        zzee.zza(com.google.android.exoplayer2.mediacodec.MediaCodecInfo.TAG, o00oOOo03.toString());
                    }
                }
                return true;
            }
            sb2 = "sizeAndRate.vCaps";
        }
        zzj(sb2);
        return false;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}
