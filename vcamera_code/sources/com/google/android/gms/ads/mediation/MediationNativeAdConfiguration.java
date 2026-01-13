package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbdl;
import javax.annotation.ParametersAreNonnullByDefault;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {
    @o0OO00OO
    private final zzbdl zza;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z, @o0OO00OO Location location, int i, int i2, @o0OO00OO String str2, String str3, @o0OO00OO zzbdl zzbdlVar) {
        super(context, str, bundle, bundle2, z, location, i, i2, str2, str3);
        this.zza = zzbdlVar;
    }

    @oo0oO0
    public NativeAdOptions getNativeAdOptions() {
        return zzbdl.zza(this.zza);
    }
}
