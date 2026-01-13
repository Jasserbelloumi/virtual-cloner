package com.google.android.gms.ads.mediation.rtb;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class RtbSignalData {
    private final Context zza;
    private final List zzb;
    private final Bundle zzc;
    @o0OO00OO
    private final AdSize zzd;

    public RtbSignalData(@oo0oO0 Context context, @oo0oO0 List<MediationConfiguration> list, @oo0oO0 Bundle bundle, @o0OO00OO AdSize adSize) {
        this.zza = context;
        this.zzb = list;
        this.zzc = bundle;
        this.zzd = adSize;
    }

    @o0OO00OO
    public AdSize getAdSize() {
        return this.zzd;
    }

    @o0OO00OO
    @Deprecated
    public MediationConfiguration getConfiguration() {
        List list = this.zzb;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (MediationConfiguration) this.zzb.get(0);
    }

    @oo0oO0
    public List<MediationConfiguration> getConfigurations() {
        return this.zzb;
    }

    @oo0oO0
    public Context getContext() {
        return this.zza;
    }

    @oo0oO0
    public Bundle getNetworkExtras() {
        return this.zzc;
    }
}
