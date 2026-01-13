package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaPeriodQueue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import o00oOooO.o0OO00OO;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjm implements Handler.Callback, zzsp, zzwj, zzkf, zzhg, zzki {
    private boolean zzA;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private int zzG;
    @o0OO00OO
    private zzjl zzH;
    private long zzI;
    private int zzJ;
    private boolean zzK;
    @o0OO00OO
    private zzhj zzL;
    private final zzip zzN;
    private final zzhe zzO;
    private final zzkn[] zza;
    private final Set zzb;
    private final zzko[] zzc;
    private final zzwk zzd;
    private final zzwl zze;
    private final zzjp zzf;
    private final zzws zzg;
    private final zzdv zzh;
    @o0OO00OO
    private final HandlerThread zzi;
    private final Looper zzj;
    private final zzcm zzk;
    private final zzck zzl;
    private final long zzm;
    private final zzhh zzn;
    private final ArrayList zzo;
    private final zzdm zzp;
    private final zzju zzq;
    private final zzkg zzr;
    private final long zzs;
    private zzkq zzt;
    private zzkh zzu;
    private zzjk zzv;
    private boolean zzw;
    private boolean zzy;
    private boolean zzz;
    private int zzB = 0;
    private boolean zzC = false;
    private boolean zzx = false;
    private long zzM = C.TIME_UNSET;

    public zzjm(zzkn[] zzknVarArr, zzwk zzwkVar, zzwl zzwlVar, zzjp zzjpVar, zzws zzwsVar, int i, boolean z, zzlb zzlbVar, zzkq zzkqVar, zzhe zzheVar, long j, boolean z2, Looper looper, zzdm zzdmVar, zzip zzipVar, zzno zznoVar, Looper looper2, byte[] bArr) {
        this.zzN = zzipVar;
        this.zza = zzknVarArr;
        this.zzd = zzwkVar;
        this.zze = zzwlVar;
        this.zzf = zzjpVar;
        this.zzg = zzwsVar;
        this.zzt = zzkqVar;
        this.zzO = zzheVar;
        this.zzs = j;
        this.zzp = zzdmVar;
        this.zzm = zzjpVar.zza();
        zzjpVar.zzf();
        zzkh zzg = zzkh.zzg(zzwlVar);
        this.zzu = zzg;
        this.zzv = new zzjk(zzg);
        int length = zzknVarArr.length;
        this.zzc = new zzko[2];
        for (int i2 = 0; i2 < 2; i2++) {
            zzknVarArr[i2].zzq(i2, zznoVar);
            this.zzc[i2] = zzknVarArr[i2].zzj();
        }
        this.zzn = new zzhh(this, zzdmVar);
        this.zzo = new ArrayList();
        this.zzb = Collections.newSetFromMap(new IdentityHashMap());
        this.zzk = new zzcm();
        this.zzl = new zzck();
        zzwkVar.zzq(this, zzwsVar);
        this.zzK = true;
        zzdv zzb = zzdmVar.zzb(looper, null);
        this.zzq = new zzju(zzlbVar, zzb);
        this.zzr = new zzkg(this, zzlbVar, zzb, zznoVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.zzi = handlerThread;
        handlerThread.start();
        Looper looper3 = handlerThread.getLooper();
        this.zzj = looper3;
        this.zzh = zzdmVar.zzb(looper3, this);
    }

    private final void zzA(zzkn zzknVar) throws zzhj {
        if (zzac(zzknVar)) {
            this.zzn.zzd(zzknVar);
            zzaj(zzknVar);
            zzknVar.zzn();
            this.zzG--;
        }
    }

    private final void zzB() throws zzhj {
        int length = this.zza.length;
        zzC(new boolean[2]);
    }

    private final void zzC(boolean[] zArr) throws zzhj {
        zzjr zze = this.zzq.zze();
        zzwl zzi = zze.zzi();
        int i = 0;
        while (true) {
            int length = this.zza.length;
            if (i >= 2) {
                break;
            }
            if (!zzi.zzb(i) && this.zzb.remove(this.zza[i])) {
                this.zza[i].zzA();
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            int length2 = this.zza.length;
            if (i2 >= 2) {
                zze.zzg = true;
                return;
            }
            if (zzi.zzb(i2)) {
                boolean z = zArr[i2];
                zzkn zzknVar = this.zza[i2];
                if (!zzac(zzknVar)) {
                    zzjr zze2 = this.zzq.zze();
                    boolean z2 = zze2 == this.zzq.zzd();
                    zzwl zzi2 = zze2.zzi();
                    zzkp zzkpVar = zzi2.zzb[i2];
                    zzaf[] zzah = zzah(zzi2.zzc[i2]);
                    boolean z3 = zzaf() && this.zzu.zze == 3;
                    boolean z4 = !z && z3;
                    this.zzG++;
                    this.zzb.add(zzknVar);
                    zzknVar.zzo(zzkpVar, zzah, zze2.zzc[i2], this.zzI, z4, z2, zze2.zzf(), zze2.zze());
                    zzknVar.zzp(11, new zzjf(this));
                    this.zzn.zze(zzknVar);
                    if (z3) {
                        zzknVar.zzE();
                    }
                }
            }
            i2++;
        }
    }

    private final void zzD(IOException iOException, int i) {
        zzhj zzc = zzhj.zzc(iOException, i);
        zzjr zzd = this.zzq.zzd();
        if (zzd != null) {
            zzc = zzc.zza(zzd.zzf.zza);
        }
        zzee.zzc("ExoPlayerImplInternal", "Playback error", zzc);
        zzU(false, false);
        this.zzu = this.zzu.zzd(zzc);
    }

    private final void zzE(boolean z) {
        zzjr zzc = this.zzq.zzc();
        zzss zzssVar = zzc == null ? this.zzu.zzb : zzc.zzf.zza;
        boolean z2 = !this.zzu.zzk.equals(zzssVar);
        if (z2) {
            this.zzu = this.zzu.zza(zzssVar);
        }
        zzkh zzkhVar = this.zzu;
        zzkhVar.zzp = zzc == null ? zzkhVar.zzr : zzc.zzc();
        this.zzu.zzq = zzt();
        if ((z2 || z) && zzc != null && zzc.zzd) {
            zzX(zzc.zzh(), zzc.zzi());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0369 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bd  */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.android.gms.internal.ads.zzck] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.google.android.gms.internal.ads.zzjl] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.gms.internal.ads.zzcn] */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.google.android.gms.internal.ads.zzcn] */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzF(com.google.android.gms.internal.ads.zzcn r29, boolean r30) throws com.google.android.gms.internal.ads.zzhj {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjm.zzF(com.google.android.gms.internal.ads.zzcn, boolean):void");
    }

    private final void zzG(zzby zzbyVar, boolean z) throws zzhj {
        zzH(zzbyVar, zzbyVar.zzc, true, z);
    }

    private final void zzH(zzby zzbyVar, float f, boolean z, boolean z2) throws zzhj {
        int i;
        zzjm zzjmVar = this;
        if (z) {
            if (z2) {
                zzjmVar.zzv.zza(1);
            }
            zzkh zzkhVar = zzjmVar.zzu;
            zzjmVar = this;
            zzjmVar.zzu = new zzkh(zzkhVar.zza, zzkhVar.zzb, zzkhVar.zzc, zzkhVar.zzd, zzkhVar.zze, zzkhVar.zzf, zzkhVar.zzg, zzkhVar.zzh, zzkhVar.zzi, zzkhVar.zzj, zzkhVar.zzk, zzkhVar.zzl, zzkhVar.zzm, zzbyVar, zzkhVar.zzp, zzkhVar.zzq, zzkhVar.zzr, zzkhVar.zzo);
        }
        float f2 = zzbyVar.zzc;
        zzjr zzd = zzjmVar.zzq.zzd();
        while (true) {
            i = 0;
            if (zzd == null) {
                break;
            }
            zzwe[] zzweVarArr = zzd.zzi().zzc;
            int length = zzweVarArr.length;
            while (i < length) {
                zzwe zzweVar = zzweVarArr[i];
                i++;
            }
            zzd = zzd.zzg();
        }
        zzkn[] zzknVarArr = zzjmVar.zza;
        int length2 = zzknVarArr.length;
        while (i < 2) {
            zzkn zzknVar = zzknVarArr[i];
            if (zzknVar != null) {
                zzknVar.zzD(f, zzbyVar.zzc);
            }
            i++;
        }
    }

    private final void zzI() {
        long zze;
        long j;
        boolean z = false;
        if (zzab()) {
            zzjr zzc = this.zzq.zzc();
            long zzu = zzu(zzc.zzd());
            if (zzc == this.zzq.zzd()) {
                zze = this.zzI;
                j = zzc.zze();
            } else {
                zze = this.zzI - zzc.zze();
                j = zzc.zzf.zzb;
            }
            long j2 = zze - j;
            boolean zzg = this.zzf.zzg(j2, zzu, this.zzn.zzc().zzc);
            if (zzg || zzu >= 500000 || this.zzm <= 0) {
                z = zzg;
            } else {
                this.zzq.zzd().zza.zzj(this.zzu.zzr, false);
                z = this.zzf.zzg(j2, zzu, this.zzn.zzc().zzc);
            }
        }
        this.zzA = z;
        if (z) {
            this.zzq.zzc().zzk(this.zzI);
        }
        zzW();
    }

    private final void zzJ() {
        boolean z;
        this.zzv.zzc(this.zzu);
        z = this.zzv.zzg;
        if (z) {
            zzip zzipVar = this.zzN;
            zzipVar.zza.zzab(this.zzv);
            this.zzv = new zzjk(this.zzu);
        }
    }

    private final void zzK(boolean z, boolean z2, boolean z3, boolean z4) {
        zzss zzssVar;
        boolean z5;
        long j;
        long j2;
        this.zzh.zzf(2);
        this.zzL = null;
        this.zzz = false;
        this.zzn.zzi();
        this.zzI = MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US;
        zzkn[] zzknVarArr = this.zza;
        int length = zzknVarArr.length;
        for (int i = 0; i < 2; i++) {
            try {
                zzA(zzknVarArr[i]);
            } catch (zzhj | RuntimeException e) {
                zzee.zzc("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        if (z) {
            zzkn[] zzknVarArr2 = this.zza;
            int length2 = zzknVarArr2.length;
            for (int i2 = 0; i2 < 2; i2++) {
                zzkn zzknVar = zzknVarArr2[i2];
                if (this.zzb.remove(zzknVar)) {
                    try {
                        zzknVar.zzA();
                    } catch (RuntimeException e2) {
                        zzee.zzc("ExoPlayerImplInternal", "Reset failed.", e2);
                    }
                }
            }
        }
        this.zzG = 0;
        zzkh zzkhVar = this.zzu;
        zzss zzssVar2 = zzkhVar.zzb;
        long j3 = zzkhVar.zzr;
        long j4 = (this.zzu.zzb.zzb() || zzae(this.zzu, this.zzl)) ? this.zzu.zzc : this.zzu.zzr;
        if (z2) {
            this.zzH = null;
            Pair zzx = zzx(this.zzu.zza);
            zzss zzssVar3 = (zzss) zzx.first;
            long longValue = ((Long) zzx.second).longValue();
            if (zzssVar3.equals(this.zzu.zzb)) {
                zzssVar = zzssVar3;
                z5 = false;
            } else {
                z5 = true;
                zzssVar = zzssVar3;
            }
            j = longValue;
            j2 = -9223372036854775807L;
        } else {
            zzssVar = zzssVar2;
            z5 = false;
            j = j3;
            j2 = j4;
        }
        this.zzq.zzi();
        this.zzA = false;
        zzkh zzkhVar2 = this.zzu;
        zzcn zzcnVar = zzkhVar2.zza;
        int i3 = zzkhVar2.zze;
        zzhj zzhjVar = z4 ? null : zzkhVar2.zzf;
        zzur zzurVar = z5 ? zzur.zza : zzkhVar2.zzh;
        zzwl zzwlVar = z5 ? this.zze : zzkhVar2.zzi;
        List zzo = z5 ? zzfqk.zzo() : zzkhVar2.zzj;
        zzkh zzkhVar3 = this.zzu;
        this.zzu = new zzkh(zzcnVar, zzssVar, j2, j, i3, zzhjVar, false, zzurVar, zzwlVar, zzo, zzssVar, zzkhVar3.zzl, zzkhVar3.zzm, zzkhVar3.zzn, j, 0L, j, false);
        if (z3) {
            this.zzr.zzg();
        }
    }

    private final void zzL() {
        zzjr zzd = this.zzq.zzd();
        boolean z = false;
        if (zzd != null && zzd.zzf.zzh && this.zzx) {
            z = true;
        }
        this.zzy = z;
    }

    private final void zzM(long j) throws zzhj {
        zzwe[] zzweVarArr;
        zzjr zzd = this.zzq.zzd();
        long zze = j + (zzd == null ? MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US : zzd.zze());
        this.zzI = zze;
        this.zzn.zzf(zze);
        zzkn[] zzknVarArr = this.zza;
        int length = zzknVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzkn zzknVar = zzknVarArr[i];
            if (zzac(zzknVar)) {
                zzknVar.zzB(this.zzI);
            }
        }
        for (zzjr zzd2 = this.zzq.zzd(); zzd2 != null; zzd2 = zzd2.zzg()) {
            for (zzwe zzweVar : zzd2.zzi().zzc) {
            }
        }
    }

    private final void zzN(zzcn zzcnVar, zzcn zzcnVar2) {
        if (zzcnVar.zzo() && zzcnVar2.zzo()) {
            return;
        }
        int size = this.zzo.size() - 1;
        if (size < 0) {
            Collections.sort(this.zzo);
            return;
        }
        Object obj = ((zzjj) this.zzo.get(size)).zzb;
        int i = zzew.zza;
        throw null;
    }

    private final void zzO(long j, long j2) {
        this.zzh.zzj(2, j + j2);
    }

    private final void zzP(boolean z) throws zzhj {
        zzss zzssVar = this.zzq.zzd().zzf.zza;
        long zzw = zzw(zzssVar, this.zzu.zzr, true, false);
        if (zzw != this.zzu.zzr) {
            zzkh zzkhVar = this.zzu;
            this.zzu = zzz(zzssVar, zzw, zzkhVar.zzc, zzkhVar.zzd, z, 5);
        }
    }

    private final void zzQ(zzkk zzkkVar) throws zzhj {
        if (zzkkVar.zzb() != this.zzj) {
            this.zzh.zzc(15, zzkkVar).zza();
            return;
        }
        zzai(zzkkVar);
        int i = this.zzu.zze;
        if (i == 3 || i == 2) {
            this.zzh.zzi(2);
        }
    }

    private final void zzR(boolean z, int i, boolean z2, int i2) throws zzhj {
        zzwe[] zzweVarArr;
        this.zzv.zza(z2 ? 1 : 0);
        this.zzv.zzb(i2);
        this.zzu = this.zzu.zzc(z, i);
        this.zzz = false;
        for (zzjr zzd = this.zzq.zzd(); zzd != null; zzd = zzd.zzg()) {
            for (zzwe zzweVar : zzd.zzi().zzc) {
            }
        }
        if (!zzaf()) {
            zzV();
            zzY();
            return;
        }
        int i3 = this.zzu.zze;
        if (i3 == 3) {
            zzT();
            this.zzh.zzi(2);
        } else if (i3 == 2) {
            this.zzh.zzi(2);
        }
    }

    private final void zzS(int i) {
        zzkh zzkhVar = this.zzu;
        if (zzkhVar.zze != i) {
            if (i != 2) {
                this.zzM = C.TIME_UNSET;
            }
            this.zzu = zzkhVar.zze(i);
        }
    }

    private final void zzT() throws zzhj {
        this.zzz = false;
        this.zzn.zzh();
        zzkn[] zzknVarArr = this.zza;
        int length = zzknVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzkn zzknVar = zzknVarArr[i];
            if (zzac(zzknVar)) {
                zzknVar.zzE();
            }
        }
    }

    private final void zzU(boolean z, boolean z2) {
        zzK(z || !this.zzD, false, true, false);
        this.zzv.zza(z2 ? 1 : 0);
        this.zzf.zzd();
        zzS(1);
    }

    private final void zzV() throws zzhj {
        this.zzn.zzi();
        zzkn[] zzknVarArr = this.zza;
        int length = zzknVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzkn zzknVar = zzknVarArr[i];
            if (zzac(zzknVar)) {
                zzaj(zzknVar);
            }
        }
    }

    private final void zzW() {
        zzjr zzc = this.zzq.zzc();
        boolean z = this.zzA || (zzc != null && zzc.zza.zzp());
        zzkh zzkhVar = this.zzu;
        if (z != zzkhVar.zzg) {
            this.zzu = new zzkh(zzkhVar.zza, zzkhVar.zzb, zzkhVar.zzc, zzkhVar.zzd, zzkhVar.zze, zzkhVar.zzf, z, zzkhVar.zzh, zzkhVar.zzi, zzkhVar.zzj, zzkhVar.zzk, zzkhVar.zzl, zzkhVar.zzm, zzkhVar.zzn, zzkhVar.zzp, zzkhVar.zzq, zzkhVar.zzr, zzkhVar.zzo);
        }
    }

    private final void zzX(zzur zzurVar, zzwl zzwlVar) {
        this.zzf.zze(this.zza, zzurVar, zzwlVar.zzc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
        if (r5 > 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
        if (r7 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
        if (r0 < 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
        if (r0 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
        if (r3 >= 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
        if (r5 <= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
        r7 = (com.google.android.gms.internal.ads.zzjj) r11.zzo.get(r5 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ac, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        if (r5 >= r11.zzo.size()) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b6, code lost:
        r0 = (com.google.android.gms.internal.ads.zzjj) r11.zzo.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
        r11.zzJ = r5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009f -> B:37:0x00ac). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00a1 -> B:29:0x0091). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzY() throws com.google.android.gms.internal.ads.zzhj {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjm.zzY():void");
    }

    private final void zzZ(zzcn zzcnVar, zzss zzssVar, zzcn zzcnVar2, zzss zzssVar2, long j) {
        if (!zzag(zzcnVar, zzssVar)) {
            zzby zzbyVar = zzssVar.zzb() ? zzby.zza : this.zzu.zzn;
            if (this.zzn.zzc().equals(zzbyVar)) {
                return;
            }
            this.zzn.zzg(zzbyVar);
            return;
        }
        zzcnVar.zze(zzcnVar.zzn(zzssVar.zza, this.zzl).zzd, this.zzk, 0L);
        zzhe zzheVar = this.zzO;
        zzaw zzawVar = this.zzk.zzk;
        int i = zzew.zza;
        zzheVar.zzd(zzawVar);
        if (j != C.TIME_UNSET) {
            this.zzO.zze(zzs(zzcnVar, zzssVar.zza, j));
            return;
        }
        if (zzew.zzU(!zzcnVar2.zzo() ? zzcnVar2.zze(zzcnVar2.zzn(zzssVar2.zza, this.zzl).zzd, this.zzk, 0L).zzc : null, this.zzk.zzc)) {
            return;
        }
        this.zzO.zze(C.TIME_UNSET);
    }

    private final synchronized void zzaa(zzfok zzfokVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!Boolean.valueOf(((zzjd) zzfokVar).zza.zzw).booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean zzab() {
        zzjr zzc = this.zzq.zzc();
        return (zzc == null || zzc.zzd() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean zzac(zzkn zzknVar) {
        return zzknVar.zzbc() != 0;
    }

    private final boolean zzad() {
        zzjr zzd = this.zzq.zzd();
        long j = zzd.zzf.zze;
        if (zzd.zzd) {
            if (j == C.TIME_UNSET || this.zzu.zzr < j) {
                return true;
            }
            return !zzaf();
        }
        return false;
    }

    private static boolean zzae(zzkh zzkhVar, zzck zzckVar) {
        zzss zzssVar = zzkhVar.zzb;
        zzcn zzcnVar = zzkhVar.zza;
        return zzcnVar.zzo() || zzcnVar.zzn(zzssVar.zza, zzckVar).zzg;
    }

    private final boolean zzaf() {
        zzkh zzkhVar = this.zzu;
        return zzkhVar.zzl && zzkhVar.zzm == 0;
    }

    private final boolean zzag(zzcn zzcnVar, zzss zzssVar) {
        if (!zzssVar.zzb() && !zzcnVar.zzo()) {
            zzcnVar.zze(zzcnVar.zzn(zzssVar.zza, this.zzl).zzd, this.zzk, 0L);
            if (this.zzk.zzb()) {
                zzcm zzcmVar = this.zzk;
                if (zzcmVar.zzi && zzcmVar.zzf != C.TIME_UNSET) {
                    return true;
                }
            }
        }
        return false;
    }

    private static zzaf[] zzah(zzwe zzweVar) {
        int zzc = zzweVar != null ? zzweVar.zzc() : 0;
        zzaf[] zzafVarArr = new zzaf[zzc];
        for (int i = 0; i < zzc; i++) {
            zzafVarArr[i] = zzweVar.zzd(i);
        }
        return zzafVarArr;
    }

    private static final void zzai(zzkk zzkkVar) throws zzhj {
        zzkkVar.zzj();
        try {
            zzkkVar.zzc().zzp(zzkkVar.zza(), zzkkVar.zzg());
        } finally {
            zzkkVar.zzh(true);
        }
    }

    private static final void zzaj(zzkn zzknVar) throws zzhj {
        if (zzknVar.zzbc() == 2) {
            zzknVar.zzF();
        }
    }

    private static final void zzak(zzkn zzknVar, long j) {
        zzknVar.zzC();
        if (zzknVar instanceof zzuv) {
            zzuv zzuvVar = (zzuv) zzknVar;
            throw null;
        }
    }

    @o0OO00OO
    public static Object zze(zzcm zzcmVar, zzck zzckVar, int i, boolean z, Object obj, zzcn zzcnVar, zzcn zzcnVar2) {
        int zza = zzcnVar.zza(obj);
        int zzb = zzcnVar.zzb();
        int i2 = 0;
        int i3 = zza;
        int i4 = -1;
        while (true) {
            if (i2 >= zzb || i4 != -1) {
                break;
            }
            i3 = zzcnVar.zzi(i3, zzckVar, zzcmVar, i, z);
            if (i3 == -1) {
                i4 = -1;
                break;
            }
            i4 = zzcnVar2.zza(zzcnVar.zzf(i3));
            i2++;
        }
        if (i4 == -1) {
            return null;
        }
        return zzcnVar2.zzf(i4);
    }

    public static final /* synthetic */ void zzr(zzkk zzkkVar) {
        try {
            zzai(zzkkVar);
        } catch (zzhj e) {
            zzee.zzc("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private final long zzs(zzcn zzcnVar, Object obj, long j) {
        zzcnVar.zze(zzcnVar.zzn(obj, this.zzl).zzd, this.zzk, 0L);
        zzcm zzcmVar = this.zzk;
        if (zzcmVar.zzf != C.TIME_UNSET && zzcmVar.zzb()) {
            zzcm zzcmVar2 = this.zzk;
            if (zzcmVar2.zzi) {
                return zzew.zzv(zzew.zzt(zzcmVar2.zzg) - this.zzk.zzf) - j;
            }
        }
        return C.TIME_UNSET;
    }

    private final long zzt() {
        return zzu(this.zzu.zzp);
    }

    private final long zzu(long j) {
        zzjr zzc = this.zzq.zzc();
        if (zzc == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzI - zzc.zze()));
    }

    private final long zzv(zzss zzssVar, long j, boolean z) throws zzhj {
        return zzw(zzssVar, j, this.zzq.zzd() != this.zzq.zze(), z);
    }

    private final long zzw(zzss zzssVar, long j, boolean z, boolean z2) throws zzhj {
        zzV();
        this.zzz = false;
        if (z2 || this.zzu.zze == 3) {
            zzS(2);
        }
        zzjr zzd = this.zzq.zzd();
        zzjr zzjrVar = zzd;
        while (zzjrVar != null && !zzssVar.equals(zzjrVar.zzf.zza)) {
            zzjrVar = zzjrVar.zzg();
        }
        if (z || zzd != zzjrVar || (zzjrVar != null && zzjrVar.zze() + j < 0)) {
            zzkn[] zzknVarArr = this.zza;
            int length = zzknVarArr.length;
            for (int i = 0; i < 2; i++) {
                zzA(zzknVarArr[i]);
            }
            if (zzjrVar != null) {
                while (this.zzq.zzd() != zzjrVar) {
                    this.zzq.zza();
                }
                this.zzq.zzm(zzjrVar);
                zzjrVar.zzp(MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US);
                zzB();
            }
        }
        zzju zzjuVar = this.zzq;
        if (zzjrVar != null) {
            zzjuVar.zzm(zzjrVar);
            if (!zzjrVar.zzd) {
                zzjrVar.zzf = zzjrVar.zzf.zzb(j);
            } else if (zzjrVar.zze) {
                j = zzjrVar.zza.zze(j);
                zzjrVar.zza.zzj(j - this.zzm, false);
            }
            zzM(j);
            zzI();
        } else {
            zzjuVar.zzi();
            zzM(j);
        }
        zzE(false);
        this.zzh.zzi(2);
        return j;
    }

    private final Pair zzx(zzcn zzcnVar) {
        long j = 0;
        if (zzcnVar.zzo()) {
            return Pair.create(zzkh.zzh(), 0L);
        }
        Pair zzl = zzcnVar.zzl(this.zzk, this.zzl, zzcnVar.zzg(this.zzC), C.TIME_UNSET);
        zzss zzh = this.zzq.zzh(zzcnVar, zzl.first, 0L);
        long longValue = ((Long) zzl.second).longValue();
        if (zzh.zzb()) {
            zzcnVar.zzn(zzh.zza, this.zzl);
            if (zzh.zzc == this.zzl.zze(zzh.zzb)) {
                this.zzl.zzi();
            }
        } else {
            j = longValue;
        }
        return Pair.create(zzh, Long.valueOf(j));
    }

    @o0OO00OO
    private static Pair zzy(zzcn zzcnVar, zzjl zzjlVar, boolean z, int i, boolean z2, zzcm zzcmVar, zzck zzckVar) {
        Pair zzl;
        int i2;
        long j;
        zzcn zzcnVar2 = zzjlVar.zza;
        if (zzcnVar.zzo()) {
            return null;
        }
        zzcn zzcnVar3 = true == zzcnVar2.zzo() ? zzcnVar : zzcnVar2;
        try {
            zzl = zzcnVar3.zzl(zzcmVar, zzckVar, zzjlVar.zzb, zzjlVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzcnVar.equals(zzcnVar3)) {
            return zzl;
        }
        if (zzcnVar.zza(zzl.first) == -1) {
            Object zze = zze(zzcmVar, zzckVar, i, z2, zzl.first, zzcnVar3, zzcnVar);
            if (zze != null) {
                i2 = zzcnVar.zzn(zze, zzckVar).zzd;
                j = C.TIME_UNSET;
            }
            return null;
        } else if (!zzcnVar3.zzn(zzl.first, zzckVar).zzg || zzcnVar3.zze(zzckVar.zzd, zzcmVar, 0L).zzo != zzcnVar3.zza(zzl.first)) {
            return zzl;
        } else {
            i2 = zzcnVar.zzn(zzl.first, zzckVar).zzd;
            j = zzjlVar.zzc;
        }
        return zzcnVar.zzl(zzcmVar, zzckVar, i2, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    @o00oOooO.o0OoO00O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.ads.zzkh zzz(com.google.android.gms.internal.ads.zzss r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjm.zzz(com.google.android.gms.internal.ads.zzss, long, long, long, boolean, int):com.google.android.gms.internal.ads.zzkh");
    }

    /* JADX WARN: Code restructure failed: missing block: B:467:0x08f7, code lost:
        if (r53.zzf.zzh(zzt(), r53.zzn.zzc().zzc, r53.zzz, r31) == false) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x091a, code lost:
        if (r3 == false) goto L484;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:330:0x06c1 A[Catch: RuntimeException -> 0x0aab, IOException -> 0x0ad5, zzru -> 0x0ada, zzfh -> 0x0adf, zzbu -> 0x0ae4, zzpr -> 0x0afb, zzhj -> 0x0b04, TryCatch #9 {zzbu -> 0x0ae4, zzfh -> 0x0adf, zzhj -> 0x0b04, zzpr -> 0x0afb, zzru -> 0x0ada, IOException -> 0x0ad5, RuntimeException -> 0x0aab, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:9:0x001c, B:13:0x0023, B:15:0x0027, B:17:0x002b, B:19:0x0031, B:20:0x0037, B:24:0x003e, B:26:0x0047, B:28:0x0055, B:29:0x0058, B:30:0x005c, B:31:0x0066, B:32:0x0075, B:33:0x0079, B:34:0x008d, B:35:0x009f, B:37:0x00ae, B:38:0x00b2, B:39:0x00bf, B:41:0x00ce, B:42:0x00ea, B:43:0x00fa, B:44:0x0103, B:46:0x0115, B:47:0x0121, B:48:0x0131, B:49:0x013a, B:53:0x0141, B:55:0x0149, B:57:0x014d, B:59:0x0153, B:61:0x015b, B:63:0x0163, B:64:0x0166, B:66:0x016b, B:73:0x0178, B:74:0x0179, B:78:0x0180, B:80:0x018e, B:81:0x0193, B:83:0x01a3, B:84:0x01a8, B:86:0x01bf, B:88:0x01c3, B:90:0x01d1, B:94:0x01db, B:96:0x01e0, B:98:0x01e6, B:102:0x01ee, B:104:0x01f6, B:106:0x021c, B:110:0x0225, B:112:0x0247, B:113:0x024a, B:114:0x0250, B:116:0x0255, B:118:0x0265, B:120:0x026b, B:121:0x026f, B:123:0x0273, B:124:0x0278, B:125:0x027d, B:129:0x029e, B:131:0x02a9, B:126:0x0281, B:128:0x028b, B:132:0x02b6, B:134:0x02c2, B:135:0x02c9, B:136:0x02ce, B:138:0x02da, B:140:0x0302, B:141:0x0323, B:143:0x0334, B:144:0x0337, B:152:0x0343, B:153:0x0344, B:154:0x034b, B:155:0x0353, B:156:0x0368, B:158:0x0394, B:223:0x04b6, B:208:0x0482, B:207:0x047e, B:232:0x04cd, B:233:0x04dd, B:159:0x03b7, B:163:0x03ca, B:165:0x03da, B:167:0x03f1, B:169:0x03fb, B:234:0x04de, B:236:0x04f3, B:239:0x04fd, B:241:0x050c, B:243:0x0518, B:245:0x0547, B:246:0x054c, B:247:0x0550, B:249:0x0554, B:251:0x0561, B:320:0x069a, B:322:0x06a2, B:324:0x06aa, B:327:0x06af, B:328:0x06bb, B:330:0x06c1, B:332:0x06c9, B:335:0x06d9, B:337:0x06df, B:338:0x06f9, B:340:0x06ff, B:342:0x0704, B:344:0x0709, B:346:0x070d, B:348:0x0713, B:350:0x0717, B:352:0x071f, B:354:0x0725, B:356:0x072f, B:359:0x0735, B:360:0x0738, B:362:0x0741, B:364:0x0753, B:366:0x075b, B:368:0x0763, B:372:0x076c, B:375:0x0798, B:380:0x07a4, B:382:0x07b0, B:383:0x07b5, B:385:0x07c5, B:386:0x07da, B:388:0x07e0, B:390:0x07e8, B:392:0x07ef, B:396:0x07f8, B:401:0x0807, B:407:0x0814, B:409:0x081a, B:419:0x082d, B:420:0x0830, B:422:0x083f, B:424:0x0845, B:428:0x0852, B:430:0x085a, B:432:0x085e, B:433:0x0869, B:435:0x086f, B:436:0x0873, B:488:0x094d, B:491:0x0955, B:493:0x095a, B:495:0x0962, B:497:0x0970, B:498:0x0977, B:499:0x097b, B:501:0x0981, B:503:0x098a, B:505:0x0990, B:507:0x099b, B:508:0x099f, B:515:0x09be, B:517:0x09c4, B:521:0x09cd, B:523:0x09d1, B:528:0x09da, B:530:0x09e0, B:532:0x0a3c, B:534:0x0a41, B:543:0x0a52, B:545:0x0a56, B:546:0x0a5e, B:547:0x0a65, B:509:0x09a2, B:512:0x09b0, B:513:0x09b7, B:437:0x0878, B:471:0x0909, B:473:0x090f, B:475:0x0913, B:479:0x091c, B:481:0x092a, B:483:0x0932, B:485:0x093c, B:486:0x0941, B:487:0x0946, B:440:0x0881, B:442:0x0885, B:468:0x08f9, B:470:0x0905, B:446:0x088f, B:448:0x0893, B:450:0x08a5, B:452:0x08b3, B:454:0x08bf, B:458:0x08c8, B:460:0x08d2, B:466:0x08dd, B:421:0x0838, B:254:0x056e, B:256:0x0574, B:259:0x057a, B:262:0x0585, B:264:0x058b, B:267:0x0599, B:269:0x059f, B:270:0x05a7, B:271:0x05aa, B:273:0x05b2, B:275:0x05c0, B:277:0x05f3, B:279:0x05fd, B:282:0x0608, B:284:0x0610, B:285:0x0613, B:287:0x0617, B:289:0x061d, B:291:0x0627, B:293:0x0631, B:295:0x0642, B:297:0x0648, B:298:0x0653, B:299:0x0656, B:301:0x065f, B:304:0x0664, B:306:0x066a, B:308:0x0672, B:310:0x0678, B:312:0x067e, B:316:0x068c, B:318:0x0694, B:319:0x0697, B:250:0x055e, B:549:0x0a6d, B:553:0x0a74, B:554:0x0a7c, B:558:0x0a9a), top: B:619:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0735 A[Catch: RuntimeException -> 0x0aab, IOException -> 0x0ad5, zzru -> 0x0ada, zzfh -> 0x0adf, zzbu -> 0x0ae4, zzpr -> 0x0afb, zzhj -> 0x0b04, TryCatch #9 {zzbu -> 0x0ae4, zzfh -> 0x0adf, zzhj -> 0x0b04, zzpr -> 0x0afb, zzru -> 0x0ada, IOException -> 0x0ad5, RuntimeException -> 0x0aab, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:9:0x001c, B:13:0x0023, B:15:0x0027, B:17:0x002b, B:19:0x0031, B:20:0x0037, B:24:0x003e, B:26:0x0047, B:28:0x0055, B:29:0x0058, B:30:0x005c, B:31:0x0066, B:32:0x0075, B:33:0x0079, B:34:0x008d, B:35:0x009f, B:37:0x00ae, B:38:0x00b2, B:39:0x00bf, B:41:0x00ce, B:42:0x00ea, B:43:0x00fa, B:44:0x0103, B:46:0x0115, B:47:0x0121, B:48:0x0131, B:49:0x013a, B:53:0x0141, B:55:0x0149, B:57:0x014d, B:59:0x0153, B:61:0x015b, B:63:0x0163, B:64:0x0166, B:66:0x016b, B:73:0x0178, B:74:0x0179, B:78:0x0180, B:80:0x018e, B:81:0x0193, B:83:0x01a3, B:84:0x01a8, B:86:0x01bf, B:88:0x01c3, B:90:0x01d1, B:94:0x01db, B:96:0x01e0, B:98:0x01e6, B:102:0x01ee, B:104:0x01f6, B:106:0x021c, B:110:0x0225, B:112:0x0247, B:113:0x024a, B:114:0x0250, B:116:0x0255, B:118:0x0265, B:120:0x026b, B:121:0x026f, B:123:0x0273, B:124:0x0278, B:125:0x027d, B:129:0x029e, B:131:0x02a9, B:126:0x0281, B:128:0x028b, B:132:0x02b6, B:134:0x02c2, B:135:0x02c9, B:136:0x02ce, B:138:0x02da, B:140:0x0302, B:141:0x0323, B:143:0x0334, B:144:0x0337, B:152:0x0343, B:153:0x0344, B:154:0x034b, B:155:0x0353, B:156:0x0368, B:158:0x0394, B:223:0x04b6, B:208:0x0482, B:207:0x047e, B:232:0x04cd, B:233:0x04dd, B:159:0x03b7, B:163:0x03ca, B:165:0x03da, B:167:0x03f1, B:169:0x03fb, B:234:0x04de, B:236:0x04f3, B:239:0x04fd, B:241:0x050c, B:243:0x0518, B:245:0x0547, B:246:0x054c, B:247:0x0550, B:249:0x0554, B:251:0x0561, B:320:0x069a, B:322:0x06a2, B:324:0x06aa, B:327:0x06af, B:328:0x06bb, B:330:0x06c1, B:332:0x06c9, B:335:0x06d9, B:337:0x06df, B:338:0x06f9, B:340:0x06ff, B:342:0x0704, B:344:0x0709, B:346:0x070d, B:348:0x0713, B:350:0x0717, B:352:0x071f, B:354:0x0725, B:356:0x072f, B:359:0x0735, B:360:0x0738, B:362:0x0741, B:364:0x0753, B:366:0x075b, B:368:0x0763, B:372:0x076c, B:375:0x0798, B:380:0x07a4, B:382:0x07b0, B:383:0x07b5, B:385:0x07c5, B:386:0x07da, B:388:0x07e0, B:390:0x07e8, B:392:0x07ef, B:396:0x07f8, B:401:0x0807, B:407:0x0814, B:409:0x081a, B:419:0x082d, B:420:0x0830, B:422:0x083f, B:424:0x0845, B:428:0x0852, B:430:0x085a, B:432:0x085e, B:433:0x0869, B:435:0x086f, B:436:0x0873, B:488:0x094d, B:491:0x0955, B:493:0x095a, B:495:0x0962, B:497:0x0970, B:498:0x0977, B:499:0x097b, B:501:0x0981, B:503:0x098a, B:505:0x0990, B:507:0x099b, B:508:0x099f, B:515:0x09be, B:517:0x09c4, B:521:0x09cd, B:523:0x09d1, B:528:0x09da, B:530:0x09e0, B:532:0x0a3c, B:534:0x0a41, B:543:0x0a52, B:545:0x0a56, B:546:0x0a5e, B:547:0x0a65, B:509:0x09a2, B:512:0x09b0, B:513:0x09b7, B:437:0x0878, B:471:0x0909, B:473:0x090f, B:475:0x0913, B:479:0x091c, B:481:0x092a, B:483:0x0932, B:485:0x093c, B:486:0x0941, B:487:0x0946, B:440:0x0881, B:442:0x0885, B:468:0x08f9, B:470:0x0905, B:446:0x088f, B:448:0x0893, B:450:0x08a5, B:452:0x08b3, B:454:0x08bf, B:458:0x08c8, B:460:0x08d2, B:466:0x08dd, B:421:0x0838, B:254:0x056e, B:256:0x0574, B:259:0x057a, B:262:0x0585, B:264:0x058b, B:267:0x0599, B:269:0x059f, B:270:0x05a7, B:271:0x05aa, B:273:0x05b2, B:275:0x05c0, B:277:0x05f3, B:279:0x05fd, B:282:0x0608, B:284:0x0610, B:285:0x0613, B:287:0x0617, B:289:0x061d, B:291:0x0627, B:293:0x0631, B:295:0x0642, B:297:0x0648, B:298:0x0653, B:299:0x0656, B:301:0x065f, B:304:0x0664, B:306:0x066a, B:308:0x0672, B:310:0x0678, B:312:0x067e, B:316:0x068c, B:318:0x0694, B:319:0x0697, B:250:0x055e, B:549:0x0a6d, B:553:0x0a74, B:554:0x0a7c, B:558:0x0a9a), top: B:619:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0753 A[Catch: RuntimeException -> 0x0aab, IOException -> 0x0ad5, zzru -> 0x0ada, zzfh -> 0x0adf, zzbu -> 0x0ae4, zzpr -> 0x0afb, zzhj -> 0x0b04, TryCatch #9 {zzbu -> 0x0ae4, zzfh -> 0x0adf, zzhj -> 0x0b04, zzpr -> 0x0afb, zzru -> 0x0ada, IOException -> 0x0ad5, RuntimeException -> 0x0aab, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:9:0x001c, B:13:0x0023, B:15:0x0027, B:17:0x002b, B:19:0x0031, B:20:0x0037, B:24:0x003e, B:26:0x0047, B:28:0x0055, B:29:0x0058, B:30:0x005c, B:31:0x0066, B:32:0x0075, B:33:0x0079, B:34:0x008d, B:35:0x009f, B:37:0x00ae, B:38:0x00b2, B:39:0x00bf, B:41:0x00ce, B:42:0x00ea, B:43:0x00fa, B:44:0x0103, B:46:0x0115, B:47:0x0121, B:48:0x0131, B:49:0x013a, B:53:0x0141, B:55:0x0149, B:57:0x014d, B:59:0x0153, B:61:0x015b, B:63:0x0163, B:64:0x0166, B:66:0x016b, B:73:0x0178, B:74:0x0179, B:78:0x0180, B:80:0x018e, B:81:0x0193, B:83:0x01a3, B:84:0x01a8, B:86:0x01bf, B:88:0x01c3, B:90:0x01d1, B:94:0x01db, B:96:0x01e0, B:98:0x01e6, B:102:0x01ee, B:104:0x01f6, B:106:0x021c, B:110:0x0225, B:112:0x0247, B:113:0x024a, B:114:0x0250, B:116:0x0255, B:118:0x0265, B:120:0x026b, B:121:0x026f, B:123:0x0273, B:124:0x0278, B:125:0x027d, B:129:0x029e, B:131:0x02a9, B:126:0x0281, B:128:0x028b, B:132:0x02b6, B:134:0x02c2, B:135:0x02c9, B:136:0x02ce, B:138:0x02da, B:140:0x0302, B:141:0x0323, B:143:0x0334, B:144:0x0337, B:152:0x0343, B:153:0x0344, B:154:0x034b, B:155:0x0353, B:156:0x0368, B:158:0x0394, B:223:0x04b6, B:208:0x0482, B:207:0x047e, B:232:0x04cd, B:233:0x04dd, B:159:0x03b7, B:163:0x03ca, B:165:0x03da, B:167:0x03f1, B:169:0x03fb, B:234:0x04de, B:236:0x04f3, B:239:0x04fd, B:241:0x050c, B:243:0x0518, B:245:0x0547, B:246:0x054c, B:247:0x0550, B:249:0x0554, B:251:0x0561, B:320:0x069a, B:322:0x06a2, B:324:0x06aa, B:327:0x06af, B:328:0x06bb, B:330:0x06c1, B:332:0x06c9, B:335:0x06d9, B:337:0x06df, B:338:0x06f9, B:340:0x06ff, B:342:0x0704, B:344:0x0709, B:346:0x070d, B:348:0x0713, B:350:0x0717, B:352:0x071f, B:354:0x0725, B:356:0x072f, B:359:0x0735, B:360:0x0738, B:362:0x0741, B:364:0x0753, B:366:0x075b, B:368:0x0763, B:372:0x076c, B:375:0x0798, B:380:0x07a4, B:382:0x07b0, B:383:0x07b5, B:385:0x07c5, B:386:0x07da, B:388:0x07e0, B:390:0x07e8, B:392:0x07ef, B:396:0x07f8, B:401:0x0807, B:407:0x0814, B:409:0x081a, B:419:0x082d, B:420:0x0830, B:422:0x083f, B:424:0x0845, B:428:0x0852, B:430:0x085a, B:432:0x085e, B:433:0x0869, B:435:0x086f, B:436:0x0873, B:488:0x094d, B:491:0x0955, B:493:0x095a, B:495:0x0962, B:497:0x0970, B:498:0x0977, B:499:0x097b, B:501:0x0981, B:503:0x098a, B:505:0x0990, B:507:0x099b, B:508:0x099f, B:515:0x09be, B:517:0x09c4, B:521:0x09cd, B:523:0x09d1, B:528:0x09da, B:530:0x09e0, B:532:0x0a3c, B:534:0x0a41, B:543:0x0a52, B:545:0x0a56, B:546:0x0a5e, B:547:0x0a65, B:509:0x09a2, B:512:0x09b0, B:513:0x09b7, B:437:0x0878, B:471:0x0909, B:473:0x090f, B:475:0x0913, B:479:0x091c, B:481:0x092a, B:483:0x0932, B:485:0x093c, B:486:0x0941, B:487:0x0946, B:440:0x0881, B:442:0x0885, B:468:0x08f9, B:470:0x0905, B:446:0x088f, B:448:0x0893, B:450:0x08a5, B:452:0x08b3, B:454:0x08bf, B:458:0x08c8, B:460:0x08d2, B:466:0x08dd, B:421:0x0838, B:254:0x056e, B:256:0x0574, B:259:0x057a, B:262:0x0585, B:264:0x058b, B:267:0x0599, B:269:0x059f, B:270:0x05a7, B:271:0x05aa, B:273:0x05b2, B:275:0x05c0, B:277:0x05f3, B:279:0x05fd, B:282:0x0608, B:284:0x0610, B:285:0x0613, B:287:0x0617, B:289:0x061d, B:291:0x0627, B:293:0x0631, B:295:0x0642, B:297:0x0648, B:298:0x0653, B:299:0x0656, B:301:0x065f, B:304:0x0664, B:306:0x066a, B:308:0x0672, B:310:0x0678, B:312:0x067e, B:316:0x068c, B:318:0x0694, B:319:0x0697, B:250:0x055e, B:549:0x0a6d, B:553:0x0a74, B:554:0x0a7c, B:558:0x0a9a), top: B:619:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x082d A[Catch: RuntimeException -> 0x0aab, IOException -> 0x0ad5, zzru -> 0x0ada, zzfh -> 0x0adf, zzbu -> 0x0ae4, zzpr -> 0x0afb, zzhj -> 0x0b04, TryCatch #9 {zzbu -> 0x0ae4, zzfh -> 0x0adf, zzhj -> 0x0b04, zzpr -> 0x0afb, zzru -> 0x0ada, IOException -> 0x0ad5, RuntimeException -> 0x0aab, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:9:0x001c, B:13:0x0023, B:15:0x0027, B:17:0x002b, B:19:0x0031, B:20:0x0037, B:24:0x003e, B:26:0x0047, B:28:0x0055, B:29:0x0058, B:30:0x005c, B:31:0x0066, B:32:0x0075, B:33:0x0079, B:34:0x008d, B:35:0x009f, B:37:0x00ae, B:38:0x00b2, B:39:0x00bf, B:41:0x00ce, B:42:0x00ea, B:43:0x00fa, B:44:0x0103, B:46:0x0115, B:47:0x0121, B:48:0x0131, B:49:0x013a, B:53:0x0141, B:55:0x0149, B:57:0x014d, B:59:0x0153, B:61:0x015b, B:63:0x0163, B:64:0x0166, B:66:0x016b, B:73:0x0178, B:74:0x0179, B:78:0x0180, B:80:0x018e, B:81:0x0193, B:83:0x01a3, B:84:0x01a8, B:86:0x01bf, B:88:0x01c3, B:90:0x01d1, B:94:0x01db, B:96:0x01e0, B:98:0x01e6, B:102:0x01ee, B:104:0x01f6, B:106:0x021c, B:110:0x0225, B:112:0x0247, B:113:0x024a, B:114:0x0250, B:116:0x0255, B:118:0x0265, B:120:0x026b, B:121:0x026f, B:123:0x0273, B:124:0x0278, B:125:0x027d, B:129:0x029e, B:131:0x02a9, B:126:0x0281, B:128:0x028b, B:132:0x02b6, B:134:0x02c2, B:135:0x02c9, B:136:0x02ce, B:138:0x02da, B:140:0x0302, B:141:0x0323, B:143:0x0334, B:144:0x0337, B:152:0x0343, B:153:0x0344, B:154:0x034b, B:155:0x0353, B:156:0x0368, B:158:0x0394, B:223:0x04b6, B:208:0x0482, B:207:0x047e, B:232:0x04cd, B:233:0x04dd, B:159:0x03b7, B:163:0x03ca, B:165:0x03da, B:167:0x03f1, B:169:0x03fb, B:234:0x04de, B:236:0x04f3, B:239:0x04fd, B:241:0x050c, B:243:0x0518, B:245:0x0547, B:246:0x054c, B:247:0x0550, B:249:0x0554, B:251:0x0561, B:320:0x069a, B:322:0x06a2, B:324:0x06aa, B:327:0x06af, B:328:0x06bb, B:330:0x06c1, B:332:0x06c9, B:335:0x06d9, B:337:0x06df, B:338:0x06f9, B:340:0x06ff, B:342:0x0704, B:344:0x0709, B:346:0x070d, B:348:0x0713, B:350:0x0717, B:352:0x071f, B:354:0x0725, B:356:0x072f, B:359:0x0735, B:360:0x0738, B:362:0x0741, B:364:0x0753, B:366:0x075b, B:368:0x0763, B:372:0x076c, B:375:0x0798, B:380:0x07a4, B:382:0x07b0, B:383:0x07b5, B:385:0x07c5, B:386:0x07da, B:388:0x07e0, B:390:0x07e8, B:392:0x07ef, B:396:0x07f8, B:401:0x0807, B:407:0x0814, B:409:0x081a, B:419:0x082d, B:420:0x0830, B:422:0x083f, B:424:0x0845, B:428:0x0852, B:430:0x085a, B:432:0x085e, B:433:0x0869, B:435:0x086f, B:436:0x0873, B:488:0x094d, B:491:0x0955, B:493:0x095a, B:495:0x0962, B:497:0x0970, B:498:0x0977, B:499:0x097b, B:501:0x0981, B:503:0x098a, B:505:0x0990, B:507:0x099b, B:508:0x099f, B:515:0x09be, B:517:0x09c4, B:521:0x09cd, B:523:0x09d1, B:528:0x09da, B:530:0x09e0, B:532:0x0a3c, B:534:0x0a41, B:543:0x0a52, B:545:0x0a56, B:546:0x0a5e, B:547:0x0a65, B:509:0x09a2, B:512:0x09b0, B:513:0x09b7, B:437:0x0878, B:471:0x0909, B:473:0x090f, B:475:0x0913, B:479:0x091c, B:481:0x092a, B:483:0x0932, B:485:0x093c, B:486:0x0941, B:487:0x0946, B:440:0x0881, B:442:0x0885, B:468:0x08f9, B:470:0x0905, B:446:0x088f, B:448:0x0893, B:450:0x08a5, B:452:0x08b3, B:454:0x08bf, B:458:0x08c8, B:460:0x08d2, B:466:0x08dd, B:421:0x0838, B:254:0x056e, B:256:0x0574, B:259:0x057a, B:262:0x0585, B:264:0x058b, B:267:0x0599, B:269:0x059f, B:270:0x05a7, B:271:0x05aa, B:273:0x05b2, B:275:0x05c0, B:277:0x05f3, B:279:0x05fd, B:282:0x0608, B:284:0x0610, B:285:0x0613, B:287:0x0617, B:289:0x061d, B:291:0x0627, B:293:0x0631, B:295:0x0642, B:297:0x0648, B:298:0x0653, B:299:0x0656, B:301:0x065f, B:304:0x0664, B:306:0x066a, B:308:0x0672, B:310:0x0678, B:312:0x067e, B:316:0x068c, B:318:0x0694, B:319:0x0697, B:250:0x055e, B:549:0x0a6d, B:553:0x0a74, B:554:0x0a7c, B:558:0x0a9a), top: B:619:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0905 A[Catch: RuntimeException -> 0x0aab, IOException -> 0x0ad5, zzru -> 0x0ada, zzfh -> 0x0adf, zzbu -> 0x0ae4, zzpr -> 0x0afb, zzhj -> 0x0b04, TryCatch #9 {zzbu -> 0x0ae4, zzfh -> 0x0adf, zzhj -> 0x0b04, zzpr -> 0x0afb, zzru -> 0x0ada, IOException -> 0x0ad5, RuntimeException -> 0x0aab, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:9:0x001c, B:13:0x0023, B:15:0x0027, B:17:0x002b, B:19:0x0031, B:20:0x0037, B:24:0x003e, B:26:0x0047, B:28:0x0055, B:29:0x0058, B:30:0x005c, B:31:0x0066, B:32:0x0075, B:33:0x0079, B:34:0x008d, B:35:0x009f, B:37:0x00ae, B:38:0x00b2, B:39:0x00bf, B:41:0x00ce, B:42:0x00ea, B:43:0x00fa, B:44:0x0103, B:46:0x0115, B:47:0x0121, B:48:0x0131, B:49:0x013a, B:53:0x0141, B:55:0x0149, B:57:0x014d, B:59:0x0153, B:61:0x015b, B:63:0x0163, B:64:0x0166, B:66:0x016b, B:73:0x0178, B:74:0x0179, B:78:0x0180, B:80:0x018e, B:81:0x0193, B:83:0x01a3, B:84:0x01a8, B:86:0x01bf, B:88:0x01c3, B:90:0x01d1, B:94:0x01db, B:96:0x01e0, B:98:0x01e6, B:102:0x01ee, B:104:0x01f6, B:106:0x021c, B:110:0x0225, B:112:0x0247, B:113:0x024a, B:114:0x0250, B:116:0x0255, B:118:0x0265, B:120:0x026b, B:121:0x026f, B:123:0x0273, B:124:0x0278, B:125:0x027d, B:129:0x029e, B:131:0x02a9, B:126:0x0281, B:128:0x028b, B:132:0x02b6, B:134:0x02c2, B:135:0x02c9, B:136:0x02ce, B:138:0x02da, B:140:0x0302, B:141:0x0323, B:143:0x0334, B:144:0x0337, B:152:0x0343, B:153:0x0344, B:154:0x034b, B:155:0x0353, B:156:0x0368, B:158:0x0394, B:223:0x04b6, B:208:0x0482, B:207:0x047e, B:232:0x04cd, B:233:0x04dd, B:159:0x03b7, B:163:0x03ca, B:165:0x03da, B:167:0x03f1, B:169:0x03fb, B:234:0x04de, B:236:0x04f3, B:239:0x04fd, B:241:0x050c, B:243:0x0518, B:245:0x0547, B:246:0x054c, B:247:0x0550, B:249:0x0554, B:251:0x0561, B:320:0x069a, B:322:0x06a2, B:324:0x06aa, B:327:0x06af, B:328:0x06bb, B:330:0x06c1, B:332:0x06c9, B:335:0x06d9, B:337:0x06df, B:338:0x06f9, B:340:0x06ff, B:342:0x0704, B:344:0x0709, B:346:0x070d, B:348:0x0713, B:350:0x0717, B:352:0x071f, B:354:0x0725, B:356:0x072f, B:359:0x0735, B:360:0x0738, B:362:0x0741, B:364:0x0753, B:366:0x075b, B:368:0x0763, B:372:0x076c, B:375:0x0798, B:380:0x07a4, B:382:0x07b0, B:383:0x07b5, B:385:0x07c5, B:386:0x07da, B:388:0x07e0, B:390:0x07e8, B:392:0x07ef, B:396:0x07f8, B:401:0x0807, B:407:0x0814, B:409:0x081a, B:419:0x082d, B:420:0x0830, B:422:0x083f, B:424:0x0845, B:428:0x0852, B:430:0x085a, B:432:0x085e, B:433:0x0869, B:435:0x086f, B:436:0x0873, B:488:0x094d, B:491:0x0955, B:493:0x095a, B:495:0x0962, B:497:0x0970, B:498:0x0977, B:499:0x097b, B:501:0x0981, B:503:0x098a, B:505:0x0990, B:507:0x099b, B:508:0x099f, B:515:0x09be, B:517:0x09c4, B:521:0x09cd, B:523:0x09d1, B:528:0x09da, B:530:0x09e0, B:532:0x0a3c, B:534:0x0a41, B:543:0x0a52, B:545:0x0a56, B:546:0x0a5e, B:547:0x0a65, B:509:0x09a2, B:512:0x09b0, B:513:0x09b7, B:437:0x0878, B:471:0x0909, B:473:0x090f, B:475:0x0913, B:479:0x091c, B:481:0x092a, B:483:0x0932, B:485:0x093c, B:486:0x0941, B:487:0x0946, B:440:0x0881, B:442:0x0885, B:468:0x08f9, B:470:0x0905, B:446:0x088f, B:448:0x0893, B:450:0x08a5, B:452:0x08b3, B:454:0x08bf, B:458:0x08c8, B:460:0x08d2, B:466:0x08dd, B:421:0x0838, B:254:0x056e, B:256:0x0574, B:259:0x057a, B:262:0x0585, B:264:0x058b, B:267:0x0599, B:269:0x059f, B:270:0x05a7, B:271:0x05aa, B:273:0x05b2, B:275:0x05c0, B:277:0x05f3, B:279:0x05fd, B:282:0x0608, B:284:0x0610, B:285:0x0613, B:287:0x0617, B:289:0x061d, B:291:0x0627, B:293:0x0631, B:295:0x0642, B:297:0x0648, B:298:0x0653, B:299:0x0656, B:301:0x065f, B:304:0x0664, B:306:0x066a, B:308:0x0672, B:310:0x0678, B:312:0x067e, B:316:0x068c, B:318:0x0694, B:319:0x0697, B:250:0x055e, B:549:0x0a6d, B:553:0x0a74, B:554:0x0a7c, B:558:0x0a9a), top: B:619:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x09c4 A[Catch: RuntimeException -> 0x0aab, IOException -> 0x0ad5, zzru -> 0x0ada, zzfh -> 0x0adf, zzbu -> 0x0ae4, zzpr -> 0x0afb, zzhj -> 0x0b04, TryCatch #9 {zzbu -> 0x0ae4, zzfh -> 0x0adf, zzhj -> 0x0b04, zzpr -> 0x0afb, zzru -> 0x0ada, IOException -> 0x0ad5, RuntimeException -> 0x0aab, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:9:0x001c, B:13:0x0023, B:15:0x0027, B:17:0x002b, B:19:0x0031, B:20:0x0037, B:24:0x003e, B:26:0x0047, B:28:0x0055, B:29:0x0058, B:30:0x005c, B:31:0x0066, B:32:0x0075, B:33:0x0079, B:34:0x008d, B:35:0x009f, B:37:0x00ae, B:38:0x00b2, B:39:0x00bf, B:41:0x00ce, B:42:0x00ea, B:43:0x00fa, B:44:0x0103, B:46:0x0115, B:47:0x0121, B:48:0x0131, B:49:0x013a, B:53:0x0141, B:55:0x0149, B:57:0x014d, B:59:0x0153, B:61:0x015b, B:63:0x0163, B:64:0x0166, B:66:0x016b, B:73:0x0178, B:74:0x0179, B:78:0x0180, B:80:0x018e, B:81:0x0193, B:83:0x01a3, B:84:0x01a8, B:86:0x01bf, B:88:0x01c3, B:90:0x01d1, B:94:0x01db, B:96:0x01e0, B:98:0x01e6, B:102:0x01ee, B:104:0x01f6, B:106:0x021c, B:110:0x0225, B:112:0x0247, B:113:0x024a, B:114:0x0250, B:116:0x0255, B:118:0x0265, B:120:0x026b, B:121:0x026f, B:123:0x0273, B:124:0x0278, B:125:0x027d, B:129:0x029e, B:131:0x02a9, B:126:0x0281, B:128:0x028b, B:132:0x02b6, B:134:0x02c2, B:135:0x02c9, B:136:0x02ce, B:138:0x02da, B:140:0x0302, B:141:0x0323, B:143:0x0334, B:144:0x0337, B:152:0x0343, B:153:0x0344, B:154:0x034b, B:155:0x0353, B:156:0x0368, B:158:0x0394, B:223:0x04b6, B:208:0x0482, B:207:0x047e, B:232:0x04cd, B:233:0x04dd, B:159:0x03b7, B:163:0x03ca, B:165:0x03da, B:167:0x03f1, B:169:0x03fb, B:234:0x04de, B:236:0x04f3, B:239:0x04fd, B:241:0x050c, B:243:0x0518, B:245:0x0547, B:246:0x054c, B:247:0x0550, B:249:0x0554, B:251:0x0561, B:320:0x069a, B:322:0x06a2, B:324:0x06aa, B:327:0x06af, B:328:0x06bb, B:330:0x06c1, B:332:0x06c9, B:335:0x06d9, B:337:0x06df, B:338:0x06f9, B:340:0x06ff, B:342:0x0704, B:344:0x0709, B:346:0x070d, B:348:0x0713, B:350:0x0717, B:352:0x071f, B:354:0x0725, B:356:0x072f, B:359:0x0735, B:360:0x0738, B:362:0x0741, B:364:0x0753, B:366:0x075b, B:368:0x0763, B:372:0x076c, B:375:0x0798, B:380:0x07a4, B:382:0x07b0, B:383:0x07b5, B:385:0x07c5, B:386:0x07da, B:388:0x07e0, B:390:0x07e8, B:392:0x07ef, B:396:0x07f8, B:401:0x0807, B:407:0x0814, B:409:0x081a, B:419:0x082d, B:420:0x0830, B:422:0x083f, B:424:0x0845, B:428:0x0852, B:430:0x085a, B:432:0x085e, B:433:0x0869, B:435:0x086f, B:436:0x0873, B:488:0x094d, B:491:0x0955, B:493:0x095a, B:495:0x0962, B:497:0x0970, B:498:0x0977, B:499:0x097b, B:501:0x0981, B:503:0x098a, B:505:0x0990, B:507:0x099b, B:508:0x099f, B:515:0x09be, B:517:0x09c4, B:521:0x09cd, B:523:0x09d1, B:528:0x09da, B:530:0x09e0, B:532:0x0a3c, B:534:0x0a41, B:543:0x0a52, B:545:0x0a56, B:546:0x0a5e, B:547:0x0a65, B:509:0x09a2, B:512:0x09b0, B:513:0x09b7, B:437:0x0878, B:471:0x0909, B:473:0x090f, B:475:0x0913, B:479:0x091c, B:481:0x092a, B:483:0x0932, B:485:0x093c, B:486:0x0941, B:487:0x0946, B:440:0x0881, B:442:0x0885, B:468:0x08f9, B:470:0x0905, B:446:0x088f, B:448:0x0893, B:450:0x08a5, B:452:0x08b3, B:454:0x08bf, B:458:0x08c8, B:460:0x08d2, B:466:0x08dd, B:421:0x0838, B:254:0x056e, B:256:0x0574, B:259:0x057a, B:262:0x0585, B:264:0x058b, B:267:0x0599, B:269:0x059f, B:270:0x05a7, B:271:0x05aa, B:273:0x05b2, B:275:0x05c0, B:277:0x05f3, B:279:0x05fd, B:282:0x0608, B:284:0x0610, B:285:0x0613, B:287:0x0617, B:289:0x061d, B:291:0x0627, B:293:0x0631, B:295:0x0642, B:297:0x0648, B:298:0x0653, B:299:0x0656, B:301:0x065f, B:304:0x0664, B:306:0x066a, B:308:0x0672, B:310:0x0678, B:312:0x067e, B:316:0x068c, B:318:0x0694, B:319:0x0697, B:250:0x055e, B:549:0x0a6d, B:553:0x0a74, B:554:0x0a7c, B:558:0x0a9a), top: B:619:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:523:0x09d1 A[Catch: RuntimeException -> 0x0aab, IOException -> 0x0ad5, zzru -> 0x0ada, zzfh -> 0x0adf, zzbu -> 0x0ae4, zzpr -> 0x0afb, zzhj -> 0x0b04, TryCatch #9 {zzbu -> 0x0ae4, zzfh -> 0x0adf, zzhj -> 0x0b04, zzpr -> 0x0afb, zzru -> 0x0ada, IOException -> 0x0ad5, RuntimeException -> 0x0aab, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:9:0x001c, B:13:0x0023, B:15:0x0027, B:17:0x002b, B:19:0x0031, B:20:0x0037, B:24:0x003e, B:26:0x0047, B:28:0x0055, B:29:0x0058, B:30:0x005c, B:31:0x0066, B:32:0x0075, B:33:0x0079, B:34:0x008d, B:35:0x009f, B:37:0x00ae, B:38:0x00b2, B:39:0x00bf, B:41:0x00ce, B:42:0x00ea, B:43:0x00fa, B:44:0x0103, B:46:0x0115, B:47:0x0121, B:48:0x0131, B:49:0x013a, B:53:0x0141, B:55:0x0149, B:57:0x014d, B:59:0x0153, B:61:0x015b, B:63:0x0163, B:64:0x0166, B:66:0x016b, B:73:0x0178, B:74:0x0179, B:78:0x0180, B:80:0x018e, B:81:0x0193, B:83:0x01a3, B:84:0x01a8, B:86:0x01bf, B:88:0x01c3, B:90:0x01d1, B:94:0x01db, B:96:0x01e0, B:98:0x01e6, B:102:0x01ee, B:104:0x01f6, B:106:0x021c, B:110:0x0225, B:112:0x0247, B:113:0x024a, B:114:0x0250, B:116:0x0255, B:118:0x0265, B:120:0x026b, B:121:0x026f, B:123:0x0273, B:124:0x0278, B:125:0x027d, B:129:0x029e, B:131:0x02a9, B:126:0x0281, B:128:0x028b, B:132:0x02b6, B:134:0x02c2, B:135:0x02c9, B:136:0x02ce, B:138:0x02da, B:140:0x0302, B:141:0x0323, B:143:0x0334, B:144:0x0337, B:152:0x0343, B:153:0x0344, B:154:0x034b, B:155:0x0353, B:156:0x0368, B:158:0x0394, B:223:0x04b6, B:208:0x0482, B:207:0x047e, B:232:0x04cd, B:233:0x04dd, B:159:0x03b7, B:163:0x03ca, B:165:0x03da, B:167:0x03f1, B:169:0x03fb, B:234:0x04de, B:236:0x04f3, B:239:0x04fd, B:241:0x050c, B:243:0x0518, B:245:0x0547, B:246:0x054c, B:247:0x0550, B:249:0x0554, B:251:0x0561, B:320:0x069a, B:322:0x06a2, B:324:0x06aa, B:327:0x06af, B:328:0x06bb, B:330:0x06c1, B:332:0x06c9, B:335:0x06d9, B:337:0x06df, B:338:0x06f9, B:340:0x06ff, B:342:0x0704, B:344:0x0709, B:346:0x070d, B:348:0x0713, B:350:0x0717, B:352:0x071f, B:354:0x0725, B:356:0x072f, B:359:0x0735, B:360:0x0738, B:362:0x0741, B:364:0x0753, B:366:0x075b, B:368:0x0763, B:372:0x076c, B:375:0x0798, B:380:0x07a4, B:382:0x07b0, B:383:0x07b5, B:385:0x07c5, B:386:0x07da, B:388:0x07e0, B:390:0x07e8, B:392:0x07ef, B:396:0x07f8, B:401:0x0807, B:407:0x0814, B:409:0x081a, B:419:0x082d, B:420:0x0830, B:422:0x083f, B:424:0x0845, B:428:0x0852, B:430:0x085a, B:432:0x085e, B:433:0x0869, B:435:0x086f, B:436:0x0873, B:488:0x094d, B:491:0x0955, B:493:0x095a, B:495:0x0962, B:497:0x0970, B:498:0x0977, B:499:0x097b, B:501:0x0981, B:503:0x098a, B:505:0x0990, B:507:0x099b, B:508:0x099f, B:515:0x09be, B:517:0x09c4, B:521:0x09cd, B:523:0x09d1, B:528:0x09da, B:530:0x09e0, B:532:0x0a3c, B:534:0x0a41, B:543:0x0a52, B:545:0x0a56, B:546:0x0a5e, B:547:0x0a65, B:509:0x09a2, B:512:0x09b0, B:513:0x09b7, B:437:0x0878, B:471:0x0909, B:473:0x090f, B:475:0x0913, B:479:0x091c, B:481:0x092a, B:483:0x0932, B:485:0x093c, B:486:0x0941, B:487:0x0946, B:440:0x0881, B:442:0x0885, B:468:0x08f9, B:470:0x0905, B:446:0x088f, B:448:0x0893, B:450:0x08a5, B:452:0x08b3, B:454:0x08bf, B:458:0x08c8, B:460:0x08d2, B:466:0x08dd, B:421:0x0838, B:254:0x056e, B:256:0x0574, B:259:0x057a, B:262:0x0585, B:264:0x058b, B:267:0x0599, B:269:0x059f, B:270:0x05a7, B:271:0x05aa, B:273:0x05b2, B:275:0x05c0, B:277:0x05f3, B:279:0x05fd, B:282:0x0608, B:284:0x0610, B:285:0x0613, B:287:0x0617, B:289:0x061d, B:291:0x0627, B:293:0x0631, B:295:0x0642, B:297:0x0648, B:298:0x0653, B:299:0x0656, B:301:0x065f, B:304:0x0664, B:306:0x066a, B:308:0x0672, B:310:0x0678, B:312:0x067e, B:316:0x068c, B:318:0x0694, B:319:0x0697, B:250:0x055e, B:549:0x0a6d, B:553:0x0a74, B:554:0x0a7c, B:558:0x0a9a), top: B:619:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:530:0x09e0 A[Catch: RuntimeException -> 0x0aab, IOException -> 0x0ad5, zzru -> 0x0ada, zzfh -> 0x0adf, zzbu -> 0x0ae4, zzpr -> 0x0afb, zzhj -> 0x0b04, TryCatch #9 {zzbu -> 0x0ae4, zzfh -> 0x0adf, zzhj -> 0x0b04, zzpr -> 0x0afb, zzru -> 0x0ada, IOException -> 0x0ad5, RuntimeException -> 0x0aab, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:9:0x001c, B:13:0x0023, B:15:0x0027, B:17:0x002b, B:19:0x0031, B:20:0x0037, B:24:0x003e, B:26:0x0047, B:28:0x0055, B:29:0x0058, B:30:0x005c, B:31:0x0066, B:32:0x0075, B:33:0x0079, B:34:0x008d, B:35:0x009f, B:37:0x00ae, B:38:0x00b2, B:39:0x00bf, B:41:0x00ce, B:42:0x00ea, B:43:0x00fa, B:44:0x0103, B:46:0x0115, B:47:0x0121, B:48:0x0131, B:49:0x013a, B:53:0x0141, B:55:0x0149, B:57:0x014d, B:59:0x0153, B:61:0x015b, B:63:0x0163, B:64:0x0166, B:66:0x016b, B:73:0x0178, B:74:0x0179, B:78:0x0180, B:80:0x018e, B:81:0x0193, B:83:0x01a3, B:84:0x01a8, B:86:0x01bf, B:88:0x01c3, B:90:0x01d1, B:94:0x01db, B:96:0x01e0, B:98:0x01e6, B:102:0x01ee, B:104:0x01f6, B:106:0x021c, B:110:0x0225, B:112:0x0247, B:113:0x024a, B:114:0x0250, B:116:0x0255, B:118:0x0265, B:120:0x026b, B:121:0x026f, B:123:0x0273, B:124:0x0278, B:125:0x027d, B:129:0x029e, B:131:0x02a9, B:126:0x0281, B:128:0x028b, B:132:0x02b6, B:134:0x02c2, B:135:0x02c9, B:136:0x02ce, B:138:0x02da, B:140:0x0302, B:141:0x0323, B:143:0x0334, B:144:0x0337, B:152:0x0343, B:153:0x0344, B:154:0x034b, B:155:0x0353, B:156:0x0368, B:158:0x0394, B:223:0x04b6, B:208:0x0482, B:207:0x047e, B:232:0x04cd, B:233:0x04dd, B:159:0x03b7, B:163:0x03ca, B:165:0x03da, B:167:0x03f1, B:169:0x03fb, B:234:0x04de, B:236:0x04f3, B:239:0x04fd, B:241:0x050c, B:243:0x0518, B:245:0x0547, B:246:0x054c, B:247:0x0550, B:249:0x0554, B:251:0x0561, B:320:0x069a, B:322:0x06a2, B:324:0x06aa, B:327:0x06af, B:328:0x06bb, B:330:0x06c1, B:332:0x06c9, B:335:0x06d9, B:337:0x06df, B:338:0x06f9, B:340:0x06ff, B:342:0x0704, B:344:0x0709, B:346:0x070d, B:348:0x0713, B:350:0x0717, B:352:0x071f, B:354:0x0725, B:356:0x072f, B:359:0x0735, B:360:0x0738, B:362:0x0741, B:364:0x0753, B:366:0x075b, B:368:0x0763, B:372:0x076c, B:375:0x0798, B:380:0x07a4, B:382:0x07b0, B:383:0x07b5, B:385:0x07c5, B:386:0x07da, B:388:0x07e0, B:390:0x07e8, B:392:0x07ef, B:396:0x07f8, B:401:0x0807, B:407:0x0814, B:409:0x081a, B:419:0x082d, B:420:0x0830, B:422:0x083f, B:424:0x0845, B:428:0x0852, B:430:0x085a, B:432:0x085e, B:433:0x0869, B:435:0x086f, B:436:0x0873, B:488:0x094d, B:491:0x0955, B:493:0x095a, B:495:0x0962, B:497:0x0970, B:498:0x0977, B:499:0x097b, B:501:0x0981, B:503:0x098a, B:505:0x0990, B:507:0x099b, B:508:0x099f, B:515:0x09be, B:517:0x09c4, B:521:0x09cd, B:523:0x09d1, B:528:0x09da, B:530:0x09e0, B:532:0x0a3c, B:534:0x0a41, B:543:0x0a52, B:545:0x0a56, B:546:0x0a5e, B:547:0x0a65, B:509:0x09a2, B:512:0x09b0, B:513:0x09b7, B:437:0x0878, B:471:0x0909, B:473:0x090f, B:475:0x0913, B:479:0x091c, B:481:0x092a, B:483:0x0932, B:485:0x093c, B:486:0x0941, B:487:0x0946, B:440:0x0881, B:442:0x0885, B:468:0x08f9, B:470:0x0905, B:446:0x088f, B:448:0x0893, B:450:0x08a5, B:452:0x08b3, B:454:0x08bf, B:458:0x08c8, B:460:0x08d2, B:466:0x08dd, B:421:0x0838, B:254:0x056e, B:256:0x0574, B:259:0x057a, B:262:0x0585, B:264:0x058b, B:267:0x0599, B:269:0x059f, B:270:0x05a7, B:271:0x05aa, B:273:0x05b2, B:275:0x05c0, B:277:0x05f3, B:279:0x05fd, B:282:0x0608, B:284:0x0610, B:285:0x0613, B:287:0x0617, B:289:0x061d, B:291:0x0627, B:293:0x0631, B:295:0x0642, B:297:0x0648, B:298:0x0653, B:299:0x0656, B:301:0x065f, B:304:0x0664, B:306:0x066a, B:308:0x0672, B:310:0x0678, B:312:0x067e, B:316:0x068c, B:318:0x0694, B:319:0x0697, B:250:0x055e, B:549:0x0a6d, B:553:0x0a74, B:554:0x0a7c, B:558:0x0a9a), top: B:619:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0a41 A[Catch: RuntimeException -> 0x0aab, IOException -> 0x0ad5, zzru -> 0x0ada, zzfh -> 0x0adf, zzbu -> 0x0ae4, zzpr -> 0x0afb, zzhj -> 0x0b04, TryCatch #9 {zzbu -> 0x0ae4, zzfh -> 0x0adf, zzhj -> 0x0b04, zzpr -> 0x0afb, zzru -> 0x0ada, IOException -> 0x0ad5, RuntimeException -> 0x0aab, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:9:0x001c, B:13:0x0023, B:15:0x0027, B:17:0x002b, B:19:0x0031, B:20:0x0037, B:24:0x003e, B:26:0x0047, B:28:0x0055, B:29:0x0058, B:30:0x005c, B:31:0x0066, B:32:0x0075, B:33:0x0079, B:34:0x008d, B:35:0x009f, B:37:0x00ae, B:38:0x00b2, B:39:0x00bf, B:41:0x00ce, B:42:0x00ea, B:43:0x00fa, B:44:0x0103, B:46:0x0115, B:47:0x0121, B:48:0x0131, B:49:0x013a, B:53:0x0141, B:55:0x0149, B:57:0x014d, B:59:0x0153, B:61:0x015b, B:63:0x0163, B:64:0x0166, B:66:0x016b, B:73:0x0178, B:74:0x0179, B:78:0x0180, B:80:0x018e, B:81:0x0193, B:83:0x01a3, B:84:0x01a8, B:86:0x01bf, B:88:0x01c3, B:90:0x01d1, B:94:0x01db, B:96:0x01e0, B:98:0x01e6, B:102:0x01ee, B:104:0x01f6, B:106:0x021c, B:110:0x0225, B:112:0x0247, B:113:0x024a, B:114:0x0250, B:116:0x0255, B:118:0x0265, B:120:0x026b, B:121:0x026f, B:123:0x0273, B:124:0x0278, B:125:0x027d, B:129:0x029e, B:131:0x02a9, B:126:0x0281, B:128:0x028b, B:132:0x02b6, B:134:0x02c2, B:135:0x02c9, B:136:0x02ce, B:138:0x02da, B:140:0x0302, B:141:0x0323, B:143:0x0334, B:144:0x0337, B:152:0x0343, B:153:0x0344, B:154:0x034b, B:155:0x0353, B:156:0x0368, B:158:0x0394, B:223:0x04b6, B:208:0x0482, B:207:0x047e, B:232:0x04cd, B:233:0x04dd, B:159:0x03b7, B:163:0x03ca, B:165:0x03da, B:167:0x03f1, B:169:0x03fb, B:234:0x04de, B:236:0x04f3, B:239:0x04fd, B:241:0x050c, B:243:0x0518, B:245:0x0547, B:246:0x054c, B:247:0x0550, B:249:0x0554, B:251:0x0561, B:320:0x069a, B:322:0x06a2, B:324:0x06aa, B:327:0x06af, B:328:0x06bb, B:330:0x06c1, B:332:0x06c9, B:335:0x06d9, B:337:0x06df, B:338:0x06f9, B:340:0x06ff, B:342:0x0704, B:344:0x0709, B:346:0x070d, B:348:0x0713, B:350:0x0717, B:352:0x071f, B:354:0x0725, B:356:0x072f, B:359:0x0735, B:360:0x0738, B:362:0x0741, B:364:0x0753, B:366:0x075b, B:368:0x0763, B:372:0x076c, B:375:0x0798, B:380:0x07a4, B:382:0x07b0, B:383:0x07b5, B:385:0x07c5, B:386:0x07da, B:388:0x07e0, B:390:0x07e8, B:392:0x07ef, B:396:0x07f8, B:401:0x0807, B:407:0x0814, B:409:0x081a, B:419:0x082d, B:420:0x0830, B:422:0x083f, B:424:0x0845, B:428:0x0852, B:430:0x085a, B:432:0x085e, B:433:0x0869, B:435:0x086f, B:436:0x0873, B:488:0x094d, B:491:0x0955, B:493:0x095a, B:495:0x0962, B:497:0x0970, B:498:0x0977, B:499:0x097b, B:501:0x0981, B:503:0x098a, B:505:0x0990, B:507:0x099b, B:508:0x099f, B:515:0x09be, B:517:0x09c4, B:521:0x09cd, B:523:0x09d1, B:528:0x09da, B:530:0x09e0, B:532:0x0a3c, B:534:0x0a41, B:543:0x0a52, B:545:0x0a56, B:546:0x0a5e, B:547:0x0a65, B:509:0x09a2, B:512:0x09b0, B:513:0x09b7, B:437:0x0878, B:471:0x0909, B:473:0x090f, B:475:0x0913, B:479:0x091c, B:481:0x092a, B:483:0x0932, B:485:0x093c, B:486:0x0941, B:487:0x0946, B:440:0x0881, B:442:0x0885, B:468:0x08f9, B:470:0x0905, B:446:0x088f, B:448:0x0893, B:450:0x08a5, B:452:0x08b3, B:454:0x08bf, B:458:0x08c8, B:460:0x08d2, B:466:0x08dd, B:421:0x0838, B:254:0x056e, B:256:0x0574, B:259:0x057a, B:262:0x0585, B:264:0x058b, B:267:0x0599, B:269:0x059f, B:270:0x05a7, B:271:0x05aa, B:273:0x05b2, B:275:0x05c0, B:277:0x05f3, B:279:0x05fd, B:282:0x0608, B:284:0x0610, B:285:0x0613, B:287:0x0617, B:289:0x061d, B:291:0x0627, B:293:0x0631, B:295:0x0642, B:297:0x0648, B:298:0x0653, B:299:0x0656, B:301:0x065f, B:304:0x0664, B:306:0x066a, B:308:0x0672, B:310:0x0678, B:312:0x067e, B:316:0x068c, B:318:0x0694, B:319:0x0697, B:250:0x055e, B:549:0x0a6d, B:553:0x0a74, B:554:0x0a7c, B:558:0x0a9a), top: B:619:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0a6a  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0707 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:654:0x0830 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v27, types: [com.google.android.gms.internal.ads.zzws, com.google.android.gms.internal.ads.zzgi] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r54) {
        /*
            Method dump skipped, instructions count: 2982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjm.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void zza(zzby zzbyVar) {
        this.zzh.zzc(16, zzbyVar).zza();
    }

    public final Looper zzb() {
        return this.zzj;
    }

    public final /* synthetic */ Boolean zzd() {
        return Boolean.valueOf(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final /* bridge */ /* synthetic */ void zzg(zzul zzulVar) {
        this.zzh.zzc(9, (zzsq) zzulVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkf
    public final void zzh() {
        this.zzh.zzi(22);
    }

    @Override // com.google.android.gms.internal.ads.zzsp
    public final void zzi(zzsq zzsqVar) {
        this.zzh.zzc(8, zzsqVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzwj
    public final void zzj() {
        this.zzh.zzi(10);
    }

    public final void zzk() {
        this.zzh.zzb(0).zza();
    }

    public final void zzl(zzcn zzcnVar, int i, long j) {
        this.zzh.zzc(3, new zzjl(zzcnVar, i, j)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final synchronized void zzm(zzkk zzkkVar) {
        if (!this.zzw && this.zzj.getThread().isAlive()) {
            this.zzh.zzc(14, zzkkVar).zza();
            return;
        }
        zzee.zze("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzkkVar.zzh(false);
    }

    public final void zzn(boolean z, int i) {
        this.zzh.zzd(1, z ? 1 : 0, i).zza();
    }

    public final void zzo() {
        this.zzh.zzb(6).zza();
    }

    public final synchronized boolean zzp() {
        if (!this.zzw && this.zzj.getThread().isAlive()) {
            this.zzh.zzi(7);
            zzaa(new zzjd(this), this.zzs);
            return this.zzw;
        }
        return true;
    }

    public final void zzq(List list, int i, long j, zzum zzumVar) {
        this.zzh.zzc(17, new zzjh(list, zzumVar, i, j, null, null)).zza();
    }
}
