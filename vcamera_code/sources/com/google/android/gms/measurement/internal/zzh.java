package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oO0Oo;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzh {
    private long zzA;
    @o0OO00OO
    private String zzB;
    private boolean zzC;
    private long zzD;
    private long zzE;
    private final zzfr zza;
    private final String zzb;
    @o0OO00OO
    private String zzc;
    @o0OO00OO
    private String zzd;
    @o0OO00OO
    private String zze;
    @o0OO00OO
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    @o0OO00OO
    private String zzj;
    private long zzk;
    @o0OO00OO
    private String zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    @o0OO00OO
    private String zzq;
    @o0OO00OO
    private Boolean zzr;
    private long zzs;
    @o0OO00OO
    private List zzt;
    @o0OO00OO
    private String zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    @oO0Oo
    public zzh(zzfr zzfrVar, String str) {
        Preconditions.checkNotNull(zzfrVar);
        Preconditions.checkNotEmpty(str);
        this.zza = zzfrVar;
        this.zzb = str;
        zzfrVar.zzaz().zzg();
    }

    @o0OO00OO
    @oO0Oo
    public final String zzA() {
        this.zza.zzaz().zzg();
        return this.zze;
    }

    @o0OO00OO
    @oO0Oo
    public final String zzB() {
        this.zza.zzaz().zzg();
        return this.zzu;
    }

    @o0OO00OO
    @oO0Oo
    public final List zzC() {
        this.zza.zzaz().zzg();
        return this.zzt;
    }

    @oO0Oo
    public final void zzD() {
        this.zza.zzaz().zzg();
        this.zzC = false;
    }

    @oO0Oo
    public final void zzE() {
        this.zza.zzaz().zzg();
        long j = this.zzg + 1;
        if (j > 2147483647L) {
            this.zza.zzay().zzk().zzb("Bundle index overflow. appId", zzeh.zzn(this.zzb));
            j = 0;
        }
        this.zzC = true;
        this.zzg = j;
    }

    @oO0Oo
    public final void zzF(@o0OO00OO String str) {
        this.zza.zzaz().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzC |= true ^ zzg.zza(this.zzq, str);
        this.zzq = str;
    }

    @oO0Oo
    public final void zzG(boolean z) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzp != z;
        this.zzp = z;
    }

    @oO0Oo
    public final void zzH(@o0OO00OO String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzg.zza(this.zzc, str);
        this.zzc = str;
    }

    @oO0Oo
    public final void zzI(@o0OO00OO String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzg.zza(this.zzl, str);
        this.zzl = str;
    }

    @oO0Oo
    public final void zzJ(@o0OO00OO String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzg.zza(this.zzj, str);
        this.zzj = str;
    }

    @oO0Oo
    public final void zzK(long j) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzk != j;
        this.zzk = j;
    }

    @oO0Oo
    public final void zzL(long j) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzD != j;
        this.zzD = j;
    }

    @oO0Oo
    public final void zzM(long j) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzy != j;
        this.zzy = j;
    }

    @oO0Oo
    public final void zzN(long j) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzz != j;
        this.zzz = j;
    }

    @oO0Oo
    public final void zzO(long j) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzx != j;
        this.zzx = j;
    }

    @oO0Oo
    public final void zzP(long j) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzw != j;
        this.zzw = j;
    }

    @oO0Oo
    public final void zzQ(long j) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzA != j;
        this.zzA = j;
    }

    @oO0Oo
    public final void zzR(long j) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzv != j;
        this.zzv = j;
    }

    @oO0Oo
    public final void zzS(long j) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzn != j;
        this.zzn = j;
    }

    @oO0Oo
    public final void zzT(long j) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzs != j;
        this.zzs = j;
    }

    @oO0Oo
    public final void zzU(long j) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzE != j;
        this.zzE = j;
    }

    @oO0Oo
    public final void zzV(@o0OO00OO String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzg.zza(this.zzf, str);
        this.zzf = str;
    }

    @oO0Oo
    public final void zzW(@o0OO00OO String str) {
        this.zza.zzaz().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzC |= true ^ zzg.zza(this.zzd, str);
        this.zzd = str;
    }

    @oO0Oo
    public final void zzX(long j) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzm != j;
        this.zzm = j;
    }

    @oO0Oo
    public final void zzY(@o0OO00OO String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzg.zza(this.zzB, str);
        this.zzB = str;
    }

    @oO0Oo
    public final void zzZ(long j) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzi != j;
        this.zzi = j;
    }

    @oO0Oo
    public final long zza() {
        this.zza.zzaz().zzg();
        return 0L;
    }

    @oO0Oo
    public final void zzaa(long j) {
        Preconditions.checkArgument(j >= 0);
        this.zza.zzaz().zzg();
        this.zzC |= this.zzg != j;
        this.zzg = j;
    }

    @oO0Oo
    public final void zzab(long j) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzh != j;
        this.zzh = j;
    }

    @oO0Oo
    public final void zzac(boolean z) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzo != z;
        this.zzo = z;
    }

    @oO0Oo
    public final void zzad(@o0OO00OO Boolean bool) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzg.zza(this.zzr, bool);
        this.zzr = bool;
    }

    @oO0Oo
    public final void zzae(@o0OO00OO String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzg.zza(this.zze, str);
        this.zze = str;
    }

    @oO0Oo
    public final void zzaf(@o0OO00OO List list) {
        this.zza.zzaz().zzg();
        if (zzg.zza(this.zzt, list)) {
            return;
        }
        this.zzC = true;
        this.zzt = list != null ? new ArrayList(list) : null;
    }

    @oO0Oo
    public final void zzag(@o0OO00OO String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzg.zza(this.zzu, str);
        this.zzu = str;
    }

    @oO0Oo
    public final boolean zzah() {
        this.zza.zzaz().zzg();
        return this.zzp;
    }

    @oO0Oo
    public final boolean zzai() {
        this.zza.zzaz().zzg();
        return this.zzo;
    }

    @oO0Oo
    public final boolean zzaj() {
        this.zza.zzaz().zzg();
        return this.zzC;
    }

    @oO0Oo
    public final long zzb() {
        this.zza.zzaz().zzg();
        return this.zzk;
    }

    @oO0Oo
    public final long zzc() {
        this.zza.zzaz().zzg();
        return this.zzD;
    }

    @oO0Oo
    public final long zzd() {
        this.zza.zzaz().zzg();
        return this.zzy;
    }

    @oO0Oo
    public final long zze() {
        this.zza.zzaz().zzg();
        return this.zzz;
    }

    @oO0Oo
    public final long zzf() {
        this.zza.zzaz().zzg();
        return this.zzx;
    }

    @oO0Oo
    public final long zzg() {
        this.zza.zzaz().zzg();
        return this.zzw;
    }

    @oO0Oo
    public final long zzh() {
        this.zza.zzaz().zzg();
        return this.zzA;
    }

    @oO0Oo
    public final long zzi() {
        this.zza.zzaz().zzg();
        return this.zzv;
    }

    @oO0Oo
    public final long zzj() {
        this.zza.zzaz().zzg();
        return this.zzn;
    }

    @oO0Oo
    public final long zzk() {
        this.zza.zzaz().zzg();
        return this.zzs;
    }

    @oO0Oo
    public final long zzl() {
        this.zza.zzaz().zzg();
        return this.zzE;
    }

    @oO0Oo
    public final long zzm() {
        this.zza.zzaz().zzg();
        return this.zzm;
    }

    @oO0Oo
    public final long zzn() {
        this.zza.zzaz().zzg();
        return this.zzi;
    }

    @oO0Oo
    public final long zzo() {
        this.zza.zzaz().zzg();
        return this.zzg;
    }

    @oO0Oo
    public final long zzp() {
        this.zza.zzaz().zzg();
        return this.zzh;
    }

    @o0OO00OO
    @oO0Oo
    public final Boolean zzq() {
        this.zza.zzaz().zzg();
        return this.zzr;
    }

    @o0OO00OO
    @oO0Oo
    public final String zzr() {
        this.zza.zzaz().zzg();
        return this.zzq;
    }

    @o0OO00OO
    @oO0Oo
    public final String zzs() {
        this.zza.zzaz().zzg();
        String str = this.zzB;
        zzY(null);
        return str;
    }

    @oO0Oo
    public final String zzt() {
        this.zza.zzaz().zzg();
        return this.zzb;
    }

    @o0OO00OO
    @oO0Oo
    public final String zzu() {
        this.zza.zzaz().zzg();
        return this.zzc;
    }

    @o0OO00OO
    @oO0Oo
    public final String zzv() {
        this.zza.zzaz().zzg();
        return this.zzl;
    }

    @o0OO00OO
    @oO0Oo
    public final String zzw() {
        this.zza.zzaz().zzg();
        return this.zzj;
    }

    @o0OO00OO
    @oO0Oo
    public final String zzx() {
        this.zza.zzaz().zzg();
        return this.zzf;
    }

    @o0OO00OO
    @oO0Oo
    public final String zzy() {
        this.zza.zzaz().zzg();
        return this.zzd;
    }

    @o0OO00OO
    @oO0Oo
    public final String zzz() {
        this.zza.zzaz().zzg();
        return this.zzB;
    }
}
