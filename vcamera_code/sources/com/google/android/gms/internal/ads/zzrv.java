package com.google.android.gms.internal.ads;

import java.io.IOException;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzrv implements zztl {
    private final zzaab zza;
    @o0OO00OO
    private zzzu zzb;
    @o0OO00OO
    private zzzv zzc;

    public zzrv(zzaab zzaabVar) {
        this.zza = zzaabVar;
    }

    @Override // com.google.android.gms.internal.ads.zztl
    public final int zza(zzaau zzaauVar) throws IOException {
        zzzu zzzuVar = this.zzb;
        zzzuVar.getClass();
        zzzv zzzvVar = this.zzc;
        zzzvVar.getClass();
        return zzzuVar.zza(zzzvVar, zzaauVar);
    }

    @Override // com.google.android.gms.internal.ads.zztl
    public final long zzb() {
        zzzv zzzvVar = this.zzc;
        if (zzzvVar != null) {
            return zzzvVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zztl
    public final void zzc() {
        zzzu zzzuVar = this.zzb;
        if (zzzuVar instanceof zzafc) {
            ((zzafc) zzzuVar).zze();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r6.zzf() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
        if (r6.zzf() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
        r1 = false;
     */
    @Override // com.google.android.gms.internal.ads.zztl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzr r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.zzzx r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzzk r6 = new com.google.android.gms.internal.ads.zzzk
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.zzc = r6
            com.google.android.gms.internal.ads.zzzu r8 = r7.zzb
            if (r8 == 0) goto L10
            return
        L10:
            com.google.android.gms.internal.ads.zzaab r8 = r7.zza
            com.google.android.gms.internal.ads.zzzu[] r8 = r8.zzb(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.zzb = r8
            goto L73
        L20:
            r0 = r13
        L21:
            if (r0 >= r10) goto L6f
            r1 = r8[r0]
            boolean r2 = r1.zzd(r6)     // Catch: java.lang.Throwable -> L41 java.io.EOFException -> L56
            if (r2 == 0) goto L34
            r7.zzb = r1     // Catch: java.lang.Throwable -> L41 java.io.EOFException -> L56
            com.google.android.gms.internal.ads.zzdl.zzf(r14)
            r6.zzj()
            goto L6f
        L34:
            com.google.android.gms.internal.ads.zzzu r1 = r7.zzb
            if (r1 != 0) goto L65
            long r1 = r6.zzf()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L63
            goto L65
        L41:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzzu r9 = r7.zzb
            if (r9 != 0) goto L4e
            long r9 = r6.zzf()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L4f
        L4e:
            r13 = r14
        L4f:
            com.google.android.gms.internal.ads.zzdl.zzf(r13)
            r6.zzj()
            throw r8
        L56:
            com.google.android.gms.internal.ads.zzzu r1 = r7.zzb
            if (r1 != 0) goto L65
            long r1 = r6.zzf()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L63
            goto L65
        L63:
            r1 = r13
            goto L66
        L65:
            r1 = r14
        L66:
            com.google.android.gms.internal.ads.zzdl.zzf(r1)
            r6.zzj()
            int r0 = r0 + 1
            goto L21
        L6f:
            com.google.android.gms.internal.ads.zzzu r10 = r7.zzb
            if (r10 == 0) goto L79
        L73:
            com.google.android.gms.internal.ads.zzzu r8 = r7.zzb
            r8.zzb(r15)
            return
        L79:
            com.google.android.gms.internal.ads.zzus r10 = new com.google.android.gms.internal.ads.zzus
            java.lang.String r8 = com.google.android.gms.internal.ads.zzew.zzK(r8)
            java.lang.String r11 = "None of the available extractors ("
            java.lang.String r12 = ") could read the stream."
            java.lang.String r8 = android.support.v4.media.o00oOoO.o00oOOo0(r11, r8, r12)
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrv.zzd(com.google.android.gms.internal.ads.zzr, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.zzzx):void");
    }

    @Override // com.google.android.gms.internal.ads.zztl
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zztl
    public final void zzf(long j, long j2) {
        zzzu zzzuVar = this.zzb;
        zzzuVar.getClass();
        zzzuVar.zzc(j, j2);
    }
}
