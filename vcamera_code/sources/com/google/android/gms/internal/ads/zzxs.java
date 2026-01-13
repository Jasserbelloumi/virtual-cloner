package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.mp3.IndexSeeker;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.List;
import o00oOooO.o0O00O0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import org.videolan.libvlc.MediaDiscoverer;
/* loaded from: classes2.dex */
public final class zzxs extends zzra {
    private static final int[] zzb = {1920, 1600, 1440, MediaDiscoverer.Event.Started, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private long zzA;
    private long zzB;
    private int zzC;
    private zzda zzD;
    @o0OO00OO
    private zzda zzE;
    private int zzF;
    @o0OO00OO
    private zzxw zzG;
    private final Context zze;
    private final zzyd zzf;
    private final zzyo zzg;
    private final zzxr zzh;
    private final boolean zzi;
    private zzxq zzj;
    private boolean zzk;
    private boolean zzl;
    @o0OO00OO
    private Surface zzm;
    @o0OO00OO
    private zzxv zzn;
    private boolean zzo;
    private int zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private long zzz;

    public zzxs(Context context, zzqt zzqtVar, zzrc zzrcVar, long j, boolean z, @o0OO00OO Handler handler, @o0OO00OO zzyp zzypVar, int i, float f) {
        super(2, zzqtVar, zzrcVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        zzyd zzydVar = new zzyd(applicationContext);
        this.zzf = zzydVar;
        this.zzg = new zzyo(handler, zzypVar);
        this.zzh = new zzxr(zzydVar, this);
        this.zzi = "NVIDIA".equals(zzew.zzc);
        this.zzu = C.TIME_UNSET;
        this.zzp = 1;
        this.zzD = zzda.zza;
        this.zzF = 0;
        this.zzE = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
        if (r3.equals(com.google.android.exoplayer2.util.MimeTypes.VIDEO_AV1) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzT(com.google.android.gms.internal.ads.zzqx r10, com.google.android.gms.internal.ads.zzaf r11) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxs.zzT(com.google.android.gms.internal.ads.zzqx, com.google.android.gms.internal.ads.zzaf):int");
    }

    public static int zzU(zzqx zzqxVar, zzaf zzafVar) {
        if (zzafVar.zzn != -1) {
            int size = zzafVar.zzo.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += ((byte[]) zzafVar.zzo.get(i2)).length;
            }
            return zzafVar.zzn + i;
        }
        return zzT(zzqxVar, zzafVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x04bf, code lost:
        if (r0.equals("deb") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x079d, code lost:
        if (r10 != 0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean zzaD(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxs.zzaD(java.lang.String):boolean");
    }

    private static List zzaE(Context context, zzrc zzrcVar, zzaf zzafVar, boolean z, boolean z2) throws zzrj {
        String str = zzafVar.zzm;
        if (str == null) {
            return zzfqk.zzo();
        }
        List zzf = zzrp.zzf(str, z, z2);
        String zze = zzrp.zze(zzafVar);
        if (zze == null) {
            return zzfqk.zzm(zzf);
        }
        List zzf2 = zzrp.zzf(zze, z, z2);
        if (zzew.zza < 26 || !MimeTypes.VIDEO_DOLBY_VISION.equals(zzafVar.zzm) || zzf2.isEmpty() || zzxp.zza(context)) {
            zzfqh zzi = zzfqk.zzi();
            zzi.zzh(zzf);
            zzi.zzh(zzf2);
            return zzi.zzi();
        }
        return zzfqk.zzm(zzf2);
    }

    private final void zzaF(zzda zzdaVar) {
        if (zzdaVar.equals(zzda.zza) || zzdaVar.equals(this.zzE)) {
            return;
        }
        this.zzE = zzdaVar;
        this.zzg.zzt(zzdaVar);
    }

    private final void zzaG() {
        zzda zzdaVar = this.zzE;
        if (zzdaVar != null) {
            this.zzg.zzt(zzdaVar);
        }
    }

    @o0OOooO0(17)
    private final void zzaH() {
        Surface surface = this.zzm;
        zzxv zzxvVar = this.zzn;
        if (surface == zzxvVar) {
            this.zzm = null;
        }
        zzxvVar.release();
        this.zzn = null;
    }

    private static boolean zzaI(long j) {
        return j < -30000;
    }

    private final boolean zzaJ(zzqx zzqxVar) {
        return zzew.zza >= 23 && !zzaD(zzqxVar.zza) && (!zzqxVar.zzf || zzxv.zzb(this.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzha, com.google.android.gms.internal.ads.zzkn
    public final void zzD(float f, float f2) throws zzhj {
        super.zzD(f, f2);
        this.zzf.zze(f);
    }

    @Override // com.google.android.gms.internal.ads.zzkn, com.google.android.gms.internal.ads.zzko
    public final String zzK() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzkn
    public final boolean zzN() {
        zzxv zzxvVar;
        if (super.zzN() && (this.zzq || (((zzxvVar = this.zzn) != null && this.zzm == zzxvVar) || zzaj() == null))) {
            this.zzu = C.TIME_UNSET;
            return true;
        } else if (this.zzu == C.TIME_UNSET) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.zzu) {
                return true;
            }
            this.zzu = C.TIME_UNSET;
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final float zzP(float f, zzaf zzafVar, zzaf[] zzafVarArr) {
        float f2 = -1.0f;
        for (zzaf zzafVar2 : zzafVarArr) {
            float f3 = zzafVar2.zzt;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final int zzQ(zzrc zzrcVar, zzaf zzafVar) throws zzrj {
        boolean z;
        if (zzbt.zzh(zzafVar.zzm)) {
            int i = 0;
            boolean z2 = zzafVar.zzp != null;
            List zzaE = zzaE(this.zze, zzrcVar, zzafVar, z2, false);
            if (z2 && zzaE.isEmpty()) {
                zzaE = zzaE(this.zze, zzrcVar, zzafVar, false, false);
            }
            if (zzaE.isEmpty()) {
                return TsExtractor.TS_STREAM_TYPE_AC3;
            }
            if (zzra.zzaw(zzafVar)) {
                zzqx zzqxVar = (zzqx) zzaE.get(0);
                boolean zze = zzqxVar.zze(zzafVar);
                if (!zze) {
                    for (int i2 = 1; i2 < zzaE.size(); i2++) {
                        zzqx zzqxVar2 = (zzqx) zzaE.get(i2);
                        if (zzqxVar2.zze(zzafVar)) {
                            zze = true;
                            z = false;
                            zzqxVar = zzqxVar2;
                            break;
                        }
                    }
                }
                z = true;
                int i3 = true != zze ? 3 : 4;
                int i4 = true != zzqxVar.zzf(zzafVar) ? 8 : 16;
                int i5 = true != zzqxVar.zzg ? 0 : 64;
                int i6 = true != z ? 0 : 128;
                if (zzew.zza >= 26 && MimeTypes.VIDEO_DOLBY_VISION.equals(zzafVar.zzm) && !zzxp.zza(this.zze)) {
                    i6 = 256;
                }
                if (zze) {
                    List zzaE2 = zzaE(this.zze, zzrcVar, zzafVar, z2, true);
                    if (!zzaE2.isEmpty()) {
                        zzqx zzqxVar3 = (zzqx) zzrp.zzg(zzaE2, zzafVar).get(0);
                        if (zzqxVar3.zze(zzafVar) && zzqxVar3.zzf(zzafVar)) {
                            i = 32;
                        }
                    }
                }
                return i3 | i4 | i | i5 | i6;
            }
            return TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        }
        return 128;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final zzhc zzR(zzqx zzqxVar, zzaf zzafVar, zzaf zzafVar2) {
        int i;
        int i2;
        zzhc zzb2 = zzqxVar.zzb(zzafVar, zzafVar2);
        int i3 = zzb2.zze;
        int i4 = zzafVar2.zzr;
        zzxq zzxqVar = this.zzj;
        if (i4 > zzxqVar.zza || zzafVar2.zzs > zzxqVar.zzb) {
            i3 |= 256;
        }
        if (zzU(zzqxVar, zzafVar2) > this.zzj.zzc) {
            i3 |= 64;
        }
        String str = zzqxVar.zza;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = zzb2.zzd;
        }
        return new zzhc(str, zzafVar, zzafVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    @o0OO00OO
    public final zzhc zzS(zzjo zzjoVar) throws zzhj {
        zzhc zzS = super.zzS(zzjoVar);
        this.zzg.zzf(zzjoVar.zza, zzS);
        return zzS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x010f, code lost:
        if (true == r12) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0111, code lost:
        r13 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0113, code lost:
        r13 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0114, code lost:
        if (true == r12) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0116, code lost:
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011a, code lost:
        r3 = new android.graphics.Point(r13, r4);
     */
    @Override // com.google.android.gms.internal.ads.zzra
    @android.annotation.TargetApi(17)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzqs zzV(com.google.android.gms.internal.ads.zzqx r20, com.google.android.gms.internal.ads.zzaf r21, @o00oOooO.o0OO00OO android.media.MediaCrypto r22, float r23) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxs.zzV(com.google.android.gms.internal.ads.zzqx, com.google.android.gms.internal.ads.zzaf, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzqs");
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final List zzW(zzrc zzrcVar, zzaf zzafVar, boolean z) throws zzrj {
        return zzrp.zzg(zzaE(this.zze, zzrcVar, zzafVar, false, false), zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final void zzX(Exception exc) {
        zzee.zzc("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final void zzY(String str, zzqs zzqsVar, long j, long j2) {
        this.zzg.zza(str, j, j2);
        this.zzk = zzaD(str);
        zzqx zzal = zzal();
        zzal.getClass();
        boolean z = false;
        if (zzew.zza >= 29 && MimeTypes.VIDEO_VP9.equals(zzal.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzh = zzal.zzh();
            int length = zzh.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (zzh[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.zzl = z;
        this.zzh.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final void zzZ(String str) {
        this.zzg.zzb(str);
    }

    public final void zzaA(zzqu zzquVar, int i, long j) {
        int i2 = zzew.zza;
        Trace.beginSection("skipVideoBuffer");
        zzquVar.zzn(i, false);
        Trace.endSection();
        ((zzra) this).zza.zzf++;
    }

    public final void zzaB(int i, int i2) {
        zzhb zzhbVar = ((zzra) this).zza;
        zzhbVar.zzh += i;
        int i3 = i + i2;
        zzhbVar.zzg += i3;
        this.zzw += i3;
        int i4 = this.zzx + i3;
        this.zzx = i4;
        zzhbVar.zzi = Math.max(i4, zzhbVar.zzi);
    }

    public final void zzaC(long j) {
        zzhb zzhbVar = ((zzra) this).zza;
        zzhbVar.zzk += j;
        zzhbVar.zzl++;
        this.zzB += j;
        this.zzC++;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final void zzaa(zzaf zzafVar, @o0OO00OO MediaFormat mediaFormat) {
        zzqu zzaj = zzaj();
        if (zzaj != null) {
            zzaj.zzq(this.zzp);
        }
        mediaFormat.getClass();
        int i = 0;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = zzafVar.zzv;
        if (zzew.zza >= 21) {
            int i2 = zzafVar.zzu;
            if (i2 == 90 || i2 == 270) {
                f = 1.0f / f;
                int i3 = integer2;
                integer2 = integer;
                integer = i3;
            }
        } else {
            i = zzafVar.zzu;
        }
        this.zzD = new zzda(integer, integer2, i, f);
        this.zzf.zzc(zzafVar.zzt);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final void zzac() {
        this.zzq = false;
        int i = zzew.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    @o0O00O0
    public final void zzad(zzgr zzgrVar) throws zzhj {
        this.zzy++;
        int i = zzew.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final boolean zzaf(long j, long j2, @o0OO00OO zzqu zzquVar, @o0OO00OO ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzaf zzafVar) throws zzhj {
        boolean z3;
        int zzd2;
        zzquVar.getClass();
        if (this.zzt == C.TIME_UNSET) {
            this.zzt = j;
        }
        if (j3 != this.zzz) {
            this.zzf.zzd(j3);
            this.zzz = j3;
        }
        long zzai = zzai();
        long j4 = j3 - zzai;
        if (z && !z2) {
            zzaA(zzquVar, i, j4);
            return true;
        }
        boolean z4 = zzbc() == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long zzah = (long) ((j3 - j) / zzah());
        if (z4) {
            zzah -= elapsedRealtime - j2;
        }
        if (this.zzm == this.zzn) {
            if (zzaI(zzah)) {
                zzaA(zzquVar, i, j4);
                zzaC(zzah);
                return true;
            }
            return false;
        }
        long j5 = elapsedRealtime - this.zzA;
        boolean z5 = this.zzs ? !this.zzq : z4 || this.zzr;
        if (this.zzu == C.TIME_UNSET && j >= zzai && (z5 || (z4 && zzaI(zzah) && j5 > IndexSeeker.MIN_TIME_BETWEEN_POINTS_US))) {
            long nanoTime = System.nanoTime();
            if (zzew.zza >= 21) {
                zzaz(zzquVar, i, j4, nanoTime);
            } else {
                zzay(zzquVar, i, j4);
            }
            zzaC(zzah);
            return true;
        } else if (!z4 || j == this.zzt) {
            return false;
        } else {
            long nanoTime2 = System.nanoTime();
            long zza = this.zzf.zza((zzah * 1000) + nanoTime2);
            long j6 = (zza - nanoTime2) / 1000;
            long j7 = this.zzu;
            if (j6 < -500000 && !z2 && (zzd2 = zzd(j)) != 0) {
                if (j7 != C.TIME_UNSET) {
                    zzhb zzhbVar = ((zzra) this).zza;
                    zzhbVar.zzd += zzd2;
                    zzhbVar.zzf += this.zzy;
                } else {
                    ((zzra) this).zza.zzj++;
                    zzaB(zzd2, this.zzy);
                }
                zzat();
                return false;
            } else if (zzaI(j6) && !z2) {
                if (j7 != C.TIME_UNSET) {
                    zzaA(zzquVar, i, j4);
                    z3 = true;
                } else {
                    int i4 = zzew.zza;
                    Trace.beginSection("dropVideoBuffer");
                    zzquVar.zzn(i, false);
                    Trace.endSection();
                    z3 = true;
                    zzaB(0, 1);
                }
                zzaC(j6);
                return z3;
            } else if (zzew.zza >= 21) {
                if (j6 < 50000) {
                    zzaz(zzquVar, i, j4, zza);
                    zzaC(j6);
                    return true;
                }
                return false;
            } else if (j6 < 30000) {
                if (j6 > 11000) {
                    try {
                        Thread.sleep(((-10000) + j6) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                zzay(zzquVar, i, j4);
                zzaC(j6);
                return true;
            } else {
                return false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final zzqv zzak(Throwable th, @o0OO00OO zzqx zzqxVar) {
        return new zzxo(th, zzqxVar, this.zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    @TargetApi(29)
    public final void zzam(zzgr zzgrVar) throws zzhj {
        if (this.zzl) {
            ByteBuffer byteBuffer = zzgrVar.zze;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzqu zzaj = zzaj();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzaj.zzp(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzra
    @o0O00O0
    public final void zzao(long j) {
        super.zzao(j);
        this.zzy--;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    @o0O00O0
    public final void zzap(zzaf zzafVar) throws zzhj {
        this.zzh.zzb(zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    @o0O00O0
    public final void zzar() {
        super.zzar();
        this.zzy = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final boolean zzav(zzqx zzqxVar) {
        return this.zzm != null || zzaJ(zzqxVar);
    }

    public final void zzax() {
        this.zzs = true;
        if (this.zzq) {
            return;
        }
        this.zzq = true;
        this.zzg.zzq(this.zzm);
        this.zzo = true;
    }

    public final void zzay(zzqu zzquVar, int i, long j) {
        zzaF(this.zzD);
        int i2 = zzew.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzquVar.zzn(i, true);
        Trace.endSection();
        this.zzA = SystemClock.elapsedRealtime() * 1000;
        ((zzra) this).zza.zze++;
        this.zzx = 0;
        zzax();
    }

    @o0OOooO0(21)
    public final void zzaz(zzqu zzquVar, int i, long j, long j2) {
        zzaF(this.zzD);
        int i2 = zzew.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzquVar.zzm(i, j2);
        Trace.endSection();
        this.zzA = SystemClock.elapsedRealtime() * 1000;
        ((zzra) this).zza.zze++;
        this.zzx = 0;
        zzax();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.zzha, com.google.android.gms.internal.ads.zzkj
    public final void zzp(int i, @o0OO00OO Object obj) throws zzhj {
        if (i != 1) {
            if (i == 7) {
                this.zzG = (zzxw) obj;
                return;
            } else if (i == 10) {
                int intValue = ((Integer) obj).intValue();
                if (this.zzF != intValue) {
                    this.zzF = intValue;
                    return;
                }
                return;
            } else if (i == 13) {
                obj.getClass();
                zzeo zzeoVar = (zzeo) obj;
                return;
            } else if (i != 4) {
                if (i != 5) {
                    return;
                }
                this.zzf.zzj(((Integer) obj).intValue());
                return;
            } else {
                int intValue2 = ((Integer) obj).intValue();
                this.zzp = intValue2;
                zzqu zzaj = zzaj();
                if (zzaj != null) {
                    zzaj.zzq(intValue2);
                    return;
                }
                return;
            }
        }
        zzxv zzxvVar = obj instanceof Surface ? (Surface) obj : null;
        if (zzxvVar == null) {
            zzxv zzxvVar2 = this.zzn;
            if (zzxvVar2 != null) {
                zzxvVar = zzxvVar2;
            } else {
                zzqx zzal = zzal();
                if (zzal != null && zzaJ(zzal)) {
                    zzxvVar = zzxv.zza(this.zze, zzal.zzf);
                    this.zzn = zzxvVar;
                }
            }
        }
        if (this.zzm == zzxvVar) {
            if (zzxvVar == null || zzxvVar == this.zzn) {
                return;
            }
            zzaG();
            if (this.zzo) {
                this.zzg.zzq(this.zzm);
                return;
            }
            return;
        }
        this.zzm = zzxvVar;
        this.zzf.zzi(zzxvVar);
        this.zzo = false;
        int zzbc = zzbc();
        zzqu zzaj2 = zzaj();
        if (zzaj2 != null) {
            if (zzew.zza < 23 || zzxvVar == null || this.zzk) {
                zzaq();
                zzan();
            } else {
                zzaj2.zzo(zzxvVar);
            }
        }
        if (zzxvVar == null || zzxvVar == this.zzn) {
            this.zzE = null;
            this.zzq = false;
            int i2 = zzew.zza;
            return;
        }
        zzaG();
        this.zzq = false;
        int i3 = zzew.zza;
        if (zzbc == 2) {
            this.zzu = C.TIME_UNSET;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzha
    public final void zzs() {
        this.zzE = null;
        this.zzq = false;
        int i = zzew.zza;
        this.zzo = false;
        try {
            super.zzs();
        } finally {
            this.zzg.zzc(((zzra) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzha
    public final void zzt(boolean z, boolean z2) throws zzhj {
        super.zzt(z, z2);
        zzk();
        this.zzg.zze(((zzra) this).zza);
        this.zzr = z2;
        this.zzs = false;
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzha
    public final void zzu(long j, boolean z) throws zzhj {
        super.zzu(j, z);
        this.zzq = false;
        int i = zzew.zza;
        this.zzf.zzf();
        this.zzz = C.TIME_UNSET;
        this.zzt = C.TIME_UNSET;
        this.zzx = 0;
        this.zzu = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzha
    @TargetApi(17)
    public final void zzv() {
        try {
            super.zzv();
            if (this.zzn != null) {
                zzaH();
            }
        } catch (Throwable th) {
            if (this.zzn != null) {
                zzaH();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzha
    public final void zzw() {
        this.zzw = 0;
        this.zzv = SystemClock.elapsedRealtime();
        this.zzA = SystemClock.elapsedRealtime() * 1000;
        this.zzB = 0L;
        this.zzC = 0;
        this.zzf.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzha
    public final void zzx() {
        this.zzu = C.TIME_UNSET;
        if (this.zzw > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzw, elapsedRealtime - this.zzv);
            this.zzw = 0;
            this.zzv = elapsedRealtime;
        }
        int i = this.zzC;
        if (i != 0) {
            this.zzg.zzr(this.zzB, i);
            this.zzB = 0L;
            this.zzC = 0;
        }
        this.zzf.zzh();
    }
}
