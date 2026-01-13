package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.List;
import o00oOooO.o0O00O0;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzpl extends zzra implements zzjq {
    private final Context zzb;
    private final zzob zzc;
    private final zzoi zzd;
    private int zze;
    private boolean zzf;
    @o0OO00OO
    private zzaf zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    @o0OO00OO
    private zzkm zzl;

    public zzpl(Context context, zzqt zzqtVar, zzrc zzrcVar, boolean z, @o0OO00OO Handler handler, @o0OO00OO zzoc zzocVar, zzoi zzoiVar) {
        super(1, zzqtVar, zzrcVar, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zzoiVar;
        this.zzc = new zzob(handler, zzocVar);
        zzoiVar.zzn(new zzpk(this, null));
    }

    private final int zzax(zzqx zzqxVar, zzaf zzafVar) {
        int i;
        if (!"OMX.google.raw.decoder".equals(zzqxVar.zza) || (i = zzew.zza) >= 24 || (i == 23 && zzew.zzY(this.zzb))) {
            return zzafVar.zzn;
        }
        return -1;
    }

    private static List zzay(zzrc zzrcVar, zzaf zzafVar, boolean z, zzoi zzoiVar) throws zzrj {
        zzqx zzd;
        String str = zzafVar.zzm;
        if (str == null) {
            return zzfqk.zzo();
        }
        if (!zzoiVar.zzw(zzafVar) || (zzd = zzrp.zzd()) == null) {
            List zzf = zzrp.zzf(str, false, false);
            String zze = zzrp.zze(zzafVar);
            if (zze == null) {
                return zzfqk.zzm(zzf);
            }
            List zzf2 = zzrp.zzf(zze, false, false);
            zzfqh zzi = zzfqk.zzi();
            zzi.zzh(zzf);
            zzi.zzh(zzf2);
            return zzi.zzi();
        }
        return zzfqk.zzp(zzd);
    }

    private final void zzaz() {
        long zzb = this.zzd.zzb(zzM());
        if (zzb != Long.MIN_VALUE) {
            if (!this.zzj) {
                zzb = Math.max(this.zzh, zzb);
            }
            this.zzh = zzb;
            this.zzj = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkn, com.google.android.gms.internal.ads.zzko
    public final String zzK() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzkn
    public final boolean zzM() {
        return super.zzM() && this.zzd.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzkn
    public final boolean zzN() {
        return this.zzd.zzu() || super.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final float zzP(float f, zzaf zzafVar, zzaf[] zzafVarArr) {
        int i = -1;
        for (zzaf zzafVar2 : zzafVarArr) {
            int i2 = zzafVar2.zzA;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final int zzQ(zzrc zzrcVar, zzaf zzafVar) throws zzrj {
        boolean z;
        if (zzbt.zzg(zzafVar.zzm)) {
            int i = zzew.zza >= 21 ? 32 : 0;
            int i2 = zzafVar.zzF;
            boolean zzaw = zzra.zzaw(zzafVar);
            if (zzaw && this.zzd.zzw(zzafVar) && (i2 == 0 || zzrp.zzd() != null)) {
                return i | 140;
            }
            if ((!MimeTypes.AUDIO_RAW.equals(zzafVar.zzm) || this.zzd.zzw(zzafVar)) && this.zzd.zzw(zzew.zzF(2, zzafVar.zzz, zzafVar.zzA))) {
                List zzay = zzay(zzrcVar, zzafVar, false, this.zzd);
                if (zzay.isEmpty()) {
                    return TsExtractor.TS_STREAM_TYPE_AC3;
                }
                if (zzaw) {
                    zzqx zzqxVar = (zzqx) zzay.get(0);
                    boolean zze = zzqxVar.zze(zzafVar);
                    if (!zze) {
                        for (int i3 = 1; i3 < zzay.size(); i3++) {
                            zzqx zzqxVar2 = (zzqx) zzay.get(i3);
                            if (zzqxVar2.zze(zzafVar)) {
                                z = false;
                                zze = true;
                                zzqxVar = zzqxVar2;
                                break;
                            }
                        }
                    }
                    z = true;
                    int i4 = true != zze ? 3 : 4;
                    int i5 = 8;
                    if (zze && zzqxVar.zzf(zzafVar)) {
                        i5 = 16;
                    }
                    return i4 | i5 | i | (true != zzqxVar.zzg ? 0 : 64) | (true != z ? 0 : 128);
                }
                return TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
            }
            return TsExtractor.TS_STREAM_TYPE_AC3;
        }
        return 128;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final zzhc zzR(zzqx zzqxVar, zzaf zzafVar, zzaf zzafVar2) {
        int i;
        int i2;
        zzhc zzb = zzqxVar.zzb(zzafVar, zzafVar2);
        int i3 = zzb.zze;
        if (zzax(zzqxVar, zzafVar2) > this.zze) {
            i3 |= 64;
        }
        String str = zzqxVar.zza;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = zzb.zzd;
        }
        return new zzhc(str, zzafVar, zzafVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    @o0OO00OO
    public final zzhc zzS(zzjo zzjoVar) throws zzhj {
        zzhc zzS = super.zzS(zzjoVar);
        this.zzc.zzg(zzjoVar.zza, zzS);
        return zzS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x00a8, code lost:
        if ("AXON 7 mini".equals(r10) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008b  */
    @Override // com.google.android.gms.internal.ads.zzra
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzqs zzV(com.google.android.gms.internal.ads.zzqx r8, com.google.android.gms.internal.ads.zzaf r9, @o00oOooO.o0OO00OO android.media.MediaCrypto r10, float r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpl.zzV(com.google.android.gms.internal.ads.zzqx, com.google.android.gms.internal.ads.zzaf, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzqs");
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final List zzW(zzrc zzrcVar, zzaf zzafVar, boolean z) throws zzrj {
        return zzrp.zzg(zzay(zzrcVar, zzafVar, false, this.zzd), zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final void zzX(Exception exc) {
        zzee.zzc("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final void zzY(String str, zzqs zzqsVar, long j, long j2) {
        this.zzc.zzc(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final void zzZ(String str) {
        this.zzc.zzd(str);
    }

    @Override // com.google.android.gms.internal.ads.zzjq
    public final long zza() {
        if (zzbc() == 2) {
            zzaz();
        }
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final void zzaa(zzaf zzafVar, @o0OO00OO MediaFormat mediaFormat) throws zzhj {
        int i;
        zzaf zzafVar2 = this.zzg;
        int[] iArr = null;
        if (zzafVar2 != null) {
            zzafVar = zzafVar2;
        } else if (zzaj() != null) {
            int zzn = MimeTypes.AUDIO_RAW.equals(zzafVar.zzm) ? zzafVar.zzB : (zzew.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? zzew.zzn(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            zzad zzadVar = new zzad();
            zzadVar.zzS(MimeTypes.AUDIO_RAW);
            zzadVar.zzN(zzn);
            zzadVar.zzC(zzafVar.zzC);
            zzadVar.zzD(zzafVar.zzD);
            zzadVar.zzw(mediaFormat.getInteger("channel-count"));
            zzadVar.zzT(mediaFormat.getInteger("sample-rate"));
            zzaf zzY = zzadVar.zzY();
            if (this.zzf && zzY.zzz == 6 && (i = zzafVar.zzz) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < zzafVar.zzz; i2++) {
                    iArr[i2] = i2;
                }
            }
            zzafVar = zzY;
        }
        try {
            this.zzd.zzd(zzafVar, 0, iArr);
        } catch (zzod e) {
            throw zzbe(e, e.zza, false, PlaybackException.ERROR_CODE_AUDIO_TRACK_INIT_FAILED);
        }
    }

    @o0O00O0
    public final void zzab() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final void zzac() {
        this.zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final void zzad(zzgr zzgrVar) {
        if (!this.zzi || zzgrVar.zzf()) {
            return;
        }
        if (Math.abs(zzgrVar.zzd - this.zzh) > 500000) {
            this.zzh = zzgrVar.zzd;
        }
        this.zzi = false;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final void zzae() throws zzhj {
        try {
            this.zzd.zzi();
        } catch (zzoh e) {
            throw zzbe(e, e.zzc, e.zzb, PlaybackException.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final boolean zzaf(long j, long j2, @o0OO00OO zzqu zzquVar, @o0OO00OO ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzaf zzafVar) throws zzhj {
        byteBuffer.getClass();
        if (this.zzg != null && (i2 & 2) != 0) {
            zzquVar.getClass();
            zzquVar.zzn(i, false);
            return true;
        } else if (z) {
            if (zzquVar != null) {
                zzquVar.zzn(i, false);
            }
            ((zzra) this).zza.zzf += i3;
            this.zzd.zzf();
            return true;
        } else {
            try {
                if (this.zzd.zzt(byteBuffer, j3, i3)) {
                    if (zzquVar != null) {
                        zzquVar.zzn(i, false);
                    }
                    ((zzra) this).zza.zze += i3;
                    return true;
                }
                return false;
            } catch (zzoe e) {
                throw zzbe(e, e.zzc, e.zzb, PlaybackException.ERROR_CODE_AUDIO_TRACK_INIT_FAILED);
            } catch (zzoh e2) {
                throw zzbe(e2, zzafVar, e2.zzb, PlaybackException.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzra
    public final boolean zzag(zzaf zzafVar) {
        return this.zzd.zzw(zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjq
    public final zzby zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzjq
    public final void zzg(zzby zzbyVar) {
        this.zzd.zzo(zzbyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzha, com.google.android.gms.internal.ads.zzkn
    @o0OO00OO
    public final zzjq zzi() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzha, com.google.android.gms.internal.ads.zzkj
    public final void zzp(int i, @o0OO00OO Object obj) throws zzhj {
        if (i == 2) {
            this.zzd.zzs(((Float) obj).floatValue());
        } else if (i == 3) {
            this.zzd.zzk((zzk) obj);
        } else if (i == 6) {
            this.zzd.zzm((zzl) obj);
        } else {
            switch (i) {
                case 9:
                    this.zzd.zzr(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.zzd.zzl(((Integer) obj).intValue());
                    return;
                case 11:
                    this.zzl = (zzkm) obj;
                    return;
                case 12:
                    if (zzew.zza >= 23) {
                        zzpi.zza(this.zzd, obj);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzha
    public final void zzs() {
        this.zzk = true;
        try {
            this.zzd.zze();
            try {
                super.zzs();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.zzs();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzha
    public final void zzt(boolean z, boolean z2) throws zzhj {
        super.zzt(z, z2);
        this.zzc.zzf(((zzra) this).zza);
        zzk();
        this.zzd.zzp(zzl());
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzha
    public final void zzu(long j, boolean z) throws zzhj {
        super.zzu(j, z);
        this.zzd.zze();
        this.zzh = j;
        this.zzi = true;
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzha
    public final void zzv() {
        try {
            super.zzv();
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzj();
            }
        } catch (Throwable th) {
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzj();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzha
    public final void zzw() {
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzha
    public final void zzx() {
        zzaz();
        this.zzd.zzg();
    }
}
