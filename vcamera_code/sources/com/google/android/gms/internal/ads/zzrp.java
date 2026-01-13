package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OoO00O;
@SuppressLint({"InlinedApi"})
/* loaded from: classes2.dex */
public final class zzrp {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    @o0O0OOOo("MediaCodecUtil.class")
    private static final HashMap zzc = new HashMap();
    private static int zzd = -1;

    public static int zza() throws zzrj {
        int i;
        int i2 = zzd;
        if (i2 == -1) {
            zzqx zzc2 = zzc(MimeTypes.VIDEO_H264, false, false);
            if (zzc2 != null) {
                int i3 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzc2.zzh()) {
                    int i4 = codecProfileLevel.level;
                    if (i4 == 1 || i4 == 2) {
                        i = 25344;
                    } else {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                continue;
                            case 64:
                                i = 202752;
                                continue;
                            case 128:
                            case 256:
                                i = 414720;
                                continue;
                            case 512:
                                i = 921600;
                                continue;
                            case 1024:
                                i = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                continue;
                            case 8192:
                                i = 2228224;
                                continue;
                            case 16384:
                                i = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                continue;
                            case 131072:
                            case 262144:
                            case 524288:
                                i = 35651584;
                                continue;
                            default:
                                i = -1;
                                continue;
                        }
                    }
                    i3 = Math.max(i, i3);
                }
                i2 = Math.max(i3, zzew.zza >= 21 ? 345600 : 172800);
            } else {
                i2 = 0;
            }
            zzd = i2;
        }
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0460, code lost:
        if (r1.equals("H150") != false) goto L226;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0293 A[Catch: NumberFormatException -> 0x02a2, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x02a2, blocks: (B:150:0x023e, B:152:0x0250, B:163:0x026c, B:178:0x0293), top: B:493:0x023e }] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x06ec A[ExcHandler: NumberFormatException -> 0x06ec] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0103  */
    @o00oOooO.o0OO00OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair zzb(com.google.android.gms.internal.ads.zzaf r17) {
        /*
            Method dump skipped, instructions count: 2210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrp.zzb(com.google.android.gms.internal.ads.zzaf):android.util.Pair");
    }

    @o0OO00OO
    public static zzqx zzc(String str, boolean z, boolean z2) throws zzrj {
        List zzf = zzf(str, false, false);
        if (zzf.isEmpty()) {
            return null;
        }
        return (zzqx) zzf.get(0);
    }

    @o0OO00OO
    public static zzqx zzd() throws zzrj {
        return zzc(MimeTypes.AUDIO_RAW, false, false);
    }

    @o0OO00OO
    public static String zze(zzaf zzafVar) {
        Pair zzb2;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(zzafVar.zzm)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if (!MimeTypes.VIDEO_DOLBY_VISION.equals(zzafVar.zzm) || (zzb2 = zzb(zzafVar)) == null) {
            return null;
        }
        int intValue = ((Integer) zzb2.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return MimeTypes.VIDEO_H265;
        }
        if (intValue == 512) {
            return MimeTypes.VIDEO_H264;
        }
        return null;
    }

    public static synchronized List zzf(String str, boolean z, boolean z2) throws zzrj {
        synchronized (zzrp.class) {
            zzrh zzrhVar = new zzrh(str, z, z2);
            HashMap hashMap = zzc;
            List list = (List) hashMap.get(zzrhVar);
            if (list != null) {
                return list;
            }
            int i = zzew.zza;
            ArrayList zzh = zzh(zzrhVar, i >= 21 ? new zzrn(z, z2) : new zzrm(null));
            if (z && zzh.isEmpty() && i >= 21 && i <= 23) {
                zzh = zzh(zzrhVar, new zzrm(null));
                if (!zzh.isEmpty()) {
                    String str2 = ((zzqx) zzh.get(0)).zza;
                    zzee.zze("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + str2);
                }
            }
            if (MimeTypes.AUDIO_RAW.equals(str)) {
                if (i < 26 && zzew.zzb.equals("R9") && zzh.size() == 1 && ((zzqx) zzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzh.add(zzqx.zzc("OMX.google.raw.decoder", MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_RAW, null, false, true, false, false, false));
                }
                zzi(zzh, new zzro() { // from class: com.google.android.gms.internal.ads.zzrf
                    @Override // com.google.android.gms.internal.ads.zzro
                    public final int zza(Object obj) {
                        int i2 = zzrp.zza;
                        String str3 = ((zzqx) obj).zza;
                        if (str3.startsWith("OMX.google") || str3.startsWith("c2.android")) {
                            return 1;
                        }
                        return (zzew.zza >= 26 || !str3.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (i < 21 && zzh.size() > 1) {
                String str3 = ((zzqx) zzh.get(0)).zza;
                if ("OMX.SEC.mp3.dec".equals(str3) || "OMX.SEC.MP3.Decoder".equals(str3) || "OMX.brcm.audio.mp3.decoder".equals(str3)) {
                    zzi(zzh, new zzro() { // from class: com.google.android.gms.internal.ads.zzrg
                        @Override // com.google.android.gms.internal.ads.zzro
                        public final int zza(Object obj) {
                            int i2 = zzrp.zza;
                            return ((zzqx) obj).zza.startsWith("OMX.google") ? 1 : 0;
                        }
                    });
                }
            }
            if (i < 32 && zzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzqx) zzh.get(0)).zza)) {
                zzh.add((zzqx) zzh.remove(0));
            }
            zzfqk zzm = zzfqk.zzm(zzh);
            hashMap.put(zzrhVar, zzm);
            return zzm;
        }
    }

    @o0OoO00O
    public static List zzg(List list, final zzaf zzafVar) {
        ArrayList arrayList = new ArrayList(list);
        zzi(arrayList, new zzro() { // from class: com.google.android.gms.internal.ads.zzrd
            @Override // com.google.android.gms.internal.ads.zzro
            public final int zza(Object obj) {
                zzaf zzafVar2 = zzaf.this;
                int i = zzrp.zza;
                return ((zzqx) obj).zzd(zzafVar2) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0238, code lost:
        if (r1.zzb == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00db, code lost:
        if ("SCV31".equals(r10) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0119, code lost:
        if (r8.startsWith("t0") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r9 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ea A[Catch: Exception -> 0x02a3, TryCatch #5 {Exception -> 0x02a3, blocks: (B:115:0x01b8, B:121:0x01cf, B:127:0x01e4, B:129:0x01ea, B:134:0x01fc, B:136:0x0204, B:146:0x0230, B:137:0x0209, B:139:0x0219, B:141:0x0221, B:130:0x01f1), top: B:195:0x01b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f1 A[Catch: Exception -> 0x02a3, TryCatch #5 {Exception -> 0x02a3, blocks: (B:115:0x01b8, B:121:0x01cf, B:127:0x01e4, B:129:0x01ea, B:134:0x01fc, B:136:0x0204, B:146:0x0230, B:137:0x0209, B:139:0x0219, B:141:0x0221, B:130:0x01f1), top: B:195:0x01b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0204 A[Catch: Exception -> 0x02a3, TryCatch #5 {Exception -> 0x02a3, blocks: (B:115:0x01b8, B:121:0x01cf, B:127:0x01e4, B:129:0x01ea, B:134:0x01fc, B:136:0x0204, B:146:0x0230, B:137:0x0209, B:139:0x0219, B:141:0x0221, B:130:0x01f1), top: B:195:0x01b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0209 A[Catch: Exception -> 0x02a3, TryCatch #5 {Exception -> 0x02a3, blocks: (B:115:0x01b8, B:121:0x01cf, B:127:0x01e4, B:129:0x01ea, B:134:0x01fc, B:136:0x0204, B:146:0x0230, B:137:0x0209, B:139:0x0219, B:141:0x0221, B:130:0x01f1), top: B:195:0x01b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b5 A[Catch: Exception -> 0x0304, TRY_ENTER, TryCatch #4 {Exception -> 0x0304, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:10:0x0035, B:14:0x0043, B:18:0x004d, B:20:0x0055, B:22:0x005d, B:24:0x0065, B:26:0x006d, B:28:0x0075, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a5, B:42:0x00ad, B:44:0x00b5, B:46:0x00bd, B:48:0x00c5, B:50:0x00cd, B:52:0x00d5, B:56:0x00e3, B:58:0x00eb, B:60:0x00f3, B:62:0x00fd, B:64:0x0105, B:66:0x010b, B:68:0x0113, B:71:0x011d, B:73:0x0125, B:77:0x0131, B:79:0x0139, B:81:0x0141, B:83:0x014a, B:172:0x02ad, B:175:0x02b5, B:177:0x02bb, B:178:0x02d5, B:179:0x02f8, B:86:0x0153, B:87:0x0156, B:89:0x015e, B:92:0x0169, B:94:0x0171, B:97:0x017c, B:99:0x0184, B:102:0x018f, B:104:0x0197, B:107:0x01a2, B:109:0x01aa), top: B:193:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0236 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02d5 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList zzh(com.google.android.gms.internal.ads.zzrh r27, com.google.android.gms.internal.ads.zzrk r28) throws com.google.android.gms.internal.ads.zzrj {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrp.zzh(com.google.android.gms.internal.ads.zzrh, com.google.android.gms.internal.ads.zzrk):java.util.ArrayList");
    }

    private static void zzi(List list, final zzro zzroVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzre
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                zzro zzroVar2 = zzro.this;
                int i = zzrp.zza;
                return zzroVar2.zza(obj2) - zzroVar2.zza(obj);
            }
        });
    }

    private static boolean zzj(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (zzew.zza >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        } else if (zzbt.zzg(str)) {
            return true;
        } else {
            String zza2 = zzfnb.zza(mediaCodecInfo.getName());
            if (zza2.startsWith("arc.")) {
                return false;
            }
            if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
                return true;
            }
            if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
                return true;
            }
            return (zza2.startsWith("omx.") || zza2.startsWith("c2.")) ? false : true;
        }
    }
}
