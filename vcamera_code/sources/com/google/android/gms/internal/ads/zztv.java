package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o00oOooO.o0OO00OO;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zztv implements zzsq, zzzx, zzwy, zzxd, zzuh {
    private static final Map zzb;
    private static final zzaf zzc;
    private boolean zzA;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private boolean zzF;
    private long zzG;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private boolean zzL;
    private final zzwx zzM;
    private final zzwt zzN;
    private final Uri zzd;
    private final zzfg zze;
    private final zzpz zzf;
    private final zztb zzg;
    private final zzpt zzh;
    private final zztr zzi;
    private final long zzj;
    private final zztl zzl;
    @o0OO00OO
    private zzsp zzq;
    @o0OO00OO
    private zzacy zzr;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private zztu zzx;
    private zzaax zzy;
    private final zzxg zzk = new zzxg("ProgressiveMediaPeriod");
    private final zzdo zzm = new zzdo(zzdm.zza);
    private final Runnable zzn = new Runnable() { // from class: com.google.android.gms.internal.ads.zztm
        @Override // java.lang.Runnable
        public final void run() {
            zztv.this.zzT();
        }
    };
    private final Runnable zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zztn
        @Override // java.lang.Runnable
        public final void run() {
            zztv.this.zzD();
        }
    };
    private final Handler zzp = zzew.zzD(null);
    private zztt[] zzt = new zztt[0];
    private zzui[] zzs = new zzui[0];
    private long zzH = C.TIME_UNSET;
    private long zzz = C.TIME_UNSET;
    private int zzB = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzad zzadVar = new zzad();
        zzadVar.zzH("icy");
        zzadVar.zzS(MimeTypes.APPLICATION_ICY);
        zzc = zzadVar.zzY();
    }

    public zztv(Uri uri, zzfg zzfgVar, zztl zztlVar, zzpz zzpzVar, zzpt zzptVar, zzwx zzwxVar, zztb zztbVar, zztr zztrVar, zzwt zzwtVar, @o0OO00OO String str, int i, byte[] bArr) {
        this.zzd = uri;
        this.zze = zzfgVar;
        this.zzf = zzpzVar;
        this.zzh = zzptVar;
        this.zzM = zzwxVar;
        this.zzg = zztbVar;
        this.zzi = zztrVar;
        this.zzN = zzwtVar;
        this.zzj = i;
        this.zzl = zztlVar;
    }

    private final int zzP() {
        int i = 0;
        for (zzui zzuiVar : this.zzs) {
            i += zzuiVar.zzc();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzQ(boolean z) {
        int i;
        long j = Long.MIN_VALUE;
        while (true) {
            zzui[] zzuiVarArr = this.zzs;
            if (i >= zzuiVarArr.length) {
                return j;
            }
            if (!z) {
                zztu zztuVar = this.zzx;
                zztuVar.getClass();
                i = zztuVar.zzc[i] ? 0 : i + 1;
            }
            j = Math.max(j, zzuiVarArr[i].zzg());
        }
    }

    private final zzabb zzR(zztt zzttVar) {
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            if (zzttVar.equals(this.zzt[i])) {
                return this.zzs[i];
            }
        }
        zzui zzuiVar = new zzui(this.zzN, this.zzf, this.zzh, null);
        zzuiVar.zzu(this);
        int i2 = length + 1;
        zztt[] zzttVarArr = (zztt[]) Arrays.copyOf(this.zzt, i2);
        zzttVarArr[length] = zzttVar;
        this.zzt = (zztt[]) zzew.zzad(zzttVarArr);
        zzui[] zzuiVarArr = (zzui[]) Arrays.copyOf(this.zzs, i2);
        zzuiVarArr[length] = zzuiVar;
        this.zzs = (zzui[]) zzew.zzad(zzuiVarArr);
        return zzuiVar;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzS() {
        zzdl.zzf(this.zzv);
        this.zzx.getClass();
        this.zzy.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzT() {
        int i;
        if (this.zzL || this.zzv || !this.zzu || this.zzy == null) {
            return;
        }
        for (zzui zzuiVar : this.zzs) {
            if (zzuiVar.zzh() == null) {
                return;
            }
        }
        this.zzm.zzc();
        int length = this.zzs.length;
        zzcp[] zzcpVarArr = new zzcp[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzaf zzh = this.zzs[i2].zzh();
            zzh.getClass();
            String str = zzh.zzm;
            boolean zzg = zzbt.zzg(str);
            boolean z = zzg || zzbt.zzh(str);
            zArr[i2] = z;
            this.zzw = z | this.zzw;
            zzacy zzacyVar = this.zzr;
            if (zzacyVar != null) {
                if (zzg || this.zzt[i2].zzb) {
                    zzbq zzbqVar = zzh.zzk;
                    zzbq zzbqVar2 = zzbqVar == null ? new zzbq(C.TIME_UNSET, zzacyVar) : zzbqVar.zzc(zzacyVar);
                    zzad zzb2 = zzh.zzb();
                    zzb2.zzM(zzbqVar2);
                    zzh = zzb2.zzY();
                }
                if (zzg && zzh.zzg == -1 && zzh.zzh == -1 && (i = zzacyVar.zza) != -1) {
                    zzad zzb3 = zzh.zzb();
                    zzb3.zzv(i);
                    zzh = zzb3.zzY();
                }
            }
            zzcpVarArr[i2] = new zzcp(Integer.toString(i2), zzh.zzc(this.zzf.zza(zzh)));
        }
        this.zzx = new zztu(new zzur(zzcpVarArr), zArr);
        this.zzv = true;
        zzsp zzspVar = this.zzq;
        zzspVar.getClass();
        zzspVar.zzi(this);
    }

    private final void zzU(int i) {
        zzS();
        zztu zztuVar = this.zzx;
        boolean[] zArr = zztuVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzaf zzb2 = zztuVar.zza.zzb(i).zzb(0);
        this.zzg.zzd(zzbt.zzb(zzb2.zzm), zzb2, 0, null, this.zzG);
        zArr[i] = true;
    }

    private final void zzV(int i) {
        zzS();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzI && zArr[i] && !this.zzs[i].zzx(false)) {
            this.zzH = 0L;
            this.zzI = false;
            this.zzD = true;
            this.zzG = 0L;
            this.zzJ = 0;
            for (zzui zzuiVar : this.zzs) {
                zzuiVar.zzp(false);
            }
            zzsp zzspVar = this.zzq;
            zzspVar.getClass();
            zzspVar.zzg(this);
        }
    }

    private final void zzW() {
        zztq zztqVar = new zztq(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzv) {
            zzdl.zzf(zzX());
            long j = this.zzz;
            if (j != C.TIME_UNSET && this.zzH > j) {
                this.zzK = true;
                this.zzH = C.TIME_UNSET;
                return;
            }
            zzaax zzaaxVar = this.zzy;
            zzaaxVar.getClass();
            zztq.zzf(zztqVar, zzaaxVar.zzg(this.zzH).zza.zzc, this.zzH);
            for (zzui zzuiVar : this.zzs) {
                zzuiVar.zzt(this.zzH);
            }
            this.zzH = C.TIME_UNSET;
        }
        this.zzJ = zzP();
        long zza = this.zzk.zza(zztqVar, this, zzwx.zza(this.zzB));
        zzfl zzd = zztq.zzd(zztqVar);
        this.zzg.zzl(new zzsj(zztq.zzb(zztqVar), zzd, zzd.zza, Collections.emptyMap(), zza, 0L, 0L), 1, -1, null, 0, null, zztq.zzc(zztqVar), this.zzz);
    }

    private final boolean zzX() {
        return this.zzH != C.TIME_UNSET;
    }

    private final boolean zzY() {
        return this.zzD || zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzzx
    public final void zzC() {
        this.zzu = true;
        this.zzp.post(this.zzn);
    }

    public final /* synthetic */ void zzD() {
        if (this.zzL) {
            return;
        }
        zzsp zzspVar = this.zzq;
        zzspVar.getClass();
        zzspVar.zzg(this);
    }

    public final /* synthetic */ void zzE() {
        this.zzF = true;
    }

    public final /* synthetic */ void zzF(zzaax zzaaxVar) {
        this.zzy = this.zzr == null ? zzaaxVar : new zzaaw(C.TIME_UNSET, 0L);
        this.zzz = zzaaxVar.zze();
        boolean z = false;
        if (!this.zzF && zzaaxVar.zze() == C.TIME_UNSET) {
            z = true;
        }
        this.zzA = z;
        this.zzB = true == z ? 7 : 1;
        this.zzi.zza(this.zzz, zzaaxVar.zzh(), this.zzA);
        if (this.zzv) {
            return;
        }
        zzT();
    }

    public final void zzG() throws IOException {
        this.zzk.zzi(zzwx.zza(this.zzB));
    }

    public final void zzH(int i) throws IOException {
        this.zzs[i].zzm();
        zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final /* bridge */ /* synthetic */ void zzI(zzxc zzxcVar, long j, long j2, boolean z) {
        zztq zztqVar = (zztq) zzxcVar;
        zzgh zze = zztq.zze(zztqVar);
        zzsj zzsjVar = new zzsj(zztq.zzb(zztqVar), zztq.zzd(zztqVar), zze.zzh(), zze.zzi(), j, j2, zze.zzg());
        zztq.zzb(zztqVar);
        this.zzg.zzf(zzsjVar, 1, -1, null, 0, null, zztq.zzc(zztqVar), this.zzz);
        if (z) {
            return;
        }
        for (zzui zzuiVar : this.zzs) {
            zzuiVar.zzp(false);
        }
        if (this.zzE > 0) {
            zzsp zzspVar = this.zzq;
            zzspVar.getClass();
            zzspVar.zzg(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final /* bridge */ /* synthetic */ void zzJ(zzxc zzxcVar, long j, long j2) {
        zzaax zzaaxVar;
        if (this.zzz == C.TIME_UNSET && (zzaaxVar = this.zzy) != null) {
            boolean zzh = zzaaxVar.zzh();
            long zzQ = zzQ(true);
            long j3 = zzQ == Long.MIN_VALUE ? 0L : zzQ + 10000;
            this.zzz = j3;
            this.zzi.zza(j3, zzh, this.zzA);
        }
        zztq zztqVar = (zztq) zzxcVar;
        zzgh zze = zztq.zze(zztqVar);
        zzsj zzsjVar = new zzsj(zztq.zzb(zztqVar), zztq.zzd(zztqVar), zze.zzh(), zze.zzi(), j, j2, zze.zzg());
        zztq.zzb(zztqVar);
        this.zzg.zzh(zzsjVar, 1, -1, null, 0, null, zztq.zzc(zztqVar), this.zzz);
        this.zzK = true;
        zzsp zzspVar = this.zzq;
        zzspVar.getClass();
        zzspVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzK() {
        for (zzui zzuiVar : this.zzs) {
            zzuiVar.zzo();
        }
        this.zzl.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    public final void zzL(zzaf zzafVar) {
        this.zzp.post(this.zzn);
    }

    public final void zzM() {
        if (this.zzv) {
            for (zzui zzuiVar : this.zzs) {
                zzuiVar.zzn();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzq = null;
        this.zzL = true;
    }

    @Override // com.google.android.gms.internal.ads.zzzx
    public final void zzN(final zzaax zzaaxVar) {
        this.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zztp
            @Override // java.lang.Runnable
            public final void run() {
                zztv.this.zzF(zzaaxVar);
            }
        });
    }

    public final boolean zzO(int i) {
        return !zzY() && this.zzs[i].zzx(this.zzK);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zza(long j, zzkq zzkqVar) {
        long j2;
        zzS();
        if (this.zzy.zzh()) {
            zzaav zzg = this.zzy.zzg(j);
            long j3 = zzg.zza.zzb;
            long j4 = zzg.zzb.zzb;
            long j5 = zzkqVar.zzf;
            if (j5 != 0) {
                j2 = j5;
            } else if (zzkqVar.zzg == 0) {
                return j;
            } else {
                j2 = 0;
            }
            long zzx = zzew.zzx(j, j2, Long.MIN_VALUE);
            long zzq = zzew.zzq(j, zzkqVar.zzg, Long.MAX_VALUE);
            boolean z = true;
            boolean z2 = zzx <= j3 && j3 <= zzq;
            if (zzx > j4 || j4 > zzq) {
                z = false;
            }
            if (z2 && z) {
                if (Math.abs(j3 - j) > Math.abs(j4 - j)) {
                    return j4;
                }
            } else if (!z2) {
                return z ? j4 : zzx;
            }
            return j3;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final long zzb() {
        long j;
        zzS();
        if (this.zzK || this.zzE == 0) {
            return Long.MIN_VALUE;
        }
        if (zzX()) {
            return this.zzH;
        }
        if (this.zzw) {
            int length = this.zzs.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zztu zztuVar = this.zzx;
                if (zztuVar.zzb[i] && zztuVar.zzc[i] && !this.zzs[i].zzw()) {
                    j = Math.min(j, this.zzs[i].zzg());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = zzQ(false);
        }
        return j == Long.MIN_VALUE ? this.zzG : j;
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zzd() {
        if (this.zzD) {
            if (this.zzK || zzP() > this.zzJ) {
                this.zzD = false;
                return this.zzG;
            }
            return C.TIME_UNSET;
        }
        return C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zze(long j) {
        int i;
        zzS();
        boolean[] zArr = this.zzx.zzb;
        if (true != this.zzy.zzh()) {
            j = 0;
        }
        this.zzD = false;
        this.zzG = j;
        if (zzX()) {
            this.zzH = j;
            return j;
        }
        if (this.zzB != 7) {
            int length = this.zzs.length;
            for (i = 0; i < length; i = i + 1) {
                i = (this.zzs[i].zzy(j, false) || (!zArr[i] && this.zzw)) ? i + 1 : 0;
            }
            return j;
        }
        this.zzI = false;
        this.zzH = j;
        this.zzK = false;
        zzxg zzxgVar = this.zzk;
        if (zzxgVar.zzl()) {
            for (zzui zzuiVar : this.zzs) {
                zzuiVar.zzj();
            }
            this.zzk.zzg();
        } else {
            zzxgVar.zzh();
            for (zzui zzuiVar2 : this.zzs) {
                zzuiVar2.zzp(false);
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zzf(zzwe[] zzweVarArr, boolean[] zArr, zzuj[] zzujVarArr, boolean[] zArr2, long j) {
        boolean z;
        zzwe zzweVar;
        int i;
        zzS();
        zztu zztuVar = this.zzx;
        zzur zzurVar = zztuVar.zza;
        boolean[] zArr3 = zztuVar.zzc;
        int i2 = this.zzE;
        int i3 = 0;
        for (int i4 = 0; i4 < zzweVarArr.length; i4++) {
            zzuj zzujVar = zzujVarArr[i4];
            if (zzujVar != null && (zzweVarArr[i4] == null || !zArr[i4])) {
                i = ((zzts) zzujVar).zzb;
                zzdl.zzf(zArr3[i]);
                this.zzE--;
                zArr3[i] = false;
                zzujVarArr[i4] = null;
            }
        }
        if (this.zzC) {
            if (i2 != 0) {
                z = false;
            }
            z = true;
        } else {
            if (j == 0) {
                z = false;
                j = 0;
            }
            z = true;
        }
        for (int i5 = 0; i5 < zzweVarArr.length; i5++) {
            if (zzujVarArr[i5] == null && (zzweVar = zzweVarArr[i5]) != null) {
                zzdl.zzf(zzweVar.zzc() == 1);
                zzdl.zzf(zzweVar.zza(0) == 0);
                int zza = zzurVar.zza(zzweVar.zze());
                zzdl.zzf(!zArr3[zza]);
                this.zzE++;
                zArr3[zza] = true;
                zzujVarArr[i5] = new zzts(this, zza);
                zArr2[i5] = true;
                if (!z) {
                    zzui zzuiVar = this.zzs[zza];
                    z = (zzuiVar.zzy(j, true) || zzuiVar.zza() == 0) ? false : true;
                }
            }
        }
        if (this.zzE == 0) {
            this.zzI = false;
            this.zzD = false;
            if (this.zzk.zzl()) {
                zzui[] zzuiVarArr = this.zzs;
                int length = zzuiVarArr.length;
                while (i3 < length) {
                    zzuiVarArr[i3].zzj();
                    i3++;
                }
                this.zzk.zzg();
            } else {
                for (zzui zzuiVar2 : this.zzs) {
                    zzuiVar2.zzp(false);
                }
            }
        } else if (z) {
            j = zze(j);
            while (i3 < zzujVarArr.length) {
                if (zzujVarArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.zzC = true;
        return j;
    }

    public final int zzg(int i, zzjo zzjoVar, zzgr zzgrVar, int i2) {
        if (zzY()) {
            return -3;
        }
        zzU(i);
        int zzd = this.zzs[i].zzd(zzjoVar, zzgrVar, i2, this.zzK);
        if (zzd == -3) {
            zzV(i);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final zzur zzh() {
        zzS();
        return this.zzx.zza;
    }

    public final int zzi(int i, long j) {
        if (zzY()) {
            return 0;
        }
        zzU(i);
        zzui zzuiVar = this.zzs[i];
        int zzb2 = zzuiVar.zzb(j, this.zzK);
        zzuiVar.zzv(zzb2);
        if (zzb2 == 0) {
            zzV(i);
            return 0;
        }
        return zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzj(long j, boolean z) {
        zzS();
        if (zzX()) {
            return;
        }
        boolean[] zArr = this.zzx.zzc;
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            this.zzs[i].zzi(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzk() throws IOException {
        zzG();
        if (this.zzK && !this.zzv) {
            throw zzbu.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzl(zzsp zzspVar, long j) {
        this.zzq = zzspVar;
        this.zzm.zze();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final void zzm(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final boolean zzo(long j) {
        if (this.zzK || this.zzk.zzk() || this.zzI) {
            return false;
        }
        if (this.zzv && this.zzE == 0) {
            return false;
        }
        boolean zze = this.zzm.zze();
        if (this.zzk.zzl()) {
            return zze;
        }
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final boolean zzp() {
        return this.zzk.zzl() && this.zzm.zzd();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    @Override // com.google.android.gms.internal.ads.zzwy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzxa zzt(com.google.android.gms.internal.ads.zzxc r28, long r29, long r31, java.io.IOException r33, int r34) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztv.zzt(com.google.android.gms.internal.ads.zzxc, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.zzxa");
    }

    public final zzabb zzu() {
        return zzR(new zztt(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzzx
    public final zzabb zzv(int i, int i2) {
        return zzR(new zztt(i, false));
    }
}
