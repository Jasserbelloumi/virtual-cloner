package com.google.android.gms.internal.ads;

import androidx.collection.o00ooO0;
import java.util.ArrayList;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzdgt {
    public static final zzdgt zza = new zzdgt(new zzdgr());
    @o0OO00OO
    private final zzbey zzb;
    @o0OO00OO
    private final zzbev zzc;
    @o0OO00OO
    private final zzbfl zzd;
    @o0OO00OO
    private final zzbfi zze;
    @o0OO00OO
    private final zzbkg zzf;
    private final o00ooO0 zzg;
    private final o00ooO0 zzh;

    private zzdgt(zzdgr zzdgrVar) {
        this.zzb = zzdgrVar.zza;
        this.zzc = zzdgrVar.zzb;
        this.zzd = zzdgrVar.zzc;
        this.zzg = new o00ooO0(zzdgrVar.zzf);
        this.zzh = new o00ooO0(zzdgrVar.zzg);
        this.zze = zzdgrVar.zzd;
        this.zzf = zzdgrVar.zze;
    }

    @o0OO00OO
    public final zzbev zza() {
        return this.zzc;
    }

    @o0OO00OO
    public final zzbey zzb() {
        return this.zzb;
    }

    @o0OO00OO
    public final zzbfb zzc(String str) {
        return (zzbfb) this.zzh.get(str);
    }

    @o0OO00OO
    public final zzbfe zzd(String str) {
        return (zzbfe) this.zzg.get(str);
    }

    @o0OO00OO
    public final zzbfi zze() {
        return this.zze;
    }

    @o0OO00OO
    public final zzbfl zzf() {
        return this.zzd;
    }

    @o0OO00OO
    public final zzbkg zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.size());
        for (int i = 0; i < this.zzg.size(); i++) {
            arrayList.add((String) this.zzg.o00oOoOo(i));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
