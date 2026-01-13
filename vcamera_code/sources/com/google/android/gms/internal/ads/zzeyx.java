package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzeyx {
    @o0OO00OO
    public final com.google.android.gms.ads.internal.client.zzfl zza;
    @o0OO00OO
    public final zzbjx zzb;
    @o0OO00OO
    public final zzeib zzc;
    public final com.google.android.gms.ads.internal.client.zzl zzd;
    public final com.google.android.gms.ads.internal.client.zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbdl zzi;
    public final com.google.android.gms.ads.internal.client.zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final com.google.android.gms.ads.internal.client.zzcb zzn;
    public final zzeyk zzo;
    public final boolean zzp;
    public final boolean zzq;
    @o0OO00OO
    public final com.google.android.gms.ads.internal.client.zzcf zzr;

    public /* synthetic */ zzeyx(zzeyv zzeyvVar, zzeyw zzeywVar) {
        this.zze = zzeyv.zzf(zzeyvVar);
        this.zzf = zzeyv.zzH(zzeyvVar);
        this.zzr = zzeyv.zzP(zzeyvVar);
        int i = zzeyv.zzd(zzeyvVar).zza;
        long j = zzeyv.zzd(zzeyvVar).zzb;
        Bundle bundle = zzeyv.zzd(zzeyvVar).zzc;
        int i2 = zzeyv.zzd(zzeyvVar).zzd;
        List list = zzeyv.zzd(zzeyvVar).zze;
        boolean z = zzeyv.zzd(zzeyvVar).zzf;
        int i3 = zzeyv.zzd(zzeyvVar).zzg;
        boolean z2 = true;
        if (!zzeyv.zzd(zzeyvVar).zzh && !zzeyv.zzN(zzeyvVar)) {
            z2 = false;
        }
        this.zzd = new com.google.android.gms.ads.internal.client.zzl(i, j, bundle, i2, list, z, i3, z2, zzeyv.zzd(zzeyvVar).zzi, zzeyv.zzd(zzeyvVar).zzj, zzeyv.zzd(zzeyvVar).zzk, zzeyv.zzd(zzeyvVar).zzl, zzeyv.zzd(zzeyvVar).zzm, zzeyv.zzd(zzeyvVar).zzn, zzeyv.zzd(zzeyvVar).zzo, zzeyv.zzd(zzeyvVar).zzp, zzeyv.zzd(zzeyvVar).zzq, zzeyv.zzd(zzeyvVar).zzr, zzeyv.zzd(zzeyvVar).zzs, zzeyv.zzd(zzeyvVar).zzt, zzeyv.zzd(zzeyvVar).zzu, zzeyv.zzd(zzeyvVar).zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzeyv.zzd(zzeyvVar).zzw), zzeyv.zzd(zzeyvVar).zzx);
        this.zza = zzeyv.zzj(zzeyvVar) != null ? zzeyv.zzj(zzeyvVar) : zzeyv.zzk(zzeyvVar) != null ? zzeyv.zzk(zzeyvVar).zzf : null;
        this.zzg = zzeyv.zzJ(zzeyvVar);
        this.zzh = zzeyv.zzK(zzeyvVar);
        this.zzi = zzeyv.zzJ(zzeyvVar) == null ? null : zzeyv.zzk(zzeyvVar) == null ? new zzbdl(new NativeAdOptions.Builder().build()) : zzeyv.zzk(zzeyvVar);
        this.zzj = zzeyv.zzh(zzeyvVar);
        this.zzk = zzeyv.zza(zzeyvVar);
        this.zzl = zzeyv.zzb(zzeyvVar);
        this.zzm = zzeyv.zzc(zzeyvVar);
        this.zzn = zzeyv.zzi(zzeyvVar);
        this.zzb = zzeyv.zzl(zzeyvVar);
        this.zzo = new zzeyk(zzeyv.zzn(zzeyvVar), null);
        this.zzp = zzeyv.zzL(zzeyvVar);
        this.zzc = zzeyv.zzm(zzeyvVar);
        this.zzq = zzeyv.zzM(zzeyvVar);
    }

    @o0OO00OO
    public final zzbfo zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzb() : this.zzl.zza();
    }

    public final boolean zzb() {
        return this.zzf.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcI));
    }
}
