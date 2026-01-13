package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbrt;
import com.google.android.gms.internal.ads.zzbyp;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class QueryInfo {
    private final zzem zza;

    public QueryInfo(zzem zzemVar) {
        this.zza = zzemVar;
    }

    public static void generate(@oo0oO0 final Context context, @oo0oO0 final AdFormat adFormat, @o0OO00OO final AdRequest adRequest, @oo0oO0 final QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzbar.zzc(context);
        if (((Boolean) zzbci.zzk.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbar.zzjw)).booleanValue()) {
                zzbyp.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.query.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        AdFormat adFormat2 = adFormat;
                        AdRequest adRequest2 = adRequest;
                        new zzbrt(context2, adFormat2, adRequest2 == null ? null : adRequest2.zza()).zzb(queryInfoGenerationCallback);
                    }
                });
                return;
            }
        }
        new zzbrt(context, adFormat, adRequest == null ? null : adRequest.zza()).zzb(queryInfoGenerationCallback);
    }

    @oo0oO0
    public String getQuery() {
        return this.zza.zzb();
    }

    @oo0oO0
    @KeepForSdk
    public Bundle getQueryBundle() {
        return this.zza.zza();
    }

    @oo0oO0
    @KeepForSdk
    public String getRequestId() {
        return this.zza.zzc();
    }
}
