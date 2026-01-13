package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzblv;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbmc;
import com.google.android.gms.internal.ads.zzbmf;
import com.google.android.gms.internal.ads.zzbyd;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzfeb;
import com.google.android.gms.internal.ads.zzfec;
import com.google.android.gms.internal.ads.zzfep;
import com.google.android.gms.internal.ads.zzftq;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfut;
import com.google.android.gms.internal.ads.zzfuu;
import javax.annotation.ParametersAreNonnullByDefault;
import o00oOooO.o0OO00OO;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zze {
    private Context zza;
    private long zzb = 0;

    public final void zza(Context context, zzbzg zzbzgVar, String str, @o0OO00OO Runnable runnable, zzfep zzfepVar) {
        zzb(context, zzbzgVar, true, null, str, null, runnable, zzfepVar);
    }

    @VisibleForTesting
    public final void zzb(Context context, zzbzg zzbzgVar, boolean z, @o0OO00OO zzbyd zzbydVar, String str, @o0OO00OO String str2, @o0OO00OO Runnable runnable, final zzfep zzfepVar) {
        PackageInfo packageInfo;
        if (zzt.zzB().elapsedRealtime() - this.zzb < 5000) {
            zzbza.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzB().elapsedRealtime();
        if (zzbydVar != null) {
            if (zzt.zzB().currentTimeMillis() - zzbydVar.zza() <= ((Long) zzba.zzc().zzb(zzbar.zzdF)).longValue() && zzbydVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            zzbza.zzj("Context not provided to fetch application settings");
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            zzbza.zzj("App settings could not be fetched. Required parameters missing");
        } else {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.zza = applicationContext;
            final zzfec zza = zzfeb.zza(context, 4);
            zza.zzh();
            zzbmf zza2 = zzt.zzf().zza(this.zza, zzbzgVar, zzfepVar);
            zzblz zzblzVar = zzbmc.zza;
            zzblv zza3 = zza2.zza("google.afma.config.fetchAppSettings", zzblzVar, zzblzVar);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                jSONObject.put("experiment_ids", TextUtils.join(",", zzbar.zza()));
                try {
                    ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                    if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put("version", packageInfo.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
                }
                zzfut zzb = zza3.zzb(jSONObject);
                zzftq zzftqVar = new zzftq() { // from class: com.google.android.gms.ads.internal.zzd
                    @Override // com.google.android.gms.internal.ads.zzftq
                    public final zzfut zza(Object obj) {
                        zzfep zzfepVar2 = zzfep.this;
                        zzfec zzfecVar = zza;
                        JSONObject jSONObject2 = (JSONObject) obj;
                        boolean optBoolean = jSONObject2.optBoolean("isSuccessful", false);
                        if (optBoolean) {
                            zzt.zzo().zzh().zzu(jSONObject2.getString("appSettingsJson"));
                        }
                        zzfecVar.zzf(optBoolean);
                        zzfepVar2.zzb(zzfecVar.zzl());
                        return zzfuj.zzh(null);
                    }
                };
                zzfuu zzfuuVar = zzbzn.zzf;
                zzfut zzm = zzfuj.zzm(zzb, zzftqVar, zzfuuVar);
                if (runnable != null) {
                    zzb.zzc(runnable, zzfuuVar);
                }
                zzbzq.zza(zzm, "ConfigLoader.maybeFetchNewAppSettings");
            } catch (Exception e) {
                zzbza.zzh("Error requesting application settings", e);
                zza.zzg(e);
                zza.zzf(false);
                zzfepVar.zzb(zza.zzl());
            }
        }
    }

    public final void zzc(Context context, zzbzg zzbzgVar, String str, zzbyd zzbydVar, zzfep zzfepVar) {
        zzb(context, zzbzgVar, false, zzbydVar, zzbydVar != null ? zzbydVar.zzb() : null, str, null, zzfepVar);
    }
}
