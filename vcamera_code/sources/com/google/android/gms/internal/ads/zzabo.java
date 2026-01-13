package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzabo implements zzzu {
    private int zzc;
    private zzabp zze;
    private long zzh;
    @o0OO00OO
    private zzabr zzi;
    private int zzm;
    private boolean zzn;
    private final zzen zza = new zzen(12);
    private final zzabn zzb = new zzabn(null);
    private zzzx zzd = new zzzs();
    private zzabr[] zzg = new zzabr[0];
    private long zzk = -1;
    private long zzl = -1;
    private int zzj = -1;
    private long zzf = C.TIME_UNSET;

    @o0OO00OO
    private final zzabr zzf(int i) {
        zzabr[] zzabrVarArr;
        for (zzabr zzabrVar : this.zzg) {
            if (zzabrVar.zzg(i)) {
                return zzabrVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    @Override // com.google.android.gms.internal.ads.zzzu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(com.google.android.gms.internal.ads.zzzv r23, com.google.android.gms.internal.ads.zzaau r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabo.zza(com.google.android.gms.internal.ads.zzzv, com.google.android.gms.internal.ads.zzaau):int");
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzb(zzzx zzzxVar) {
        this.zzc = 0;
        this.zzd = zzzxVar;
        this.zzh = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzc(long j, long j2) {
        int i;
        this.zzh = -1L;
        this.zzi = null;
        for (zzabr zzabrVar : this.zzg) {
            zzabrVar.zzf(j);
        }
        if (j != 0) {
            i = 6;
        } else if (this.zzg.length == 0) {
            this.zzc = 0;
            return;
        } else {
            i = 3;
        }
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzd(zzzv zzzvVar) throws IOException {
        ((zzzk) zzzvVar).zzm(this.zza.zzH(), 0, 12, false);
        this.zza.zzF(0);
        if (this.zza.zzg() != 1179011410) {
            return false;
        }
        this.zza.zzG(4);
        return this.zza.zzg() == 541677121;
    }
}
