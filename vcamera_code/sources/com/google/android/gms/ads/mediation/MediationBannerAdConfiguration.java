package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;
import javax.annotation.ParametersAreNonnullByDefault;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class MediationBannerAdConfiguration extends MediationAdConfiguration {
    private final AdSize zza;

    public MediationBannerAdConfiguration(@oo0oO0 Context context, @oo0oO0 String str, @oo0oO0 Bundle bundle, @oo0oO0 Bundle bundle2, boolean z, @o0OO00OO Location location, int i, int i2, @oo0oO0 String str2, @oo0oO0 AdSize adSize, @oo0oO0 String str3) {
        super(context, str, bundle, bundle2, z, location, i, i2, str2, str3);
        this.zza = adSize;
    }

    @oo0oO0
    public AdSize getAdSize() {
        return this.zza;
    }
}
