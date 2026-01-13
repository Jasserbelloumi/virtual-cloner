package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzrx implements zzsq, zzsp {
    public final zzsq zza;
    public long zzb;
    @o0OO00OO
    private zzsp zzc;
    private zzrw[] zzd = new zzrw[0];
    private long zze = 0;

    public zzrx(zzsq zzsqVar, boolean z, long j, long j2) {
        this.zza = zzsqVar;
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zza(long j, zzkq zzkqVar) {
        if (j != 0) {
            long zzr = zzew.zzr(zzkqVar.zzf, 0L, j);
            long j2 = zzkqVar.zzg;
            long j3 = this.zzb;
            long zzr2 = zzew.zzr(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
            if (zzr != zzkqVar.zzf || zzr2 != zzkqVar.zzg) {
                zzkqVar = new zzkq(zzr, zzr2);
            }
            return this.zza.zza(j, zzkqVar);
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzb < j) {
                return zzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzc < j) {
                return zzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zzd() {
        if (zzq()) {
            long j = this.zze;
            this.zze = C.TIME_UNSET;
            long zzd = zzd();
            return zzd != C.TIME_UNSET ? zzd : j;
        }
        long zzd2 = this.zza.zzd();
        if (zzd2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        boolean z = false;
        zzdl.zzf(zzd2 >= 0);
        long j2 = this.zzb;
        if (j2 == Long.MIN_VALUE || zzd2 <= j2) {
            z = true;
        }
        zzdl.zzf(z);
        return zzd2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r0 > r3) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzsq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zze(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.zze = r0
            com.google.android.gms.internal.ads.zzrw[] r0 = r7.zzd
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.zzc()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.google.android.gms.internal.ads.zzsq r0 = r7.zza
            long r0 = r0.zze(r8)
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r9 = 1
            if (r8 == 0) goto L35
            r3 = 0
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 < 0) goto L36
            long r3 = r7.zzb
            r5 = -9223372036854775808
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L35
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 > 0) goto L36
        L35:
            r2 = r9
        L36:
            com.google.android.gms.internal.ads.zzdl.zzf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrx.zze(long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r4 > r6) goto L24;
     */
    @Override // com.google.android.gms.internal.ads.zzsq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzf(com.google.android.gms.internal.ads.zzwe[] r15, boolean[] r16, com.google.android.gms.internal.ads.zzuj[] r17, boolean[] r18, long r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r17
            int r2 = r1.length
            com.google.android.gms.internal.ads.zzrw[] r3 = new com.google.android.gms.internal.ads.zzrw[r2]
            r0.zzd = r3
            com.google.android.gms.internal.ads.zzuj[] r2 = new com.google.android.gms.internal.ads.zzuj[r2]
            r3 = 0
            r4 = r3
        Lc:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L21
            com.google.android.gms.internal.ads.zzrw[] r5 = r0.zzd
            r6 = r1[r4]
            com.google.android.gms.internal.ads.zzrw r6 = (com.google.android.gms.internal.ads.zzrw) r6
            r5[r4] = r6
            if (r6 == 0) goto L1c
            com.google.android.gms.internal.ads.zzuj r11 = r6.zza
        L1c:
            r2[r4] = r11
            int r4 = r4 + 1
            goto Lc
        L21:
            com.google.android.gms.internal.ads.zzsq r4 = r0.zza
            r5 = r15
            r6 = r16
            r7 = r2
            r8 = r18
            r9 = r19
            long r4 = r4.zzf(r5, r6, r7, r8, r9)
            boolean r6 = r14.zzq()
            r7 = 0
            if (r6 == 0) goto L3d
            int r6 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r6 != 0) goto L3d
            r9 = r7
            goto L3f
        L3d:
            r9 = r19
        L3f:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zze = r12
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            r9 = 1
            if (r6 == 0) goto L5d
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 < 0) goto L5c
            long r6 = r0.zzb
            r12 = -9223372036854775808
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 == 0) goto L5d
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 > 0) goto L5c
            goto L5d
        L5c:
            r9 = r3
        L5d:
            com.google.android.gms.internal.ads.zzdl.zzf(r9)
        L60:
            int r6 = r1.length
            if (r3 >= r6) goto L86
            r6 = r2[r3]
            if (r6 != 0) goto L6c
            com.google.android.gms.internal.ads.zzrw[] r6 = r0.zzd
            r6[r3] = r11
            goto L7d
        L6c:
            com.google.android.gms.internal.ads.zzrw[] r7 = r0.zzd
            r8 = r7[r3]
            if (r8 == 0) goto L76
            com.google.android.gms.internal.ads.zzuj r8 = r8.zza
            if (r8 == r6) goto L7d
        L76:
            com.google.android.gms.internal.ads.zzrw r8 = new com.google.android.gms.internal.ads.zzrw
            r8.<init>(r14, r6)
            r7[r3] = r8
        L7d:
            com.google.android.gms.internal.ads.zzrw[] r6 = r0.zzd
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L60
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrx.zzf(com.google.android.gms.internal.ads.zzwe[], boolean[], com.google.android.gms.internal.ads.zzuj[], boolean[], long):long");
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final /* bridge */ /* synthetic */ void zzg(zzul zzulVar) {
        zzsq zzsqVar = (zzsq) zzulVar;
        zzsp zzspVar = this.zzc;
        zzspVar.getClass();
        zzspVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final zzur zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzsp
    public final void zzi(zzsq zzsqVar) {
        zzsp zzspVar = this.zzc;
        zzspVar.getClass();
        zzspVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzj(long j, boolean z) {
        this.zza.zzj(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzl(zzsp zzspVar, long j) {
        this.zzc = zzspVar;
        this.zza.zzl(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final void zzm(long j) {
        this.zza.zzm(j);
    }

    public final void zzn(long j, long j2) {
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final boolean zzo(long j) {
        return this.zza.zzo(j);
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final boolean zzp() {
        return this.zza.zzp();
    }

    public final boolean zzq() {
        return this.zze != C.TIME_UNSET;
    }
}
