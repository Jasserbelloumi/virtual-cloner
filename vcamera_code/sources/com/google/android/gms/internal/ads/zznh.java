package com.google.android.gms.internal.ads;

import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
final class zznh {
    public final /* synthetic */ zzni zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzss zze;
    private boolean zzf;
    private boolean zzg;

    public zznh(zzni zzniVar, String str, @o0OO00OO int i, zzss zzssVar) {
        this.zza = zzniVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzssVar == null ? -1L : zzssVar.zzd;
        if (zzssVar == null || !zzssVar.zzb()) {
            return;
        }
        this.zze = zzssVar;
    }

    public final void zzg(int i, @o0OO00OO zzss zzssVar) {
        if (this.zzd == -1 && i == this.zzc && zzssVar != null) {
            this.zzd = zzssVar.zzd;
        }
    }

    public final boolean zzj(int i, @o0OO00OO zzss zzssVar) {
        if (zzssVar == null) {
            return i == this.zzc;
        }
        zzss zzssVar2 = this.zze;
        return zzssVar2 == null ? !zzssVar.zzb() && zzssVar.zzd == this.zzd : zzssVar.zzd == zzssVar2.zzd && zzssVar.zzb == zzssVar2.zzb && zzssVar.zzc == zzssVar2.zzc;
    }

    public final boolean zzk(zzlc zzlcVar) {
        zzss zzssVar = zzlcVar.zzd;
        if (zzssVar == null) {
            return this.zzc != zzlcVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        if (zzssVar.zzd > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        int zza = zzlcVar.zzb.zza(zzssVar.zza);
        int zza2 = zzlcVar.zzb.zza(this.zze.zza);
        zzss zzssVar2 = zzlcVar.zzd;
        if (zzssVar2.zzd < this.zze.zzd || zza < zza2) {
            return false;
        }
        if (zza > zza2) {
            return true;
        }
        boolean zzb = zzssVar2.zzb();
        zzss zzssVar3 = zzlcVar.zzd;
        if (!zzb) {
            int i = zzssVar3.zze;
            return i == -1 || i > this.zze.zzb;
        }
        int i2 = zzssVar3.zzb;
        int i3 = zzssVar3.zzc;
        zzss zzssVar4 = this.zze;
        int i4 = zzssVar4.zzb;
        if (i2 <= i4) {
            return i2 == i4 && i3 > zzssVar4.zzc;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 < r8.zzc()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzl(com.google.android.gms.internal.ads.zzcn r7, com.google.android.gms.internal.ads.zzcn r8) {
        /*
            r6 = this;
            int r0 = r6.zzc
            int r1 = r7.zzc()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r7 = r8.zzc()
            if (r0 >= r7) goto L11
            goto L4a
        L11:
            r0 = r3
            goto L4a
        L13:
            com.google.android.gms.internal.ads.zzni r1 = r6.zza
            com.google.android.gms.internal.ads.zzcm r1 = com.google.android.gms.internal.ads.zzni.zzb(r1)
            r4 = 0
            r7.zze(r0, r1, r4)
            com.google.android.gms.internal.ads.zzni r0 = r6.zza
            com.google.android.gms.internal.ads.zzcm r0 = com.google.android.gms.internal.ads.zzni.zzb(r0)
            int r0 = r0.zzo
        L26:
            com.google.android.gms.internal.ads.zzni r1 = r6.zza
            com.google.android.gms.internal.ads.zzcm r1 = com.google.android.gms.internal.ads.zzni.zzb(r1)
            int r1 = r1.zzp
            if (r0 > r1) goto L11
            java.lang.Object r1 = r7.zzf(r0)
            int r1 = r8.zza(r1)
            if (r1 == r3) goto L47
            com.google.android.gms.internal.ads.zzni r7 = r6.zza
            com.google.android.gms.internal.ads.zzck r7 = com.google.android.gms.internal.ads.zzni.zza(r7)
            com.google.android.gms.internal.ads.zzck r7 = r8.zzd(r1, r7, r2)
            int r0 = r7.zzd
            goto L4a
        L47:
            int r0 = r0 + 1
            goto L26
        L4a:
            r6.zzc = r0
            if (r0 != r3) goto L4f
            return r2
        L4f:
            com.google.android.gms.internal.ads.zzss r7 = r6.zze
            r0 = 1
            if (r7 != 0) goto L55
            return r0
        L55:
            java.lang.Object r7 = r7.zza
            int r7 = r8.zza(r7)
            if (r7 == r3) goto L5e
            return r0
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznh.zzl(com.google.android.gms.internal.ads.zzcn, com.google.android.gms.internal.ads.zzcn):boolean");
    }
}
