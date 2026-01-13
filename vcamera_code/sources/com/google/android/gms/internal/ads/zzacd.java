package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes2.dex */
public final class zzacd implements zzzu {
    public static final zzaab zza = new zzaab() { // from class: com.google.android.gms.internal.ads.zzacc
        @Override // com.google.android.gms.internal.ads.zzaab
        public final zzzu[] zza() {
            zzaab zzaabVar = zzacd.zza;
            return new zzzu[]{new zzacd()};
        }

        @Override // com.google.android.gms.internal.ads.zzaab
        public final /* synthetic */ zzzu[] zzb(Uri uri, Map map) {
            return zzaaa.zza(this, uri, map);
        }
    };
    private zzzx zzg;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private boolean zzo;
    private zzacb zzp;
    private zzach zzq;
    private final zzen zzb = new zzen(4);
    private final zzen zzc = new zzen(9);
    private final zzen zzd = new zzen(11);
    private final zzen zze = new zzen();
    private final zzace zzf = new zzace();
    private int zzh = 1;

    private final zzen zze(zzzv zzzvVar) throws IOException {
        if (this.zzm > this.zze.zzb()) {
            zzen zzenVar = this.zze;
            int zzb = zzenVar.zzb();
            zzenVar.zzD(new byte[Math.max(zzb + zzb, this.zzm)], 0);
        } else {
            this.zze.zzF(0);
        }
        this.zze.zzE(this.zzm);
        ((zzzk) zzzvVar).zzn(this.zze.zzH(), 0, this.zzm, false);
        return this.zze;
    }

    @RequiresNonNull({"extractorOutput"})
    private final void zzf() {
        if (this.zzo) {
            return;
        }
        this.zzg.zzN(new zzaaw(C.TIME_UNSET, 0L));
        this.zzo = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzzu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(com.google.android.gms.internal.ads.zzzv r17, com.google.android.gms.internal.ads.zzaau r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacd.zza(com.google.android.gms.internal.ads.zzzv, com.google.android.gms.internal.ads.zzaau):int");
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzb(zzzx zzzxVar) {
        this.zzg = zzzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.zzh = 1;
            this.zzi = false;
        } else {
            this.zzh = 3;
        }
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzd(zzzv zzzvVar) throws IOException {
        zzzk zzzkVar = (zzzk) zzzvVar;
        zzzkVar.zzm(this.zzb.zzH(), 0, 3, false);
        this.zzb.zzF(0);
        if (this.zzb.zzm() != 4607062) {
            return false;
        }
        zzzkVar.zzm(this.zzb.zzH(), 0, 2, false);
        this.zzb.zzF(0);
        if ((this.zzb.zzo() & 250) != 0) {
            return false;
        }
        zzzkVar.zzm(this.zzb.zzH(), 0, 4, false);
        this.zzb.zzF(0);
        int zze = this.zzb.zze();
        zzzvVar.zzj();
        zzzk zzzkVar2 = (zzzk) zzzvVar;
        zzzkVar2.zzl(zze, false);
        zzzkVar2.zzm(this.zzb.zzH(), 0, 4, false);
        this.zzb.zzF(0);
        return this.zzb.zze() == 0;
    }
}
