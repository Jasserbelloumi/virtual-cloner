package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class MediationConfiguration {
    @oo0oO0
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";
    private final AdFormat zza;
    private final Bundle zzb;

    public MediationConfiguration(@oo0oO0 AdFormat adFormat, @oo0oO0 Bundle bundle) {
        this.zza = adFormat;
        this.zzb = bundle;
    }

    @oo0oO0
    public AdFormat getFormat() {
        return this.zza;
    }

    @oo0oO0
    public Bundle getServerParameters() {
        return this.zzb;
    }
}
