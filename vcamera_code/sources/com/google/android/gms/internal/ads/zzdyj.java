package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.MobileAds;
import java.util.regex.Pattern;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooOoo.oOo000Oo;
/* loaded from: classes2.dex */
public final class zzdyj implements zzczg, com.google.android.gms.ads.internal.client.zza, zzcvi, zzcus {
    private final Context zza;
    private final zzezm zzb;
    private final zzeyo zzc;
    private final zzeyc zzd;
    private final zzeaf zze;
    @o0OO00OO
    private Boolean zzf;
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgt)).booleanValue();
    @oo0oO0
    private final zzfdk zzh;
    private final String zzi;

    public zzdyj(Context context, zzezm zzezmVar, zzeyo zzeyoVar, zzeyc zzeycVar, zzeaf zzeafVar, @oo0oO0 zzfdk zzfdkVar, String str) {
        this.zza = context;
        this.zzb = zzezmVar;
        this.zzc = zzeyoVar;
        this.zzd = zzeycVar;
        this.zze = zzeafVar;
        this.zzh = zzfdkVar;
        this.zzi = str;
    }

    private final zzfdj zzf(String str) {
        zzfdj zzb = zzfdj.zzb(str);
        zzb.zzh(this.zzc, null);
        zzb.zzf(this.zzd);
        zzb.zza("request_id", this.zzi);
        if (!this.zzd.zzu.isEmpty()) {
            zzb.zza("ancn", (String) this.zzd.zzu.get(0));
        }
        if (this.zzd.zzaj) {
            zzb.zza("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza) ? "offline" : o00oo0O.o00oOOoO.f7289o00oOoO0);
            zzb.zza("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            zzb.zza("offline_ad", "1");
        }
        return zzb;
    }

    private final void zzg(zzfdj zzfdjVar) {
        if (!this.zzd.zzaj) {
            this.zzh.zzb(zzfdjVar);
            return;
        }
        this.zze.zzd(new zzeah(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), this.zzc.zzb.zzb.zzb, this.zzh.zza(zzfdjVar), 2));
    }

    private final boolean zzh() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbm);
                    com.google.android.gms.ads.internal.zzt.zzp();
                    String zzn = com.google.android.gms.ads.internal.util.zzs.zzn(this.zza);
                    boolean z = false;
                    if (str != null && zzn != null) {
                        try {
                            z = Pattern.matches(str, zzn);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzf = Boolean.valueOf(z);
                }
            }
        }
        return this.zzf.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zzd.zzaj) {
            zzg(zzf("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcus
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzg) {
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            String zza = this.zzb.zza(str);
            zzfdj zzf = zzf("ifts");
            zzf.zza("reason", "adapter");
            if (i >= 0) {
                zzf.zza("arec", String.valueOf(i));
            }
            if (zza != null) {
                zzf.zza("areec", zza);
            }
            this.zzh.zzb(zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcus
    public final void zzb() {
        if (this.zzg) {
            zzfdk zzfdkVar = this.zzh;
            zzfdj zzf = zzf("ifts");
            zzf.zza("reason", "blocked");
            zzfdkVar.zzb(zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcus
    public final void zzc(zzded zzdedVar) {
        if (this.zzg) {
            zzfdj zzf = zzf("ifts");
            zzf.zza("reason", "exception");
            if (!TextUtils.isEmpty(zzdedVar.getMessage())) {
                zzf.zza(oOo000Oo.f9215o0O00o00, zzdedVar.getMessage());
            }
            this.zzh.zzb(zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczg
    public final void zzd() {
        if (zzh()) {
            this.zzh.zzb(zzf("adapter_shown"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczg
    public final void zze() {
        if (zzh()) {
            this.zzh.zzb(zzf("adapter_impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzl() {
        if (zzh() || this.zzd.zzaj) {
            zzg(zzf("impression"));
        }
    }
}
