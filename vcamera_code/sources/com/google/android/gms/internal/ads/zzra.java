package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.PlaybackException;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0O00O0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
/* loaded from: classes2.dex */
public abstract class zzra extends zzha {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private float zzA;
    @o0OO00OO
    private ArrayDeque zzB;
    @o0OO00OO
    private zzqz zzC;
    @o0OO00OO
    private zzqx zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    @o0OO00OO
    private zzqp zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    @o0OO00OO
    private ByteBuffer zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private boolean zzX;
    private boolean zzY;
    private int zzZ;
    public zzhb zza;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private long zzaf;
    private long zzag;
    private boolean zzah;
    private boolean zzai;
    private boolean zzaj;
    private long zzak;
    private long zzal;
    private int zzam;
    @o0OO00OO
    private zzqa zzan;
    @o0OO00OO
    private zzqa zzao;
    private final zzqt zzc;
    private final zzrc zzd;
    private final float zze;
    private final zzgr zzf;
    private final zzgr zzg;
    private final zzgr zzh;
    private final zzqo zzi;
    private final zzet zzj;
    private final ArrayList zzk;
    private final MediaCodec.BufferInfo zzl;
    private final long[] zzm;
    private final long[] zzn;
    private final long[] zzo;
    @o0OO00OO
    private zzaf zzp;
    @o0OO00OO
    private zzaf zzq;
    @o0OO00OO
    private MediaCrypto zzr;
    private boolean zzs;
    private long zzt;
    private float zzu;
    private float zzv;
    @o0OO00OO
    private zzqu zzw;
    @o0OO00OO
    private zzaf zzx;
    @o0OO00OO
    private MediaFormat zzy;
    private boolean zzz;

    public zzra(int i, zzqt zzqtVar, zzrc zzrcVar, boolean z, float f) {
        super(i);
        this.zzc = zzqtVar;
        zzrcVar.getClass();
        this.zzd = zzrcVar;
        this.zze = f;
        this.zzf = new zzgr(0, 0);
        this.zzg = new zzgr(0, 0);
        this.zzh = new zzgr(2, 0);
        zzqo zzqoVar = new zzqo();
        this.zzi = zzqoVar;
        this.zzj = new zzet(10);
        this.zzk = new ArrayList();
        this.zzl = new MediaCodec.BufferInfo();
        this.zzu = 1.0f;
        this.zzv = 1.0f;
        this.zzt = C.TIME_UNSET;
        this.zzm = new long[10];
        this.zzn = new long[10];
        this.zzo = new long[10];
        this.zzak = C.TIME_UNSET;
        this.zzal = C.TIME_UNSET;
        zzqoVar.zzi(0);
        zzqoVar.zzb.order(ByteOrder.nativeOrder());
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzZ = 0;
        this.zzQ = -1;
        this.zzR = -1;
        this.zzP = C.TIME_UNSET;
        this.zzaf = C.TIME_UNSET;
        this.zzag = C.TIME_UNSET;
        this.zzaa = 0;
        this.zzab = 0;
    }

    private final void zzT() {
        this.zzX = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzW = false;
        this.zzV = false;
    }

    private final void zzU() throws zzhj {
        if (this.zzac) {
            this.zzaa = 1;
            this.zzab = 3;
            return;
        }
        zzaq();
        zzan();
    }

    private final void zzaA() {
        this.zzR = -1;
        this.zzS = null;
    }

    @o0OOooO0(23)
    private final void zzaB() throws zzhj {
        try {
            throw null;
        } catch (MediaCryptoException e) {
            throw zzbe(e, this.zzp, false, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
        }
    }

    @TargetApi(23)
    private final boolean zzaC() throws zzhj {
        if (this.zzac) {
            this.zzaa = 1;
            if (this.zzG || this.zzI) {
                this.zzab = 3;
                return false;
            }
            this.zzab = 2;
        } else {
            zzaB();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    private final boolean zzaD() throws zzhj {
        zzqu zzquVar = this.zzw;
        boolean z = 0;
        if (zzquVar == null || this.zzaa == 2 || this.zzah) {
            return false;
        }
        if (this.zzQ < 0) {
            int zza = zzquVar.zza();
            this.zzQ = zza;
            if (zza < 0) {
                return false;
            }
            this.zzg.zzb = this.zzw.zzf(zza);
            this.zzg.zzb();
        }
        if (this.zzaa == 1) {
            if (!this.zzN) {
                this.zzad = true;
                this.zzw.zzj(this.zzQ, 0, 0, 0L, 4);
                zzaz();
            }
            this.zzaa = 2;
            return false;
        } else if (this.zzL) {
            this.zzL = false;
            this.zzg.zzb.put(zzb);
            this.zzw.zzj(this.zzQ, 0, 38, 0L, 0);
            zzaz();
            this.zzac = true;
            return true;
        } else {
            if (this.zzZ == 1) {
                for (int i = 0; i < this.zzx.zzo.size(); i++) {
                    this.zzg.zzb.put((byte[]) this.zzx.zzo.get(i));
                }
                this.zzZ = 2;
            }
            int position = this.zzg.zzb.position();
            zzjo zzh = zzh();
            try {
                int zzbd = zzbd(zzh, this.zzg, 0);
                if (zzG()) {
                    this.zzag = this.zzaf;
                }
                if (zzbd == -3) {
                    return false;
                }
                if (zzbd == -5) {
                    if (this.zzZ == 2) {
                        this.zzg.zzb();
                        this.zzZ = 1;
                    }
                    zzS(zzh);
                    return true;
                }
                zzgr zzgrVar = this.zzg;
                if (zzgrVar.zzg()) {
                    if (this.zzZ == 2) {
                        zzgrVar.zzb();
                        this.zzZ = 1;
                    }
                    this.zzah = true;
                    if (!this.zzac) {
                        zzay();
                        return false;
                    }
                    try {
                        if (!this.zzN) {
                            this.zzad = true;
                            this.zzw.zzj(this.zzQ, 0, 0, 0L, 4);
                            zzaz();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw zzbe(e, this.zzp, false, zzew.zzl(e.getErrorCode()));
                    }
                } else if (!this.zzac && !zzgrVar.zzh()) {
                    zzgrVar.zzb();
                    if (this.zzZ == 2) {
                        this.zzZ = 1;
                    }
                    return true;
                } else {
                    boolean zzk = zzgrVar.zzk();
                    if (zzk) {
                        zzgrVar.zza.zzb(position);
                    }
                    if (this.zzF && !zzk) {
                        ByteBuffer byteBuffer = this.zzg.zzb;
                        byte[] bArr = zzaar.zza;
                        int position2 = byteBuffer.position();
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            int i4 = i2 + 1;
                            if (i4 >= position2) {
                                byteBuffer.clear();
                                break;
                            }
                            int i5 = byteBuffer.get(i2) & 255;
                            if (i3 == 3) {
                                if (i5 == 1) {
                                    if ((byteBuffer.get(i4) & Ascii.US) == 7) {
                                        ByteBuffer duplicate = byteBuffer.duplicate();
                                        duplicate.position(i2 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer.position(0);
                                        byteBuffer.put(duplicate);
                                        break;
                                    }
                                    i5 = 1;
                                }
                            } else if (i5 == 0) {
                                i3++;
                            }
                            if (i5 != 0) {
                                i3 = 0;
                            }
                            i2 = i4;
                        }
                        if (this.zzg.zzb.position() == 0) {
                            return true;
                        }
                        this.zzF = false;
                    }
                    zzgr zzgrVar2 = this.zzg;
                    long j = zzgrVar2.zzd;
                    zzqp zzqpVar = this.zzO;
                    if (zzqpVar != null) {
                        j = zzqpVar.zzb(this.zzp, zzgrVar2);
                        this.zzaf = Math.max(this.zzaf, this.zzO.zza(this.zzp));
                    }
                    long j2 = j;
                    if (this.zzg.zzf()) {
                        this.zzk.add(Long.valueOf(j2));
                    }
                    if (this.zzaj) {
                        this.zzj.zzd(j2, this.zzp);
                        this.zzaj = false;
                    }
                    this.zzaf = Math.max(this.zzaf, j2);
                    this.zzg.zzj();
                    zzgr zzgrVar3 = this.zzg;
                    if (zzgrVar3.zze()) {
                        zzam(zzgrVar3);
                    }
                    zzad(this.zzg);
                    try {
                        if (zzk) {
                            this.zzw.zzk(this.zzQ, 0, this.zzg.zza, j2, 0);
                        } else {
                            this.zzw.zzj(this.zzQ, 0, this.zzg.zzb.limit(), j2, 0);
                        }
                        zzaz();
                        this.zzac = true;
                        this.zzZ = 0;
                        zzhb zzhbVar = this.zza;
                        z = zzhbVar.zzc + 1;
                        zzhbVar.zzc = z;
                        return true;
                    } catch (MediaCodec.CryptoException e2) {
                        throw zzbe(e2, this.zzp, z, zzew.zzl(e2.getErrorCode()));
                    }
                }
            } catch (zzgq e3) {
                zzX(e3);
                zzaF(0);
                zzab();
                return true;
            }
        }
    }

    private final boolean zzaE() {
        return this.zzR >= 0;
    }

    private final boolean zzaF(int i) throws zzhj {
        zzjo zzh = zzh();
        this.zzf.zzb();
        int zzbd = zzbd(zzh, this.zzf, i | 4);
        if (zzbd == -5) {
            zzS(zzh);
            return true;
        } else if (zzbd == -4 && this.zzf.zzg()) {
            this.zzah = true;
            zzay();
            return false;
        } else {
            return false;
        }
    }

    private final boolean zzaG(long j) {
        return this.zzt == C.TIME_UNSET || SystemClock.elapsedRealtime() - j < this.zzt;
    }

    private final boolean zzaH(zzaf zzafVar) throws zzhj {
        if (zzew.zza >= 23 && this.zzw != null && this.zzab != 3 && zzbc() != 0) {
            float zzP = zzP(this.zzv, zzafVar, zzJ());
            float f = this.zzA;
            if (f == zzP) {
                return true;
            }
            if (zzP == -1.0f) {
                zzU();
                return false;
            } else if (f == -1.0f && zzP <= this.zze) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", zzP);
                this.zzw.zzp(bundle);
                this.zzA = zzP;
            }
        }
        return true;
    }

    private final void zzab() {
        try {
            this.zzw.zzi();
        } finally {
            zzar();
        }
    }

    public static boolean zzaw(zzaf zzafVar) {
        return zzafVar.zzF == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b7, code lost:
        if ("stvm8".equals(r5) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c7, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzax(com.google.android.gms.internal.ads.zzqx r17, android.media.MediaCrypto r18) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzra.zzax(com.google.android.gms.internal.ads.zzqx, android.media.MediaCrypto):void");
    }

    @TargetApi(23)
    private final void zzay() throws zzhj {
        int i = this.zzab;
        if (i == 1) {
            zzab();
        } else if (i == 2) {
            zzab();
            zzaB();
        } else if (i != 3) {
            this.zzai = true;
            zzae();
        } else {
            zzaq();
            zzan();
        }
    }

    private final void zzaz() {
        this.zzQ = -1;
        this.zzg.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzha, com.google.android.gms.internal.ads.zzkn
    public void zzD(float f, float f2) throws zzhj {
        this.zzu = f;
        this.zzv = f2;
        zzaH(this.zzx);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a7, code lost:
        if (r15.zzaa == r11) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0267, code lost:
        if (r15.zzq != null) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
        r15.zzai = true;
        r13 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0310 A[LOOP:2: B:80:0x0143->B:186:0x0310, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0322 A[Catch: IllegalStateException -> 0x0354, TryCatch #4 {IllegalStateException -> 0x0354, blocks: (B:183:0x0309, B:188:0x031c, B:190:0x0322, B:192:0x0328, B:179:0x02f1, B:181:0x0303, B:199:0x033a), top: B:241:0x0136 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x030f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v23 */
    /* JADX WARN: Type inference failed for: r19v25 */
    /* JADX WARN: Type inference failed for: r19v26 */
    /* JADX WARN: Type inference failed for: r19v27 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v36 */
    /* JADX WARN: Type inference failed for: r19v37 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    @Override // com.google.android.gms.internal.ads.zzkn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzL(long r24, long r26) throws com.google.android.gms.internal.ads.zzhj {
        /*
            Method dump skipped, instructions count: 935
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzra.zzL(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public boolean zzM() {
        return this.zzai;
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public boolean zzN() {
        if (this.zzp != null) {
            if (zzI() || zzaE()) {
                return true;
            }
            if (this.zzP != C.TIME_UNSET && SystemClock.elapsedRealtime() < this.zzP) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final int zzO(zzaf zzafVar) throws zzhj {
        try {
            return zzQ(this.zzd, zzafVar);
        } catch (zzrj e) {
            throw zzbe(e, zzafVar, false, PlaybackException.ERROR_CODE_DECODER_QUERY_FAILED);
        }
    }

    public float zzP(float f, zzaf zzafVar, zzaf[] zzafVarArr) {
        throw null;
    }

    public abstract int zzQ(zzrc zzrcVar, zzaf zzafVar) throws zzrj;

    public zzhc zzR(zzqx zzqxVar, zzaf zzafVar, zzaf zzafVar2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
        if (zzaC() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
        if (zzaC() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009f, code lost:
        if (zzaC() == false) goto L30;
     */
    @o00oOooO.o0O00O0
    @o00oOooO.o0OO00OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.zzhc zzS(com.google.android.gms.internal.ads.zzjo r12) throws com.google.android.gms.internal.ads.zzhj {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzra.zzS(com.google.android.gms.internal.ads.zzjo):com.google.android.gms.internal.ads.zzhc");
    }

    public abstract zzqs zzV(zzqx zzqxVar, zzaf zzafVar, @o0OO00OO MediaCrypto mediaCrypto, float f);

    public abstract List zzW(zzrc zzrcVar, zzaf zzafVar, boolean z) throws zzrj;

    public void zzX(Exception exc) {
        throw null;
    }

    public void zzY(String str, zzqs zzqsVar, long j, long j2) {
        throw null;
    }

    public void zzZ(String str) {
        throw null;
    }

    public void zzaa(zzaf zzafVar, @o0OO00OO MediaFormat mediaFormat) throws zzhj {
        throw null;
    }

    public void zzac() {
    }

    public void zzad(zzgr zzgrVar) throws zzhj {
        throw null;
    }

    public void zzae() throws zzhj {
    }

    public abstract boolean zzaf(long j, long j2, @o0OO00OO zzqu zzquVar, @o0OO00OO ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzaf zzafVar) throws zzhj;

    public boolean zzag(zzaf zzafVar) {
        return false;
    }

    public final float zzah() {
        return this.zzu;
    }

    public final long zzai() {
        return this.zzal;
    }

    @o0OO00OO
    public final zzqu zzaj() {
        return this.zzw;
    }

    public zzqv zzak(Throwable th, @o0OO00OO zzqx zzqxVar) {
        return new zzqv(th, zzqxVar);
    }

    @o0OO00OO
    public final zzqx zzal() {
        return this.zzD;
    }

    public void zzam(zzgr zzgrVar) throws zzhj {
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6 A[Catch: zzqz -> 0x0119, TryCatch #0 {zzqz -> 0x0119, blocks: (B:30:0x0065, B:33:0x006a, B:35:0x0080, B:36:0x008b, B:41:0x009a, B:43:0x00a2, B:44:0x00aa, B:46:0x00ae, B:57:0x00d6, B:59:0x00f6, B:61:0x00ff, B:64:0x0108, B:65:0x010a, B:60:0x00f9, B:66:0x010b, B:68:0x010e, B:69:0x0118, B:39:0x008f, B:40:0x0099, B:54:0x00c6, B:55:0x00d4, B:49:0x00bd), top: B:74:0x0065, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9 A[Catch: zzqz -> 0x0119, TryCatch #0 {zzqz -> 0x0119, blocks: (B:30:0x0065, B:33:0x006a, B:35:0x0080, B:36:0x008b, B:41:0x009a, B:43:0x00a2, B:44:0x00aa, B:46:0x00ae, B:57:0x00d6, B:59:0x00f6, B:61:0x00ff, B:64:0x0108, B:65:0x010a, B:60:0x00f9, B:66:0x010b, B:68:0x010e, B:69:0x0118, B:39:0x008f, B:40:0x0099, B:54:0x00c6, B:55:0x00d4, B:49:0x00bd), top: B:74:0x0065, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0108 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzan() throws com.google.android.gms.internal.ads.zzhj {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzra.zzan():void");
    }

    @o0O00O0
    public void zzao(long j) {
        while (true) {
            int i = this.zzam;
            if (i == 0 || j < this.zzo[0]) {
                return;
            }
            long[] jArr = this.zzm;
            this.zzak = jArr[0];
            this.zzal = this.zzn[0];
            int i2 = i - 1;
            this.zzam = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.zzn;
            System.arraycopy(jArr2, 1, jArr2, 0, this.zzam);
            long[] jArr3 = this.zzo;
            System.arraycopy(jArr3, 1, jArr3, 0, this.zzam);
            zzac();
        }
    }

    public void zzap(zzaf zzafVar) throws zzhj {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzqa, android.media.MediaCrypto, com.google.android.gms.internal.ads.zzqu] */
    public final void zzaq() {
        try {
            zzqu zzquVar = this.zzw;
            if (zzquVar != null) {
                zzquVar.zzl();
                this.zza.zzb++;
                zzZ(this.zzD.zza);
            }
        } finally {
            this.zzw = null;
            this.zzr = null;
            this.zzan = null;
            zzas();
        }
    }

    @o0O00O0
    public void zzar() {
        zzaz();
        zzaA();
        this.zzP = C.TIME_UNSET;
        this.zzad = false;
        this.zzac = false;
        this.zzL = false;
        this.zzM = false;
        this.zzT = false;
        this.zzU = false;
        this.zzk.clear();
        this.zzaf = C.TIME_UNSET;
        this.zzag = C.TIME_UNSET;
        zzqp zzqpVar = this.zzO;
        if (zzqpVar != null) {
            zzqpVar.zzc();
        }
        this.zzaa = 0;
        this.zzab = 0;
        this.zzZ = this.zzY ? 1 : 0;
    }

    @o0O00O0
    public final void zzas() {
        zzar();
        this.zzO = null;
        this.zzB = null;
        this.zzD = null;
        this.zzx = null;
        this.zzy = null;
        this.zzz = false;
        this.zzae = false;
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzF = false;
        this.zzG = false;
        this.zzH = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzN = false;
        this.zzY = false;
        this.zzZ = 0;
        this.zzs = false;
    }

    public final boolean zzat() throws zzhj {
        boolean zzau = zzau();
        if (zzau) {
            zzan();
        }
        return zzau;
    }

    public final boolean zzau() {
        if (this.zzw == null) {
            return false;
        }
        int i = this.zzab;
        if (i == 3 || this.zzG || ((this.zzH && !this.zzae) || (this.zzI && this.zzad))) {
            zzaq();
            return true;
        }
        if (i == 2) {
            int i2 = zzew.zza;
            zzdl.zzf(i2 >= 23);
            if (i2 >= 23) {
                try {
                    zzaB();
                } catch (zzhj e) {
                    zzee.zzf("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    zzaq();
                    return true;
                }
            }
        }
        zzab();
        return false;
    }

    public boolean zzav(zzqx zzqxVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzha, com.google.android.gms.internal.ads.zzko
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzha
    public void zzs() {
        this.zzp = null;
        this.zzak = C.TIME_UNSET;
        this.zzal = C.TIME_UNSET;
        this.zzam = 0;
        zzau();
    }

    @Override // com.google.android.gms.internal.ads.zzha
    public void zzt(boolean z, boolean z2) throws zzhj {
        this.zza = new zzhb();
    }

    @Override // com.google.android.gms.internal.ads.zzha
    public void zzu(long j, boolean z) throws zzhj {
        this.zzah = false;
        this.zzai = false;
        if (this.zzV) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzW = false;
        } else {
            zzat();
        }
        zzet zzetVar = this.zzj;
        if (zzetVar.zza() > 0) {
            this.zzaj = true;
        }
        zzetVar.zze();
        int i = this.zzam;
        if (i != 0) {
            int i2 = i - 1;
            this.zzal = this.zzn[i2];
            this.zzak = this.zzm[i2];
            this.zzam = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzha
    public void zzv() {
        try {
            zzT();
            zzaq();
        } finally {
            this.zzao = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzha
    public final void zzy(zzaf[] zzafVarArr, long j, long j2) throws zzhj {
        if (this.zzal == C.TIME_UNSET) {
            zzdl.zzf(this.zzak == C.TIME_UNSET);
            this.zzak = j;
            this.zzal = j2;
            return;
        }
        int i = this.zzam;
        if (i == 10) {
            zzee.zze("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.zzn[9]);
        } else {
            this.zzam = i + 1;
        }
        long[] jArr = this.zzm;
        int i2 = this.zzam - 1;
        jArr[i2] = j;
        this.zzn[i2] = j2;
        this.zzo[i2] = this.zzaf;
    }
}
