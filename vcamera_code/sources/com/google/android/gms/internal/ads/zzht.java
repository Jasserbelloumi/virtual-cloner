package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
/* loaded from: classes2.dex */
public final class zzht {
    public final Context zza;
    public zzdm zzb;
    public zzfok zzc;
    public zzfok zzd;
    public zzfok zze;
    public zzfok zzf;
    public zzfok zzg;
    public zzfnj zzh;
    public Looper zzi;
    public zzk zzj;
    public int zzk;
    public boolean zzl;
    public zzkq zzm;
    public long zzn;
    public long zzo;
    public boolean zzp;
    public boolean zzq;
    public zzhe zzr;

    public zzht(final Context context, zzcdr zzcdrVar, byte[] bArr) {
        zzhn zzhnVar = new zzhn(zzcdrVar, null);
        zzho zzhoVar = new zzho(context);
        zzfok zzfokVar = new zzfok() { // from class: com.google.android.gms.internal.ads.zzhp
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object zza() {
                return new zzwc(context);
            }
        };
        zzhq zzhqVar = new zzfok() { // from class: com.google.android.gms.internal.ads.zzhq
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object zza() {
                return new zzhf();
            }
        };
        zzhr zzhrVar = new zzhr(context);
        zzhs zzhsVar = new zzfnj() { // from class: com.google.android.gms.internal.ads.zzhs
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                return new zznf((zzdm) obj);
            }
        };
        context.getClass();
        this.zza = context;
        this.zzc = zzhnVar;
        this.zzd = zzhoVar;
        this.zze = zzfokVar;
        this.zzf = zzhqVar;
        this.zzg = zzhrVar;
        this.zzh = zzhsVar;
        this.zzi = zzew.zzE();
        this.zzj = zzk.zza;
        this.zzk = 1;
        this.zzl = true;
        this.zzm = zzkq.zze;
        this.zzr = new zzhe(0.97f, 1.03f, 1000L, 1.0E-7f, zzew.zzv(20L), zzew.zzv(500L), 0.999f, null);
        this.zzb = zzdm.zza;
        this.zzn = 500L;
        this.zzo = 2000L;
        this.zzp = true;
    }

    public static /* synthetic */ zzsr zza(Context context) {
        return new zzsf(context, new zzzp());
    }
}
