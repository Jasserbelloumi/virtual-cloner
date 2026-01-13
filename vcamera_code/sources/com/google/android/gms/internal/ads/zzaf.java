package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import o00oOooO.o0OO00OO;
import o0ooOoOO.oO0OoOO0;
/* loaded from: classes2.dex */
public final class zzaf {
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    private int zzal;
    @o0OO00OO
    public final String zzb;
    @o0OO00OO
    public final String zzc;
    @o0OO00OO
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    @o0OO00OO
    public final String zzj;
    @o0OO00OO
    public final zzbq zzk;
    @o0OO00OO
    public final String zzl;
    @o0OO00OO
    public final String zzm;
    public final int zzn;
    public final List zzo;
    @o0OO00OO
    public final zzx zzp;
    public final long zzq;
    public final int zzr;
    public final int zzs;
    public final float zzt;
    public final int zzu;
    public final float zzv;
    @o0OO00OO
    public final byte[] zzw;
    public final int zzx;
    @o0OO00OO
    public final zzq zzy;
    public final int zzz;
    private static final zzaf zzG = new zzaf(new zzad());
    private static final String zzH = zzew.zzP(0);
    private static final String zzI = zzew.zzP(1);
    private static final String zzJ = zzew.zzP(2);
    private static final String zzK = zzew.zzP(3);
    private static final String zzL = zzew.zzP(4);
    private static final String zzM = zzew.zzP(5);
    private static final String zzN = zzew.zzP(6);
    private static final String zzO = zzew.zzP(7);
    private static final String zzP = zzew.zzP(8);
    private static final String zzQ = zzew.zzP(9);
    private static final String zzR = zzew.zzP(10);
    private static final String zzS = zzew.zzP(11);
    private static final String zzT = zzew.zzP(12);
    private static final String zzU = zzew.zzP(13);
    private static final String zzV = zzew.zzP(14);
    private static final String zzW = zzew.zzP(15);
    private static final String zzX = zzew.zzP(16);
    private static final String zzY = zzew.zzP(17);
    private static final String zzZ = zzew.zzP(18);
    private static final String zzaa = zzew.zzP(19);
    private static final String zzab = zzew.zzP(20);
    private static final String zzac = zzew.zzP(21);
    private static final String zzad = zzew.zzP(22);
    private static final String zzae = zzew.zzP(23);
    private static final String zzaf = zzew.zzP(24);
    private static final String zzag = zzew.zzP(25);
    private static final String zzah = zzew.zzP(26);
    private static final String zzai = zzew.zzP(27);
    private static final String zzaj = zzew.zzP(28);
    private static final String zzak = zzew.zzP(29);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzab
    };

    private zzaf(zzad zzadVar) {
        this.zzb = zzad.zzac(zzadVar);
        this.zzc = zzad.zzad(zzadVar);
        this.zzd = zzew.zzQ(zzad.zzae(zzadVar));
        this.zze = zzad.zzo(zzadVar);
        this.zzf = 0;
        int zzd = zzad.zzd(zzadVar);
        this.zzg = zzd;
        int zzl = zzad.zzl(zzadVar);
        this.zzh = zzl;
        this.zzi = zzl != -1 ? zzl : zzd;
        this.zzj = zzad.zzaa(zzadVar);
        this.zzk = zzad.zzZ(zzadVar);
        this.zzl = zzad.zzab(zzadVar);
        this.zzm = zzad.zzaf(zzadVar);
        this.zzn = zzad.zzj(zzadVar);
        this.zzo = zzad.zzag(zzadVar) == null ? Collections.emptyList() : zzad.zzag(zzadVar);
        zzx zzt = zzad.zzt(zzadVar);
        this.zzp = zzt;
        this.zzq = zzad.zzr(zzadVar);
        this.zzr = zzad.zzq(zzadVar);
        this.zzs = zzad.zzi(zzadVar);
        this.zzt = zzad.zza(zzadVar);
        this.zzu = zzad.zzm(zzadVar) == -1 ? 0 : zzad.zzm(zzadVar);
        this.zzv = zzad.zzb(zzadVar) == -1.0f ? 1.0f : zzad.zzb(zzadVar);
        this.zzw = zzad.zzah(zzadVar);
        this.zzx = zzad.zzp(zzadVar);
        this.zzy = zzad.zzs(zzadVar);
        this.zzz = zzad.zze(zzadVar);
        this.zzA = zzad.zzn(zzadVar);
        this.zzB = zzad.zzk(zzadVar);
        this.zzC = zzad.zzg(zzadVar) == -1 ? 0 : zzad.zzg(zzadVar);
        this.zzD = zzad.zzh(zzadVar) != -1 ? zzad.zzh(zzadVar) : 0;
        this.zzE = zzad.zzc(zzadVar);
        this.zzF = (zzad.zzf(zzadVar) != 0 || zzt == null) ? zzad.zzf(zzadVar) : 1;
    }

    public static String zzd(@o0OO00OO zzaf zzafVar) {
        if (zzafVar == null) {
            return "null";
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("id=");
        o00oOOo02.append(zzafVar.zzb);
        o00oOOo02.append(", mimeType=");
        o00oOOo02.append(zzafVar.zzm);
        if (zzafVar.zzi != -1) {
            o00oOOo02.append(", bitrate=");
            o00oOOo02.append(zzafVar.zzi);
        }
        if (zzafVar.zzj != null) {
            o00oOOo02.append(", codecs=");
            o00oOOo02.append(zzafVar.zzj);
        }
        if (zzafVar.zzp != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (true) {
                zzx zzxVar = zzafVar.zzp;
                if (i >= zzxVar.zzb) {
                    break;
                }
                UUID uuid = zzxVar.zza(i).zza;
                linkedHashSet.add(uuid.equals(zzo.zzb) ? C.CENC_TYPE_cenc : uuid.equals(zzo.zzc) ? "clearkey" : uuid.equals(zzo.zze) ? "playready" : uuid.equals(zzo.zzd) ? "widevine" : uuid.equals(zzo.zza) ? "universal" : android.support.v4.media.o00oOoO.o00oOOo0("unknown (", uuid.toString(), ")"));
                i++;
            }
            o00oOOo02.append(", drm=[");
            zzfnk.zzb(o00oOOo02, linkedHashSet, ",");
            o00oOOo02.append(']');
        }
        if (zzafVar.zzr != -1 && zzafVar.zzs != -1) {
            o00oOOo02.append(", res=");
            o00oOOo02.append(zzafVar.zzr);
            o00oOOo02.append("x");
            o00oOOo02.append(zzafVar.zzs);
        }
        if (zzafVar.zzt != -1.0f) {
            o00oOOo02.append(", fps=");
            o00oOOo02.append(zzafVar.zzt);
        }
        if (zzafVar.zzz != -1) {
            o00oOOo02.append(", channels=");
            o00oOOo02.append(zzafVar.zzz);
        }
        if (zzafVar.zzA != -1) {
            o00oOOo02.append(", sample_rate=");
            o00oOOo02.append(zzafVar.zzA);
        }
        if (zzafVar.zzd != null) {
            o00oOOo02.append(", language=");
            o00oOOo02.append(zzafVar.zzd);
        }
        if (zzafVar.zzc != null) {
            o00oOOo02.append(", label=");
            o00oOOo02.append(zzafVar.zzc);
        }
        if (zzafVar.zze != 0) {
            ArrayList arrayList = new ArrayList();
            if ((zzafVar.zze & 1) != 0) {
                arrayList.add("default");
            }
            if ((zzafVar.zze & 2) != 0) {
                arrayList.add("forced");
            }
            o00oOOo02.append(", selectionFlags=[");
            zzfnk.zzb(o00oOOo02, arrayList, ",");
            o00oOOo02.append("]");
        }
        return o00oOOo02.toString();
    }

    public final boolean equals(@o0OO00OO Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaf.class == obj.getClass()) {
            zzaf zzafVar = (zzaf) obj;
            int i2 = this.zzal;
            if ((i2 == 0 || (i = zzafVar.zzal) == 0 || i2 == i) && this.zze == zzafVar.zze && this.zzg == zzafVar.zzg && this.zzh == zzafVar.zzh && this.zzn == zzafVar.zzn && this.zzq == zzafVar.zzq && this.zzr == zzafVar.zzr && this.zzs == zzafVar.zzs && this.zzu == zzafVar.zzu && this.zzx == zzafVar.zzx && this.zzz == zzafVar.zzz && this.zzA == zzafVar.zzA && this.zzB == zzafVar.zzB && this.zzC == zzafVar.zzC && this.zzD == zzafVar.zzD && this.zzE == zzafVar.zzE && this.zzF == zzafVar.zzF && Float.compare(this.zzt, zzafVar.zzt) == 0 && Float.compare(this.zzv, zzafVar.zzv) == 0 && zzew.zzU(this.zzb, zzafVar.zzb) && zzew.zzU(this.zzc, zzafVar.zzc) && zzew.zzU(this.zzj, zzafVar.zzj) && zzew.zzU(this.zzl, zzafVar.zzl) && zzew.zzU(this.zzm, zzafVar.zzm) && zzew.zzU(this.zzd, zzafVar.zzd) && Arrays.equals(this.zzw, zzafVar.zzw) && zzew.zzU(this.zzk, zzafVar.zzk) && zzew.zzU(this.zzy, zzafVar.zzy) && zzew.zzU(this.zzp, zzafVar.zzp) && zze(zzafVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzal;
        if (i == 0) {
            String str = this.zzb;
            int hashCode = str == null ? 0 : str.hashCode();
            String str2 = this.zzc;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            int i2 = hashCode + 527;
            String str3 = this.zzd;
            int hashCode3 = (((((((((i2 * 31) + hashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.zze) * 961) + this.zzg) * 31) + this.zzh;
            String str4 = this.zzj;
            int hashCode4 = ((hashCode3 * 31) + (str4 == null ? 0 : str4.hashCode())) * 31;
            zzbq zzbqVar = this.zzk;
            int hashCode5 = (hashCode4 + (zzbqVar == null ? 0 : zzbqVar.hashCode())) * 31;
            String str5 = this.zzl;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.zzm;
            int hashCode7 = str6 != null ? str6.hashCode() : 0;
            int floatToIntBits = ((((((((((((((((Float.floatToIntBits(this.zzv) + ((((Float.floatToIntBits(this.zzt) + ((((((((((hashCode6 + hashCode7) * 31) + this.zzn) * 31) + ((int) this.zzq)) * 31) + this.zzr) * 31) + this.zzs) * 31)) * 31) + this.zzu) * 31)) * 31) + this.zzx) * 31) + this.zzz) * 31) + this.zzA) * 31) + this.zzB) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE) * 31) + this.zzF;
            this.zzal = floatToIntBits;
            return floatToIntBits;
        }
        return i;
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zzc;
        String str3 = this.zzl;
        String str4 = this.zzm;
        String str5 = this.zzj;
        int i = this.zzi;
        String str6 = this.zzd;
        int i2 = this.zzr;
        int i3 = this.zzs;
        float f = this.zzt;
        int i4 = this.zzz;
        int i5 = this.zzA;
        StringBuilder o00oOOo02 = oO0OoOO0.o00oOOo0("Format(", str, ", ", str2, ", ");
        o00oOOo02.append(str3);
        o00oOOo02.append(", ");
        o00oOOo02.append(str4);
        o00oOOo02.append(", ");
        o00oOOo02.append(str5);
        o00oOOo02.append(", ");
        o00oOOo02.append(i);
        o00oOOo02.append(", ");
        o00oOOo02.append(str6);
        o00oOOo02.append(", [");
        o00oOOo02.append(i2);
        o00oOOo02.append(", ");
        o00oOOo02.append(i3);
        o00oOOo02.append(", ");
        o00oOOo02.append(f);
        o00oOOo02.append("], [");
        o00oOOo02.append(i4);
        o00oOOo02.append(", ");
        o00oOOo02.append(i5);
        o00oOOo02.append("])");
        return o00oOOo02.toString();
    }

    public final int zza() {
        int i;
        int i2 = this.zzr;
        if (i2 == -1 || (i = this.zzs) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final zzad zzb() {
        return new zzad(this, null);
    }

    public final zzaf zzc(int i) {
        zzad zzadVar = new zzad(this, null);
        zzadVar.zzA(i);
        return new zzaf(zzadVar);
    }

    public final boolean zze(zzaf zzafVar) {
        if (this.zzo.size() == zzafVar.zzo.size()) {
            for (int i = 0; i < this.zzo.size(); i++) {
                if (!Arrays.equals((byte[]) this.zzo.get(i), (byte[]) zzafVar.zzo.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
